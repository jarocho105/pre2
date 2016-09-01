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
package com.bydan.erp.facturacion.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.facturacion.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.facturacion.util.AutoriSriConstantesFunciones;

import com.bydan.erp.facturacion.business.logic.*;
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
public class AutoriSriDetalleFormJInternalFrame extends AutoriSriBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleAutoriSri;
	
	protected JMenuBar jmenuBarDetalleAutoriSri;
	
	protected JMenu jmenuDetalleAutoriSri;
	protected JMenu jmenuDetalleArchivoAutoriSri;
	protected JMenu jmenuDetalleAccionesAutoriSri;
	protected JMenu jmenuDetalleDatosAutoriSri;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutAutoriSri;	
	protected GridBagConstraints gridBagConstraintsAutoriSri;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected AutoriSriBeanSwingJInternalFrameAdditional jInternalFrameDetalleAutoriSri;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";
	
	public AutoriSriSessionBean autorisriSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;	
	
	public AutoriSriLogic autorisriLogic;
	
	public JScrollPane jScrollPanelDatosAutoriSri;
	public JScrollPane jScrollPanelDatosEdicionAutoriSri;
	public JScrollPane jScrollPanelDatosGeneralAutoriSri;
	
	protected JPanel jPanelCamposAutoriSri;    
	protected JPanel jPanelCamposOcultosAutoriSri;    	
	protected JPanel jPanelAccionesAutoriSri;
	protected JPanel jPanelAccionesFormularioAutoriSri;
    
	
	
	protected Integer iXPanelCamposAutoriSri=0;
	protected Integer iYPanelCamposAutoriSri=0;
	
	protected Integer iXPanelCamposOcultosAutoriSri=0;
	protected Integer iYPanelCamposOcultosAutoriSri=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoAutoriSri;
	public JButton jButtonModificarAutoriSri;
	public JButton jButtonActualizarAutoriSri;
    public JButton jButtonEliminarAutoriSri;
	public JButton jButtonCancelarAutoriSri;
    public JButton jButtonGuardarCambiosAutoriSri;
	public JButton jButtonGuardarCambiosTablaAutoriSri;
	protected JButton jButtonCerrarAutoriSri;
	
	
	protected JButton jButtonProcesarInformacionAutoriSri;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoAutoriSri;
	protected JCheckBox jCheckBoxPostAccionSinCerrarAutoriSri;
	protected JCheckBox jCheckBoxPostAccionSinMensajeAutoriSri;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarAutoriSri;
	protected JButton jButtonModificarToolBarAutoriSri;
	protected JButton jButtonActualizarToolBarAutoriSri;
    protected JButton jButtonEliminarToolBarAutoriSri;
	protected JButton jButtonCancelarToolBarAutoriSri;
    protected JButton jButtonGuardarCambiosToolBarAutoriSri;
	protected JButton jButtonGuardarCambiosTablaToolBarAutoriSri;
	protected JButton jButtonMostrarOcultarTablaToolBarAutoriSri;
	protected JButton jButtonCerrarToolBarAutoriSri;
	
	protected JButton jButtonProcesarInformacionToolBarAutoriSri;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoAutoriSri;
	protected JMenuItem jMenuItemModificarAutoriSri;
	protected JMenuItem jMenuItemActualizarAutoriSri;
    protected JMenuItem jMenuItemEliminarAutoriSri;
	protected JMenuItem jMenuItemCancelarAutoriSri;
    protected JMenuItem jMenuItemGuardarCambiosAutoriSri;
	protected JMenuItem jMenuItemGuardarCambiosTablaAutoriSri;
	protected JMenuItem jMenuItemCerrarAutoriSri;
	protected JMenuItem jMenuItemDetalleCerrarAutoriSri;
	protected JMenuItem jMenuItemDetalleMostarOcultarAutoriSri;
	
	protected JMenuItem jMenuItemProcesarInformacionAutoriSri;
	protected JMenuItem jMenuItemNuevoGuardarCambiosAutoriSri;
	protected JMenuItem jMenuItemMostrarOcultarAutoriSri;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesAutoriSri;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesAutoriSri;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesAutoriSri;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioAutoriSri;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidAutoriSri;
	public JLabel jLabelIdAutoriSri;
	public JLabel jLabelidAutoriSri;
	public JButton jButtonidAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialAutoriSri;
	public JLabel jLabelnumero_secuencialAutoriSri;
	public JTextField jTextFieldnumero_secuencialAutoriSri;
	public JButton jButtonnumero_secuencialAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorAutoriSri;
	public JLabel jLabelnumero_autorAutoriSri;
	public JTextField jTextFieldnumero_autorAutoriSri;
	public JButton jButtonnumero_autorAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioAutoriSri;
	public JLabel jLabelfecha_inicioAutoriSri;
	//public JFormattedTextField jDateChooserfecha_inicioAutoriSri;

	public JDateChooser jDateChooserfecha_inicioAutoriSri;
	public JButton jButtonfecha_inicioAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finAutoriSri;
	public JLabel jLabelfecha_finAutoriSri;
	//public JFormattedTextField jDateChooserfecha_finAutoriSri;

	public JDateChooser jDateChooserfecha_finAutoriSri;
	public JButton jButtonfecha_finAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoAutoriSri;
	public JLabel jLabelesta_activoAutoriSri;
	public JCheckBox jCheckBoxesta_activoAutoriSri;
	public JButton jButtonesta_activoAutoriSriBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaAutoriSri;
	public JLabel jLabelid_empresaAutoriSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaAutoriSri;
	public JButton jButtonid_empresaAutoriSri= new JButtonMe();
	public JButton jButtonid_empresaAutoriSriUpdate= new JButtonMe();
	public JButton jButtonid_empresaAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalAutoriSri;
	public JLabel jLabelid_sucursalAutoriSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalAutoriSri;
	public JButton jButtonid_sucursalAutoriSri= new JButtonMe();
	public JButton jButtonid_sucursalAutoriSriUpdate= new JButtonMe();
	public JButton jButtonid_sucursalAutoriSriBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_generalAutoriSri;
	public JLabel jLabelid_tipo_documento_generalAutoriSri;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalAutoriSri;
	public JButton jButtonid_tipo_documento_generalAutoriSri= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalAutoriSriUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalAutoriSriBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesAutoriSri;
	
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
	public int iHeightFormulario=594;//(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
				
	public int iHeightFormularioMaximo=0;
	public int iWidthFormularioMaximo=0;
	public int iWidthTableDefinicion=0;
	
	public double dStart = 0; 
	public double dEnd = 0; 
	public double dDif = 0; 
			
	public SistemaParameterReturnGeneral sistemaReturnGeneral;
	public List<Opcion> opcionsRelacionadas=new ArrayList<Opcion>();
	
	public AutoriSriDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposAutoriSri=new JPanel();
				this.jPanelAccionesFormularioAutoriSri=new JPanel();
				this.jmenuBarDetalleAutoriSri=new JMenuBar();
				this.jTtoolBarDetalleAutoriSri=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public AutoriSriDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public AutoriSriDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("AutoriSri No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarAutoriSri() {
		return this.jButtonActualizarToolBarAutoriSri;
	}
	
	public JButton getjButtonEliminarToolBarAutoriSri() {
		return this.jButtonEliminarToolBarAutoriSri;
	}
	
	public JButton getjButtonCancelarToolBarAutoriSri() {
		return this.jButtonCancelarToolBarAutoriSri;
	}		
	
	public JButton getjButtonProcesarInformacionAutoriSri() {
		return this.jButtonProcesarInformacionAutoriSri;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionAutoriSri)	{
		this.jButtonProcesarInformacionAutoriSri = jButtonProcesarInformacionAutoriSri;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesAutoriSri() {
		return this.jComboBoxTiposAccionesAutoriSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesAutoriSri(
			JComboBox jComboBoxTiposRelacionesAutoriSri) {
		this.jComboBoxTiposRelacionesAutoriSri = jComboBoxTiposRelacionesAutoriSri;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesAutoriSri(
			JComboBox jComboBoxTiposAccionesAutoriSri) {
		this.jComboBoxTiposAccionesAutoriSri = jComboBoxTiposAccionesAutoriSri;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioAutoriSri() {
		return this.jComboBoxTiposAccionesFormularioAutoriSri;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioAutoriSri(
			JComboBox jComboBoxTiposAccionesFormularioAutoriSri) {
		this.jComboBoxTiposAccionesFormularioAutoriSri = jComboBoxTiposAccionesFormularioAutoriSri;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.autorisriSessionBean=new AutoriSriSessionBean();
		
		this.autorisriSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.autorisriSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.autorisriSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		AutoriSriJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		AutoriSriJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		AutoriSriJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Autorizaciones Sri MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
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
	
		AutoriSriJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleAutoriSri= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarAutoriSri=new JButtonMe();
				this.jButtonModificarToolBarAutoriSri=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarAutoriSri,this.jTtoolBarDetalleAutoriSri,
							"actualizar","actualizar","Actualizar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarAutoriSri,this.jTtoolBarDetalleAutoriSri,
							"eliminar","eliminar","Eliminar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarAutoriSri,this.jTtoolBarDetalleAutoriSri,
							"cancelar","cancelar","Cancelar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarAutoriSri=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarAutoriSri,this.jTtoolBarDetalleAutoriSri,
							"guardarcambios","guardarcambios","Guardar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleAutoriSri=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleAutoriSri=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoAutoriSri=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesAutoriSri=new JMenuMe("Acciones");
		this.jmenuDetalleDatosAutoriSri=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoAutoriSri= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoAutoriSri.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoAutoriSri,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarAutoriSri= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarAutoriSri.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarAutoriSri,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarAutoriSri= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarAutoriSri.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarAutoriSri,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarAutoriSri= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarAutoriSri.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarAutoriSri,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarAutoriSri= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarAutoriSri.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarAutoriSri,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosAutoriSri= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosAutoriSri.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosAutoriSri,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarAutoriSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarAutoriSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarAutoriSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarAutoriSri= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarAutoriSri.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarAutoriSri,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarAutoriSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarAutoriSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarAutoriSri,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarAutoriSri= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarAutoriSri.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarAutoriSri,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoAutoriSri.add(this.jMenuItemDetalleCerrarAutoriSri);
		
		this.jmenuDetalleAccionesAutoriSri.add(this.jMenuItemActualizarAutoriSri);
		this.jmenuDetalleAccionesAutoriSri.add(this.jMenuItemEliminarAutoriSri);
		this.jmenuDetalleAccionesAutoriSri.add(this.jMenuItemCancelarAutoriSri);		
		
		//this.jmenuDetalleDatosAutoriSri.add(this.jMenuItemDetalleAbrirOrderByAutoriSri);				
		this.jmenuDetalleDatosAutoriSri.add(this.jMenuItemDetalleMostarOcultarAutoriSri);				
				
		//this.jmenuDetalleAccionesAutoriSri.add(this.jMenuItemGuardarCambiosAutoriSri);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleAutoriSri.add(this.jmenuDetalleArchivoAutoriSri);		
		this.jmenuBarDetalleAutoriSri.add(this.jmenuDetalleAccionesAutoriSri);		
		this.jmenuBarDetalleAutoriSri.add(this.jmenuDetalleDatosAutoriSri);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleAutoriSri);				
	}
	
	
	public void inicializarElementosCamposAutoriSri() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdAutoriSri = new JLabelMe();
		jLabelIdAutoriSri.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidAutoriSri = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutAutoriSri= new GridBagLayout();

		this.jPanelidAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);

		jLabelidAutoriSri = new JLabel();
		jLabelidAutoriSri.setText("Id");

		jLabelidAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialAutoriSri = new JLabelMe();
		this.jLabelnumero_secuencialAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialAutoriSri.setToolTipText("No Secuencial");
		this.jLabelnumero_secuencialAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_secuencialAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelnumero_secuencialAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		jTextFieldnumero_secuencialAutoriSri= new JTextFieldMe();

		jTextFieldnumero_secuencialAutoriSri.setEnabled(false);
		jTextFieldnumero_secuencialAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialAutoriSriBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialAutoriSriBusqueda.setText("U");
		this.jButtonnumero_secuencialAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialAutoriSriBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorAutoriSri = new JLabelMe();
		this.jLabelnumero_autorAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR+" : *");
		this.jLabelnumero_autorAutoriSri.setToolTipText("No Autorizacion");
		this.jLabelnumero_autorAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_autorAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_NUMEROAUTOR);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelnumero_autorAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		jTextFieldnumero_autorAutoriSri= new JTextFieldMe();

		jTextFieldnumero_autorAutoriSri.setEnabled(false);
		jTextFieldnumero_autorAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorAutoriSriBusqueda= new JButtonMe();
		this.jButtonnumero_autorAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorAutoriSriBusqueda.setText("U");
		this.jButtonnumero_autorAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorAutoriSriBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioAutoriSri = new JLabelMe();
		this.jLabelfecha_inicioAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioAutoriSri.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelfecha_inicioAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		//jFormattedTextFieldfecha_inicioAutoriSri= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioAutoriSri= new JDateChooser();
		jDateChooserfecha_inicioAutoriSri.setEnabled(false);
		jDateChooserfecha_inicioAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioAutoriSri.setDate(new Date());
		jDateChooserfecha_inicioAutoriSri.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioAutoriSri.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioAutoriSriBusqueda= new JButtonMe();
		this.jButtonfecha_inicioAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioAutoriSriBusqueda.setText("U");
		this.jButtonfecha_inicioAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioAutoriSriBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finAutoriSri = new JLabelMe();
		this.jLabelfecha_finAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finAutoriSri.setToolTipText("Fecha Fin");
		this.jLabelfecha_finAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelfecha_finAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		//jFormattedTextFieldfecha_finAutoriSri= new JFormattedTextFieldMe();

		jDateChooserfecha_finAutoriSri= new JDateChooser();
		jDateChooserfecha_finAutoriSri.setEnabled(false);
		jDateChooserfecha_finAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finAutoriSri.setDate(new Date());
		jDateChooserfecha_finAutoriSri.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finAutoriSri.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finAutoriSriBusqueda= new JButtonMe();
		this.jButtonfecha_finAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finAutoriSriBusqueda.setText("U");
		this.jButtonfecha_finAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finAutoriSriBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoAutoriSri = new JLabelMe();
		this.jLabelesta_activoAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoAutoriSri.setToolTipText("Esta Activo");
		this.jLabelesta_activoAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelesta_activoAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		jCheckBoxesta_activoAutoriSri= new JCheckBoxMe();
		jCheckBoxesta_activoAutoriSri.setEnabled(false);

		jCheckBoxesta_activoAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoAutoriSriBusqueda= new JButtonMe();
		this.jButtonesta_activoAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoAutoriSriBusqueda.setText("U");
		this.jButtonesta_activoAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoAutoriSriBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysAutoriSri() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaAutoriSri = new JLabelMe();
		this.jLabelid_empresaAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaAutoriSri.setToolTipText("Empresa");
		this.jLabelid_empresaAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelid_empresaAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		jComboBoxid_empresaAutoriSri= new JComboBoxMe();
		jComboBoxid_empresaAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaAutoriSri.setEnabled(false);

		this.jButtonid_empresaAutoriSri= new JButtonMe();
		this.jButtonid_empresaAutoriSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaAutoriSri.setText("Buscar");
		this.jButtonid_empresaAutoriSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaAutoriSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriSri"));

		this.jButtonid_empresaAutoriSriBusqueda= new JButtonMe();
		this.jButtonid_empresaAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriSriBusqueda.setText("U");
		this.jButtonid_empresaAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaAutoriSriBusqueda.setVisible(false);		}

		this.jButtonid_empresaAutoriSriUpdate= new JButtonMe();
		this.jButtonid_empresaAutoriSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaAutoriSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaAutoriSriUpdate.setText("U");
		this.jButtonid_empresaAutoriSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaAutoriSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaAutoriSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaAutoriSriUpdate"));



					
		this.jLabelid_sucursalAutoriSri = new JLabelMe();
		this.jLabelid_sucursalAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalAutoriSri.setToolTipText("Sucursal");
		this.jLabelid_sucursalAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelid_sucursalAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		jComboBoxid_sucursalAutoriSri= new JComboBoxMe();
		jComboBoxid_sucursalAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalAutoriSri.setEnabled(false);

		this.jButtonid_sucursalAutoriSri= new JButtonMe();
		this.jButtonid_sucursalAutoriSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalAutoriSri.setText("Buscar");
		this.jButtonid_sucursalAutoriSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalAutoriSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriSri"));

		this.jButtonid_sucursalAutoriSriBusqueda= new JButtonMe();
		this.jButtonid_sucursalAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriSriBusqueda.setText("U");
		this.jButtonid_sucursalAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalAutoriSriBusqueda.setVisible(false);		}

		this.jButtonid_sucursalAutoriSriUpdate= new JButtonMe();
		this.jButtonid_sucursalAutoriSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalAutoriSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalAutoriSriUpdate.setText("U");
		this.jButtonid_sucursalAutoriSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalAutoriSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalAutoriSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalAutoriSriUpdate"));



					
		this.jLabelid_tipo_documento_generalAutoriSri = new JLabelMe();
		this.jLabelid_tipo_documento_generalAutoriSri.setText(""+AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL+" : *");
		this.jLabelid_tipo_documento_generalAutoriSri.setToolTipText("T. Documento General");
		this.jLabelid_tipo_documento_generalAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-4),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_generalAutoriSri=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_generalAutoriSri.setToolTipText(AutoriSriConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		this.gridaBagLayoutAutoriSri = new GridBagLayout();
		this.jPanelid_tipo_documento_generalAutoriSri.setLayout(this.gridaBagLayoutAutoriSri);


		jComboBoxid_tipo_documento_generalAutoriSri= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_generalAutoriSri= new JButtonMe();
		this.jButtonid_tipo_documento_generalAutoriSri.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalAutoriSri.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalAutoriSri.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalAutoriSri.setText("Buscar");
		this.jButtonid_tipo_documento_generalAutoriSri.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_generalAutoriSri.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalAutoriSri,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_generalAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalAutoriSri"));

		this.jButtonid_tipo_documento_generalAutoriSriBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setText("U");
		this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalAutoriSriBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_generalAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalAutoriSriBusqueda"));

		if(this.autorisriSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_generalAutoriSriBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_generalAutoriSriUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_generalAutoriSriUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalAutoriSriUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalAutoriSriUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalAutoriSriUpdate.setText("U");
		this.jButtonid_tipo_documento_generalAutoriSriUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_generalAutoriSriUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalAutoriSriUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_generalAutoriSri.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalAutoriSri.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalAutoriSriUpdate"));



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
		//this.jInternalFrameDetalleAutoriSri = new AutoriSriBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Autorizaciones Sri DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutAutoriSri= new GridBagLayout();
		

		
		String sToolTipAutoriSri="";
		sToolTipAutoriSri=AutoriSriConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipAutoriSri+="(Facturacion.AutoriSri)";
		}
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			sToolTipAutoriSri+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoAutoriSri = new JButtonMe();
		this.jButtonModificarAutoriSri = new JButtonMe();
        this.jButtonActualizarAutoriSri = new JButtonMe();
        this.jButtonEliminarAutoriSri = new JButtonMe();
        this.jButtonCancelarAutoriSri = new JButtonMe();
        this.jButtonGuardarCambiosAutoriSri = new JButtonMe();
		this.jButtonGuardarCambiosTablaAutoriSri = new JButtonMe();
		this.jButtonCerrarAutoriSri = new JButtonMe();
		
		this.jScrollPanelDatosAutoriSri = new JScrollPane();   
        this.jScrollPanelDatosEdicionAutoriSri = new JScrollPane();
		this.jScrollPanelDatosGeneralAutoriSri = new JScrollPane();
				
		
		
		this.jPanelCamposAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Autorizaciones Sri";
		
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Autorizaciones Sris" + this.sPath));
		} else {
			this.jScrollPanelDatosAutoriSri.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposAutoriSri.setName("jPanelCamposAutoriSri"); 

		this.jPanelCamposOcultosAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosAutoriSri.setName("jPanelCamposOcultosAutoriSri"); 

        this.jPanelAccionesAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesAutoriSri.setToolTipText("Acciones");
        this.jPanelAccionesAutoriSri.setName("Acciones"); 

		this.jPanelAccionesFormularioAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioAutoriSri.setToolTipText("Acciones");
        this.jPanelAccionesFormularioAutoriSri.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoAutoriSri.setText("Nuevo");
		this.jButtonModificarAutoriSri.setText("Editar");
        this.jButtonActualizarAutoriSri.setText("Actualizar");
        this.jButtonEliminarAutoriSri.setText("Eliminar");
        this.jButtonCancelarAutoriSri.setText("Cancelar");
        this.jButtonGuardarCambiosAutoriSri.setText("Guardar");
		this.jButtonGuardarCambiosTablaAutoriSri.setText("Guardar");
		this.jButtonCerrarAutoriSri.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoAutoriSri,"nuevo_button","Nuevo",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarAutoriSri,"modificar_button","Editar",this.autorisriSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarAutoriSri,"actualizar_button","Actualizar",this.autorisriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarAutoriSri,"eliminar_button","Eliminar",this.autorisriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarAutoriSri,"cancelar_button","Cancelar",this.autorisriSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosAutoriSri,"guardarcambios_button","Guardar",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaAutoriSri,"guardarcambiostabla_button","Guardar",this.autorisriSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarAutoriSri,"cerrar_button","Salir",this.autorisriSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoAutoriSri.setToolTipText("Nuevo"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarAutoriSri.setToolTipText("Editar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarAutoriSri.setToolTipText("Actualizar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarAutoriSri.setToolTipText("Eliminar)"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarAutoriSri.setToolTipText("Cancelar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosAutoriSri.setToolTipText("Guardar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaAutoriSri.setToolTipText("Guardar"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarAutoriSri.setToolTipText("Salir"+" "+AutoriSriConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoAutoriSri";
		inputMap = this.jButtonNuevoAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoAutoriSri.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoAutoriSri"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarAutoriSri";
		inputMap = this.jButtonActualizarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarAutoriSri"));
		
		//ELIMINAR
		sMapKey = "EliminarAutoriSri";
		inputMap = this.jButtonEliminarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarAutoriSri"));
		
		//CANCELAR	
		sMapKey = "CancelarAutoriSri";
		inputMap = this.jButtonCancelarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarAutoriSri"));
		
		//CERRAR		
		sMapKey = "CerrarAutoriSri";
		inputMap = this.jButtonCerrarAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarAutoriSri"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaAutoriSri";
		inputMap = this.jButtonGuardarCambiosTablaAutoriSri.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaAutoriSri.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaAutoriSri"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoAutoriSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoAutoriSri.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoAutoriSri.setToolTipText("Nuevo AutoriSri");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarAutoriSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarAutoriSri.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarAutoriSri.setToolTipText("Sin Cerrar Ventana AutoriSri");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeAutoriSri = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeAutoriSri.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeAutoriSri.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesAutoriSri.setText("Accion");
		this.jComboBoxTiposAccionesAutoriSri.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioAutoriSri = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioAutoriSri.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioAutoriSri.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesAutoriSri = new JLabelMe();
		
		this.jLabelAccionesAutoriSri.setText("Acciones");		
		this.jLabelAccionesAutoriSri.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriSri.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesAutoriSri.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposAutoriSri();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysAutoriSri();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesAutoriSri=new JTabbedPane();
		this.jTabbedPaneRelacionesAutoriSri.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesAutoriSri,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesAutoriSri.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriSri.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesAutoriSri.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesAutoriSri, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioAutoriSri.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriSri.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioAutoriSri.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioAutoriSri, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposAutoriSri = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosAutoriSri = new GridBagLayout();
		
		this.jPanelCamposAutoriSri.setLayout(gridaBagLayoutCamposAutoriSri);
		this.jPanelCamposOcultosAutoriSri.setLayout(gridaBagLayoutCamposOcultosAutoriSri);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidAutoriSri.add(jLabelIdAutoriSri, this.gridBagConstraintsAutoriSri);



	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidAutoriSri.add(jLabelidAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaAutoriSri.add(jLabelid_empresaAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriSri.add(jButtonid_empresaAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 3;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaAutoriSri.add(jButtonid_empresaAutoriSriUpdate, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaAutoriSri.add(jComboBoxid_empresaAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalAutoriSri.add(jLabelid_sucursalAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriSri.add(jButtonid_sucursalAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 3;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalAutoriSri.add(jButtonid_sucursalAutoriSriUpdate, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalAutoriSri.add(jComboBoxid_sucursalAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_generalAutoriSri.add(jLabelid_tipo_documento_generalAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalAutoriSri.add(jButtonid_tipo_documento_generalAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 3;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalAutoriSri.add(jButtonid_tipo_documento_generalAutoriSriUpdate, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_generalAutoriSri.add(jComboBoxid_tipo_documento_generalAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialAutoriSri.add(jLabelnumero_secuencialAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialAutoriSri.add(jButtonnumero_secuencialAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialAutoriSri.add(jTextFieldnumero_secuencialAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorAutoriSri.add(jLabelnumero_autorAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorAutoriSri.add(jButtonnumero_autorAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorAutoriSri.add(jTextFieldnumero_autorAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioAutoriSri.add(jLabelfecha_inicioAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioAutoriSri.add(jButtonfecha_inicioAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioAutoriSri.add(jDateChooserfecha_inicioAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finAutoriSri.add(jLabelfecha_finAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finAutoriSri.add(jButtonfecha_finAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finAutoriSri.add(jDateChooserfecha_finAutoriSri, this.gridBagConstraintsAutoriSri);


	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 0;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoAutoriSri.add(jLabelesta_activoAutoriSri, this.gridBagConstraintsAutoriSri);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		//this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = 2;
		this.gridBagConstraintsAutoriSri.ipadx = 0;
		this.gridBagConstraintsAutoriSri.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoAutoriSri.add(jButtonesta_activoAutoriSriBusqueda, this.gridBagConstraintsAutoriSri);
	}

	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsAutoriSri.gridy = 0;
	this.gridBagConstraintsAutoriSri.gridx = 1;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoAutoriSri.add(jCheckBoxesta_activoAutoriSri, this.gridBagConstraintsAutoriSri);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelidAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelid_tipo_documento_generalAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelnumero_secuencialAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelnumero_autorAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelfecha_inicioAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelfecha_finAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposAutoriSri.add(this.jPanelesta_activoAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposAutoriSri % 1==0) {
		iXPanelCamposAutoriSri=0;
		iYPanelCamposAutoriSri++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposOcultosAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposOcultosAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriSri.add(this.jPanelid_empresaAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposOcultosAutoriSri % 1==0) {
		iXPanelCamposOcultosAutoriSri=0;
		iYPanelCamposOcultosAutoriSri++;
	}
	this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsAutoriSri.gridy = iYPanelCamposOcultosAutoriSri;
	this.gridBagConstraintsAutoriSri.gridx = iXPanelCamposOcultosAutoriSri++;
	this.gridBagConstraintsAutoriSri.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsAutoriSri.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosAutoriSri.add(this.jPanelid_sucursalAutoriSri, this.gridBagConstraintsAutoriSri);



	if(iXPanelCamposOcultosAutoriSri % 1==0) {
		iXPanelCamposOcultosAutoriSri=0;
		iYPanelCamposOcultosAutoriSri++;
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
			
		GridBagLayout gridaBagLayoutAccionesAutoriSri= new GridBagLayout();
		this.jPanelAccionesAutoriSri.setLayout(gridaBagLayoutAccionesAutoriSri);
		
		GridBagLayout gridaBagLayoutAccionesFormularioAutoriSri= new GridBagLayout();
		this.jPanelAccionesFormularioAutoriSri.setLayout(gridaBagLayoutAccionesFormularioAutoriSri);
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriSri.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriSri.add(this.jComboBoxTiposAccionesFormularioAutoriSri, this.gridBagConstraintsAutoriSri);

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsAutoriSri.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioAutoriSri.add(this.jCheckBoxPostAccionNuevoAutoriSri, this.gridBagConstraintsAutoriSri);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriSri.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriSri.add(this.jCheckBoxPostAccionSinCerrarAutoriSri, this.gridBagConstraintsAutoriSri);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.autorisriSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.autorisriSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsAutoriSri.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioAutoriSri.add(this.jCheckBoxPostAccionSinMensajeAutoriSri, this.gridBagConstraintsAutoriSri);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx = iPosXAccion++;
			
		this.jPanelAccionesAutoriSri.add(this.jButtonModificarAutoriSri, this.gridBagConstraintsAutoriSri);							

		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsAutoriSri.gridy = 0;
		this.gridBagConstraintsAutoriSri.gridx =iPosXAccion++;
			
		this.jPanelAccionesAutoriSri.add(this.jButtonEliminarAutoriSri, this.gridBagConstraintsAutoriSri);
		
			
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = 0;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriSri.add(this.jButtonActualizarAutoriSri, this.gridBagConstraintsAutoriSri);


		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = 0;		
		this.gridBagConstraintsAutoriSri.gridx = iPosXAccion++;
		
		this.jPanelAccionesAutoriSri.add(this.jButtonGuardarCambiosAutoriSri, this.gridBagConstraintsAutoriSri);	
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = 0;		
		this.gridBagConstraintsAutoriSri.gridx =iPosXAccion++;
		
		this.jPanelAccionesAutoriSri.add(this.jButtonCancelarAutoriSri, this.gridBagConstraintsAutoriSri);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutAutoriSri = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutAutoriSri);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.autorisriSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();						
			this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;
			this.gridBagConstraintsAutoriSri.gridx = 0;		
			//this.gridBagConstraintsAutoriSri.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsAutoriSri.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy =iGridyPrincipal++;
		this.gridBagConstraintsAutoriSri.gridx =0;
		this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsAutoriSri.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosAutoriSri, this.gridBagConstraintsAutoriSri);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(AutoriSriJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleAutoriSri = new AutoriSriBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Autorizaciones Sri DATOS");
			
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
			
	        //this.setTitle("[FOR] - Autorizaciones Sri DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Autorizaciones Sri Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			AutoriSriModel autorisriModel=new AutoriSriModel(this);
			
			//SI USARA CLASE INTERNA
			//AutoriSriModel.AutoriSriFocusTraversalPolicy autorisriFocusTraversalPolicy = autorisriModel.new AutoriSriFocusTraversalPolicy(this);
			
			//autorisriFocusTraversalPolicy.setautorisriJInternalFrame(this);
			
			this.setFocusTraversalPolicy(autorisriModel);
			
			
			this.jContentPaneDetalleAutoriSri = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleAutoriSri = new GridBagLayout();	
			this.jContentPaneDetalleAutoriSri.setLayout(gridaBagLayoutDetalleAutoriSri);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosAutoriSri = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsAutoriSri = new GridBagConstraints();
				this.gridBagConstraintsAutoriSri.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsAutoriSri.gridx = 0;
					
				
				this.jContentPaneDetalleAutoriSri.add(jTtoolBarDetalleAutoriSri, gridBagConstraintsAutoriSri);								
				
}
			
			this.jScrollPanelDatosEdicionAutoriSri=   new JScrollPane(jContentPaneDetalleAutoriSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralAutoriSri=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralAutoriSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralAutoriSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			
			
	        this.gridBagConstraintsAutoriSri.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsAutoriSri.gridx = 0;
	        
			this.jContentPaneDetalleAutoriSri.add(jPanelCamposAutoriSri, gridBagConstraintsAutoriSri);
			
			
			
			
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
						&& autorisriSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.autorisriSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsAutoriSri= new GridBagConstraints();
						this.gridBagConstraintsAutoriSri.gridy = iGridyRelaciones++;
						this.gridBagConstraintsAutoriSri.gridx = 0;
						this.jContentPaneDetalleAutoriSri.add(this.jTabbedPaneRelacionesAutoriSri, this.gridBagConstraintsAutoriSri);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesAutoriSri.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosAutoriSri.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsAutoriSri = new GridBagConstraints();
					this.gridBagConstraintsAutoriSri.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsAutoriSri.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsAutoriSri.gridx = 0;
					
				
					this.jContentPaneDetalleAutoriSri.add(jPanelCamposOcultosAutoriSri, gridBagConstraintsAutoriSri);
				
					this.jPanelCamposOcultosAutoriSri.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsAutoriSri.gridx = 0;
	        this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleAutoriSri.add(this.jPanelAccionesFormularioAutoriSri, this.gridBagConstraintsAutoriSri);							
			
			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
	        this.gridBagConstraintsAutoriSri.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsAutoriSri.gridx = 0;
	        
			
			this.jContentPaneDetalleAutoriSri.add(this.jPanelAccionesAutoriSri, this.gridBagConstraintsAutoriSri);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionAutoriSri);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionAutoriSri=   new JScrollPane(this.jPanelCamposAutoriSri,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionAutoriSri.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriSri.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionAutoriSri.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsAutoriSri.gridx = 0;
			this.gridBagConstraintsAutoriSri.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsAutoriSri.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsAutoriSri.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionAutoriSri, this.gridBagConstraintsAutoriSri);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriSri.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioAutoriSri, this.gridBagConstraintsAutoriSri);			
			
			this.gridBagConstraintsAutoriSri = new GridBagConstraints();
			this.gridBagConstraintsAutoriSri.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsAutoriSri.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesAutoriSri, this.gridBagConstraintsAutoriSri);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposAutoriSri, this.gridBagConstraintsAutoriSri);
			
			
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosAutoriSri, this.gridBagConstraintsAutoriSri);
		
			
		this.gridBagConstraintsAutoriSri = new GridBagConstraints();
		this.gridBagConstraintsAutoriSri.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsAutoriSri.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesAutoriSri, this.gridBagConstraintsAutoriSri);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralAutoriSri;//jContentPane;
		
		return jScrollPanelDatosEdicionAutoriSri;
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
