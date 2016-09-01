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
package com.bydan.erp.seguridad.presentation.swing.jinternalframes;



import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;



//import com.bydan.erp.seguridad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.seguridad.util.AuditoriaConstantesFunciones;

import com.bydan.erp.seguridad.business.logic.*;
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
public class AuditoriaDetalleFormJInternalFrame extends AuditoriaBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAuditoria;
	
	protected JMenuBar jmenuBarDetalleAuditoria;
	
	protected JMenu jmenuDetalleAuditoria;
	protected JMenu jmenuDetalleArchivoAuditoria;
	protected JMenu jmenuDetalleAccionesAuditoria;
	protected JMenu jmenuDetalleDatosAuditoria;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAuditoria;	
	protected GridBagConstraints gridBagConstraintsAuditoria;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AuditoriaBeanSwingJInternalFrameAdditional jInternalFrameDetalleAuditoria;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected UsuarioBeanSwingJInternalFrame usuarioBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_usuario="";
	
	public AuditoriaSessionBean auditoriaSessionBean;
	
	

	public AuditoriaDetalleBeanSwingJInternalFrame auditoriadetalleBeanSwingJInternalFrame=null;
	public AuditoriaDetalleBeanSwingJInternalFrame auditoriadetalleBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteAuditoriaDetalle=false;
	public AuditoriaDetalleSessionBean auditoriadetalleSessionBean;
	
	
	public UsuarioSessionBean usuarioSessionBean;	
	
	public AuditoriaLogic auditoriaLogic;
	
	public JScrollPane jScrollPanelDatosAuditoria;
	public JScrollPane jScrollPanelDatosEdicionAuditoria;
	public JScrollPane jScrollPanelDatosGeneralAuditoria;
	
	protected JPanel jPanelCamposAuditoria;    
	protected JPanel jPanelCamposOcultosAuditoria;    	
	protected JPanel jPanelAccionesAuditoria;
	protected JPanel jPanelAccionesFormularioAuditoria;
    
	
	
	protected Integer iXPanelCamposAuditoria=0;
	protected Integer iYPanelCamposAuditoria=0;
	
	protected Integer iXPanelCamposOcultosAuditoria=0;
	protected Integer iYPanelCamposOcultosAuditoria=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAuditoria;
	public JButton jButtonModificarAuditoria;
	public JButton jButtonActualizarAuditoria;
    public JButton jButtonEliminarAuditoria;
	public JButton jButtonCancelarAuditoria;
    public JButton jButtonGuardarCambiosAuditoria;
	public JButton jButtonGuardarCambiosTablaAuditoria;
	protected JButton jButtonCerrarAuditoria;
	
	
	protected JButton jButtonProcesarInformacionAuditoria;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAuditoria;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAuditoria;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAuditoria;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAuditoria;
	protected JButton jButtonModificarToolBarAuditoria;
	protected JButton jButtonActualizarToolBarAuditoria;
    protected JButton jButtonEliminarToolBarAuditoria;
	protected JButton jButtonCancelarToolBarAuditoria;
    protected JButton jButtonGuardarCambiosToolBarAuditoria;
	protected JButton jButtonGuardarCambiosTablaToolBarAuditoria;
	protected JButton jButtonMostrarOcultarTablaToolBarAuditoria;
	protected JButton jButtonCerrarToolBarAuditoria;
	
	protected JButton jButtonProcesarInformacionToolBarAuditoria;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAuditoria;
	protected JMenuItem jMenuItemModificarAuditoria;
	protected JMenuItem jMenuItemActualizarAuditoria;
    protected JMenuItem jMenuItemEliminarAuditoria;
	protected JMenuItem jMenuItemCancelarAuditoria;
    protected JMenuItem jMenuItemGuardarCambiosAuditoria;
	protected JMenuItem jMenuItemGuardarCambiosTablaAuditoria;
	protected JMenuItem jMenuItemCerrarAuditoria;
	protected JMenuItem jMenuItemDetalleCerrarAuditoria;
	protected JMenuItem jMenuItemDetalleMostarOcultarAuditoria;
	
	protected JMenuItem jMenuItemProcesarInformacionAuditoria;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAuditoria;
	protected JMenuItem jMenuItemMostrarOcultarAuditoria;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAuditoria;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAuditoria;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAuditoria;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAuditoria;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAuditoria;
	public JLabel jLabelIdAuditoria;
	public JLabel jLabelidAuditoria;
	public JButton jButtonidAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_tablaAuditoria;
	public JLabel jLabelnombre_tablaAuditoria;
	public JTextArea jTextAreanombre_tablaAuditoria;
	public JScrollPane jscrollPanenombre_tablaAuditoria;
	public JButton jButtonnombre_tablaAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelid_filaAuditoria;
	public JLabel jLabelid_filaAuditoria;
	public JTextField jTextFieldid_filaAuditoria;
	public JButton jButtonid_filaAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelaccionAuditoria;
	public JLabel jLabelaccionAuditoria;
	public JTextField jTextFieldaccionAuditoria;
	public JButton jButtonaccionAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelprocesoAuditoria;
	public JLabel jLabelprocesoAuditoria;
	public JTextArea jTextAreaprocesoAuditoria;
	public JScrollPane jscrollPaneprocesoAuditoria;
	public JButton jButtonprocesoAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelnombre_p_cAuditoria;
	public JLabel jLabelnombre_p_cAuditoria;
	public JTextField jTextFieldnombre_p_cAuditoria;
	public JButton jButtonnombre_p_cAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelip_pcAuditoria;
	public JLabel jLabelip_pcAuditoria;
	public JTextField jTextFieldip_pcAuditoria;
	public JButton jButtonip_pcAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelusuario_p_cAuditoria;
	public JLabel jLabelusuario_p_cAuditoria;
	public JTextField jTextFieldusuario_p_cAuditoria;
	public JButton jButtonusuario_p_cAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelfecha_horaAuditoria;
	public JLabel jLabelfecha_horaAuditoria;
	//public JFormattedTextField jDateChooserfecha_horaAuditoria;

	public JPanelDateTimeMe jDateChooserfecha_horaAuditoria;
	public JButton jButtonfecha_horaAuditoriaBusqueda= new JButtonMe();

	public JPanel jPanelobservacionAuditoria;
	public JLabel jLabelobservacionAuditoria;
	public JTextArea jTextAreaobservacionAuditoria;
	public JScrollPane jscrollPaneobservacionAuditoria;
	public JButton jButtonobservacionAuditoriaBusqueda= new JButtonMe();

	
	public JPanel jPanelid_usuarioAuditoria;
	public JLabel jLabelid_usuarioAuditoria;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_usuarioAuditoria;
	public JButton jButtonid_usuarioAuditoria= new JButtonMe();
	public JButton jButtonid_usuarioAuditoriaUpdate= new JButtonMe();
	public JButton jButtonid_usuarioAuditoriaBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAuditoria;
	
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
	public int iHeightFormulario=1166;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AuditoriaDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAuditoria=new JPanel();
				this.jPanelAccionesFormularioAuditoria=new JPanel();
				this.jmenuBarDetalleAuditoria=new JMenuBar();
				this.jTtoolBarDetalleAuditoria=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AuditoriaDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AuditoriaDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("Auditoria No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAuditoria() {
		return this.jButtonActualizarToolBarAuditoria;
	}
	
	public JButton getjButtonEliminarToolBarAuditoria() {
		return this.jButtonEliminarToolBarAuditoria;
	}
	
	public JButton getjButtonCancelarToolBarAuditoria() {
		return this.jButtonCancelarToolBarAuditoria;
	}		
	
	public JButton getjButtonProcesarInformacionAuditoria() {
		return this.jButtonProcesarInformacionAuditoria;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAuditoria)	{
		this.jButtonProcesarInformacionAuditoria = jButtonProcesarInformacionAuditoria;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAuditoria() {
		return this.jComboBoxTiposAccionesAuditoria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAuditoria(
			JComboBox jComboBoxTiposRelacionesAuditoria) {
		this.jComboBoxTiposRelacionesAuditoria = jComboBoxTiposRelacionesAuditoria;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAuditoria(
			JComboBox jComboBoxTiposAccionesAuditoria) {
		this.jComboBoxTiposAccionesAuditoria = jComboBoxTiposAccionesAuditoria;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAuditoria() {
		return this.jComboBoxTiposAccionesFormularioAuditoria;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAuditoria(
			JComboBox jComboBoxTiposAccionesFormularioAuditoria) {
		this.jComboBoxTiposAccionesFormularioAuditoria = jComboBoxTiposAccionesFormularioAuditoria;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.auditoriaSessionBean=new AuditoriaSessionBean();
		
		this.auditoriaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.auditoriaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.auditoriaSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AuditoriaJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Auditoria MANTENIMIENTO"));
		
		
		if(iWidth > 1150) {
			iWidth=1150;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
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
	
		AuditoriaJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAuditoria= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAuditoria=new JButtonMe();
				this.jButtonModificarToolBarAuditoria=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAuditoria,this.jTtoolBarDetalleAuditoria,
							"actualizar","actualizar","Actualizar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAuditoria,this.jTtoolBarDetalleAuditoria,
							"eliminar","eliminar","Eliminar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAuditoria,this.jTtoolBarDetalleAuditoria,
							"cancelar","cancelar","Cancelar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAuditoria=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAuditoria,this.jTtoolBarDetalleAuditoria,
							"guardarcambios","guardarcambios","Guardar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAuditoria=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAuditoria=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAuditoria=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAuditoria=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAuditoria=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAuditoria= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAuditoria.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAuditoria,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAuditoria= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAuditoria.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAuditoria,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAuditoria= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAuditoria.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAuditoria,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAuditoria= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAuditoria.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAuditoria,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAuditoria= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAuditoria.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAuditoria,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAuditoria= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAuditoria.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAuditoria,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAuditoria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAuditoria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAuditoria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAuditoria= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAuditoria.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAuditoria,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAuditoria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAuditoria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAuditoria,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAuditoria= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAuditoria.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAuditoria,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAuditoria.add(this.jMenuItemDetalleCerrarAuditoria);
		
		this.jmenuDetalleAccionesAuditoria.add(this.jMenuItemActualizarAuditoria);
		this.jmenuDetalleAccionesAuditoria.add(this.jMenuItemEliminarAuditoria);
		this.jmenuDetalleAccionesAuditoria.add(this.jMenuItemCancelarAuditoria);		
		
		//this.jmenuDetalleDatosAuditoria.add(this.jMenuItemDetalleAbrirOrderByAuditoria);				
		this.jmenuDetalleDatosAuditoria.add(this.jMenuItemDetalleMostarOcultarAuditoria);				
				
		//this.jmenuDetalleAccionesAuditoria.add(this.jMenuItemGuardarCambiosAuditoria);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAuditoria.add(this.jmenuDetalleArchivoAuditoria);		
		this.jmenuBarDetalleAuditoria.add(this.jmenuDetalleAccionesAuditoria);		
		this.jmenuBarDetalleAuditoria.add(this.jmenuDetalleDatosAuditoria);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleAuditoria.add(this.jmenuDetalleAuditoria);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAuditoria);				
	}
	
	
	public void inicializarElementosCamposAuditoria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAuditoria = new JLabelMe();
		jLabelIdAuditoria.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAuditoria = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAuditoria= new GridBagLayout();

		this.jPanelidAuditoria.setLayout(this.gridaBagLayoutAuditoria);

		jLabelidAuditoria = new JLabel();
		jLabelidAuditoria.setText("Id");

		jLabelidAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombre_tablaAuditoria = new JLabelMe();
		this.jLabelnombre_tablaAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_NOMBRETABLA+" : *");
		this.jLabelnombre_tablaAuditoria.setToolTipText("Nombre De La Tabla");
		this.jLabelnombre_tablaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tablaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnombre_tablaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_tablaAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_tablaAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_tablaAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_NOMBRETABLA);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelnombre_tablaAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextAreanombre_tablaAuditoria= new JTextAreaMe();
		jTextAreanombre_tablaAuditoria.setEnabled(false);
		jTextAreanombre_tablaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tablaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tablaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombre_tablaAuditoria.setLineWrap(true);
		jTextAreanombre_tablaAuditoria.setWrapStyleWord(true);
		jTextAreanombre_tablaAuditoria.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombre_tablaAuditoria.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreanombre_tablaAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombre_tablaAuditoria = new JScrollPane(jTextAreanombre_tablaAuditoria);
		jscrollPanenombre_tablaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tablaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombre_tablaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombre_tablaAuditoriaBusqueda= new JButtonMe();
		this.jButtonnombre_tablaAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tablaAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_tablaAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_tablaAuditoriaBusqueda.setText("U");
		this.jButtonnombre_tablaAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_tablaAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_tablaAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombre_tablaAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombre_tablaAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_tablaAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_tablaAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelid_filaAuditoria = new JLabelMe();
		this.jLabelid_filaAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_IDFILA+" : *");
		this.jLabelid_filaAuditoria.setToolTipText("Fila");
		this.jLabelid_filaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_filaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_filaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_filaAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_filaAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_filaAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_IDFILA);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelid_filaAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextFieldid_filaAuditoria= new JTextFieldMe();
		jTextFieldid_filaAuditoria.setEnabled(false);
		jTextFieldid_filaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_filaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldid_filaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldid_filaAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldid_filaAuditoria.setText("0");

		this.jButtonid_filaAuditoriaBusqueda= new JButtonMe();
		this.jButtonid_filaAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_filaAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_filaAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_filaAuditoriaBusqueda.setText("U");
		this.jButtonid_filaAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_filaAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_filaAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldid_filaAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldid_filaAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_filaAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_filaAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelaccionAuditoria = new JLabelMe();
		this.jLabelaccionAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_ACCION+" : *");
		this.jLabelaccionAuditoria.setToolTipText("Accion");
		this.jLabelaccionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaccionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelaccionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelaccionAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelaccionAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelaccionAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_ACCION);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelaccionAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextFieldaccionAuditoria= new JTextFieldMe();

		jTextFieldaccionAuditoria.setEnabled(false);
		jTextFieldaccionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaccionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldaccionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldaccionAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonaccionAuditoriaBusqueda= new JButtonMe();
		this.jButtonaccionAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaccionAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonaccionAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonaccionAuditoriaBusqueda.setText("U");
		this.jButtonaccionAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonaccionAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonaccionAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldaccionAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldaccionAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"accionAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonaccionAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelprocesoAuditoria = new JLabelMe();
		this.jLabelprocesoAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_PROCESO+" : *");
		this.jLabelprocesoAuditoria.setToolTipText("Proceso");
		this.jLabelprocesoAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocesoAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelprocesoAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelprocesoAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelprocesoAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelprocesoAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_PROCESO);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelprocesoAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextAreaprocesoAuditoria= new JTextAreaMe();
		jTextAreaprocesoAuditoria.setEnabled(false);
		jTextAreaprocesoAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocesoAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocesoAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaprocesoAuditoria.setLineWrap(true);
		jTextAreaprocesoAuditoria.setWrapStyleWord(true);
		jTextAreaprocesoAuditoria.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaprocesoAuditoria.setRows(5);

		FuncionesSwing.setBoldTextArea(jTextAreaprocesoAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneprocesoAuditoria = new JScrollPane(jTextAreaprocesoAuditoria);
		jscrollPaneprocesoAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocesoAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPaneprocesoAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonprocesoAuditoriaBusqueda= new JButtonMe();
		this.jButtonprocesoAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocesoAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonprocesoAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonprocesoAuditoriaBusqueda.setText("U");
		this.jButtonprocesoAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonprocesoAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonprocesoAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaprocesoAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaprocesoAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"procesoAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonprocesoAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelnombre_p_cAuditoria = new JLabelMe();
		this.jLabelnombre_p_cAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_NOMBREPC+" : *");
		this.jLabelnombre_p_cAuditoria.setToolTipText("Nombre De Pc");
		this.jLabelnombre_p_cAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_p_cAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombre_p_cAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombre_p_cAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombre_p_cAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombre_p_cAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_NOMBREPC);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelnombre_p_cAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextFieldnombre_p_cAuditoria= new JTextFieldMe();

		jTextFieldnombre_p_cAuditoria.setEnabled(false);
		jTextFieldnombre_p_cAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_p_cAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombre_p_cAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombre_p_cAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombre_p_cAuditoriaBusqueda= new JButtonMe();
		this.jButtonnombre_p_cAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_p_cAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombre_p_cAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombre_p_cAuditoriaBusqueda.setText("U");
		this.jButtonnombre_p_cAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombre_p_cAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombre_p_cAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombre_p_cAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombre_p_cAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombre_p_cAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombre_p_cAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelip_pcAuditoria = new JLabelMe();
		this.jLabelip_pcAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_IPPC+" : *");
		this.jLabelip_pcAuditoria.setToolTipText("Ip Del Pc");
		this.jLabelip_pcAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelip_pcAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelip_pcAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelip_pcAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelip_pcAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelip_pcAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_IPPC);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelip_pcAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextFieldip_pcAuditoria= new JTextFieldMe();

		jTextFieldip_pcAuditoria.setEnabled(false);
		jTextFieldip_pcAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldip_pcAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldip_pcAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldip_pcAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonip_pcAuditoriaBusqueda= new JButtonMe();
		this.jButtonip_pcAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonip_pcAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonip_pcAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonip_pcAuditoriaBusqueda.setText("U");
		this.jButtonip_pcAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonip_pcAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonip_pcAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldip_pcAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldip_pcAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"ip_pcAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonip_pcAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelusuario_p_cAuditoria = new JLabelMe();
		this.jLabelusuario_p_cAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_USUARIOPC+" : *");
		this.jLabelusuario_p_cAuditoria.setToolTipText("Usuario Del Pc");
		this.jLabelusuario_p_cAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelusuario_p_cAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelusuario_p_cAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelusuario_p_cAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelusuario_p_cAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelusuario_p_cAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_USUARIOPC);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelusuario_p_cAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextFieldusuario_p_cAuditoria= new JTextFieldMe();

		jTextFieldusuario_p_cAuditoria.setEnabled(false);
		jTextFieldusuario_p_cAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldusuario_p_cAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldusuario_p_cAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldusuario_p_cAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonusuario_p_cAuditoriaBusqueda= new JButtonMe();
		this.jButtonusuario_p_cAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonusuario_p_cAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonusuario_p_cAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonusuario_p_cAuditoriaBusqueda.setText("U");
		this.jButtonusuario_p_cAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonusuario_p_cAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonusuario_p_cAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldusuario_p_cAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldusuario_p_cAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"usuario_p_cAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonusuario_p_cAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelfecha_horaAuditoria = new JLabelMe();
		this.jLabelfecha_horaAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_FECHAHORA+" : *");
		this.jLabelfecha_horaAuditoria.setToolTipText("Fecha Y Hora");
		this.jLabelfecha_horaAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_horaAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_horaAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_horaAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_horaAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_horaAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_FECHAHORA);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelfecha_horaAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		//jFormattedTextFieldfecha_horaAuditoria= new JFormattedTextFieldMe();

		jDateChooserfecha_horaAuditoria= new JPanelDateTimeMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		jDateChooserfecha_horaAuditoria.setEnabled(false);
		jDateChooserfecha_horaAuditoria.setMinimumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaAuditoria.setMaximumSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaAuditoria.setPreferredSize(new Dimension(FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL*2,85),Constantes.ISWING_ALTO_CONTROL+ Constantes.ISWING_ALTO_FILA_TABLA_EXTRA_FECHA));
		jDateChooserfecha_horaAuditoria.setDate(new Timestamp((new Date()).getTime()));
		jDateChooserfecha_horaAuditoria.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_horaAuditoria.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_horaAuditoriaBusqueda= new JButtonMe();
		this.jButtonfecha_horaAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_horaAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_horaAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_horaAuditoriaBusqueda.setText("U");
		this.jButtonfecha_horaAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_horaAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_horaAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_horaAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_horaAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_horaAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_horaAuditoriaBusqueda.setVisible(false);		}


					
		this.jLabelobservacionAuditoria = new JLabelMe();
		this.jLabelobservacionAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_OBSERVACION+" : *");
		this.jLabelobservacionAuditoria.setToolTipText("Observacion");
		this.jLabelobservacionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelobservacionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelobservacionAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelobservacionAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelobservacionAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_OBSERVACION);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelobservacionAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jTextAreaobservacionAuditoria= new JTextAreaMe();
		jTextAreaobservacionAuditoria.setEnabled(false);
		jTextAreaobservacionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreaobservacionAuditoria.setLineWrap(true);
		jTextAreaobservacionAuditoria.setWrapStyleWord(true);
		jTextAreaobservacionAuditoria.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreaobservacionAuditoria.setRows(8);

		FuncionesSwing.setBoldTextArea(jTextAreaobservacionAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPaneobservacionAuditoria = new JScrollPane(jTextAreaobservacionAuditoria);
		jscrollPaneobservacionAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));
		jscrollPaneobservacionAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70 + FuncionesSwing.getValorProporcion(70,0)));

		this.jButtonobservacionAuditoriaBusqueda= new JButtonMe();
		this.jButtonobservacionAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonobservacionAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonobservacionAuditoriaBusqueda.setText("U");
		this.jButtonobservacionAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonobservacionAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonobservacionAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreaobservacionAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreaobservacionAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"observacionAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonobservacionAuditoriaBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAuditoria() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_usuarioAuditoria = new JLabelMe();
		this.jLabelid_usuarioAuditoria.setText(""+AuditoriaConstantesFunciones.LABEL_IDUSUARIO+" : *");
		this.jLabelid_usuarioAuditoria.setToolTipText("Usuario");
		this.jLabelid_usuarioAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_usuarioAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-13),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_usuarioAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_usuarioAuditoria=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_usuarioAuditoria.setToolTipText(AuditoriaConstantesFunciones.LABEL_IDUSUARIO);
		this.gridaBagLayoutAuditoria = new GridBagLayout();
		this.jPanelid_usuarioAuditoria.setLayout(this.gridaBagLayoutAuditoria);


		jComboBoxid_usuarioAuditoria= new JComboBoxMe();
		jComboBoxid_usuarioAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_usuarioAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_usuarioAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_usuarioAuditoria.setEnabled(false);

		this.jButtonid_usuarioAuditoria= new JButtonMe();
		this.jButtonid_usuarioAuditoria.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAuditoria.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAuditoria.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_usuarioAuditoria.setText("Buscar");
		this.jButtonid_usuarioAuditoria.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_usuarioAuditoria.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAuditoria,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_usuarioAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAuditoria"));

		this.jButtonid_usuarioAuditoriaBusqueda= new JButtonMe();
		this.jButtonid_usuarioAuditoriaBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAuditoriaBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAuditoriaBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAuditoriaBusqueda.setText("U");
		this.jButtonid_usuarioAuditoriaBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_usuarioAuditoriaBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAuditoriaBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_usuarioAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAuditoriaBusqueda"));

		if(this.auditoriaSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_usuarioAuditoriaBusqueda.setVisible(false);		}

		this.jButtonid_usuarioAuditoriaUpdate= new JButtonMe();
		this.jButtonid_usuarioAuditoriaUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAuditoriaUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_usuarioAuditoriaUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_usuarioAuditoriaUpdate.setText("U");
		this.jButtonid_usuarioAuditoriaUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_usuarioAuditoriaUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_usuarioAuditoriaUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_usuarioAuditoria.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_usuarioAuditoria.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_usuarioAuditoriaUpdate"));



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
		//this.jInternalFrameDetalleAuditoria = new AuditoriaBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Auditoria DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAuditoria= new GridBagLayout();
		

		
		String sToolTipAuditoria="";
		sToolTipAuditoria=AuditoriaConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAuditoria+="(Seguridad.Auditoria)";
		}
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			sToolTipAuditoria+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAuditoria = new JButtonMe();
		this.jButtonModificarAuditoria = new JButtonMe();
        this.jButtonActualizarAuditoria = new JButtonMe();
        this.jButtonEliminarAuditoria = new JButtonMe();
        this.jButtonCancelarAuditoria = new JButtonMe();
        this.jButtonGuardarCambiosAuditoria = new JButtonMe();
		this.jButtonGuardarCambiosTablaAuditoria = new JButtonMe();
		this.jButtonCerrarAuditoria = new JButtonMe();
		
		this.jScrollPanelDatosAuditoria = new JScrollPane();   
        this.jScrollPanelDatosEdicionAuditoria = new JScrollPane();
		this.jScrollPanelDatosGeneralAuditoria = new JScrollPane();
				
		
		
		this.jPanelCamposAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Auditoria";
		
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Auditorias" + this.sPath));
		} else {
			this.jScrollPanelDatosAuditoria.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAuditoria.setName("jPanelCamposAuditoria"); 

		this.jPanelCamposOcultosAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAuditoria.setName("jPanelCamposOcultosAuditoria"); 

        this.jPanelAccionesAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAuditoria.setToolTipText("Acciones");
        this.jPanelAccionesAuditoria.setName("Acciones"); 

		this.jPanelAccionesFormularioAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAuditoria.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAuditoria.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAuditoria.setText("Nuevo");
		this.jButtonModificarAuditoria.setText("Editar");
        this.jButtonActualizarAuditoria.setText("Actualizar");
        this.jButtonEliminarAuditoria.setText("Eliminar");
        this.jButtonCancelarAuditoria.setText("Cancelar");
        this.jButtonGuardarCambiosAuditoria.setText("Guardar");
		this.jButtonGuardarCambiosTablaAuditoria.setText("Guardar");
		this.jButtonCerrarAuditoria.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAuditoria,"nuevo_button","Nuevo",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAuditoria,"modificar_button","Editar",this.auditoriaSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAuditoria,"actualizar_button","Actualizar",this.auditoriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAuditoria,"eliminar_button","Eliminar",this.auditoriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAuditoria,"cancelar_button","Cancelar",this.auditoriaSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAuditoria,"guardarcambios_button","Guardar",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAuditoria,"guardarcambiostabla_button","Guardar",this.auditoriaSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAuditoria,"cerrar_button","Salir",this.auditoriaSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAuditoria.setToolTipText("Nuevo"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAuditoria.setToolTipText("Editar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAuditoria.setToolTipText("Actualizar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAuditoria.setToolTipText("Eliminar)"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAuditoria.setToolTipText("Cancelar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAuditoria.setToolTipText("Guardar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAuditoria.setToolTipText("Guardar"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAuditoria.setToolTipText("Salir"+" "+AuditoriaConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAuditoria";
		inputMap = this.jButtonNuevoAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAuditoria.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAuditoria"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAuditoria";
		inputMap = this.jButtonActualizarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAuditoria"));
		
		//ELIMINAR
		sMapKey = "EliminarAuditoria";
		inputMap = this.jButtonEliminarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAuditoria"));
		
		//CANCELAR	
		sMapKey = "CancelarAuditoria";
		inputMap = this.jButtonCancelarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAuditoria"));
		
		//CERRAR		
		sMapKey = "CerrarAuditoria";
		inputMap = this.jButtonCerrarAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAuditoria"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAuditoria";
		inputMap = this.jButtonGuardarCambiosTablaAuditoria.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAuditoria.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAuditoria"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAuditoria = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAuditoria.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAuditoria.setToolTipText("Nuevo Auditoria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAuditoria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAuditoria.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAuditoria.setToolTipText("Sin Cerrar Ventana Auditoria");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAuditoria = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAuditoria.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAuditoria.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAuditoria.setText("Accion");
		this.jComboBoxTiposAccionesAuditoria.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAuditoria = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAuditoria.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAuditoria.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAuditoria = new JLabelMe();
		
		this.jLabelAccionesAuditoria.setText("Acciones");		
		this.jLabelAccionesAuditoria.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoria.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAuditoria.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAuditoria();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAuditoria();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAuditoria=new JTabbedPane();
		this.jTabbedPaneRelacionesAuditoria.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAuditoria,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAuditoria.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoria.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAuditoria.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAuditoria, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAuditoria.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAuditoria.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAuditoria.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAuditoria, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAuditoria = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAuditoria = new GridBagLayout();
		
		this.jPanelCamposAuditoria.setLayout(gridaBagLayoutCamposAuditoria);
		this.jPanelCamposOcultosAuditoria.setLayout(gridaBagLayoutCamposOcultosAuditoria);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAuditoria.add(jLabelIdAuditoria, this.gridBagConstraintsAuditoria);



	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAuditoria.add(jLabelidAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_usuarioAuditoria.add(jLabelid_usuarioAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAuditoria.add(jButtonid_usuarioAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 3;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_usuarioAuditoria.add(jButtonid_usuarioAuditoriaUpdate, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_usuarioAuditoria.add(jComboBoxid_usuarioAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_tablaAuditoria.add(jLabelnombre_tablaAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_tablaAuditoria.add(jButtonnombre_tablaAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_tablaAuditoria.add(jscrollPanenombre_tablaAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_filaAuditoria.add(jLabelid_filaAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_filaAuditoria.add(jButtonid_filaAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_filaAuditoria.add(jTextFieldid_filaAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelaccionAuditoria.add(jLabelaccionAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelaccionAuditoria.add(jButtonaccionAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelaccionAuditoria.add(jTextFieldaccionAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelprocesoAuditoria.add(jLabelprocesoAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelprocesoAuditoria.add(jButtonprocesoAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelprocesoAuditoria.add(jscrollPaneprocesoAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombre_p_cAuditoria.add(jLabelnombre_p_cAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombre_p_cAuditoria.add(jButtonnombre_p_cAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombre_p_cAuditoria.add(jTextFieldnombre_p_cAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelip_pcAuditoria.add(jLabelip_pcAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelip_pcAuditoria.add(jButtonip_pcAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelip_pcAuditoria.add(jTextFieldip_pcAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelusuario_p_cAuditoria.add(jLabelusuario_p_cAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelusuario_p_cAuditoria.add(jButtonusuario_p_cAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelusuario_p_cAuditoria.add(jTextFieldusuario_p_cAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_horaAuditoria.add(jLabelfecha_horaAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_horaAuditoria.add(jButtonfecha_horaAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_horaAuditoria.add(jDateChooserfecha_horaAuditoria, this.gridBagConstraintsAuditoria);


	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 0;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelobservacionAuditoria.add(jLabelobservacionAuditoria, this.gridBagConstraintsAuditoria);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		//this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = 2;
		this.gridBagConstraintsAuditoria.ipadx = 0;
		this.gridBagConstraintsAuditoria.insets = new Insets(0, 0, 0, 0);
		this.jPanelobservacionAuditoria.add(jButtonobservacionAuditoriaBusqueda, this.gridBagConstraintsAuditoria);
	}

	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAuditoria.gridy = 0;
	this.gridBagConstraintsAuditoria.gridx = 1;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelobservacionAuditoria.add(jscrollPaneobservacionAuditoria, this.gridBagConstraintsAuditoria);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelidAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelnombre_tablaAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelid_filaAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelaccionAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelprocesoAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelnombre_p_cAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelip_pcAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelusuario_p_cAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelfecha_horaAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAuditoria.add(this.jPanelobservacionAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposAuditoria % 1==0) {
		iXPanelCamposAuditoria=0;
		iYPanelCamposAuditoria++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAuditoria = new GridBagConstraints();
	this.gridBagConstraintsAuditoria.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAuditoria.gridy = iYPanelCamposOcultosAuditoria;
	this.gridBagConstraintsAuditoria.gridx = iXPanelCamposOcultosAuditoria++;
	this.gridBagConstraintsAuditoria.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAuditoria.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAuditoria.add(this.jPanelid_usuarioAuditoria, this.gridBagConstraintsAuditoria);



	if(iXPanelCamposOcultosAuditoria % 1==0) {
		iXPanelCamposOcultosAuditoria=0;
		iYPanelCamposOcultosAuditoria++;
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
			
		GridBagLayout gridaBagLayoutAccionesAuditoria= new GridBagLayout();
		this.jPanelAccionesAuditoria.setLayout(gridaBagLayoutAccionesAuditoria);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAuditoria= new GridBagLayout();
		this.jPanelAccionesFormularioAuditoria.setLayout(gridaBagLayoutAccionesFormularioAuditoria);
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAuditoria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAuditoria.add(this.jComboBoxTiposAccionesFormularioAuditoria, this.gridBagConstraintsAuditoria);

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAuditoria.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAuditoria.add(this.jCheckBoxPostAccionNuevoAuditoria, this.gridBagConstraintsAuditoria);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAuditoria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAuditoria.add(this.jCheckBoxPostAccionSinCerrarAuditoria, this.gridBagConstraintsAuditoria);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.auditoriaSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.auditoriaSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAuditoria.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAuditoria.add(this.jCheckBoxPostAccionSinMensajeAuditoria, this.gridBagConstraintsAuditoria);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx = iPosXAccion++;
			
		this.jPanelAccionesAuditoria.add(this.jButtonModificarAuditoria, this.gridBagConstraintsAuditoria);							

		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAuditoria.gridy = 0;
		this.gridBagConstraintsAuditoria.gridx =iPosXAccion++;
			
		this.jPanelAccionesAuditoria.add(this.jButtonEliminarAuditoria, this.gridBagConstraintsAuditoria);
		
			
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = 0;		
		this.gridBagConstraintsAuditoria.gridx = iPosXAccion++;
		
		this.jPanelAccionesAuditoria.add(this.jButtonActualizarAuditoria, this.gridBagConstraintsAuditoria);


		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = 0;		
		this.gridBagConstraintsAuditoria.gridx = iPosXAccion++;
		
		this.jPanelAccionesAuditoria.add(this.jButtonGuardarCambiosAuditoria, this.gridBagConstraintsAuditoria);	
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = 0;		
		this.gridBagConstraintsAuditoria.gridx =iPosXAccion++;
		
		this.jPanelAccionesAuditoria.add(this.jButtonCancelarAuditoria, this.gridBagConstraintsAuditoria);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAuditoria = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAuditoria);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.auditoriaSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAuditoria = new GridBagConstraints();						
			this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAuditoria.gridx = 0;		
			//this.gridBagConstraintsAuditoria.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAuditoria.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAuditoria.gridx =0;
		this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAuditoria.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAuditoria, this.gridBagConstraintsAuditoria);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AuditoriaJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAuditoria = new AuditoriaBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Auditoria DATOS");
			
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
			
	        //this.setTitle("[FOR] - Auditoria DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Auditoria Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AuditoriaModel auditoriaModel=new AuditoriaModel(this);
			
			//SI USARA CLASE INTERNA
			//AuditoriaModel.AuditoriaFocusTraversalPolicy auditoriaFocusTraversalPolicy = auditoriaModel.new AuditoriaFocusTraversalPolicy(this);
			
			//auditoriaFocusTraversalPolicy.setauditoriaJInternalFrame(this);
			
			this.setFocusTraversalPolicy(auditoriaModel);
			
			
			this.jContentPaneDetalleAuditoria = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAuditoria = new GridBagLayout();	
			this.jContentPaneDetalleAuditoria.setLayout(gridaBagLayoutDetalleAuditoria);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAuditoria = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAuditoria = new GridBagConstraints();
				this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAuditoria.gridx = 0;
					
				
				this.jContentPaneDetalleAuditoria.add(jTtoolBarDetalleAuditoria, gridBagConstraintsAuditoria);								
				
}
			
			this.jScrollPanelDatosEdicionAuditoria=   new JScrollPane(jContentPaneDetalleAuditoria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAuditoria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAuditoria=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAuditoria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAuditoria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAuditoria.gridx = 0;
	        
			this.jContentPaneDetalleAuditoria.add(jPanelCamposAuditoria, gridBagConstraintsAuditoria);
			
			
			
			
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
						&& auditoriaSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameAuditoriaDetalle(this.puedeCargarPorParteAuditoriaDetalle,false,-1);
					
					if(this.auditoriaSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAuditoria= new GridBagConstraints();
						this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAuditoria.gridx = 0;
						this.jContentPaneDetalleAuditoria.add(this.jTabbedPaneRelacionesAuditoria, this.gridBagConstraintsAuditoria);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAuditoria.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameAuditoriaDetalle(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAuditoria.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAuditoria = new GridBagConstraints();
					this.gridBagConstraintsAuditoria.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAuditoria.gridx = 0;
					
				
					this.jContentPaneDetalleAuditoria.add(jPanelCamposOcultosAuditoria, gridBagConstraintsAuditoria);
				
					this.jPanelCamposOcultosAuditoria.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsAuditoria.gridx = 0;
	        this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAuditoria.add(this.jPanelAccionesFormularioAuditoria, this.gridBagConstraintsAuditoria);							
			
			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
	        this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsAuditoria.gridx = 0;
	        
			
			this.jContentPaneDetalleAuditoria.add(this.jPanelAccionesAuditoria, this.gridBagConstraintsAuditoria);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAuditoria);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAuditoria=   new JScrollPane(this.jPanelCamposAuditoria,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAuditoria.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoria.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAuditoria.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAuditoria.gridx = 0;
			this.gridBagConstraintsAuditoria.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAuditoria.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAuditoria.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAuditoria, this.gridBagConstraintsAuditoria);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAuditoria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAuditoria, this.gridBagConstraintsAuditoria);			
			
			this.gridBagConstraintsAuditoria = new GridBagConstraints();
			this.gridBagConstraintsAuditoria.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAuditoria.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAuditoria, this.gridBagConstraintsAuditoria);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAuditoria, this.gridBagConstraintsAuditoria);
			
			
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAuditoria, this.gridBagConstraintsAuditoria);
		
			
		this.gridBagConstraintsAuditoria = new GridBagConstraints();
		this.gridBagConstraintsAuditoria.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAuditoria.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAuditoria, this.gridBagConstraintsAuditoria);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAuditoria;//jContentPane;
		
		return jScrollPanelDatosEdicionAuditoria;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameAuditoriaDetalle(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.auditoriadetalleSessionBean=new AuditoriaDetalleSessionBean();
		this.auditoriadetalleSessionBean.setConGuardarRelaciones(false);
		this.auditoriadetalleSessionBean.setEsGuardarRelacionado(true);

		this.auditoriadetalleBeanSwingJInternalFrame=null;//new AuditoriaDetalleBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.auditoriadetalleBeanSwingJInternalFramePopup=new AuditoriaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.auditoriadetalleBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {

				AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL=AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL;
				AuditoriaDetalleJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=AuditoriaJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.auditoriadetalleSessionBean.setEsGuardarRelacionado(true);

				this.auditoriadetalleBeanSwingJInternalFrame=new AuditoriaDetalleBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.auditoriadetalleBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.auditoriadetalleBeanSwingJInternalFrame.setauditoriadetalleSessionBean(this.auditoriadetalleSessionBean);

				//this.gridBagConstraintsAuditoria = new GridBagConstraints();
				//this.gridBagConstraintsAuditoria.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsAuditoria.gridx = 0;
				//this.jContentPaneDetalleAuditoria.add(this.auditoriadetalleBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsAuditoria);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesAuditoria.add("Auditoria Detalles",this.auditoriadetalleBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesAuditoria.setComponentAt(iIndexTab,this.auditoriadetalleBeanSwingJInternalFrame.getContentPane());
				}

				//AuditoriaDetalleJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.auditoriadetalleSessionBean.setEsGuardarRelacionado(false);
				this.auditoriadetalleBeanSwingJInternalFrame=null;//new AuditoriaDetalleBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.auditoriadetalleSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteAuditoriaDetalle) {
					this.jTabbedPaneRelacionesAuditoria.add("Auditoria Detalles",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarAuditoriaDetalleBeanSwingJInternalFrame(List<Auditoria> auditorias,Auditoria auditoria,AuditoriaDetalleBeanSwingJInternalFrame auditoriadetalleBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//auditoriadetalleBeanSwingJInternalFrame=new AuditoriaDetalleBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					auditoriadetalleBeanSwingJInternalFrame.getAuditoriaDetalleLogic().setConnexion(this.auditoriaLogic.getConnexion());

					auditoriadetalleBeanSwingJInternalFrame.setauditoriasForeignKey(auditorias);
					auditoriadetalleBeanSwingJInternalFrame.setauditoriaForeignKey(auditoria);
					auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.setisBusquedaDesdeForeignKeySesionAuditoria(true);
					auditoriadetalleBeanSwingJInternalFrame.auditoriadetalleSessionBean.setlidAuditoriaActual(auditoria.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					auditoriadetalleBeanSwingJInternalFrame.cargarCombosForeignKeyAuditoriaDetalle(auditoriadetalleBeanSwingJInternalFrame.isCargarCombosDependencia);
					auditoriadetalleBeanSwingJInternalFrame.setVisibilidadBusquedasParaAuditoria(true);
					auditoriadetalleBeanSwingJInternalFrame.setid_auditoriaFK_IdAuditoria(auditoria.getId());

					if(!this.conCargarFormDetalle) {
						auditoriadetalleBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					auditoriadetalleBeanSwingJInternalFrame.setSelectedItemCombosFrameAuditoriaForeignKey(auditoria,1,false,true,true);
					auditoriadetalleBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					auditoriadetalleBeanSwingJInternalFrame.procesarBusqueda("FK_IdAuditoria");
					auditoriadetalleBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdAuditoria");
					auditoriadetalleBeanSwingJInternalFrame.inicializarActualizarBindingTablaAuditoriaDetalle(true);
					auditoriadetalleBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesAuditoriaDetalle("n",auditoriadetalleBeanSwingJInternalFrame.isGuardarCambiosEnLote, auditoriadetalleBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					auditoriadetalleBeanSwingJInternalFrame.setAutoscrolls(true);
					auditoriadetalleBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						auditoriadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsAuditoriaDetalle("relacionado");
					} else {
						auditoriadetalleBeanSwingJInternalFrame.actualizarEstadoPanelsAuditoriaDetalle("no_relacionado");
					}

					auditoriadetalleBeanSwingJInternalFrame.getjButtonRecargarInformacionAuditoriaDetalle().setVisible(false);

			}
			catch(Exception e)
			{
				throw e;
			}
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
