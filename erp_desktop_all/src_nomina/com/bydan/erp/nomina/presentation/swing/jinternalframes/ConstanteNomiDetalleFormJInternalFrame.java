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
import com.bydan.erp.nomina.util.ConstanteNomiConstantesFunciones;

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
public class ConstanteNomiDetalleFormJInternalFrame extends ConstanteNomiBeanSwingJInternalFrameAdditional {	
	private static final long serialVersionUID = 1L;
	
	
	public JToolBar jTtoolBarDetalleConstanteNomi;
	
	protected JMenuBar jmenuBarDetalleConstanteNomi;
	
	protected JMenu jmenuDetalleConstanteNomi;
	protected JMenu jmenuDetalleArchivoConstanteNomi;
	protected JMenu jmenuDetalleAccionesConstanteNomi;
	protected JMenu jmenuDetalleDatosConstanteNomi;
	
	
	
	protected JPanel jContentPane = null;
	protected JPanel jContentPaneDetalleConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();	
	
	protected GridBagLayout gridaBagLayoutConstanteNomi;	
	protected GridBagConstraints gridBagConstraintsConstanteNomi;	
		
	//protected JInternalFrameBase jInternalFrameParent; //ESTA EN BASE
	//protected ConstanteNomiBeanSwingJInternalFrameAdditional jInternalFrameDetalleConstanteNomi;		
	
	
	//VENTANAS PARA ACTUALIZAR Y BUSCAR FK
	

	protected EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_empresa="";

	protected TipoConstanteNomiBeanSwingJInternalFrame tipoconstantenomiBeanSwingJInternalFrame;
	public String sFinalQueryGeneral_tipoconstantenomi="";
	
	public ConstanteNomiSessionBean constantenomiSessionBean;
	
	

	public EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFrame=null;
	public EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFramePopup=null;
	public Boolean puedeCargarPorParteEmpleadoConstante=false;
	public EmpleadoConstanteSessionBean empleadoconstanteSessionBean;
	
	
	public EmpresaSessionBean empresaSessionBean;
	public TipoConstanteNomiSessionBean tipoconstantenomiSessionBean;	
	
	public ConstanteNomiLogic constantenomiLogic;
	
	public JScrollPane jScrollPanelDatosConstanteNomi;
	public JScrollPane jScrollPanelDatosEdicionConstanteNomi;
	public JScrollPane jScrollPanelDatosGeneralConstanteNomi;
	
	protected JPanel jPanelCamposConstanteNomi;    
	protected JPanel jPanelCamposOcultosConstanteNomi;    	
	protected JPanel jPanelAccionesConstanteNomi;
	protected JPanel jPanelAccionesFormularioConstanteNomi;
    
	
	
	protected Integer iXPanelCamposConstanteNomi=0;
	protected Integer iYPanelCamposConstanteNomi=0;
	
	protected Integer iXPanelCamposOcultosConstanteNomi=0;
	protected Integer iYPanelCamposOcultosConstanteNomi=0;
	
	;
	;
	
		
	//ELEMENTOS TABLAS PARAMETOS	
		
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	public JButton jButtonNuevoConstanteNomi;
	public JButton jButtonModificarConstanteNomi;
	public JButton jButtonActualizarConstanteNomi;
    public JButton jButtonEliminarConstanteNomi;
	public JButton jButtonCancelarConstanteNomi;
    public JButton jButtonGuardarCambiosConstanteNomi;
	public JButton jButtonGuardarCambiosTablaConstanteNomi;
	protected JButton jButtonCerrarConstanteNomi;
	
	
	protected JButton jButtonProcesarInformacionConstanteNomi;
	
	
	protected JCheckBox jCheckBoxPostAccionNuevoConstanteNomi;
	protected JCheckBox jCheckBoxPostAccionSinCerrarConstanteNomi;
	protected JCheckBox jCheckBoxPostAccionSinMensajeConstanteNomi;
	
	//TOOLBAR
	
	
	protected JButton jButtonNuevoToolBarConstanteNomi;
	protected JButton jButtonModificarToolBarConstanteNomi;
	protected JButton jButtonActualizarToolBarConstanteNomi;
    protected JButton jButtonEliminarToolBarConstanteNomi;
	protected JButton jButtonCancelarToolBarConstanteNomi;
    protected JButton jButtonGuardarCambiosToolBarConstanteNomi;
	protected JButton jButtonGuardarCambiosTablaToolBarConstanteNomi;
	protected JButton jButtonMostrarOcultarTablaToolBarConstanteNomi;
	protected JButton jButtonCerrarToolBarConstanteNomi;
	
	protected JButton jButtonProcesarInformacionToolBarConstanteNomi;
	
	
	//TOOLBAR
	
	
	//MENU
	
	
	protected JMenuItem jMenuItemNuevoConstanteNomi;
	protected JMenuItem jMenuItemModificarConstanteNomi;
	protected JMenuItem jMenuItemActualizarConstanteNomi;
    protected JMenuItem jMenuItemEliminarConstanteNomi;
	protected JMenuItem jMenuItemCancelarConstanteNomi;
    protected JMenuItem jMenuItemGuardarCambiosConstanteNomi;
	protected JMenuItem jMenuItemGuardarCambiosTablaConstanteNomi;
	protected JMenuItem jMenuItemCerrarConstanteNomi;
	protected JMenuItem jMenuItemDetalleCerrarConstanteNomi;
	protected JMenuItem jMenuItemDetalleMostarOcultarConstanteNomi;
	
	protected JMenuItem jMenuItemProcesarInformacionConstanteNomi;
	protected JMenuItem jMenuItemNuevoGuardarCambiosConstanteNomi;
	protected JMenuItem jMenuItemMostrarOcultarConstanteNomi;
	
	
	//MENU
	
	
	protected JLabel jLabelAccionesConstanteNomi;	
		
	
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposRelacionesConstanteNomi;
	@SuppressWarnings("rawtypes")
	protected JComboBox jComboBoxTiposAccionesConstanteNomi;
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxTiposAccionesFormularioConstanteNomi;
	
		
	
	
	
	
	
	
	
	protected Boolean conMaximoRelaciones=true;
	protected Boolean conFuncionalidadRelaciones=true;
	public Boolean conCargarMinimo=false;
	public Boolean conMostrarAccionesCampo=false;
	public Boolean permiteRecargarForm=false;//PARA NUEVO PREPARAR Y MANEJO DE EVENTOS, EVITAR QUE SE EJECUTE AL CARGAR VENTANA O LOAD
	public Boolean conCargarFormDetalle=false;
	
	
	public JPanel jPanelidConstanteNomi;
	public JLabel jLabelIdConstanteNomi;
	public JLabel jLabelidConstanteNomi;
	public JButton jButtonidConstanteNomiBusqueda= new JButtonMe();

	public JPanel jPanelnombreConstanteNomi;
	public JLabel jLabelnombreConstanteNomi;
	public JTextArea jTextAreanombreConstanteNomi;
	public JScrollPane jscrollPanenombreConstanteNomi;
	public JButton jButtonnombreConstanteNomiBusqueda= new JButtonMe();

	public JPanel jPanelvalorConstanteNomi;
	public JLabel jLabelvalorConstanteNomi;
	public JTextField jTextFieldvalorConstanteNomi;
	public JButton jButtonvalorConstanteNomiBusqueda= new JButtonMe();

	public JPanel jPaneles_para_preguntaConstanteNomi;
	public JLabel jLabeles_para_preguntaConstanteNomi;
	public JCheckBox jCheckBoxes_para_preguntaConstanteNomi;
	public JButton jButtones_para_preguntaConstanteNomiBusqueda= new JButtonMe();

	
	public JPanel jPanelid_empresaConstanteNomi;
	public JLabel jLabelid_empresaConstanteNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_empresaConstanteNomi;
	public JButton jButtonid_empresaConstanteNomi= new JButtonMe();
	public JButton jButtonid_empresaConstanteNomiUpdate= new JButtonMe();
	public JButton jButtonid_empresaConstanteNomiBusqueda= new JButtonMe();

	public JPanel jPanelid_tipo_constante_nomiConstanteNomi;
	public JLabel jLabelid_tipo_constante_nomiConstanteNomi;
	@SuppressWarnings("rawtypes")
	public JComboBox jComboBoxid_tipo_constante_nomiConstanteNomi;
	public JButton jButtonid_tipo_constante_nomiConstanteNomi= new JButtonMe();
	public JButton jButtonid_tipo_constante_nomiConstanteNomiUpdate= new JButtonMe();
	public JButton jButtonid_tipo_constante_nomiConstanteNomiBusqueda= new JButtonMe();

	
	
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	protected JTabbedPane jTabbedPaneRelacionesConstanteNomi;
	
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
	
	public ConstanteNomiDetalleFormJInternalFrame(String sTipo) throws Exception {
		super(PaginaTipo.FORMULARIO);
       
		try {
			
	  		if(sTipo.equals("MINIMO")) {
				/*
				this.jPanelCamposConstanteNomi=new JPanel();
				this.jPanelAccionesFormularioConstanteNomi=new JPanel();
				this.jmenuBarDetalleConstanteNomi=new JMenuBar();
				this.jTtoolBarDetalleConstanteNomi=new JToolBar();
				*/
	  		}
	  		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiDetalleFormJInternalFrame(PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo); 
		
		//super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	//ES AUXILIAR PARA WINDOWS FORMS
	public ConstanteNomiDetalleFormJInternalFrame() throws Exception {
		super(PaginaTipo.FORMULARIO);
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			Boolean cargarRelaciones=false;
			
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,PaginaTipo.PRINCIPAL);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiDetalleFormJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,false,false,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiDetalleFormJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
	  	try {
			this.initialize(null,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,null,null,null,null,null,null,paginaTipo);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e, null);
		}
    }
	
	public ConstanteNomiDetalleFormJInternalFrame(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		super(paginaTipo);//,jdesktopPane
		
		this.jDesktopPane=jdesktopPane;
		
		this.dStart=(double)System.currentTimeMillis();
		
        //super("ConstanteNomi No " + (++openFrameCount),true, /*resizable*/true, /*closable*/true, /*maximizable*/true);//iconifiable
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
	
	
	public JButton getjButtonActualizarToolBarConstanteNomi() {
		return this.jButtonActualizarToolBarConstanteNomi;
	}
	
	public JButton getjButtonEliminarToolBarConstanteNomi() {
		return this.jButtonEliminarToolBarConstanteNomi;
	}
	
	public JButton getjButtonCancelarToolBarConstanteNomi() {
		return this.jButtonCancelarToolBarConstanteNomi;
	}		
	
	public JButton getjButtonProcesarInformacionConstanteNomi() {
		return this.jButtonProcesarInformacionConstanteNomi;
	}
	
	public void setjButtonProcesarInformacion(JButton jButtonProcesarInformacionConstanteNomi)	{
		this.jButtonProcesarInformacionConstanteNomi = jButtonProcesarInformacionConstanteNomi;
	}
	
	
	

	
	
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesConstanteNomi() {
		return this.jComboBoxTiposAccionesConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposRelacionesConstanteNomi(
			JComboBox jComboBoxTiposRelacionesConstanteNomi) {
		this.jComboBoxTiposRelacionesConstanteNomi = jComboBoxTiposRelacionesConstanteNomi;
	}
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesConstanteNomi(
			JComboBox jComboBoxTiposAccionesConstanteNomi) {
		this.jComboBoxTiposAccionesConstanteNomi = jComboBoxTiposAccionesConstanteNomi;
	}		
	
			
	
	@SuppressWarnings("rawtypes")
	public JComboBox getjComboBoxTiposAccionesFormularioConstanteNomi() {
		return this.jComboBoxTiposAccionesFormularioConstanteNomi;
	}				
	
	@SuppressWarnings("rawtypes")
	public void setjComboBoxTiposAccionesFormularioConstanteNomi(
			JComboBox jComboBoxTiposAccionesFormularioConstanteNomi) {
		this.jComboBoxTiposAccionesFormularioConstanteNomi = jComboBoxTiposAccionesFormularioConstanteNomi;
	}
	
	private void initialize(JDesktopPane jdesktopPane,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo) throws Exception {
		this.constantenomiSessionBean=new ConstanteNomiSessionBean();
		
		this.constantenomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.constantenomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
		
		
		this.conCargarMinimo=this.constantenomiSessionBean.getEsGuardarRelacionado();				
		
		this.conMostrarAccionesCampo=parametroGeneralUsuario.getcon_mostrar_acciones_campo_general() || opcionActual.getcon_mostrar_acciones_campo();
		
		
		if(!this.conCargarMinimo) {
		
		//this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		}
		
			
		this.sTipoTamanioGeneral=FuncionesSwing.getTipoTamanioGeneral(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.sTipoTamanioGeneralTabla=FuncionesSwing.getTipoTamanioGeneralTabla(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);
		this.conTipoTamanioManual=FuncionesSwing.getConTipoTamanioManual(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
		this.conTipoTamanioTodo=FuncionesSwing.getConTipoTamanioTodo(this,parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);		
				
		
		ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL=this.sTipoTamanioGeneral;
		ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=this.sTipoTamanioGeneralTabla;
		ConstanteNomiJInternalFrame.CONTIPO_TAMANIO_MANUAL=this.conTipoTamanioManual;
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int iWidth=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO);
		int iHeight=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO);
		
		//this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.opcionActual,this.usuarioActual,"Constante Nomi MANTENIMIENTO"));
		
		
		if(iWidth > 650) {
			iWidth=650;
		}
		
		if(iHeight > 1110) {
			iHeight=1110;
		}
		
		this.setSize(iWidth,iHeight);
		
		this.setFrameIcon(new ImageIcon(FuncionesSwing.getImagenBackground(Constantes2.S_ICON_IMAGE)));
		
	   	this.setContentPane(this.getJContentPane(iWidth,iHeight,jdesktopPane,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo));
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
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
	
		ConstanteNomiJInternalFrame.ESTA_CARGADO_PORPARTE=true;
		
    }
		
		
	
	public void inicializarToolBar() {
		this.jTtoolBarDetalleConstanteNomi= new JToolBar("MENU DATOS");		
		
		//TOOLBAR
		//PRINCIPAL				
				this.jButtonProcesarInformacionToolBarConstanteNomi=new JButtonMe();
				this.jButtonModificarToolBarConstanteNomi=new JButtonMe();							
		//PRINCIPAL
		
		//DETALLE
		this.jButtonActualizarToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonActualizarToolBarConstanteNomi,this.jTtoolBarDetalleConstanteNomi,
							"actualizar","actualizar","Actualizar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"),"Actualizar",false);
		
		
		
		
		this.jButtonEliminarToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonEliminarToolBarConstanteNomi,this.jTtoolBarDetalleConstanteNomi,
							"eliminar","eliminar","Eliminar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"),"Eliminar",false);
		
		
		
		
		this.jButtonCancelarToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonCancelarToolBarConstanteNomi,this.jTtoolBarDetalleConstanteNomi,
							"cancelar","cancelar","Cancelar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"),"Cancelar",false);
		
		
		
		
		this.jButtonGuardarCambiosToolBarConstanteNomi=FuncionesSwing.getButtonToolBarGeneral(this.jButtonGuardarCambiosToolBarConstanteNomi,this.jTtoolBarDetalleConstanteNomi,
							"guardarcambios","guardarcambios","Guardar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"),"Guardar",false);
		
		
		
		
		FuncionesSwing.setBoldButtonToolBar(this.jButtonActualizarToolBarConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonEliminarToolBarConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButtonToolBar(this.jButtonCancelarToolBarConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
	}
	
	
	
	public void cargarMenus() {		
		
		this.jmenuBarDetalleConstanteNomi=new JMenuBarMe();
		
		//DETALLE
		this.jmenuDetalleConstanteNomi=new JMenuMe("Datos Relacionados");
		this.jmenuDetalleArchivoConstanteNomi=new JMenuMe("Archivo");
		this.jmenuDetalleAccionesConstanteNomi=new JMenuMe("Acciones");
		this.jmenuDetalleDatosConstanteNomi=new JMenuMe("Datos");
		//DETALLE_FIN
				
		
		
		this.jMenuItemNuevoConstanteNomi= new JMenuItem("Nuevo" + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jMenuItemNuevoConstanteNomi.setActionCommand("Nuevo");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemNuevoConstanteNomi,"nuevo_button","Nuevo");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemNuevoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemModificarConstanteNomi= new JMenuItem("Editar" + FuncionesSwing.getKeyMensaje("MODIFICAR"));
		this.jMenuItemModificarConstanteNomi.setActionCommand("Editar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemModificarConstanteNomi,"modificar_button","Editar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemModificarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemActualizarConstanteNomi= new JMenuItem("Actualizar" + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
		this.jMenuItemActualizarConstanteNomi.setActionCommand("Actualizar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemActualizarConstanteNomi,"actualizar_button","Actualizar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemActualizarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemEliminarConstanteNomi= new JMenuItem("Eliminar" + FuncionesSwing.getKeyMensaje("ELIMINAR"));
		this.jMenuItemEliminarConstanteNomi.setActionCommand("Eliminar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemEliminarConstanteNomi,"eliminar_button","Eliminar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemEliminarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCancelarConstanteNomi= new JMenuItem("Cancelar" + FuncionesSwing.getKeyMensaje("CANCELAR"));
		this.jMenuItemCancelarConstanteNomi.setActionCommand("Cancelar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCancelarConstanteNomi,"cancelar_button","Cancelar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCancelarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemGuardarCambiosConstanteNomi= new JMenuItem("Guardar" + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jMenuItemGuardarCambiosConstanteNomi.setActionCommand("Guardar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemGuardarCambiosConstanteNomi,"guardarcambios_button","Guardar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemGuardarCambiosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemCerrarConstanteNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemCerrarConstanteNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemCerrarConstanteNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemCerrarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleCerrarConstanteNomi= new JMenuItem("Salir" + FuncionesSwing.getKeyMensaje("CERRAR"));
		this.jMenuItemDetalleCerrarConstanteNomi.setActionCommand("Cerrar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleCerrarConstanteNomi,"cerrar_button","Salir");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleCerrarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemMostrarOcultarConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemMostrarOcultarConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemMostrarOcultarConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");
		FuncionesSwing.setBoldMenuItem(this.jMenuItemMostrarOcultarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		this.jMenuItemDetalleMostarOcultarConstanteNomi= new JMenuItem("Mostrar Ocultar" + FuncionesSwing.getKeyMensaje("MOSTRAR_OCULTAR"));
		this.jMenuItemDetalleMostarOcultarConstanteNomi.setActionCommand("Mostrar Ocultar");
		FuncionesSwing.addImagenMenuItemGeneral(this.jMenuItemDetalleMostarOcultarConstanteNomi,"mostrar_ocultar_button","Mostrar Ocultar");			
		FuncionesSwing.setBoldMenuItem(this.jMenuItemDetalleMostarOcultarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);			
		
		//DETALLE
		this.jmenuDetalleArchivoConstanteNomi.add(this.jMenuItemDetalleCerrarConstanteNomi);
		
		this.jmenuDetalleAccionesConstanteNomi.add(this.jMenuItemActualizarConstanteNomi);
		this.jmenuDetalleAccionesConstanteNomi.add(this.jMenuItemEliminarConstanteNomi);
		this.jmenuDetalleAccionesConstanteNomi.add(this.jMenuItemCancelarConstanteNomi);		
		
		//this.jmenuDetalleDatosConstanteNomi.add(this.jMenuItemDetalleAbrirOrderByConstanteNomi);				
		this.jmenuDetalleDatosConstanteNomi.add(this.jMenuItemDetalleMostarOcultarConstanteNomi);				
				
		//this.jmenuDetalleAccionesConstanteNomi.add(this.jMenuItemGuardarCambiosConstanteNomi);		
		//DETALLE_FIN	
		
		//RELACIONES		
		//RELACIONES				
		
		//DETALLE
		FuncionesSwing.setBoldMenu(this.jmenuDetalleArchivoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleAccionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldMenu(this.jmenuDetalleDatosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
		this.jmenuBarDetalleConstanteNomi.add(this.jmenuDetalleArchivoConstanteNomi);		
		this.jmenuBarDetalleConstanteNomi.add(this.jmenuDetalleAccionesConstanteNomi);		
		this.jmenuBarDetalleConstanteNomi.add(this.jmenuDetalleDatosConstanteNomi);		
		
		//MENU RELACIONES
		if(!this.conCargarMinimo) {
			FuncionesSwing.setBoldMenu(this.jmenuDetalleConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
			
			this.jmenuBarDetalleConstanteNomi.add(this.jmenuDetalleConstanteNomi);		
		}
		//DETALLE_FIN
		
		
		//AGREGA MENU DETALLE A PANTALLA
		this.setJMenuBar(this.jmenuBarDetalleConstanteNomi);				
	}
	
	
	public void inicializarElementosCamposConstanteNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		jLabelIdConstanteNomi = new JLabelMe();
		jLabelIdConstanteNomi.setText(""+Constantes2.S_CODIGO_UNICO+"");
		jLabelIdConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		jLabelIdConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelIdConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jPanelidConstanteNomi = new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelidConstanteNomi.setToolTipText(ConstanteNomiConstantesFunciones.LABEL_ID);
		this.gridaBagLayoutConstanteNomi= new GridBagLayout();

		this.jPanelidConstanteNomi.setLayout(this.gridaBagLayoutConstanteNomi);

		jLabelidConstanteNomi = new JLabel();
		jLabelidConstanteNomi.setText("Id");

		jLabelidConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		jLabelidConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));



					
		this.jLabelnombreConstanteNomi = new JLabelMe();
		this.jLabelnombreConstanteNomi.setText(""+ConstanteNomiConstantesFunciones.LABEL_NOMBRE+" : *");
		this.jLabelnombreConstanteNomi.setToolTipText("Nombre");
		this.jLabelnombreConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelnombreConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelnombreConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelnombreConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelnombreConstanteNomi.setToolTipText(ConstanteNomiConstantesFunciones.LABEL_NOMBRE);
		this.gridaBagLayoutConstanteNomi = new GridBagLayout();
		this.jPanelnombreConstanteNomi.setLayout(this.gridaBagLayoutConstanteNomi);


		jTextAreanombreConstanteNomi= new JTextAreaMe();
		jTextAreanombreConstanteNomi.setEnabled(false);
		jTextAreanombreConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextAreanombreConstanteNomi.setLineWrap(true);
		jTextAreanombreConstanteNomi.setWrapStyleWord(true);
		jTextAreanombreConstanteNomi.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		jTextAreanombreConstanteNomi.setRows(4);

		FuncionesSwing.setBoldTextArea(jTextAreanombreConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jscrollPanenombreConstanteNomi = new JScrollPane(jTextAreanombreConstanteNomi);
		jscrollPanenombreConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));
		jscrollPanenombreConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),70));

		this.jButtonnombreConstanteNomiBusqueda= new JButtonMe();
		this.jButtonnombreConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonnombreConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonnombreConstanteNomiBusqueda.setText("U");
		this.jButtonnombreConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonnombreConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonnombreConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextAreanombreConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextAreanombreConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"nombreConstanteNomiBusqueda"));

		if(this.constantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonnombreConstanteNomiBusqueda.setVisible(false);		}


					
		this.jLabelvalorConstanteNomi = new JLabelMe();
		this.jLabelvalorConstanteNomi.setText(""+ConstanteNomiConstantesFunciones.LABEL_VALOR+" : *");
		this.jLabelvalorConstanteNomi.setToolTipText("Valor");
		this.jLabelvalorConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelvalorConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelvalorConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelvalorConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelvalorConstanteNomi.setToolTipText(ConstanteNomiConstantesFunciones.LABEL_VALOR);
		this.gridaBagLayoutConstanteNomi = new GridBagLayout();
		this.jPanelvalorConstanteNomi.setLayout(this.gridaBagLayoutConstanteNomi);


		jTextFieldvalorConstanteNomi= new JTextFieldMe();
		jTextFieldvalorConstanteNomi.setEnabled(false);
		jTextFieldvalorConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jTextFieldvalorConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_VALOR + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_VALOR,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldTextField(jTextFieldvalorConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		jTextFieldvalorConstanteNomi.setText("0.0");

		this.jButtonvalorConstanteNomiBusqueda= new JButtonMe();
		this.jButtonvalorConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonvalorConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonvalorConstanteNomiBusqueda.setText("U");
		this.jButtonvalorConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonvalorConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonvalorConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jTextFieldvalorConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jTextFieldvalorConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"valorConstanteNomiBusqueda"));

		if(this.constantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonvalorConstanteNomiBusqueda.setVisible(false);		}


					
		this.jLabeles_para_preguntaConstanteNomi = new JLabelMe();
		this.jLabeles_para_preguntaConstanteNomi.setText(""+ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA+" : *");
		this.jLabeles_para_preguntaConstanteNomi.setToolTipText("Es Para Pregunta");
		this.jLabeles_para_preguntaConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_para_preguntaConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));
		this.jLabeles_para_preguntaConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL2 + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL2,0)));

		FuncionesSwing.setBoldLabel(jLabeles_para_preguntaConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPaneles_para_preguntaConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPaneles_para_preguntaConstanteNomi.setToolTipText(ConstanteNomiConstantesFunciones.LABEL_ESPARAPREGUNTA);
		this.gridaBagLayoutConstanteNomi = new GridBagLayout();
		this.jPaneles_para_preguntaConstanteNomi.setLayout(this.gridaBagLayoutConstanteNomi);


		jCheckBoxes_para_preguntaConstanteNomi= new JCheckBoxMe();
		jCheckBoxes_para_preguntaConstanteNomi.setEnabled(false);

		jCheckBoxes_para_preguntaConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_preguntaConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jCheckBoxes_para_preguntaConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldCheckBox(jCheckBoxes_para_preguntaConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtones_para_preguntaConstanteNomiBusqueda= new JButtonMe();
		this.jButtones_para_preguntaConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_preguntaConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtones_para_preguntaConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtones_para_preguntaConstanteNomiBusqueda.setText("U");
		this.jButtones_para_preguntaConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtones_para_preguntaConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtones_para_preguntaConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jCheckBoxes_para_preguntaConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jCheckBoxes_para_preguntaConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"es_para_preguntaConstanteNomiBusqueda"));

		if(this.constantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtones_para_preguntaConstanteNomiBusqueda.setVisible(false);		}


	}
	
	public void inicializarElementosCamposForeigKeysConstanteNomi() {
		String sKeyStrokeName="";
		KeyStroke keyStrokeControl=null;
		
		
					
		this.jLabelid_empresaConstanteNomi = new JLabelMe();
		this.jLabelid_empresaConstanteNomi.setText(""+ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA+" : *");
		this.jLabelid_empresaConstanteNomi.setToolTipText("Empresa");
		this.jLabelid_empresaConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_empresaConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_empresaConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_empresaConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_empresaConstanteNomi.setToolTipText(ConstanteNomiConstantesFunciones.LABEL_IDEMPRESA);
		this.gridaBagLayoutConstanteNomi = new GridBagLayout();
		this.jPanelid_empresaConstanteNomi.setLayout(this.gridaBagLayoutConstanteNomi);


		jComboBoxid_empresaConstanteNomi= new JComboBoxMe();
		jComboBoxid_empresaConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_empresaConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_empresaConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		jComboBoxid_empresaConstanteNomi.setEnabled(false);

		this.jButtonid_empresaConstanteNomi= new JButtonMe();
		this.jButtonid_empresaConstanteNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConstanteNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConstanteNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_empresaConstanteNomi.setText("Buscar");
		this.jButtonid_empresaConstanteNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_empresaConstanteNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConstanteNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_empresaConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConstanteNomi"));

		this.jButtonid_empresaConstanteNomiBusqueda= new JButtonMe();
		this.jButtonid_empresaConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConstanteNomiBusqueda.setText("U");
		this.jButtonid_empresaConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_empresaConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_empresaConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConstanteNomiBusqueda"));

		if(this.constantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_empresaConstanteNomiBusqueda.setVisible(false);		}

		this.jButtonid_empresaConstanteNomiUpdate= new JButtonMe();
		this.jButtonid_empresaConstanteNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConstanteNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_empresaConstanteNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_empresaConstanteNomiUpdate.setText("U");
		this.jButtonid_empresaConstanteNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_empresaConstanteNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_empresaConstanteNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_empresaConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_empresaConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_empresaConstanteNomiUpdate"));



					
		this.jLabelid_tipo_constante_nomiConstanteNomi = new JLabelMe();
		this.jLabelid_tipo_constante_nomiConstanteNomi.setText(""+ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI+" : *");
		this.jLabelid_tipo_constante_nomiConstanteNomi.setToolTipText("Tipo Constante");
		this.jLabelid_tipo_constante_nomiConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_constante_nomiConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));
		this.jLabelid_tipo_constante_nomiConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL_LABEL,-22),Constantes2.ISWING_ALTO_CONTROL_LABEL + FuncionesSwing.getValorProporcion(Constantes2.ISWING_ALTO_CONTROL_LABEL,0)));

		FuncionesSwing.setBoldLabel(jLabelid_tipo_constante_nomiConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		
		this.jPanelid_tipo_constante_nomiConstanteNomi=new JPanelMe("fondo_formulario",true);//new JPanel();

		this.jPanelid_tipo_constante_nomiConstanteNomi.setToolTipText(ConstanteNomiConstantesFunciones.LABEL_IDTIPOCONSTANTENOMI);
		this.gridaBagLayoutConstanteNomi = new GridBagLayout();
		this.jPanelid_tipo_constante_nomiConstanteNomi.setLayout(this.gridaBagLayoutConstanteNomi);


		jComboBoxid_tipo_constante_nomiConstanteNomi= new JComboBoxMe();
		jComboBoxid_tipo_constante_nomiConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_constante_nomiConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));
		jComboBoxid_tipo_constante_nomiConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0),Constantes.ISWING_ALTO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ALTO_CONTROL,0)));

		FuncionesSwing.setBoldComboBox(jComboBoxid_tipo_constante_nomiConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);

		this.jButtonid_tipo_constante_nomiConstanteNomi= new JButtonMe();
		this.jButtonid_tipo_constante_nomiConstanteNomi.setMinimumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_constante_nomiConstanteNomi.setMaximumSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_constante_nomiConstanteNomi.setPreferredSize(new Dimension(50,Constantes.ISWING_ALTO_CONTROL));
		this.jButtonid_tipo_constante_nomiConstanteNomi.setText("Buscar");
		this.jButtonid_tipo_constante_nomiConstanteNomi.setToolTipText("Buscar ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA")+")");
		this.jButtonid_tipo_constante_nomiConstanteNomi.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_constante_nomiConstanteNomi,"buscar_form","Buscar");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSQUEDA");
		jComboBoxid_tipo_constante_nomiConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_constante_nomiConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_constante_nomiConstanteNomi"));

		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda= new JButtonMe();
		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setText("U");
		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setToolTipText("BUSCAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR")+")");
		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda,"buscardatos","BUSCAR DATOS");

		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_BUSCAR");
		jComboBoxid_tipo_constante_nomiConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_constante_nomiConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_constante_nomiConstanteNomiBusqueda"));

		if(this.constantenomiSessionBean.getEsGuardarRelacionado() || paginaTipo.equals(PaginaTipo.SECUNDARIO)) {
		this.jButtonid_tipo_constante_nomiConstanteNomiBusqueda.setVisible(false);		}

		this.jButtonid_tipo_constante_nomiConstanteNomiUpdate= new JButtonMe();
		this.jButtonid_tipo_constante_nomiConstanteNomiUpdate.setMinimumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_constante_nomiConstanteNomiUpdate.setMaximumSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		this.jButtonid_tipo_constante_nomiConstanteNomiUpdate.setPreferredSize(new Dimension(Constantes2.ISWING_ANCHO_CONTROL_BOTONICONO,Constantes2.ISWING_ALTO_CONTROL_BOTONICONO));
		//this.jButtonid_tipo_constante_nomiConstanteNomiUpdate.setText("U");
		this.jButtonid_tipo_constante_nomiConstanteNomiUpdate.setToolTipText("ACTUALIZAR DATOS ("+FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR")+")");
		this.jButtonid_tipo_constante_nomiConstanteNomiUpdate.setFocusable(false);
		FuncionesSwing.addImagenButtonGeneral(this.jButtonid_tipo_constante_nomiConstanteNomiUpdate,"actualizardatos","ACTUALIZAR DATOS");
		sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
		keyStrokeControl=FuncionesSwing.getKeyStrokeControl( "CONTROL_ACTUALIZAR");
		jComboBoxid_tipo_constante_nomiConstanteNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
		jComboBoxid_tipo_constante_nomiConstanteNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(this,"id_tipo_constante_nomiConstanteNomiUpdate"));



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
		//this.jInternalFrameDetalleConstanteNomi = new ConstanteNomiBeanSwingJInternalFrameAdditional(paginaTipo);//JInternalFrameBase("Constante Nomi DATOS");
		
		
		this.cargarMenus();		
		
		
		this.gridaBagLayoutConstanteNomi= new GridBagLayout();
		

		
		String sToolTipConstanteNomi="";
		sToolTipConstanteNomi=ConstanteNomiConstantesFunciones.SCLASSWEBTITULO;
		
		if(Constantes.ISDEVELOPING) {
			sToolTipConstanteNomi+="(Nomina.ConstanteNomi)";
		}
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			sToolTipConstanteNomi+="_"+this.opcionActual.getId();
		}
								
		
		this.jButtonNuevoConstanteNomi = new JButtonMe();
		this.jButtonModificarConstanteNomi = new JButtonMe();
        this.jButtonActualizarConstanteNomi = new JButtonMe();
        this.jButtonEliminarConstanteNomi = new JButtonMe();
        this.jButtonCancelarConstanteNomi = new JButtonMe();
        this.jButtonGuardarCambiosConstanteNomi = new JButtonMe();
		this.jButtonGuardarCambiosTablaConstanteNomi = new JButtonMe();
		this.jButtonCerrarConstanteNomi = new JButtonMe();
		
		this.jScrollPanelDatosConstanteNomi = new JScrollPane();   
        this.jScrollPanelDatosEdicionConstanteNomi = new JScrollPane();
		this.jScrollPanelDatosGeneralConstanteNomi = new JScrollPane();
				
		
		
		this.jPanelCamposConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
		this.jPanelCamposOcultosConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);
        this.jPanelAccionesConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		this.jPanelAccionesFormularioConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);               
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		this.sPath=" <---> Acceso: Constante Nomi";
		
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()) {
			this.jScrollPanelDatosConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Constante Nomis" + this.sPath));
		} else {
			this.jScrollPanelDatosConstanteNomi.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		}
		
		this.jScrollPanelDatosEdicionConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		this.jScrollPanelDatosGeneralConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Edicion Datos"));
		
		
			
        this.jPanelCamposConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos"));
        this.jPanelCamposConstanteNomi.setName("jPanelCamposConstanteNomi"); 

		this.jPanelCamposOcultosConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Campos Ocultos"));
        this.jPanelCamposOcultosConstanteNomi.setName("jPanelCamposOcultosConstanteNomi"); 

        this.jPanelAccionesConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));
        this.jPanelAccionesConstanteNomi.setToolTipText("Acciones");
        this.jPanelAccionesConstanteNomi.setName("Acciones"); 

		this.jPanelAccionesFormularioConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones Extra/Post"));
        this.jPanelAccionesFormularioConstanteNomi.setToolTipText("Acciones");
        this.jPanelAccionesFormularioConstanteNomi.setName("Acciones"); 
		
		
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosEdicionConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosGeneralConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldScrollPanel(this.jScrollPanelDatosConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);		
		FuncionesSwing.setBoldPanel(this.jPanelCamposConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelCamposOcultosConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
        FuncionesSwing.setBoldPanel(this.jPanelAccionesFormularioConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		//if(!this.conCargarMinimo) {
		;
		;
		//}
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {
		
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		
		
        this.jButtonNuevoConstanteNomi.setText("Nuevo");
		this.jButtonModificarConstanteNomi.setText("Editar");
        this.jButtonActualizarConstanteNomi.setText("Actualizar");
        this.jButtonEliminarConstanteNomi.setText("Eliminar");
        this.jButtonCancelarConstanteNomi.setText("Cancelar");
        this.jButtonGuardarCambiosConstanteNomi.setText("Guardar");
		this.jButtonGuardarCambiosTablaConstanteNomi.setText("Guardar");
		this.jButtonCerrarConstanteNomi.setText("Salir");
		
		FuncionesSwing.addImagenButtonGeneral(this.jButtonNuevoConstanteNomi,"nuevo_button","Nuevo",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonModificarConstanteNomi,"modificar_button","Editar",this.constantenomiSessionBean.getEsGuardarRelacionado());
       	FuncionesSwing.addImagenButtonGeneral(this.jButtonActualizarConstanteNomi,"actualizar_button","Actualizar",this.constantenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonEliminarConstanteNomi,"eliminar_button","Eliminar",this.constantenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonCancelarConstanteNomi,"cancelar_button","Cancelar",this.constantenomiSessionBean.getEsGuardarRelacionado());
        FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosConstanteNomi,"guardarcambios_button","Guardar",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonGuardarCambiosTablaConstanteNomi,"guardarcambiostabla_button","Guardar",this.constantenomiSessionBean.getEsGuardarRelacionado());
		FuncionesSwing.addImagenButtonGeneral(this.jButtonCerrarConstanteNomi,"cerrar_button","Salir",this.constantenomiSessionBean.getEsGuardarRelacionado());
		
		FuncionesSwing.setBoldButton(this.jButtonNuevoConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonModificarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonGuardarCambiosTablaConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		FuncionesSwing.setBoldButton(this.jButtonCerrarConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);
		
		FuncionesSwing.setBoldButton(this.jButtonActualizarConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonEliminarConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		FuncionesSwing.setBoldButton(this.jButtonCancelarConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
		
		this.jButtonNuevoConstanteNomi.setToolTipText("Nuevo"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("NUEVO"));
		this.jButtonModificarConstanteNomi.setToolTipText("Editar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO+"");// + FuncionesSwing.getKeyMensaje("MODIFICAR"))
        this.jButtonActualizarConstanteNomi.setToolTipText("Actualizar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ACTUALIZAR"));
        this.jButtonEliminarConstanteNomi.setToolTipText("Eliminar)"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("ELIMINAR"));
        this.jButtonCancelarConstanteNomi.setToolTipText("Cancelar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CANCELAR"));
        this.jButtonGuardarCambiosConstanteNomi.setToolTipText("Guardar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonGuardarCambiosTablaConstanteNomi.setToolTipText("Guardar"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("GUARDAR_CAMBIOS"));
		this.jButtonCerrarConstanteNomi.setToolTipText("Salir"+" "+ConstanteNomiConstantesFunciones.SCLASSWEBTITULO + FuncionesSwing.getKeyMensaje("CERRAR"));
		
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
		sMapKey = "NuevoConstanteNomi";
		inputMap = this.jButtonNuevoConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("NUEVO") , FuncionesSwing.getMaskKey("NUEVO")), sMapKey);
	
		this.jButtonNuevoConstanteNomi.getActionMap().put(sMapKey, new ButtonAbstractAction(this,"NuevoConstanteNomi"));
		
		//ACTUALIZAR
		sMapKey = "ActualizarConstanteNomi";
		inputMap = this.jButtonActualizarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ACTUALIZAR") , FuncionesSwing.getMaskKey("ACTUALIZAR")), sMapKey);
		
		this.jButtonActualizarConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"ActualizarConstanteNomi"));
		
		//ELIMINAR
		sMapKey = "EliminarConstanteNomi";
		inputMap = this.jButtonEliminarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("ELIMINAR") , FuncionesSwing.getMaskKey("ELIMINAR")), sMapKey);
		
		this.jButtonEliminarConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"EliminarConstanteNomi"));
		
		//CANCELAR	
		sMapKey = "CancelarConstanteNomi";
		inputMap = this.jButtonCancelarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CANCELAR") , FuncionesSwing.getMaskKey("CANCELAR")), sMapKey);
		
		this.jButtonCancelarConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CancelarConstanteNomi"));
		
		//CERRAR		
		sMapKey = "CerrarConstanteNomi";
		inputMap = this.jButtonCerrarConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("CERRAR") , FuncionesSwing.getMaskKey("CERRAR")), sMapKey);
				
		this.jButtonCerrarConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"CerrarConstanteNomi"));
		
		//GUARDAR CAMBIOS
		sMapKey = "GuardarCambiosTablaConstanteNomi";
		inputMap = this.jButtonGuardarCambiosTablaConstanteNomi.getInputMap(FuncionesSwing.getTipoFocusedKeyEvent("NORMAL"));
		inputMap.put(KeyStroke.getKeyStroke(FuncionesSwing.getKeyEvent("GUARDAR_CAMBIOS") , FuncionesSwing.getMaskKey("GUARDAR_CAMBIOS")), sMapKey);
		
		this.jButtonGuardarCambiosTablaConstanteNomi.getActionMap().put(sMapKey,new ButtonAbstractAction(this,"GuardarCambiosTablaConstanteNomi"));
		
		//HOT KEYS
		
		this.jCheckBoxPostAccionNuevoConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionNuevoConstanteNomi.setText("Nuevo");
		this.jCheckBoxPostAccionNuevoConstanteNomi.setToolTipText("Nuevo ConstanteNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionNuevoConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinCerrarConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinCerrarConstanteNomi.setText("Sin Cerrar");
		this.jCheckBoxPostAccionSinCerrarConstanteNomi.setToolTipText("Sin Cerrar Ventana ConstanteNomi");				
		
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinCerrarConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);
       
	
		this.jCheckBoxPostAccionSinMensajeConstanteNomi = new JCheckBoxMe();
		this.jCheckBoxPostAccionSinMensajeConstanteNomi.setText("Sin Mensaje");
		this.jCheckBoxPostAccionSinMensajeConstanteNomi.setToolTipText("Sin Mensaje Confirmacion");				
				
		FuncionesSwing.setBoldCheckBox(this.jCheckBoxPostAccionSinMensajeConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);       	
       
				
		
			
			
		this.jComboBoxTiposAccionesConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesConstanteNomi.setText("Accion");
		this.jComboBoxTiposAccionesConstanteNomi.setToolTipText("Tipos de Acciones");
							
		

		this.jComboBoxTiposAccionesFormularioConstanteNomi = new JComboBoxMe();
		//this.jComboBoxTiposAccionesFormularioConstanteNomi.setText("Accion");				
    	this.jComboBoxTiposAccionesFormularioConstanteNomi.setToolTipText("Tipos de Acciones");
	
		this.jLabelAccionesConstanteNomi = new JLabelMe();
		
		this.jLabelAccionesConstanteNomi.setText("Acciones");		
		this.jLabelAccionesConstanteNomi.setMinimumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConstanteNomi.setMaximumSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		this.jLabelAccionesConstanteNomi.setPreferredSize(new Dimension(Constantes.ISWING_ANCHO_CONTROL,Constantes.ISWING_ALTO_CONTROL));
		
		
        //HOT KEYS2
		
		/*
		T->Nuevo Tabla
		*/
		//NUEVO GUARDAR CAMBIOS O NUEVO TABLA
		//HOT KEYS2
		
		//ELEMENTOS
		this.inicializarElementosCamposConstanteNomi();
		
		//ELEMENTOS FK
		this.inicializarElementosCamposForeigKeysConstanteNomi();
				
		
		//ELEMENTOS TABLAS PARAMETOS
		if(!this.conCargarMinimo) {			
			
			
							
		}
		//ELEMENTOS TABLAS PARAMETOS_FIN
				
		
				
		//ELEMENTOS TABLAS PARAMETOS_FIN
		
		this.jTabbedPaneRelacionesConstanteNomi=new JTabbedPane();
		this.jTabbedPaneRelacionesConstanteNomi.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Relacionados"));
		
		//ESTA EN BEAN

		
		FuncionesSwing.setBoldTabbedPane(this.jTabbedPaneRelacionesConstanteNomi,STIPO_TAMANIO_GENERAL,false,false,this);
		
		
		int iPosXAccionPaginacion=0;
		
		
		
				
		
		this.jComboBoxTiposAccionesConstanteNomi.setMinimumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConstanteNomi.setMaximumSize(new Dimension(145,20));
		this.jComboBoxTiposAccionesConstanteNomi.setPreferredSize(new Dimension(145,20));
			
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesConstanteNomi, STIPO_TAMANIO_GENERAL,false,true,this);;
			
		
		
		this.jComboBoxTiposAccionesFormularioConstanteNomi.setMinimumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConstanteNomi.setMaximumSize(new Dimension(145,20));
        this.jComboBoxTiposAccionesFormularioConstanteNomi.setPreferredSize(new Dimension(145,20));
		
		FuncionesSwing.setBoldComboBox(this.jComboBoxTiposAccionesFormularioConstanteNomi, STIPO_TAMANIO_GENERAL,false,false,this);				
		
		GridBagLayout gridaBagLayoutCamposConstanteNomi = new GridBagLayout();
		GridBagLayout gridaBagLayoutCamposOcultosConstanteNomi = new GridBagLayout();
		
		this.jPanelCamposConstanteNomi.setLayout(gridaBagLayoutCamposConstanteNomi);
		this.jPanelCamposOcultosConstanteNomi.setLayout(gridaBagLayoutCamposOcultosConstanteNomi);
		
		;
		;
		
		
		//SUBPANELES SIMPLES
		//SUBPANELES POR CAMPO
        
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 0;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelidConstanteNomi.add(jLabelIdConstanteNomi, this.gridBagConstraintsConstanteNomi);



	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 1;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelidConstanteNomi.add(jLabelidConstanteNomi, this.gridBagConstraintsConstanteNomi);


	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 0;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_empresaConstanteNomi.add(jLabelid_empresaConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 2;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConstanteNomi.add(jButtonid_empresaConstanteNomiBusqueda, this.gridBagConstraintsConstanteNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 3;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_empresaConstanteNomi.add(jButtonid_empresaConstanteNomiUpdate, this.gridBagConstraintsConstanteNomi);
	}

	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 1;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_empresaConstanteNomi.add(jComboBoxid_empresaConstanteNomi, this.gridBagConstraintsConstanteNomi);


	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 0;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelid_tipo_constante_nomiConstanteNomi.add(jLabelid_tipo_constante_nomiConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 2;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_constante_nomiConstanteNomi.add(jButtonid_tipo_constante_nomiConstanteNomiBusqueda, this.gridBagConstraintsConstanteNomi);
	}

	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 3;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelid_tipo_constante_nomiConstanteNomi.add(jButtonid_tipo_constante_nomiConstanteNomiUpdate, this.gridBagConstraintsConstanteNomi);
	}

	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 1;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelid_tipo_constante_nomiConstanteNomi.add(jComboBoxid_tipo_constante_nomiConstanteNomi, this.gridBagConstraintsConstanteNomi);


	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 0;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelnombreConstanteNomi.add(jLabelnombreConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 2;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelnombreConstanteNomi.add(jButtonnombreConstanteNomiBusqueda, this.gridBagConstraintsConstanteNomi);
	}

	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 1;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelnombreConstanteNomi.add(jscrollPanenombreConstanteNomi, this.gridBagConstraintsConstanteNomi);


	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 0;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelvalorConstanteNomi.add(jLabelvalorConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 2;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPanelvalorConstanteNomi.add(jButtonvalorConstanteNomiBusqueda, this.gridBagConstraintsConstanteNomi);
	}

	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 1;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPanelvalorConstanteNomi.add(jTextFieldvalorConstanteNomi, this.gridBagConstraintsConstanteNomi);


	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 0;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPaneles_para_preguntaConstanteNomi.add(jLabeles_para_preguntaConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(this.conMostrarAccionesCampo) {

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		//this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = 2;
		this.gridBagConstraintsConstanteNomi.ipadx = 0;
		this.gridBagConstraintsConstanteNomi.insets = new Insets(0, 0, 0, 0);
		this.jPaneles_para_preguntaConstanteNomi.add(jButtones_para_preguntaConstanteNomiBusqueda, this.gridBagConstraintsConstanteNomi);
	}

	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.HORIZONTAL;
	this.gridBagConstraintsConstanteNomi.gridy = 0;
	this.gridBagConstraintsConstanteNomi.gridx = 1;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);
	this.jPaneles_para_preguntaConstanteNomi.add(jCheckBoxes_para_preguntaConstanteNomi, this.gridBagConstraintsConstanteNomi);


		//SUBPANELES SIMPLES
		
		//SUBPANELES EN PANEL
		//SUBPANELES EN PANEL CAMPOS NORMAL				
		
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConstanteNomi.gridy = iYPanelCamposConstanteNomi;
	this.gridBagConstraintsConstanteNomi.gridx = iXPanelCamposConstanteNomi++;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConstanteNomi.add(this.jPanelidConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(iXPanelCamposConstanteNomi % 1==0) {
		iXPanelCamposConstanteNomi=0;
		iYPanelCamposConstanteNomi++;
	}
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConstanteNomi.gridy = iYPanelCamposConstanteNomi;
	this.gridBagConstraintsConstanteNomi.gridx = iXPanelCamposConstanteNomi++;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConstanteNomi.add(this.jPanelid_tipo_constante_nomiConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(iXPanelCamposConstanteNomi % 1==0) {
		iXPanelCamposConstanteNomi=0;
		iYPanelCamposConstanteNomi++;
	}
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConstanteNomi.gridy = iYPanelCamposConstanteNomi;
	this.gridBagConstraintsConstanteNomi.gridx = iXPanelCamposConstanteNomi++;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConstanteNomi.add(this.jPanelnombreConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(iXPanelCamposConstanteNomi % 1==0) {
		iXPanelCamposConstanteNomi=0;
		iYPanelCamposConstanteNomi++;
	}
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConstanteNomi.gridy = iYPanelCamposConstanteNomi;
	this.gridBagConstraintsConstanteNomi.gridx = iXPanelCamposConstanteNomi++;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConstanteNomi.add(this.jPanelvalorConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(iXPanelCamposConstanteNomi % 1==0) {
		iXPanelCamposConstanteNomi=0;
		iYPanelCamposConstanteNomi++;
	}
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConstanteNomi.gridy = iYPanelCamposConstanteNomi;
	this.gridBagConstraintsConstanteNomi.gridx = iXPanelCamposConstanteNomi++;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposConstanteNomi.add(this.jPaneles_para_preguntaConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(iXPanelCamposConstanteNomi % 1==0) {
		iXPanelCamposConstanteNomi=0;
		iYPanelCamposConstanteNomi++;
	}
		
		//SUBPANELES EN PANEL CAMPOS OCULTOS				
		
	this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.NONE;
	this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
	this.gridBagConstraintsConstanteNomi.gridy = iYPanelCamposOcultosConstanteNomi;
	this.gridBagConstraintsConstanteNomi.gridx = iXPanelCamposOcultosConstanteNomi++;
	this.gridBagConstraintsConstanteNomi.ipadx = 0;
	//COLSPAN_NUEVAFILA
	this.gridBagConstraintsConstanteNomi.insets = new Insets(Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING_LEFT, Constantes2.I_CELLSPACING, Constantes2.I_CELLSPACING);

	this.jPanelCamposOcultosConstanteNomi.add(this.jPanelid_empresaConstanteNomi, this.gridBagConstraintsConstanteNomi);



	if(iXPanelCamposOcultosConstanteNomi % 1==0) {
		iXPanelCamposOcultosConstanteNomi=0;
		iYPanelCamposOcultosConstanteNomi++;
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
			
		GridBagLayout gridaBagLayoutAccionesConstanteNomi= new GridBagLayout();
		this.jPanelAccionesConstanteNomi.setLayout(gridaBagLayoutAccionesConstanteNomi);
		
		GridBagLayout gridaBagLayoutAccionesFormularioConstanteNomi= new GridBagLayout();
		this.jPanelAccionesFormularioConstanteNomi.setLayout(gridaBagLayoutAccionesFormularioConstanteNomi);
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConstanteNomi.add(this.jComboBoxTiposAccionesFormularioConstanteNomi, this.gridBagConstraintsConstanteNomi);

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
		this.gridBagConstraintsConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
			
		this.jPanelAccionesFormularioConstanteNomi.add(this.jCheckBoxPostAccionNuevoConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
		//DEBE CERRARSE Y ACTUALIZARSE TODO NUEVAMENTE, SI ES RELACIONADO PUEDE FUNCIONAR
		//if(!this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {		
		//SE ARRIESGA
		//if(!this.conFuncionalidadRelaciones) {		
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConstanteNomi.add(this.jCheckBoxPostAccionSinCerrarConstanteNomi, this.gridBagConstraintsConstanteNomi);
		//}
		
		
		//NO TIENE MENSAJE POR DEFINICION, O ES MUY COMPLEJO LA PANTALLA PARA HACERLO MAS COMPLICADO
		if(!this.constantenomiSessionBean.getEsGuardarRelacionado()
			){				
			//&& !this.constantenomiSessionBean.getEstaModoGuardarRelaciones()) {
							
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy = iGridYParametrosAccionesFormulario;		
			this.gridBagConstraintsConstanteNomi.gridx = iGridXParametrosAccionesFormulario++;
				
			this.jPanelAccionesFormularioConstanteNomi.add(this.jCheckBoxPostAccionSinMensajeConstanteNomi, this.gridBagConstraintsConstanteNomi);
		}
		
		
		int iPosXAccion=0;
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx = iPosXAccion++;
			
		this.jPanelAccionesConstanteNomi.add(this.jButtonModificarConstanteNomi, this.gridBagConstraintsConstanteNomi);							

		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.VERTICAL;
		this.gridBagConstraintsConstanteNomi.gridy = 0;
		this.gridBagConstraintsConstanteNomi.gridx =iPosXAccion++;
			
		this.jPanelAccionesConstanteNomi.add(this.jButtonEliminarConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = 0;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesConstanteNomi.add(this.jButtonActualizarConstanteNomi, this.gridBagConstraintsConstanteNomi);


		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = 0;		
		this.gridBagConstraintsConstanteNomi.gridx = iPosXAccion++;
		
		this.jPanelAccionesConstanteNomi.add(this.jButtonGuardarCambiosConstanteNomi, this.gridBagConstraintsConstanteNomi);	
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = 0;		
		this.gridBagConstraintsConstanteNomi.gridx =iPosXAccion++;
		
		this.jPanelAccionesConstanteNomi.add(this.jButtonCancelarConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
			
			
		//this.setJProgressBarToJPanel();
		
		GridBagLayout gridaBagLayoutConstanteNomi = new GridBagLayout();
		
		this.jContentPane.setLayout(gridaBagLayoutConstanteNomi);
		
		if(this.parametroGeneralUsuario.getcon_botones_tool_bar() && !this.constantenomiSessionBean.getEsGuardarRelacionado()) {			
												
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();						
			this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;
			this.gridBagConstraintsConstanteNomi.gridx = 0;		
			//this.gridBagConstraintsConstanteNomi.fill =GridBagConstraints.VERTICAL;
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.CENTER;//.CENTER;NORTH
			this.gridBagConstraintsConstanteNomi.ipadx = 100;
				
			
		}
		
		//PROCESANDO EN OTRA PANTALLA
		
		
		int iGridxBusquedasParametros=0;
		
	
		
		//PARAMETROS TABLAS PARAMETROS		
		if(!this.conCargarMinimo) {
			//NO BUSQUEDA
		}
		//PARAMETROS TABLAS PARAMETROS_FIN
		
		
		//PARAMETROS REPORTES
		
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy =iGridyPrincipal++;
		this.gridBagConstraintsConstanteNomi.gridx =0;
		this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;		
		//this.gridBagConstraintsConstanteNomi.ipady =150;
		
		this.jContentPane.add(this.jScrollPanelDatosConstanteNomi, this.gridBagConstraintsConstanteNomi);
				
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		iWidthScroll=(screenSize.width-screenSize.width/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ANCHO_RELSCROLL)+(250*0);
		iHeightScroll=(screenSize.height-screenSize.height/Constantes.ISWING_RESTOPARTE_DIFERENCIA_ALTO_RELSCROLL);

		
			
		//if(ConstanteNomiJInternalFrame.CON_DATOS_FRAME) {				
			//this.jInternalFrameDetalleConstanteNomi = new ConstanteNomiBeanSwingJInternalFrameAdditional();//JInternalFrameBase("Constante Nomi DATOS");
			
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
			
	        //this.setTitle("[FOR] - Constante Nomi DATOS");
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Constante Nomi Formulario",PaginaTipo.FORMULARIO,paginaTipo));			
	        this.setSize(iWidthFormulario,iHeightFormulario);        
		   				
			this.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_DET_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_DET_Y));
			
	        this.setResizable(true);
	        this.setClosable(true);
	        this.setMaximizable(true);
		    
			ConstanteNomiModel constantenomiModel=new ConstanteNomiModel(this);
			
			//SI USARA CLASE INTERNA
			//ConstanteNomiModel.ConstanteNomiFocusTraversalPolicy constantenomiFocusTraversalPolicy = constantenomiModel.new ConstanteNomiFocusTraversalPolicy(this);
			
			//constantenomiFocusTraversalPolicy.setconstantenomiJInternalFrame(this);
			
			this.setFocusTraversalPolicy(constantenomiModel);
			
			
			this.jContentPaneDetalleConstanteNomi = new JPanelMe(FuncionesSwing.getFondoImagen(parametroGeneralUsuario.getid_tipo_fondo()),true);//new JPanel();
			
			int iGridyRelaciones=0;
			
			GridBagLayout gridaBagLayoutDetalleConstanteNomi = new GridBagLayout();	
			this.jContentPaneDetalleConstanteNomi.setLayout(gridaBagLayoutDetalleConstanteNomi);
			
			GridBagLayout gridaBagLayoutBusquedasParametrosConstanteNomi = new GridBagLayout();
			
			
if(this.parametroGeneralUsuario.getcon_botones_tool_bar()) {				
				
				//AGREGA TOOLBAR DETALLE A PANTALLA
				
				this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
				this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones++;		
				this.gridBagConstraintsConstanteNomi.gridx = 0;
					
				
				this.jContentPaneDetalleConstanteNomi.add(jTtoolBarDetalleConstanteNomi, gridBagConstraintsConstanteNomi);								
				
}
			
			this.jScrollPanelDatosEdicionConstanteNomi=   new JScrollPane(jContentPaneDetalleConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			this.jScrollPanelDatosGeneralConstanteNomi=   new JScrollPane(jContentPane,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosGeneralConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosGeneralConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
				
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			
			
	        this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones++;		
	        this.gridBagConstraintsConstanteNomi.gridx = 0;
	        
			this.jContentPaneDetalleConstanteNomi.add(jPanelCamposConstanteNomi, gridBagConstraintsConstanteNomi);
			
			
			
			
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
						&& constantenomiSessionBean.getConGuardarRelaciones()
						) {
					//paraCargarPorParte es false por defecto(y ejecuta funcion normal cargando detalle en tab panel), si se utiliza funcionalidad es true y carga tab panel auxiliar temporal
					
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(this.puedeCargarPorParteEmpleadoConstante,false,-1);
					
					if(this.constantenomiSessionBean.getConGuardarRelaciones()) {
						this.gridBagConstraintsConstanteNomi= new GridBagConstraints();
						this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones++;
						this.gridBagConstraintsConstanteNomi.gridx = 0;
						this.jContentPaneDetalleConstanteNomi.add(this.jTabbedPaneRelacionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
					}
					
					//RELACIONES OTROS AGRUPADOS
					;
					
					} else {
						//this.jButtonNuevoRelacionesConstanteNomi.setVisible(false);
						
					this.cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(true,false,-1);
					}
				}
			}
			
			Boolean tieneColumnasOcultas=false;
			
			tieneColumnasOcultas=true;
		
						
			
			if(!Constantes.ISDEVELOPING) {
	       		this.jPanelCamposOcultosConstanteNomi.setVisible(false);
			} else {
				if(tieneColumnasOcultas) {
					this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
					this.gridBagConstraintsConstanteNomi.fill=GridBagConstraints.NONE;
					this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
					
					this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones++;		
					this.gridBagConstraintsConstanteNomi.gridx = 0;
					
				
					this.jContentPaneDetalleConstanteNomi.add(jPanelCamposOcultosConstanteNomi, gridBagConstraintsConstanteNomi);
				
					this.jPanelCamposOcultosConstanteNomi.setVisible(true);
				}
			}					
			
			
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones++;//4;		
	        this.gridBagConstraintsConstanteNomi.gridx = 0;
	        this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.CENTER;//WEST;
			
			
			
			this.jContentPaneDetalleConstanteNomi.add(this.jPanelAccionesFormularioConstanteNomi, this.gridBagConstraintsConstanteNomi);							
			
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
	        this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones;//4;		
	        this.gridBagConstraintsConstanteNomi.gridx = 0;
	        
			
			this.jContentPaneDetalleConstanteNomi.add(this.jPanelAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);							
			
	        //this.setContentPane(jScrollPanelDatosEdicionConstanteNomi);
			
		//} else {
			//DISENO_DETALLE COMENTAR Y
			//DISENO_DETALLE(Solo Descomentar Seccion Inferior)
			//NOTA-DISENO_DETALLE(Si cambia lo de abajo, cambiar lo comentado, Al final no es lo mismo)
			
			/*
			this.jScrollPanelDatosEdicionConstanteNomi=   new JScrollPane(this.jPanelCamposConstanteNomi,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			this.jScrollPanelDatosEdicionConstanteNomi.setMinimumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConstanteNomi.setMaximumSize(new Dimension(iWidthScroll,iHeightScroll));
			this.jScrollPanelDatosEdicionConstanteNomi.setPreferredSize(new Dimension(iWidthScroll,iHeightScroll));
			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
			this.gridBagConstraintsConstanteNomi.gridx = 0;
			this.gridBagConstraintsConstanteNomi.fill = GridBagConstraints.BOTH;
			this.gridBagConstraintsConstanteNomi.ipady = this.getSize().height-yOffset*3;
			this.gridBagConstraintsConstanteNomi.anchor = GridBagConstraints.WEST;
			
			this.jContentPane.add(this.jScrollPanelDatosEdicionConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
			//ACCIONES FORMULARIO
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConstanteNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesFormularioConstanteNomi, this.gridBagConstraintsConstanteNomi);			
			
			this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
			this.gridBagConstraintsConstanteNomi.gridy =iGridyPrincipal++;		
			this.gridBagConstraintsConstanteNomi.gridx = 0;
			
			this.jContentPane.add(this.jPanelAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);									
			*/
		//}								
			
		//DISENO_DETALLE-(Descomentar)
		/*
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposConstanteNomi, this.gridBagConstraintsConstanteNomi);
			
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy = iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx = 0;
							
		this.jContentPane.add(this.jPanelCamposOcultosConstanteNomi, this.gridBagConstraintsConstanteNomi);
		
			
		this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
		this.gridBagConstraintsConstanteNomi.gridy =iGridyPrincipal++;		
		this.gridBagConstraintsConstanteNomi.gridx =0;
			
		this.jContentPane.add(this.jPanelAccionesConstanteNomi, this.gridBagConstraintsConstanteNomi);
		*/
		
			
     	//pack();
		
		
		//return this.jScrollPanelDatosGeneralConstanteNomi;//jContentPane;
		
		return jScrollPanelDatosEdicionConstanteNomi;
    } 
	
		

	public void cargarSessionConBeanSwingJInternalFrameEmpleadoConstante(Boolean soloSession,Boolean actualizarTab,Integer iIndexTab) throws Exception {

		//SOLO INICIALIZA SESSION (YA NO, CONSUME MUCHA MEMORIA)
		this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		this.empleadoconstanteSessionBean.setConGuardarRelaciones(false);
		this.empleadoconstanteSessionBean.setEsGuardarRelacionado(true);

		this.empleadoconstanteBeanSwingJInternalFrame=null;//new EmpleadoConstanteBeanSwingJInternalFrame(false,true,false);

		if(!soloSession) {
			//this.empleadoconstanteBeanSwingJInternalFramePopup=new EmpleadoConstanteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,true);
			//this.empleadoconstanteBeanSwingJInternalFramePopup.jInternalFrameParent=this;


			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {

				EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL=ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL;
				EmpleadoConstanteJInternalFrame.STIPO_TAMANIO_GENERAL_TABLA=ConstanteNomiJInternalFrame.STIPO_TAMANIO_GENERAL;

				this.empleadoconstanteSessionBean.setEsGuardarRelacionado(true);

				this.empleadoconstanteBeanSwingJInternalFrame=new EmpleadoConstanteBeanSwingJInternalFrame(true,false,jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,true,false,false);//false->4

				this.empleadoconstanteBeanSwingJInternalFrame.setJInternalFrameParent(this);
				this.empleadoconstanteBeanSwingJInternalFrame.setempleadoconstanteSessionBean(this.empleadoconstanteSessionBean);

				//this.gridBagConstraintsConstanteNomi = new GridBagConstraints();
				//this.gridBagConstraintsConstanteNomi.gridy = iGridyRelaciones++;
				//this.gridBagConstraintsConstanteNomi.gridx = 0;
				//this.jContentPaneDetalleConstanteNomi.add(this.empleadoconstanteBeanSwingJInternalFrame.getContentPane(), this.gridBagConstraintsConstanteNomi);

				if(!actualizarTab) {
					this.jTabbedPaneRelacionesConstanteNomi.add("Empleado Constantes",this.empleadoconstanteBeanSwingJInternalFrame.getContentPane());
				} else {
					this.jTabbedPaneRelacionesConstanteNomi.setComponentAt(iIndexTab,this.empleadoconstanteBeanSwingJInternalFrame.getContentPane());
				}

				//EmpleadoConstanteJInternalFrame.ESTA_CARGADO_PORPARTE=true;
			} else {
				this.empleadoconstanteSessionBean.setEsGuardarRelacionado(false);
				this.empleadoconstanteBeanSwingJInternalFrame=null;//new EmpleadoConstanteBeanSwingJInternalFrame(false,false,jDesktopPane,this.usuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,false,false,false);
			}
		} else {
			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				if(this.puedeCargarPorParteEmpleadoConstante) {
					this.jTabbedPaneRelacionesConstanteNomi.add("Empleado Constantes",new JPanel());
				}
			}
		}
	}
	
	
	
	
		public void cargarEmpleadoConstanteBeanSwingJInternalFrame(List<ConstanteNomi> constantenomis,ConstanteNomi constantenomi,EmpleadoConstanteBeanSwingJInternalFrame empleadoconstanteBeanSwingJInternalFrame,/*Boolean conInicializar,*/Boolean conGuardarRelaciones,Boolean esGuardarRelacionado) throws Exception 
		{
			try
			{
				if(true/*conInicializar*/) {
					//GETCONTENTPANE SOLO UN PAPA, SE PIERDE PANEL, POR LO QUE SE CREA NUEVO POR CADA PANTALLA
					//empleadoconstanteBeanSwingJInternalFrame=new EmpleadoConstanteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,conGuardarRelaciones,esGuardarRelacionado);

				}
					empleadoconstanteBeanSwingJInternalFrame.getEmpleadoConstanteLogic().setConnexion(this.constantenomiLogic.getConnexion());

					empleadoconstanteBeanSwingJInternalFrame.setconstantenomisForeignKey(constantenomis);
					empleadoconstanteBeanSwingJInternalFrame.setconstantenomiForeignKey(constantenomi);
					empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setisBusquedaDesdeForeignKeySesionConstanteNomi(true);
					empleadoconstanteBeanSwingJInternalFrame.empleadoconstanteSessionBean.setlidConstanteNomiActual(constantenomi.getId());
					//NO VOLVER A RECARGAR FK, TALVEZ INICIALIZAR FK DEPENDENTES
					//Hijos Independientes, No carga Fk al inicializar, Hay que setisBusquedaDesdeForeignKeySesion(true), luego cargar todos los Fks necesarios
					empleadoconstanteBeanSwingJInternalFrame.cargarCombosForeignKeyEmpleadoConstante(empleadoconstanteBeanSwingJInternalFrame.isCargarCombosDependencia);
					empleadoconstanteBeanSwingJInternalFrame.setVisibilidadBusquedasParaConstanteNomi(true);
					empleadoconstanteBeanSwingJInternalFrame.setid_constante_nomiFK_IdConstanteNomi(constantenomi.getId());

					if(!this.conCargarFormDetalle) {
						empleadoconstanteBeanSwingJInternalFrame.inicializarFormDetalle();
					}

					empleadoconstanteBeanSwingJInternalFrame.setSelectedItemCombosFrameConstanteNomiForeignKey(constantenomi,1,false,true,true);
					empleadoconstanteBeanSwingJInternalFrame.setiNumeroPaginacion(Funciones2.getPaginacionDefecto("RELACIONADO"));
					empleadoconstanteBeanSwingJInternalFrame.procesarBusqueda("FK_IdConstanteNomi");
					empleadoconstanteBeanSwingJInternalFrame.setsAccionBusqueda("FK_IdConstanteNomi");
					empleadoconstanteBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleadoConstante(true);
					empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoCeldasBotonesEmpleadoConstante("n",empleadoconstanteBeanSwingJInternalFrame.isGuardarCambiosEnLote, empleadoconstanteBeanSwingJInternalFrame.isEsMantenimientoRelacionado);
					empleadoconstanteBeanSwingJInternalFrame.setAutoscrolls(true);
					empleadoconstanteBeanSwingJInternalFrame.setVisible(true);

					if(esGuardarRelacionado) {
						empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoConstante("relacionado");
					} else {
						empleadoconstanteBeanSwingJInternalFrame.actualizarEstadoPanelsEmpleadoConstante("no_relacionado");
					}

					empleadoconstanteBeanSwingJInternalFrame.getjButtonRecargarInformacionEmpleadoConstante().setVisible(false);

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
