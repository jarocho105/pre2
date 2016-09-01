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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;//;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;


import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;

//import com.bydan.erp.nomina.presentation.report.source.*;


import com.bydan.framework.erp.business.entity.Reporte;

import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;



import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.nomina.util.RangoDiaNomiConstantesFunciones;

import com.bydan.erp.nomina.business.logic.*;
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
public class RangoDiaNomiDetalleFormJInternalFrame extends RangoDiaNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleRangoDiaNomi;
	
	protected JMenuBar jmenuBarDetalleRangoDiaNomi;
	
	protected JMenu jmenuDetalleRangoDiaNomi;
	protected JMenu jmenuDetalleArchivoRangoDiaNomi;
	protected JMenu jmenuDetalleAccionesRangoDiaNomi;
	protected JMenu jmenuDetalleDatosRangoDiaNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutRangoDiaNomi;	
	protected GridBagConstraints gridBagConstraintsRangoDiaNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected RangoDiaNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleRangoDiaNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";
	
	public RangoDiaNomiSessionBean rangodianomiSessionBean;
	
	
	
	
	public EmpresaSessionBean empresaSessionBean;	
	
	public RangoDiaNomiLogic rangodianomiLogic;
	
	public JScrollPane jScrollPanelDatosRangoDiaNomi;
	public JScrollPane jScrollPanelDatosEdicionRangoDiaNomi;
	public JScrollPane jScrollPanelDatosGeneralRangoDiaNomi;
	
	protected JPanel jPanelCamposRangoDiaNomi;    
	protected JPanel jPanelCamposOcultosRangoDiaNomi;    	
	protected JPanel jPanelAccionesRangoDiaNomi;
	protected JPanel jPanelAccionesFormularioRangoDiaNomi;
    
	
	
	protected Integer iXPanelCamposRangoDiaNomi=0;
	protected Integer iYPanelCamposRangoDiaNomi=0;
	
	protected Integer iXPanelCamposOcultosRangoDiaNomi=0;
	protected Integer iYPanelCamposOcultosRangoDiaNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoRangoDiaNomi;
	public JButton jButtonModificarRangoDiaNomi;
	public JButton jButtonActualizarRangoDiaNomi;
    public JButton jButtonEliminarRangoDiaNomi;
	public JButton jButtonCancelarRangoDiaNomi;
    public JButton jButtonGuardarCambiosRangoDiaNomi;
	public JButton jButtonGuardarCambiosTablaRangoDiaNomi;
	protected JButton jButtonCerrarRangoDiaNomi;
	
	
	protected JButton jButtonProcesarInformacionRangoDiaNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoRangoDiaNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarRangoDiaNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeRangoDiaNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarRangoDiaNomi;
	protected JButton jButtonModificarToolBarRangoDiaNomi;
	protected JButton jButtonActualizarToolBarRangoDiaNomi;
    protected JButton jButtonEliminarToolBarRangoDiaNomi;
	protected JButton jButtonCancelarToolBarRangoDiaNomi;
    protected JButton jButtonGuardarCambiosToolBarRangoDiaNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarRangoDiaNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarRangoDiaNomi;
	protected JButton jButtonCerrarToolBarRangoDiaNomi;
	
	protected JButton jButtonProcesarInformacionToolBarRangoDiaNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoRangoDiaNomi;
	protected JMenuItem jMenuItemModificarRangoDiaNomi;
	protected JMenuItem jMenuItemActualizarRangoDiaNomi;
    protected JMenuItem jMenuItemEliminarRangoDiaNomi;
	protected JMenuItem jMenuItemCancelarRangoDiaNomi;
    protected JMenuItem jMenuItemGuardarCambiosRangoDiaNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaRangoDiaNomi;
	protected JMenuItem jMenuItemCerrarRangoDiaNomi;
	protected JMenuItem jMenuItemDetalleCerrarRangoDiaNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarRangoDiaNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionRangoDiaNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosRangoDiaNomi;
	protected JMenuItem jMenuItemMostrarOcultarRangoDiaNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesRangoDiaNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesRangoDiaNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesRangoDiaNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioRangoDiaNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidRangoDiaNomi;
	public JLabel jLabelIdRangoDiaNomi;
	public JLabel jLabelidRangoDiaNomi;
	public JButton jButtonidRangoDiaNomiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_inicioRangoDiaNomi;
	public JLabel jLabelfecha_inicioRangoDiaNomi;
	//public JFormattedTextField jDateChooserfecha_inicioRangoDiaNomi;

	public JDateChooser jDateChooserfecha_inicioRangoDiaNomi;
	public JButton jButtonfecha_inicioRangoDiaNomiBusqueda= new JButtonMe();

	public JPanel jPanelfecha_finRangoDiaNomi;
	public JLabel jLabelfecha_finRangoDiaNomi;
	//public JFormattedTextField jDateChooserfecha_finRangoDiaNomi;

	public JDateChooser jDateChooserfecha_finRangoDiaNomi;
	public JButton jButtonfecha_finRangoDiaNomiBusqueda= new JButtonMe();

	public JPanel jPaneldescripcionRangoDiaNomi;
	public JLabel jLabeldescripcionRangoDiaNomi;
	public JTextArea jTextAreadescripcionRangoDiaNomi;
	public JScrollPane jscrollPanedescripcionRangoDiaNomi;
	public JButton jButtondescripcionRangoDiaNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaRangoDiaNomi;
	public JLabel jLabelid_empresaRangoDiaNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaRangoDiaNomi;
	public JButton jButtonid_empresaRangoDiaNomi= new JButtonMe();
	public JButton jButtonid_empresaRangoDiaNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaRangoDiaNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesRangoDiaNomi;
	
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
	
	public RangoDiaNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposRangoDiaNomi=new JPanel();
				this.jPanelAccionesFormularioRangoDiaNomi=new JPanel();
				this.jmenuBarDetalleRangoDiaNomi=new JMenuBar();
				this.jTtoolBarDetalleRangoDiaNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public RangoDiaNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public RangoDiaNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("RangoDiaNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarRangoDiaNomi() {
		return this.jButtonActualizarToolBarRangoDiaNomi;
	}
	
	public JButton getjButtonEliminarToolBarRangoDiaNomi() {
		return this.jButtonEliminarToolBarRangoDiaNomi;
	}
	
	public JButton getjButtonCancelarToolBarRangoDiaNomi() {
		return this.jButtonCancelarToolBarRangoDiaNomi;
	}		
	
	public JButton getjButtonProcesarInformacionRangoDiaNomi() {
		return this.jButtonProcesarInformacionRangoDiaNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionRangoDiaNomi)	{
		this.jButtonProcesarInformacionRangoDiaNomi = jButtonProcesarInformacionRangoDiaNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesRangoDiaNomi() {
		return this.jComboBoxTiposAccionesRangoDiaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesRangoDiaNomi(
			JComboBox jComboBoxTiposRelacionesRangoDiaNomi) {
		this.jComboBoxTiposRelacionesRangoDiaNomi = jComboBoxTiposRelacionesRangoDiaNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesRangoDiaNomi(
			JComboBox jComboBoxTiposAccionesRangoDiaNomi) {
		this.jComboBoxTiposAccionesRangoDiaNomi = jComboBoxTiposAccionesRangoDiaNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioRangoDiaNomi() {
		return this.jComboBoxTiposAccionesFormularioRangoDiaNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioRangoDiaNomi(
			JComboBox jComboBoxTiposAccionesFormularioRangoDiaNomi) {
		this.jComboBoxTiposAccionesFormularioRangoDiaNomi = jComboBoxTiposAccionesFormularioRangoDiaNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.rangodianomiSessionBean=new RangoDiaNomiSessionBean();
		
		this.rangodianomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.rangodianomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.rangodianomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		RangoDiaNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		RangoDiaNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		RangoDiaNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Rango Dia Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 660) {
			iHeight=660;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
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
	
		RangoDiaNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleRangoDiaNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarRangoDiaNomi=new JButtonMe();
				this.jButtonModificarToolBarRangoDiaNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarRangoDiaNomi,this.jTtoolBarDetalleRangoDiaNomi,
							"actualizar","actualizar","Actualizar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarRangoDiaNomi,this.jTtoolBarDetalleRangoDiaNomi,
							"eliminar","eliminar","Eliminar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarRangoDiaNomi,this.jTtoolBarDetalleRangoDiaNomi,
							"cancelar","cancelar","Cancelar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarRangoDiaNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarRangoDiaNomi,this.jTtoolBarDetalleRangoDiaNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleRangoDiaNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleRangoDiaNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoRangoDiaNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesRangoDiaNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosRangoDiaNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoRangoDiaNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoRangoDiaNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoRangoDiaNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarRangoDiaNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarRangoDiaNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarRangoDiaNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarRangoDiaNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarRangoDiaNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarRangoDiaNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarRangoDiaNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarRangoDiaNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarRangoDiaNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarRangoDiaNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarRangoDiaNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarRangoDiaNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosRangoDiaNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosRangoDiaNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosRangoDiaNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarRangoDiaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarRangoDiaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarRangoDiaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarRangoDiaNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarRangoDiaNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarRangoDiaNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarRangoDiaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarRangoDiaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarRangoDiaNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarRangoDiaNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarRangoDiaNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarRangoDiaNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoRangoDiaNomi.add(this.jMenuItemDetalleCerrarRangoDiaNomi);
		
		this.jmenuDetalleAccionesRangoDiaNomi.add(this.jMenuItemActualizarRangoDiaNomi);
		this.jmenuDetalleAccionesRangoDiaNomi.add(this.jMenuItemEliminarRangoDiaNomi);
		this.jmenuDetalleAccionesRangoDiaNomi.add(this.jMenuItemCancelarRangoDiaNomi);		
		
		//this.jmenuDetalleDatosRangoDiaNomi.add(this.jMenuItemDetalleAbrirOrderByRangoDiaNomi);				
		this.jmenuDetalleDatosRangoDiaNomi.add(this.jMenuItemDetalleMostarOcultarRangoDiaNomi);				
				
		//this.jmenuDetalleAccionesRangoDiaNomi.add(this.jMenuItemGuardarCambiosRangoDiaNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleRangoDiaNomi.add(this.jmenuDetalleArchivoRangoDiaNomi);		
		this.jmenuBarDetalleRangoDiaNomi.add(this.jmenuDetalleAccionesRangoDiaNomi);		
		this.jmenuBarDetalleRangoDiaNomi.add(this.jmenuDetalleDatosRangoDiaNomi);		
		
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleRangoDiaNomi);				
	}
	
	
	public void inicializarElementosCamposRangoDiaNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdRangoDiaNomi = new JLabelMe();
		jLabelIdRangoDiaNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidRangoDiaNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidRangoDiaNomi.setToolTipText(RangoDiaNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutRangoDiaNomi= new GridBagLayout();

		this.jPanelidRangoDiaNomi.setLayout(this.gridaBagLayoutRangoDiaNomi);

		jLabelidRangoDiaNomi = new JLabel();
		jLabelidRangoDiaNomi.setText("Id");

		jLabelidRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelfecha_inicioRangoDiaNomi = new JLabelMe();
		this.jLabelfecha_inicioRangoDiaNomi.setText(""+RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO+" : *");
		this.jLabelfecha_inicioRangoDiaNomi.setToolTipText("Fecha Inicio");
		this.jLabelfecha_inicioRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_inicioRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_inicioRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_inicioRangoDiaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_inicioRangoDiaNomi.setToolTipText(RangoDiaNomiConstantesFunciones.LABEL_FECHAINICIO);
		this.gridaBagLayoutRangoDiaNomi = new GridBagLayout();
		this.jPanelfecha_inicioRangoDiaNomi.setLayout(this.gridaBagLayoutRangoDiaNomi);


		//jFormattedTextFieldfecha_inicioRangoDiaNomi= new JFormattedTextFieldMe();

		jDateChooserfecha_inicioRangoDiaNomi= new JDateChooser();
		jDateChooserfecha_inicioRangoDiaNomi.setEnabled(false);
		jDateChooserfecha_inicioRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_inicioRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_inicioRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_inicioRangoDiaNomi.setDate(new Date());
		jDateChooserfecha_inicioRangoDiaNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_inicioRangoDiaNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_inicioRangoDiaNomiBusqueda= new JButtonMe();
		this.jButtonfecha_inicioRangoDiaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioRangoDiaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_inicioRangoDiaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_inicioRangoDiaNomiBusqueda.setText("U");
		this.jButtonfecha_inicioRangoDiaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_inicioRangoDiaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_inicioRangoDiaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_inicioRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_inicioRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_inicioRangoDiaNomiBusqueda"));

		if(this.rangodianomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_inicioRangoDiaNomiBusqueda.setVisible(false);		}


					
		this.jLabelfecha_finRangoDiaNomi = new JLabelMe();
		this.jLabelfecha_finRangoDiaNomi.setText(""+RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN+" : *");
		this.jLabelfecha_finRangoDiaNomi.setToolTipText("Fecha Fin");
		this.jLabelfecha_finRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelfecha_finRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelfecha_finRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelfecha_finRangoDiaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelfecha_finRangoDiaNomi.setToolTipText(RangoDiaNomiConstantesFunciones.LABEL_FECHAFIN);
		this.gridaBagLayoutRangoDiaNomi = new GridBagLayout();
		this.jPanelfecha_finRangoDiaNomi.setLayout(this.gridaBagLayoutRangoDiaNomi);


		//jFormattedTextFieldfecha_finRangoDiaNomi= new JFormattedTextFieldMe();

		jDateChooserfecha_finRangoDiaNomi= new JDateChooser();
		jDateChooserfecha_finRangoDiaNomi.setEnabled(false);
		jDateChooserfecha_finRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));
		jDateChooserfecha_finRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_FECHA,0),Constantes.ISWING_ALTO_CONTROL_FECHA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL_FECHA,0)));

		FuncionesSwing.setBoldDate(jDateChooserfecha_finRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jDateChooserfecha_finRangoDiaNomi.setDate(new Date());
		jDateChooserfecha_finRangoDiaNomi.setDateFormatString("yyyy-MM-dd");;
		//jFormattedTextFieldfecha_finRangoDiaNomi.setText(Funciones.getStringMySqlCurrentDate());

		this.jButtonfecha_finRangoDiaNomiBusqueda= new JButtonMe();
		this.jButtonfecha_finRangoDiaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finRangoDiaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonfecha_finRangoDiaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonfecha_finRangoDiaNomiBusqueda.setText("U");
		this.jButtonfecha_finRangoDiaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonfecha_finRangoDiaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonfecha_finRangoDiaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jDateChooserfecha_finRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jDateChooserfecha_finRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"fecha_finRangoDiaNomiBusqueda"));

		if(this.rangodianomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonfecha_finRangoDiaNomiBusqueda.setVisible(false);		}


					
		this.jLabeldescripcionRangoDiaNomi = new JLabelMe();
		this.jLabeldescripcionRangoDiaNomi.setText(""+RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION+" : *");
		this.jLabeldescripcionRangoDiaNomi.setToolTipText("Descripcion");
		this.jLabeldescripcionRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabeldescripcionRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabeldescripcionRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneldescripcionRangoDiaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneldescripcionRangoDiaNomi.setToolTipText(RangoDiaNomiConstantesFunciones.LABEL_DESCRIPCION);
		this.gridaBagLayoutRangoDiaNomi = new GridBagLayout();
		this.jPaneldescripcionRangoDiaNomi.setLayout(this.gridaBagLayoutRangoDiaNomi);


		jTextAreadescripcionRangoDiaNomi= new JTextAreaMe();
		jTextAreadescripcionRangoDiaNomi.setEnabled(false);
		jTextAreadescripcionRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreadescripcionRangoDiaNomi.setLineWrap(true);
		jTextAreadescripcionRangoDiaNomi.setWrapStyleWord(true);
		jTextAreadescripcionRangoDiaNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreadescripcionRangoDiaNomi.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreadescripcionRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanedescripcionRangoDiaNomi = new JScrollPane(jTextAreadescripcionRangoDiaNomi);
		jscrollPanedescripcionRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanedescripcionRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtondescripcionRangoDiaNomiBusqueda= new JButtonMe();
		this.jButtondescripcionRangoDiaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRangoDiaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtondescripcionRangoDiaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtondescripcionRangoDiaNomiBusqueda.setText("U");
		this.jButtondescripcionRangoDiaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtondescripcionRangoDiaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtondescripcionRangoDiaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreadescripcionRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreadescripcionRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"descripcionRangoDiaNomiBusqueda"));

		if(this.rangodianomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtondescripcionRangoDiaNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysRangoDiaNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaRangoDiaNomi = new JLabelMe();
		this.jLabelid_empresaRangoDiaNomi.setText(""+RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaRangoDiaNomi.setToolTipText("Empresa");
		this.jLabelid_empresaRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-39),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaRangoDiaNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaRangoDiaNomi.setToolTipText(RangoDiaNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutRangoDiaNomi = new GridBagLayout();
		this.jPanelid_empresaRangoDiaNomi.setLayout(this.gridaBagLayoutRangoDiaNomi);


		jComboBoxid_empresaRangoDiaNomi= new JComboBoxMe();
		jComboBoxid_empresaRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaRangoDiaNomi.setEnabled(false);

		this.jButtonid_empresaRangoDiaNomi= new JButtonMe();
		this.jButtonid_empresaRangoDiaNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRangoDiaNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRangoDiaNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaRangoDiaNomi.setText("Buscar");
		this.jButtonid_empresaRangoDiaNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaRangoDiaNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRangoDiaNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRangoDiaNomi"));

		this.jButtonid_empresaRangoDiaNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaRangoDiaNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoDiaNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoDiaNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRangoDiaNomiBusqueda.setText("U");
		this.jButtonid_empresaRangoDiaNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaRangoDiaNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRangoDiaNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRangoDiaNomiBusqueda"));

		if(this.rangodianomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaRangoDiaNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaRangoDiaNomiUpdate= new JButtonMe();
		this.jButtonid_empresaRangoDiaNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoDiaNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaRangoDiaNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaRangoDiaNomiUpdate.setText("U");
		this.jButtonid_empresaRangoDiaNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaRangoDiaNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaRangoDiaNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaRangoDiaNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaRangoDiaNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaRangoDiaNomiUpdate"));



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
		//this.jInternalFrameDetalleRangoDiaNomi = new RangoDiaNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Rango Dia Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutRangoDiaNomi= new GridBagLayout();
		

		
		String sToolTipRangoDiaNomi="";
		sToolTipRangoDiaNomi=RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipRangoDiaNomi+="(Nomina.RangoDiaNomi)";
		}
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipRangoDiaNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoRangoDiaNomi = new JButtonMe();
		this.jButtonModificarRangoDiaNomi = new JButtonMe();
        this.jButtonActualizarRangoDiaNomi = new JButtonMe();
        this.jButtonEliminarRangoDiaNomi = new JButtonMe();
        this.jButtonCancelarRangoDiaNomi = new JButtonMe();
        this.jButtonGuardarCambiosRangoDiaNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaRangoDiaNomi = new JButtonMe();
		this.jButtonCerrarRangoDiaNomi = new JButtonMe();
		
		this.jScrollPanelDatosRangoDiaNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionRangoDiaNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralRangoDiaNomi = new JScrollPane();
				
		
		
		this.jPanelCamposRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Rango Dia Nomi";
		
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Rango Dia Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosRangoDiaNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposRangoDiaNomi.setName("jPanelCamposRangoDiaNomi"); 

		this.jPanelCamposOcultosRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosRangoDiaNomi.setName("jPanelCamposOcultosRangoDiaNomi"); 

        this.jPanelAccionesRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesRangoDiaNomi.setToolTipText("Acciones");
        this.jPanelAccionesRangoDiaNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioRangoDiaNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioRangoDiaNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoRangoDiaNomi.setText("Nuevo");
		this.jButtonModificarRangoDiaNomi.setText("Editar");
        this.jButtonActualizarRangoDiaNomi.setText("Actualizar");
        this.jButtonEliminarRangoDiaNomi.setText("Eliminar");
        this.jButtonCancelarRangoDiaNomi.setText("Cancelar");
        this.jButtonGuardarCambiosRangoDiaNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaRangoDiaNomi.setText("Guardar");
		this.jButtonCerrarRangoDiaNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoRangoDiaNomi,"nuevo_button","Nuevo",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarRangoDiaNomi,"modificar_button","Editar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarRangoDiaNomi,"actualizar_button","Actualizar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarRangoDiaNomi,"eliminar_button","Eliminar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarRangoDiaNomi,"cancelar_button","Cancelar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosRangoDiaNomi,"guardarcambios_button","Guardar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaRangoDiaNomi,"guardarcambiostabla_button","Guardar",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarRangoDiaNomi,"cerrar_button","Salir",this.rangodianomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoRangoDiaNomi.setToolTipText("Nuevo"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarRangoDiaNomi.setToolTipText("Editar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarRangoDiaNomi.setToolTipText("Actualizar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarRangoDiaNomi.setToolTipText("Eliminar)"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarRangoDiaNomi.setToolTipText("Cancelar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosRangoDiaNomi.setToolTipText("Guardar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaRangoDiaNomi.setToolTipText("Guardar"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarRangoDiaNomi.setToolTipText("Salir"+" "+RangoDiaNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoRangoDiaNomi";
		inputMap = this.jButtonNuevoRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoRangoDiaNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoRangoDiaNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarRangoDiaNomi";
		inputMap = this.jButtonActualizarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarRangoDiaNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarRangoDiaNomi";
		inputMap = this.jButtonEliminarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarRangoDiaNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarRangoDiaNomi";
		inputMap = this.jButtonCancelarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarRangoDiaNomi"));
		
		//CERRAR		
		sMapKey = "CerrarRangoDiaNomi";
		inputMap = this.jButtonCerrarRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarRangoDiaNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaRangoDiaNomi";
		inputMap = this.jButtonGuardarCambiosTablaRangoDiaNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaRangoDiaNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaRangoDiaNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoRangoDiaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoRangoDiaNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoRangoDiaNomi.setToolTipText("Nuevo RangoDiaNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarRangoDiaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarRangoDiaNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarRangoDiaNomi.setToolTipText("Sin Cerrar Ventana RangoDiaNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeRangoDiaNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeRangoDiaNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeRangoDiaNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesRangoDiaNomi.setText("Accion");
		this.jComboBoxTiposAccionesRangoDiaNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioRangoDiaNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioRangoDiaNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioRangoDiaNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesRangoDiaNomi = new JLabelMe();
		
		this.jLabelAccionesRangoDiaNomi.setText("Acciones");		
		this.jLabelAccionesRangoDiaNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoDiaNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesRangoDiaNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposRangoDiaNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysRangoDiaNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesRangoDiaNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesRangoDiaNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesRangoDiaNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesRangoDiaNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoDiaNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesRangoDiaNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioRangoDiaNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRangoDiaNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioRangoDiaNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioRangoDiaNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposRangoDiaNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosRangoDiaNomi = new GridBagLayout();
		
		this.jPanelCamposRangoDiaNomi.setLayout(gridaBagLayoutCamposRangoDiaNomi);
		this.jPanelCamposOcultosRangoDiaNomi.setLayout(gridaBagLayoutCamposOcultosRangoDiaNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidRangoDiaNomi.add(jLabelIdRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 1;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidRangoDiaNomi.add(jLabelidRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);


	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaRangoDiaNomi.add(jLabelid_empresaRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		//this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = 2;
		this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
		this.gridBagConstraintsRangoDiaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRangoDiaNomi.add(jButtonid_empresaRangoDiaNomiBusqueda, this.gridBagConstraintsRangoDiaNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		//this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = 3;
		this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
		this.gridBagConstraintsRangoDiaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaRangoDiaNomi.add(jButtonid_empresaRangoDiaNomiUpdate, this.gridBagConstraintsRangoDiaNomi);
	}

	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 1;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaRangoDiaNomi.add(jComboBoxid_empresaRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);


	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_inicioRangoDiaNomi.add(jLabelfecha_inicioRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		//this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = 2;
		this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
		this.gridBagConstraintsRangoDiaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_inicioRangoDiaNomi.add(jButtonfecha_inicioRangoDiaNomiBusqueda, this.gridBagConstraintsRangoDiaNomi);
	}

	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 1;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_inicioRangoDiaNomi.add(jDateChooserfecha_inicioRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);


	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelfecha_finRangoDiaNomi.add(jLabelfecha_finRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		//this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = 2;
		this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
		this.gridBagConstraintsRangoDiaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelfecha_finRangoDiaNomi.add(jButtonfecha_finRangoDiaNomiBusqueda, this.gridBagConstraintsRangoDiaNomi);
	}

	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 1;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelfecha_finRangoDiaNomi.add(jDateChooserfecha_finRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);


	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneldescripcionRangoDiaNomi.add(jLabeldescripcionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		//this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = 2;
		this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
		this.gridBagConstraintsRangoDiaNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneldescripcionRangoDiaNomi.add(jButtondescripcionRangoDiaNomiBusqueda, this.gridBagConstraintsRangoDiaNomi);
	}

	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsRangoDiaNomi.gridy = 0;
	this.gridBagConstraintsRangoDiaNomi.gridx = 1;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneldescripcionRangoDiaNomi.add(jscrollPanedescripcionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoDiaNomi.gridy = iYPanelCamposRangoDiaNomi;
	this.gridBagConstraintsRangoDiaNomi.gridx = iXPanelCamposRangoDiaNomi++;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoDiaNomi.add(this.jPanelidRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(iXPanelCamposRangoDiaNomi % 1==0) {
		iXPanelCamposRangoDiaNomi=0;
		iYPanelCamposRangoDiaNomi++;
	}
	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoDiaNomi.gridy = iYPanelCamposRangoDiaNomi;
	this.gridBagConstraintsRangoDiaNomi.gridx = iXPanelCamposRangoDiaNomi++;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoDiaNomi.add(this.jPanelfecha_inicioRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(iXPanelCamposRangoDiaNomi % 1==0) {
		iXPanelCamposRangoDiaNomi=0;
		iYPanelCamposRangoDiaNomi++;
	}
	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoDiaNomi.gridy = iYPanelCamposRangoDiaNomi;
	this.gridBagConstraintsRangoDiaNomi.gridx = iXPanelCamposRangoDiaNomi++;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoDiaNomi.add(this.jPanelfecha_finRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(iXPanelCamposRangoDiaNomi % 1==0) {
		iXPanelCamposRangoDiaNomi=0;
		iYPanelCamposRangoDiaNomi++;
	}
	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoDiaNomi.gridy = iYPanelCamposRangoDiaNomi;
	this.gridBagConstraintsRangoDiaNomi.gridx = iXPanelCamposRangoDiaNomi++;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposRangoDiaNomi.add(this.jPaneldescripcionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(iXPanelCamposRangoDiaNomi % 1==0) {
		iXPanelCamposRangoDiaNomi=0;
		iYPanelCamposRangoDiaNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsRangoDiaNomi.gridy = iYPanelCamposOcultosRangoDiaNomi;
	this.gridBagConstraintsRangoDiaNomi.gridx = iXPanelCamposOcultosRangoDiaNomi++;
	this.gridBagConstraintsRangoDiaNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsRangoDiaNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosRangoDiaNomi.add(this.jPanelid_empresaRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);



	if(iXPanelCamposOcultosRangoDiaNomi % 1==0) {
		iXPanelCamposOcultosRangoDiaNomi=0;
		iYPanelCamposOcultosRangoDiaNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesRangoDiaNomi= new GridBagLayout();
		this.jPanelAccionesRangoDiaNomi.setLayout(gridaBagLayoutAccionesRangoDiaNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioRangoDiaNomi= new GridBagLayout();
		this.jPanelAccionesFormularioRangoDiaNomi.setLayout(gridaBagLayoutAccionesFormularioRangoDiaNomi);
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRangoDiaNomi.add(this.jComboBoxTiposAccionesFormularioRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioRangoDiaNomi.add(this.jCheckBoxPostAccionNuevoRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRangoDiaNomi.add(this.jCheckBoxPostAccionSinCerrarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.rangodianomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.rangodianomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsRangoDiaNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioRangoDiaNomi.add(this.jCheckBoxPostAccionSinMensajeRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesRangoDiaNomi.add(this.jButtonModificarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);							

		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;
		this.gridBagConstraintsRangoDiaNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesRangoDiaNomi.add(this.jButtonEliminarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
			
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesRangoDiaNomi.add(this.jButtonActualizarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);


		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;		
		this.gridBagConstraintsRangoDiaNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesRangoDiaNomi.add(this.jButtonGuardarCambiosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);	
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = 0;		
		this.gridBagConstraintsRangoDiaNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesRangoDiaNomi.add(this.jButtonCancelarRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutRangoDiaNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutRangoDiaNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.rangodianomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();						
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsRangoDiaNomi.gridx = 0;		
			//this.gridBagConstraintsRangoDiaNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsRangoDiaNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsRangoDiaNomi.gridx =0;
		this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsRangoDiaNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(RangoDiaNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleRangoDiaNomi = new RangoDiaNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Rango Dia Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Rango Dia Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Rango Dia Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			RangoDiaNomiModel rangodianomiModel=new RangoDiaNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//RangoDiaNomiModel.RangoDiaNomiFocusTraversalPolicy rangodianomiFocusTraversalPolicy = rangodianomiModel.new RangoDiaNomiFocusTraversalPolicy(this);
			
			//rangodianomiFocusTraversalPolicy.setrangodianomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(rangodianomiModel);
			
			
			this.jContentPaneDetalleRangoDiaNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleRangoDiaNomi = new GridBagLayout();	
			this.jContentPaneDetalleRangoDiaNomi.setLayout(gridaBagLayoutDetalleRangoDiaNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosRangoDiaNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
				this.gridBagConstraintsRangoDiaNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsRangoDiaNomi.gridx = 0;
					
				
				this.jContentPaneDetalleRangoDiaNomi.add(jTtoolBarDetalleRangoDiaNomi, gridBagConstraintsRangoDiaNomi);								
				
}
			
			this.jScrollPanelDatosEdicionRangoDiaNomi=   new JScrollPane(jContentPaneDetalleRangoDiaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRangoDiaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoDiaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoDiaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralRangoDiaNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralRangoDiaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoDiaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralRangoDiaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsRangoDiaNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	        
			this.jContentPaneDetalleRangoDiaNomi.add(jPanelCamposRangoDiaNomi, gridBagConstraintsRangoDiaNomi);
			
			
			
			
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
						&& rangodianomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					
					if(this.rangodianomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsRangoDiaNomi= new GridBagConstraints();
						this.gridBagConstraintsRangoDiaNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsRangoDiaNomi.gridx = 0;
						this.jContentPaneDetalleRangoDiaNomi.add(this.jTabbedPaneRelacionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesRangoDiaNomi.setVisible(false);
						
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosRangoDiaNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
					this.gridBagConstraintsRangoDiaNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsRangoDiaNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsRangoDiaNomi.gridx = 0;
					
				
					this.jContentPaneDetalleRangoDiaNomi.add(jPanelCamposOcultosRangoDiaNomi, gridBagConstraintsRangoDiaNomi);
				
					this.jPanelCamposOcultosRangoDiaNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyRelaciones++;//1;		
	        this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	        this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleRangoDiaNomi.add(this.jPanelAccionesFormularioRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);							
			
			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
	        this.gridBagConstraintsRangoDiaNomi.gridy = iGridyRelaciones;//1;		
	        this.gridBagConstraintsRangoDiaNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleRangoDiaNomi.add(this.jPanelAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionRangoDiaNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionRangoDiaNomi=   new JScrollPane(this.jPanelCamposRangoDiaNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionRangoDiaNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoDiaNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionRangoDiaNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsRangoDiaNomi.gridx = 0;
			this.gridBagConstraintsRangoDiaNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsRangoDiaNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsRangoDiaNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRangoDiaNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);			
			
			this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
			this.gridBagConstraintsRangoDiaNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsRangoDiaNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
			
			
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		
			
		this.gridBagConstraintsRangoDiaNomi = new GridBagConstraints();
		this.gridBagConstraintsRangoDiaNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsRangoDiaNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesRangoDiaNomi, this.gridBagConstraintsRangoDiaNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralRangoDiaNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionRangoDiaNomi;
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
