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
import com.bydan.erp.tesoreria.util.report.PagosAutorizadosConstantesFunciones;

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
public class PagosAutorizadosDetalleFormJInternalFrame extends PagosAutorizadosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetallePagosAutorizados;
	
	protected JMenuBar jmenuBarDetallePagosAutorizados;
	
	protected JMenu jmenuDetallePagosAutorizados;
	protected JMenu jmenuDetalleArchivoPagosAutorizados;
	protected JMenu jmenuDetalleAccionesPagosAutorizados;
	protected JMenu jmenuDetalleDatosPagosAutorizados;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetallePagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutPagosAutorizados;	
	protected GridBagConstraints gridBagConstraintsPagosAutorizados;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected PagosAutorizadosBeanSwingJInternalFrameAdditional jInternalFrameDetallePagosAutorizados;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public PagosAutorizadosSessionBean pagosautorizadosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public PagosAutorizadosLogic pagosautorizadosLogic;
	
	public JScrollPane jScrollPanelDatosPagosAutorizados;
	public JScrollPane jScrollPanelDatosEdicionPagosAutorizados;
	public JScrollPane jScrollPanelDatosGeneralPagosAutorizados;
	
	protected JPanel jPanelCamposPagosAutorizados;    
	protected JPanel jPanelCamposOcultosPagosAutorizados;    	
	protected JPanel jPanelAccionesPagosAutorizados;
	protected JPanel jPanelAccionesFormularioPagosAutorizados;
    
	
	
	protected Integer iXPanelCamposPagosAutorizados=0;
	protected Integer iYPanelCamposPagosAutorizados=0;
	
	protected Integer iXPanelCamposOcultosPagosAutorizados=0;
	protected Integer iYPanelCamposOcultosPagosAutorizados=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoPagosAutorizados;
	public JButton jButtonModificarPagosAutorizados;
	public JButton jButtonActualizarPagosAutorizados;
    public JButton jButtonEliminarPagosAutorizados;
	public JButton jButtonCancelarPagosAutorizados;
    public JButton jButtonGuardarCambiosPagosAutorizados;
	public JButton jButtonGuardarCambiosTablaPagosAutorizados;
	protected JButton jButtonCerrarPagosAutorizados;
	
	
	protected JButton jButtonProcesarInformacionPagosAutorizados;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoPagosAutorizados;
	protected JCheckBox jCheckBoxPostAccionSinCerrarPagosAutorizados;
	protected JCheckBox jCheckBoxPostAccionSinMensajePagosAutorizados;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarPagosAutorizados;
	protected JButton jButtonModificarToolBarPagosAutorizados;
	protected JButton jButtonActualizarToolBarPagosAutorizados;
    protected JButton jButtonEliminarToolBarPagosAutorizados;
	protected JButton jButtonCancelarToolBarPagosAutorizados;
    protected JButton jButtonGuardarCambiosToolBarPagosAutorizados;
	protected JButton jButtonGuardarCambiosTablaToolBarPagosAutorizados;
	protected JButton jButtonMostrarOcultarTablaToolBarPagosAutorizados;
	protected JButton jButtonCerrarToolBarPagosAutorizados;
	
	protected JButton jButtonProcesarInformacionToolBarPagosAutorizados;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoPagosAutorizados;
	protected JMenuItem jMenuItemModificarPagosAutorizados;
	protected JMenuItem jMenuItemActualizarPagosAutorizados;
    protected JMenuItem jMenuItemEliminarPagosAutorizados;
	protected JMenuItem jMenuItemCancelarPagosAutorizados;
    protected JMenuItem jMenuItemGuardarCambiosPagosAutorizados;
	protected JMenuItem jMenuItemGuardarCambiosTablaPagosAutorizados;
	protected JMenuItem jMenuItemCerrarPagosAutorizados;
	protected JMenuItem jMenuItemDetalleCerrarPagosAutorizados;
	protected JMenuItem jMenuItemDetalleMostarOcultarPagosAutorizados;
	
	protected JMenuItem jMenuItemProcesarInformacionPagosAutorizados;
	protected JMenuItem jMenuItemNuevoGuardarCambiosPagosAutorizados;
	protected JMenuItem jMenuItemMostrarOcultarPagosAutorizados;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesPagosAutorizados;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesPagosAutorizados;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesPagosAutorizados;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioPagosAutorizados;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidPagosAutorizados;
	public JLabel jLabelIdPagosAutorizados;
	public JLabel jLabelidPagosAutorizados;
	public JButton jButtonidPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_cortePagosAutorizados;
	public JLabel jLabelfecha_cortePagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_cortePagosAutorizados;

	public JDateChooser jDateChooserfecha_cortePagosAutorizados;
	public JButton jButtonfecha_cortePagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_clientePagosAutorizados;
	public JLabel jLabelnombre_clientePagosAutorizados;
	public JTextArea jTextAreanombre_clientePagosAutorizados;
	public JScrollPane jscrollPanenombre_clientePagosAutorizados;
	public JButton jButtonnombre_clientePagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_facturaPagosAutorizados;
	public JLabel jLabelnumero_facturaPagosAutorizados;
	public JTextField jTextFieldnumero_facturaPagosAutorizados;
	public JButton jButtonnumero_facturaPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionPagosAutorizados;
	public JLabel jLabelfecha_emisionPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_emisionPagosAutorizados;

	public JDateChooser jDateChooserfecha_emisionPagosAutorizados;
	public JButton jButtonfecha_emisionPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoPagosAutorizados;
	public JLabel jLabelfecha_vencimientoPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_vencimientoPagosAutorizados;

	public JDateChooser jDateChooserfecha_vencimientoPagosAutorizados;
	public JButton jButtonfecha_vencimientoPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_bancoPagosAutorizados;
	public JLabel jLabelnombre_bancoPagosAutorizados;
	public JTextArea jTextAreanombre_bancoPagosAutorizados;
	public JScrollPane jscrollPanenombre_bancoPagosAutorizados;
	public JButton jButtonnombre_bancoPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_por_pagarPagosAutorizados;
	public JLabel jLabelvalor_por_pagarPagosAutorizados;
	public JTextField jTextFieldvalor_por_pagarPagosAutorizados;
	public JButton jButtonvalor_por_pagarPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelvalor_canceladoPagosAutorizados;
	public JLabel jLabelvalor_canceladoPagosAutorizados;
	public JTextField jTextFieldvalor_canceladoPagosAutorizados;
	public JButton jButtonvalor_canceladoPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_cuentaPagosAutorizados;
	public JLabel jLabelnumero_cuentaPagosAutorizados;
	public JTextField jTextFieldnumero_cuentaPagosAutorizados;
	public JButton jButtonnumero_cuentaPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelesta_autorizadoPagosAutorizados;
	public JLabel jLabelesta_autorizadoPagosAutorizados;
	public JCheckBox jCheckBoxesta_autorizadoPagosAutorizados;
	public JButton jButtonesta_autorizadoPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionPagosAutorizados;
	public JLabel jLabeldescripcionPagosAutorizados;
	public JTextArea jTextAreadescripcionPagosAutorizados;
	public JScrollPane jscrollPanedescripcionPagosAutorizados;
	public JButton jButtondescripcionPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_corte_datoPagosAutorizados;
	public JLabel jLabelfecha_corte_datoPagosAutorizados;
	//public JFormattedTextField jDateChooserfecha_corte_datoPagosAutorizados;

	public JDateChooser jDateChooserfecha_corte_datoPagosAutorizados;
	public JButton jButtonfecha_corte_datoPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelestadoPagosAutorizados;
	public JLabel jLabelestadoPagosAutorizados;
	public JTextArea jTextAreaestadoPagosAutorizados;
	public JScrollPane jscrollPaneestadoPagosAutorizados;
	public JButton jButtonestadoPagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_con_clientePagosAutorizados;
	public JLabel jLabelcodigo_cuenta_con_clientePagosAutorizados;
	public JTextField jTextFieldcodigo_cuenta_con_clientePagosAutorizados;
	public JButton jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda= new JButtonMe();

	public JPanel jPanelcodigo_cuenta_con_bancoPagosAutorizados;
	public JLabel jLabelcodigo_cuenta_con_bancoPagosAutorizados;
	public JTextField jTextFieldcodigo_cuenta_con_bancoPagosAutorizados;
	public JButton jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaPagosAutorizados;
	public JLabel jLabelid_empresaPagosAutorizados;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaPagosAutorizados;
	public JButton jButtonid_empresaPagosAutorizados= new JButtonMe();
	public JButton jButtonid_empresaPagosAutorizadosUpdate= new JButtonMe();
	public JButton jButtonid_empresaPagosAutorizadosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesPagosAutorizados;
	
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
	
	public PagosAutorizadosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposPagosAutorizados=new JPanel();
				this.jPanelAccionesFormularioPagosAutorizados=new JPanel();
				this.jmenuBarDetallePagosAutorizados=new JMenuBar();
				this.jTtoolBarDetallePagosAutorizados=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public PagosAutorizadosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public PagosAutorizadosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("PagosAutorizados No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarPagosAutorizados() {
		return this.jButtonActualizarToolBarPagosAutorizados;
	}
	
	public JButton getjButtonEliminarToolBarPagosAutorizados() {
		return this.jButtonEliminarToolBarPagosAutorizados;
	}
	
	public JButton getjButtonCancelarToolBarPagosAutorizados() {
		return this.jButtonCancelarToolBarPagosAutorizados;
	}		
	
	public JButton getjButtonProcesarInformacionPagosAutorizados() {
		return this.jButtonProcesarInformacionPagosAutorizados;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionPagosAutorizados)	{
		this.jButtonProcesarInformacionPagosAutorizados = jButtonProcesarInformacionPagosAutorizados;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesPagosAutorizados() {
		return this.jComboBoxTiposAccionesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesPagosAutorizados(
			JComboBox jComboBoxTiposRelacionesPagosAutorizados) {
		this.jComboBoxTiposRelacionesPagosAutorizados = jComboBoxTiposRelacionesPagosAutorizados;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesPagosAutorizados(
			JComboBox jComboBoxTiposAccionesPagosAutorizados) {
		this.jComboBoxTiposAccionesPagosAutorizados = jComboBoxTiposAccionesPagosAutorizados;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioPagosAutorizados() {
		return this.jComboBoxTiposAccionesFormularioPagosAutorizados;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioPagosAutorizados(
			JComboBox jComboBoxTiposAccionesFormularioPagosAutorizados) {
		this.jComboBoxTiposAccionesFormularioPagosAutorizados = jComboBoxTiposAccionesFormularioPagosAutorizados;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.pagosautorizadosSessionBean=new PagosAutorizadosSessionBean();
		
		this.pagosautorizadosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.pagosautorizadosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.pagosautorizadosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		PagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		PagosAutorizadosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		PagosAutorizadosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Pagos Autorizados MANTENIMIENTO"));
		
		
		if(iWidth > 1750) {
			iWidth=1750;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
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
	
		PagosAutorizadosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetallePagosAutorizados= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarPagosAutorizados=new JButtonMe();
				this.jButtonModificarToolBarPagosAutorizados=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarPagosAutorizados,this.jTtoolBarDetallePagosAutorizados,
							"actualizar","actualizar","Actualizar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarPagosAutorizados,this.jTtoolBarDetallePagosAutorizados,
							"eliminar","eliminar","Eliminar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarPagosAutorizados,this.jTtoolBarDetallePagosAutorizados,
							"cancelar","cancelar","Cancelar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarPagosAutorizados=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarPagosAutorizados,this.jTtoolBarDetallePagosAutorizados,
							"guardarcambios","guardarcambios","Guardar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetallePagosAutorizados=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetallePagosAutorizados=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoPagosAutorizados=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesPagosAutorizados=new JMenuMe("Acciones");
		this.jmenuDetalleDatosPagosAutorizados=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoPagosAutorizados= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoPagosAutorizados.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoPagosAutorizados,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarPagosAutorizados= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarPagosAutorizados.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarPagosAutorizados,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarPagosAutorizados= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarPagosAutorizados.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarPagosAutorizados,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarPagosAutorizados= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarPagosAutorizados.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarPagosAutorizados,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarPagosAutorizados= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarPagosAutorizados.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarPagosAutorizados,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosPagosAutorizados= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosPagosAutorizados.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosPagosAutorizados,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarPagosAutorizados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarPagosAutorizados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarPagosAutorizados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarPagosAutorizados= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarPagosAutorizados.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarPagosAutorizados,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarPagosAutorizados= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarPagosAutorizados.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarPagosAutorizados,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoPagosAutorizados.add(this.jMenuItemDetalleCerrarPagosAutorizados);
		
		this.jmenuDetalleAccionesPagosAutorizados.add(this.jMenuItemActualizarPagosAutorizados);
		this.jmenuDetalleAccionesPagosAutorizados.add(this.jMenuItemEliminarPagosAutorizados);
		this.jmenuDetalleAccionesPagosAutorizados.add(this.jMenuItemCancelarPagosAutorizados);		
		
		//this.jmenuDetalleDatosPagosAutorizados.add(this.jMenuItemDetalleAbrirOrderByPagosAutorizados);				
		this.jmenuDetalleDatosPagosAutorizados.add(this.jMenuItemDetalleMostarOcultarPagosAutorizados);				
				
		//this.jmenuDetalleAccionesPagosAutorizados.add(this.jMenuItemGuardarCambiosPagosAutorizados);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetallePagosAutorizados.add(this.jmenuDetalleArchivoPagosAutorizados);		
		this.jmenuBarDetallePagosAutorizados.add(this.jmenuDetalleAccionesPagosAutorizados);		
		this.jmenuBarDetallePagosAutorizados.add(this.jmenuDetalleDatosPagosAutorizados);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetallePagosAutorizados);				
	}
	
	
	public void inicializarElementosCamposPagosAutorizados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdPagosAutorizados = new JLabelMe();
		jLabelIdPagosAutorizados.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidPagosAutorizados = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutPagosAutorizados= new GridBagLayout();

		this.jPanelidPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);

		jLabelidPagosAutorizados = new JLabel();
		jLabelidPagosAutorizados.setText("Id");

		jLabelidPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_cortePagosAutorizados = new JLabelMe();
		this.jLabelfecha_cortePagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0+" : *");
		this.jLabelfecha_cortePagosAutorizados.setToolTipText("Fecha Corte Base");
		this.jLabelfecha_cortePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_cortePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_cortePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_cortePagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_cortePagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_cortePagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE0);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelfecha_cortePagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		//jFormattedTextFieldfecha_cortePagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfecha_cortePagosAutorizados= new JDateChooser();
		jDateChooserfecha_cortePagosAutorizados.setEnabled(false);
		jDateChooserfecha_cortePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_cortePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_cortePagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_cortePagosAutorizados.setDate(new Date());
		jDateChooserfecha_cortePagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_cortePagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_cortePagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfecha_cortePagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_cortePagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_cortePagosAutorizadosBusqueda.setText("U");
		this.jButtonfecha_cortePagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_cortePagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_cortePagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_cortePagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_cortePagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_cortePagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_cortePagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_clientePagosAutorizados = new JLabelMe();
		this.jLabelnombre_clientePagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE+" : *");
		this.jLabelnombre_clientePagosAutorizados.setToolTipText("Nombre Cliente");
		this.jLabelnombre_clientePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_clientePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_clientePagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_clientePagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_clientePagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_NOMBRECLIENTE);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelnombre_clientePagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextAreanombre_clientePagosAutorizados= new JTextAreaMe();
		jTextAreanombre_clientePagosAutorizados.setEnabled(false);
		jTextAreanombre_clientePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_clientePagosAutorizados.setLineWrap(true);
		jTextAreanombre_clientePagosAutorizados.setWrapStyleWord(true);
		jTextAreanombre_clientePagosAutorizados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_clientePagosAutorizados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_clientePagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_clientePagosAutorizados = new JScrollPane(jTextAreanombre_clientePagosAutorizados);
		jscrollPanenombre_clientePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clientePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_clientePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_clientePagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnombre_clientePagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_clientePagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_clientePagosAutorizadosBusqueda.setText("U");
		this.jButtonnombre_clientePagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_clientePagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_clientePagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_clientePagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_clientePagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_clientePagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_clientePagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_facturaPagosAutorizados = new JLabelMe();
		this.jLabelnumero_facturaPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA+" : *");
		this.jLabelnumero_facturaPagosAutorizados.setToolTipText("Numero Factura");
		this.jLabelnumero_facturaPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_facturaPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_facturaPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_facturaPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_facturaPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_NUMEROFACTURA);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelnumero_facturaPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextFieldnumero_facturaPagosAutorizados= new JTextFieldMe();

		jTextFieldnumero_facturaPagosAutorizados.setEnabled(false);
		jTextFieldnumero_facturaPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_facturaPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_facturaPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_facturaPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnumero_facturaPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_facturaPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_facturaPagosAutorizadosBusqueda.setText("U");
		this.jButtonnumero_facturaPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_facturaPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_facturaPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_facturaPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_facturaPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_facturaPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_facturaPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionPagosAutorizados = new JLabelMe();
		this.jLabelfecha_emisionPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionPagosAutorizados.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelfecha_emisionPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		//jFormattedTextFieldfecha_emisionPagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionPagosAutorizados= new JDateChooser();
		jDateChooserfecha_emisionPagosAutorizados.setEnabled(false);
		jDateChooserfecha_emisionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionPagosAutorizados.setDate(new Date());
		jDateChooserfecha_emisionPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionPagosAutorizadosBusqueda.setText("U");
		this.jButtonfecha_emisionPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoPagosAutorizados = new JLabelMe();
		this.jLabelfecha_vencimientoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoPagosAutorizados.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelfecha_vencimientoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		//jFormattedTextFieldfecha_vencimientoPagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoPagosAutorizados= new JDateChooser();
		jDateChooserfecha_vencimientoPagosAutorizados.setEnabled(false);
		jDateChooserfecha_vencimientoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoPagosAutorizados.setDate(new Date());
		jDateChooserfecha_vencimientoPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setText("U");
		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_bancoPagosAutorizados = new JLabelMe();
		this.jLabelnombre_bancoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO+" : *");
		this.jLabelnombre_bancoPagosAutorizados.setToolTipText("Nombre Banco");
		this.jLabelnombre_bancoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_bancoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_bancoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_bancoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_bancoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_NOMBREBANCO);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelnombre_bancoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextAreanombre_bancoPagosAutorizados= new JTextAreaMe();
		jTextAreanombre_bancoPagosAutorizados.setEnabled(false);
		jTextAreanombre_bancoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_bancoPagosAutorizados.setLineWrap(true);
		jTextAreanombre_bancoPagosAutorizados.setWrapStyleWord(true);
		jTextAreanombre_bancoPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_bancoPagosAutorizados.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_bancoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_bancoPagosAutorizados = new JScrollPane(jTextAreanombre_bancoPagosAutorizados);
		jscrollPanenombre_bancoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_bancoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_bancoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnombre_bancoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_bancoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_bancoPagosAutorizadosBusqueda.setText("U");
		this.jButtonnombre_bancoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_bancoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_bancoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_bancoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_bancoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_bancoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_bancoPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_por_pagarPagosAutorizados = new JLabelMe();
		this.jLabelvalor_por_pagarPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR+" : *");
		this.jLabelvalor_por_pagarPagosAutorizados.setToolTipText("Valor Por Pagar");
		this.jLabelvalor_por_pagarPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_por_pagarPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_por_pagarPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_por_pagarPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_por_pagarPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_por_pagarPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_VALORPORPAGAR);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelvalor_por_pagarPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextFieldvalor_por_pagarPagosAutorizados= new JTextFieldMe();
		jTextFieldvalor_por_pagarPagosAutorizados.setEnabled(false);
		jTextFieldvalor_por_pagarPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_por_pagarPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_por_pagarPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_por_pagarPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_por_pagarPagosAutorizados.setText("0.0");

		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setText("U");
		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_por_pagarPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_por_pagarPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_por_pagarPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_por_pagarPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_por_pagarPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelvalor_canceladoPagosAutorizados = new JLabelMe();
		this.jLabelvalor_canceladoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO+" : *");
		this.jLabelvalor_canceladoPagosAutorizados.setToolTipText("Valor Cancelado");
		this.jLabelvalor_canceladoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelvalor_canceladoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelvalor_canceladoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalor_canceladoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalor_canceladoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_VALORCANCELADO);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelvalor_canceladoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextFieldvalor_canceladoPagosAutorizados= new JTextFieldMe();
		jTextFieldvalor_canceladoPagosAutorizados.setEnabled(false);
		jTextFieldvalor_canceladoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalor_canceladoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalor_canceladoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalor_canceladoPagosAutorizados.setText("0.0");

		this.jButtonvalor_canceladoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setText("U");
		this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalor_canceladoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalor_canceladoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalor_canceladoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valor_canceladoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalor_canceladoPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_cuentaPagosAutorizados = new JLabelMe();
		this.jLabelnumero_cuentaPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA+" : *");
		this.jLabelnumero_cuentaPagosAutorizados.setToolTipText("Numero Cuenta");
		this.jLabelnumero_cuentaPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_cuentaPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_cuentaPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_cuentaPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_cuentaPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_NUMEROCUENTA);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelnumero_cuentaPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextFieldnumero_cuentaPagosAutorizados= new JTextFieldMe();

		jTextFieldnumero_cuentaPagosAutorizados.setEnabled(false);
		jTextFieldnumero_cuentaPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_cuentaPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_cuentaPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_cuentaPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setText("U");
		this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_cuentaPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_cuentaPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_cuentaPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_cuentaPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_cuentaPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelesta_autorizadoPagosAutorizados = new JLabelMe();
		this.jLabelesta_autorizadoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO+" : *");
		this.jLabelesta_autorizadoPagosAutorizados.setToolTipText("Esta Autorizado");
		this.jLabelesta_autorizadoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_autorizadoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelesta_autorizadoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_autorizadoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_autorizadoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_autorizadoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_ESTAAUTORIZADO);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelesta_autorizadoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jCheckBoxesta_autorizadoPagosAutorizados= new JCheckBoxMe();
		jCheckBoxesta_autorizadoPagosAutorizados.setEnabled(false);

		jCheckBoxesta_autorizadoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_autorizadoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_autorizadoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_autorizadoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_autorizadoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setText("U");
		this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_autorizadoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_autorizadoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_autorizadoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_autorizadoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_autorizadoPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionPagosAutorizados = new JLabelMe();
		this.jLabeldescripcionPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionPagosAutorizados.setToolTipText("Descripcion");
		this.jLabeldescripcionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPaneldescripcionPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextAreadescripcionPagosAutorizados= new JTextAreaMe();
		jTextAreadescripcionPagosAutorizados.setEnabled(false);
		jTextAreadescripcionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionPagosAutorizados.setLineWrap(true);
		jTextAreadescripcionPagosAutorizados.setWrapStyleWord(true);
		jTextAreadescripcionPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionPagosAutorizados.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionPagosAutorizados = new JScrollPane(jTextAreadescripcionPagosAutorizados);
		jscrollPanedescripcionPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPanedescripcionPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtondescripcionPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtondescripcionPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionPagosAutorizadosBusqueda.setText("U");
		this.jButtondescripcionPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_corte_datoPagosAutorizados = new JLabelMe();
		this.jLabelfecha_corte_datoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE+" : *");
		this.jLabelfecha_corte_datoPagosAutorizados.setToolTipText("Fecha Corte");
		this.jLabelfecha_corte_datoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_corte_datoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_corte_datoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_corte_datoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_corte_datoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_corte_datoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_FECHACORTE);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelfecha_corte_datoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		//jFormattedTextFieldfecha_corte_datoPagosAutorizados= new JFormattedTextFieldMe();

		jDateChooserfecha_corte_datoPagosAutorizados= new JDateChooser();
		jDateChooserfecha_corte_datoPagosAutorizados.setEnabled(false);
		jDateChooserfecha_corte_datoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corte_datoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_corte_datoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_corte_datoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_corte_datoPagosAutorizados.setDate(new Date());
		jDateChooserfecha_corte_datoPagosAutorizados.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_corte_datoPagosAutorizados.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setText("U");
		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_corte_datoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_corte_datoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_corte_datoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_corte_datoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_corte_datoPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelestadoPagosAutorizados = new JLabelMe();
		this.jLabelestadoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_ESTADO+" : *");
		this.jLabelestadoPagosAutorizados.setToolTipText("Estado");
		this.jLabelestadoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelestadoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelestadoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelestadoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelestadoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_ESTADO);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelestadoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextAreaestadoPagosAutorizados= new JTextAreaMe();
		jTextAreaestadoPagosAutorizados.setEnabled(false);
		jTextAreaestadoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaestadoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaestadoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaestadoPagosAutorizados.setLineWrap(true);
		jTextAreaestadoPagosAutorizados.setWrapStyleWord(true);
		jTextAreaestadoPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaestadoPagosAutorizados.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreaestadoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneestadoPagosAutorizados = new JScrollPane(jTextAreaestadoPagosAutorizados);
		jscrollPaneestadoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneestadoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneestadoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonestadoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonestadoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonestadoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonestadoPagosAutorizadosBusqueda.setText("U");
		this.jButtonestadoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonestadoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonestadoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaestadoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaestadoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"estadoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonestadoPagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_con_clientePagosAutorizados = new JLabelMe();
		this.jLabelcodigo_cuenta_con_clientePagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE+" : *");
		this.jLabelcodigo_cuenta_con_clientePagosAutorizados.setToolTipText("Codigo Cuenta Con Cliente");
		this.jLabelcodigo_cuenta_con_clientePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_clientePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_clientePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_con_clientePagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_con_clientePagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_con_clientePagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONCLIENTE);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelcodigo_cuenta_con_clientePagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextFieldcodigo_cuenta_con_clientePagosAutorizados= new JTextFieldMe();

		jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setEnabled(false);
		jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_clientePagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_con_clientePagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setText("U");
		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_con_clientePagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_con_clientePagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_con_clientePagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda.setVisible(false);		}


					
		this.jLabelcodigo_cuenta_con_bancoPagosAutorizados = new JLabelMe();
		this.jLabelcodigo_cuenta_con_bancoPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO+" : *");
		this.jLabelcodigo_cuenta_con_bancoPagosAutorizados.setToolTipText("Codigo Cuenta Con Banco");
		this.jLabelcodigo_cuenta_con_bancoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_bancoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelcodigo_cuenta_con_bancoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigo_cuenta_con_bancoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigo_cuenta_con_bancoPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigo_cuenta_con_bancoPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_CODIGOCUENTACONBANCO);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelcodigo_cuenta_con_bancoPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados= new JTextFieldMe();

		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setEnabled(false);
		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigo_cuenta_con_bancoPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setText("U");
		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigo_cuenta_con_bancoPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigo_cuenta_con_bancoPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysPagosAutorizados() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaPagosAutorizados = new JLabelMe();
		this.jLabelid_empresaPagosAutorizados.setText(""+PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaPagosAutorizados.setToolTipText("Empresa");
		this.jLabelid_empresaPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaPagosAutorizados=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaPagosAutorizados.setToolTipText(PagosAutorizadosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutPagosAutorizados = new GridBagLayout();
		this.jPanelid_empresaPagosAutorizados.setLayout(this.gridaBagLayoutPagosAutorizados);


		jComboBoxid_empresaPagosAutorizados= new JComboBoxMe();
		jComboBoxid_empresaPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaPagosAutorizados.setEnabled(false);

		this.jButtonid_empresaPagosAutorizados= new JButtonMe();
		this.jButtonid_empresaPagosAutorizados.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutorizados.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutorizados.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaPagosAutorizados.setText("Buscar");
		this.jButtonid_empresaPagosAutorizados.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaPagosAutorizados.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutorizados,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutorizados"));

		this.jButtonid_empresaPagosAutorizadosBusqueda= new JButtonMe();
		this.jButtonid_empresaPagosAutorizadosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosAutorizadosBusqueda.setText("U");
		this.jButtonid_empresaPagosAutorizadosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaPagosAutorizadosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutorizadosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutorizadosBusqueda"));

		if(this.pagosautorizadosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaPagosAutorizadosBusqueda.setVisible(false);		}

		this.jButtonid_empresaPagosAutorizadosUpdate= new JButtonMe();
		this.jButtonid_empresaPagosAutorizadosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaPagosAutorizadosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaPagosAutorizadosUpdate.setText("U");
		this.jButtonid_empresaPagosAutorizadosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaPagosAutorizadosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaPagosAutorizadosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaPagosAutorizados.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaPagosAutorizados.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaPagosAutorizadosUpdate"));



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
		//this.jInternalFrameDetallePagosAutorizados = new PagosAutorizadosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Pagos Autorizados DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutPagosAutorizados= new GridBagLayout();
		

		
		String sToolTipPagosAutorizados="";
		sToolTipPagosAutorizados=PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipPagosAutorizados+="(Tesoreria.PagosAutorizados)";
		}
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			sToolTipPagosAutorizados+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoPagosAutorizados = new JButtonMe();
		this.jButtonModificarPagosAutorizados = new JButtonMe();
        this.jButtonActualizarPagosAutorizados = new JButtonMe();
        this.jButtonEliminarPagosAutorizados = new JButtonMe();
        this.jButtonCancelarPagosAutorizados = new JButtonMe();
        this.jButtonGuardarCambiosPagosAutorizados = new JButtonMe();
		this.jButtonGuardarCambiosTablaPagosAutorizados = new JButtonMe();
		this.jButtonCerrarPagosAutorizados = new JButtonMe();
		
		this.jScrollPanelDatosPagosAutorizados = new JScrollPane();   
        this.jScrollPanelDatosEdicionPagosAutorizados = new JScrollPane();
		this.jScrollPanelDatosGeneralPagosAutorizados = new JScrollPane();
				
		
		
		this.jPanelCamposPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioPagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Pagos Autorizados";
		
		if(!this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Pagos Autorizadoses" + this.sPath));
		} else {
			this.jScrollPanelDatosPagosAutorizados.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposPagosAutorizados.setName("jPanelCamposPagosAutorizados"); 

		this.jPanelCamposOcultosPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosPagosAutorizados.setName("jPanelCamposOcultosPagosAutorizados"); 

        this.jPanelAccionesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesPagosAutorizados.setToolTipText("Acciones");
        this.jPanelAccionesPagosAutorizados.setName("Acciones"); 

		this.jPanelAccionesFormularioPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioPagosAutorizados.setToolTipText("Acciones");
        this.jPanelAccionesFormularioPagosAutorizados.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoPagosAutorizados.setText("Nuevo");
		this.jButtonModificarPagosAutorizados.setText("Editar");
        this.jButtonActualizarPagosAutorizados.setText("Actualizar");
        this.jButtonEliminarPagosAutorizados.setText("Eliminar");
        this.jButtonCancelarPagosAutorizados.setText("Cancelar");
        this.jButtonGuardarCambiosPagosAutorizados.setText("Guardar");
		this.jButtonGuardarCambiosTablaPagosAutorizados.setText("Guardar");
		this.jButtonCerrarPagosAutorizados.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoPagosAutorizados,"nuevo_button","Nuevo",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarPagosAutorizados,"modificar_button","Editar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarPagosAutorizados,"actualizar_button","Actualizar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarPagosAutorizados,"eliminar_button","Eliminar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarPagosAutorizados,"cancelar_button","Cancelar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosPagosAutorizados,"guardarcambios_button","Guardar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaPagosAutorizados,"guardarcambiostabla_button","Guardar",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarPagosAutorizados,"cerrar_button","Salir",this.pagosautorizadosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoPagosAutorizados.setToolTipText("Nuevo"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarPagosAutorizados.setToolTipText("Editar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarPagosAutorizados.setToolTipText("Actualizar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarPagosAutorizados.setToolTipText("Eliminar)"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarPagosAutorizados.setToolTipText("Cancelar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosPagosAutorizados.setToolTipText("Guardar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaPagosAutorizados.setToolTipText("Guardar"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarPagosAutorizados.setToolTipText("Salir"+" "+PagosAutorizadosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoPagosAutorizados";
		inputMap = this.jButtonNuevoPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoPagosAutorizados.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoPagosAutorizados"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarPagosAutorizados";
		inputMap = this.jButtonActualizarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarPagosAutorizados"));
		
		//ELIMINAR
		sMapKey = "EliminarPagosAutorizados";
		inputMap = this.jButtonEliminarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarPagosAutorizados"));
		
		//CANCELAR	
		sMapKey = "CancelarPagosAutorizados";
		inputMap = this.jButtonCancelarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarPagosAutorizados"));
		
		//CERRAR		
		sMapKey = "CerrarPagosAutorizados";
		inputMap = this.jButtonCerrarPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarPagosAutorizados"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaPagosAutorizados";
		inputMap = this.jButtonGuardarCambiosTablaPagosAutorizados.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaPagosAutorizados.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaPagosAutorizados"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoPagosAutorizados.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoPagosAutorizados.setToolTipText("Nuevo PagosAutorizados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarPagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarPagosAutorizados.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarPagosAutorizados.setToolTipText("Sin Cerrar Ventana PagosAutorizados");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajePagosAutorizados = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajePagosAutorizados.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajePagosAutorizados.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajePagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesPagosAutorizados.setText("Accion");
		this.jComboBoxTiposAccionesPagosAutorizados.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioPagosAutorizados = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioPagosAutorizados.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioPagosAutorizados.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesPagosAutorizados = new JLabelMe();
		
		this.jLabelAccionesPagosAutorizados.setText("Acciones");		
		this.jLabelAccionesPagosAutorizados.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizados.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesPagosAutorizados.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposPagosAutorizados();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysPagosAutorizados();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesPagosAutorizados=new JTabbedPane();
		this.jTabbedPaneRelacionesPagosAutorizados.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesPagosAutorizados,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesPagosAutorizados.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizados.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesPagosAutorizados.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesPagosAutorizados, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioPagosAutorizados.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosAutorizados.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioPagosAutorizados.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioPagosAutorizados, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposPagosAutorizados = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosPagosAutorizados = new GridBagLayout();
		
		this.jPanelCamposPagosAutorizados.setLayout(gridaBagLayoutCamposPagosAutorizados);
		this.jPanelCamposOcultosPagosAutorizados.setLayout(gridaBagLayoutCamposOcultosPagosAutorizados);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidPagosAutorizados.add(jLabelIdPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidPagosAutorizados.add(jLabelidPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaPagosAutorizados.add(jLabelid_empresaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosAutorizados.add(jButtonid_empresaPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 3;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaPagosAutorizados.add(jButtonid_empresaPagosAutorizadosUpdate, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaPagosAutorizados.add(jComboBoxid_empresaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_cortePagosAutorizados.add(jLabelfecha_cortePagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_cortePagosAutorizados.add(jButtonfecha_cortePagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_cortePagosAutorizados.add(jDateChooserfecha_cortePagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_clientePagosAutorizados.add(jLabelnombre_clientePagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_clientePagosAutorizados.add(jButtonnombre_clientePagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_clientePagosAutorizados.add(jscrollPanenombre_clientePagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_facturaPagosAutorizados.add(jLabelnumero_facturaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_facturaPagosAutorizados.add(jButtonnumero_facturaPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_facturaPagosAutorizados.add(jTextFieldnumero_facturaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionPagosAutorizados.add(jLabelfecha_emisionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionPagosAutorizados.add(jButtonfecha_emisionPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionPagosAutorizados.add(jDateChooserfecha_emisionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoPagosAutorizados.add(jLabelfecha_vencimientoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoPagosAutorizados.add(jButtonfecha_vencimientoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoPagosAutorizados.add(jDateChooserfecha_vencimientoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_bancoPagosAutorizados.add(jLabelnombre_bancoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_bancoPagosAutorizados.add(jButtonnombre_bancoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_bancoPagosAutorizados.add(jscrollPanenombre_bancoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_por_pagarPagosAutorizados.add(jLabelvalor_por_pagarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_por_pagarPagosAutorizados.add(jButtonvalor_por_pagarPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_por_pagarPagosAutorizados.add(jTextFieldvalor_por_pagarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalor_canceladoPagosAutorizados.add(jLabelvalor_canceladoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalor_canceladoPagosAutorizados.add(jButtonvalor_canceladoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalor_canceladoPagosAutorizados.add(jTextFieldvalor_canceladoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_cuentaPagosAutorizados.add(jLabelnumero_cuentaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_cuentaPagosAutorizados.add(jButtonnumero_cuentaPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_cuentaPagosAutorizados.add(jTextFieldnumero_cuentaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_autorizadoPagosAutorizados.add(jLabelesta_autorizadoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_autorizadoPagosAutorizados.add(jButtonesta_autorizadoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_autorizadoPagosAutorizados.add(jCheckBoxesta_autorizadoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionPagosAutorizados.add(jLabeldescripcionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionPagosAutorizados.add(jButtondescripcionPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionPagosAutorizados.add(jscrollPanedescripcionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_corte_datoPagosAutorizados.add(jLabelfecha_corte_datoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_corte_datoPagosAutorizados.add(jButtonfecha_corte_datoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_corte_datoPagosAutorizados.add(jDateChooserfecha_corte_datoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelestadoPagosAutorizados.add(jLabelestadoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelestadoPagosAutorizados.add(jButtonestadoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelestadoPagosAutorizados.add(jscrollPaneestadoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_con_clientePagosAutorizados.add(jLabelcodigo_cuenta_con_clientePagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_con_clientePagosAutorizados.add(jButtoncodigo_cuenta_con_clientePagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_con_clientePagosAutorizados.add(jTextFieldcodigo_cuenta_con_clientePagosAutorizados, this.gridBagConstraintsPagosAutorizados);


	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 0;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigo_cuenta_con_bancoPagosAutorizados.add(jLabelcodigo_cuenta_con_bancoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		//this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = 2;
		this.gridBagConstraintsPagosAutorizados.ipadx = 0;
		this.gridBagConstraintsPagosAutorizados.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigo_cuenta_con_bancoPagosAutorizados.add(jButtoncodigo_cuenta_con_bancoPagosAutorizadosBusqueda, this.gridBagConstraintsPagosAutorizados);
	}

	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsPagosAutorizados.gridy = 0;
	this.gridBagConstraintsPagosAutorizados.gridx = 1;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigo_cuenta_con_bancoPagosAutorizados.add(jTextFieldcodigo_cuenta_con_bancoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelidPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelfecha_cortePagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelnombre_clientePagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelnumero_facturaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelfecha_emisionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelfecha_vencimientoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelnombre_bancoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelvalor_por_pagarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelvalor_canceladoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelnumero_cuentaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelesta_autorizadoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPaneldescripcionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelfecha_corte_datoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelestadoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelcodigo_cuenta_con_clientePagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposPagosAutorizados.add(this.jPanelcodigo_cuenta_con_bancoPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposPagosAutorizados % 2==0) {
		iXPanelCamposPagosAutorizados=0;
		iYPanelCamposPagosAutorizados++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsPagosAutorizados.gridy = iYPanelCamposOcultosPagosAutorizados;
	this.gridBagConstraintsPagosAutorizados.gridx = iXPanelCamposOcultosPagosAutorizados++;
	this.gridBagConstraintsPagosAutorizados.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsPagosAutorizados.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosPagosAutorizados.add(this.jPanelid_empresaPagosAutorizados, this.gridBagConstraintsPagosAutorizados);



	if(iXPanelCamposOcultosPagosAutorizados % 2==0) {
		iXPanelCamposOcultosPagosAutorizados=0;
		iYPanelCamposOcultosPagosAutorizados++;
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
			
		GridBagLayout gridaBagLayoutAccionesPagosAutorizados= new GridBagLayout();
		this.jPanelAccionesPagosAutorizados.setLayout(gridaBagLayoutAccionesPagosAutorizados);
		
		GridBagLayout gridaBagLayoutAccionesFormularioPagosAutorizados= new GridBagLayout();
		this.jPanelAccionesFormularioPagosAutorizados.setLayout(gridaBagLayoutAccionesFormularioPagosAutorizados);
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsPagosAutorizados.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioPagosAutorizados.add(this.jComboBoxTiposAccionesFormularioPagosAutorizados, this.gridBagConstraintsPagosAutorizados);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccion++;
			
		this.jPanelAccionesPagosAutorizados.add(this.jButtonModificarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);							

		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsPagosAutorizados.gridy = 0;
		this.gridBagConstraintsPagosAutorizados.gridx =iPosXAccion++;
			
		this.jPanelAccionesPagosAutorizados.add(this.jButtonEliminarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = 0;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosAutorizados.add(this.jButtonActualizarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);


		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = 0;		
		this.gridBagConstraintsPagosAutorizados.gridx = iPosXAccion++;
		
		this.jPanelAccionesPagosAutorizados.add(this.jButtonGuardarCambiosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);	
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = 0;		
		this.gridBagConstraintsPagosAutorizados.gridx =iPosXAccion++;
		
		this.jPanelAccionesPagosAutorizados.add(this.jButtonCancelarPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutPagosAutorizados = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutPagosAutorizados);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.pagosautorizadosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();						
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;
			this.gridBagConstraintsPagosAutorizados.gridx = 0;		
			//this.gridBagConstraintsPagosAutorizados.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsPagosAutorizados.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy =iGridyPrincipal++;
		this.gridBagConstraintsPagosAutorizados.gridx =0;
		this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsPagosAutorizados.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(PagosAutorizadosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetallePagosAutorizados = new PagosAutorizadosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Pagos Autorizados DATOS");
			
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
			
	        //this.setTitle("[FOR] - Pagos Autorizados DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Pagos Autorizados Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			PagosAutorizadosModel pagosautorizadosModel=new PagosAutorizadosModel(this);
			
			//SI USARA CLASE INTERNA
			//PagosAutorizadosModel.PagosAutorizadosFocusTraversalPolicy pagosautorizadosFocusTraversalPolicy = pagosautorizadosModel.new PagosAutorizadosFocusTraversalPolicy(this);
			
			//pagosautorizadosFocusTraversalPolicy.setpagosautorizadosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(pagosautorizadosModel);
			
			
			this.jContentPaneDetallePagosAutorizados = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetallePagosAutorizados = new GridBagLayout();	
			this.jContentPaneDetallePagosAutorizados.setLayout(gridaBagLayoutDetallePagosAutorizados);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosPagosAutorizados = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
				this.gridBagConstraintsPagosAutorizados.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsPagosAutorizados.gridx = 0;
					
				
				this.jContentPaneDetallePagosAutorizados.add(jTtoolBarDetallePagosAutorizados, gridBagConstraintsPagosAutorizados);								
				
}
			
			this.jScrollPanelDatosEdicionPagosAutorizados=   new JScrollPane(jContentPaneDetallePagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralPagosAutorizados=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			
			
	        this.gridBagConstraintsPagosAutorizados.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsPagosAutorizados.gridx = 0;
	        
			this.jContentPaneDetallePagosAutorizados.add(jPanelCamposPagosAutorizados, gridBagConstraintsPagosAutorizados);
			
			
			
			
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
						//&& pagosautorizadosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.pagosautorizadosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsPagosAutorizados= new GridBagConstraints();
						this.gridBagConstraintsPagosAutorizados.gridy = iGridyRelaciones++;
						this.gridBagConstraintsPagosAutorizados.gridx = 0;
						this.jContentPaneDetallePagosAutorizados.add(this.jTabbedPaneRelacionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesPagosAutorizados.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosPagosAutorizados.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
					this.gridBagConstraintsPagosAutorizados.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsPagosAutorizados.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsPagosAutorizados.gridx = 0;
					
				
					this.jContentPaneDetallePagosAutorizados.add(jPanelCamposOcultosPagosAutorizados, gridBagConstraintsPagosAutorizados);
				
					this.jPanelCamposOcultosPagosAutorizados.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsPagosAutorizados.gridx = 0;
	        this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetallePagosAutorizados.add(this.jPanelAccionesFormularioPagosAutorizados, this.gridBagConstraintsPagosAutorizados);							
			
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
	        this.gridBagConstraintsPagosAutorizados.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsPagosAutorizados.gridx = 0;
	        
			
			this.jContentPaneDetallePagosAutorizados.add(this.jPanelAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionPagosAutorizados);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionPagosAutorizados=   new JScrollPane(this.jPanelCamposPagosAutorizados,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionPagosAutorizados.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizados.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionPagosAutorizados.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutorizados.gridx = 0;
			this.gridBagConstraintsPagosAutorizados.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsPagosAutorizados.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsPagosAutorizados.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutorizados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioPagosAutorizados, this.gridBagConstraintsPagosAutorizados);			
			
			this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
			this.gridBagConstraintsPagosAutorizados.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsPagosAutorizados.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
			
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		
			
		this.gridBagConstraintsPagosAutorizados = new GridBagConstraints();
		this.gridBagConstraintsPagosAutorizados.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsPagosAutorizados.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesPagosAutorizados, this.gridBagConstraintsPagosAutorizados);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralPagosAutorizados;//jContentPane;
		
		return jScrollPanelDatosEdicionPagosAutorizados;
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
