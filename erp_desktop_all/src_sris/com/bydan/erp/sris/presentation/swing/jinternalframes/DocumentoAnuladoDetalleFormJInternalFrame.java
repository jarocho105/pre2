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
package com.bydan.erp.sris.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;

import com.bydan.erp.sris.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.sris.presentation.swing.jinternalframes.*;
import com.bydan.erp.sris.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.sris.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.sris.business.entity.*;
import com.bydan.erp.sris.util.DocumentoAnuladoConstantesFunciones;

import com.bydan.erp.sris.business.logic.*;
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
public class DocumentoAnuladoDetalleFormJInternalFrame extends DocumentoAnuladoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDocumentoAnulado;
	
	protected JMenuBar jmenuBarDetalleDocumentoAnulado;
	
	protected JMenu jmenuDetalleDocumentoAnulado;
	protected JMenu jmenuDetalleArchivoDocumentoAnulado;
	protected JMenu jmenuDetalleAccionesDocumentoAnulado;
	protected JMenu jmenuDetalleDatosDocumentoAnulado;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDocumentoAnulado;	
	protected GridBagConstraints gridBagConstraintsDocumentoAnulado;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DocumentoAnuladoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDocumentoAnulado;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected PeriodoDeclaraBeanSwingJInternalFrame periododeclaraBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_periododeclara="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoComprobanteBeanSwingJInternalFrame tipocomprobanteBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipocomprobante="";
	
	public DocumentoAnuladoSessionBean documentoanuladoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public PeriodoDeclaraSessionBean periododeclaraSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoComprobanteSessionBean tipocomprobanteSessionBean;	
	
	public DocumentoAnuladoLogic documentoanuladoLogic;
	
	public JScrollPane jScrollPanelDatosDocumentoAnulado;
	public JScrollPane jScrollPanelDatosEdicionDocumentoAnulado;
	public JScrollPane jScrollPanelDatosGeneralDocumentoAnulado;
	
	protected JPanel jPanelCamposDocumentoAnulado;    
	protected JPanel jPanelCamposOcultosDocumentoAnulado;    	
	protected JPanel jPanelAccionesDocumentoAnulado;
	protected JPanel jPanelAccionesFormularioDocumentoAnulado;
    
	
	
	protected Integer iXPanelCamposDocumentoAnulado=0;
	protected Integer iYPanelCamposDocumentoAnulado=0;
	
	protected Integer iXPanelCamposOcultosDocumentoAnulado=0;
	protected Integer iYPanelCamposOcultosDocumentoAnulado=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDocumentoAnulado;
	public JButton jButtonModificarDocumentoAnulado;
	public JButton jButtonActualizarDocumentoAnulado;
    public JButton jButtonEliminarDocumentoAnulado;
	public JButton jButtonCancelarDocumentoAnulado;
    public JButton jButtonGuardarCambiosDocumentoAnulado;
	public JButton jButtonGuardarCambiosTablaDocumentoAnulado;
	protected JButton jButtonCerrarDocumentoAnulado;
	
	
	protected JButton jButtonProcesarInformacionDocumentoAnulado;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDocumentoAnulado;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDocumentoAnulado;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDocumentoAnulado;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDocumentoAnulado;
	protected JButton jButtonModificarToolBarDocumentoAnulado;
	protected JButton jButtonActualizarToolBarDocumentoAnulado;
    protected JButton jButtonEliminarToolBarDocumentoAnulado;
	protected JButton jButtonCancelarToolBarDocumentoAnulado;
    protected JButton jButtonGuardarCambiosToolBarDocumentoAnulado;
	protected JButton jButtonGuardarCambiosTablaToolBarDocumentoAnulado;
	protected JButton jButtonMostrarOcultarTablaToolBarDocumentoAnulado;
	protected JButton jButtonCerrarToolBarDocumentoAnulado;
	
	protected JButton jButtonProcesarInformacionToolBarDocumentoAnulado;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDocumentoAnulado;
	protected JMenuItem jMenuItemModificarDocumentoAnulado;
	protected JMenuItem jMenuItemActualizarDocumentoAnulado;
    protected JMenuItem jMenuItemEliminarDocumentoAnulado;
	protected JMenuItem jMenuItemCancelarDocumentoAnulado;
    protected JMenuItem jMenuItemGuardarCambiosDocumentoAnulado;
	protected JMenuItem jMenuItemGuardarCambiosTablaDocumentoAnulado;
	protected JMenuItem jMenuItemCerrarDocumentoAnulado;
	protected JMenuItem jMenuItemDetalleCerrarDocumentoAnulado;
	protected JMenuItem jMenuItemDetalleMostarOcultarDocumentoAnulado;
	
	protected JMenuItem jMenuItemProcesarInformacionDocumentoAnulado;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDocumentoAnulado;
	protected JMenuItem jMenuItemMostrarOcultarDocumentoAnulado;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDocumentoAnulado;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDocumentoAnulado;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDocumentoAnulado;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDocumentoAnulado;
	public JLabel jLabelIdDocumentoAnulado;
	public JLabel jLabelidDocumentoAnulado;
	public JButton jButtonidDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelnumeroDocumentoAnulado;
	public JLabel jLabelnumeroDocumentoAnulado;
	public JTextField jTextFieldnumeroDocumentoAnulado;
	public JButton jButtonnumeroDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelserieDocumentoAnulado;
	public JLabel jLabelserieDocumentoAnulado;
	public JTextField jTextFieldserieDocumentoAnulado;
	public JButton jButtonserieDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelautorizacionDocumentoAnulado;
	public JLabel jLabelautorizacionDocumentoAnulado;
	public JTextField jTextFieldautorizacionDocumentoAnulado;
	public JButton jButtonautorizacionDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelfecha_anulacionDocumentoAnulado;
	public JLabel jLabelfecha_anulacionDocumentoAnulado;
	//public JFormattedTextField jDateChooserfecha_anulacionDocumentoAnulado;

	public JDateChooser jDateChooserfecha_anulacionDocumentoAnulado;
	public JButton jButtonfecha_anulacionDocumentoAnuladoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDocumentoAnulado;
	public JLabel jLabelid_empresaDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDocumentoAnulado;
	public JButton jButtonid_empresaDocumentoAnulado= new JButtonMe();
	public JButton jButtonid_empresaDocumentoAnuladoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelid_periodo_declaraDocumentoAnulado;
	public JLabel jLabelid_periodo_declaraDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_periodo_declaraDocumentoAnulado;
	public JButton jButtonid_periodo_declaraDocumentoAnulado= new JButtonMe();
	public JButton jButtonid_periodo_declaraDocumentoAnuladoUpdate= new JButtonMe();
	public JButton jButtonid_periodo_declaraDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDocumentoAnulado;
	public JLabel jLabelid_moduloDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDocumentoAnulado;
	public JButton jButtonid_moduloDocumentoAnulado= new JButtonMe();
	public JButton jButtonid_moduloDocumentoAnuladoUpdate= new JButtonMe();
	public JButton jButtonid_moduloDocumentoAnuladoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_comprobanteDocumentoAnulado;
	public JLabel jLabelid_tipo_comprobanteDocumentoAnulado;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_comprobanteDocumentoAnulado;
	public JButton jButtonid_tipo_comprobanteDocumentoAnulado= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteDocumentoAnuladoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDocumentoAnulado;
	
	public static int openFrameCount = 0;
    public static final int xOffset = 10, yOffset = 35;
	
	//LOS DATOS DE NUEVO Y EDICION ACTUAL APARECEN EN OTRA VENTANA(true) O NO(false)
	public static Boolean CON_DATOS_FRAME=true;
	
	public static Boolean ISBINDING_MANUAL=true;
	public static Boolean ISLOAD_FKLOTE=true;
	public static Boolean ISBINDING_MANUAL_TABLA=true;
	public static Boolean CON_CARGAR_MEMORIA_INICIAL=true;
	
	//Al final no se utilizan, se inicializan desde JInternalFrameBase, desde ParametroGeneralUsuario
	public static String STIPO_TAMANIO_GENERAL="NORMAL";
	public static String STIPO_TAMANIO_GENERAL_TABLA="NORMAL";
	public static Boolean CONTIPO_TAMANIO_MANUAL=false;
	public static Boolean CON_LLAMADA_SIMPLE=true;
	public static Boolean CON_LLAMADA_SIMPLE_TOTAL=true;
	public static Boolean ESTA_CARGADO_PORPARTE=false;
	
	public int iWidthScroll=0;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightScroll=0;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
	public int iWidthFormulario=450;//(screenSize.width-screenSize.width/2)+(250*0);
	public int iHeightFormulario=682;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DocumentoAnuladoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDocumentoAnulado=new JPanel();
				this.jPanelAccionesFormularioDocumentoAnulado=new JPanel();
				this.jmenuBarDetalleDocumentoAnulado=new JMenuBar();
				this.jTtoolBarDetalleDocumentoAnulado=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DocumentoAnuladoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DocumentoAnuladoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DocumentoAnulado No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDocumentoAnulado() {
		return this.jButtonActualizarToolBarDocumentoAnulado;
	}
	
	public JButton getjButtonEliminarToolBarDocumentoAnulado() {
		return this.jButtonEliminarToolBarDocumentoAnulado;
	}
	
	public JButton getjButtonCancelarToolBarDocumentoAnulado() {
		return this.jButtonCancelarToolBarDocumentoAnulado;
	}		
	
	public JButton getjButtonProcesarInformacionDocumentoAnulado() {
		return this.jButtonProcesarInformacionDocumentoAnulado;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDocumentoAnulado)	{
		this.jButtonProcesarInformacionDocumentoAnulado = jButtonProcesarInformacionDocumentoAnulado;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDocumentoAnulado() {
		return this.jComboBoxTiposAccionesDocumentoAnulado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDocumentoAnulado(
			JComboBox jComboBoxTiposRelacionesDocumentoAnulado) {
		this.jComboBoxTiposRelacionesDocumentoAnulado = jComboBoxTiposRelacionesDocumentoAnulado;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDocumentoAnulado(
			JComboBox jComboBoxTiposAccionesDocumentoAnulado) {
		this.jComboBoxTiposAccionesDocumentoAnulado = jComboBoxTiposAccionesDocumentoAnulado;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDocumentoAnulado() {
		return this.jComboBoxTiposAccionesFormularioDocumentoAnulado;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDocumentoAnulado(
			JComboBox jComboBoxTiposAccionesFormularioDocumentoAnulado) {
		this.jComboBoxTiposAccionesFormularioDocumentoAnulado = jComboBoxTiposAccionesFormularioDocumentoAnulado;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.documentoanuladoSessionBean=new DocumentoAnuladoSessionBean();
		
		this.documentoanuladoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.documentoanuladoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.documentoanuladoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DocumentoAnuladoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DocumentoAnuladoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Documento Anulado MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
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
	
		DocumentoAnuladoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDocumentoAnulado= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDocumentoAnulado=new JButtonMe();
				this.jButtonModificarToolBarDocumentoAnulado=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDocumentoAnulado,this.jTtoolBarDetalleDocumentoAnulado,
							"actualizar","actualizar","Actualizar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDocumentoAnulado,this.jTtoolBarDetalleDocumentoAnulado,
							"eliminar","eliminar","Eliminar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDocumentoAnulado,this.jTtoolBarDetalleDocumentoAnulado,
							"cancelar","cancelar","Cancelar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDocumentoAnulado=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDocumentoAnulado,this.jTtoolBarDetalleDocumentoAnulado,
							"guardarcambios","guardarcambios","Guardar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDocumentoAnulado=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDocumentoAnulado=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDocumentoAnulado=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDocumentoAnulado=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDocumentoAnulado=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDocumentoAnulado= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDocumentoAnulado.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDocumentoAnulado,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDocumentoAnulado= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDocumentoAnulado.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDocumentoAnulado,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDocumentoAnulado= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDocumentoAnulado.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDocumentoAnulado,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDocumentoAnulado= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDocumentoAnulado.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDocumentoAnulado,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDocumentoAnulado= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDocumentoAnulado.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDocumentoAnulado,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDocumentoAnulado= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDocumentoAnulado.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDocumentoAnulado,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDocumentoAnulado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDocumentoAnulado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDocumentoAnulado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDocumentoAnulado= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDocumentoAnulado.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDocumentoAnulado,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDocumentoAnulado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDocumentoAnulado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDocumentoAnulado,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDocumentoAnulado= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDocumentoAnulado.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDocumentoAnulado,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDocumentoAnulado.add(this.jMenuItemDetalleCerrarDocumentoAnulado);
		
		this.jmenuDetalleAccionesDocumentoAnulado.add(this.jMenuItemActualizarDocumentoAnulado);
		this.jmenuDetalleAccionesDocumentoAnulado.add(this.jMenuItemEliminarDocumentoAnulado);
		this.jmenuDetalleAccionesDocumentoAnulado.add(this.jMenuItemCancelarDocumentoAnulado);		
		
		//this.jmenuDetalleDatosDocumentoAnulado.add(this.jMenuItemDetalleAbrirOrderByDocumentoAnulado);				
		this.jmenuDetalleDatosDocumentoAnulado.add(this.jMenuItemDetalleMostarOcultarDocumentoAnulado);				
				
		//this.jmenuDetalleAccionesDocumentoAnulado.add(this.jMenuItemGuardarCambiosDocumentoAnulado);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDocumentoAnulado.add(this.jmenuDetalleArchivoDocumentoAnulado);		
		this.jmenuBarDetalleDocumentoAnulado.add(this.jmenuDetalleAccionesDocumentoAnulado);		
		this.jmenuBarDetalleDocumentoAnulado.add(this.jmenuDetalleDatosDocumentoAnulado);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDocumentoAnulado);				
	}
	
	
	public void inicializarElementosCamposDocumentoAnulado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDocumentoAnulado = new JLabelMe();
		jLabelIdDocumentoAnulado.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDocumentoAnulado = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDocumentoAnulado= new GridBagLayout();

		this.jPanelidDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);

		jLabelidDocumentoAnulado = new JLabel();
		jLabelidDocumentoAnulado.setText("Id");

		jLabelidDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumeroDocumentoAnulado = new JLabelMe();
		this.jLabelnumeroDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_NUMERO+" : *");
		this.jLabelnumeroDocumentoAnulado.setToolTipText("Numero");
		this.jLabelnumeroDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumeroDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumeroDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumeroDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumeroDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_NUMERO);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelnumeroDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jTextFieldnumeroDocumentoAnulado= new JTextFieldMe();

		jTextFieldnumeroDocumentoAnulado.setEnabled(false);
		jTextFieldnumeroDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumeroDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumeroDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumeroDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonnumeroDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumeroDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumeroDocumentoAnuladoBusqueda.setText("U");
		this.jButtonnumeroDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumeroDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumeroDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumeroDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumeroDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numeroDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumeroDocumentoAnuladoBusqueda.setVisible(false);		}


					
		this.jLabelserieDocumentoAnulado = new JLabelMe();
		this.jLabelserieDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_SERIE+" : *");
		this.jLabelserieDocumentoAnulado.setToolTipText("Serie");
		this.jLabelserieDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelserieDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelserieDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelserieDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelserieDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_SERIE);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelserieDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jTextFieldserieDocumentoAnulado= new JTextFieldMe();

		jTextFieldserieDocumentoAnulado.setEnabled(false);
		jTextFieldserieDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldserieDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldserieDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonserieDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonserieDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonserieDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonserieDocumentoAnuladoBusqueda.setText("U");
		this.jButtonserieDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonserieDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonserieDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldserieDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldserieDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"serieDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonserieDocumentoAnuladoBusqueda.setVisible(false);		}


					
		this.jLabelautorizacionDocumentoAnulado = new JLabelMe();
		this.jLabelautorizacionDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION+" : *");
		this.jLabelautorizacionDocumentoAnulado.setToolTipText("Autorizacion");
		this.jLabelautorizacionDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelautorizacionDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelautorizacionDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelautorizacionDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelautorizacionDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_AUTORIZACION);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelautorizacionDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jTextFieldautorizacionDocumentoAnulado= new JTextFieldMe();

		jTextFieldautorizacionDocumentoAnulado.setEnabled(false);
		jTextFieldautorizacionDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacionDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldautorizacionDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldautorizacionDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonautorizacionDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonautorizacionDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonautorizacionDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonautorizacionDocumentoAnuladoBusqueda.setText("U");
		this.jButtonautorizacionDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonautorizacionDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonautorizacionDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldautorizacionDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldautorizacionDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"autorizacionDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonautorizacionDocumentoAnuladoBusqueda.setVisible(false);		}


					
		this.jLabelfecha_anulacionDocumentoAnulado = new JLabelMe();
		this.jLabelfecha_anulacionDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION+" : *");
		this.jLabelfecha_anulacionDocumentoAnulado.setToolTipText("Fecha Anulacion");
		this.jLabelfecha_anulacionDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_anulacionDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelfecha_anulacionDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_anulacionDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_anulacionDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_anulacionDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_FECHAANULACION);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelfecha_anulacionDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		//jFormattedTextFieldfecha_anulacionDocumentoAnulado= new JFormattedTextFieldMe();

		jDateChooserfecha_anulacionDocumentoAnulado= new JDateChooser();
		jDateChooserfecha_anulacionDocumentoAnulado.setEnabled(false);
		jDateChooserfecha_anulacionDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_anulacionDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_anulacionDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_anulacionDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_anulacionDocumentoAnulado.setDate(new Date());
		jDateChooserfecha_anulacionDocumentoAnulado.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_anulacionDocumentoAnulado.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setText("U");
		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_anulacionDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_anulacionDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_anulacionDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_anulacionDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_anulacionDocumentoAnuladoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDocumentoAnulado() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDocumentoAnulado = new JLabelMe();
		this.jLabelid_empresaDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDocumentoAnulado.setToolTipText("Empresa");
		this.jLabelid_empresaDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelid_empresaDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jComboBoxid_empresaDocumentoAnulado= new JComboBoxMe();
		jComboBoxid_empresaDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDocumentoAnulado.setEnabled(false);

		this.jButtonid_empresaDocumentoAnulado= new JButtonMe();
		this.jButtonid_empresaDocumentoAnulado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDocumentoAnulado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDocumentoAnulado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDocumentoAnulado.setText("Buscar");
		this.jButtonid_empresaDocumentoAnulado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDocumentoAnulado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDocumentoAnulado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDocumentoAnulado"));

		this.jButtonid_empresaDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonid_empresaDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDocumentoAnuladoBusqueda.setText("U");
		this.jButtonid_empresaDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDocumentoAnuladoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDocumentoAnuladoUpdate= new JButtonMe();
		this.jButtonid_empresaDocumentoAnuladoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDocumentoAnuladoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDocumentoAnuladoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDocumentoAnuladoUpdate.setText("U");
		this.jButtonid_empresaDocumentoAnuladoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDocumentoAnuladoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDocumentoAnuladoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDocumentoAnuladoUpdate"));



					
		this.jLabelid_periodo_declaraDocumentoAnulado = new JLabelMe();
		this.jLabelid_periodo_declaraDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA+" : *");
		this.jLabelid_periodo_declaraDocumentoAnulado.setToolTipText("Periodo Declara");
		this.jLabelid_periodo_declaraDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_periodo_declaraDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_periodo_declaraDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_periodo_declaraDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_periodo_declaraDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_IDPERIODODECLARA);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelid_periodo_declaraDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jComboBoxid_periodo_declaraDocumentoAnulado= new JComboBoxMe();
		jComboBoxid_periodo_declaraDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_periodo_declaraDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_periodo_declaraDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_periodo_declaraDocumentoAnulado= new JButtonMe();
		this.jButtonid_periodo_declaraDocumentoAnulado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraDocumentoAnulado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraDocumentoAnulado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_periodo_declaraDocumentoAnulado.setText("Buscar");
		this.jButtonid_periodo_declaraDocumentoAnulado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_periodo_declaraDocumentoAnulado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraDocumentoAnulado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_periodo_declaraDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraDocumentoAnulado"));

		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setText("U");
		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_periodo_declaraDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_periodo_declaraDocumentoAnuladoBusqueda.setVisible(false);		}

		this.jButtonid_periodo_declaraDocumentoAnuladoUpdate= new JButtonMe();
		this.jButtonid_periodo_declaraDocumentoAnuladoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraDocumentoAnuladoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_periodo_declaraDocumentoAnuladoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_periodo_declaraDocumentoAnuladoUpdate.setText("U");
		this.jButtonid_periodo_declaraDocumentoAnuladoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_periodo_declaraDocumentoAnuladoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_periodo_declaraDocumentoAnuladoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_periodo_declaraDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_periodo_declaraDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_periodo_declaraDocumentoAnuladoUpdate"));



					
		this.jLabelid_moduloDocumentoAnulado = new JLabelMe();
		this.jLabelid_moduloDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDocumentoAnulado.setToolTipText("Modulo");
		this.jLabelid_moduloDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelid_moduloDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jComboBoxid_moduloDocumentoAnulado= new JComboBoxMe();
		jComboBoxid_moduloDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_moduloDocumentoAnulado.setEnabled(false);

		this.jButtonid_moduloDocumentoAnulado= new JButtonMe();
		this.jButtonid_moduloDocumentoAnulado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDocumentoAnulado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDocumentoAnulado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDocumentoAnulado.setText("Buscar");
		this.jButtonid_moduloDocumentoAnulado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDocumentoAnulado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDocumentoAnulado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDocumentoAnulado"));

		this.jButtonid_moduloDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonid_moduloDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDocumentoAnuladoBusqueda.setText("U");
		this.jButtonid_moduloDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDocumentoAnuladoBusqueda.setVisible(false);		}

		this.jButtonid_moduloDocumentoAnuladoUpdate= new JButtonMe();
		this.jButtonid_moduloDocumentoAnuladoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDocumentoAnuladoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDocumentoAnuladoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDocumentoAnuladoUpdate.setText("U");
		this.jButtonid_moduloDocumentoAnuladoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDocumentoAnuladoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDocumentoAnuladoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDocumentoAnuladoUpdate"));



					
		this.jLabelid_tipo_comprobanteDocumentoAnulado = new JLabelMe();
		this.jLabelid_tipo_comprobanteDocumentoAnulado.setText(""+DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE+" : *");
		this.jLabelid_tipo_comprobanteDocumentoAnulado.setToolTipText("Tipo Comprobante");
		this.jLabelid_tipo_comprobanteDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comprobanteDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_comprobanteDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_comprobanteDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_comprobanteDocumentoAnulado=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_comprobanteDocumentoAnulado.setToolTipText(DocumentoAnuladoConstantesFunciones.LABEL_IDTIPOCOMPROBANTE);
		this.gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		this.jPanelid_tipo_comprobanteDocumentoAnulado.setLayout(this.gridaBagLayoutDocumentoAnulado);


		jComboBoxid_tipo_comprobanteDocumentoAnulado= new JComboBoxMe();
		jComboBoxid_tipo_comprobanteDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_comprobanteDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_comprobanteDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_comprobanteDocumentoAnulado= new JButtonMe();
		this.jButtonid_tipo_comprobanteDocumentoAnulado.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteDocumentoAnulado.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteDocumentoAnulado.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_comprobanteDocumentoAnulado.setText("Buscar");
		this.jButtonid_tipo_comprobanteDocumentoAnulado.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_comprobanteDocumentoAnulado.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteDocumentoAnulado,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_comprobanteDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteDocumentoAnulado"));

		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda= new JButtonMe();
		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setText("U");
		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_comprobanteDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteDocumentoAnuladoBusqueda"));

		if(this.documentoanuladoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate= new JButtonMe();
		this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.setText("U");
		this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_comprobanteDocumentoAnuladoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_comprobanteDocumentoAnulado.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_comprobanteDocumentoAnulado.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_comprobanteDocumentoAnuladoUpdate"));



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
		//this.jInternalFrameDetalleDocumentoAnulado = new DocumentoAnuladoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Documento Anulado DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDocumentoAnulado= new GridBagLayout();
		

		
		String sToolTipDocumentoAnulado="";
		sToolTipDocumentoAnulado=DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDocumentoAnulado+="(Sris.DocumentoAnulado)";
		}
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDocumentoAnulado+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDocumentoAnulado = new JButtonMe();
		this.jButtonModificarDocumentoAnulado = new JButtonMe();
        this.jButtonActualizarDocumentoAnulado = new JButtonMe();
        this.jButtonEliminarDocumentoAnulado = new JButtonMe();
        this.jButtonCancelarDocumentoAnulado = new JButtonMe();
        this.jButtonGuardarCambiosDocumentoAnulado = new JButtonMe();
		this.jButtonGuardarCambiosTablaDocumentoAnulado = new JButtonMe();
		this.jButtonCerrarDocumentoAnulado = new JButtonMe();
		
		this.jScrollPanelDatosDocumentoAnulado = new JScrollPane();   
        this.jScrollPanelDatosEdicionDocumentoAnulado = new JScrollPane();
		this.jScrollPanelDatosGeneralDocumentoAnulado = new JScrollPane();
				
		
		
		this.jPanelCamposDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Documento Anulado";
		
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Documento Anulados" + this.sPath));
		} else {
			this.jScrollPanelDatosDocumentoAnulado.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDocumentoAnulado.setName("jPanelCamposDocumentoAnulado"); 

		this.jPanelCamposOcultosDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDocumentoAnulado.setName("jPanelCamposOcultosDocumentoAnulado"); 

        this.jPanelAccionesDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDocumentoAnulado.setToolTipText("Acciones");
        this.jPanelAccionesDocumentoAnulado.setName("Acciones"); 

		this.jPanelAccionesFormularioDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDocumentoAnulado.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDocumentoAnulado.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDocumentoAnulado.setText("Nuevo");
		this.jButtonModificarDocumentoAnulado.setText("Editar");
        this.jButtonActualizarDocumentoAnulado.setText("Actualizar");
        this.jButtonEliminarDocumentoAnulado.setText("Eliminar");
        this.jButtonCancelarDocumentoAnulado.setText("Cancelar");
        this.jButtonGuardarCambiosDocumentoAnulado.setText("Guardar");
		this.jButtonGuardarCambiosTablaDocumentoAnulado.setText("Guardar");
		this.jButtonCerrarDocumentoAnulado.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDocumentoAnulado,"nuevo_button","Nuevo",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDocumentoAnulado,"modificar_button","Editar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDocumentoAnulado,"actualizar_button","Actualizar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDocumentoAnulado,"eliminar_button","Eliminar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDocumentoAnulado,"cancelar_button","Cancelar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDocumentoAnulado,"guardarcambios_button","Guardar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDocumentoAnulado,"guardarcambiostabla_button","Guardar",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDocumentoAnulado,"cerrar_button","Salir",this.documentoanuladoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDocumentoAnulado.setToolTipText("Nuevo"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDocumentoAnulado.setToolTipText("Editar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDocumentoAnulado.setToolTipText("Actualizar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDocumentoAnulado.setToolTipText("Eliminar)"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDocumentoAnulado.setToolTipText("Cancelar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDocumentoAnulado.setToolTipText("Guardar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDocumentoAnulado.setToolTipText("Guardar"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDocumentoAnulado.setToolTipText("Salir"+" "+DocumentoAnuladoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDocumentoAnulado";
		inputMap = this.jButtonNuevoDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDocumentoAnulado.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDocumentoAnulado"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDocumentoAnulado";
		inputMap = this.jButtonActualizarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDocumentoAnulado"));
		
		//ELIMINAR
		sMapKey = "EliminarDocumentoAnulado";
		inputMap = this.jButtonEliminarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDocumentoAnulado"));
		
		//CANCELAR	
		sMapKey = "CancelarDocumentoAnulado";
		inputMap = this.jButtonCancelarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDocumentoAnulado"));
		
		//CERRAR		
		sMapKey = "CerrarDocumentoAnulado";
		inputMap = this.jButtonCerrarDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDocumentoAnulado"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDocumentoAnulado";
		inputMap = this.jButtonGuardarCambiosTablaDocumentoAnulado.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDocumentoAnulado.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDocumentoAnulado"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDocumentoAnulado = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDocumentoAnulado.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDocumentoAnulado.setToolTipText("Nuevo DocumentoAnulado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDocumentoAnulado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDocumentoAnulado.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDocumentoAnulado.setToolTipText("Sin Cerrar Ventana DocumentoAnulado");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDocumentoAnulado = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDocumentoAnulado.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDocumentoAnulado.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDocumentoAnulado.setText("Accion");
		this.jComboBoxTiposAccionesDocumentoAnulado.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDocumentoAnulado = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDocumentoAnulado.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDocumentoAnulado.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDocumentoAnulado = new JLabelMe();
		
		this.jLabelAccionesDocumentoAnulado.setText("Acciones");		
		this.jLabelAccionesDocumentoAnulado.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDocumentoAnulado.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDocumentoAnulado.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDocumentoAnulado();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDocumentoAnulado();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDocumentoAnulado=new JTabbedPane();
		this.jTabbedPaneRelacionesDocumentoAnulado.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDocumentoAnulado,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDocumentoAnulado.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDocumentoAnulado.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDocumentoAnulado.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDocumentoAnulado.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDocumentoAnulado.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDocumentoAnulado.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDocumentoAnulado, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDocumentoAnulado = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDocumentoAnulado = new GridBagLayout();
		
		this.jPanelCamposDocumentoAnulado.setLayout(gridaBagLayoutCamposDocumentoAnulado);
		this.jPanelCamposOcultosDocumentoAnulado.setLayout(gridaBagLayoutCamposOcultosDocumentoAnulado);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDocumentoAnulado.add(jLabelIdDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDocumentoAnulado.add(jLabelidDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDocumentoAnulado.add(jLabelid_empresaDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDocumentoAnulado.add(jButtonid_empresaDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 3;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDocumentoAnulado.add(jButtonid_empresaDocumentoAnuladoUpdate, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDocumentoAnulado.add(jComboBoxid_empresaDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_periodo_declaraDocumentoAnulado.add(jLabelid_periodo_declaraDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraDocumentoAnulado.add(jButtonid_periodo_declaraDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 3;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_periodo_declaraDocumentoAnulado.add(jButtonid_periodo_declaraDocumentoAnuladoUpdate, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_periodo_declaraDocumentoAnulado.add(jComboBoxid_periodo_declaraDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloDocumentoAnulado.add(jLabelid_moduloDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDocumentoAnulado.add(jButtonid_moduloDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 3;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDocumentoAnulado.add(jButtonid_moduloDocumentoAnuladoUpdate, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloDocumentoAnulado.add(jComboBoxid_moduloDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_comprobanteDocumentoAnulado.add(jLabelid_tipo_comprobanteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteDocumentoAnulado.add(jButtonid_tipo_comprobanteDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 3;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_comprobanteDocumentoAnulado.add(jButtonid_tipo_comprobanteDocumentoAnuladoUpdate, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_comprobanteDocumentoAnulado.add(jComboBoxid_tipo_comprobanteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumeroDocumentoAnulado.add(jLabelnumeroDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumeroDocumentoAnulado.add(jButtonnumeroDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumeroDocumentoAnulado.add(jTextFieldnumeroDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelserieDocumentoAnulado.add(jLabelserieDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelserieDocumentoAnulado.add(jButtonserieDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelserieDocumentoAnulado.add(jTextFieldserieDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelautorizacionDocumentoAnulado.add(jLabelautorizacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelautorizacionDocumentoAnulado.add(jButtonautorizacionDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelautorizacionDocumentoAnulado.add(jTextFieldautorizacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_anulacionDocumentoAnulado.add(jLabelfecha_anulacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		//this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = 2;
		this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
		this.gridBagConstraintsDocumentoAnulado.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_anulacionDocumentoAnulado.add(jButtonfecha_anulacionDocumentoAnuladoBusqueda, this.gridBagConstraintsDocumentoAnulado);
	}

	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDocumentoAnulado.gridy = 0;
	this.gridBagConstraintsDocumentoAnulado.gridx = 1;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_anulacionDocumentoAnulado.add(jDateChooserfecha_anulacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelidDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelid_periodo_declaraDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelid_tipo_comprobanteDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelnumeroDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelserieDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelautorizacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDocumentoAnulado.add(this.jPanelfecha_anulacionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposDocumentoAnulado % 1==0) {
		iXPanelCamposDocumentoAnulado=0;
		iYPanelCamposDocumentoAnulado++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposOcultosDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposOcultosDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDocumentoAnulado.add(this.jPanelid_empresaDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposOcultosDocumentoAnulado % 1==0) {
		iXPanelCamposOcultosDocumentoAnulado=0;
		iYPanelCamposOcultosDocumentoAnulado++;
	}
	this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDocumentoAnulado.gridy = iYPanelCamposOcultosDocumentoAnulado;
	this.gridBagConstraintsDocumentoAnulado.gridx = iXPanelCamposOcultosDocumentoAnulado++;
	this.gridBagConstraintsDocumentoAnulado.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDocumentoAnulado.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDocumentoAnulado.add(this.jPanelid_moduloDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);



	if(iXPanelCamposOcultosDocumentoAnulado % 1==0) {
		iXPanelCamposOcultosDocumentoAnulado=0;
		iYPanelCamposOcultosDocumentoAnulado++;
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
			
		GridBagLayout gridaBagLayoutAccionesDocumentoAnulado= new GridBagLayout();
		this.jPanelAccionesDocumentoAnulado.setLayout(gridaBagLayoutAccionesDocumentoAnulado);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDocumentoAnulado= new GridBagLayout();
		this.jPanelAccionesFormularioDocumentoAnulado.setLayout(gridaBagLayoutAccionesFormularioDocumentoAnulado);
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDocumentoAnulado.add(this.jComboBoxTiposAccionesFormularioDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDocumentoAnulado.add(this.jCheckBoxPostAccionNuevoDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDocumentoAnulado.add(this.jCheckBoxPostAccionSinCerrarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.documentoanuladoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.documentoanuladoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDocumentoAnulado.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDocumentoAnulado.add(this.jCheckBoxPostAccionSinMensajeDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccion++;
			
		this.jPanelAccionesDocumentoAnulado.add(this.jButtonModificarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);							

		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;
		this.gridBagConstraintsDocumentoAnulado.gridx =iPosXAccion++;
			
		this.jPanelAccionesDocumentoAnulado.add(this.jButtonEliminarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
			
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDocumentoAnulado.add(this.jButtonActualizarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);


		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;		
		this.gridBagConstraintsDocumentoAnulado.gridx = iPosXAccion++;
		
		this.jPanelAccionesDocumentoAnulado.add(this.jButtonGuardarCambiosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);	
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = 0;		
		this.gridBagConstraintsDocumentoAnulado.gridx =iPosXAccion++;
		
		this.jPanelAccionesDocumentoAnulado.add(this.jButtonCancelarDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDocumentoAnulado = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDocumentoAnulado);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.documentoanuladoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();						
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;		
			//this.gridBagConstraintsDocumentoAnulado.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDocumentoAnulado.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDocumentoAnulado.gridx =0;
		this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDocumentoAnulado.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DocumentoAnuladoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDocumentoAnulado = new DocumentoAnuladoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Documento Anulado DATOS");
			
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
			
	        //this.setTitle("[FOR] - Documento Anulado DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Documento Anulado Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DocumentoAnuladoModel documentoanuladoModel=new DocumentoAnuladoModel(this);
			
			//SI USARA CLASE INTERNA
			//DocumentoAnuladoModel.DocumentoAnuladoFocusTraversalPolicy documentoanuladoFocusTraversalPolicy = documentoanuladoModel.new DocumentoAnuladoFocusTraversalPolicy(this);
			
			//documentoanuladoFocusTraversalPolicy.setdocumentoanuladoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(documentoanuladoModel);
			
			
			this.jContentPaneDetalleDocumentoAnulado = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDocumentoAnulado = new GridBagLayout();	
			this.jContentPaneDetalleDocumentoAnulado.setLayout(gridaBagLayoutDetalleDocumentoAnulado);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDocumentoAnulado = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
				this.gridBagConstraintsDocumentoAnulado.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDocumentoAnulado.gridx = 0;
					
				
				this.jContentPaneDetalleDocumentoAnulado.add(jTtoolBarDetalleDocumentoAnulado, gridBagConstraintsDocumentoAnulado);								
				
}
			
			this.jScrollPanelDatosEdicionDocumentoAnulado=   new JScrollPane(jContentPaneDetalleDocumentoAnulado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDocumentoAnulado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDocumentoAnulado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDocumentoAnulado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDocumentoAnulado=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDocumentoAnulado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDocumentoAnulado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDocumentoAnulado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDocumentoAnulado.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	        
			this.jContentPaneDetalleDocumentoAnulado.add(jPanelCamposDocumentoAnulado, gridBagConstraintsDocumentoAnulado);
			
			
			
			
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
						&& documentoanuladoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.documentoanuladoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDocumentoAnulado= new GridBagConstraints();
						this.gridBagConstraintsDocumentoAnulado.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDocumentoAnulado.gridx = 0;
						this.jContentPaneDetalleDocumentoAnulado.add(this.jTabbedPaneRelacionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDocumentoAnulado.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDocumentoAnulado.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
					this.gridBagConstraintsDocumentoAnulado.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDocumentoAnulado.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDocumentoAnulado.gridx = 0;
					
				
					this.jContentPaneDetalleDocumentoAnulado.add(jPanelCamposOcultosDocumentoAnulado, gridBagConstraintsDocumentoAnulado);
				
					this.jPanelCamposOcultosDocumentoAnulado.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	        this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDocumentoAnulado.add(this.jPanelAccionesFormularioDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);							
			
			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
	        this.gridBagConstraintsDocumentoAnulado.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDocumentoAnulado.gridx = 0;
	        
			
			this.jContentPaneDetalleDocumentoAnulado.add(this.jPanelAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDocumentoAnulado);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDocumentoAnulado=   new JScrollPane(this.jPanelCamposDocumentoAnulado,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDocumentoAnulado.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDocumentoAnulado.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDocumentoAnulado.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;
			this.gridBagConstraintsDocumentoAnulado.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDocumentoAnulado.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDocumentoAnulado.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);			
			
			this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
			this.gridBagConstraintsDocumentoAnulado.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDocumentoAnulado.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
			
			
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		
			
		this.gridBagConstraintsDocumentoAnulado = new GridBagConstraints();
		this.gridBagConstraintsDocumentoAnulado.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDocumentoAnulado.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDocumentoAnulado, this.gridBagConstraintsDocumentoAnulado);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDocumentoAnulado;//jContentPane;
		
		return jScrollPanelDatosEdicionDocumentoAnulado;
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
