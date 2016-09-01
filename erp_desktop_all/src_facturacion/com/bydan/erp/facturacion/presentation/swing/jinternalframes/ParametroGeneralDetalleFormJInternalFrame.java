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
import com.bydan.erp.facturacion.util.ParametroGeneralConstantesFunciones;

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
public class ParametroGeneralDetalleFormJInternalFrame extends ParametroGeneralBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleParametroGeneral;
	
	protected JMenuBar jmenuBarDetalleParametroGeneral;
	
	protected JMenu jmenuDetalleParametroGeneral;
	protected JMenu jmenuDetalleArchivoParametroGeneral;
	protected JMenu jmenuDetalleAccionesParametroGeneral;
	protected JMenu jmenuDetalleDatosParametroGeneral;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutParametroGeneral;	
	protected GridBagConstraints gridBagConstraintsParametroGeneral;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ParametroGeneralBeanSwingJInternalFrameAdditional jInternalFrameDetalleParametroGeneral;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_sucursal="";

	protected TipoDocumentoGeneralBeanSwingJInternalFrame tipodocumentogeneralBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipodocumentogeneral="";
	
	public ParametroGeneralSessionBean parametrogeneralSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;
	public SucursalSessionBean sucursalSessionBean;
	public TipoDocumentoGeneralSessionBean tipodocumentogeneralSessionBean;	
	
	public ParametroGeneralLogic parametrogeneralLogic;
	
	public JScrollPane jScrollPanelDatosParametroGeneral;
	public JScrollPane jScrollPanelDatosEdicionParametroGeneral;
	public JScrollPane jScrollPanelDatosGeneralParametroGeneral;
	
	protected JPanel jPanelCamposParametroGeneral;    
	protected JPanel jPanelCamposOcultosParametroGeneral;    	
	protected JPanel jPanelAccionesParametroGeneral;
	protected JPanel jPanelAccionesFormularioParametroGeneral;
    
	
	
	protected Integer iXPanelCamposParametroGeneral=0;
	protected Integer iYPanelCamposParametroGeneral=0;
	
	protected Integer iXPanelCamposOcultosParametroGeneral=0;
	protected Integer iYPanelCamposOcultosParametroGeneral=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoParametroGeneral;
	public JButton jButtonModificarParametroGeneral;
	public JButton jButtonActualizarParametroGeneral;
    public JButton jButtonEliminarParametroGeneral;
	public JButton jButtonCancelarParametroGeneral;
    public JButton jButtonGuardarCambiosParametroGeneral;
	public JButton jButtonGuardarCambiosTablaParametroGeneral;
	protected JButton jButtonCerrarParametroGeneral;
	
	
	protected JButton jButtonProcesarInformacionParametroGeneral;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoParametroGeneral;
	protected JCheckBox jCheckBoxPostAccionSinCerrarParametroGeneral;
	protected JCheckBox jCheckBoxPostAccionSinMensajeParametroGeneral;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarParametroGeneral;
	protected JButton jButtonModificarToolBarParametroGeneral;
	protected JButton jButtonActualizarToolBarParametroGeneral;
    protected JButton jButtonEliminarToolBarParametroGeneral;
	protected JButton jButtonCancelarToolBarParametroGeneral;
    protected JButton jButtonGuardarCambiosToolBarParametroGeneral;
	protected JButton jButtonGuardarCambiosTablaToolBarParametroGeneral;
	protected JButton jButtonMostrarOcultarTablaToolBarParametroGeneral;
	protected JButton jButtonCerrarToolBarParametroGeneral;
	
	protected JButton jButtonProcesarInformacionToolBarParametroGeneral;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoParametroGeneral;
	protected JMenuItem jMenuItemModificarParametroGeneral;
	protected JMenuItem jMenuItemActualizarParametroGeneral;
    protected JMenuItem jMenuItemEliminarParametroGeneral;
	protected JMenuItem jMenuItemCancelarParametroGeneral;
    protected JMenuItem jMenuItemGuardarCambiosParametroGeneral;
	protected JMenuItem jMenuItemGuardarCambiosTablaParametroGeneral;
	protected JMenuItem jMenuItemCerrarParametroGeneral;
	protected JMenuItem jMenuItemDetalleCerrarParametroGeneral;
	protected JMenuItem jMenuItemDetalleMostarOcultarParametroGeneral;
	
	protected JMenuItem jMenuItemProcesarInformacionParametroGeneral;
	protected JMenuItem jMenuItemNuevoGuardarCambiosParametroGeneral;
	protected JMenuItem jMenuItemMostrarOcultarParametroGeneral;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesParametroGeneral;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesParametroGeneral;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesParametroGeneral;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioParametroGeneral;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidParametroGeneral;
	public JLabel jLabelIdParametroGeneral;
	public JLabel jLabelidParametroGeneral;
	public JButton jButtonidParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnumero_secuencialParametroGeneral;
	public JLabel jLabelnumero_secuencialParametroGeneral;
	public JTextField jTextFieldnumero_secuencialParametroGeneral;
	public JButton jButtonnumero_secuencialParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelnumero_autorParametroGeneral;
	public JLabel jLabelnumero_autorParametroGeneral;
	public JTextField jTextFieldnumero_autorParametroGeneral;
	public JButton jButtonnumero_autorParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioParametroGeneral;
	public JLabel jLabelfecha_inicioParametroGeneral;
	//public JFormattedTextField jDateChooserfecha_inicioParametroGeneral;

	public JDateChooser jDateChooserfecha_inicioParametroGeneral;
	public JButton jButtonfecha_inicioParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finParametroGeneral;
	public JLabel jLabelfecha_finParametroGeneral;
	//public JFormattedTextField jDateChooserfecha_finParametroGeneral;

	public JDateChooser jDateChooserfecha_finParametroGeneral;
	public JButton jButtonfecha_finParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelesta_activoParametroGeneral;
	public JLabel jLabelesta_activoParametroGeneral;
	public JCheckBox jCheckBoxesta_activoParametroGeneral;
	public JButton jButtonesta_activoParametroGeneralBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaParametroGeneral;
	public JLabel jLabelid_empresaParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaParametroGeneral;
	public JButton jButtonid_empresaParametroGeneral= new JButtonMe();
	public JButton jButtonid_empresaParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_empresaParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_sucursalParametroGeneral;
	public JLabel jLabelid_sucursalParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_sucursalParametroGeneral;
	public JButton jButtonid_sucursalParametroGeneral= new JButtonMe();
	public JButton jButtonid_sucursalParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_sucursalParametroGeneralBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_documento_generalParametroGeneral;
	public JLabel jLabelid_tipo_documento_generalParametroGeneral;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_documento_generalParametroGeneral;
	public JButton jButtonid_tipo_documento_generalParametroGeneral= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalParametroGeneralUpdate= new JButtonMe();
	public JButton jButtonid_tipo_documento_generalParametroGeneralBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesParametroGeneral;
	
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
	
	public ParametroGeneralDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposParametroGeneral=new JPanel();
				this.jPanelAccionesFormularioParametroGeneral=new JPanel();
				this.jmenuBarDetalleParametroGeneral=new JMenuBar();
				this.jTtoolBarDetalleParametroGeneral=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ParametroGeneralDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ParametroGeneralDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ParametroGeneral No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarParametroGeneral() {
		return this.jButtonActualizarToolBarParametroGeneral;
	}
	
	public JButton getjButtonEliminarToolBarParametroGeneral() {
		return this.jButtonEliminarToolBarParametroGeneral;
	}
	
	public JButton getjButtonCancelarToolBarParametroGeneral() {
		return this.jButtonCancelarToolBarParametroGeneral;
	}		
	
	public JButton getjButtonProcesarInformacionParametroGeneral() {
		return this.jButtonProcesarInformacionParametroGeneral;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionParametroGeneral)	{
		this.jButtonProcesarInformacionParametroGeneral = jButtonProcesarInformacionParametroGeneral;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesParametroGeneral() {
		return this.jComboBoxTiposAccionesParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesParametroGeneral(
			JComboBox jComboBoxTiposRelacionesParametroGeneral) {
		this.jComboBoxTiposRelacionesParametroGeneral = jComboBoxTiposRelacionesParametroGeneral;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesParametroGeneral(
			JComboBox jComboBoxTiposAccionesParametroGeneral) {
		this.jComboBoxTiposAccionesParametroGeneral = jComboBoxTiposAccionesParametroGeneral;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioParametroGeneral() {
		return this.jComboBoxTiposAccionesFormularioParametroGeneral;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioParametroGeneral(
			JComboBox jComboBoxTiposAccionesFormularioParametroGeneral) {
		this.jComboBoxTiposAccionesFormularioParametroGeneral = jComboBoxTiposAccionesFormularioParametroGeneral;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.parametrogeneralSessionBean=new ParametroGeneralSessionBean();
		
		this.parametrogeneralSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.parametrogeneralSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.parametrogeneralSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ParametroGeneralJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ParametroGeneralJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Parametro General MANTENIMIENTO"));
		
		
		if(iWidth > 850) {
			iWidth=850;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
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
	
		ParametroGeneralJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleParametroGeneral= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarParametroGeneral=new JButtonMe();
				this.jButtonModificarToolBarParametroGeneral=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarParametroGeneral,this.jTtoolBarDetalleParametroGeneral,
							"actualizar","actualizar","Actualizar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarParametroGeneral,this.jTtoolBarDetalleParametroGeneral,
							"eliminar","eliminar","Eliminar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarParametroGeneral,this.jTtoolBarDetalleParametroGeneral,
							"cancelar","cancelar","Cancelar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarParametroGeneral=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarParametroGeneral,this.jTtoolBarDetalleParametroGeneral,
							"guardarcambios","guardarcambios","Guardar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleParametroGeneral=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleParametroGeneral=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoParametroGeneral=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesParametroGeneral=new JMenuMe("Acciones");
		this.jmenuDetalleDatosParametroGeneral=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoParametroGeneral= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoParametroGeneral.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoParametroGeneral,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarParametroGeneral= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarParametroGeneral.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarParametroGeneral,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarParametroGeneral= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarParametroGeneral.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarParametroGeneral,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarParametroGeneral= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarParametroGeneral.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarParametroGeneral,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarParametroGeneral= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarParametroGeneral.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarParametroGeneral,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosParametroGeneral= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosParametroGeneral.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosParametroGeneral,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarParametroGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarParametroGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarParametroGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarParametroGeneral= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarParametroGeneral.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarParametroGeneral,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarParametroGeneral= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarParametroGeneral.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarParametroGeneral,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoParametroGeneral.add(this.jMenuItemDetalleCerrarParametroGeneral);
		
		this.jmenuDetalleAccionesParametroGeneral.add(this.jMenuItemActualizarParametroGeneral);
		this.jmenuDetalleAccionesParametroGeneral.add(this.jMenuItemEliminarParametroGeneral);
		this.jmenuDetalleAccionesParametroGeneral.add(this.jMenuItemCancelarParametroGeneral);		
		
		//this.jmenuDetalleDatosParametroGeneral.add(this.jMenuItemDetalleAbrirOrderByParametroGeneral);				
		this.jmenuDetalleDatosParametroGeneral.add(this.jMenuItemDetalleMostarOcultarParametroGeneral);				
				
		//this.jmenuDetalleAccionesParametroGeneral.add(this.jMenuItemGuardarCambiosParametroGeneral);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleParametroGeneral.add(this.jmenuDetalleArchivoParametroGeneral);		
		this.jmenuBarDetalleParametroGeneral.add(this.jmenuDetalleAccionesParametroGeneral);		
		this.jmenuBarDetalleParametroGeneral.add(this.jmenuDetalleDatosParametroGeneral);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleParametroGeneral);				
	}
	
	
	public void inicializarElementosCamposParametroGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdParametroGeneral = new JLabelMe();
		jLabelIdParametroGeneral.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidParametroGeneral = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutParametroGeneral= new GridBagLayout();

		this.jPanelidParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);

		jLabelidParametroGeneral = new JLabel();
		jLabelidParametroGeneral.setText("Id");

		jLabelidParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnumero_secuencialParametroGeneral = new JLabelMe();
		this.jLabelnumero_secuencialParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL+" : *");
		this.jLabelnumero_secuencialParametroGeneral.setToolTipText("Numero Secuencial");
		this.jLabelnumero_secuencialParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabelnumero_secuencialParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_secuencialParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_secuencialParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_secuencialParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_NUMEROSECUENCIAL);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelnumero_secuencialParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		jTextFieldnumero_secuencialParametroGeneral= new JTextFieldMe();

		jTextFieldnumero_secuencialParametroGeneral.setEnabled(false);
		jTextFieldnumero_secuencialParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_secuencialParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_secuencialParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_secuencialParametroGeneralBusqueda= new JButtonMe();
		this.jButtonnumero_secuencialParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_secuencialParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_secuencialParametroGeneralBusqueda.setText("U");
		this.jButtonnumero_secuencialParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_secuencialParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_secuencialParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_secuencialParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_secuencialParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_secuencialParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_secuencialParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelnumero_autorParametroGeneral = new JLabelMe();
		this.jLabelnumero_autorParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR+" : *");
		this.jLabelnumero_autorParametroGeneral.setToolTipText("Numero Autor");
		this.jLabelnumero_autorParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_autorParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnumero_autorParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnumero_autorParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnumero_autorParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnumero_autorParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_NUMEROAUTOR);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelnumero_autorParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		jTextFieldnumero_autorParametroGeneral= new JTextFieldMe();

		jTextFieldnumero_autorParametroGeneral.setEnabled(false);
		jTextFieldnumero_autorParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldnumero_autorParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldnumero_autorParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonnumero_autorParametroGeneralBusqueda= new JButtonMe();
		this.jButtonnumero_autorParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnumero_autorParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnumero_autorParametroGeneralBusqueda.setText("U");
		this.jButtonnumero_autorParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnumero_autorParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnumero_autorParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldnumero_autorParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldnumero_autorParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"numero_autorParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnumero_autorParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelfecha_inicioParametroGeneral = new JLabelMe();
		this.jLabelfecha_inicioParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioParametroGeneral.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelfecha_inicioParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		//jFormattedTextFieldfecha_inicioParametroGeneral= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioParametroGeneral= new JDateChooser();
		jDateChooserfecha_inicioParametroGeneral.setEnabled(false);
		jDateChooserfecha_inicioParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioParametroGeneral.setDate(new Date());
		jDateChooserfecha_inicioParametroGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioParametroGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioParametroGeneralBusqueda= new JButtonMe();
		this.jButtonfecha_inicioParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioParametroGeneralBusqueda.setText("U");
		this.jButtonfecha_inicioParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finParametroGeneral = new JLabelMe();
		this.jLabelfecha_finParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finParametroGeneral.setToolTipText("Fecha Fin");
		this.jLabelfecha_finParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelfecha_finParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		//jFormattedTextFieldfecha_finParametroGeneral= new JFormattedTextFieldMe();

		jDateChooserfecha_finParametroGeneral= new JDateChooser();
		jDateChooserfecha_finParametroGeneral.setEnabled(false);
		jDateChooserfecha_finParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finParametroGeneral.setDate(new Date());
		jDateChooserfecha_finParametroGeneral.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finParametroGeneral.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finParametroGeneralBusqueda= new JButtonMe();
		this.jButtonfecha_finParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finParametroGeneralBusqueda.setText("U");
		this.jButtonfecha_finParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finParametroGeneralBusqueda.setVisible(false);		}


					
		this.jLabelesta_activoParametroGeneral = new JLabelMe();
		this.jLabelesta_activoParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO+" : *");
		this.jLabelesta_activoParametroGeneral.setToolTipText("Esta Activo");
		this.jLabelesta_activoParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelesta_activoParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelesta_activoParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelesta_activoParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelesta_activoParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_ESTAACTIVO);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelesta_activoParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		jCheckBoxesta_activoParametroGeneral= new JCheckBoxMe();
		jCheckBoxesta_activoParametroGeneral.setEnabled(false);

		jCheckBoxesta_activoParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxesta_activoParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxesta_activoParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonesta_activoParametroGeneralBusqueda= new JButtonMe();
		this.jButtonesta_activoParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonesta_activoParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonesta_activoParametroGeneralBusqueda.setText("U");
		this.jButtonesta_activoParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonesta_activoParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonesta_activoParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxesta_activoParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxesta_activoParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"esta_activoParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonesta_activoParametroGeneralBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysParametroGeneral() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaParametroGeneral = new JLabelMe();
		this.jLabelid_empresaParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaParametroGeneral.setToolTipText("Empresa");
		this.jLabelid_empresaParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelid_empresaParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		jComboBoxid_empresaParametroGeneral= new JComboBoxMe();
		jComboBoxid_empresaParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaParametroGeneral.setEnabled(false);

		this.jButtonid_empresaParametroGeneral= new JButtonMe();
		this.jButtonid_empresaParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaParametroGeneral.setText("Buscar");
		this.jButtonid_empresaParametroGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGeneral"));

		this.jButtonid_empresaParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_empresaParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGeneralBusqueda.setText("U");
		this.jButtonid_empresaParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_empresaParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_empresaParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaParametroGeneralUpdate.setText("U");
		this.jButtonid_empresaParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaParametroGeneralUpdate"));



					
		this.jLabelid_sucursalParametroGeneral = new JLabelMe();
		this.jLabelid_sucursalParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL+" : *");
		this.jLabelid_sucursalParametroGeneral.setToolTipText("Sucursal");
		this.jLabelid_sucursalParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_sucursalParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_sucursalParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_sucursalParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_sucursalParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_IDSUCURSAL);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelid_sucursalParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		jComboBoxid_sucursalParametroGeneral= new JComboBoxMe();
		jComboBoxid_sucursalParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_sucursalParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_sucursalParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_sucursalParametroGeneral.setEnabled(false);

		this.jButtonid_sucursalParametroGeneral= new JButtonMe();
		this.jButtonid_sucursalParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_sucursalParametroGeneral.setText("Buscar");
		this.jButtonid_sucursalParametroGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_sucursalParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_sucursalParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGeneral"));

		this.jButtonid_sucursalParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_sucursalParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroGeneralBusqueda.setText("U");
		this.jButtonid_sucursalParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_sucursalParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_sucursalParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_sucursalParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_sucursalParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_sucursalParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_sucursalParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_sucursalParametroGeneralUpdate.setText("U");
		this.jButtonid_sucursalParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_sucursalParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_sucursalParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_sucursalParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_sucursalParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_sucursalParametroGeneralUpdate"));



					
		this.jLabelid_tipo_documento_generalParametroGeneral = new JLabelMe();
		this.jLabelid_tipo_documento_generalParametroGeneral.setText(""+ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL+" : *");
		this.jLabelid_tipo_documento_generalParametroGeneral.setToolTipText("Tipo Documento General");
		this.jLabelid_tipo_documento_generalParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));
		this.jLabelid_tipo_documento_generalParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,0),Constantes2.ISWING_ALTO_CONTROL_LABEL2*2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2*2,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_documento_generalParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_documento_generalParametroGeneral=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_documento_generalParametroGeneral.setToolTipText(ParametroGeneralConstantesFunciones.LABEL_IDTIPODOCUMENTOGENERAL);
		this.gridaBagLayoutParametroGeneral = new GridBagLayout();
		this.jPanelid_tipo_documento_generalParametroGeneral.setLayout(this.gridaBagLayoutParametroGeneral);


		jComboBoxid_tipo_documento_generalParametroGeneral= new JComboBoxMe();
		jComboBoxid_tipo_documento_generalParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_documento_generalParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_documento_generalParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_documento_generalParametroGeneral= new JButtonMe();
		this.jButtonid_tipo_documento_generalParametroGeneral.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalParametroGeneral.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalParametroGeneral.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_documento_generalParametroGeneral.setText("Buscar");
		this.jButtonid_tipo_documento_generalParametroGeneral.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_documento_generalParametroGeneral.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalParametroGeneral,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_documento_generalParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalParametroGeneral"));

		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda= new JButtonMe();
		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setText("U");
		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalParametroGeneralBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_documento_generalParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalParametroGeneralBusqueda"));

		if(this.parametrogeneralSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_documento_generalParametroGeneralBusqueda.setVisible(false);		}

		this.jButtonid_tipo_documento_generalParametroGeneralUpdate= new JButtonMe();
		this.jButtonid_tipo_documento_generalParametroGeneralUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroGeneralUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_documento_generalParametroGeneralUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_documento_generalParametroGeneralUpdate.setText("U");
		this.jButtonid_tipo_documento_generalParametroGeneralUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_documento_generalParametroGeneralUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_documento_generalParametroGeneralUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_documento_generalParametroGeneral.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_documento_generalParametroGeneral.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_documento_generalParametroGeneralUpdate"));



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
		//this.jInternalFrameDetalleParametroGeneral = new ParametroGeneralBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Parametro General DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutParametroGeneral= new GridBagLayout();
		

		
		String sToolTipParametroGeneral="";
		sToolTipParametroGeneral=ParametroGeneralConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipParametroGeneral+="(Facturacion.ParametroGeneral)";
		}
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			sToolTipParametroGeneral+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoParametroGeneral = new JButtonMe();
		this.jButtonModificarParametroGeneral = new JButtonMe();
        this.jButtonActualizarParametroGeneral = new JButtonMe();
        this.jButtonEliminarParametroGeneral = new JButtonMe();
        this.jButtonCancelarParametroGeneral = new JButtonMe();
        this.jButtonGuardarCambiosParametroGeneral = new JButtonMe();
		this.jButtonGuardarCambiosTablaParametroGeneral = new JButtonMe();
		this.jButtonCerrarParametroGeneral = new JButtonMe();
		
		this.jScrollPanelDatosParametroGeneral = new JScrollPane();   
        this.jScrollPanelDatosEdicionParametroGeneral = new JScrollPane();
		this.jScrollPanelDatosGeneralParametroGeneral = new JScrollPane();
				
		
		
		this.jPanelCamposParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Parametro General";
		
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Parametro Generals" + this.sPath));
		} else {
			this.jScrollPanelDatosParametroGeneral.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposParametroGeneral.setName("jPanelCamposParametroGeneral"); 

		this.jPanelCamposOcultosParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosParametroGeneral.setName("jPanelCamposOcultosParametroGeneral"); 

        this.jPanelAccionesParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesParametroGeneral.setToolTipText("Acciones");
        this.jPanelAccionesParametroGeneral.setName("Acciones"); 

		this.jPanelAccionesFormularioParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioParametroGeneral.setToolTipText("Acciones");
        this.jPanelAccionesFormularioParametroGeneral.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoParametroGeneral.setText("Nuevo");
		this.jButtonModificarParametroGeneral.setText("Editar");
        this.jButtonActualizarParametroGeneral.setText("Actualizar");
        this.jButtonEliminarParametroGeneral.setText("Eliminar");
        this.jButtonCancelarParametroGeneral.setText("Cancelar");
        this.jButtonGuardarCambiosParametroGeneral.setText("Guardar");
		this.jButtonGuardarCambiosTablaParametroGeneral.setText("Guardar");
		this.jButtonCerrarParametroGeneral.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoParametroGeneral,"nuevo_button","Nuevo",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarParametroGeneral,"modificar_button","Editar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarParametroGeneral,"actualizar_button","Actualizar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarParametroGeneral,"eliminar_button","Eliminar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarParametroGeneral,"cancelar_button","Cancelar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosParametroGeneral,"guardarcambios_button","Guardar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaParametroGeneral,"guardarcambiostabla_button","Guardar",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarParametroGeneral,"cerrar_button","Salir",this.parametrogeneralSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoParametroGeneral.setToolTipText("Nuevo"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarParametroGeneral.setToolTipText("Editar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarParametroGeneral.setToolTipText("Actualizar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarParametroGeneral.setToolTipText("Eliminar)"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarParametroGeneral.setToolTipText("Cancelar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosParametroGeneral.setToolTipText("Guardar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaParametroGeneral.setToolTipText("Guardar"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarParametroGeneral.setToolTipText("Salir"+" "+ParametroGeneralConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoParametroGeneral";
		inputMap = this.jButtonNuevoParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoParametroGeneral.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoParametroGeneral"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarParametroGeneral";
		inputMap = this.jButtonActualizarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarParametroGeneral"));
		
		//ELIMINAR
		sMapKey = "EliminarParametroGeneral";
		inputMap = this.jButtonEliminarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarParametroGeneral"));
		
		//CANCELAR	
		sMapKey = "CancelarParametroGeneral";
		inputMap = this.jButtonCancelarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarParametroGeneral"));
		
		//CERRAR		
		sMapKey = "CerrarParametroGeneral";
		inputMap = this.jButtonCerrarParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarParametroGeneral"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaParametroGeneral";
		inputMap = this.jButtonGuardarCambiosTablaParametroGeneral.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaParametroGeneral.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaParametroGeneral"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoParametroGeneral.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoParametroGeneral.setToolTipText("Nuevo ParametroGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarParametroGeneral.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarParametroGeneral.setToolTipText("Sin Cerrar Ventana ParametroGeneral");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeParametroGeneral = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeParametroGeneral.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeParametroGeneral.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesParametroGeneral.setText("Accion");
		this.jComboBoxTiposAccionesParametroGeneral.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioParametroGeneral = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioParametroGeneral.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioParametroGeneral.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesParametroGeneral = new JLabelMe();
		
		this.jLabelAccionesParametroGeneral.setText("Acciones");		
		this.jLabelAccionesParametroGeneral.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneral.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesParametroGeneral.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposParametroGeneral();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysParametroGeneral();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesParametroGeneral=new JTabbedPane();
		this.jTabbedPaneRelacionesParametroGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesParametroGeneral,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesParametroGeneral.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneral.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesParametroGeneral.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesParametroGeneral, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioParametroGeneral.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGeneral.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioParametroGeneral.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioParametroGeneral, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposParametroGeneral = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosParametroGeneral = new GridBagLayout();
		
		this.jPanelCamposParametroGeneral.setLayout(gridaBagLayoutCamposParametroGeneral);
		this.jPanelCamposOcultosParametroGeneral.setLayout(gridaBagLayoutCamposOcultosParametroGeneral);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidParametroGeneral.add(jLabelIdParametroGeneral, this.gridBagConstraintsParametroGeneral);



	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidParametroGeneral.add(jLabelidParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaParametroGeneral.add(jLabelid_empresaParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGeneral.add(jButtonid_empresaParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 3;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaParametroGeneral.add(jButtonid_empresaParametroGeneralUpdate, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaParametroGeneral.add(jComboBoxid_empresaParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_sucursalParametroGeneral.add(jLabelid_sucursalParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroGeneral.add(jButtonid_sucursalParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 3;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_sucursalParametroGeneral.add(jButtonid_sucursalParametroGeneralUpdate, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_sucursalParametroGeneral.add(jComboBoxid_sucursalParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_documento_generalParametroGeneral.add(jLabelid_tipo_documento_generalParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalParametroGeneral.add(jButtonid_tipo_documento_generalParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 3;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_documento_generalParametroGeneral.add(jButtonid_tipo_documento_generalParametroGeneralUpdate, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_documento_generalParametroGeneral.add(jComboBoxid_tipo_documento_generalParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_secuencialParametroGeneral.add(jLabelnumero_secuencialParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_secuencialParametroGeneral.add(jButtonnumero_secuencialParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_secuencialParametroGeneral.add(jTextFieldnumero_secuencialParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnumero_autorParametroGeneral.add(jLabelnumero_autorParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelnumero_autorParametroGeneral.add(jButtonnumero_autorParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnumero_autorParametroGeneral.add(jTextFieldnumero_autorParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioParametroGeneral.add(jLabelfecha_inicioParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioParametroGeneral.add(jButtonfecha_inicioParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioParametroGeneral.add(jDateChooserfecha_inicioParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finParametroGeneral.add(jLabelfecha_finParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finParametroGeneral.add(jButtonfecha_finParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finParametroGeneral.add(jDateChooserfecha_finParametroGeneral, this.gridBagConstraintsParametroGeneral);


	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 0;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelesta_activoParametroGeneral.add(jLabelesta_activoParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		//this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = 2;
		this.gridBagConstraintsParametroGeneral.ipadx = 0;
		this.gridBagConstraintsParametroGeneral.insets = new Insets(0, 0, 0, 0);
		this.jPanelesta_activoParametroGeneral.add(jButtonesta_activoParametroGeneralBusqueda, this.gridBagConstraintsParametroGeneral);
	}

	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsParametroGeneral.gridy = 0;
	this.gridBagConstraintsParametroGeneral.gridx = 1;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelesta_activoParametroGeneral.add(jCheckBoxesta_activoParametroGeneral, this.gridBagConstraintsParametroGeneral);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelidParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelid_tipo_documento_generalParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelnumero_secuencialParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelnumero_autorParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelfecha_inicioParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelfecha_finParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposParametroGeneral.add(this.jPanelesta_activoParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposParametroGeneral % 1==0) {
		iXPanelCamposParametroGeneral=0;
		iYPanelCamposParametroGeneral++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposOcultosParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposOcultosParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroGeneral.add(this.jPanelid_empresaParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposOcultosParametroGeneral % 1==0) {
		iXPanelCamposOcultosParametroGeneral=0;
		iYPanelCamposOcultosParametroGeneral++;
	}
	this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsParametroGeneral.gridy = iYPanelCamposOcultosParametroGeneral;
	this.gridBagConstraintsParametroGeneral.gridx = iXPanelCamposOcultosParametroGeneral++;
	this.gridBagConstraintsParametroGeneral.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsParametroGeneral.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosParametroGeneral.add(this.jPanelid_sucursalParametroGeneral, this.gridBagConstraintsParametroGeneral);



	if(iXPanelCamposOcultosParametroGeneral % 1==0) {
		iXPanelCamposOcultosParametroGeneral=0;
		iYPanelCamposOcultosParametroGeneral++;
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
			
		GridBagLayout gridaBagLayoutAccionesParametroGeneral= new GridBagLayout();
		this.jPanelAccionesParametroGeneral.setLayout(gridaBagLayoutAccionesParametroGeneral);
		
		GridBagLayout gridaBagLayoutAccionesFormularioParametroGeneral= new GridBagLayout();
		this.jPanelAccionesFormularioParametroGeneral.setLayout(gridaBagLayoutAccionesFormularioParametroGeneral);
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGeneral.add(this.jComboBoxTiposAccionesFormularioParametroGeneral, this.gridBagConstraintsParametroGeneral);

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsParametroGeneral.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioParametroGeneral.add(this.jCheckBoxPostAccionNuevoParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGeneral.add(this.jCheckBoxPostAccionSinCerrarParametroGeneral, this.gridBagConstraintsParametroGeneral);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.parametrogeneralSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.parametrogeneralSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsParametroGeneral.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioParametroGeneral.add(this.jCheckBoxPostAccionSinMensajeParametroGeneral, this.gridBagConstraintsParametroGeneral);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx = iPosXAccion++;
			
		this.jPanelAccionesParametroGeneral.add(this.jButtonModificarParametroGeneral, this.gridBagConstraintsParametroGeneral);							

		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsParametroGeneral.gridy = 0;
		this.gridBagConstraintsParametroGeneral.gridx =iPosXAccion++;
			
		this.jPanelAccionesParametroGeneral.add(this.jButtonEliminarParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
			
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = 0;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGeneral.add(this.jButtonActualizarParametroGeneral, this.gridBagConstraintsParametroGeneral);


		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = 0;		
		this.gridBagConstraintsParametroGeneral.gridx = iPosXAccion++;
		
		this.jPanelAccionesParametroGeneral.add(this.jButtonGuardarCambiosParametroGeneral, this.gridBagConstraintsParametroGeneral);	
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = 0;		
		this.gridBagConstraintsParametroGeneral.gridx =iPosXAccion++;
		
		this.jPanelAccionesParametroGeneral.add(this.jButtonCancelarParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutParametroGeneral = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutParametroGeneral);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.parametrogeneralSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();						
			this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;
			this.gridBagConstraintsParametroGeneral.gridx = 0;		
			//this.gridBagConstraintsParametroGeneral.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsParametroGeneral.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy =iGridyPrincipal++;
		this.gridBagConstraintsParametroGeneral.gridx =0;
		this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsParametroGeneral.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosParametroGeneral, this.gridBagConstraintsParametroGeneral);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ParametroGeneralJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleParametroGeneral = new ParametroGeneralBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Parametro General DATOS");
			
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
			
	        //this.setTitle("[FOR] - Parametro General DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Parametro General Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ParametroGeneralModel parametrogeneralModel=new ParametroGeneralModel(this);
			
			//SI USARA CLASE INTERNA
			//ParametroGeneralModel.ParametroGeneralFocusTraversalPolicy parametrogeneralFocusTraversalPolicy = parametrogeneralModel.new ParametroGeneralFocusTraversalPolicy(this);
			
			//parametrogeneralFocusTraversalPolicy.setparametrogeneralJInternalFrame(this);
			
			this.setFocusTraversalPolicy(parametrogeneralModel);
			
			
			this.jContentPaneDetalleParametroGeneral = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleParametroGeneral = new GridBagLayout();	
			this.jContentPaneDetalleParametroGeneral.setLayout(gridaBagLayoutDetalleParametroGeneral);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosParametroGeneral = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
				this.gridBagConstraintsParametroGeneral.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsParametroGeneral.gridx = 0;
					
				
				this.jContentPaneDetalleParametroGeneral.add(jTtoolBarDetalleParametroGeneral, gridBagConstraintsParametroGeneral);								
				
}
			
			this.jScrollPanelDatosEdicionParametroGeneral=   new JScrollPane(jContentPaneDetalleParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralParametroGeneral=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			
			
	        this.gridBagConstraintsParametroGeneral.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsParametroGeneral.gridx = 0;
	        
			this.jContentPaneDetalleParametroGeneral.add(jPanelCamposParametroGeneral, gridBagConstraintsParametroGeneral);
			
			
			
			
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
						&& parametrogeneralSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.parametrogeneralSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsParametroGeneral= new GridBagConstraints();
						this.gridBagConstraintsParametroGeneral.gridy = iGridyRelaciones++;
						this.gridBagConstraintsParametroGeneral.gridx = 0;
						this.jContentPaneDetalleParametroGeneral.add(this.jTabbedPaneRelacionesParametroGeneral, this.gridBagConstraintsParametroGeneral);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesParametroGeneral.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosParametroGeneral.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
					this.gridBagConstraintsParametroGeneral.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsParametroGeneral.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsParametroGeneral.gridx = 0;
					
				
					this.jContentPaneDetalleParametroGeneral.add(jPanelCamposOcultosParametroGeneral, gridBagConstraintsParametroGeneral);
				
					this.jPanelCamposOcultosParametroGeneral.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsParametroGeneral.gridx = 0;
	        this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleParametroGeneral.add(this.jPanelAccionesFormularioParametroGeneral, this.gridBagConstraintsParametroGeneral);							
			
			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
	        this.gridBagConstraintsParametroGeneral.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsParametroGeneral.gridx = 0;
	        
			
			this.jContentPaneDetalleParametroGeneral.add(this.jPanelAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionParametroGeneral);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionParametroGeneral=   new JScrollPane(this.jPanelCamposParametroGeneral,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionParametroGeneral.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneral.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionParametroGeneral.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneral.gridx = 0;
			this.gridBagConstraintsParametroGeneral.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsParametroGeneral.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsParametroGeneral.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioParametroGeneral, this.gridBagConstraintsParametroGeneral);			
			
			this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
			this.gridBagConstraintsParametroGeneral.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsParametroGeneral.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposParametroGeneral, this.gridBagConstraintsParametroGeneral);
			
			
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosParametroGeneral, this.gridBagConstraintsParametroGeneral);
		
			
		this.gridBagConstraintsParametroGeneral = new GridBagConstraints();
		this.gridBagConstraintsParametroGeneral.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsParametroGeneral.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesParametroGeneral, this.gridBagConstraintsParametroGeneral);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralParametroGeneral;//jContentPane;
		
		return jScrollPanelDatosEdicionParametroGeneral;
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
