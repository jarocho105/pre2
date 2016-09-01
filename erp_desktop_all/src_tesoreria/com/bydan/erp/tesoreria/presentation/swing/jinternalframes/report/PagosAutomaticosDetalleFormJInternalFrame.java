/*
*AVISO LEGAL
© Copyright
*Este programa esta protegido por la ley de derechos de autor.
*La reproduccion o distribucion ilicita de este programa o de cualquiera de
*sus partes esta penado por la ley con severas sanciones civiles y penales,
*y seran objeto de todas las sanciones legales que correspondan.

*Su contenido no puede copiarse para fines comerciales o de otras,
*ni puede mostrarse, incluso en una version modificada, en otros sitios Web.
Solo esta permitido colocar hipervinculos al sitio web.
*/
package com.bydan.erp.tesoreria.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.tesoreria.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.tesoreria.business.entity.report.*;
import com.bydan.erp.tesoreria.util.report.PagosAutomaticosConstantesFunciones;

import com.bydan.erp.tesoreria.business.logic.report.*;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.*;
import com.bydan.framework.erp.util.*;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.*;


import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRRuntimeException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.j2ee.servlets.BaseHttpServlet;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.data.JRBeanArrayDataSource;


import javax.swing.*;
import java.awt.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.TableColumn;

import com.toedter.calendar.JDateChooser;


@SuppressWarnings("unused")
public class PagosAutomaticosDetalleFormJInternalFrame extends PagosAutomaticosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePagosAutomaticos;
	
	protected JMenuBar jmenuBarDetallePagosAutomaticos;
	
	protected JMenu jmenuDetallePagosAutomaticos;
	protected JMenu jmenuDetalleArchivoPagosAutomaticos;
	protected JMenu jmenuDetalleAccionesPagosAutomaticos;
	protected JMenu jmenuDetalleDatosPagosAutomaticos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosAutomaticos;	
	protected GridBagConstraints gridBagConstraintsPagosAutomaticos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PagosAutomaticosBeanSwingJInternalFrameAdditional jInternalFrameDetallePagosAutomaticos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PagosAutomaticosSessionBean pagosautomaticosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PagosAutomaticosLogic pagosautomaticosLogic;
	
	public JScrollPane jScrollPanelDatosPagosAutomaticos;
	public JScrollPane jScrollPanelDatosEdicionPagosAutomaticos;
	public JScrollPane jScrollPanelDatosGeneralPagosAutomaticos;
	
	protected JPanel jPanelCamposPagosAutomaticos;    
	protected JPanel jPanelCamposOcultosPagosAutomaticos;    	
	protected JPanel jPanelAccionesPagosAutomaticos;
	protected JPanel jPanelAccionesFormularioPagosAutomaticos;
    
	
	
	protected Integer iXPanelCamposPagosAutomaticos=0;
	protected Integer iYPanelCamposPagosAutomaticos=0;
	
	protected Integer iXPanelCamposOcultosPagosAutomaticos=0;
	protected Integer iYPanelCamposOcultosPagosAutomaticos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPagosAutomaticos;
	public JButton jButtonModificarPagosAutomaticos;
	public JButton jButtonActualizarPagosAutomaticos;
    public JButton jButtonEliminarPagosAutomaticos;
	public JButton jButtonCancelarPagosAutomaticos;
    public JButton jButtonGuardarCambiosPagosAutomaticos;
	public JButton jButtonGuardarCambiosTablaPagosAutomaticos;
	protected JButton jButtonCerrarPagosAutomaticos;
	
	
	protected JButton jButtonProcesarInformacionPagosAutomaticos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPagosAutomaticos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPagosAutomaticos;
	protected JCheckBox jCheckBoxPostAccionSinMensajePagosAutomaticos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosAutomaticos;
	protected JButton jButtonModificarToolBarPagosAutomaticos;
	protected JButton jButtonActualizarToolBarPagosAutomaticos;
    protected JButton jButtonEliminarToolBarPagosAutomaticos;
	protected JButton jButtonCancelarToolBarPagosAutomaticos;
    protected JButton jButtonGuardarCambiosToolBarPagosAutomaticos;
	protected JButton jButtonGuardarCambiosTablaToolBarPagosAutomaticos;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosAutomaticos;
	protected JButton jButtonCerrarToolBarPagosAutomaticos;
	
	protected JButton jButtonProcesarInformacionToolBarPagosAutomaticos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosAutomaticos;
	protected JMenuItem jMenuItemModificarPagosAutomaticos;
	protected JMenuItem jMenuItemActualizarPagosAutomaticos;
    protected JMenuItem jMenuItemEliminarPagosAutomaticos;
	protected JMenuItem jMenuItemCancelarPagosAutomaticos;
    protected JMenuItem jMenuItemGuardarCambiosPagosAutomaticos;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosAutomaticos;
	protected JMenuItem jMenuItemCerrarPagosAutomaticos;
	protected JMenuItem jMenuItemDetalleCerrarPagosAutomaticos;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosAutomaticos;
	
	protected JMenuItem jMenuItemProcesarInformacionPagosAutomaticos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosAutomaticos;
	protected JMenuItem jMenuItemMostrarOcultarPagosAutomaticos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosAutomaticos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosAutomaticos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosAutomaticos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPagosAutomaticos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPagosAutomaticos;
	public JLabel jLabelIdPagosAutomaticos;
	public JLabel jLabelidPagosAutomaticos;
	public JButton jButtonidPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_cortePagosAutomaticos;
	public JLabel jLabelfecha_cortePagosAutomaticos;
	//public JFormattedTextField jDateChooserfecha_cortePagosAutomaticos;

	public JDateChooser jDateChooserfecha_cortePagosAutomaticos;
	public JButton jButtonfecha_cortePagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clientePagosAutomaticos;
	public JLabel jLabelnombre_clientePagosAutomaticos;
	public JTextArea jTextAreanombre_clientePagosAutomaticos;
	public JScrollPane jscrollPanenombre_clientePagosAutomaticos;
	public JButton jButtonnombre_clientePagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaPagosAutomaticos;
	public JLabel jLabelnumero_facturaPagosAutomaticos;
	public JTextField jTextFieldnumero_facturaPagosAutomaticos;
	public JButton jButtonnumero_facturaPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPagosAutomaticos;
	public JLabel jLabelfecha_emisionPagosAutomaticos;
	//public JFormattedTextField jDateChooserfecha_emisionPagosAutomaticos;

	public JDateChooser jDateChooserfecha_emisionPagosAutomaticos;
	public JButton jButtonfecha_emisionPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoPagosAutomaticos;
	public JLabel jLabelfecha_vencimientoPagosAutomaticos;
	//public JFormattedTextField jDateChooserfecha_vencimientoPagosAutomaticos;

	public JDateChooser jDateChooserfecha_vencimientoPagosAutomaticos;
	public JButton jButtonfecha_vencimientoPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoPagosAutomaticos;
	public JLabel jLabelnombre_bancoPagosAutomaticos;
	public JTextArea jTextAreanombre_bancoPagosAutomaticos;
	public JScrollPane jscrollPanenombre_bancoPagosAutomaticos;
	public JButton jButtonnombre_bancoPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_por_pagarPagosAutomaticos;
	public JLabel jLabelvalor_por_pagarPagosAutomaticos;
	public JTextField jTextFieldvalor_por_pagarPagosAutomaticos;
	public JButton jButtonvalor_por_pagarPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_canceladoPagosAutomaticos;
	public JLabel jLabelvalor_canceladoPagosAutomaticos;
	public JTextField jTextFieldvalor_canceladoPagosAutomaticos;
	public JButton jButtonvalor_canceladoPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaPagosAutomaticos;
	public JLabel jLabelnumero_cuentaPagosAutomaticos;
	public JTextField jTextFieldnumero_cuentaPagosAutomaticos;
	public JButton jButtonnumero_cuentaPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelesta_autorizadoPagosAutomaticos;
	public JLabel jLabelesta_autorizadoPagosAutomaticos;
	public JCheckBox jCheckBoxesta_autorizadoPagosAutomaticos;
	public JButton jButtonesta_autorizadoPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPagosAutomaticos;
	public JLabel jLabeldescripcionPagosAutomaticos;
	public JTextArea jTextAreadescripcionPagosAutomaticos;
	public JScrollPane jscrollPanedescripcionPagosAutomaticos;
	public JButton jButtondescripcionPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_corte_datoPagosAutomaticos;
	public JLabel jLabelfecha_corte_datoPagosAutomaticos;
	//public JFormattedTextField jDateChooserfecha_corte_datoPagosAutomaticos;

	public JDateChooser jDateChooserfecha_corte_datoPagosAutomaticos;
	public JButton jButtonfecha_corte_datoPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelestadoPagosAutomaticos;
	public JLabel jLabelestadoPagosAutomaticos;
	public JTextArea jTextAreaestadoPagosAutomaticos;
	public JScrollPane jscrollPaneestadoPagosAutomaticos;
	public JButton jButtonestadoPagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_con_clientePagosAutomaticos;
	public JLabel jLabelcodigo_cuenta_con_clientePagosAutomaticos;
	public JTextField jTextFieldcodigo_cuenta_con_clientePagosAutomaticos;
	public JButton jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_con_bancoPagosAutomaticos;
	public JLabel jLabelcodigo_cuenta_con_bancoPagosAutomaticos;
	public JTextField jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos;
	public JButton jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPagosAutomaticos;
	public JLabel jLabelid_empresaPagosAutomaticos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPagosAutomaticos;
	public JButton jButtonid_empresaPagosAutomaticos= new JButtonMe();
	public JButton jButtonid_empresaPagosAutomaticosUpdate= new JButtonMe();
	public JButton jButtonid_empresaPagosAutomaticosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPagosAutomaticos;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=false;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=750;//(screenSize.width-screenSize.width/2)+(250*1);
	public int iHeightFormulario=814;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public PagosAutomaticosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPagosAutomaticos=new JPanel();
				this.jPanelAccionesFormularioPagosAutomaticos=new JPanel();
				this.jmenuBarDetallePagosAutomaticos=new JMenuBar();
				this.jTtoolBarDetallePagosAutomaticos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PagosAutomaticosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutomaticosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosAutomaticos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}

			this.initialize(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Clase Padre Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }		

	public JInternalFrameBase getJInternalFrameParent() {
		return jInternalFrameParent;
	}

	public void setJInternalFrameParent(JInternalFrameBase internalFrameParent)	{
		jInternalFrameParent = internalFrameParent;
	}
	
	
	public JButton getjButtonActualizarToolBarPagosAutomaticos() {
		return this.jButtonActualizarToolBarPagosAutomaticos;
	}
	
	public JButton getjButtonEliminarToolBarPagosAutomaticos() {
		return this.jButtonEliminarToolBarPagosAutomaticos;
	}
	
	public JButton getjButtonCancelarToolBarPagosAutomaticos() {
		return this.jButtonCancelarToolBarPagosAutomaticos;
	}		
	
	public JButton getjButtonProcesarInformacionPagosAutomaticos() {
		return this.jButtonProcesarInformacionPagosAutomaticos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosAutomaticos)	{
		this.jButtonProcesarInformacionPagosAutomaticos = jButtonProcesarInformacionPagosAutomaticos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosAutomaticos() {
		return this.jComboBoxTiposAccionesPagosAutomaticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosAutomaticos(
			JComboBox jComboBoxTiposRelacionesPagosAutomaticos) {
		this.jComboBoxTiposRelacionesPagosAutomaticos = jComboBoxTiposRelacionesPagosAutomaticos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosAutomaticos(
			JComboBox jComboBoxTiposAccionesPagosAutomaticos) {
		this.jComboBoxTiposAccionesPagosAutomaticos = jComboBoxTiposAccionesPagosAutomaticos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPagosAutomaticos() {
		return this.jComboBoxTiposAccionesFormularioPagosAutomaticos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPagosAutomaticos(
			JComboBox jComboBoxTiposAccionesFormularioPagosAutomaticos) {
		this.jComboBoxTiposAccionesFormularioPagosAutomaticos = jComboBoxTiposAccionesFormularioPagosAutomaticos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pagosautomaticosSessionBean=new PagosAutomaticosSessionBean();
		
		this.pagosautomaticosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautomaticosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagosautomaticosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosAutomaticosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosAutomaticosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosAutomaticosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Automaticos MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			this.setResizable(true);
			this.setClosable(true);
			this.setMaximizable(true);
			this.iconable=true;
			
			setLocation(xOffset*openFrameCount, yOffset*openFrameCount);
			
			if(Constantes.CON_VARIAS_VENTANAS) {
				openFrameCount++;
				
				if(openFrameCount==Constantes.INUM_MAX_VENTANAS) {
					openFrameCount=0;
				}
			}
		}				
	
		PagosAutomaticosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagosAutomaticos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPagosAutomaticos=new JButtonMe();
				this.jButtonModificarToolBarPagosAutomaticos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPagosAutomaticos,this.jTtoolBarDetallePagosAutomaticos,
							"actualizar","actualizar","Actualizar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPagosAutomaticos,this.jTtoolBarDetallePagosAutomaticos,
							"eliminar","eliminar","Eliminar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPagosAutomaticos,this.jTtoolBarDetallePagosAutomaticos,
							"cancelar","cancelar","Cancelar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPagosAutomaticos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPagosAutomaticos,this.jTtoolBarDetallePagosAutomaticos,
							"guardarcambios","guardarcambios","Guardar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePagosAutomaticos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePagosAutomaticos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPagosAutomaticos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPagosAutomaticos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPagosAutomaticos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosAutomaticos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosAutomaticos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosAutomaticos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPagosAutomaticos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPagosAutomaticos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPagosAutomaticos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPagosAutomaticos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPagosAutomaticos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPagosAutomaticos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPagosAutomaticos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPagosAutomaticos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPagosAutomaticos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPagosAutomaticos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPagosAutomaticos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPagosAutomaticos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPagosAutomaticos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosAutomaticos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosAutomaticos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosAutomaticos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosAutomaticos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosAutomaticos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPagosAutomaticos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPagosAutomaticos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPagosAutomaticos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosAutomaticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosAutomaticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosAutomaticos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosAutomaticos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosAutomaticos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosAutomaticos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPagosAutomaticos.add(this.jMenuItemDetalleCerrarPagosAutomaticos);
		
		this.jmenuDetalleAccionesPagosAutomaticos.add(this.jMenuItemActualizarPagosAutomaticos);
		this.jmenuDetalleAccionesPagosAutomaticos.add(this.jMenuItemEliminarPagosAutomaticos);
		this.jmenuDetalleAccionesPagosAutomaticos.add(this.jMenuItemCancelarPagosAutomaticos);		
		
		//this.jmenuDetalleDatosPagosAutomaticos.add(this.jMenuItemDetalleAbrirOrderByPagosAutomaticos);				
		this.jmenuDetalleDatosPagosAutomaticos.add(this.jMenuItemDetalleMostarOcultarPagosAutomaticos);				
				
		//this.jmenuDetalleAccionesPagosAutomaticos.add(this.jMenuItemGuardarCambiosPagosAutomaticos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePagosAutomaticos.add(this.jmenuDetalleArchivoPagosAutomaticos);		
		this.jmenuBarDetallePagosAutomaticos.add(this.jmenuDetalleAccionesPagosAutomaticos);		
		this.jmenuBarDetallePagosAutomaticos.add(this.jmenuDetalleDatosPagosAutomaticos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePagosAutomaticos);				
	}
	
	
	public void inicializarElementosCamposPagosAutomaticos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPagosAutomaticos = new JLabelMe();
		jLabelIdPagosAutomaticos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPagosAutomaticos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPagosAutomaticos= new GridBagLayout();

		this.jPanelidPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);

		jLabelidPagosAutomaticos = new JLabel();
		jLabelidPagosAutomaticos.setText("Id");

		jLabelidPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_cortePagosAutomaticos = new JLabelMe();
		this.jLabelfecha_cortePagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0+" : *");
		this.jLabelfecha_cortePagosAutomaticos.setToolTipText("Fecha Corte Base");
		this.jLabelfecha_cortePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_cortePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_cortePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_cortePagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_cortePagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_cortePagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE0);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelfecha_cortePagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		//jFormattedTextFieldfecha_cortePagosAutomaticos= new JFormattedTextFieldMe();

		jDateChooserfecha_cortePagosAutomaticos= new JDateChooser();
		jDateChooserfecha_cortePagosAutomaticos.setEnabled(false);
		jDateChooserfecha_cortePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_cortePagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_cortePagosAutomaticos.setDate(new Date());
		jDateChooserfecha_cortePagosAutomaticos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_cortePagosAutomaticos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_cortePagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonfecha_cortePagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_cortePagosAutomaticosBusqueda.setText("U");
		this.jButtonfecha_cortePagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_cortePagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_cortePagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_cortePagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_cortePagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_cortePagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_cortePagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clientePagosAutomaticos = new JLabelMe();
		this.jLabelnombre_clientePagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clientePagosAutomaticos.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clientePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clientePagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clientePagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clientePagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelnombre_clientePagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextAreanombre_clientePagosAutomaticos= new JTextAreaMe();
		jTextAreanombre_clientePagosAutomaticos.setEnabled(false);
		jTextAreanombre_clientePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePagosAutomaticos.setLineWrap(true);
		jTextAreanombre_clientePagosAutomaticos.setWrapStyleWord(true);
		jTextAreanombre_clientePagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clientePagosAutomaticos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clientePagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clientePagosAutomaticos = new JScrollPane(jTextAreanombre_clientePagosAutomaticos);
		jscrollPanenombre_clientePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clientePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clientePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clientePagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonnombre_clientePagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clientePagosAutomaticosBusqueda.setText("U");
		this.jButtonnombre_clientePagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clientePagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clientePagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clientePagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clientePagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clientePagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clientePagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaPagosAutomaticos = new JLabelMe();
		this.jLabelnumero_facturaPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaPagosAutomaticos.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelnumero_facturaPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextFieldnumero_facturaPagosAutomaticos= new JTextFieldMe();

		jTextFieldnumero_facturaPagosAutomaticos.setEnabled(false);
		jTextFieldnumero_facturaPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaPagosAutomaticosBusqueda.setText("U");
		this.jButtonnumero_facturaPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPagosAutomaticos = new JLabelMe();
		this.jLabelfecha_emisionPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPagosAutomaticos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelfecha_emisionPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		//jFormattedTextFieldfecha_emisionPagosAutomaticos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPagosAutomaticos= new JDateChooser();
		jDateChooserfecha_emisionPagosAutomaticos.setEnabled(false);
		jDateChooserfecha_emisionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPagosAutomaticos.setDate(new Date());
		jDateChooserfecha_emisionPagosAutomaticos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPagosAutomaticos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPagosAutomaticosBusqueda.setText("U");
		this.jButtonfecha_emisionPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoPagosAutomaticos = new JLabelMe();
		this.jLabelfecha_vencimientoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoPagosAutomaticos.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelfecha_vencimientoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		//jFormattedTextFieldfecha_vencimientoPagosAutomaticos= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoPagosAutomaticos= new JDateChooser();
		jDateChooserfecha_vencimientoPagosAutomaticos.setEnabled(false);
		jDateChooserfecha_vencimientoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoPagosAutomaticos.setDate(new Date());
		jDateChooserfecha_vencimientoPagosAutomaticos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoPagosAutomaticos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setText("U");
		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bancoPagosAutomaticos = new JLabelMe();
		this.jLabelnombre_bancoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoPagosAutomaticos.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelnombre_bancoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextAreanombre_bancoPagosAutomaticos= new JTextAreaMe();
		jTextAreanombre_bancoPagosAutomaticos.setEnabled(false);
		jTextAreanombre_bancoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoPagosAutomaticos.setLineWrap(true);
		jTextAreanombre_bancoPagosAutomaticos.setWrapStyleWord(true);
		jTextAreanombre_bancoPagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoPagosAutomaticos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoPagosAutomaticos = new JScrollPane(jTextAreanombre_bancoPagosAutomaticos);
		jscrollPanenombre_bancoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bancoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonnombre_bancoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoPagosAutomaticosBusqueda.setText("U");
		this.jButtonnombre_bancoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_por_pagarPagosAutomaticos = new JLabelMe();
		this.jLabelvalor_por_pagarPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR+" : *");
		this.jLabelvalor_por_pagarPagosAutomaticos.setToolTipText("Valor Por Pagar");
		this.jLabelvalor_por_pagarPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_por_pagarPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_por_pagarPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_por_pagarPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_por_pagarPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_por_pagarPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_VALORPORPAGAR);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelvalor_por_pagarPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextFieldvalor_por_pagarPagosAutomaticos= new JTextFieldMe();
		jTextFieldvalor_por_pagarPagosAutomaticos.setEnabled(false);
		jTextFieldvalor_por_pagarPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_por_pagarPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_por_pagarPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_por_pagarPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_por_pagarPagosAutomaticos.setText("0.0");

		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setText("U");
		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_por_pagarPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_por_pagarPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_por_pagarPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_por_pagarPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_por_pagarPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_canceladoPagosAutomaticos = new JLabelMe();
		this.jLabelvalor_canceladoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO+" : *");
		this.jLabelvalor_canceladoPagosAutomaticos.setToolTipText("Valor Cancelado");
		this.jLabelvalor_canceladoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_canceladoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_canceladoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_canceladoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_VALORCANCELADO);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelvalor_canceladoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextFieldvalor_canceladoPagosAutomaticos= new JTextFieldMe();
		jTextFieldvalor_canceladoPagosAutomaticos.setEnabled(false);
		jTextFieldvalor_canceladoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_canceladoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_canceladoPagosAutomaticos.setText("0.0");

		this.jButtonvalor_canceladoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setText("U");
		this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_canceladoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_canceladoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_canceladoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_canceladoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_canceladoPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaPagosAutomaticos = new JLabelMe();
		this.jLabelnumero_cuentaPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaPagosAutomaticos.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelnumero_cuentaPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextFieldnumero_cuentaPagosAutomaticos= new JTextFieldMe();

		jTextFieldnumero_cuentaPagosAutomaticos.setEnabled(false);
		jTextFieldnumero_cuentaPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setText("U");
		this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelesta_autorizadoPagosAutomaticos = new JLabelMe();
		this.jLabelesta_autorizadoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO+" : *");
		this.jLabelesta_autorizadoPagosAutomaticos.setToolTipText("Esta Autorizado");
		this.jLabelesta_autorizadoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_autorizadoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_autorizadoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_autorizadoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_autorizadoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_autorizadoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_ESTAAUTORIZADO);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelesta_autorizadoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jCheckBoxesta_autorizadoPagosAutomaticos= new JCheckBoxMe();
		jCheckBoxesta_autorizadoPagosAutomaticos.setEnabled(false);

		jCheckBoxesta_autorizadoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_autorizadoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_autorizadoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_autorizadoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_autorizadoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setText("U");
		this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_autorizadoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_autorizadoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_autorizadoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_autorizadoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_autorizadoPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPagosAutomaticos = new JLabelMe();
		this.jLabeldescripcionPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPagosAutomaticos.setToolTipText("Descripcion");
		this.jLabeldescripcionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPaneldescripcionPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextAreadescripcionPagosAutomaticos= new JTextAreaMe();
		jTextAreadescripcionPagosAutomaticos.setEnabled(false);
		jTextAreadescripcionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagosAutomaticos.setLineWrap(true);
		jTextAreadescripcionPagosAutomaticos.setWrapStyleWord(true);
		jTextAreadescripcionPagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPagosAutomaticos.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPagosAutomaticos = new JScrollPane(jTextAreadescripcionPagosAutomaticos);
		jscrollPanedescripcionPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtondescripcionPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPagosAutomaticosBusqueda.setText("U");
		this.jButtondescripcionPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_corte_datoPagosAutomaticos = new JLabelMe();
		this.jLabelfecha_corte_datoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE+" : *");
		this.jLabelfecha_corte_datoPagosAutomaticos.setToolTipText("Fecha Corte");
		this.jLabelfecha_corte_datoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_corte_datoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_corte_datoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_corte_datoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_corte_datoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_corte_datoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_FECHACORTE);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelfecha_corte_datoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		//jFormattedTextFieldfecha_corte_datoPagosAutomaticos= new JFormattedTextFieldMe();

		jDateChooserfecha_corte_datoPagosAutomaticos= new JDateChooser();
		jDateChooserfecha_corte_datoPagosAutomaticos.setEnabled(false);
		jDateChooserfecha_corte_datoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corte_datoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corte_datoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_corte_datoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_corte_datoPagosAutomaticos.setDate(new Date());
		jDateChooserfecha_corte_datoPagosAutomaticos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_corte_datoPagosAutomaticos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setText("U");
		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_corte_datoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_corte_datoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_corte_datoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_corte_datoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_corte_datoPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelestadoPagosAutomaticos = new JLabelMe();
		this.jLabelestadoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPagosAutomaticos.setToolTipText("Estado");
		this.jLabelestadoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelestadoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextAreaestadoPagosAutomaticos= new JTextAreaMe();
		jTextAreaestadoPagosAutomaticos.setEnabled(false);
		jTextAreaestadoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaestadoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaestadoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaestadoPagosAutomaticos.setLineWrap(true);
		jTextAreaestadoPagosAutomaticos.setWrapStyleWord(true);
		jTextAreaestadoPagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaestadoPagosAutomaticos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaestadoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneestadoPagosAutomaticos = new JScrollPane(jTextAreaestadoPagosAutomaticos);
		jscrollPaneestadoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneestadoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneestadoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonestadoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonestadoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPagosAutomaticosBusqueda.setText("U");
		this.jButtonestadoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaestadoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaestadoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_con_clientePagosAutomaticos = new JLabelMe();
		this.jLabelcodigo_cuenta_con_clientePagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE+" : *");
		this.jLabelcodigo_cuenta_con_clientePagosAutomaticos.setToolTipText("Codigo Cuenta Con Cliente");
		this.jLabelcodigo_cuenta_con_clientePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_clientePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_clientePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_con_clientePagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_con_clientePagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_con_clientePagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelcodigo_cuenta_con_clientePagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos= new JTextFieldMe();

		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setEnabled(false);
		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_con_clientePagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setText("U");
		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_con_clientePagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_con_clientePagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_con_bancoPagosAutomaticos = new JLabelMe();
		this.jLabelcodigo_cuenta_con_bancoPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO+" : *");
		this.jLabelcodigo_cuenta_con_bancoPagosAutomaticos.setToolTipText("Codigo Cuenta Con Banco");
		this.jLabelcodigo_cuenta_con_bancoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_bancoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_bancoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_con_bancoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos= new JTextFieldMe();

		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setEnabled(false);
		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setText("U");
		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_con_bancoPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPagosAutomaticos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPagosAutomaticos = new JLabelMe();
		this.jLabelid_empresaPagosAutomaticos.setText(""+PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPagosAutomaticos.setToolTipText("Empresa");
		this.jLabelid_empresaPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPagosAutomaticos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPagosAutomaticos.setToolTipText(PagosAutomaticosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		this.jPanelid_empresaPagosAutomaticos.setLayout(this.gridaBagLayoutPagosAutomaticos);


		jComboBoxid_empresaPagosAutomaticos= new JComboBoxMe();
		jComboBoxid_empresaPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPagosAutomaticos.setEnabled(false);

		this.jButtonid_empresaPagosAutomaticos= new JButtonMe();
		this.jButtonid_empresaPagosAutomaticos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutomaticos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutomaticos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutomaticos.setText("Buscar");
		this.jButtonid_empresaPagosAutomaticos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPagosAutomaticos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutomaticos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutomaticos"));

		this.jButtonid_empresaPagosAutomaticosBusqueda= new JButtonMe();
		this.jButtonid_empresaPagosAutomaticosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutomaticosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutomaticosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosAutomaticosBusqueda.setText("U");
		this.jButtonid_empresaPagosAutomaticosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPagosAutomaticosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutomaticosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutomaticosBusqueda"));

		if(this.pagosautomaticosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPagosAutomaticosBusqueda.setVisible(false);		}

		this.jButtonid_empresaPagosAutomaticosUpdate= new JButtonMe();
		this.jButtonid_empresaPagosAutomaticosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutomaticosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutomaticosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosAutomaticosUpdate.setText("U");
		this.jButtonid_empresaPagosAutomaticosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPagosAutomaticosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutomaticosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPagosAutomaticos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutomaticos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutomaticosUpdate"));



	}
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) {
		//System.out.println("TRANSFIERE EL MANEJO AL PADRE O FORM PRINCIPAL");
		
		jInternalFrameParent.jButtonActionPerformedTecladoGeneral(sTipo,evt);
	}
	
	//JPanel
	//@SuppressWarnings({"unchecked" })//"rawtypes"
	public JScrollPane getJContentPane(int iWidth,int iHeight,JDesktopPane jDesktopPane,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {	
		//PARA TABLA PARAMETROS
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		this.jContentPane = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
				
		this.usuarioActual=usuarioActual;
		this.resumenUsuarioActual=resumenUsuarioActual;
		this.opcionActual=opcionActual;
		
		this.moduloActual=moduloActual;		
		this.parametroGeneralSg=parametroGeneralSg;		
		this.parametroGeneralUsuario=parametroGeneralUsuario;	
		
		this.jDesktopPane=jDesktopPane;
				
		this.conFuncionalidadRelaciones=parametroGeneralUsuario.getcon_guardar_relaciones();
		
		
		int iGridyPrincipal=0;
		
		
		this.inicializarToolBar();		
		
		
		//CARGAR MENUS
		//this.jInternalFrameDetallePagosAutomaticos = new PagosAutomaticosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pagos Automaticos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosAutomaticos= new GridBagLayout();
		

		
		String sToolTipPagosAutomaticos="";
		sToolTipPagosAutomaticos=PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosAutomaticos+="(Tesoreria.PagosAutomaticos)";
		}
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosAutomaticos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPagosAutomaticos = new JButtonMe();
		this.jButtonModificarPagosAutomaticos = new JButtonMe();
        this.jButtonActualizarPagosAutomaticos = new JButtonMe();
        this.jButtonEliminarPagosAutomaticos = new JButtonMe();
        this.jButtonCancelarPagosAutomaticos = new JButtonMe();
        this.jButtonGuardarCambiosPagosAutomaticos = new JButtonMe();
		this.jButtonGuardarCambiosTablaPagosAutomaticos = new JButtonMe();
		this.jButtonCerrarPagosAutomaticos = new JButtonMe();
		
		this.jScrollPanelDatosPagosAutomaticos = new JScrollPane();   
        this.jScrollPanelDatosEdicionPagosAutomaticos = new JScrollPane();
		this.jScrollPanelDatosGeneralPagosAutomaticos = new JScrollPane();
				
		
		
		this.jPanelCamposPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Automaticos";
		
		if(!this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Automaticoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosAutomaticos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPagosAutomaticos.setName("jPanelCamposPagosAutomaticos"); 

		this.jPanelCamposOcultosPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPagosAutomaticos.setName("jPanelCamposOcultosPagosAutomaticos"); 

        this.jPanelAccionesPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosAutomaticos.setToolTipText("Acciones");
        this.jPanelAccionesPagosAutomaticos.setName("Acciones"); 

		this.jPanelAccionesFormularioPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPagosAutomaticos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPagosAutomaticos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPagosAutomaticos.setText("Nuevo");
		this.jButtonModificarPagosAutomaticos.setText("Editar");
        this.jButtonActualizarPagosAutomaticos.setText("Actualizar");
        this.jButtonEliminarPagosAutomaticos.setText("Eliminar");
        this.jButtonCancelarPagosAutomaticos.setText("Cancelar");
        this.jButtonGuardarCambiosPagosAutomaticos.setText("Guardar");
		this.jButtonGuardarCambiosTablaPagosAutomaticos.setText("Guardar");
		this.jButtonCerrarPagosAutomaticos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosAutomaticos,"nuevo_button","Nuevo",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPagosAutomaticos,"modificar_button","Editar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPagosAutomaticos,"actualizar_button","Actualizar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPagosAutomaticos,"eliminar_button","Eliminar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPagosAutomaticos,"cancelar_button","Cancelar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPagosAutomaticos,"guardarcambios_button","Guardar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosAutomaticos,"guardarcambiostabla_button","Guardar",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosAutomaticos,"cerrar_button","Salir",this.pagosautomaticosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPagosAutomaticos.setToolTipText("Nuevo"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPagosAutomaticos.setToolTipText("Editar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPagosAutomaticos.setToolTipText("Actualizar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPagosAutomaticos.setToolTipText("Eliminar)"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPagosAutomaticos.setToolTipText("Cancelar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPagosAutomaticos.setToolTipText("Guardar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPagosAutomaticos.setToolTipText("Guardar"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosAutomaticos.setToolTipText("Salir"+" "+PagosAutomaticosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
		//HOT KEYS
		/*
		N->Nuevo
		N->Alt + Nuevo Relaciones (ANTES R)
		A->Actualizar
		E->Eliminar
		S->Cerrar
		C->->Mayus + Cancelar (ANTES Q->Quit)
		G->Guardar Cambios
		D->Duplicar
		C->Alt + Cop?ar
		O->Orden
		N->Nuevo Tabla
		R->Recargar Informacion Inicial (ANTES I)
		Alt + Pag.Down->Siguientes
		Alt + Pag.Up->Anteriores
		
		NO UTILIZADOS
		M->Modificar
		
		*/
		String sMapKey = "";
		InputMap inputMap =null;
		
		//NUEVO
		sMapKey = "NuevoPagosAutomaticos";
		inputMap = this.jButtonNuevoPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosAutomaticos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosAutomaticos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPagosAutomaticos";
		inputMap = this.jButtonActualizarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPagosAutomaticos"));
		
		//ELIMINAR
		sMapKey = "EliminarPagosAutomaticos";
		inputMap = this.jButtonEliminarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPagosAutomaticos"));
		
		//CANCELAR	
		sMapKey = "CancelarPagosAutomaticos";
		inputMap = this.jButtonCancelarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPagosAutomaticos"));
		
		//CERRAR		
		sMapKey = "CerrarPagosAutomaticos";
		inputMap = this.jButtonCerrarPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosAutomaticos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosAutomaticos";
		inputMap = this.jButtonGuardarCambiosTablaPagosAutomaticos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosAutomaticos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosAutomaticos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPagosAutomaticos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPagosAutomaticos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPagosAutomaticos.setToolTipText("Nuevo PagosAutomaticos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPagosAutomaticos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPagosAutomaticos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPagosAutomaticos.setToolTipText("Sin Cerrar Ventana PagosAutomaticos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePagosAutomaticos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePagosAutomaticos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePagosAutomaticos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosAutomaticos.setText("Accion");
		this.jComboBoxTiposAccionesPagosAutomaticos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPagosAutomaticos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPagosAutomaticos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPagosAutomaticos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPagosAutomaticos = new JLabelMe();
		
		this.jLabelAccionesPagosAutomaticos.setText("Acciones");		
		this.jLabelAccionesPagosAutomaticos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutomaticos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutomaticos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPagosAutomaticos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPagosAutomaticos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPagosAutomaticos=new JTabbedPane();
		this.jTabbedPaneRelacionesPagosAutomaticos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPagosAutomaticos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPagosAutomaticos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutomaticos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutomaticos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPagosAutomaticos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosAutomaticos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosAutomaticos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPagosAutomaticos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPagosAutomaticos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPagosAutomaticos = new GridBagLayout();
		
		this.jPanelCamposPagosAutomaticos.setLayout(gridaBagLayoutCamposPagosAutomaticos);
		this.jPanelCamposOcultosPagosAutomaticos.setLayout(gridaBagLayoutCamposOcultosPagosAutomaticos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPagosAutomaticos.add(jLabelIdPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPagosAutomaticos.add(jLabelidPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPagosAutomaticos.add(jLabelid_empresaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosAutomaticos.add(jButtonid_empresaPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 3;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosAutomaticos.add(jButtonid_empresaPagosAutomaticosUpdate, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPagosAutomaticos.add(jComboBoxid_empresaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_cortePagosAutomaticos.add(jLabelfecha_cortePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_cortePagosAutomaticos.add(jButtonfecha_cortePagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_cortePagosAutomaticos.add(jDateChooserfecha_cortePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clientePagosAutomaticos.add(jLabelnombre_clientePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clientePagosAutomaticos.add(jButtonnombre_clientePagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clientePagosAutomaticos.add(jscrollPanenombre_clientePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaPagosAutomaticos.add(jLabelnumero_facturaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaPagosAutomaticos.add(jButtonnumero_facturaPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaPagosAutomaticos.add(jTextFieldnumero_facturaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPagosAutomaticos.add(jLabelfecha_emisionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPagosAutomaticos.add(jButtonfecha_emisionPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPagosAutomaticos.add(jDateChooserfecha_emisionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoPagosAutomaticos.add(jLabelfecha_vencimientoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoPagosAutomaticos.add(jButtonfecha_vencimientoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoPagosAutomaticos.add(jDateChooserfecha_vencimientoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoPagosAutomaticos.add(jLabelnombre_bancoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoPagosAutomaticos.add(jButtonnombre_bancoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoPagosAutomaticos.add(jscrollPanenombre_bancoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_por_pagarPagosAutomaticos.add(jLabelvalor_por_pagarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_por_pagarPagosAutomaticos.add(jButtonvalor_por_pagarPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_por_pagarPagosAutomaticos.add(jTextFieldvalor_por_pagarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_canceladoPagosAutomaticos.add(jLabelvalor_canceladoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_canceladoPagosAutomaticos.add(jButtonvalor_canceladoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_canceladoPagosAutomaticos.add(jTextFieldvalor_canceladoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaPagosAutomaticos.add(jLabelnumero_cuentaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaPagosAutomaticos.add(jButtonnumero_cuentaPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaPagosAutomaticos.add(jTextFieldnumero_cuentaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_autorizadoPagosAutomaticos.add(jLabelesta_autorizadoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_autorizadoPagosAutomaticos.add(jButtonesta_autorizadoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_autorizadoPagosAutomaticos.add(jCheckBoxesta_autorizadoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPagosAutomaticos.add(jLabeldescripcionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPagosAutomaticos.add(jButtondescripcionPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPagosAutomaticos.add(jscrollPanedescripcionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_corte_datoPagosAutomaticos.add(jLabelfecha_corte_datoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_corte_datoPagosAutomaticos.add(jButtonfecha_corte_datoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_corte_datoPagosAutomaticos.add(jDateChooserfecha_corte_datoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPagosAutomaticos.add(jLabelestadoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPagosAutomaticos.add(jButtonestadoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPagosAutomaticos.add(jscrollPaneestadoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_con_clientePagosAutomaticos.add(jLabelcodigo_cuenta_con_clientePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_con_clientePagosAutomaticos.add(jButtoncodigo_cuenta_con_clientePagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_con_clientePagosAutomaticos.add(jTextFieldcodigo_cuenta_con_clientePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos.add(jLabelcodigo_cuenta_con_bancoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = 2;
		this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
		this.gridBagConstraintsPagosAutomaticos.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos.add(jButtoncodigo_cuenta_con_bancoPagosAutomaticosBusqueda, this.gridBagConstraintsPagosAutomaticos);
	}

	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutomaticos.gridy = 0;
	this.gridBagConstraintsPagosAutomaticos.gridx = 1;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos.add(jTextFieldcodigo_cuenta_con_bancoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelidPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelfecha_cortePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelnombre_clientePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelnumero_facturaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelfecha_emisionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelfecha_vencimientoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelnombre_bancoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelvalor_por_pagarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelvalor_canceladoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelnumero_cuentaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelesta_autorizadoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPaneldescripcionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelfecha_corte_datoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelestadoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelcodigo_cuenta_con_clientePagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutomaticos.add(this.jPanelcodigo_cuenta_con_bancoPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposPagosAutomaticos % 2==0) {
		iXPanelCamposPagosAutomaticos=0;
		iYPanelCamposPagosAutomaticos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutomaticos.gridy = iYPanelCamposOcultosPagosAutomaticos;
	this.gridBagConstraintsPagosAutomaticos.gridx = iXPanelCamposOcultosPagosAutomaticos++;
	this.gridBagConstraintsPagosAutomaticos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutomaticos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagosAutomaticos.add(this.jPanelid_empresaPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);



	if(iXPanelCamposOcultosPagosAutomaticos % 2==0) {
		iXPanelCamposOcultosPagosAutomaticos=0;
		iYPanelCamposOcultosPagosAutomaticos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS INICIO				
		
		
		//SUBPANELES EN PANEL CAMPOS FIN				
		
				
		//SUBPANELES EN PANEL
		
		//ELEMENTOS TABLAS PARAMETOS
			//SUBPANELES POR CAMPO
		if(!this.conCargarMinimo) {
			
			//SUBPANELES EN PANEL CAMPOS				
			
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
			 		
			
		
		
		
		
		
		Integer iGridXParametrosAccionesFormulario=0;
		Integer iGridYParametrosAccionesFormulario=0;
			
		GridBagLayout gridaBagLayoutAccionesPagosAutomaticos= new GridBagLayout();
		this.jPanelAccionesPagosAutomaticos.setLayout(gridaBagLayoutAccionesPagosAutomaticos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPagosAutomaticos= new GridBagLayout();
		this.jPanelAccionesFormularioPagosAutomaticos.setLayout(gridaBagLayoutAccionesFormularioPagosAutomaticos);
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPagosAutomaticos.add(this.jComboBoxTiposAccionesFormularioPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccion++;
			
		this.jPanelAccionesPagosAutomaticos.add(this.jButtonModificarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);							

		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;
		this.gridBagConstraintsPagosAutomaticos.gridx =iPosXAccion++;
			
		this.jPanelAccionesPagosAutomaticos.add(this.jButtonEliminarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosAutomaticos.add(this.jButtonActualizarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);


		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;		
		this.gridBagConstraintsPagosAutomaticos.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosAutomaticos.add(this.jButtonGuardarCambiosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);	
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = 0;		
		this.gridBagConstraintsPagosAutomaticos.gridx =iPosXAccion++;
		
		this.jPanelAccionesPagosAutomaticos.add(this.jButtonCancelarPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosAutomaticos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosAutomaticos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagosautomaticosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();						
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;		
			//this.gridBagConstraintsPagosAutomaticos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosAutomaticos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosAutomaticos.gridx =0;
		this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosAutomaticos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PagosAutomaticosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePagosAutomaticos = new PagosAutomaticosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pagos Automaticos DATOS");
			
			this.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
	        //this.setjInternalFrameParent(this);
	        
			iHeightFormularioMaximo=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
	        
	        if(iHeightFormulario>iHeightFormularioMaximo) {
	        	iHeightFormulario=iHeightFormularioMaximo;
	        }
			
			iWidthFormularioMaximo=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
	        
			if(iWidthFormulario>iWidthFormularioMaximo) {
	        	iWidthFormulario=iWidthFormularioMaximo;
	        }
			
	        //this.setTitle("[FOR] - Pagos Automaticos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Automaticos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PagosAutomaticosModel pagosautomaticosModel=new PagosAutomaticosModel(this);
			
			//SI USARA CLASE INTERNA
			//PagosAutomaticosModel.PagosAutomaticosFocusTraversalPolicy pagosautomaticosFocusTraversalPolicy = pagosautomaticosModel.new PagosAutomaticosFocusTraversalPolicy(this);
			
			//pagosautomaticosFocusTraversalPolicy.setpagosautomaticosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pagosautomaticosModel);
			
			
			this.jContentPaneDetallePagosAutomaticos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePagosAutomaticos = new GridBagLayout();	
			this.jContentPaneDetallePagosAutomaticos.setLayout(gridaBagLayoutDetallePagosAutomaticos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosAutomaticos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
				this.gridBagConstraintsPagosAutomaticos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPagosAutomaticos.gridx = 0;
					
				
				this.jContentPaneDetallePagosAutomaticos.add(jTtoolBarDetallePagosAutomaticos, gridBagConstraintsPagosAutomaticos);								
				
}
			
			this.jScrollPanelDatosEdicionPagosAutomaticos=   new JScrollPane(jContentPaneDetallePagosAutomaticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosAutomaticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutomaticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutomaticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPagosAutomaticos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosAutomaticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutomaticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutomaticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPagosAutomaticos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	        
			this.jContentPaneDetallePagosAutomaticos.add(jPanelCamposPagosAutomaticos, gridBagConstraintsPagosAutomaticos);
			
			
			
			
			//if(!this.conCargarMinimo) {
			
			
			;
			//}
						
			this.conMaximoRelaciones=true;
			
			if(this.parametroGeneralUsuario.getcon_cargar_por_parte()) {
				
			}									
			
			//CARGA O NO CARGA RELACIONADOS(MAESTRO DETALLE)
									  // ABAJO VIENE DE PARAMETRO GENERAL USUARIO
			if(conMaximoRelaciones) { // && this.conFuncionalidadRelaciones) {
				if(!this.conCargarMinimo) {
					if(cargarRelaciones 
						//&& pagosautomaticosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pagosautomaticosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPagosAutomaticos= new GridBagConstraints();
						this.gridBagConstraintsPagosAutomaticos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPagosAutomaticos.gridx = 0;
						this.jContentPaneDetallePagosAutomaticos.add(this.jTabbedPaneRelacionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPagosAutomaticos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPagosAutomaticos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
					this.gridBagConstraintsPagosAutomaticos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPagosAutomaticos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPagosAutomaticos.gridx = 0;
					
				
					this.jContentPaneDetallePagosAutomaticos.add(jPanelCamposOcultosPagosAutomaticos, gridBagConstraintsPagosAutomaticos);
				
					this.jPanelCamposOcultosPagosAutomaticos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	        this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePagosAutomaticos.add(this.jPanelAccionesFormularioPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);							
			
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
	        this.gridBagConstraintsPagosAutomaticos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPagosAutomaticos.gridx = 0;
	        
			
			this.jContentPaneDetallePagosAutomaticos.add(this.jPanelAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPagosAutomaticos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPagosAutomaticos=   new JScrollPane(this.jPanelCamposPagosAutomaticos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosAutomaticos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutomaticos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutomaticos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;
			this.gridBagConstraintsPagosAutomaticos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPagosAutomaticos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPagosAutomaticos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);			
			
			this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
			this.gridBagConstraintsPagosAutomaticos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutomaticos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
			
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		
			
		this.gridBagConstraintsPagosAutomaticos = new GridBagConstraints();
		this.gridBagConstraintsPagosAutomaticos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutomaticos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosAutomaticos, this.gridBagConstraintsPagosAutomaticos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPagosAutomaticos;//jContentPane;
		
		return jScrollPanelDatosEdicionPagosAutomaticos;
    } 
	
		
	
	
	
	
	
	
	
	
	/*
	case "CONTROL_BUSQUEDA":
		sKeyName="F3";
	case "CONTROL_BUSCAR":
		sKeyName="F4";
	case "CONTROL_ARBOL":
		sKeyName="F5";
	case "CONTROL_ACTUALIZAR":
		sKeyName="F6";
	sKeyName="N";					
	*/
}
