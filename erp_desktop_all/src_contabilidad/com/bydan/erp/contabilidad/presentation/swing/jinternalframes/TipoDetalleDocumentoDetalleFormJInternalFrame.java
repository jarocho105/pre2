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
import com.bydan.erp.contabilidad.util.TipoDetalleDocumentoConstantesFunciones;

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
public class TipoDetalleDocumentoDetalleFormJInternalFrame extends TipoDetalleDocumentoBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleTipoDetalleDocumento;
	
	protected JMenuBar jmenuBarDetalleTipoDetalleDocumento;
	
	protected JMenu jmenuDetalleTipoDetalleDocumento;
	protected JMenu jmenuDetalleArchivoTipoDetalleDocumento;
	protected JMenu jmenuDetalleAccionesTipoDetalleDocumento;
	protected JMenu jmenuDetalleDatosTipoDetalleDocumento;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutTipoDetalleDocumento;	
	protected GridBagConstraints gridBagConstraintsTipoDetalleDocumento;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected TipoDetalleDocumentoBeanSwingJInternalFrameAdditional jInternalFrameDetalleTipoDetalleDocumento;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public TipoDetalleDocumentoSessionBean tipodetalledocumentoSessionBean;
	
	

	public DetalleDocumentoBeanSwingJInternalFrame detalledocumentoBeanSwingJInternalFrame=null;
	public DetalleDocumentoBeanSwingJInternalFrame detalledocumentoBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteDetalleDocumento=false;
	public DetalleDocumentoSessionBean detalledocumentoSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public TipoDetalleDocumentoLogic tipodetalledocumentoLogic;
	
	public JScrollPane jScrollPanelDatosTipoDetalleDocumento;
	public JScrollPane jScrollPanelDatosEdicionTipoDetalleDocumento;
	public JScrollPane jScrollPanelDatosGeneralTipoDetalleDocumento;
	
	protected JPanel jPanelCamposTipoDetalleDocumento;    
	protected JPanel jPanelCamposOcultosTipoDetalleDocumento;    	
	protected JPanel jPanelAccionesTipoDetalleDocumento;
	protected JPanel jPanelAccionesFormularioTipoDetalleDocumento;
    
	
	
	protected Integer iXPanelCamposTipoDetalleDocumento=0;
	protected Integer iYPanelCamposTipoDetalleDocumento=0;
	
	protected Integer iXPanelCamposOcultosTipoDetalleDocumento=0;
	protected Integer iYPanelCamposOcultosTipoDetalleDocumento=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoTipoDetalleDocumento;
	public JButton jButtonModificarTipoDetalleDocumento;
	public JButton jButtonActualizarTipoDetalleDocumento;
    public JButton jButtonEliminarTipoDetalleDocumento;
	public JButton jButtonCancelarTipoDetalleDocumento;
    public JButton jButtonGuardarCambiosTipoDetalleDocumento;
	public JButton jButtonGuardarCambiosTablaTipoDetalleDocumento;
	protected JButton jButtonCerrarTipoDetalleDocumento;
	
	
	protected JButton jButtonProcesarInformacionTipoDetalleDocumento;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoTipoDetalleDocumento;
	protected JCheckBox jCheckBoxPostAccionSinCerrarTipoDetalleDocumento;
	protected JCheckBox jCheckBoxPostAccionSinMensajeTipoDetalleDocumento;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarTipoDetalleDocumento;
	protected JButton jButtonModificarToolBarTipoDetalleDocumento;
	protected JButton jButtonActualizarToolBarTipoDetalleDocumento;
    protected JButton jButtonEliminarToolBarTipoDetalleDocumento;
	protected JButton jButtonCancelarToolBarTipoDetalleDocumento;
    protected JButton jButtonGuardarCambiosToolBarTipoDetalleDocumento;
	protected JButton jButtonGuardarCambiosTablaToolBarTipoDetalleDocumento;
	protected JButton jButtonMostrarOcultarTablaToolBarTipoDetalleDocumento;
	protected JButton jButtonCerrarToolBarTipoDetalleDocumento;
	
	protected JButton jButtonProcesarInformacionToolBarTipoDetalleDocumento;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoTipoDetalleDocumento;
	protected JMenuItem jMenuItemModificarTipoDetalleDocumento;
	protected JMenuItem jMenuItemActualizarTipoDetalleDocumento;
    protected JMenuItem jMenuItemEliminarTipoDetalleDocumento;
	protected JMenuItem jMenuItemCancelarTipoDetalleDocumento;
    protected JMenuItem jMenuItemGuardarCambiosTipoDetalleDocumento;
	protected JMenuItem jMenuItemGuardarCambiosTablaTipoDetalleDocumento;
	protected JMenuItem jMenuItemCerrarTipoDetalleDocumento;
	protected JMenuItem jMenuItemDetalleCerrarTipoDetalleDocumento;
	protected JMenuItem jMenuItemDetalleMostarOcultarTipoDetalleDocumento;
	
	protected JMenuItem jMenuItemProcesarInformacionTipoDetalleDocumento;
	protected JMenuItem jMenuItemNuevoGuardarCambiosTipoDetalleDocumento;
	protected JMenuItem jMenuItemMostrarOcultarTipoDetalleDocumento;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesTipoDetalleDocumento;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesTipoDetalleDocumento;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioTipoDetalleDocumento;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidTipoDetalleDocumento;
	public JLabel jLabelIdTipoDetalleDocumento;
	public JLabel jLabelidTipoDetalleDocumento;
	public JButton jButtonidTipoDetalleDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelcodigoTipoDetalleDocumento;
	public JLabel jLabelcodigoTipoDetalleDocumento;
	public JTextField jTextFieldcodigoTipoDetalleDocumento;
	public JButton jButtoncodigoTipoDetalleDocumentoBusqueda= new JButtonMe();

	public JPanel jPanelnombreTipoDetalleDocumento;
	public JLabel jLabelnombreTipoDetalleDocumento;
	public JTextArea jTextAreanombreTipoDetalleDocumento;
	public JScrollPane jscrollPanenombreTipoDetalleDocumento;
	public JButton jButtonnombreTipoDetalleDocumentoBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaTipoDetalleDocumento;
	public JLabel jLabelid_empresaTipoDetalleDocumento;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaTipoDetalleDocumento;
	public JButton jButtonid_empresaTipoDetalleDocumento= new JButtonMe();
	public JButton jButtonid_empresaTipoDetalleDocumentoUpdate= new JButtonMe();
	public JButton jButtonid_empresaTipoDetalleDocumentoBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesTipoDetalleDocumento;
	
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
	public int iHeightFormulario=418;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public TipoDetalleDocumentoDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposTipoDetalleDocumento=new JPanel();
				this.jPanelAccionesFormularioTipoDetalleDocumento=new JPanel();
				this.jmenuBarDetalleTipoDetalleDocumento=new JMenuBar();
				this.jTtoolBarDetalleTipoDetalleDocumento=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public TipoDetalleDocumentoDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public TipoDetalleDocumentoDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("TipoDetalleDocumento No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarTipoDetalleDocumento() {
		return this.jButtonActualizarToolBarTipoDetalleDocumento;
	}
	
	public JButton getjButtonEliminarToolBarTipoDetalleDocumento() {
		return this.jButtonEliminarToolBarTipoDetalleDocumento;
	}
	
	public JButton getjButtonCancelarToolBarTipoDetalleDocumento() {
		return this.jButtonCancelarToolBarTipoDetalleDocumento;
	}		
	
	public JButton getjButtonProcesarInformacionTipoDetalleDocumento() {
		return this.jButtonProcesarInformacionTipoDetalleDocumento;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionTipoDetalleDocumento)	{
		this.jButtonProcesarInformacionTipoDetalleDocumento = jButtonProcesarInformacionTipoDetalleDocumento;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesTipoDetalleDocumento() {
		return this.jComboBoxTiposAccionesTipoDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesTipoDetalleDocumento(
			JComboBox jComboBoxTiposRelacionesTipoDetalleDocumento) {
		this.jComboBoxTiposRelacionesTipoDetalleDocumento = jComboBoxTiposRelacionesTipoDetalleDocumento;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesTipoDetalleDocumento(
			JComboBox jComboBoxTiposAccionesTipoDetalleDocumento) {
		this.jComboBoxTiposAccionesTipoDetalleDocumento = jComboBoxTiposAccionesTipoDetalleDocumento;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioTipoDetalleDocumento() {
		return this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioTipoDetalleDocumento(
			JComboBox jComboBoxTiposAccionesFormularioTipoDetalleDocumento) {
		this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento = jComboBoxTiposAccionesFormularioTipoDetalleDocumento;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.tipodetalledocumentoSessionBean=new TipoDetalleDocumentoSessionBean();
		
		this.tipodetalledocumentoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.tipodetalledocumentoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		TipoDetalleDocumentoJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Tipo Detalle Documento MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
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
	
		TipoDetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleTipoDetalleDocumento= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarTipoDetalleDocumento=new JButtonMe();
				this.jButtonModificarToolBarTipoDetalleDocumento=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarTipoDetalleDocumento,this.jTtoolBarDetalleTipoDetalleDocumento,
							"actualizar","actualizar","Actualizar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarTipoDetalleDocumento,this.jTtoolBarDetalleTipoDetalleDocumento,
							"eliminar","eliminar","Eliminar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarTipoDetalleDocumento,this.jTtoolBarDetalleTipoDetalleDocumento,
							"cancelar","cancelar","Cancelar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarTipoDetalleDocumento=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarTipoDetalleDocumento,this.jTtoolBarDetalleTipoDetalleDocumento,
							"guardarcambios","guardarcambios","Guardar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleTipoDetalleDocumento=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleTipoDetalleDocumento=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoTipoDetalleDocumento=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesTipoDetalleDocumento=new JMenuMe("Acciones");
		this.jmenuDetalleDatosTipoDetalleDocumento=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoTipoDetalleDocumento= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoTipoDetalleDocumento.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoTipoDetalleDocumento,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarTipoDetalleDocumento= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarTipoDetalleDocumento.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarTipoDetalleDocumento,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarTipoDetalleDocumento= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarTipoDetalleDocumento.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarTipoDetalleDocumento,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarTipoDetalleDocumento= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarTipoDetalleDocumento.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarTipoDetalleDocumento,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarTipoDetalleDocumento= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarTipoDetalleDocumento.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarTipoDetalleDocumento,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosTipoDetalleDocumento= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosTipoDetalleDocumento.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosTipoDetalleDocumento,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarTipoDetalleDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarTipoDetalleDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarTipoDetalleDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarTipoDetalleDocumento= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarTipoDetalleDocumento.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarTipoDetalleDocumento,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarTipoDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarTipoDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarTipoDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoTipoDetalleDocumento.add(this.jMenuItemDetalleCerrarTipoDetalleDocumento);
		
		this.jmenuDetalleAccionesTipoDetalleDocumento.add(this.jMenuItemActualizarTipoDetalleDocumento);
		this.jmenuDetalleAccionesTipoDetalleDocumento.add(this.jMenuItemEliminarTipoDetalleDocumento);
		this.jmenuDetalleAccionesTipoDetalleDocumento.add(this.jMenuItemCancelarTipoDetalleDocumento);		
		
		//this.jmenuDetalleDatosTipoDetalleDocumento.add(this.jMenuItemDetalleAbrirOrderByTipoDetalleDocumento);				
		this.jmenuDetalleDatosTipoDetalleDocumento.add(this.jMenuItemDetalleMostarOcultarTipoDetalleDocumento);				
				
		//this.jmenuDetalleAccionesTipoDetalleDocumento.add(this.jMenuItemGuardarCambiosTipoDetalleDocumento);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleTipoDetalleDocumento.add(this.jmenuDetalleArchivoTipoDetalleDocumento);		
		this.jmenuBarDetalleTipoDetalleDocumento.add(this.jmenuDetalleAccionesTipoDetalleDocumento);		
		this.jmenuBarDetalleTipoDetalleDocumento.add(this.jmenuDetalleDatosTipoDetalleDocumento);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleTipoDetalleDocumento.add(this.jmenuDetalleTipoDetalleDocumento);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleTipoDetalleDocumento);				
	}
	
	
	public void inicializarElementosCamposTipoDetalleDocumento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdTipoDetalleDocumento = new JLabelMe();
		jLabelIdTipoDetalleDocumento.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidTipoDetalleDocumento = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidTipoDetalleDocumento.setToolTipText(TipoDetalleDocumentoConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutTipoDetalleDocumento= new GridBagLayout();

		this.jPanelidTipoDetalleDocumento.setLayout(this.gridaBagLayoutTipoDetalleDocumento);

		jLabelidTipoDetalleDocumento = new JLabel();
		jLabelidTipoDetalleDocumento.setText("Id");

		jLabelidTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelcodigoTipoDetalleDocumento = new JLabelMe();
		this.jLabelcodigoTipoDetalleDocumento.setText(""+TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO+" : *");
		this.jLabelcodigoTipoDetalleDocumento.setToolTipText("Codigo");
		this.jLabelcodigoTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelcodigoTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelcodigoTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelcodigoTipoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelcodigoTipoDetalleDocumento.setToolTipText(TipoDetalleDocumentoConstantesFunciones.LABEL_CODIGO);
		this.gridaBagLayoutTipoDetalleDocumento = new GridBagLayout();
		this.jPanelcodigoTipoDetalleDocumento.setLayout(this.gridaBagLayoutTipoDetalleDocumento);


		jTextFieldcodigoTipoDetalleDocumento= new JTextFieldMe();

		jTextFieldcodigoTipoDetalleDocumento.setEnabled(false);
		jTextFieldcodigoTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldcodigoTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldcodigoTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtoncodigoTipoDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtoncodigoTipoDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtoncodigoTipoDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtoncodigoTipoDetalleDocumentoBusqueda.setText("U");
		this.jButtoncodigoTipoDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtoncodigoTipoDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtoncodigoTipoDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldcodigoTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldcodigoTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"codigoTipoDetalleDocumentoBusqueda"));

		if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtoncodigoTipoDetalleDocumentoBusqueda.setVisible(false);		}


					
		this.jLabelnombreTipoDetalleDocumento = new JLabelMe();
		this.jLabelnombreTipoDetalleDocumento.setText(""+TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreTipoDetalleDocumento.setToolTipText("Nombre");
		this.jLabelnombreTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreTipoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreTipoDetalleDocumento.setToolTipText(TipoDetalleDocumentoConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutTipoDetalleDocumento = new GridBagLayout();
		this.jPanelnombreTipoDetalleDocumento.setLayout(this.gridaBagLayoutTipoDetalleDocumento);


		jTextAreanombreTipoDetalleDocumento= new JTextAreaMe();
		jTextAreanombreTipoDetalleDocumento.setEnabled(false);
		jTextAreanombreTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreTipoDetalleDocumento.setLineWrap(true);
		jTextAreanombreTipoDetalleDocumento.setWrapStyleWord(true);
		jTextAreanombreTipoDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreTipoDetalleDocumento.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreTipoDetalleDocumento = new JScrollPane(jTextAreanombreTipoDetalleDocumento);
		jscrollPanenombreTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));
		jscrollPanenombreTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,50),70));

		this.jButtonnombreTipoDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonnombreTipoDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreTipoDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreTipoDetalleDocumentoBusqueda.setText("U");
		this.jButtonnombreTipoDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreTipoDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreTipoDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreTipoDetalleDocumentoBusqueda"));

		if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreTipoDetalleDocumentoBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysTipoDetalleDocumento() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaTipoDetalleDocumento = new JLabelMe();
		this.jLabelid_empresaTipoDetalleDocumento.setText(""+TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaTipoDetalleDocumento.setToolTipText("Empresa");
		this.jLabelid_empresaTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-60),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaTipoDetalleDocumento=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaTipoDetalleDocumento.setToolTipText(TipoDetalleDocumentoConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutTipoDetalleDocumento = new GridBagLayout();
		this.jPanelid_empresaTipoDetalleDocumento.setLayout(this.gridaBagLayoutTipoDetalleDocumento);


		jComboBoxid_empresaTipoDetalleDocumento= new JComboBoxMe();
		jComboBoxid_empresaTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaTipoDetalleDocumento.setEnabled(false);

		this.jButtonid_empresaTipoDetalleDocumento= new JButtonMe();
		this.jButtonid_empresaTipoDetalleDocumento.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetalleDocumento.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetalleDocumento.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaTipoDetalleDocumento.setText("Buscar");
		this.jButtonid_empresaTipoDetalleDocumento.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaTipoDetalleDocumento.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetalleDocumento,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetalleDocumento"));

		this.jButtonid_empresaTipoDetalleDocumentoBusqueda= new JButtonMe();
		this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setText("U");
		this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetalleDocumentoBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetalleDocumentoBusqueda"));

		if(this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaTipoDetalleDocumentoBusqueda.setVisible(false);		}

		this.jButtonid_empresaTipoDetalleDocumentoUpdate= new JButtonMe();
		this.jButtonid_empresaTipoDetalleDocumentoUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetalleDocumentoUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaTipoDetalleDocumentoUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaTipoDetalleDocumentoUpdate.setText("U");
		this.jButtonid_empresaTipoDetalleDocumentoUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaTipoDetalleDocumentoUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaTipoDetalleDocumentoUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaTipoDetalleDocumento.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaTipoDetalleDocumento.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaTipoDetalleDocumentoUpdate"));



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
		//this.jInternalFrameDetalleTipoDetalleDocumento = new TipoDetalleDocumentoBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Tipo Detalle Documento DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutTipoDetalleDocumento= new GridBagLayout();
		

		
		String sToolTipTipoDetalleDocumento="";
		sToolTipTipoDetalleDocumento=TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipTipoDetalleDocumento+="(Contabilidad.TipoDetalleDocumento)";
		}
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			sToolTipTipoDetalleDocumento+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoTipoDetalleDocumento = new JButtonMe();
		this.jButtonModificarTipoDetalleDocumento = new JButtonMe();
        this.jButtonActualizarTipoDetalleDocumento = new JButtonMe();
        this.jButtonEliminarTipoDetalleDocumento = new JButtonMe();
        this.jButtonCancelarTipoDetalleDocumento = new JButtonMe();
        this.jButtonGuardarCambiosTipoDetalleDocumento = new JButtonMe();
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento = new JButtonMe();
		this.jButtonCerrarTipoDetalleDocumento = new JButtonMe();
		
		this.jScrollPanelDatosTipoDetalleDocumento = new JScrollPane();   
        this.jScrollPanelDatosEdicionTipoDetalleDocumento = new JScrollPane();
		this.jScrollPanelDatosGeneralTipoDetalleDocumento = new JScrollPane();
				
		
		
		this.jPanelCamposTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Tipo Detalle Documento";
		
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Tipo Detalle Documentos" + this.sPath));
		} else {
			this.jScrollPanelDatosTipoDetalleDocumento.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposTipoDetalleDocumento.setName("jPanelCamposTipoDetalleDocumento"); 

		this.jPanelCamposOcultosTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosTipoDetalleDocumento.setName("jPanelCamposOcultosTipoDetalleDocumento"); 

        this.jPanelAccionesTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesTipoDetalleDocumento.setToolTipText("Acciones");
        this.jPanelAccionesTipoDetalleDocumento.setName("Acciones"); 

		this.jPanelAccionesFormularioTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioTipoDetalleDocumento.setToolTipText("Acciones");
        this.jPanelAccionesFormularioTipoDetalleDocumento.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoTipoDetalleDocumento.setText("Nuevo");
		this.jButtonModificarTipoDetalleDocumento.setText("Editar");
        this.jButtonActualizarTipoDetalleDocumento.setText("Actualizar");
        this.jButtonEliminarTipoDetalleDocumento.setText("Eliminar");
        this.jButtonCancelarTipoDetalleDocumento.setText("Cancelar");
        this.jButtonGuardarCambiosTipoDetalleDocumento.setText("Guardar");
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.setText("Guardar");
		this.jButtonCerrarTipoDetalleDocumento.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoTipoDetalleDocumento,"nuevo_button","Nuevo",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarTipoDetalleDocumento,"modificar_button","Editar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarTipoDetalleDocumento,"actualizar_button","Actualizar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarTipoDetalleDocumento,"eliminar_button","Eliminar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarTipoDetalleDocumento,"cancelar_button","Cancelar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTipoDetalleDocumento,"guardarcambios_button","Guardar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaTipoDetalleDocumento,"guardarcambiostabla_button","Guardar",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarTipoDetalleDocumento,"cerrar_button","Salir",this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoTipoDetalleDocumento.setToolTipText("Nuevo"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarTipoDetalleDocumento.setToolTipText("Editar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarTipoDetalleDocumento.setToolTipText("Actualizar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarTipoDetalleDocumento.setToolTipText("Eliminar)"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarTipoDetalleDocumento.setToolTipText("Cancelar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosTipoDetalleDocumento.setToolTipText("Guardar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.setToolTipText("Guardar"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarTipoDetalleDocumento.setToolTipText("Salir"+" "+TipoDetalleDocumentoConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoTipoDetalleDocumento";
		inputMap = this.jButtonNuevoTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoTipoDetalleDocumento.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoTipoDetalleDocumento"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarTipoDetalleDocumento";
		inputMap = this.jButtonActualizarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarTipoDetalleDocumento"));
		
		//ELIMINAR
		sMapKey = "EliminarTipoDetalleDocumento";
		inputMap = this.jButtonEliminarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarTipoDetalleDocumento"));
		
		//CANCELAR	
		sMapKey = "CancelarTipoDetalleDocumento";
		inputMap = this.jButtonCancelarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarTipoDetalleDocumento"));
		
		//CERRAR		
		sMapKey = "CerrarTipoDetalleDocumento";
		inputMap = this.jButtonCerrarTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarTipoDetalleDocumento"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaTipoDetalleDocumento";
		inputMap = this.jButtonGuardarCambiosTablaTipoDetalleDocumento.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaTipoDetalleDocumento.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaTipoDetalleDocumento"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoTipoDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoTipoDetalleDocumento.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoTipoDetalleDocumento.setToolTipText("Nuevo TipoDetalleDocumento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento.setToolTipText("Sin Cerrar Ventana TipoDetalleDocumento");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesTipoDetalleDocumento.setText("Accion");
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesTipoDetalleDocumento = new JLabelMe();
		
		this.jLabelAccionesTipoDetalleDocumento.setText("Acciones");		
		this.jLabelAccionesTipoDetalleDocumento.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleDocumento.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesTipoDetalleDocumento.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposTipoDetalleDocumento();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysTipoDetalleDocumento();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesTipoDetalleDocumento=new JTabbedPane();
		this.jTabbedPaneRelacionesTipoDetalleDocumento.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesTipoDetalleDocumento,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesTipoDetalleDocumento.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposTipoDetalleDocumento = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosTipoDetalleDocumento = new GridBagLayout();
		
		this.jPanelCamposTipoDetalleDocumento.setLayout(gridaBagLayoutCamposTipoDetalleDocumento);
		this.jPanelCamposOcultosTipoDetalleDocumento.setLayout(gridaBagLayoutCamposOcultosTipoDetalleDocumento);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidTipoDetalleDocumento.add(jLabelIdTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 1;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidTipoDetalleDocumento.add(jLabelidTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);


	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaTipoDetalleDocumento.add(jLabelid_empresaTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 2;
		this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDetalleDocumento.add(jButtonid_empresaTipoDetalleDocumentoBusqueda, this.gridBagConstraintsTipoDetalleDocumento);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 3;
		this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaTipoDetalleDocumento.add(jButtonid_empresaTipoDetalleDocumentoUpdate, this.gridBagConstraintsTipoDetalleDocumento);
	}

	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 1;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaTipoDetalleDocumento.add(jComboBoxid_empresaTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);


	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelcodigoTipoDetalleDocumento.add(jLabelcodigoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 2;
		this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelcodigoTipoDetalleDocumento.add(jButtoncodigoTipoDetalleDocumentoBusqueda, this.gridBagConstraintsTipoDetalleDocumento);
	}

	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 1;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelcodigoTipoDetalleDocumento.add(jTextFieldcodigoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);


	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreTipoDetalleDocumento.add(jLabelnombreTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		//this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 2;
		this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
		this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreTipoDetalleDocumento.add(jButtonnombreTipoDetalleDocumentoBusqueda, this.gridBagConstraintsTipoDetalleDocumento);
	}

	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = 1;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreTipoDetalleDocumento.add(jscrollPanenombreTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = iYPanelCamposTipoDetalleDocumento;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = iXPanelCamposTipoDetalleDocumento++;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetalleDocumento.add(this.jPanelidTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(iXPanelCamposTipoDetalleDocumento % 1==0) {
		iXPanelCamposTipoDetalleDocumento=0;
		iYPanelCamposTipoDetalleDocumento++;
	}
	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = iYPanelCamposTipoDetalleDocumento;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = iXPanelCamposTipoDetalleDocumento++;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetalleDocumento.add(this.jPanelcodigoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(iXPanelCamposTipoDetalleDocumento % 1==0) {
		iXPanelCamposTipoDetalleDocumento=0;
		iYPanelCamposTipoDetalleDocumento++;
	}
	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = iYPanelCamposTipoDetalleDocumento;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = iXPanelCamposTipoDetalleDocumento++;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposTipoDetalleDocumento.add(this.jPanelnombreTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(iXPanelCamposTipoDetalleDocumento % 1==0) {
		iXPanelCamposTipoDetalleDocumento=0;
		iYPanelCamposTipoDetalleDocumento++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsTipoDetalleDocumento.gridy = iYPanelCamposOcultosTipoDetalleDocumento;
	this.gridBagConstraintsTipoDetalleDocumento.gridx = iXPanelCamposOcultosTipoDetalleDocumento++;
	this.gridBagConstraintsTipoDetalleDocumento.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsTipoDetalleDocumento.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosTipoDetalleDocumento.add(this.jPanelid_empresaTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);



	if(iXPanelCamposOcultosTipoDetalleDocumento % 1==0) {
		iXPanelCamposOcultosTipoDetalleDocumento=0;
		iYPanelCamposOcultosTipoDetalleDocumento++;
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
			
		GridBagLayout gridaBagLayoutAccionesTipoDetalleDocumento= new GridBagLayout();
		this.jPanelAccionesTipoDetalleDocumento.setLayout(gridaBagLayoutAccionesTipoDetalleDocumento);
		
		GridBagLayout gridaBagLayoutAccionesFormularioTipoDetalleDocumento= new GridBagLayout();
		this.jPanelAccionesFormularioTipoDetalleDocumento.setLayout(gridaBagLayoutAccionesFormularioTipoDetalleDocumento);
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetalleDocumento.add(this.jComboBoxTiposAccionesFormularioTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioTipoDetalleDocumento.add(this.jCheckBoxPostAccionNuevoTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetalleDocumento.add(this.jCheckBoxPostAccionSinCerrarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.tipodetalledocumentoSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioTipoDetalleDocumento.add(this.jCheckBoxPostAccionSinMensajeTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccion++;
			
		this.jPanelAccionesTipoDetalleDocumento.add(this.jButtonModificarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);							

		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;
		this.gridBagConstraintsTipoDetalleDocumento.gridx =iPosXAccion++;
			
		this.jPanelAccionesTipoDetalleDocumento.add(this.jButtonEliminarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
			
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetalleDocumento.add(this.jButtonActualizarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);


		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = iPosXAccion++;
		
		this.jPanelAccionesTipoDetalleDocumento.add(this.jButtonGuardarCambiosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);	
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = 0;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx =iPosXAccion++;
		
		this.jPanelAccionesTipoDetalleDocumento.add(this.jButtonCancelarTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutTipoDetalleDocumento = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutTipoDetalleDocumento);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.tipodetalledocumentoSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();						
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;		
			//this.gridBagConstraintsTipoDetalleDocumento.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsTipoDetalleDocumento.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridyPrincipal++;
		this.gridBagConstraintsTipoDetalleDocumento.gridx =0;
		this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsTipoDetalleDocumento.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(TipoDetalleDocumentoJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleTipoDetalleDocumento = new TipoDetalleDocumentoBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Tipo Detalle Documento DATOS");
			
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
			
	        //this.setTitle("[FOR] - Tipo Detalle Documento DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Tipo Detalle Documento Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			TipoDetalleDocumentoModel tipodetalledocumentoModel=new TipoDetalleDocumentoModel(this);
			
			//SI USARA CLASE INTERNA
			//TipoDetalleDocumentoModel.TipoDetalleDocumentoFocusTraversalPolicy tipodetalledocumentoFocusTraversalPolicy = tipodetalledocumentoModel.new TipoDetalleDocumentoFocusTraversalPolicy(this);
			
			//tipodetalledocumentoFocusTraversalPolicy.settipodetalledocumentoJInternalFrame(this);
			
			this.setFocusTraversalPolicy(tipodetalledocumentoModel);
			
			
			this.jContentPaneDetalleTipoDetalleDocumento = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleTipoDetalleDocumento = new GridBagLayout();	
			this.jContentPaneDetalleTipoDetalleDocumento.setLayout(gridaBagLayoutDetalleTipoDetalleDocumento);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosTipoDetalleDocumento = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
				this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
					
				
				this.jContentPaneDetalleTipoDetalleDocumento.add(jTtoolBarDetalleTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);								
				
}
			
			this.jScrollPanelDatosEdicionTipoDetalleDocumento=   new JScrollPane(jContentPaneDetalleTipoDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralTipoDetalleDocumento=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			
			
	        this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	        
			this.jContentPaneDetalleTipoDetalleDocumento.add(jPanelCamposTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);
			
			
			
			
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
						&& tipodetalledocumentoSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameDetalleDocumento(this.puedeCargarPorParteDetalleDocumento,false,-1);
					
					if(this.tipodetalledocumentoSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsTipoDetalleDocumento= new GridBagConstraints();
						this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones++;
						this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
						this.jContentPaneDetalleTipoDetalleDocumento.add(this.jTabbedPaneRelacionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesTipoDetalleDocumento.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameDetalleDocumento(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosTipoDetalleDocumento.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
					this.gridBagConstraintsTipoDetalleDocumento.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
					
				
					this.jContentPaneDetalleTipoDetalleDocumento.add(jPanelCamposOcultosTipoDetalleDocumento, gridBagConstraintsTipoDetalleDocumento);
				
					this.jPanelCamposOcultosTipoDetalleDocumento.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	        this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleTipoDetalleDocumento.add(this.jPanelAccionesFormularioTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);							
			
			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
	        this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
	        
			
			this.jContentPaneDetalleTipoDetalleDocumento.add(this.jPanelAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionTipoDetalleDocumento);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionTipoDetalleDocumento=   new JScrollPane(this.jPanelCamposTipoDetalleDocumento,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionTipoDetalleDocumento.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleDocumento.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionTipoDetalleDocumento.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
			this.gridBagConstraintsTipoDetalleDocumento.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsTipoDetalleDocumento.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsTipoDetalleDocumento.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);			
			
			this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
			this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
			
			
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		
			
		this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
		this.gridBagConstraintsTipoDetalleDocumento.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsTipoDetalleDocumento.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesTipoDetalleDocumento, this.gridBagConstraintsTipoDetalleDocumento);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralTipoDetalleDocumento;//jContentPane;
		
		return jScrollPanelDatosEdicionTipoDetalleDocumento;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameDetalleDocumento(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.detalledocumentoSessionBean=new DetalleDocumentoSessionBean();
		this.detalledocumentoSessionBean.setConGuardarRelaciones(false);
		this.detalledocumentoSessionBean.setEsGuardarRelacionado(true);

		this.detalledocumentoBeanSwingJInternalFrame=null;//new DetalleDocumentoBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.detalledocumentoBeanSwingJInternalFramePopup=new DetalleDocumentoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.detalledocumentoBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {

				DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL=TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL;
				DetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=TipoDetalleDocumentoJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.detalledocumentoSessionBean.setEsGuardarRelacionado(true);

				this.detalledocumentoBeanSwingJInternalFrame=new DetalleDocumentoBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.detalledocumentoBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.detalledocumentoBeanSwingJInternalFrame.setdetalledocumentoSessionBean(this.detalledocumentoSessionBean);

				//this.gridBagConstraintsTipoDetalleDocumento = new GridBagConstraints();
				//this.gridBagConstraintsTipoDetalleDocumento.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsTipoDetalleDocumento.gridx = 0;
				//this.jContentPaneDetalleTipoDetalleDocumento.add(this.detalledocumentoBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsTipoDetalleDocumento);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesTipoDetalleDocumento.add("Detalle Documentos",this.detalledocumentoBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesTipoDetalleDocumento.setComponentAt(iIndexTab,this.detalledocumentoBeanSwingJInternalFrame.getContentPane());
				}

				//DetalleDocumentoJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.detalledocumentoSessionBean.setEsGuardarRelacionado(false);
				this.detalledocumentoBeanSwingJInternalFrame=null;//new DetalleDocumentoBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.detalledocumentoSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteDetalleDocumento) {
					this.jTabbedPaneRelacionesTipoDetalleDocumento.add("Detalle Documentos",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarDetalleDocumentoBeanSwingJInternalFrame(List<TipoDetalleDocumento> tipodetalledocumentos,TipoDetalleDocumento tipodetalledocumento,DetalleDocumentoBeanSwingJInternalFrame detalledocumentoBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//detalledocumentoBeanSwingJInternalFrame=new DetalleDocumentoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					detalledocumentoBeanSwingJInternalFrame.getDetalleDocumentoLogic().setConnexion(this.tipodetalledocumentoLogic.getConnexion());

					detalledocumentoBeanSwingJInternalFrame.settipodetalledocumentosForeignKey(tipodetalledocumentos);
					detalledocumentoBeanSwingJInternalFrame.settipodetalledocumentoForeignKey(tipodetalledocumento);
					detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.setisBusquedaDesdeForeignKeySesionTipoDetalleDocumento(true);
					detalledocumentoBeanSwingJInternalFrame.detalledocumentoSessionBean.setlidTipoDetalleDocumentoActual(tipodetalledocumento.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					detalledocumentoBeanSwingJInternalFrame.cargarCombosForeignKeyDetalleDocumento(detalledocumentoBeanSwingJInternalFrame.isCargarCombosDependencia);
					detalledocumentoBeanSwingJInternalFrame.setVisibilidadBusquedasParaTipoDetalleDocumento(true);
					detalledocumentoBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					detalledocumentoBeanSwingJInternalFrame.procesarBusqueda("FK_IdTipoDetalleDocumento");
					detalledocumentoBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdTipoDetalleDocumento");
					detalledocumentoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleDocumento(true);
					detalledocumentoBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesDetalleDocumento("n",detalledocumentoBeanSwingJInternalFrame.isGuardarCambiosEnLote, detalledocumentoBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					detalledocumentoBeanSwingJInternalFrame.setAutoscrolls(true);
					detalledocumentoBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						detalledocumentoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleDocumento("relacionado");
					} else {
						detalledocumentoBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleDocumento("no_relacionado");
					}

					detalledocumentoBeanSwingJInternalFrame.getjButtonRecargarInformacionDetalleDocumento().setVisible(false);

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
