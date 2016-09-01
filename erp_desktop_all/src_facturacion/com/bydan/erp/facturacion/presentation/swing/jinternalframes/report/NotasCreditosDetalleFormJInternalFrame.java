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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes.report;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//.report;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.report.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.report.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.report.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.report.*;
import com.bydan.erp.facturacion.util.report.NotasCreditosConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.report.*;
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
public class NotasCreditosDetalleFormJInternalFrame extends NotasCreditosBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleNotasCreditos;
	
	protected JMenuBar jmenuBarDetalleNotasCreditos;
	
	protected JMenu jmenuDetalleNotasCreditos;
	protected JMenu jmenuDetalleArchivoNotasCreditos;
	protected JMenu jmenuDetalleAccionesNotasCreditos;
	protected JMenu jmenuDetalleDatosNotasCreditos;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutNotasCreditos;	
	protected GridBagConstraints gridBagConstraintsNotasCreditos;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected NotasCreditosBeanSwingJInternalFrameAdditional jInternalFrameDetalleNotasCreditos;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public NotasCreditosSessionBean notascreditosSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public NotasCreditosLogic notascreditosLogic;
	
	public JScrollPane jScrollPanelDatosNotasCreditos;
	public JScrollPane jScrollPanelDatosEdicionNotasCreditos;
	public JScrollPane jScrollPanelDatosGeneralNotasCreditos;
	
	protected JPanel jPanelCamposNotasCreditos;    
	protected JPanel jPanelCamposOcultosNotasCreditos;    	
	protected JPanel jPanelAccionesNotasCreditos;
	protected JPanel jPanelAccionesFormularioNotasCreditos;
    
	
	
	protected Integer iXPanelCamposNotasCreditos=0;
	protected Integer iYPanelCamposNotasCreditos=0;
	
	protected Integer iXPanelCamposOcultosNotasCreditos=0;
	protected Integer iYPanelCamposOcultosNotasCreditos=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoNotasCreditos;
	public JButton jButtonModificarNotasCreditos;
	public JButton jButtonActualizarNotasCreditos;
    public JButton jButtonEliminarNotasCreditos;
	public JButton jButtonCancelarNotasCreditos;
    public JButton jButtonGuardarCambiosNotasCreditos;
	public JButton jButtonGuardarCambiosTablaNotasCreditos;
	protected JButton jButtonCerrarNotasCreditos;
	
	
	protected JButton jButtonProcesarInformacionNotasCreditos;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoNotasCreditos;
	protected JCheckBox jCheckBoxPostAccionSinCerrarNotasCreditos;
	protected JCheckBox jCheckBoxPostAccionSinMensajeNotasCreditos;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarNotasCreditos;
	protected JButton jButtonModificarToolBarNotasCreditos;
	protected JButton jButtonActualizarToolBarNotasCreditos;
    protected JButton jButtonEliminarToolBarNotasCreditos;
	protected JButton jButtonCancelarToolBarNotasCreditos;
    protected JButton jButtonGuardarCambiosToolBarNotasCreditos;
	protected JButton jButtonGuardarCambiosTablaToolBarNotasCreditos;
	protected JButton jButtonMostrarOcultarTablaToolBarNotasCreditos;
	protected JButton jButtonCerrarToolBarNotasCreditos;
	
	protected JButton jButtonProcesarInformacionToolBarNotasCreditos;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoNotasCreditos;
	protected JMenuItem jMenuItemModificarNotasCreditos;
	protected JMenuItem jMenuItemActualizarNotasCreditos;
    protected JMenuItem jMenuItemEliminarNotasCreditos;
	protected JMenuItem jMenuItemCancelarNotasCreditos;
    protected JMenuItem jMenuItemGuardarCambiosNotasCreditos;
	protected JMenuItem jMenuItemGuardarCambiosTablaNotasCreditos;
	protected JMenuItem jMenuItemCerrarNotasCreditos;
	protected JMenuItem jMenuItemDetalleCerrarNotasCreditos;
	protected JMenuItem jMenuItemDetalleMostarOcultarNotasCreditos;
	
	protected JMenuItem jMenuItemProcesarInformacionNotasCreditos;
	protected JMenuItem jMenuItemNuevoGuardarCambiosNotasCreditos;
	protected JMenuItem jMenuItemMostrarOcultarNotasCreditos;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesNotasCreditos;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesNotasCreditos;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesNotasCreditos;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioNotasCreditos;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidNotasCreditos;
	public JLabel jLabelIdNotasCreditos;
	public JLabel jLabelidNotasCreditos;
	public JButton jButtonidNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_desdeNotasCreditos;
	public JLabel jLabelfecha_emision_desdeNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_emision_desdeNotasCreditos;

	public JDateChooser jDateChooserfecha_emision_desdeNotasCreditos;
	public JButton jButtonfecha_emision_desdeNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emision_hastaNotasCreditos;
	public JLabel jLabelfecha_emision_hastaNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_emision_hastaNotasCreditos;

	public JDateChooser jDateChooserfecha_emision_hastaNotasCreditos;
	public JButton jButtonfecha_emision_hastaNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_completo_clienteNotasCreditos;
	public JLabel jLabelnombre_completo_clienteNotasCreditos;
	public JTextArea jTextAreanombre_completo_clienteNotasCreditos;
	public JScrollPane jscrollPanenombre_completo_clienteNotasCreditos;
	public JButton jButtonnombre_completo_clienteNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impreso_facturaNotasCreditos;
	public JLabel jLabelnumero_pre_impreso_facturaNotasCreditos;
	public JTextField jTextFieldnumero_pre_impreso_facturaNotasCreditos;
	public JButton jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnumero_pre_impresoNotasCreditos;
	public JLabel jLabelnumero_pre_impresoNotasCreditos;
	public JTextField jTextFieldnumero_pre_impresoNotasCreditos;
	public JButton jButtonnumero_pre_impresoNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_emisionNotasCreditos;
	public JLabel jLabelfecha_emisionNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_emisionNotasCreditos;

	public JDateChooser jDateChooserfecha_emisionNotasCreditos;
	public JButton jButtonfecha_emisionNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelfecha_vencimientoNotasCreditos;
	public JLabel jLabelfecha_vencimientoNotasCreditos;
	//public JFormattedTextField jDateChooserfecha_vencimientoNotasCreditos;

	public JDateChooser jDateChooserfecha_vencimientoNotasCreditos;
	public JButton jButtonfecha_vencimientoNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelivaNotasCreditos;
	public JLabel jLabelivaNotasCreditos;
	public JTextField jTextFieldivaNotasCreditos;
	public JButton jButtonivaNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPaneldescuento_valorNotasCreditos;
	public JLabel jLabeldescuento_valorNotasCreditos;
	public JTextField jTextFielddescuento_valorNotasCreditos;
	public JButton jButtondescuento_valorNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelotro_valorNotasCreditos;
	public JLabel jLabelotro_valorNotasCreditos;
	public JTextField jTextFieldotro_valorNotasCreditos;
	public JButton jButtonotro_valorNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelsub_totalNotasCreditos;
	public JLabel jLabelsub_totalNotasCreditos;
	public JTextField jTextFieldsub_totalNotasCreditos;
	public JButton jButtonsub_totalNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPaneltotalNotasCreditos;
	public JLabel jLabeltotalNotasCreditos;
	public JTextField jTextFieldtotalNotasCreditos;
	public JButton jButtontotalNotasCreditosBusqueda= new JButtonMe();

	public JPanel jPanelnombre_estado_nota_creditoNotasCreditos;
	public JLabel jLabelnombre_estado_nota_creditoNotasCreditos;
	public JTextArea jTextAreanombre_estado_nota_creditoNotasCreditos;
	public JScrollPane jscrollPanenombre_estado_nota_creditoNotasCreditos;
	public JButton jButtonnombre_estado_nota_creditoNotasCreditosBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaNotasCreditos;
	public JLabel jLabelid_empresaNotasCreditos;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaNotasCreditos;
	public JButton jButtonid_empresaNotasCreditos= new JButtonMe();
	public JButton jButtonid_empresaNotasCreditosUpdate= new JButtonMe();
	public JButton jButtonid_empresaNotasCreditosBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesNotasCreditos;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public NotasCreditosDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposNotasCreditos=new JPanel();
				this.jPanelAccionesFormularioNotasCreditos=new JPanel();
				this.jmenuBarDetalleNotasCreditos=new JMenuBar();
				this.jTtoolBarDetalleNotasCreditos=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public NotasCreditosDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public NotasCreditosDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("NotasCreditos No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarNotasCreditos() {
		return this.jButtonActualizarToolBarNotasCreditos;
	}
	
	public JButton getjButtonEliminarToolBarNotasCreditos() {
		return this.jButtonEliminarToolBarNotasCreditos;
	}
	
	public JButton getjButtonCancelarToolBarNotasCreditos() {
		return this.jButtonCancelarToolBarNotasCreditos;
	}		
	
	public JButton getjButtonProcesarInformacionNotasCreditos() {
		return this.jButtonProcesarInformacionNotasCreditos;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionNotasCreditos)	{
		this.jButtonProcesarInformacionNotasCreditos = jButtonProcesarInformacionNotasCreditos;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesNotasCreditos() {
		return this.jComboBoxTiposAccionesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesNotasCreditos(
			JComboBox jComboBoxTiposRelacionesNotasCreditos) {
		this.jComboBoxTiposRelacionesNotasCreditos = jComboBoxTiposRelacionesNotasCreditos;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesNotasCreditos(
			JComboBox jComboBoxTiposAccionesNotasCreditos) {
		this.jComboBoxTiposAccionesNotasCreditos = jComboBoxTiposAccionesNotasCreditos;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioNotasCreditos() {
		return this.jComboBoxTiposAccionesFormularioNotasCreditos;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioNotasCreditos(
			JComboBox jComboBoxTiposAccionesFormularioNotasCreditos) {
		this.jComboBoxTiposAccionesFormularioNotasCreditos = jComboBoxTiposAccionesFormularioNotasCreditos;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.notascreditosSessionBean=new NotasCreditosSessionBean();
		
		this.notascreditosSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.notascreditosSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.notascreditosSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		NotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		NotasCreditosJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		NotasCreditosJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Notas Creditos MANTENIMIENTO"));
		
		
		if(iWidth > 1550) {
			iWidth=1550;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
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
	
		NotasCreditosJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleNotasCreditos= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarNotasCreditos=new JButtonMe();
				this.jButtonModificarToolBarNotasCreditos=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarNotasCreditos,this.jTtoolBarDetalleNotasCreditos,
							"actualizar","actualizar","Actualizar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarNotasCreditos,this.jTtoolBarDetalleNotasCreditos,
							"eliminar","eliminar","Eliminar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarNotasCreditos,this.jTtoolBarDetalleNotasCreditos,
							"cancelar","cancelar","Cancelar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarNotasCreditos=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarNotasCreditos,this.jTtoolBarDetalleNotasCreditos,
							"guardarcambios","guardarcambios","Guardar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleNotasCreditos=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleNotasCreditos=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoNotasCreditos=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesNotasCreditos=new JMenuMe("Acciones");
		this.jmenuDetalleDatosNotasCreditos=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoNotasCreditos= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoNotasCreditos.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoNotasCreditos,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarNotasCreditos= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarNotasCreditos.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarNotasCreditos,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarNotasCreditos= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarNotasCreditos.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarNotasCreditos,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarNotasCreditos= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarNotasCreditos.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarNotasCreditos,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarNotasCreditos= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarNotasCreditos.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarNotasCreditos,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosNotasCreditos= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosNotasCreditos.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosNotasCreditos,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarNotasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarNotasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarNotasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarNotasCreditos= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarNotasCreditos.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarNotasCreditos,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarNotasCreditos= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarNotasCreditos.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarNotasCreditos,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoNotasCreditos.add(this.jMenuItemDetalleCerrarNotasCreditos);
		
		this.jmenuDetalleAccionesNotasCreditos.add(this.jMenuItemActualizarNotasCreditos);
		this.jmenuDetalleAccionesNotasCreditos.add(this.jMenuItemEliminarNotasCreditos);
		this.jmenuDetalleAccionesNotasCreditos.add(this.jMenuItemCancelarNotasCreditos);		
		
		//this.jmenuDetalleDatosNotasCreditos.add(this.jMenuItemDetalleAbrirOrderByNotasCreditos);				
		this.jmenuDetalleDatosNotasCreditos.add(this.jMenuItemDetalleMostarOcultarNotasCreditos);				
				
		//this.jmenuDetalleAccionesNotasCreditos.add(this.jMenuItemGuardarCambiosNotasCreditos);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleNotasCreditos.add(this.jmenuDetalleArchivoNotasCreditos);		
		this.jmenuBarDetalleNotasCreditos.add(this.jmenuDetalleAccionesNotasCreditos);		
		this.jmenuBarDetalleNotasCreditos.add(this.jmenuDetalleDatosNotasCreditos);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleNotasCreditos);				
	}
	
	
	public void inicializarElementosCamposNotasCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdNotasCreditos = new JLabelMe();
		jLabelIdNotasCreditos.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidNotasCreditos = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutNotasCreditos= new GridBagLayout();

		this.jPanelidNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);

		jLabelidNotasCreditos = new JLabel();
		jLabelidNotasCreditos.setText("Id");

		jLabelidNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_emision_desdeNotasCreditos = new JLabelMe();
		this.jLabelfecha_emision_desdeNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE+" : *");
		this.jLabelfecha_emision_desdeNotasCreditos.setToolTipText("Fecha Emision Desde");
		this.jLabelfecha_emision_desdeNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_desdeNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_desdeNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_desdeNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_desdeNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONDESDE);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelfecha_emision_desdeNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		//jFormattedTextFieldfecha_emision_desdeNotasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_desdeNotasCreditos= new JDateChooser();
		jDateChooserfecha_emision_desdeNotasCreditos.setEnabled(false);
		jDateChooserfecha_emision_desdeNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_desdeNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_desdeNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_desdeNotasCreditos.setDate(new Date());
		jDateChooserfecha_emision_desdeNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_desdeNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_desdeNotasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setText("U");
		this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_desdeNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_desdeNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_desdeNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_desdeNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_desdeNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emision_hastaNotasCreditos = new JLabelMe();
		this.jLabelfecha_emision_hastaNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA+" : *");
		this.jLabelfecha_emision_hastaNotasCreditos.setToolTipText("Fecha Emision Hasta");
		this.jLabelfecha_emision_hastaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_emision_hastaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emision_hastaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emision_hastaNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emision_hastaNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_FECHAEMISIONHASTA);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelfecha_emision_hastaNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		//jFormattedTextFieldfecha_emision_hastaNotasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_emision_hastaNotasCreditos= new JDateChooser();
		jDateChooserfecha_emision_hastaNotasCreditos.setEnabled(false);
		jDateChooserfecha_emision_hastaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emision_hastaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emision_hastaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emision_hastaNotasCreditos.setDate(new Date());
		jDateChooserfecha_emision_hastaNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emision_hastaNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emision_hastaNotasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setText("U");
		this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emision_hastaNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emision_hastaNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emision_hastaNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emision_hastaNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emision_hastaNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_completo_clienteNotasCreditos = new JLabelMe();
		this.jLabelnombre_completo_clienteNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE+" : *");
		this.jLabelnombre_completo_clienteNotasCreditos.setToolTipText("Nombre Completo Cliente");
		this.jLabelnombre_completo_clienteNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_completo_clienteNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_completo_clienteNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_completo_clienteNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_completo_clienteNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_NOMBRECOMPLETOCLIENTE);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelnombre_completo_clienteNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextAreanombre_completo_clienteNotasCreditos= new JTextAreaMe();
		jTextAreanombre_completo_clienteNotasCreditos.setEnabled(false);
		jTextAreanombre_completo_clienteNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_completo_clienteNotasCreditos.setLineWrap(true);
		jTextAreanombre_completo_clienteNotasCreditos.setWrapStyleWord(true);
		jTextAreanombre_completo_clienteNotasCreditos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_completo_clienteNotasCreditos.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_completo_clienteNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_completo_clienteNotasCreditos = new JScrollPane(jTextAreanombre_completo_clienteNotasCreditos);
		jscrollPanenombre_completo_clienteNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_completo_clienteNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_completo_clienteNotasCreditosBusqueda= new JButtonMe();
		this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setText("U");
		this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_completo_clienteNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_completo_clienteNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_completo_clienteNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_completo_clienteNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_completo_clienteNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impreso_facturaNotasCreditos = new JLabelMe();
		this.jLabelnumero_pre_impreso_facturaNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA+" : *");
		this.jLabelnumero_pre_impreso_facturaNotasCreditos.setToolTipText("Numero Pre Impreso Factura");
		this.jLabelnumero_pre_impreso_facturaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnumero_pre_impreso_facturaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impreso_facturaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impreso_facturaNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impreso_facturaNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESOFACTURA);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelnumero_pre_impreso_facturaNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFieldnumero_pre_impreso_facturaNotasCreditos= new JTextFieldMe();

		jTextFieldnumero_pre_impreso_facturaNotasCreditos.setEnabled(false);
		jTextFieldnumero_pre_impreso_facturaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impreso_facturaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impreso_facturaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setText("U");
		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impreso_facturaNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impreso_facturaNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impreso_facturaNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnumero_pre_impresoNotasCreditos = new JLabelMe();
		this.jLabelnumero_pre_impresoNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO+" : *");
		this.jLabelnumero_pre_impresoNotasCreditos.setToolTipText("Numero Pre Impreso");
		this.jLabelnumero_pre_impresoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_pre_impresoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_pre_impresoNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_pre_impresoNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_pre_impresoNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelnumero_pre_impresoNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFieldnumero_pre_impresoNotasCreditos= new JTextFieldMe();

		jTextFieldnumero_pre_impresoNotasCreditos.setEnabled(false);
		jTextFieldnumero_pre_impresoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_pre_impresoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_pre_impresoNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_pre_impresoNotasCreditosBusqueda= new JButtonMe();
		this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setText("U");
		this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_pre_impresoNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_pre_impresoNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_pre_impresoNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_pre_impresoNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_pre_impresoNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_emisionNotasCreditos = new JLabelMe();
		this.jLabelfecha_emisionNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_FECHAEMISION+" : *");
		this.jLabelfecha_emisionNotasCreditos.setToolTipText("Fecha Emision");
		this.jLabelfecha_emisionNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_emisionNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_emisionNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_emisionNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_emisionNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_FECHAEMISION);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelfecha_emisionNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		//jFormattedTextFieldfecha_emisionNotasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_emisionNotasCreditos= new JDateChooser();
		jDateChooserfecha_emisionNotasCreditos.setEnabled(false);
		jDateChooserfecha_emisionNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_emisionNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_emisionNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_emisionNotasCreditos.setDate(new Date());
		jDateChooserfecha_emisionNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_emisionNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_emisionNotasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_emisionNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_emisionNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_emisionNotasCreditosBusqueda.setText("U");
		this.jButtonfecha_emisionNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_emisionNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_emisionNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_emisionNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_emisionNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_emisionNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_emisionNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelfecha_vencimientoNotasCreditos = new JLabelMe();
		this.jLabelfecha_vencimientoNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO+" : *");
		this.jLabelfecha_vencimientoNotasCreditos.setToolTipText("Fecha Vencimiento");
		this.jLabelfecha_vencimientoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_vencimientoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_vencimientoNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_vencimientoNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_vencimientoNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelfecha_vencimientoNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		//jFormattedTextFieldfecha_vencimientoNotasCreditos= new JFormattedTextFieldMe();

		jDateChooserfecha_vencimientoNotasCreditos= new JDateChooser();
		jDateChooserfecha_vencimientoNotasCreditos.setEnabled(false);
		jDateChooserfecha_vencimientoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_vencimientoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_vencimientoNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_vencimientoNotasCreditos.setDate(new Date());
		jDateChooserfecha_vencimientoNotasCreditos.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_vencimientoNotasCreditos.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_vencimientoNotasCreditosBusqueda= new JButtonMe();
		this.jButtonfecha_vencimientoNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_vencimientoNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_vencimientoNotasCreditosBusqueda.setText("U");
		this.jButtonfecha_vencimientoNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_vencimientoNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_vencimientoNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_vencimientoNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_vencimientoNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_vencimientoNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_vencimientoNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelivaNotasCreditos = new JLabelMe();
		this.jLabelivaNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_IVA+" : *");
		this.jLabelivaNotasCreditos.setToolTipText("Iva");
		this.jLabelivaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelivaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelivaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelivaNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelivaNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_IVA);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelivaNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFieldivaNotasCreditos= new JTextFieldMe();
		jTextFieldivaNotasCreditos.setEnabled(false);
		jTextFieldivaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldivaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldivaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldivaNotasCreditos.setText("0.0");

		this.jButtonivaNotasCreditosBusqueda= new JButtonMe();
		this.jButtonivaNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonivaNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonivaNotasCreditosBusqueda.setText("U");
		this.jButtonivaNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonivaNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonivaNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldivaNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldivaNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ivaNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonivaNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabeldescuento_valorNotasCreditos = new JLabelMe();
		this.jLabeldescuento_valorNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR+" : *");
		this.jLabeldescuento_valorNotasCreditos.setToolTipText("Descuento Valor");
		this.jLabeldescuento_valorNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeldescuento_valorNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeldescuento_valorNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescuento_valorNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescuento_valorNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_DESCUENTOVALOR);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPaneldescuento_valorNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFielddescuento_valorNotasCreditos= new JTextFieldMe();
		jTextFielddescuento_valorNotasCreditos.setEnabled(false);
		jTextFielddescuento_valorNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFielddescuento_valorNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFielddescuento_valorNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFielddescuento_valorNotasCreditos.setText("0.0");

		this.jButtondescuento_valorNotasCreditosBusqueda= new JButtonMe();
		this.jButtondescuento_valorNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescuento_valorNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescuento_valorNotasCreditosBusqueda.setText("U");
		this.jButtondescuento_valorNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescuento_valorNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescuento_valorNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFielddescuento_valorNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFielddescuento_valorNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descuento_valorNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescuento_valorNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelotro_valorNotasCreditos = new JLabelMe();
		this.jLabelotro_valorNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_OTROVALOR+" : *");
		this.jLabelotro_valorNotasCreditos.setToolTipText("Otro Valor");
		this.jLabelotro_valorNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_valorNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelotro_valorNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelotro_valorNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelotro_valorNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelotro_valorNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_OTROVALOR);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelotro_valorNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFieldotro_valorNotasCreditos= new JTextFieldMe();
		jTextFieldotro_valorNotasCreditos.setEnabled(false);
		jTextFieldotro_valorNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_valorNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldotro_valorNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldotro_valorNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldotro_valorNotasCreditos.setText("0.0");

		this.jButtonotro_valorNotasCreditosBusqueda= new JButtonMe();
		this.jButtonotro_valorNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_valorNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonotro_valorNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonotro_valorNotasCreditosBusqueda.setText("U");
		this.jButtonotro_valorNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonotro_valorNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonotro_valorNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldotro_valorNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldotro_valorNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"otro_valorNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonotro_valorNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelsub_totalNotasCreditos = new JLabelMe();
		this.jLabelsub_totalNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_SUBTOTAL+" : *");
		this.jLabelsub_totalNotasCreditos.setToolTipText("Sub Total");
		this.jLabelsub_totalNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelsub_totalNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelsub_totalNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelsub_totalNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelsub_totalNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_SUBTOTAL);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelsub_totalNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFieldsub_totalNotasCreditos= new JTextFieldMe();
		jTextFieldsub_totalNotasCreditos.setEnabled(false);
		jTextFieldsub_totalNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldsub_totalNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldsub_totalNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldsub_totalNotasCreditos.setText("0.0");

		this.jButtonsub_totalNotasCreditosBusqueda= new JButtonMe();
		this.jButtonsub_totalNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonsub_totalNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonsub_totalNotasCreditosBusqueda.setText("U");
		this.jButtonsub_totalNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonsub_totalNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonsub_totalNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldsub_totalNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldsub_totalNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"sub_totalNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonsub_totalNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabeltotalNotasCreditos = new JLabelMe();
		this.jLabeltotalNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_TOTAL+" : *");
		this.jLabeltotalNotasCreditos.setToolTipText("Total");
		this.jLabeltotalNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeltotalNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeltotalNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneltotalNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneltotalNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_TOTAL);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPaneltotalNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextFieldtotalNotasCreditos= new JTextFieldMe();
		jTextFieldtotalNotasCreditos.setEnabled(false);
		jTextFieldtotalNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldtotalNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldtotalNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldtotalNotasCreditos.setText("0.0");

		this.jButtontotalNotasCreditosBusqueda= new JButtonMe();
		this.jButtontotalNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtontotalNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtontotalNotasCreditosBusqueda.setText("U");
		this.jButtontotalNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtontotalNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtontotalNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldtotalNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldtotalNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"totalNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtontotalNotasCreditosBusqueda.setVisible(false);		}


					
		this.jLabelnombre_estado_nota_creditoNotasCreditos = new JLabelMe();
		this.jLabelnombre_estado_nota_creditoNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO+" : *");
		this.jLabelnombre_estado_nota_creditoNotasCreditos.setToolTipText("Nombre Estado Nota Credito");
		this.jLabelnombre_estado_nota_creditoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_estado_nota_creditoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelnombre_estado_nota_creditoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_estado_nota_creditoNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_estado_nota_creditoNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_estado_nota_creditoNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_NOMBREESTADONOTACREDITO);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelnombre_estado_nota_creditoNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jTextAreanombre_estado_nota_creditoNotasCreditos= new JTextAreaMe();
		jTextAreanombre_estado_nota_creditoNotasCreditos.setEnabled(false);
		jTextAreanombre_estado_nota_creditoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estado_nota_creditoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estado_nota_creditoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_estado_nota_creditoNotasCreditos.setLineWrap(true);
		jTextAreanombre_estado_nota_creditoNotasCreditos.setWrapStyleWord(true);
		jTextAreanombre_estado_nota_creditoNotasCreditos.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_estado_nota_creditoNotasCreditos.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_estado_nota_creditoNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_estado_nota_creditoNotasCreditos = new JScrollPane(jTextAreanombre_estado_nota_creditoNotasCreditos);
		jscrollPanenombre_estado_nota_creditoNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_estado_nota_creditoNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_estado_nota_creditoNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda= new JButtonMe();
		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setText("U");
		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_estado_nota_creditoNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_estado_nota_creditoNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_estado_nota_creditoNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_estado_nota_creditoNotasCreditosBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysNotasCreditos() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaNotasCreditos = new JLabelMe();
		this.jLabelid_empresaNotasCreditos.setText(""+NotasCreditosConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaNotasCreditos.setToolTipText("Empresa");
		this.jLabelid_empresaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaNotasCreditos=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaNotasCreditos.setToolTipText(NotasCreditosConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutNotasCreditos = new GridBagLayout();
		this.jPanelid_empresaNotasCreditos.setLayout(this.gridaBagLayoutNotasCreditos);


		jComboBoxid_empresaNotasCreditos= new JComboBoxMe();
		jComboBoxid_empresaNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaNotasCreditos.setEnabled(false);

		this.jButtonid_empresaNotasCreditos= new JButtonMe();
		this.jButtonid_empresaNotasCreditos.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotasCreditos.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotasCreditos.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaNotasCreditos.setText("Buscar");
		this.jButtonid_empresaNotasCreditos.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaNotasCreditos.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotasCreditos,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotasCreditos"));

		this.jButtonid_empresaNotasCreditosBusqueda= new JButtonMe();
		this.jButtonid_empresaNotasCreditosBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotasCreditosBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotasCreditosBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotasCreditosBusqueda.setText("U");
		this.jButtonid_empresaNotasCreditosBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaNotasCreditosBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotasCreditosBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotasCreditosBusqueda"));

		if(this.notascreditosSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaNotasCreditosBusqueda.setVisible(false);		}

		this.jButtonid_empresaNotasCreditosUpdate= new JButtonMe();
		this.jButtonid_empresaNotasCreditosUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotasCreditosUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaNotasCreditosUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaNotasCreditosUpdate.setText("U");
		this.jButtonid_empresaNotasCreditosUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaNotasCreditosUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaNotasCreditosUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaNotasCreditos.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaNotasCreditos.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaNotasCreditosUpdate"));



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
		//this.jInternalFrameDetalleNotasCreditos = new NotasCreditosBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Notas Creditos DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutNotasCreditos= new GridBagLayout();
		

		
		String sToolTipNotasCreditos="";
		sToolTipNotasCreditos=NotasCreditosConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipNotasCreditos+="(Facturacion.NotasCreditos)";
		}
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			sToolTipNotasCreditos+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoNotasCreditos = new JButtonMe();
		this.jButtonModificarNotasCreditos = new JButtonMe();
        this.jButtonActualizarNotasCreditos = new JButtonMe();
        this.jButtonEliminarNotasCreditos = new JButtonMe();
        this.jButtonCancelarNotasCreditos = new JButtonMe();
        this.jButtonGuardarCambiosNotasCreditos = new JButtonMe();
		this.jButtonGuardarCambiosTablaNotasCreditos = new JButtonMe();
		this.jButtonCerrarNotasCreditos = new JButtonMe();
		
		this.jScrollPanelDatosNotasCreditos = new JScrollPane();   
        this.jScrollPanelDatosEdicionNotasCreditos = new JScrollPane();
		this.jScrollPanelDatosGeneralNotasCreditos = new JScrollPane();
				
		
		
		this.jPanelCamposNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Notas Creditos";
		
		if(!this.notascreditosSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Notas Creditoses" + this.sPath));
		} else {
			this.jScrollPanelDatosNotasCreditos.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposNotasCreditos.setName("jPanelCamposNotasCreditos"); 

		this.jPanelCamposOcultosNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosNotasCreditos.setName("jPanelCamposOcultosNotasCreditos"); 

        this.jPanelAccionesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesNotasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesNotasCreditos.setName("Acciones"); 

		this.jPanelAccionesFormularioNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioNotasCreditos.setToolTipText("Acciones");
        this.jPanelAccionesFormularioNotasCreditos.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoNotasCreditos.setText("Nuevo");
		this.jButtonModificarNotasCreditos.setText("Editar");
        this.jButtonActualizarNotasCreditos.setText("Actualizar");
        this.jButtonEliminarNotasCreditos.setText("Eliminar");
        this.jButtonCancelarNotasCreditos.setText("Cancelar");
        this.jButtonGuardarCambiosNotasCreditos.setText("Guardar");
		this.jButtonGuardarCambiosTablaNotasCreditos.setText("Guardar");
		this.jButtonCerrarNotasCreditos.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoNotasCreditos,"nuevo_button","Nuevo",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarNotasCreditos,"modificar_button","Editar",this.notascreditosSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarNotasCreditos,"actualizar_button","Actualizar",this.notascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarNotasCreditos,"eliminar_button","Eliminar",this.notascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarNotasCreditos,"cancelar_button","Cancelar",this.notascreditosSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosNotasCreditos,"guardarcambios_button","Guardar",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaNotasCreditos,"guardarcambiostabla_button","Guardar",this.notascreditosSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarNotasCreditos,"cerrar_button","Salir",this.notascreditosSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoNotasCreditos.setToolTipText("Nuevo"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarNotasCreditos.setToolTipText("Editar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarNotasCreditos.setToolTipText("Actualizar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarNotasCreditos.setToolTipText("Eliminar)"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarNotasCreditos.setToolTipText("Cancelar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosNotasCreditos.setToolTipText("Guardar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaNotasCreditos.setToolTipText("Guardar"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarNotasCreditos.setToolTipText("Salir"+" "+NotasCreditosConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoNotasCreditos";
		inputMap = this.jButtonNuevoNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoNotasCreditos.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoNotasCreditos"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarNotasCreditos";
		inputMap = this.jButtonActualizarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarNotasCreditos"));
		
		//ELIMINAR
		sMapKey = "EliminarNotasCreditos";
		inputMap = this.jButtonEliminarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarNotasCreditos"));
		
		//CANCELAR	
		sMapKey = "CancelarNotasCreditos";
		inputMap = this.jButtonCancelarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarNotasCreditos"));
		
		//CERRAR		
		sMapKey = "CerrarNotasCreditos";
		inputMap = this.jButtonCerrarNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarNotasCreditos"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaNotasCreditos";
		inputMap = this.jButtonGuardarCambiosTablaNotasCreditos.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaNotasCreditos.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaNotasCreditos"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoNotasCreditos.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoNotasCreditos.setToolTipText("Nuevo NotasCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarNotasCreditos.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarNotasCreditos.setToolTipText("Sin Cerrar Ventana NotasCreditos");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeNotasCreditos = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeNotasCreditos.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeNotasCreditos.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesNotasCreditos.setText("Accion");
		this.jComboBoxTiposAccionesNotasCreditos.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioNotasCreditos = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioNotasCreditos.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioNotasCreditos.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesNotasCreditos = new JLabelMe();
		
		this.jLabelAccionesNotasCreditos.setText("Acciones");		
		this.jLabelAccionesNotasCreditos.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotasCreditos.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesNotasCreditos.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposNotasCreditos();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysNotasCreditos();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesNotasCreditos=new JTabbedPane();
		this.jTabbedPaneRelacionesNotasCreditos.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesNotasCreditos,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesNotasCreditos.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotasCreditos.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesNotasCreditos.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesNotasCreditos, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioNotasCreditos.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotasCreditos.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioNotasCreditos.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioNotasCreditos, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposNotasCreditos = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosNotasCreditos = new GridBagLayout();
		
		this.jPanelCamposNotasCreditos.setLayout(gridaBagLayoutCamposNotasCreditos);
		this.jPanelCamposOcultosNotasCreditos.setLayout(gridaBagLayoutCamposOcultosNotasCreditos);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidNotasCreditos.add(jLabelIdNotasCreditos, this.gridBagConstraintsNotasCreditos);



	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidNotasCreditos.add(jLabelidNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaNotasCreditos.add(jLabelid_empresaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotasCreditos.add(jButtonid_empresaNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 3;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaNotasCreditos.add(jButtonid_empresaNotasCreditosUpdate, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaNotasCreditos.add(jComboBoxid_empresaNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_desdeNotasCreditos.add(jLabelfecha_emision_desdeNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_desdeNotasCreditos.add(jButtonfecha_emision_desdeNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_desdeNotasCreditos.add(jDateChooserfecha_emision_desdeNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emision_hastaNotasCreditos.add(jLabelfecha_emision_hastaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emision_hastaNotasCreditos.add(jButtonfecha_emision_hastaNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emision_hastaNotasCreditos.add(jDateChooserfecha_emision_hastaNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_completo_clienteNotasCreditos.add(jLabelnombre_completo_clienteNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_completo_clienteNotasCreditos.add(jButtonnombre_completo_clienteNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_completo_clienteNotasCreditos.add(jscrollPanenombre_completo_clienteNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impreso_facturaNotasCreditos.add(jLabelnumero_pre_impreso_facturaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impreso_facturaNotasCreditos.add(jButtonnumero_pre_impreso_facturaNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impreso_facturaNotasCreditos.add(jTextFieldnumero_pre_impreso_facturaNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_pre_impresoNotasCreditos.add(jLabelnumero_pre_impresoNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_pre_impresoNotasCreditos.add(jButtonnumero_pre_impresoNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_pre_impresoNotasCreditos.add(jTextFieldnumero_pre_impresoNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_emisionNotasCreditos.add(jLabelfecha_emisionNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_emisionNotasCreditos.add(jButtonfecha_emisionNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_emisionNotasCreditos.add(jDateChooserfecha_emisionNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_vencimientoNotasCreditos.add(jLabelfecha_vencimientoNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_vencimientoNotasCreditos.add(jButtonfecha_vencimientoNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_vencimientoNotasCreditos.add(jDateChooserfecha_vencimientoNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelivaNotasCreditos.add(jLabelivaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelivaNotasCreditos.add(jButtonivaNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelivaNotasCreditos.add(jTextFieldivaNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescuento_valorNotasCreditos.add(jLabeldescuento_valorNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescuento_valorNotasCreditos.add(jButtondescuento_valorNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescuento_valorNotasCreditos.add(jTextFielddescuento_valorNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelotro_valorNotasCreditos.add(jLabelotro_valorNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelotro_valorNotasCreditos.add(jButtonotro_valorNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelotro_valorNotasCreditos.add(jTextFieldotro_valorNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelsub_totalNotasCreditos.add(jLabelsub_totalNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelsub_totalNotasCreditos.add(jButtonsub_totalNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelsub_totalNotasCreditos.add(jTextFieldsub_totalNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneltotalNotasCreditos.add(jLabeltotalNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPaneltotalNotasCreditos.add(jButtontotalNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneltotalNotasCreditos.add(jTextFieldtotalNotasCreditos, this.gridBagConstraintsNotasCreditos);


	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 0;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_estado_nota_creditoNotasCreditos.add(jLabelnombre_estado_nota_creditoNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		//this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = 2;
		this.gridBagConstraintsNotasCreditos.ipadx = 0;
		this.gridBagConstraintsNotasCreditos.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_estado_nota_creditoNotasCreditos.add(jButtonnombre_estado_nota_creditoNotasCreditosBusqueda, this.gridBagConstraintsNotasCreditos);
	}

	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsNotasCreditos.gridy = 0;
	this.gridBagConstraintsNotasCreditos.gridx = 1;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_estado_nota_creditoNotasCreditos.add(jscrollPanenombre_estado_nota_creditoNotasCreditos, this.gridBagConstraintsNotasCreditos);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelidNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelfecha_emision_desdeNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelfecha_emision_hastaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelnombre_completo_clienteNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelnumero_pre_impreso_facturaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelnumero_pre_impresoNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelfecha_emisionNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelfecha_vencimientoNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelivaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPaneldescuento_valorNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelotro_valorNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelsub_totalNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPaneltotalNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposNotasCreditos.add(this.jPanelnombre_estado_nota_creditoNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposNotasCreditos % 2==0) {
		iXPanelCamposNotasCreditos=0;
		iYPanelCamposNotasCreditos++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsNotasCreditos.gridy = iYPanelCamposOcultosNotasCreditos;
	this.gridBagConstraintsNotasCreditos.gridx = iXPanelCamposOcultosNotasCreditos++;
	this.gridBagConstraintsNotasCreditos.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsNotasCreditos.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosNotasCreditos.add(this.jPanelid_empresaNotasCreditos, this.gridBagConstraintsNotasCreditos);



	if(iXPanelCamposOcultosNotasCreditos % 2==0) {
		iXPanelCamposOcultosNotasCreditos=0;
		iYPanelCamposOcultosNotasCreditos++;
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
			
		GridBagLayout gridaBagLayoutAccionesNotasCreditos= new GridBagLayout();
		this.jPanelAccionesNotasCreditos.setLayout(gridaBagLayoutAccionesNotasCreditos);
		
		GridBagLayout gridaBagLayoutAccionesFormularioNotasCreditos= new GridBagLayout();
		this.jPanelAccionesFormularioNotasCreditos.setLayout(gridaBagLayoutAccionesFormularioNotasCreditos);
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsNotasCreditos.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioNotasCreditos.add(this.jComboBoxTiposAccionesFormularioNotasCreditos, this.gridBagConstraintsNotasCreditos);

		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx = iPosXAccion++;
			
		this.jPanelAccionesNotasCreditos.add(this.jButtonModificarNotasCreditos, this.gridBagConstraintsNotasCreditos);							

		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsNotasCreditos.gridy = 0;
		this.gridBagConstraintsNotasCreditos.gridx =iPosXAccion++;
			
		this.jPanelAccionesNotasCreditos.add(this.jButtonEliminarNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = 0;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotasCreditos.add(this.jButtonActualizarNotasCreditos, this.gridBagConstraintsNotasCreditos);


		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = 0;		
		this.gridBagConstraintsNotasCreditos.gridx = iPosXAccion++;
		
		this.jPanelAccionesNotasCreditos.add(this.jButtonGuardarCambiosNotasCreditos, this.gridBagConstraintsNotasCreditos);	
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = 0;		
		this.gridBagConstraintsNotasCreditos.gridx =iPosXAccion++;
		
		this.jPanelAccionesNotasCreditos.add(this.jButtonCancelarNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutNotasCreditos = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutNotasCreditos);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.notascreditosSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();						
			this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;
			this.gridBagConstraintsNotasCreditos.gridx = 0;		
			//this.gridBagConstraintsNotasCreditos.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsNotasCreditos.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy =iGridyPrincipal++;
		this.gridBagConstraintsNotasCreditos.gridx =0;
		this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsNotasCreditos.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosNotasCreditos, this.gridBagConstraintsNotasCreditos);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*1);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(NotasCreditosJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleNotasCreditos = new NotasCreditosBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Notas Creditos DATOS");
			
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
			
	        //this.setTitle("[FOR] - Notas Creditos DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Notas Creditos Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			NotasCreditosModel notascreditosModel=new NotasCreditosModel(this);
			
			//SI USARA CLASE INTERNA
			//NotasCreditosModel.NotasCreditosFocusTraversalPolicy notascreditosFocusTraversalPolicy = notascreditosModel.new NotasCreditosFocusTraversalPolicy(this);
			
			//notascreditosFocusTraversalPolicy.setnotascreditosJInternalFrame(this);
			
			this.setFocusTraversalPolicy(notascreditosModel);
			
			
			this.jContentPaneDetalleNotasCreditos = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleNotasCreditos = new GridBagLayout();	
			this.jContentPaneDetalleNotasCreditos.setLayout(gridaBagLayoutDetalleNotasCreditos);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosNotasCreditos = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
				this.gridBagConstraintsNotasCreditos.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsNotasCreditos.gridx = 0;
					
				
				this.jContentPaneDetalleNotasCreditos.add(jTtoolBarDetalleNotasCreditos, gridBagConstraintsNotasCreditos);								
				
}
			
			this.jScrollPanelDatosEdicionNotasCreditos=   new JScrollPane(jContentPaneDetalleNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralNotasCreditos=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			
			
	        this.gridBagConstraintsNotasCreditos.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsNotasCreditos.gridx = 0;
	        
			this.jContentPaneDetalleNotasCreditos.add(jPanelCamposNotasCreditos, gridBagConstraintsNotasCreditos);
			
			
			
			
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
						//&& notascreditosSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.notascreditosSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsNotasCreditos= new GridBagConstraints();
						this.gridBagConstraintsNotasCreditos.gridy = iGridyRelaciones++;
						this.gridBagConstraintsNotasCreditos.gridx = 0;
						this.jContentPaneDetalleNotasCreditos.add(this.jTabbedPaneRelacionesNotasCreditos, this.gridBagConstraintsNotasCreditos);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesNotasCreditos.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosNotasCreditos.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
					this.gridBagConstraintsNotasCreditos.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsNotasCreditos.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsNotasCreditos.gridx = 0;
					
				
					this.jContentPaneDetalleNotasCreditos.add(jPanelCamposOcultosNotasCreditos, gridBagConstraintsNotasCreditos);
				
					this.jPanelCamposOcultosNotasCreditos.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsNotasCreditos.gridx = 0;
	        this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleNotasCreditos.add(this.jPanelAccionesFormularioNotasCreditos, this.gridBagConstraintsNotasCreditos);							
			
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
	        this.gridBagConstraintsNotasCreditos.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsNotasCreditos.gridx = 0;
	        
			
			this.jContentPaneDetalleNotasCreditos.add(this.jPanelAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionNotasCreditos);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionNotasCreditos=   new JScrollPane(this.jPanelCamposNotasCreditos,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionNotasCreditos.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotasCreditos.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionNotasCreditos.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsNotasCreditos.gridx = 0;
			this.gridBagConstraintsNotasCreditos.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsNotasCreditos.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsNotasCreditos.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionNotasCreditos, this.gridBagConstraintsNotasCreditos);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotasCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioNotasCreditos, this.gridBagConstraintsNotasCreditos);			
			
			this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
			this.gridBagConstraintsNotasCreditos.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsNotasCreditos.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposNotasCreditos, this.gridBagConstraintsNotasCreditos);
			
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosNotasCreditos, this.gridBagConstraintsNotasCreditos);
		
			
		this.gridBagConstraintsNotasCreditos = new GridBagConstraints();
		this.gridBagConstraintsNotasCreditos.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsNotasCreditos.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesNotasCreditos, this.gridBagConstraintsNotasCreditos);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralNotasCreditos;//jContentPane;
		
		return jScrollPanelDatosEdicionNotasCreditos;
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
