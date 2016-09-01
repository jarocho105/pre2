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
package com.bydan.erp.contabilidad.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.contabilidad.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.contabilidad.util.DetalleDocumentoConstantesFunciones;

import com.bydan.erp.contabilidad.business.logic.*;
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
public class DetalleDocumentoDetalleFormJInternalFrame extends DetalleDocumentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleDetalleDocumento;
	
	protected JMenuBar jmenuBarDetalleDetalleDocumento;
	
	protected JMenu jmenuDetalleDetalleDocumento;
	protected JMenu jmenuDetalleArchivoDetalleDocumento;
	protected JMenu jmenuDetalleAccionesDetalleDocumento;
	protected JMenu jmenuDetalleDatosDetalleDocumento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutDetalleDocumento;	
	protected GridBagConstraints gridBagConstraintsDetalleDocumento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected DetalleDocumentoBeanSwingJInternalFrameAdditional jInternalFrameDetalleDetalleDocumento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected ModuloBeanSwingJInternalFrame moduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_modulo="";

	protected TipoTransaccionModuloBeanSwingJInternalFrame tipotransaccionmoduloBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipotransaccionmodulo="";

	protected TipoDetalleDocumentoBeanSwingJInternalFrame tipodetalledocumentoBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodetalledocumento="";
	
	public DetalleDocumentoSessionBean detalledocumentoSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public ModuloSessionBean moduloSessionBean;
	public TipoTransaccionModuloSessionBean tipotransaccionmoduloSessionBean;
	public TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean;	
	
	public DetalleDocumentoLogic detalledocumentoLogic;
	
	public JScrollPane jScrollPanelDatosDetalleDocumento;
	public JScrollPane jScrollPanelDatosEdicionDetalleDocumento;
	public JScrollPane jScrollPanelDatosGeneralDetalleDocumento;
	
	protected JPanel jPanelCamposDetalleDocumento;    
	protected JPanel jPanelCamposOcultosDetalleDocumento;    	
	protected JPanel jPanelAccionesDetalleDocumento;
	protected JPanel jPanelAccionesFormularioDetalleDocumento;
    
	
	
	protected Integer iXPanelCamposDetalleDocumento=0;
	protected Integer iYPanelCamposDetalleDocumento=0;
	
	protected Integer iXPanelCamposOcultosDetalleDocumento=0;
	protected Integer iYPanelCamposOcultosDetalleDocumento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoDetalleDocumento;
	public JButton jButtonModificarDetalleDocumento;
	public JButton jButtonActualizarDetalleDocumento;
    public JButton jButtonEliminarDetalleDocumento;
	public JButton jButtonCancelarDetalleDocumento;
    public JButton jButtonGuardarCambiosDetalleDocumento;
	public JButton jButtonGuardarCambiosTablaDetalleDocumento;
	protected JButton jButtonCerrarDetalleDocumento;
	
	
	protected JButton jButtonProcesarInformacionDetalleDocumento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoDetalleDocumento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarDetalleDocumento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeDetalleDocumento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarDetalleDocumento;
	protected JButton jButtonModificarToolBarDetalleDocumento;
	protected JButton jButtonActualizarToolBarDetalleDocumento;
    protected JButton jButtonEliminarToolBarDetalleDocumento;
	protected JButton jButtonCancelarToolBarDetalleDocumento;
    protected JButton jButtonGuardarCambiosToolBarDetalleDocumento;
	protected JButton jButtonGuardarCambiosTablaToolBarDetalleDocumento;
	protected JButton jButtonMostrarOcultarTablaToolBarDetalleDocumento;
	protected JButton jButtonCerrarToolBarDetalleDocumento;
	
	protected JButton jButtonProcesarInformacionToolBarDetalleDocumento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoDetalleDocumento;
	protected JMenuItem jMenuItemModificarDetalleDocumento;
	protected JMenuItem jMenuItemActualizarDetalleDocumento;
    protected JMenuItem jMenuItemEliminarDetalleDocumento;
	protected JMenuItem jMenuItemCancelarDetalleDocumento;
    protected JMenuItem jMenuItemGuardarCambiosDetalleDocumento;
	protected JMenuItem jMenuItemGuardarCambiosTablaDetalleDocumento;
	protected JMenuItem jMenuItemCerrarDetalleDocumento;
	protected JMenuItem jMenuItemDetalleCerrarDetalleDocumento;
	protected JMenuItem jMenuItemDetalleMostarOcultarDetalleDocumento;
	
	protected JMenuItem jMenuItemProcesarInformacionDetalleDocumento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosDetalleDocumento;
	protected JMenuItem jMenuItemMostrarOcultarDetalleDocumento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesDetalleDocumento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesDetalleDocumento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioDetalleDocumento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidDetalleDocumento;
	public JLabel jLabelIdDetalleDocumento;
	public JLabel jLabelidDetalleDocumento;
	public JButton jButtonidDetalleDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelnombreDetalleDocumento;
	public JLabel jLabelnombreDetalleDocumento;
	public JTextField jTextFieldnombreDetalleDocumento;
	public JButton jButtonnombreDetalleDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaDetalleDocumento;
	public JLabel jLabelid_empresaDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaDetalleDocumento;
	public JButton jButtonid_empresaDetalleDocumento= new JButtonMe();
	public JButton jButtonid_empresaDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_empresaDetalleDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelid_moduloDetalleDocumento;
	public JLabel jLabelid_moduloDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_moduloDetalleDocumento;
	public JButton jButtonid_moduloDetalleDocumento= new JButtonMe();
	public JButton jButtonid_moduloDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_moduloDetalleDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_transaccion_moduloDetalleDocumento;
	public JLabel jLabelid_tipo_transaccion_moduloDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_transaccion_moduloDetalleDocumento;
	public JButton jButtonid_tipo_transaccion_moduloDetalleDocumento= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_detalle_documentoDetalleDocumento;
	public JLabel jLabelid_tipo_detalle_documentoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_detalle_documentoDetalleDocumento;
	public JButton jButtonid_tipo_detalle_documentoDetalleDocumento= new JButtonMe();
	public JButton jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesDetalleDocumento;
	
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
	public int iHeightFormulario=374;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public DetalleDocumentoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposDetalleDocumento=new JPanel();
				this.jPanelAccionesFormularioDetalleDocumento=new JPanel();
				this.jmenuBarDetalleDetalleDocumento=new JMenuBar();
				this.jTtoolBarDetalleDetalleDocumento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public DetalleDocumentoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public DetalleDocumentoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("DetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarDetalleDocumento() {
		return this.jButtonActualizarToolBarDetalleDocumento;
	}
	
	public JButton getjButtonEliminarToolBarDetalleDocumento() {
		return this.jButtonEliminarToolBarDetalleDocumento;
	}
	
	public JButton getjButtonCancelarToolBarDetalleDocumento() {
		return this.jButtonCancelarToolBarDetalleDocumento;
	}		
	
	public JButton getjButtonProcesarInformacionDetalleDocumento() {
		return this.jButtonProcesarInformacionDetalleDocumento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionDetalleDocumento)	{
		this.jButtonProcesarInformacionDetalleDocumento = jButtonProcesarInformacionDetalleDocumento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesDetalleDocumento() {
		return this.jComboBoxTiposAccionesDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesDetalleDocumento(
			JComboBox jComboBoxTiposRelacionesDetalleDocumento) {
		this.jComboBoxTiposRelacionesDetalleDocumento = jComboBoxTiposRelacionesDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesDetalleDocumento(
			JComboBox jComboBoxTiposAccionesDetalleDocumento) {
		this.jComboBoxTiposAccionesDetalleDocumento = jComboBoxTiposAccionesDetalleDocumento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioDetalleDocumento() {
		return this.jComboBoxTiposAccionesFormularioDetalleDocumento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioDetalleDocumento(
			JComboBox jComboBoxTiposAccionesFormularioDetalleDocumento) {
		this.jComboBoxTiposAccionesFormularioDetalleDocumento = jComboBoxTiposAccionesFormularioDetalleDocumento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		
		this.detalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.detalledocumentoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		DetalleDocumentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Detalle Documento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
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
	
		DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleDetalleDocumento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarDetalleDocumento=new JButtonMe();
				this.jButtonModificarToolBarDetalleDocumento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarDetalleDocumento,this.jTtoolBarDetalleDetalleDocumento,
							"actualizar","actualizar","Actualizar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarDetalleDocumento,this.jTtoolBarDetalleDetalleDocumento,
							"eliminar","eliminar","Eliminar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarDetalleDocumento,this.jTtoolBarDetalleDetalleDocumento,
							"cancelar","cancelar","Cancelar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarDetalleDocumento,this.jTtoolBarDetalleDetalleDocumento,
							"guardarcambios","guardarcambios","Guardar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleDetalleDocumento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleDetalleDocumento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoDetalleDocumento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesDetalleDocumento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosDetalleDocumento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoDetalleDocumento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoDetalleDocumento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoDetalleDocumento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarDetalleDocumento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarDetalleDocumento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarDetalleDocumento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarDetalleDocumento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarDetalleDocumento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarDetalleDocumento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarDetalleDocumento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarDetalleDocumento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarDetalleDocumento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarDetalleDocumento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarDetalleDocumento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarDetalleDocumento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosDetalleDocumento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosDetalleDocumento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosDetalleDocumento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarDetalleDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarDetalleDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarDetalleDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarDetalleDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarDetalleDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarDetalleDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoDetalleDocumento.add(this.jMenuItemDetalleCerrarDetalleDocumento);
		
		this.jmenuDetalleAccionesDetalleDocumento.add(this.jMenuItemActualizarDetalleDocumento);
		this.jmenuDetalleAccionesDetalleDocumento.add(this.jMenuItemEliminarDetalleDocumento);
		this.jmenuDetalleAccionesDetalleDocumento.add(this.jMenuItemCancelarDetalleDocumento);		
		
		//this.jmenuDetalleDatosDetalleDocumento.add(this.jMenuItemDetalleAbrirOrderByDetalleDocumento);				
		this.jmenuDetalleDatosDetalleDocumento.add(this.jMenuItemDetalleMostarOcultarDetalleDocumento);				
				
		//this.jmenuDetalleAccionesDetalleDocumento.add(this.jMenuItemGuardarCambiosDetalleDocumento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleDetalleDocumento.add(this.jmenuDetalleArchivoDetalleDocumento);		
		this.jmenuBarDetalleDetalleDocumento.add(this.jmenuDetalleAccionesDetalleDocumento);		
		this.jmenuBarDetalleDetalleDocumento.add(this.jmenuDetalleDatosDetalleDocumento);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleDetalleDocumento);				
	}
	
	
	public void inicializarElementosCamposDetalleDocumento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdDetalleDocumento = new JLabelMe();
		jLabelIdDetalleDocumento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidDetalleDocumento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidDetalleDocumento.setToolTipText(DetalleDocumentoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutDetalleDocumento= new GridBagLayout();

		this.jPanelidDetalleDocumento.setLayout(this.gridaBagLayoutDetalleDocumento);

		jLabelidDetalleDocumento = new JLabel();
		jLabelidDetalleDocumento.setText("Id");

		jLabelidDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreDetalleDocumento = new JLabelMe();
		this.jLabelnombreDetalleDocumento.setText(""+DetalleDocumentoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreDetalleDocumento.setToolTipText("Nombre");
		this.jLabelnombreDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreDetalleDocumento.setToolTipText(DetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutDetalleDocumento = new GridBagLayout();
		this.jPanelnombreDetalleDocumento.setLayout(this.gridaBagLayoutDetalleDocumento);


		jTextFieldnombreDetalleDocumento= new JTextFieldMe();

		jTextFieldnombreDetalleDocumento.setEnabled(false);
		jTextFieldnombreDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnombreDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnombreDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnombreDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonnombreDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreDetalleDocumentoBusqueda.setText("U");
		this.jButtonnombreDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnombreDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnombreDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreDetalleDocumentoBusqueda"));

		if(this.detalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreDetalleDocumentoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysDetalleDocumento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaDetalleDocumento = new JLabelMe();
		this.jLabelid_empresaDetalleDocumento.setText(""+DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaDetalleDocumento.setToolTipText("Empresa");
		this.jLabelid_empresaDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaDetalleDocumento.setToolTipText(DetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutDetalleDocumento = new GridBagLayout();
		this.jPanelid_empresaDetalleDocumento.setLayout(this.gridaBagLayoutDetalleDocumento);


		jComboBoxid_empresaDetalleDocumento= new JComboBoxMe();
		jComboBoxid_empresaDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaDetalleDocumento.setEnabled(false);

		this.jButtonid_empresaDetalleDocumento= new JButtonMe();
		this.jButtonid_empresaDetalleDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaDetalleDocumento.setText("Buscar");
		this.jButtonid_empresaDetalleDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaDetalleDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleDocumento"));

		this.jButtonid_empresaDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonid_empresaDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleDocumentoBusqueda.setText("U");
		this.jButtonid_empresaDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleDocumentoBusqueda"));

		if(this.detalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaDetalleDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_empresaDetalleDocumentoUpdate= new JButtonMe();
		this.jButtonid_empresaDetalleDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaDetalleDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaDetalleDocumentoUpdate.setText("U");
		this.jButtonid_empresaDetalleDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaDetalleDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaDetalleDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaDetalleDocumentoUpdate"));



					
		this.jLabelid_moduloDetalleDocumento = new JLabelMe();
		this.jLabelid_moduloDetalleDocumento.setText(""+DetalleDocumentoConstantesFunciones.LABEL_IDMODULO+" : *");
		this.jLabelid_moduloDetalleDocumento.setToolTipText("Modulo");
		this.jLabelid_moduloDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_moduloDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_moduloDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_moduloDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_moduloDetalleDocumento.setToolTipText(DetalleDocumentoConstantesFunciones.LABEL_IDMODULO);
		this.gridaBagLayoutDetalleDocumento = new GridBagLayout();
		this.jPanelid_moduloDetalleDocumento.setLayout(this.gridaBagLayoutDetalleDocumento);


		jComboBoxid_moduloDetalleDocumento= new JComboBoxMe();
		jComboBoxid_moduloDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_moduloDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_moduloDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_moduloDetalleDocumento= new JButtonMe();
		this.jButtonid_moduloDetalleDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_moduloDetalleDocumento.setText("Buscar");
		this.jButtonid_moduloDetalleDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_moduloDetalleDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_moduloDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleDocumento"));

		this.jButtonid_moduloDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonid_moduloDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleDocumentoBusqueda.setText("U");
		this.jButtonid_moduloDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_moduloDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_moduloDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleDocumentoBusqueda"));

		if(this.detalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_moduloDetalleDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_moduloDetalleDocumentoUpdate= new JButtonMe();
		this.jButtonid_moduloDetalleDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_moduloDetalleDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_moduloDetalleDocumentoUpdate.setText("U");
		this.jButtonid_moduloDetalleDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_moduloDetalleDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_moduloDetalleDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_moduloDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_moduloDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_moduloDetalleDocumentoUpdate"));



					
		this.jLabelid_tipo_transaccion_moduloDetalleDocumento = new JLabelMe();
		this.jLabelid_tipo_transaccion_moduloDetalleDocumento.setText(""+DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO+" : *");
		this.jLabelid_tipo_transaccion_moduloDetalleDocumento.setToolTipText("Tipo Transaccion Modulo");
		this.jLabelid_tipo_transaccion_moduloDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_transaccion_moduloDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_transaccion_moduloDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_transaccion_moduloDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_transaccion_moduloDetalleDocumento.setToolTipText(DetalleDocumentoConstantesFunciones.LABEL_IDTIPOTRANSACCIONMODULO);
		this.gridaBagLayoutDetalleDocumento = new GridBagLayout();
		this.jPanelid_tipo_transaccion_moduloDetalleDocumento.setLayout(this.gridaBagLayoutDetalleDocumento);


		jComboBoxid_tipo_transaccion_moduloDetalleDocumento= new JComboBoxMe();
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_transaccion_moduloDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.setEnabled(false);

		this.jButtonid_tipo_transaccion_moduloDetalleDocumento= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumento.setText("Buscar");
		this.jButtonid_tipo_transaccion_moduloDetalleDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleDocumento"));

		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleDocumentoBusqueda"));

		if(this.detalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate= new JButtonMe();
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.setText("U");
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_transaccion_moduloDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_transaccion_moduloDetalleDocumentoUpdate"));



					
		this.jLabelid_tipo_detalle_documentoDetalleDocumento = new JLabelMe();
		this.jLabelid_tipo_detalle_documentoDetalleDocumento.setText(""+DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO+" : *");
		this.jLabelid_tipo_detalle_documentoDetalleDocumento.setToolTipText("T Detalle Documento");
		this.jLabelid_tipo_detalle_documentoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_detalle_documentoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelid_tipo_detalle_documentoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-9),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_detalle_documentoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_detalle_documentoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_detalle_documentoDetalleDocumento.setToolTipText(DetalleDocumentoConstantesFunciones.LABEL_IDTIPODETALLEDOCUMENTO);
		this.gridaBagLayoutDetalleDocumento = new GridBagLayout();
		this.jPanelid_tipo_detalle_documentoDetalleDocumento.setLayout(this.gridaBagLayoutDetalleDocumento);


		jComboBoxid_tipo_detalle_documentoDetalleDocumento= new JComboBoxMe();
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_detalle_documentoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_detalle_documentoDetalleDocumento= new JButtonMe();
		this.jButtonid_tipo_detalle_documentoDetalleDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_detalle_documentoDetalleDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_detalle_documentoDetalleDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_detalle_documentoDetalleDocumento.setText("Buscar");
		this.jButtonid_tipo_detalle_documentoDetalleDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_detalle_documentoDetalleDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_detalle_documentoDetalleDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_detalle_documentoDetalleDocumento"));

		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setText("U");
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_detalle_documentoDetalleDocumentoBusqueda"));

		if(this.detalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate= new JButtonMe();
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.setText("U");
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_detalle_documentoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_detalle_documentoDetalleDocumentoUpdate"));



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
		//this.jInternalFrameDetalleDetalleDocumento = new DetalleDocumentoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Detalle Documento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutDetalleDocumento= new GridBagLayout();
		

		
		String sToolTipDetalleDocumento="";
		sToolTipDetalleDocumento=DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipDetalleDocumento+="(Contabilidad.DetalleDocumento)";
		}
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipDetalleDocumento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoDetalleDocumento = new JButtonMe();
		this.jButtonModificarDetalleDocumento = new JButtonMe();
        this.jButtonActualizarDetalleDocumento = new JButtonMe();
        this.jButtonEliminarDetalleDocumento = new JButtonMe();
        this.jButtonCancelarDetalleDocumento = new JButtonMe();
        this.jButtonGuardarCambiosDetalleDocumento = new JButtonMe();
		this.jButtonGuardarCambiosTablaDetalleDocumento = new JButtonMe();
		this.jButtonCerrarDetalleDocumento = new JButtonMe();
		
		this.jScrollPanelDatosDetalleDocumento = new JScrollPane();   
        this.jScrollPanelDatosEdicionDetalleDocumento = new JScrollPane();
		this.jScrollPanelDatosGeneralDetalleDocumento = new JScrollPane();
				
		
		
		this.jPanelCamposDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Detalle Documento";
		
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Detalle Documentos" + this.sPath));
		} else {
			this.jScrollPanelDatosDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposDetalleDocumento.setName("jPanelCamposDetalleDocumento"); 

		this.jPanelCamposOcultosDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosDetalleDocumento.setName("jPanelCamposOcultosDetalleDocumento"); 

        this.jPanelAccionesDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesDetalleDocumento.setToolTipText("Acciones");
        this.jPanelAccionesDetalleDocumento.setName("Acciones"); 

		this.jPanelAccionesFormularioDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioDetalleDocumento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioDetalleDocumento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoDetalleDocumento.setText("Nuevo");
		this.jButtonModificarDetalleDocumento.setText("Editar");
        this.jButtonActualizarDetalleDocumento.setText("Actualizar");
        this.jButtonEliminarDetalleDocumento.setText("Eliminar");
        this.jButtonCancelarDetalleDocumento.setText("Cancelar");
        this.jButtonGuardarCambiosDetalleDocumento.setText("Guardar");
		this.jButtonGuardarCambiosTablaDetalleDocumento.setText("Guardar");
		this.jButtonCerrarDetalleDocumento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoDetalleDocumento,"nuevo_button","Nuevo",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarDetalleDocumento,"modificar_button","Editar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarDetalleDocumento,"actualizar_button","Actualizar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarDetalleDocumento,"eliminar_button","Eliminar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarDetalleDocumento,"cancelar_button","Cancelar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosDetalleDocumento,"guardarcambios_button","Guardar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaDetalleDocumento,"guardarcambiostabla_button","Guardar",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarDetalleDocumento,"cerrar_button","Salir",this.detalledocumentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoDetalleDocumento.setToolTipText("Nuevo"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarDetalleDocumento.setToolTipText("Editar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarDetalleDocumento.setToolTipText("Actualizar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarDetalleDocumento.setToolTipText("Eliminar)"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarDetalleDocumento.setToolTipText("Cancelar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosDetalleDocumento.setToolTipText("Guardar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaDetalleDocumento.setToolTipText("Guardar"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarDetalleDocumento.setToolTipText("Salir"+" "+DetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoDetalleDocumento";
		inputMap = this.jButtonNuevoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoDetalleDocumento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarDetalleDocumento";
		inputMap = this.jButtonActualizarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarDetalleDocumento"));
		
		//ELIMINAR
		sMapKey = "EliminarDetalleDocumento";
		inputMap = this.jButtonEliminarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarDetalleDocumento"));
		
		//CANCELAR	
		sMapKey = "CancelarDetalleDocumento";
		inputMap = this.jButtonCancelarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarDetalleDocumento"));
		
		//CERRAR		
		sMapKey = "CerrarDetalleDocumento";
		inputMap = this.jButtonCerrarDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarDetalleDocumento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaDetalleDocumento";
		inputMap = this.jButtonGuardarCambiosTablaDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaDetalleDocumento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoDetalleDocumento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoDetalleDocumento.setToolTipText("Nuevo DetalleDocumento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarDetalleDocumento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarDetalleDocumento.setToolTipText("Sin Cerrar Ventana DetalleDocumento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeDetalleDocumento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeDetalleDocumento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesDetalleDocumento.setText("Accion");
		this.jComboBoxTiposAccionesDetalleDocumento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioDetalleDocumento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioDetalleDocumento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesDetalleDocumento = new JLabelMe();
		
		this.jLabelAccionesDetalleDocumento.setText("Acciones");		
		this.jLabelAccionesDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposDetalleDocumento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysDetalleDocumento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesDetalleDocumento=new JTabbedPane();
		this.jTabbedPaneRelacionesDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioDetalleDocumento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleDocumento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioDetalleDocumento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposDetalleDocumento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosDetalleDocumento = new GridBagLayout();
		
		this.jPanelCamposDetalleDocumento.setLayout(gridaBagLayoutCamposDetalleDocumento);
		this.jPanelCamposOcultosDetalleDocumento.setLayout(gridaBagLayoutCamposOcultosDetalleDocumento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 0;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidDetalleDocumento.add(jLabelIdDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 1;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidDetalleDocumento.add(jLabelidDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 0;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaDetalleDocumento.add(jLabelid_empresaDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 2;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleDocumento.add(jButtonid_empresaDetalleDocumentoBusqueda, this.gridBagConstraintsDetalleDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 3;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaDetalleDocumento.add(jButtonid_empresaDetalleDocumentoUpdate, this.gridBagConstraintsDetalleDocumento);
	}

	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 1;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaDetalleDocumento.add(jComboBoxid_empresaDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 0;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_moduloDetalleDocumento.add(jLabelid_moduloDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 2;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleDocumento.add(jButtonid_moduloDetalleDocumentoBusqueda, this.gridBagConstraintsDetalleDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 3;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_moduloDetalleDocumento.add(jButtonid_moduloDetalleDocumentoUpdate, this.gridBagConstraintsDetalleDocumento);
	}

	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 1;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_moduloDetalleDocumento.add(jComboBoxid_moduloDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 0;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_transaccion_moduloDetalleDocumento.add(jLabelid_tipo_transaccion_moduloDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 2;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleDocumento.add(jButtonid_tipo_transaccion_moduloDetalleDocumentoBusqueda, this.gridBagConstraintsDetalleDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 3;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_transaccion_moduloDetalleDocumento.add(jButtonid_tipo_transaccion_moduloDetalleDocumentoUpdate, this.gridBagConstraintsDetalleDocumento);
	}

	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 1;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_transaccion_moduloDetalleDocumento.add(jComboBoxid_tipo_transaccion_moduloDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 0;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_detalle_documentoDetalleDocumento.add(jLabelid_tipo_detalle_documentoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 2;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_detalle_documentoDetalleDocumento.add(jButtonid_tipo_detalle_documentoDetalleDocumentoBusqueda, this.gridBagConstraintsDetalleDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 3;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_detalle_documentoDetalleDocumento.add(jButtonid_tipo_detalle_documentoDetalleDocumentoUpdate, this.gridBagConstraintsDetalleDocumento);
	}

	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 1;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_detalle_documentoDetalleDocumento.add(jComboBoxid_tipo_detalle_documentoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 0;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreDetalleDocumento.add(jLabelnombreDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = 2;
		this.gridBagConstraintsDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreDetalleDocumento.add(jButtonnombreDetalleDocumentoBusqueda, this.gridBagConstraintsDetalleDocumento);
	}

	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsDetalleDocumento.gridy = 0;
	this.gridBagConstraintsDetalleDocumento.gridx = 1;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreDetalleDocumento.add(jTextFieldnombreDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDocumento.gridy = iYPanelCamposDetalleDocumento;
	this.gridBagConstraintsDetalleDocumento.gridx = iXPanelCamposDetalleDocumento++;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDocumento.add(this.jPanelidDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(iXPanelCamposDetalleDocumento % 1==0) {
		iXPanelCamposDetalleDocumento=0;
		iYPanelCamposDetalleDocumento++;
	}
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDocumento.gridy = iYPanelCamposDetalleDocumento;
	this.gridBagConstraintsDetalleDocumento.gridx = iXPanelCamposDetalleDocumento++;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDocumento.add(this.jPanelid_moduloDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(iXPanelCamposDetalleDocumento % 1==0) {
		iXPanelCamposDetalleDocumento=0;
		iYPanelCamposDetalleDocumento++;
	}
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDocumento.gridy = iYPanelCamposDetalleDocumento;
	this.gridBagConstraintsDetalleDocumento.gridx = iXPanelCamposDetalleDocumento++;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDocumento.add(this.jPanelid_tipo_detalle_documentoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(iXPanelCamposDetalleDocumento % 1==0) {
		iXPanelCamposDetalleDocumento=0;
		iYPanelCamposDetalleDocumento++;
	}
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDocumento.gridy = iYPanelCamposDetalleDocumento;
	this.gridBagConstraintsDetalleDocumento.gridx = iXPanelCamposDetalleDocumento++;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposDetalleDocumento.add(this.jPanelnombreDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(iXPanelCamposDetalleDocumento % 1==0) {
		iXPanelCamposDetalleDocumento=0;
		iYPanelCamposDetalleDocumento++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDocumento.gridy = iYPanelCamposOcultosDetalleDocumento;
	this.gridBagConstraintsDetalleDocumento.gridx = iXPanelCamposOcultosDetalleDocumento++;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleDocumento.add(this.jPanelid_empresaDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(iXPanelCamposOcultosDetalleDocumento % 1==0) {
		iXPanelCamposOcultosDetalleDocumento=0;
		iYPanelCamposOcultosDetalleDocumento++;
	}
	this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsDetalleDocumento.gridy = iYPanelCamposOcultosDetalleDocumento;
	this.gridBagConstraintsDetalleDocumento.gridx = iXPanelCamposOcultosDetalleDocumento++;
	this.gridBagConstraintsDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosDetalleDocumento.add(this.jPanelid_tipo_transaccion_moduloDetalleDocumento, this.gridBagConstraintsDetalleDocumento);



	if(iXPanelCamposOcultosDetalleDocumento % 1==0) {
		iXPanelCamposOcultosDetalleDocumento=0;
		iYPanelCamposOcultosDetalleDocumento++;
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
			
		GridBagLayout gridaBagLayoutAccionesDetalleDocumento= new GridBagLayout();
		this.jPanelAccionesDetalleDocumento.setLayout(gridaBagLayoutAccionesDetalleDocumento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioDetalleDocumento= new GridBagLayout();
		this.jPanelAccionesFormularioDetalleDocumento.setLayout(gridaBagLayoutAccionesFormularioDetalleDocumento);
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleDocumento.add(this.jComboBoxTiposAccionesFormularioDetalleDocumento, this.gridBagConstraintsDetalleDocumento);

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioDetalleDocumento.add(this.jCheckBoxPostAccionNuevoDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleDocumento.add(this.jCheckBoxPostAccionSinCerrarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.detalledocumentoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.detalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioDetalleDocumento.add(this.jCheckBoxPostAccionSinMensajeDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccion++;
			
		this.jPanelAccionesDetalleDocumento.add(this.jButtonModificarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);							

		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsDetalleDocumento.gridy = 0;
		this.gridBagConstraintsDetalleDocumento.gridx =iPosXAccion++;
			
		this.jPanelAccionesDetalleDocumento.add(this.jButtonEliminarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
			
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = 0;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleDocumento.add(this.jButtonActualizarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);


		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = 0;		
		this.gridBagConstraintsDetalleDocumento.gridx = iPosXAccion++;
		
		this.jPanelAccionesDetalleDocumento.add(this.jButtonGuardarCambiosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);	
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = 0;		
		this.gridBagConstraintsDetalleDocumento.gridx =iPosXAccion++;
		
		this.jPanelAccionesDetalleDocumento.add(this.jButtonCancelarDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutDetalleDocumento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutDetalleDocumento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();						
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsDetalleDocumento.gridx = 0;		
			//this.gridBagConstraintsDetalleDocumento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsDetalleDocumento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsDetalleDocumento.gridx =0;
		this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsDetalleDocumento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(DetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleDetalleDocumento = new DetalleDocumentoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Detalle Documento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Detalle Documento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Documento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			DetalleDocumentoModel detalledocumentoModel=new DetalleDocumentoModel(this);
			
			//SI USARA CLASE INTERNA
			//DetalleDocumentoModel.DetalleDocumentoFocusTraversalPolicy detalledocumentoFocusTraversalPolicy = detalledocumentoModel.new DetalleDocumentoFocusTraversalPolicy(this);
			
			//detalledocumentoFocusTraversalPolicy.setdetalledocumentoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(detalledocumentoModel);
			
			
			this.jContentPaneDetalleDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleDetalleDocumento = new GridBagLayout();	
			this.jContentPaneDetalleDetalleDocumento.setLayout(gridaBagLayoutDetalleDetalleDocumento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosDetalleDocumento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsDetalleDocumento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsDetalleDocumento.gridx = 0;
					
				
				this.jContentPaneDetalleDetalleDocumento.add(jTtoolBarDetalleDetalleDocumento, gridBagConstraintsDetalleDocumento);								
				
}
			
			this.jScrollPanelDatosEdicionDetalleDocumento=   new JScrollPane(jContentPaneDetalleDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralDetalleDocumento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsDetalleDocumento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsDetalleDocumento.gridx = 0;
	        
			this.jContentPaneDetalleDetalleDocumento.add(jPanelCamposDetalleDocumento, gridBagConstraintsDetalleDocumento);
			
			
			
			
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
						&& detalledocumentoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.detalledocumentoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsDetalleDocumento= new GridBagConstraints();
						this.gridBagConstraintsDetalleDocumento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsDetalleDocumento.gridx = 0;
						this.jContentPaneDetalleDetalleDocumento.add(this.jTabbedPaneRelacionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesDetalleDocumento.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosDetalleDocumento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
					this.gridBagConstraintsDetalleDocumento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsDetalleDocumento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsDetalleDocumento.gridx = 0;
					
				
					this.jContentPaneDetalleDetalleDocumento.add(jPanelCamposOcultosDetalleDocumento, gridBagConstraintsDetalleDocumento);
				
					this.jPanelCamposOcultosDetalleDocumento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsDetalleDocumento.gridx = 0;
	        this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleDetalleDocumento.add(this.jPanelAccionesFormularioDetalleDocumento, this.gridBagConstraintsDetalleDocumento);							
			
			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
	        this.gridBagConstraintsDetalleDocumento.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsDetalleDocumento.gridx = 0;
	        
			
			this.jContentPaneDetalleDetalleDocumento.add(this.jPanelAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionDetalleDocumento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionDetalleDocumento=   new JScrollPane(this.jPanelCamposDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsDetalleDocumento.gridx = 0;
			this.gridBagConstraintsDetalleDocumento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsDetalleDocumento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsDetalleDocumento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleDocumento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioDetalleDocumento, this.gridBagConstraintsDetalleDocumento);			
			
			this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsDetalleDocumento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsDetalleDocumento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
			
			
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		
			
		this.gridBagConstraintsDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsDetalleDocumento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsDetalleDocumento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesDetalleDocumento, this.gridBagConstraintsDetalleDocumento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralDetalleDocumento;//jContentPane;
		
		return jScrollPanelDatosEdicionDetalleDocumento;
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
