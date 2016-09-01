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




import com.bydan.erp.seguridad.business.entity.Usuario;
import com.bydan.erp.seguridad.business.entity.ResumenUsuario;
import com.bydan.erp.seguridad.business.entity.Opcion;
import com.bydan.erp.seguridad.business.entity.PerfilOpcion;
import com.bydan.erp.seguridad.business.entity.PerfilCampo;
import com.bydan.erp.seguridad.business.entity.PerfilAccion;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralSg;
import com.bydan.erp.seguridad.business.entity.ParametroGeneralUsuario;
import com.bydan.erp.seguridad.business.entity.Modulo;
import com.bydan.erp.seguridad.business.entity.Accion;

import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneralAdditional;
import com.bydan.erp.seguridad.util.SistemaParameterReturnGeneral;


//import com.bydan.erp.seguridad.business.entity.PerfilAccion;


import com.bydan.erp.seguridad.util.SistemaConstantesFunciones;
import com.bydan.erp.seguridad.util.SistemaConstantesFuncionesAdditional;
import com.bydan.erp.seguridad.business.logic.SistemaLogicAdditional;

import com.bydan.erp.facturacion.util.TransportistaConstantesFunciones;
import com.bydan.erp.facturacion.util.TransportistaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TransportistaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TransportistaBean;
import com.bydan.framework.erp.business.dataaccess.ConstantesSql;
import com.bydan.framework.erp.business.entity.Classe;
import com.bydan.framework.erp.business.entity.DatoGeneral;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterGeneral;
import com.bydan.framework.erp.business.entity.OrderBy;
import com.bydan.framework.erp.business.entity.DatoGeneralMinimo;
import com.bydan.framework.erp.business.entity.GeneralEntity;
import com.bydan.framework.erp.business.entity.Mensajes;
import com.bydan.framework.erp.business.entity.GeneralEntityParameterReturnGeneral;
//import com.bydan.framework.erp.business.entity.MaintenanceType;
import com.bydan.framework.erp.util.MaintenanceType;
import com.bydan.framework.erp.util.FuncionesReporte;
import com.bydan.framework.erp.business.logic.DatosCliente;
import com.bydan.framework.erp.business.logic.Pagination;

import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralTotalModel;
import com.bydan.framework.erp.presentation.desktop.swing.TablaGeneralOrderByModel;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverter;
import com.bydan.framework.erp.presentation.desktop.swing.DateConverterFromDate;
import com.bydan.framework.erp.presentation.desktop.swing.DateRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.DateEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.BooleanEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.TextFieldRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.RunnableProceso;
import com.bydan.framework.erp.presentation.desktop.swing.*;
//import com.bydan.framework.erp.presentation.desktop.swing.TextFieldEditorRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.HeaderRenderer;
import com.bydan.framework.erp.presentation.desktop.swing.JInternalFrameBase;
import com.bydan.framework.erp.presentation.desktop.swing.FuncionesSwing;
import com.bydan.framework.erp.presentation.desktop.swing.MainJFrame;
import com.bydan.framework.erp.resources.imagenes.AuxiliarImagenes;
import com.bydan.erp.facturacion.resources.reportes.AuxiliarReportes;


import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.facturacion.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.nomina.business.logic.*;
import com.bydan.erp.inventario.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;
import com.bydan.erp.tesoreria.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.inventario.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.tesoreria.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;






import javax.imageio.ImageIO;
import java.net.NetworkInterface;
import java.net.InterfaceAddress;
import java.net.InetAddress;
import javax.naming.InitialContext;
import java.lang.Long;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.util.Hashtable;
import java.util.Collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import org.w3c.dom.Document;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


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
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

import org.apache.log4j.Logger;

import com.bydan.framework.erp.business.entity.Reporte;


//VALIDACION
import org.hibernate.validator.ClassValidator;
import org.hibernate.validator.InvalidValue;

import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JExcelApiExporter;
import net.sf.jasperreports.engine.export.JRCsvExporter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRSaver;
import net.sf.jasperreports.engine.xml.JRXmlWriter;


import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;

import java.util.EventObject;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.event.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
import java.awt.event.*;

import org.jdesktop.beansbinding.Binding.SyncFailure;
import org.jdesktop.beansbinding.BindingListener;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;
import org.jdesktop.beansbinding.PropertyStateEvent;
import org.jdesktop.swingbinding.JComboBoxBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

import com.toedter.calendar.JDateChooser;


import com.bydan.erp.seguridad.business.entity.*;
import com.bydan.erp.cartera.business.entity.*;
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.nomina.business.entity.*;
import com.bydan.erp.inventario.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.tesoreria.business.entity.*;
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.nomina.util.*;
import com.bydan.erp.inventario.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.tesoreria.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.inventario.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.tesoreria.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TransportistaBeanSwingJInternalFrame extends TransportistaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TransportistaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Transportista> transportistaValidator = new ClassValidator<Transportista>(Transportista.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Transportista transportista;	
	public Transportista transportistaAux;
	public Transportista transportistaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Transportista transportistaTotales;
	public Long idTransportistaActual;
	public Long iIdNuevoTransportista=0L;
	public int rowIndexActual=0;
	
	
	
	
	public String sFinalQueryComboEmpresa="";

	public List<Empresa> empresasForeignKey;

	public List<Empresa> getempresasForeignKey() {
		return empresasForeignKey;
	}

	public void setempresasForeignKey(List<Empresa> empresasForeignKey) {
		this.empresasForeignKey = empresasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empresa empresaForeignKey;

	public Empresa getempresaForeignKey() {
		return empresaForeignKey;
	}

	public void setempresaForeignKey(Empresa empresaForeignKey) {
		this.empresaForeignKey = empresaForeignKey;
	}

	public String sFinalQueryComboSucursal="";

	public List<Sucursal> sucursalsForeignKey;

	public List<Sucursal> getsucursalsForeignKey() {
		return sucursalsForeignKey;
	}

	public void setsucursalsForeignKey(List<Sucursal> sucursalsForeignKey) {
		this.sucursalsForeignKey = sucursalsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Sucursal sucursalForeignKey;

	public Sucursal getsucursalForeignKey() {
		return sucursalForeignKey;
	}

	public void setsucursalForeignKey(Sucursal sucursalForeignKey) {
		this.sucursalForeignKey = sucursalForeignKey;
	}

	public String sFinalQueryComboTipoViaTransporte="";

	public List<TipoViaTransporte> tipoviatransportesForeignKey;

	public List<TipoViaTransporte> gettipoviatransportesForeignKey() {
		return tipoviatransportesForeignKey;
	}

	public void settipoviatransportesForeignKey(List<TipoViaTransporte> tipoviatransportesForeignKey) {
		this.tipoviatransportesForeignKey = tipoviatransportesForeignKey;
	}

	//OBJETO FK ACTUAL
	public TipoViaTransporte tipoviatransporteForeignKey;

	public TipoViaTransporte gettipoviatransporteForeignKey() {
		return tipoviatransporteForeignKey;
	}

	public void settipoviatransporteForeignKey(TipoViaTransporte tipoviatransporteForeignKey) {
		this.tipoviatransporteForeignKey = tipoviatransporteForeignKey;
	}

	public String sFinalQueryComboCliente="";

	public List<Cliente> clientesForeignKey;

	public List<Cliente> getclientesForeignKey() {
		return clientesForeignKey;
	}

	public void setclientesForeignKey(List<Cliente> clientesForeignKey) {
		this.clientesForeignKey = clientesForeignKey;
	}

	//OBJETO FK ACTUAL
	public Cliente clienteForeignKey;

	public Cliente getclienteForeignKey() {
		return clienteForeignKey;
	}

	public void setclienteForeignKey(Cliente clienteForeignKey) {
		this.clienteForeignKey = clienteForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idClienteActual=0L;

	public Long getidClienteActual() {
		return idClienteActual;
	}

	public void setidClienteActual(Long idClienteActual) {
		this.idClienteActual= idClienteActual;
	}
	
	
	
	
	//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
	public String sFinalQueryGeneral="";
	public Boolean isEntroOnLoad=false;
	public Boolean isErrorGuardar=false;
	
	public Boolean isGuardarCambiosEnLote=false;
	public Boolean isCargarCombosDependencia=false;
	public Boolean isSeleccionarTodos=false;
	public Boolean isSeleccionados=false;
	public Boolean conGraficoReporte=false;
	
	public Boolean isPostAccionNuevo=false;
	public Boolean isPostAccionSinCerrar=false;
	public Boolean isPostAccionSinMensaje=false;
	
	
	public Boolean esControlTabla=false;
	
	public Boolean isPermisoTodoTransportista;
	public Boolean isPermisoNuevoTransportista;
	public Boolean isPermisoActualizarTransportista;
	public Boolean isPermisoActualizarOriginalTransportista;
	public Boolean isPermisoEliminarTransportista;
	public Boolean isPermisoGuardarCambiosTransportista;
	public Boolean isPermisoConsultaTransportista;
	public Boolean isPermisoBusquedaTransportista;
	public Boolean isPermisoReporteTransportista;
	public Boolean isPermisoPaginacionMedioTransportista;
	public Boolean isPermisoPaginacionAltoTransportista;
	public Boolean isPermisoPaginacionTodoTransportista;
	public Boolean isPermisoCopiarTransportista;
	public Boolean isPermisoVerFormTransportista;
	public Boolean isPermisoDuplicarTransportista;
	public Boolean isPermisoOrdenTransportista;
	
	
	public ArrayList<DatoGeneral> arrDatoGeneral;
	public ArrayList<String> arrDatoGeneralNo;
	ArrayList<Classe> classesActual=new ArrayList<Classe>();
	
	public List<Accion> accions;	
	public List<Accion> accionsFormulario;
	
	
	public ArrayList<DatoGeneralMinimo> arrDatoGeneralMinimos;
	
	public ArrayList<Reporte> tiposArchivosReportes;
	public ArrayList<Reporte> tiposArchivosReportesDinamico;
	public ArrayList<Reporte> tiposReportes;
	public ArrayList<Reporte> tiposReportesDinamico;
	public ArrayList<Reporte> tiposGraficosReportes;
	public ArrayList<Reporte> tiposPaginacion;
	public ArrayList<Reporte> tiposRelaciones;
	public ArrayList<Reporte> tiposAcciones;
	public ArrayList<Reporte> tiposAccionesFormulario;
	public ArrayList<Reporte> tiposSeleccionar;
	
	public ArrayList<Reporte> tiposColumnasSelect;
	public ArrayList<Reporte> tiposRelacionesSelect;
	
	
	public Integer iNumeroPaginacion;
	public Integer iNumeroPaginacionPagina;
	public Pagination pagination;
	public DatosCliente datosCliente;
	public DatosDeep datosDeep;
	public String sTipoArchivoReporte="";
	public String sTipoArchivoReporteDinamico="";
	public String sTipoReporte="";
	public String sTipoReporteDinamico="";
	public String sTipoGraficoReporte="";
	public String sTipoPaginacion="";
	public String sTipoRelacion="";
	public String sTipoAccion="";
	public String sTipoAccionFormulario="";
	public String sTipoSeleccionar="";	
	public String sDetalleReporte="";
	public Boolean isMostrarNumeroPaginacion;
	public String sTipoReporteExtra="";
	public String sValorCampoGeneral="";
	public Boolean esReporteDinamico=false;
	public Boolean esReporteAccionProceso=false;
	public Boolean esRecargarFks=false;
	public String sPathReporteDinamico="";
	
	public TransportistaParameterReturnGeneral transportistaReturnGeneral;
	public TransportistaParameterReturnGeneral transportistaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTransportista=false;
	public Boolean esParaAccionDesdeFormularioTransportista=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TransportistaSessionBeanAdditional transportistaSessionBeanAdditional=null;
	
	public TransportistaSessionBeanAdditional getTransportistaSessionBeanAdditional() {
		return this.transportistaSessionBeanAdditional;
	}
	
	public void setTransportistaSessionBeanAdditional(TransportistaSessionBeanAdditional transportistaSessionBeanAdditional) {
		try {
			this.transportistaSessionBeanAdditional=transportistaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TransportistaBeanSwingJInternalFrameAdditional transportistaBeanSwingJInternalFrameAdditional=null;
	//public class TransportistaBeanSwingJInternalFrame
	
	public TransportistaBeanSwingJInternalFrameAdditional getTransportistaBeanSwingJInternalFrameAdditional() {
		return this.transportistaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTransportistaBeanSwingJInternalFrameAdditional(TransportistaBeanSwingJInternalFrameAdditional transportistaBeanSwingJInternalFrameAdditional) {
		try {
			this.transportistaBeanSwingJInternalFrameAdditional=transportistaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TransportistaLogic transportistaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Transportista transportistaBean;
	public TransportistaConstantesFunciones transportistaConstantesFunciones;
	//public TransportistaParameterReturnGeneral transportistaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TipoViaTransporteLogic tipoviatransporteLogic;
	public ClienteLogic clienteLogic;
	
	//PARAMETROS
	
	
	//public List<Transportista> transportistas;	
	//public List<Transportista> transportistasEliminados;
	//public List<Transportista> transportistasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTransportista=false;
	public Boolean isVisibilidadCeldaDuplicarTransportista=true;
	public Boolean isVisibilidadCeldaCopiarTransportista=true;
	public Boolean isVisibilidadCeldaVerFormTransportista=true;
	public Boolean isVisibilidadCeldaOrdenTransportista=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTransportista=false;
	public Boolean isVisibilidadCeldaModificarTransportista=false;
	public Boolean isVisibilidadCeldaActualizarTransportista=false;
	public Boolean isVisibilidadCeldaEliminarTransportista=false;
	public Boolean isVisibilidadCeldaCancelarTransportista=false;
	public Boolean isVisibilidadCeldaGuardarTransportista=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTransportista=false;	
	
	
	public Boolean isVisibilidadBusquedaPorIdentificacion=false;
	public Boolean isVisibilidadBusquedaPorNombreCompleto=false;
	public Boolean isVisibilidadBusquedaPorPlaca=false;
	public Boolean isVisibilidadBusquedaPorRuc=false;
	public Boolean isVisibilidadBusquedaPorTelefono=false;
	public Boolean isVisibilidadFK_IdCliente=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTipoViaTransporte=false;
	
	public Long getiIdNuevoTransportista() {
		return this.iIdNuevoTransportista;
	}

	public void setiIdNuevoTransportista(Long iIdNuevoTransportista) {
		this.iIdNuevoTransportista = iIdNuevoTransportista;
	}
	
	public Long getidTransportistaActual() {
		return this.idTransportistaActual;
	}

	public void setidTransportistaActual(Long idTransportistaActual) {
		this.idTransportistaActual = idTransportistaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Transportista gettransportista() {
		return this.transportista;
	}

	public void settransportista(Transportista transportista) {
		this.transportista = transportista;
	}
	
	public Transportista gettransportistaAux() {
		return this.transportistaAux;
	}

	public void settransportistaAux(Transportista transportistaAux) {
		this.transportistaAux = transportistaAux;
	}				
	
	public Transportista gettransportistaAnterior() {
		return this.transportistaAnterior;
	}

	public void settransportistaAnterior(Transportista transportistaAnterior) {
		this.transportistaAnterior = transportistaAnterior;
	}	
	
	public Transportista gettransportistaTotales() {
		return this.transportistaTotales;
	}

	public void settransportistaTotales(Transportista transportistaTotales) {
		this.transportistaTotales = transportistaTotales;
	}	
	
	public Transportista gettransportistaBean() {
		return this.transportistaBean;
	}

	public void settransportistaBean(Transportista transportistaBean) {
		this.transportistaBean = transportistaBean;
	}	
	
	public TransportistaParameterReturnGeneral gettransportistaReturnGeneral() {
		return this.transportistaReturnGeneral;
	}

	public void settransportistaReturnGeneral(TransportistaParameterReturnGeneral transportistaReturnGeneral) {
		this.transportistaReturnGeneral = transportistaReturnGeneral;
	}	
	
	
	public String identificacionBusquedaPorIdentificacion="";

	public String getidentificacionBusquedaPorIdentificacion() {
		return this.identificacionBusquedaPorIdentificacion;
	}

	public void setidentificacionBusquedaPorIdentificacion(String identificacionBusquedaPorIdentificacion) {
		this.identificacionBusquedaPorIdentificacion = identificacionBusquedaPorIdentificacion;
	}

	public String nombre_completoBusquedaPorNombreCompleto="";

	public String getnombre_completoBusquedaPorNombreCompleto() {
		return this.nombre_completoBusquedaPorNombreCompleto;
	}

	public void setnombre_completoBusquedaPorNombreCompleto(String nombre_completoBusquedaPorNombreCompleto) {
		this.nombre_completoBusquedaPorNombreCompleto = nombre_completoBusquedaPorNombreCompleto;
	}

	public String placaBusquedaPorPlaca="";

	public String getplacaBusquedaPorPlaca() {
		return this.placaBusquedaPorPlaca;
	}

	public void setplacaBusquedaPorPlaca(String placaBusquedaPorPlaca) {
		this.placaBusquedaPorPlaca = placaBusquedaPorPlaca;
	}

	public String rucBusquedaPorRuc="";

	public String getrucBusquedaPorRuc() {
		return this.rucBusquedaPorRuc;
	}

	public void setrucBusquedaPorRuc(String rucBusquedaPorRuc) {
		this.rucBusquedaPorRuc = rucBusquedaPorRuc;
	}

	public String telefonoBusquedaPorTelefono="";

	public String gettelefonoBusquedaPorTelefono() {
		return this.telefonoBusquedaPorTelefono;
	}

	public void settelefonoBusquedaPorTelefono(String telefonoBusquedaPorTelefono) {
		this.telefonoBusquedaPorTelefono = telefonoBusquedaPorTelefono;
	}

	public Long id_clienteFK_IdCliente=-1L;

	public Long getid_clienteFK_IdCliente() {
		return this.id_clienteFK_IdCliente;
	}

	public void setid_clienteFK_IdCliente(Long id_clienteFK_IdCliente) {
		this.id_clienteFK_IdCliente = id_clienteFK_IdCliente;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_sucursalFK_IdSucursal=-1L;

	public Long getid_sucursalFK_IdSucursal() {
		return this.id_sucursalFK_IdSucursal;
	}

	public void setid_sucursalFK_IdSucursal(Long id_sucursalFK_IdSucursal) {
		this.id_sucursalFK_IdSucursal = id_sucursalFK_IdSucursal;
	}

	public Long id_tipo_via_transporteFK_IdTipoViaTransporte=-1L;

	public Long getid_tipo_via_transporteFK_IdTipoViaTransporte() {
		return this.id_tipo_via_transporteFK_IdTipoViaTransporte;
	}

	public void setid_tipo_via_transporteFK_IdTipoViaTransporte(Long id_tipo_via_transporteFK_IdTipoViaTransporte) {
		this.id_tipo_via_transporteFK_IdTipoViaTransporte = id_tipo_via_transporteFK_IdTipoViaTransporte;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public TransportistaLogic getTransportistaLogic()	{		
		return transportistaLogic;
	}

	public void setTransportistaLogic(TransportistaLogic transportistaLogic) {
		this.transportistaLogic = transportistaLogic;
	}
	
	
	public void setsFinalQueryGeneral(String sFinalQueryGeneral) {
		this.sFinalQueryGeneral=sFinalQueryGeneral;
	}
	
	public String getsFinalQueryGeneral() {
		return this.sFinalQueryGeneral;
	}
		
	public Boolean getIsGuardarCambiosEnLote() {
		return isGuardarCambiosEnLote;
	}

	public void setIsGuardarCambiosEnLote(Boolean isGuardarCambiosEnLote) {
		this.isGuardarCambiosEnLote = isGuardarCambiosEnLote;
	}
	
	public Boolean getIsCargarCombosDependencia() {
		return isCargarCombosDependencia;
	}

	public void setIsCargarCombosDependencia(Boolean isCargarCombosDependencia) {
		this.isCargarCombosDependencia = isCargarCombosDependencia;
	}
	
	public Boolean getIsEsNuevoTransportista() {
		return isEsNuevoTransportista;
	}

	public void setIsEsNuevoTransportista(Boolean isEsNuevoTransportista) {
		this.isEsNuevoTransportista = isEsNuevoTransportista;
	}

	public Boolean getEsParaAccionDesdeFormularioTransportista() {
		return esParaAccionDesdeFormularioTransportista;
	}
	
	public void setEsParaAccionDesdeFormularioTransportista(Boolean esParaAccionDesdeFormularioTransportista) {
		this.esParaAccionDesdeFormularioTransportista = esParaAccionDesdeFormularioTransportista;
	}
	
	public Boolean getIsEsMantenimientoRelacionesRelacionadoUnico() {
		return isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public void setIsEsMantenimientoRelacionesRelacionadoUnico(Boolean isEsMantenimientoRelacionesRelacionadoUnico) {
		this.isEsMantenimientoRelacionesRelacionadoUnico = isEsMantenimientoRelacionesRelacionadoUnico;
	}

	public Boolean getIsEsMantenimientoRelaciones() {
		return isEsMantenimientoRelaciones;
	}

	public void setIsEsMantenimientoRelaciones(Boolean isEsMantenimientoRelaciones) {
		this.isEsMantenimientoRelaciones = isEsMantenimientoRelaciones;
	}

	public Boolean getIsEsMantenimientoRelacionado() {
		return isEsMantenimientoRelacionado;
	}

	public void setIsEsMantenimientoRelacionado(Boolean isEsMantenimientoRelacionado) {
		this.isEsMantenimientoRelacionado = isEsMantenimientoRelacionado;
	}

	public Boolean getesParaBusquedaForeignKey() {
		return esParaBusquedaForeignKey;
	}

	public void setesParaBusquedaForeignKey(Boolean esParaBusquedaForeignKey) {
		this.esParaBusquedaForeignKey = esParaBusquedaForeignKey;
	}

	public Boolean getIsContieneImagenes() {
		return isContieneImagenes;
	}

	public void setIsContieneImagenes(Boolean isContieneImagenes) {
		this.isContieneImagenes = isContieneImagenes;
	}		
	
	
	public void cargarCombosEmpresasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empresasForeignKey=new ArrayList<Empresa>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpresaLogic empresaLogic=new EmpresaLogic();

			//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

			if(this.transportistaSessionBean==null) {
				this.transportistaSessionBean=new TransportistaSessionBean();
			}

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empresaLogic.getEmpresaDataAccess().setIsForForeingKeyData(true);

					empresaLogic.getTodosEmpresasWithConnection(sFinalQuery,new Pagination());

					this.empresasForeignKey=empresaLogic.getEmpresas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpresa(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empresaLogic.getEntityWithConnection(transportistaSessionBean.getlidEmpresaActual());
					this.empresasForeignKey.add(empresaLogic.getEmpresa());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosSucursalsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.sucursalsForeignKey=new ArrayList<Sucursal>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			SucursalLogic sucursalLogic=new SucursalLogic();

			//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

			if(this.transportistaSessionBean==null) {
				this.transportistaSessionBean=new TransportistaSessionBean();
			}

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//sucursalLogic.getSucursalDataAccess().setIsForForeingKeyData(true);

					sucursalLogic.getTodosSucursalsWithConnection(sFinalQuery,new Pagination());

					this.sucursalsForeignKey=sucursalLogic.getSucursals();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaSucursal(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					sucursalLogic.getEntityWithConnection(transportistaSessionBean.getlidSucursalActual());
					this.sucursalsForeignKey.add(sucursalLogic.getSucursal());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosTipoViaTransportesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TipoViaTransporteLogic tipoviatransporteLogic=new TipoViaTransporteLogic();

			//tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingKeyData(true);

			if(this.transportistaSessionBean==null) {
				this.transportistaSessionBean=new TransportistaSessionBean();
			}

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//tipoviatransporteLogic.getTipoViaTransporteDataAccess().setIsForForeingKeyData(true);

					tipoviatransporteLogic.getTodosTipoViaTransportesWithConnection(sFinalQuery,new Pagination());

					this.tipoviatransportesForeignKey=tipoviatransporteLogic.getTipoViaTransportes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTipoViaTransporte(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					tipoviatransporteLogic.getEntityWithConnection(transportistaSessionBean.getlidTipoViaTransporteActual());
					this.tipoviatransportesForeignKey.add(tipoviatransporteLogic.getTipoViaTransporte());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public void cargarCombosClientesForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.clientesForeignKey=new ArrayList<Cliente>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ClienteLogic clienteLogic=new ClienteLogic();

			//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

			if(this.transportistaSessionBean==null) {
				this.transportistaSessionBean=new TransportistaSessionBean();
			}

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//clienteLogic.getClienteDataAccess().setIsForForeingKeyData(true);

					clienteLogic.getTodosClientesWithConnection(sFinalQuery,new Pagination());

					this.clientesForeignKey=clienteLogic.getClientes();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaCliente(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(transportistaSessionBean.getlidClienteActual());
					this.clientesForeignKey.add(clienteLogic.getCliente());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	
	public void setActualEmpresaForeignKey(Long idEmpresaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empresaTemp!=null) {

					if(this.transportista!=null) {
						this.transportista.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) {
						this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTransportista.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTransportista!=null) {
						if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualEmpresaForeignKeyDescripcion(Long idEmpresaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}


			sDescripcion=EmpresaConstantesFunciones.getEmpresaDescripcion(empresaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTransportistaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaTemp=null;

			for(Empresa empresaAux:empresasForeignKey) {
				if(empresaAux.getId()!=null && empresaAux.getId().equals(idEmpresaSeleccionado)) {
					empresaTemp=empresaAux;
					break;
				}
			}

			if(empresaTemp!=null) {
				jComboBoxid_empresaTransportistaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTransportistaGenerico!=null && jComboBoxid_empresaTransportistaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTransportistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualSucursalForeignKey(Long idSucursalSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(sucursalTemp!=null) {

					if(this.transportista!=null) {
						this.transportista.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) {
						this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTransportista.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTransportista!=null) {
						if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualSucursalForeignKeyDescripcion(Long idSucursalSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}


			sDescripcion=SucursalConstantesFunciones.getSucursalDescripcion(sucursalTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTransportistaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalTemp=null;

			for(Sucursal sucursalAux:sucursalsForeignKey) {
				if(sucursalAux.getId()!=null && sucursalAux.getId().equals(idSucursalSeleccionado)) {
					sucursalTemp=sucursalAux;
					break;
				}
			}

			if(sucursalTemp!=null) {
				jComboBoxid_sucursalTransportistaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTransportistaGenerico!=null && jComboBoxid_sucursalTransportistaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTransportistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTipoViaTransporteForeignKey(Long idTipoViaTransporteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(tipoviatransporteTemp!=null) {

					if(this.transportista!=null) {
						this.transportista.setTipoViaTransporte(tipoviatransporteTemp);
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) {
						this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setSelectedItem(tipoviatransporteTemp);
					}
				} else {
					//jComboBoxid_tipo_via_transporteTransportista.setSelectedItem(tipoviatransporteTemp);
					if(this.jInternalFrameDetalleFormTransportista!=null) {
						if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTipoViaTransporte") || sFormularioTipoBusqueda.equals("Todos")){
					if(tipoviatransporteTemp!=null && jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista!=null) {
						jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setSelectedItem(tipoviatransporteTemp);
					} else {
						if(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista!=null) {
							//jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setSelectedItem(tipoviatransporteTemp);
							if(jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.getItemCount()>0) {
								jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualTipoViaTransporteForeignKeyDescripcion(Long idTipoViaTransporteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}


			sDescripcion=TipoViaTransporteConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTipoViaTransporteForeignKeyGenerico(Long idTipoViaTransporteSeleccionado,JComboBox jComboBoxid_tipo_via_transporteTransportistaGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteTemp=null;

			for(TipoViaTransporte tipoviatransporteAux:tipoviatransportesForeignKey) {
				if(tipoviatransporteAux.getId()!=null && tipoviatransporteAux.getId().equals(idTipoViaTransporteSeleccionado)) {
					tipoviatransporteTemp=tipoviatransporteAux;
					break;
				}
			}

			if(tipoviatransporteTemp!=null) {
				jComboBoxid_tipo_via_transporteTransportistaGenerico.setSelectedItem(tipoviatransporteTemp);
			} else {
				if(jComboBoxid_tipo_via_transporteTransportistaGenerico!=null && jComboBoxid_tipo_via_transporteTransportistaGenerico.getItemCount()>0) {
					jComboBoxid_tipo_via_transporteTransportistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualClienteForeignKey(Long idClienteSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(clienteTemp!=null) {

					if(this.transportista!=null) {
						this.transportista.setCliente(clienteTemp);
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) {
						this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setSelectedItem(clienteTemp);
					}
				} else {
					//jComboBoxid_clienteTransportista.setSelectedItem(clienteTemp);
					if(this.jInternalFrameDetalleFormTransportista!=null) {
						if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.getItemCount()>0) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){
					if(clienteTemp!=null && jComboBoxid_clienteFK_IdClienteTransportista!=null) {
						jComboBoxid_clienteFK_IdClienteTransportista.setSelectedItem(clienteTemp);
					} else {
						if(jComboBoxid_clienteFK_IdClienteTransportista!=null) {
							//jComboBoxid_clienteFK_IdClienteTransportista.setSelectedItem(clienteTemp);
							if(jComboBoxid_clienteFK_IdClienteTransportista.getItemCount()>0) {
								jComboBoxid_clienteFK_IdClienteTransportista.setSelectedIndex(0);
							}
						}
					}
				}

					}

		}
		catch(Exception e)
		{
			throw e;
		}
	}

	public String getActualClienteForeignKeyDescripcion(Long idClienteSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}


			sDescripcion=ClienteConstantesFunciones.getClienteDescripcion(clienteTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualClienteForeignKeyGenerico(Long idClienteSeleccionado,JComboBox jComboBoxid_clienteTransportistaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteTemp=null;

			for(Cliente clienteAux:clientesForeignKey) {
				if(clienteAux.getId()!=null && clienteAux.getId().equals(idClienteSeleccionado)) {
					clienteTemp=clienteAux;
					break;
				}
			}

			if(clienteTemp!=null) {
				jComboBoxid_clienteTransportistaGenerico.setSelectedItem(clienteTemp);
			} else {
				if(jComboBoxid_clienteTransportistaGenerico!=null && jComboBoxid_clienteTransportistaGenerico.getItemCount()>0) {
					jComboBoxid_clienteTransportistaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Transportista transportista,JComboBox jComboBoxid_empresaTransportistaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTransportistaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTransportistaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				transportista.setid_empresa(empresaAux.getId());
				transportista.setempresa_descripcion(TransportistaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				transportista.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Transportista transportista,JComboBox jComboBoxid_sucursalTransportistaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTransportistaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTransportistaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				transportista.setid_sucursal(sucursalAux.getId());
				transportista.setsucursal_descripcion(TransportistaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				transportista.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTipoViaTransporteForeignKey(Transportista transportista,JComboBox jComboBoxid_tipo_via_transporteTransportistaGenerico)throws Exception
	{
		try
		{
			TipoViaTransporte  tipoviatransporteAux=new TipoViaTransporte();

			if(jComboBoxid_tipo_via_transporteTransportistaGenerico==null) {
				tipoviatransporteAux=(TipoViaTransporte)this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.getSelectedItem();
			} else {
				tipoviatransporteAux=(TipoViaTransporte)jComboBoxid_tipo_via_transporteTransportistaGenerico.getSelectedItem();
			}

			if(tipoviatransporteAux!=null && tipoviatransporteAux.getId()!=null) {
				transportista.setid_tipo_via_transporte(tipoviatransporteAux.getId());
				transportista.settipoviatransporte_descripcion(TransportistaConstantesFunciones.getTipoViaTransporteDescripcion(tipoviatransporteAux));
				transportista.setTipoViaTransporte(tipoviatransporteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarClienteForeignKey(Transportista transportista,JComboBox jComboBoxid_clienteTransportistaGenerico)throws Exception
	{
		try
		{
			Cliente  clienteAux=new Cliente();

			if(jComboBoxid_clienteTransportistaGenerico==null) {
				clienteAux=(Cliente)this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.getSelectedItem();
			} else {
				clienteAux=(Cliente)jComboBoxid_clienteTransportistaGenerico.getSelectedItem();
			}

			if(clienteAux!=null && clienteAux.getId()!=null) {
				transportista.setid_cliente(clienteAux.getId());
				transportista.setcliente_descripcion(TransportistaConstantesFunciones.getClienteDescripcion(clienteAux));
				transportista.setCliente(clienteAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	
	


		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpresasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpresa=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) { 
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) { 
					}

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameSucursalsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingSucursal=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) { 
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) { 
					}

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTipoViaTransportesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTipoViaTransporte=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) { 
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.addItem(tipoviatransporte);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) { 
					}

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTipoViaTransporte") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.removeAllItems();

							for(TipoViaTransporte tipoviatransporte:this.tipoviatransportesForeignKey) {
								this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.addItem(tipoviatransporte);
							}
						}

						if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameClientesForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingCliente=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) { 
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.addItem(cliente);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTransportista!=null) { 
					}

					if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdCliente") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_clienteFK_IdClienteTransportista.removeAllItems();

							for(Cliente cliente:this.clientesForeignKey) {
								this.jComboBoxid_clienteFK_IdClienteTransportista.addItem(cliente);
							}
						}

						if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameSucursalForeignKey(Sucursal sucursal,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameTipoViaTransporteForeignKey(TipoViaTransporte tipoviatransporte,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setSelectedItem(tipoviatransporte);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setSelectedItem(tipoviatransporte);
						} else {
							this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameClienteForeignKey(Cliente cliente,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setSelectedItem(cliente);
						}
					} else {
						if(this.jInternalFrameDetalleFormTransportista!=null) {
							this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_clienteFK_IdClienteTransportista.setSelectedItem(cliente);
						} else {
							this.jComboBoxid_clienteFK_IdClienteTransportista.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTransportista() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TransportistaConstantesFunciones.refrescarForeignKeysDescripcionesTransportista(this.transportistaLogic.getTransportistas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TransportistaConstantesFunciones.refrescarForeignKeysDescripcionesTransportista(this.transportistas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TipoViaTransporte.class));
		classes.add(new Classe(Cliente.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//transportistaLogic.setTransportistas(this.transportistas);
			transportistaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		*/				
	}	
	
	
	
	public Integer getiNumeroPaginacion() {
		return iNumeroPaginacion;
	}

	public void setiNumeroPaginacion(Integer iNumeroPaginacion) {
		this.iNumeroPaginacion= iNumeroPaginacion;
	}
	
	public Integer getiNumeroPaginacionPagina() {
		return iNumeroPaginacionPagina;
	}

	public void setiNumeroPaginacionPagina(Integer iNumeroPaginacionPagina) {
		this.iNumeroPaginacionPagina= iNumeroPaginacionPagina;
	}
	
	
	public Boolean getIsSeleccionarTodos() {
		return this.isSeleccionarTodos;
	}

	public void setIsSeleccionarTodos(Boolean isSeleccionarTodos) {
		this.isSeleccionarTodos= isSeleccionarTodos;
	}
	
	public Boolean getEsControlTabla() {
		return this.esControlTabla;
	}

	public void setEsControlTabla(Boolean esControlTabla) {
		this.esControlTabla= esControlTabla;
	}
	
	public Boolean getIsSeleccionados() {
		return this.isSeleccionados;
	}

	public void setIsSeleccionados(Boolean isSeleccionados) {
		this.isSeleccionados= isSeleccionados;
	}
	
	public Boolean getIsPostAccionNuevo() {
		return this.isPostAccionNuevo;
	}

	public void setIsPostAccionNuevo(Boolean isPostAccionNuevo) {
		this.isPostAccionNuevo= isPostAccionNuevo;
	}
	
	public Boolean getIsPostAccionSinCerrar() {
		return this.isPostAccionSinCerrar;
	}

	public void setIsPostAccionSinCerrar(Boolean isPostAccionSinCerrar) {
		this.isPostAccionSinCerrar= isPostAccionSinCerrar;
	}
	
	public Boolean getIsPostAccionSinMensaje() {
		return this.isPostAccionSinMensaje;
	}

	public void setIsPostAccionSinMensaje(Boolean isPostAccionSinMensaje) {
		this.isPostAccionSinMensaje= isPostAccionSinMensaje;
	}
	
	public Boolean getConGraficoReporte() {
		return this.conGraficoReporte;
	}

	public void setConGraficoReporte(Boolean conGraficoReporte) {
		this.conGraficoReporte= conGraficoReporte;
	}
	
	
	public ArrayList<Reporte> gettiposArchivosReportes() {
		return this.tiposArchivosReportes;
	}
	
	public void settiposArchivosReportes(ArrayList<Reporte> tiposArchivosReportes) {
		this.tiposArchivosReportes = tiposArchivosReportes;
	}
	
	//TIPOS ARCHIVOS DINAMICOS
	public ArrayList<Reporte> gettiposArchivosReportesDinamico() {
		return this.tiposArchivosReportesDinamico;
	}
	
	public void settiposArchivosReportesDinamico(ArrayList<Reporte> tiposArchivosReportesDinamico) {
		this.tiposArchivosReportesDinamico = tiposArchivosReportesDinamico;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportes() {
		return this.tiposReportes;
	}
	
	public void settiposReportes(ArrayList<Reporte> tiposReportes) {
		this.tiposReportes = tiposReportes;
	}
	
	//TIPOS REPORTES
	public ArrayList<Reporte> gettiposReportesDinamico() {
		return this.tiposReportesDinamico;
	}
	
	public void settiposReportesDinamico(ArrayList<Reporte> tiposReportesDinamico) {
		this.tiposReportesDinamico = tiposReportesDinamico;
	}
	
	//TIPOS GRAFICOS REPORTES
	public ArrayList<Reporte> gettiposGraficosReportes() {
		return this.tiposGraficosReportes;
	}
	
	public void settiposGraficosReportes(ArrayList<Reporte> tiposGraficosReportes) {
		this.tiposGraficosReportes = tiposGraficosReportes;
	}
	
	public ArrayList<Reporte> gettiposPaginacion() {
		return this.tiposPaginacion;
	}
	
	public void settiposPaginacion(ArrayList<Reporte> tiposPaginacion) {
		this.tiposPaginacion = tiposPaginacion;
	}
	
	public ArrayList<Reporte> gettiposRelaciones() {
		return this.tiposRelaciones;
	}
	
	public void settiposRelaciones(ArrayList<Reporte> tiposRelaciones) {
		this.tiposRelaciones= tiposRelaciones;
	}
	
	public ArrayList<Reporte> gettiposAcciones() {
		return this.tiposAcciones;
	}
	
	public void settiposAcciones(ArrayList<Reporte> tiposAcciones) {
		this.tiposAcciones = tiposAcciones;
	}
	
	public ArrayList<Reporte> gettiposAccionesFormulario() {
		return this.tiposAccionesFormulario;
	}
	
	public void settiposAccionesFormulario(ArrayList<Reporte> tiposAccionesFormulario) {
		this.tiposAccionesFormulario = tiposAccionesFormulario;
	}
	
	public ArrayList<Reporte> gettiposSeleccionar() {
		return this.tiposSeleccionar;
	}
	
	public void settiposSeleccionar(ArrayList<Reporte> tiposSeleccionar) {
		this.tiposSeleccionar = tiposSeleccionar;
	}
	
	public ArrayList<Reporte> gettiposColumnasSelect() {
		return this.tiposColumnasSelect;
	}
	
	public void settiposColumnasSelect(ArrayList<Reporte> tiposColumnasSelect) {
		this.tiposColumnasSelect = tiposColumnasSelect;
	}
		
	public ArrayList<Reporte> gettiposRelacionesSelect() {
		return this.tiposRelacionesSelect;
	}
	
	public void settiposRelacionesSelect(ArrayList<Reporte> tiposRelacionesSelect) {
		this.tiposRelacionesSelect = tiposRelacionesSelect;
	}
	
	public Long getIIdUsuarioSesion() {
		return lIdUsuarioSesion;
	}

	public void setIIdUsuarioSesion(Long lIdUsuarioSesion) {
		this.lIdUsuarioSesion = lIdUsuarioSesion;
	}
	
	
	public List<Accion> getAccions() {
		return this.accions;
	}

	public void setAccions(List<Accion> accions) {
		this.accions = accions;
	}
	
	public List<Accion> getAccionsFormulario() {
		return this.accionsFormulario;
	}

	public void setAccionsFormulario(List<Accion> accionsFormulario) {
		this.accionsFormulario = accionsFormulario;
	}
	
	public String getsAccionMantenimiento() {
		return sAccionMantenimiento;
	}

	public void setsAccionMantenimiento(String sAccionMantenimiento) {
		this.sAccionMantenimiento = sAccionMantenimiento;
	}

	public String getsAccionBusqueda() {
		return sAccionBusqueda;
	}

	public void setsAccionBusqueda(String sAccionBusqueda) {
		this.sAccionBusqueda = sAccionBusqueda;
	}

	public String getsAccionAdicional() {
		return sAccionAdicional;
	}

	public void setsAccionAdicional(String sAccionAdicional) {
		this.sAccionAdicional = sAccionAdicional;
	}

	public String getsUltimaBusqueda() {
		return sUltimaBusqueda;
	}

	public void setsUltimaBusqueda(String sUltimaBusqueda) {
		this.sUltimaBusqueda = sUltimaBusqueda;
	}
	
	public String getsTipoArchivoReporte() {
		return sTipoArchivoReporte;
	}

	public void setsTipoArchivoReporte(String sTipoArchivoReporte) {
		this.sTipoArchivoReporte = sTipoArchivoReporte;
	}
	
	public String getsTipoArchivoReporteDinamico() {
		return sTipoArchivoReporteDinamico;
	}

	public void setsTipoArchivoReporteDinamico(String sTipoArchivoReporteDinamico) {
		this.sTipoArchivoReporteDinamico = sTipoArchivoReporteDinamico;
	}
	
	public String getsTipoReporte() {
		return sTipoReporte;
	}

	public void setsTipoReporte(String sTipoReporte) {
		this.sTipoReporte = sTipoReporte;
	}
	
	public String getsTipoReporteDinamico() {
		return sTipoReporteDinamico;
	}

	public void setsTipoReporteDinamico(String sTipoReporteDinamico) {
		this.sTipoReporteDinamico = sTipoReporteDinamico;
	}
	
	public String getsTipoGraficoReporte() {
		return sTipoGraficoReporte;
	}

	public void setsTipoGraficoReporte(String sTipoGraficoReporte) {
		this.sTipoGraficoReporte = sTipoGraficoReporte;
	}
	
	public String getsTipoPaginacion() {
		return sTipoPaginacion;
	}

	public void setsTipoPaginacion(String sTipoPaginacion) {
		this.sTipoPaginacion = sTipoPaginacion;
	}
	
	public String getsTipoRelacion() {
		return sTipoRelacion;
	}

	public void setsTipoRelacion(String sTipoRelacion) {
		this.sTipoRelacion = sTipoRelacion;
	}
	
	public String getsTipoAccion() {
		return sTipoAccion;
	}

	public void setsTipoAccion(String sTipoAccion) {
		this.sTipoAccion = sTipoAccion;
	}
	
	public String getsTipoAccionFormulario() {
		return sTipoAccionFormulario;
	}

	public void setsTipoAccionFormulario(String sTipoAccionFormulario) {
		this.sTipoAccionFormulario = sTipoAccionFormulario;
	}
	
	public String getsTipoSeleccionar() {
		return sTipoSeleccionar;
	}

	public void setsTipoSeleccionar(String sTipoSeleccionar) {
		this.sTipoSeleccionar = sTipoSeleccionar;
	}
	
	public String getsValorCampoGeneral() {
		return sValorCampoGeneral;
	}

	public void setsValorCampoGeneral(String sValorCampoGeneral) {
		this.sValorCampoGeneral = sValorCampoGeneral;
	}			

	public String getsDetalleReporte() {
		return sDetalleReporte;
	}

	public void setsDetalleReporte(String sDetalleReporte) {
		this.sDetalleReporte = sDetalleReporte;
	}
	
	
	public String getsTipoReporteExtra() {
		return sTipoReporteExtra;
	}

	public void setsTipoReporteExtra(String sTipoReporteExtra) {
		this.sTipoReporteExtra = sTipoReporteExtra;
	}
	
	public Boolean getesReporteDinamico() {
		return esReporteDinamico;
	}	
	
	public void setesReporteDinamico(Boolean esReporteDinamico) {
		this.esReporteDinamico = esReporteDinamico;
	}
	
	public Boolean getesRecargarFks() {
		return esRecargarFks;
	}	
	
	public void setesRecargarFks(Boolean esRecargarFks) {
		this.esRecargarFks = esRecargarFks;
	}
	
	public Boolean getesReporteAccionProceso() {
		return esReporteAccionProceso;
	}	
	
	public void setesReporteAccionProceso(Boolean esReporteAccionProceso) {
		this.esReporteAccionProceso= esReporteAccionProceso;
	}
		
	public TransportistaParameterReturnGeneral getTransportistaParameterGeneral() {
		return this.transportistaParameterGeneral;
	}
	
	public void setTransportistaParameterGeneral(TransportistaParameterReturnGeneral transportistaParameterGeneral) {
		this.transportistaParameterGeneral = transportistaParameterGeneral;
	}
	
	public String getsPathReporteDinamico() {
		return sPathReporteDinamico;
	}

	public void setsPathReporteDinamico(String sPathReporteDinamico) {
		this.sPathReporteDinamico = sPathReporteDinamico;
	}
		
	public Boolean getisMostrarNumeroPaginacion() {
		return isMostrarNumeroPaginacion;
	}

	public void setisMostrarNumeroPaginacion(Boolean isMostrarNumeroPaginacion) {
		this.isMostrarNumeroPaginacion = isMostrarNumeroPaginacion;
	}
	
	public Mensaje getMensaje() {
		return mensaje;
	}

	public void setMensaje(Mensaje mensaje) {
		this.mensaje = mensaje;
	}
	
	public Boolean getIsPermisoTodoTransportista() {
		return isPermisoTodoTransportista;
	}

	public void setIsPermisoTodoTransportista(Boolean isPermisoTodoTransportista) {
		this.isPermisoTodoTransportista = isPermisoTodoTransportista;
	}

	public Boolean getIsPermisoNuevoTransportista() {
		return isPermisoNuevoTransportista;
	}

	public void setIsPermisoNuevoTransportista(Boolean isPermisoNuevoTransportista) {
		this.isPermisoNuevoTransportista = isPermisoNuevoTransportista;
	}

	public Boolean getIsPermisoActualizarTransportista() {
		return isPermisoActualizarTransportista;
	}

	public void setIsPermisoActualizarTransportista(Boolean isPermisoActualizarTransportista) {
		this.isPermisoActualizarTransportista = isPermisoActualizarTransportista;
	}

	public Boolean getIsPermisoEliminarTransportista() {
		return isPermisoEliminarTransportista;
	}

	public void setIsPermisoEliminarTransportista(Boolean isPermisoEliminarTransportista) {
		this.isPermisoEliminarTransportista = isPermisoEliminarTransportista;
	}

	public Boolean getIsPermisoGuardarCambiosTransportista() {
		return isPermisoGuardarCambiosTransportista;
	}

	public void setIsPermisoGuardarCambiosTransportista(Boolean isPermisoGuardarCambiosTransportista) {
		this.isPermisoGuardarCambiosTransportista = isPermisoGuardarCambiosTransportista;
	}
	
	public Boolean getIsPermisoConsultaTransportista() {
		return isPermisoConsultaTransportista;
	}

	public void setIsPermisoConsultaTransportista(Boolean isPermisoConsultaTransportista) {
		this.isPermisoConsultaTransportista = isPermisoConsultaTransportista;
	}

	public Boolean getIsPermisoBusquedaTransportista() {
		return isPermisoBusquedaTransportista;
	}

	public void setIsPermisoBusquedaTransportista(Boolean isPermisoBusquedaTransportista) {
		this.isPermisoBusquedaTransportista = isPermisoBusquedaTransportista;
	}

	public Boolean getIsPermisoReporteTransportista() {
		return isPermisoReporteTransportista;
	}

	public void setIsPermisoReporteTransportista(Boolean isPermisoReporteTransportista) {
		this.isPermisoReporteTransportista = isPermisoReporteTransportista;
	}
	
	public Boolean getIsPermisoPaginacionMedioTransportista() {
		return isPermisoPaginacionMedioTransportista;
	}

	public void setIsPermisoPaginacionMedioTransportista(Boolean isPermisoPaginacionMedioTransportista) {
		this.isPermisoPaginacionMedioTransportista = isPermisoPaginacionMedioTransportista;
	}
	
	public Boolean getIsPermisoPaginacionTodoTransportista() {
		return isPermisoPaginacionTodoTransportista;
	}

	public void setIsPermisoPaginacionTodoTransportista(Boolean isPermisoPaginacionTodoTransportista) {
		this.isPermisoPaginacionTodoTransportista = isPermisoPaginacionTodoTransportista;
	}
	
	public Boolean getIsPermisoPaginacionAltoTransportista() {
		return isPermisoPaginacionAltoTransportista;
	}

	public void setIsPermisoPaginacionAltoTransportista(Boolean isPermisoPaginacionAltoTransportista) {
		this.isPermisoPaginacionAltoTransportista = isPermisoPaginacionAltoTransportista;
	}
	
	public Boolean getIsPermisoCopiarTransportista() {
		return isPermisoCopiarTransportista;
	}

	public void setIsPermisoCopiarTransportista(Boolean isPermisoCopiarTransportista) {
		this.isPermisoCopiarTransportista = isPermisoCopiarTransportista;
	}
	
	public Boolean getIsPermisoVerFormTransportista() {
		return isPermisoVerFormTransportista;
	}

	public void setIsPermisoVerFormTransportista(Boolean isPermisoVerFormTransportista) {
		this.isPermisoVerFormTransportista = isPermisoVerFormTransportista;
	}
	
	public Boolean getIsPermisoDuplicarTransportista() {
		return isPermisoDuplicarTransportista;
	}

	public void setIsPermisoDuplicarTransportista(Boolean isPermisoDuplicarTransportista) {
		this.isPermisoDuplicarTransportista = isPermisoDuplicarTransportista;
	}
	
	public Boolean getIsPermisoOrdenTransportista() {
		return isPermisoOrdenTransportista;
	}

	public void setIsPermisoOrdenTransportista(Boolean isPermisoOrdenTransportista) {
		this.isPermisoOrdenTransportista = isPermisoOrdenTransportista;
	}
	
	public String getsVisibilidadTablaBusquedas() {
		return sVisibilidadTablaBusquedas;
	}

	public void setsVisibilidadTablaBusquedas(String sVisibilidadTablaBusquedas) {
		this.sVisibilidadTablaBusquedas = sVisibilidadTablaBusquedas;
	}
	
	public String getsVisibilidadTablaElementos() {
		return sVisibilidadTablaElementos;
	}

	public void setsVisibilidadTablaElementos(String sVisibilidadTablaElementos) {
		this.sVisibilidadTablaElementos = sVisibilidadTablaElementos;
	}

	public String getsVisibilidadTablaAcciones() {
		return sVisibilidadTablaAcciones;
	}

	public void setsVisibilidadTablaAcciones(String sVisibilidadTablaAcciones) {
		this.sVisibilidadTablaAcciones = sVisibilidadTablaAcciones;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoTransportista() {
		return isVisibilidadCeldaNuevoTransportista;
	}

	public void setIsVisibilidadCeldaNuevoTransportista(Boolean isVisibilidadCeldaNuevoTransportista) {
		this.isVisibilidadCeldaNuevoTransportista = isVisibilidadCeldaNuevoTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTransportista() {
		return isVisibilidadCeldaDuplicarTransportista;
	}

	public void setIsVisibilidadCeldaDuplicarTransportista(Boolean isVisibilidadCeldaDuplicarTransportista) {
		this.isVisibilidadCeldaDuplicarTransportista = isVisibilidadCeldaDuplicarTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTransportista() {
		return isVisibilidadCeldaCopiarTransportista;
	}

	public void setIsVisibilidadCeldaCopiarTransportista(Boolean isVisibilidadCeldaCopiarTransportista) {
		this.isVisibilidadCeldaCopiarTransportista = isVisibilidadCeldaCopiarTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTransportista() {
		return isVisibilidadCeldaVerFormTransportista;
	}

	public void setIsVisibilidadCeldaVerFormTransportista(Boolean isVisibilidadCeldaVerFormTransportista) {
		this.isVisibilidadCeldaVerFormTransportista = isVisibilidadCeldaVerFormTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTransportista() {
		return isVisibilidadCeldaOrdenTransportista;
	}

	public void setIsVisibilidadCeldaOrdenTransportista(Boolean isVisibilidadCeldaOrdenTransportista) {
		this.isVisibilidadCeldaOrdenTransportista = isVisibilidadCeldaOrdenTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTransportista() {
		return isVisibilidadCeldaNuevoRelacionesTransportista;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTransportista(Boolean isVisibilidadCeldaNuevoRelacionesTransportista) {
		this.isVisibilidadCeldaNuevoRelacionesTransportista = isVisibilidadCeldaNuevoRelacionesTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTransportista() {
		return isVisibilidadCeldaModificarTransportista;
	}

	public void setIsVisibilidadCeldaModificarTransportista(Boolean isVisibilidadCeldaModificarTransportista) {
		this.isVisibilidadCeldaModificarTransportista = isVisibilidadCeldaModificarTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTransportista() {
		return isVisibilidadCeldaActualizarTransportista;
	}

	public void setIsVisibilidadCeldaActualizarTransportista(Boolean isVisibilidadCeldaActualizarTransportista) {
		this.isVisibilidadCeldaActualizarTransportista = isVisibilidadCeldaActualizarTransportista;
	}

	public Boolean getIsVisibilidadCeldaEliminarTransportista() {
		return isVisibilidadCeldaEliminarTransportista;
	}

	public void setIsVisibilidadCeldaEliminarTransportista(Boolean isVisibilidadCeldaEliminarTransportista) {
		this.isVisibilidadCeldaEliminarTransportista = isVisibilidadCeldaEliminarTransportista;
	}

	public Boolean getIsVisibilidadCeldaCancelarTransportista() {
		return isVisibilidadCeldaCancelarTransportista;
	}

	public void setIsVisibilidadCeldaCancelarTransportista(Boolean isVisibilidadCeldaCancelarTransportista) {
		this.isVisibilidadCeldaCancelarTransportista = isVisibilidadCeldaCancelarTransportista;
	}

	public Boolean getIsVisibilidadCeldaGuardarTransportista() {
		return isVisibilidadCeldaGuardarTransportista;
	}

	public void setIsVisibilidadCeldaGuardarTransportista(Boolean isVisibilidadCeldaGuardarTransportista) {
		this.isVisibilidadCeldaGuardarTransportista = isVisibilidadCeldaGuardarTransportista;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTransportista() {
		return isVisibilidadCeldaGuardarCambiosTransportista;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTransportista(Boolean isVisibilidadCeldaGuardarCambiosTransportista) {
		this.isVisibilidadCeldaGuardarCambiosTransportista = isVisibilidadCeldaGuardarCambiosTransportista;
	}
		
	public TransportistaSessionBean gettransportistaSessionBean() {
		return this.transportistaSessionBean;
	}
	
	public void settransportistaSessionBean(TransportistaSessionBean transportistaSessionBean) {
		this.transportistaSessionBean=transportistaSessionBean;
	}
	
	
	public Boolean getisVisibilidadBusquedaPorIdentificacion() {
		return this.isVisibilidadBusquedaPorIdentificacion;
	}

	public void setisVisibilidadBusquedaPorIdentificacion(Boolean isVisibilidadBusquedaPorIdentificacion) {
		this.isVisibilidadBusquedaPorIdentificacion=isVisibilidadBusquedaPorIdentificacion;
	}

	public Boolean getisVisibilidadBusquedaPorNombreCompleto() {
		return this.isVisibilidadBusquedaPorNombreCompleto;
	}

	public void setisVisibilidadBusquedaPorNombreCompleto(Boolean isVisibilidadBusquedaPorNombreCompleto) {
		this.isVisibilidadBusquedaPorNombreCompleto=isVisibilidadBusquedaPorNombreCompleto;
	}

	public Boolean getisVisibilidadBusquedaPorPlaca() {
		return this.isVisibilidadBusquedaPorPlaca;
	}

	public void setisVisibilidadBusquedaPorPlaca(Boolean isVisibilidadBusquedaPorPlaca) {
		this.isVisibilidadBusquedaPorPlaca=isVisibilidadBusquedaPorPlaca;
	}

	public Boolean getisVisibilidadBusquedaPorRuc() {
		return this.isVisibilidadBusquedaPorRuc;
	}

	public void setisVisibilidadBusquedaPorRuc(Boolean isVisibilidadBusquedaPorRuc) {
		this.isVisibilidadBusquedaPorRuc=isVisibilidadBusquedaPorRuc;
	}

	public Boolean getisVisibilidadBusquedaPorTelefono() {
		return this.isVisibilidadBusquedaPorTelefono;
	}

	public void setisVisibilidadBusquedaPorTelefono(Boolean isVisibilidadBusquedaPorTelefono) {
		this.isVisibilidadBusquedaPorTelefono=isVisibilidadBusquedaPorTelefono;
	}

	public Boolean getisVisibilidadFK_IdCliente() {
		return this.isVisibilidadFK_IdCliente;
	}

	public void setisVisibilidadFK_IdCliente(Boolean isVisibilidadFK_IdCliente) {
		this.isVisibilidadFK_IdCliente=isVisibilidadFK_IdCliente;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	public Boolean getisVisibilidadFK_IdTipoViaTransporte() {
		return this.isVisibilidadFK_IdTipoViaTransporte;
	}

	public void setisVisibilidadFK_IdTipoViaTransporte(Boolean isVisibilidadFK_IdTipoViaTransporte) {
		this.isVisibilidadFK_IdTipoViaTransporte=isVisibilidadFK_IdTipoViaTransporte;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTransportista(Transportista transportista)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(transportista,null);
				this.setActualParaGuardarSucursalForeignKey(transportista,null);
				this.setActualParaGuardarTipoViaTransporteForeignKey(transportista,null);
				this.setActualParaGuardarClienteForeignKey(transportista,null);
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarLicenciaCliente(DatosCliente datosCliente) throws Exception {
		Boolean existe=false;
			
		try {
				InputStream reportFile=null;
				
				String sPath=this.parametroGeneralUsuario.getpath_exportar()+"erp_bydan/license/license.xml";
				
				reportFile = new FileInputStream(sPath);
				
				Document documentBuilder=null;
				
				if(this.constantes2.DOCUMENT_BUILDER==null) {
					documentBuilder=Funciones2.parseXml(reportFile);
				} else {
					documentBuilder=this.constantes2.DOCUMENT_BUILDER;
				}
				
				//GlobalSeguridad.readXml(documentBuilder);
				
				String sNamePCServerLicencia="";
				String sClaveSistemaLicencia="";
				Date dFechaServerLicencia=null;
				
				//CARGAR ELEMENTOS DE LICENCIA
				NodeList nodeList = documentBuilder.getElementsByTagName("Licencia");
				
				for (int iIndice = 0; iIndice < nodeList.getLength(); iIndice++) {
					Node node = nodeList.item(iIndice);
				
					if (node.getNodeType() == Node.ELEMENT_NODE) {
						Element element = (Element) node;
						 
						sNamePCServerLicencia=element.getElementsByTagName("NombrePc").item(0).getTextContent();
						sClaveSistemaLicencia=element.getElementsByTagName("ClaveSistema").item(0).getTextContent();
						
						existe=true;
						break;
					}
				}														
			
				
			if(existe) {
				datosCliente.setsClaveSistema(sClaveSistemaLicencia);
				
				if(!datosCliente.getsNamePCServer().equals(sNamePCServerLicencia)
					&& !datosCliente.getsNamePCServer().equals("")) {
					
					datosCliente.setsNamePCServer(sNamePCServerLicencia);
				}
			} else {
				throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
			}
		} catch(Exception e) {
			throw new Exception("NO EXISTE LICENCIA O NO ESTA BIEN FORMADO");
		}						
	}
	
	public void cargarDatosCliente() throws Exception {
		String sPrimerMacAddress="";		
		String sHostName="";		 
		String sHostIp="";		  
		String sHostUser="";
		
		
		sPrimerMacAddress=FuncionesNetwork.getPrimerMacAddress();		
		sHostName=FuncionesNetwork.getHostName();		 
		sHostIp=FuncionesNetwork.getHostIp();		  
		sHostUser=FuncionesNetwork.getHostUser();
		
		
		this.datosCliente=new DatosCliente();
		if(lIdUsuarioSesion!=null){datosCliente.setIdUsuario(this.lIdUsuarioSesion);}
		
		//SERVIDOR WEB Y TALVEZ SERVIDOR SWING WINDOWS
		this.datosCliente.setsUsuarioPCServer(sHostUser);
		this.datosCliente.setsNamePCServer(sHostName);
		this.datosCliente.setsIPPCServer(sHostIp);
		this.datosCliente.setsMacAddressPCServer(sPrimerMacAddress);
			
			//CLIENTE SWING WINDOWS
			this.datosCliente.setIsClienteWeb(false);
			
			this.datosCliente.setsUsuarioPC(sHostUser);
			this.datosCliente.setsNamePC(sHostName);
			this.datosCliente.setsIPPC(sHostIp);
			this.datosCliente.setsMacAddressPC(sPrimerMacAddress);	
			
			
			//this.cargarLicenciaCliente(this.datosCliente);
			
	}
	
	public void bugActualizarReferenciaActual(Transportista transportista,Transportista transportistaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTransportista(transportista);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		transportistaAux.setId(transportista.getId());
		transportistaAux.setVersionRow(transportista.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTransportista();
		
			int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = transportistaValidator.getInvalidValues(this.transportista);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			transportistaLogic.setDatosCliente(datosCliente);
			transportistaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				transportistaAux=new  Transportista();
				
				transportistaAux.setIsNew(true);
				transportistaAux.setIsChanged(true);
				
				transportistaAux.setTransportistaOriginal(this.transportista);
				
				transportistaAux.setId(this.transportista.getId());	
				transportistaAux.setVersionRow(this.transportista.getVersionRow());	
				transportistaAux.setid_empresa(this.transportista.getid_empresa());	
				transportistaAux.setid_sucursal(this.transportista.getid_sucursal());	
				transportistaAux.setid_tipo_via_transporte(this.transportista.getid_tipo_via_transporte());	
				transportistaAux.setidentificacion(this.transportista.getidentificacion());	
				transportistaAux.setruc(this.transportista.getruc());	
				transportistaAux.setnombre(this.transportista.getnombre());	
				transportistaAux.setapellido(this.transportista.getapellido());	
				transportistaAux.setnombre_completo(this.transportista.getnombre_completo());	
				transportistaAux.settelefono(this.transportista.gettelefono());	
				transportistaAux.setdireccion(this.transportista.getdireccion());	
				transportistaAux.setid_cliente(this.transportista.getid_cliente());	
				transportistaAux.setplaca(this.transportista.getplaca());	
				transportistaAux.setnumero(this.transportista.getnumero());	
				transportistaAux.setobservacion(this.transportista.getobservacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transportistaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transportistaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(transportistaAux,transportistaLogic.getTransportistas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transportistaAux,transportistas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.transportistaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transportistaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.saveTransportistas();//WithConnection
						//transportistaLogic.getSetVersionRowTransportistas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transportista,transportistaAux);
					
					this.refrescarForeignKeysDescripcionesTransportista();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				transportistaAux=new  Transportista();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.transportistaSessionBean.getEsGuardarRelacionado() 
					|| (this.transportistaSessionBean.getEsGuardarRelacionado() && this.transportista.getId()>=0)) {
						
					transportistaAux.setIsNew(false);
				}
				
				transportistaAux.setIsDeleted(false);
			
				transportistaAux.setId(this.transportista.getId());	
				transportistaAux.setVersionRow(this.transportista.getVersionRow());	
				transportistaAux.setid_empresa(this.transportista.getid_empresa());	
				transportistaAux.setid_sucursal(this.transportista.getid_sucursal());	
				transportistaAux.setid_tipo_via_transporte(this.transportista.getid_tipo_via_transporte());	
				transportistaAux.setidentificacion(this.transportista.getidentificacion());	
				transportistaAux.setruc(this.transportista.getruc());	
				transportistaAux.setnombre(this.transportista.getnombre());	
				transportistaAux.setapellido(this.transportista.getapellido());	
				transportistaAux.setnombre_completo(this.transportista.getnombre_completo());	
				transportistaAux.settelefono(this.transportista.gettelefono());	
				transportistaAux.setdireccion(this.transportista.getdireccion());	
				transportistaAux.setid_cliente(this.transportista.getid_cliente());	
				transportistaAux.setplaca(this.transportista.getplaca());	
				transportistaAux.setnumero(this.transportista.getnumero());	
				transportistaAux.setobservacion(this.transportista.getobservacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transportistaAux,transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transportistaAux,transportistas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.transportistaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transportistaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.saveTransportistas();//WithConnection
						//transportistaLogic.getSetVersionRowTransportistas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.transportista,transportistaAux);
					
					this.refrescarForeignKeysDescripcionesTransportista();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				transportistaAux=new  Transportista();
				
				transportistaAux.setIsNew(false);
				transportistaAux.setIsChanged(false);
				
				transportistaAux.setIsDeleted(true);
				
				transportistaAux.setId(this.transportista.getId());	
				transportistaAux.setVersionRow(this.transportista.getVersionRow());	
				transportistaAux.setid_empresa(this.transportista.getid_empresa());	
				transportistaAux.setid_sucursal(this.transportista.getid_sucursal());	
				transportistaAux.setid_tipo_via_transporte(this.transportista.getid_tipo_via_transporte());	
				transportistaAux.setidentificacion(this.transportista.getidentificacion());	
				transportistaAux.setruc(this.transportista.getruc());	
				transportistaAux.setnombre(this.transportista.getnombre());	
				transportistaAux.setapellido(this.transportista.getapellido());	
				transportistaAux.setnombre_completo(this.transportista.getnombre_completo());	
				transportistaAux.settelefono(this.transportista.gettelefono());	
				transportistaAux.setdireccion(this.transportista.getdireccion());	
				transportistaAux.setid_cliente(this.transportista.getid_cliente());	
				transportistaAux.setplaca(this.transportista.getplaca());	
				transportistaAux.setnumero(this.transportista.getnumero());	
				transportistaAux.setobservacion(this.transportista.getobservacion());	
				
				if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.transportistaAux.getId()>=0) {	
						this.transportistasEliminados.add(transportistaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(transportistaAux,transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transportistaAux,transportistas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.transportistaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.transportistaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.saveTransportistas();//WithConnection
						//transportistaLogic.getSetVersionRowTransportistas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getTransportistas().addAll(this.transportistasEliminados);
					
					transportistaLogic.saveTransportistas();//WithConnection
					//transportistaLogic.getSetVersionRowTransportistas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTransportista();
				
				this.transportistasEliminados= new ArrayList<Transportista>();		
			}
			
			if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Transportista GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.transportista=transportistaAux;
					}
				}
			}
			
			this.isErrorGuardar=false;
			
			this.inicializarInvalidValues();
		/*
		} else {
			this.mostrarInvalidValues();	
		}
		*/
			
		} catch(Exception e) {
			this.isErrorGuardar=true;
			
			this.crearFilaTotales();
			
			throw e;
		} finally {
      		//this.finishProcessTransportista();
      	}
		
	}	
	
	public void actualizarRelaciones(Transportista transportistaLocal) throws Exception {
		
		if(this.transportistaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Transportista transportistaLocal) throws Exception {	
		if(this.transportistaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				transportistaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				transportistaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TipoViaTransporteDetalleFormJInternalFrame.class)) {
				TipoViaTransporteBeanSwingJInternalFrame tipoviatransporteBeanSwingJInternalFrameLocal=(TipoViaTransporteBeanSwingJInternalFrame) ((TipoViaTransporteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				tipoviatransporteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.gettipoviatransporte(),true);
				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarLista(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte,this.tipoviatransportesForeignKey);

				tipoviatransporteBeanSwingJInternalFrameLocal.actualizarRelaciones(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				transportistaLocal.setTipoViaTransporte(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte);

				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey("Formulario");
				this.setActualTipoViaTransporteForeignKey(tipoviatransporteBeanSwingJInternalFrameLocal.tipoviatransporte.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ClienteDetalleFormJInternalFrame.class)) {
				ClienteBeanSwingJInternalFrame clienteBeanSwingJInternalFrameLocal=(ClienteBeanSwingJInternalFrame) ((ClienteDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				clienteBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoCliente(clienteBeanSwingJInternalFrameLocal.getcliente(),true);
				clienteBeanSwingJInternalFrameLocal.actualizarLista(clienteBeanSwingJInternalFrameLocal.cliente,this.clientesForeignKey);

				clienteBeanSwingJInternalFrameLocal.actualizarRelaciones(clienteBeanSwingJInternalFrameLocal.cliente);

				transportistaLocal.setCliente(clienteBeanSwingJInternalFrameLocal.cliente);

				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey("Formulario");
				this.setActualClienteForeignKey(clienteBeanSwingJInternalFrameLocal.cliente.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTransportistaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = transportistaValidator.getInvalidValues(this.transportista);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Transportista transportista,List<Transportista> transportistas) throws Exception {
		try	{		
			TransportistaConstantesFunciones.actualizarLista(transportista,transportistas,this.transportistaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Transportista transportista,List<Transportista> transportistas) throws Exception {
		try	{			
			TransportistaConstantesFunciones.actualizarSelectedLista(transportista,transportistas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Transportista> transportistasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				transportistasLocal=this.transportistaLogic.getTransportistas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				transportistasLocal=this.transportistas;
			}
			//ARCHITECTURE
		
			for(Transportista transportistaLocal:transportistasLocal) {
				if(this.permiteMantenimiento(transportistaLocal) && transportistaLocal.getIsSelected()) {
					tiene=true;
					break;
				}
			}
		} catch(Exception e) {
			throw e;
		}
		
		return tiene;
	}			
	
	public void mostrarInvalidValues() throws Exception {
		String sMensaje="";
				
		for (InvalidValue invalidValue : this.invalidValues) {
			sMensaje+="\r\n"+TransportistaConstantesFunciones.getTransportistaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelid_empresaTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelid_sucursalTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.IDTIPOVIATRANSPORTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelid_tipo_via_transporteTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.IDENTIFICACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelidentificacionTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.RUC)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelrucTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelnombreTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.APELLIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelapellidoTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.NOMBRECOMPLETO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelnombre_completoTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabeltelefonoTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabeldireccionTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.IDCLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelid_clienteTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.PLACA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelplacaTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelnumeroTransportista,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TransportistaConstantesFunciones.OBSERVACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelobservacionTransportista,invalidValue.getMessage());}
        }
		
		
		if(!sMensaje.equals("")) {
			//JOptionPane.showMessageDialog(this,sMensaje,"VALIDACION ",JOptionPane.ERROR_MESSAGE);
			throw new Exception(sMensaje);			
		}
		
		/*
		System.out.println(invalidValue);
        System.out.println("message=" + invalidValue.getMessage());
        System.out.println("propertyName=" + invalidValue.getPropertyName());
        System.out.println("propertyPath=" + invalidValue.getPropertyPath());
        System.out.println("value=" + invalidValue.getValue());
        */
	}		
	
	public void inicializarInvalidValues() throws Exception {
		String sMensaje="";	
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelid_empresaTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelid_sucursalTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelid_tipo_via_transporteTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelidentificacionTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelrucTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelnombreTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelapellidoTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelnombre_completoTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabeltelefonoTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabeldireccionTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelid_clienteTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelplacaTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelnumeroTransportista,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTransportista.jLabelobservacionTransportista,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTransportista--;	
		
		
		this.transportistaAux=new Transportista();
		
		this.transportistaAux.setId(this.iIdNuevoTransportista);
		this.transportistaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.transportistaLogic.getTransportistas().add(this.transportistaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.transportistas.add(this.transportistaAux);
		}
		//ARCHITECTURE
		
		this.transportista=this.transportistaAux;
		
		if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTransportista(this.transportista);
			this.setVariablesObjetoActualToFormularioForeignKeyTransportista(this.transportista);
		}
				
		//this.setDefaultControlesTransportista();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTransportista();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTransportista();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransportista();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransportista(this.transportistaBean,this.transportista,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TransportistaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.transportistaSessionBean.getConGuardarRelaciones()) {
			classes=TransportistaConstantesFunciones.getClassesRelationshipsOfTransportista(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.transportistaReturnGeneral=transportistaLogic.procesarEventosTransportistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transportistaLogic.getTransportistas(),this.transportista,this.transportistaParameterGeneral,this.isEsNuevoTransportista,classes);//this.transportistaLogic.getTransportista()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTransportista(this.transportistaReturnGeneral,this.transportistaBean,false);
		
		if(this.transportistaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTransportista(this.transportistaReturnGeneral.getTransportista());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTransportista(this.transportistaReturnGeneral.getTransportista());
		}
		
		if(this.transportistaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTransportista(this.transportistaReturnGeneral.getTransportista(),classes);//this.transportistaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTransportista(this.transportista,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTransportista();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTransportista();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransportistaBeanSwingJInternalFrameAdditional.RecargarFormTransportista(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTransportista(false);
						
			if(transportistaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransportista();
			}
			
			this.actualizarVisualTableDatosTransportista();
			
			this.jTableDatosTransportista.setRowSelectionInterval(this.getIndiceNuevoTransportista(), this.getIndiceNuevoTransportista());
			
			this.seleccionarFilaTablaTransportistaActual();
						
			this.actualizarEstadoCeldasBotonesTransportista("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTransportista(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activaridentificacionTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarrucTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarnombreTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarapellidoTransportista);//
		this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarnombre_completoTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activartelefonoTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activardireccionTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarplacaTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarnumeroTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarobservacionTransportista);	
		//
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarid_empresaTransportista);//
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarid_sucursalTransportista);
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarid_tipo_via_transporteTransportista);
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setEnabled(isHabilitar && this.transportistaConstantesFunciones.activarid_clienteTransportista);
	};
	
	public void setDefaultControlesTransportista() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTransportista(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.transportistaSessionBean.setConGuardarRelaciones(true);			
			this.transportistaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.setVisible(true);
			
					
		} else {
			//this.transportistaSessionBean.setConGuardarRelaciones(false);			
			this.transportistaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoTransportista() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
				if(transportistaAux.getId().equals(this.iIdNuevoTransportista)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transportista transportistaAux:this.transportistas) {
				if(transportistaAux.getId().equals(this.iIdNuevoTransportista)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndice-1;
		}
		
		return iIndice;
	}
	
	public int getIndiceActualTransportista(Transportista transportista,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
				if(transportistaAux.getId().equals(transportista.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transportista transportistaAux:this.transportistas) {
				if(transportistaAux.getId().equals(transportista.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
			iIndice=iIndiceActual;
		}
		
		return iIndice;
	}
	
	public void setCamposBaseDesdeOriginalTransportista(Transportista transportistaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
				if(transportistaAux.getTransportistaOriginal().getId().equals(transportistaOriginal.getId())) {
					existe=true;
					transportistaOriginal.setId(transportistaAux.getId());
					transportistaOriginal.setVersionRow(transportistaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transportista transportistaAux:this.transportistas) {
				if(transportistaAux.getTransportistaOriginal().getId().equals(transportistaOriginal.getId())) {
					existe=true;
					transportistaOriginal.setId(transportistaAux.getId());
					transportistaOriginal.setVersionRow(transportistaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTransportista(Boolean esParaCancelar) throws Exception {
		transportistasAux=new ArrayList<Transportista>();
		transportistaAux=new Transportista();
		
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
					if(transportistaAux.getId()<0) {
						transportistasAux.add(transportistaAux);
					}		
				}
				this.iIdNuevoTransportista=0L;
				this.transportistaLogic.getTransportistas().removeAll(transportistasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transportista transportistaAux:this.transportistas) {
					if(transportistaAux.getId()<0) {
						transportistasAux.add(transportistaAux);
					}		
				}
				this.iIdNuevoTransportista=0L;
				this.transportistas.removeAll(transportistasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTransportista 
					&& this.transportistaLogic.getTransportistas().size()>0
					) {
					transportistaAux=this.transportistaLogic.getTransportistas().get(this.transportistaLogic.getTransportistas().size() - 1);
				
					if(transportistaAux.getId()<0) {
						this.transportistaLogic.getTransportistas().remove(transportistaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTransportista && this.transportistas.size()>0) {
					transportistaAux=this.transportistas.get(this.transportistas.size() - 1);
				
					if(transportistaAux.getId()<0) {
						this.transportistas.remove(transportistaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTransportista(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(transportista.getId()<0) {
				this.transportistaLogic.getTransportistas().remove(this.transportista);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(transportista.getId()<0) {
				this.transportistas.remove(this.transportista);
			}
		}			
	}
	
	public void setEstadosInicialesTransportista(List<Transportista> transportistasAux) throws Exception {
		TransportistaConstantesFunciones.setEstadosInicialesTransportista(transportistasAux);
	}
	
	public void setEstadosInicialesTransportista(Transportista transportistaAux) throws Exception {
		TransportistaConstantesFunciones.setEstadosInicialesTransportista(transportistaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTransportistaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTransportista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTransportistaActual()) {
				if(!this.isEsNuevoTransportista) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTransportista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTransportista=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTransportistaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Transportista ?", "MANTENIMIENTO DE Transportista", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTransportista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Transportista transportista) throws Exception {
		TransportistaConstantesFunciones.seleccionarAsignar(this.transportista,transportista);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTransportista=this.isPermisoActualizarOriginalTransportista;
			
			
			this.seleccionarAsignar(transportista);
			
			

			idClienteActual=transportista.getid_cliente();
			this.seleccionarClienteActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TransportistaConstantesFunciones.quitarEspaciosTransportista(this.transportista,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTransportista("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.transportistaSessionBean.setsFuncionBusquedaRapida(this.transportistaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarClienteActual() throws Exception {
		try	{
			Cliente clienteAux=new Cliente();

			if(this.idClienteActual != null && this.idClienteActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					clienteLogic.getEntityWithConnection(this.idClienteActual);
					clienteAux= clienteLogic.getCliente();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				clientesForeignKey=new ArrayList<Cliente>();
				clientesForeignKey.add(clienteAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTransportista) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTransportista(esParaCancelar);				
				this.cancelarNuevoTransportista(esParaCancelar);								
			}
			
			this.transportista=new Transportista();
			
			this.inicializarTransportista();
			
			this.actualizarEstadoCeldasBotonesTransportista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTransportista() throws Exception {
		try {
			TransportistaConstantesFunciones.inicializarTransportista(this.transportista);
			
			} catch(Exception e) {
			throw e;
		}
	}
	
	public void anteriores()throws Exception {
		try	{
			//this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			
			if(this.iNumeroPaginacionPagina-this.iNumeroPaginacion<this.iNumeroPaginacion) {
				this.iNumeroPaginacionPagina=0;		
			} else {
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina-this.iNumeroPaginacion;
			}
			
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.transportistaLogic.getTransportistas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTransportistas(String sAccionBusqueda,List<Transportista> transportistasParaReportes) throws Exception {
		//HttpSession httpSession = httpServletRequest.getSession();
		Long iIdUsuarioSesion=0L;	
		
		
		if(usuarioActual==null) {
			this.usuarioActual=new Usuario();
		}
		
		iIdUsuarioSesion=usuarioActual.getId();
		
		String sPathReportes="";
		
		InputStream reportFile=null;
		InputStream imageFile=null;
			
		imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		String sPathReporteFinal="";
		
		if(!esReporteAccionProceso) {
			if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
				if(!this.esReporteDinamico) {
					sPathReporteFinal="Transportista"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TransportistaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TransportistaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Transportista"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
		}
		
		if(reportFile==null) {
			throw new JRRuntimeException(sPathReporteFinal+" no existe");
		}
		
		String sUsuario="";
		
		if(usuarioActual!=null) {
			sUsuario=usuarioActual.getuser_name();
		}
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("usuario", sUsuario);
		
		parameters.put("titulo", Funciones.GetTituloSistemaReporte(this.parametroGeneralSg,this.moduloActual,this.usuarioActual));
		parameters.put("subtitulo", "Reporte De  Transportistas");		
		parameters.put("busquedapor", TransportistaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTransportista=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TransportistaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TransportistaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTransportista=new JRBeanArrayDataSource(TransportistaJInternalFrame.TraerTransportistaBeans(transportistasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTransportista);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TransportistaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TransportistaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TransportistaBean.TraerTransportistaBeans(transportistasParaReportes).toArray()));
							
			if(this.sTipoArchivoReporte=="HTML") {
				sDestFileName+=".html";
				JasperExportManager.exportReportToHtmlFile(jasperPrint,sDestFileName);
					
			} else if(this.sTipoArchivoReporte=="PDF") {
				sDestFileName+=".pdf";
				JasperExportManager.exportReportToPdfFile(jasperPrint,sDestFileName);
			} else {
				sDestFileName+=".xml";
				JasperExportManager.exportReportToXmlFile(jasperPrint,sDestFileName, false);
			}	
			
		} else if(this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {
				
			if(this.sTipoArchivoReporte=="WORD") {
				sDestFileName+=".rtf";
					
				JRRtfExporter exporter = new JRRtfExporter();
		
				exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
		
				exporter.exportReport();
				
			} else	{
				sDestFileName+=".xls";
					
				JRXlsExporter exporterXls = new JRXlsExporter();
		
				exporterXls.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
				exporterXls.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, sDestFileName);
				exporterXls.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET, Boolean.TRUE);
		
				exporterXls.exportReport();
			}
			
		} else if(this.sTipoArchivoReporte=="EXCEL2"||this.sTipoArchivoReporte=="EXCEL2_2") {
			//sDestFileName+=".xlsx";
			
			if(this.sTipoReporte.equals("NORMAL")) {
				this.generarExcelReporteTransportistas(sAccionBusqueda,sTipoArchivoReporte,transportistasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTransportistas(sAccionBusqueda,sTipoArchivoReporte,transportistasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTransportistaActionPerformed(null);
					//this.generarExcelReporteTransportistas(sAccionBusqueda,sTipoArchivoReporte,transportistasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTransportistas(sAccionBusqueda,sTipoArchivoReporte,transportistasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTransportistas(sAccionBusqueda,sTipoArchivoReporte,transportistasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTransportistas(sAccionBusqueda,sTipoArchivoReporte,transportistasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTransportistas(String sAccionBusqueda,String sTipoArchivoReporte,List<Transportista> transportistasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transportistas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransportista("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Transportista transportista : transportistasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TransportistaConstantesFunciones.generarExcelReporteDataTransportista("NORMAL",row,workbook,transportista,cellStyleDataAux);
		
			
			/*
            Cell cell0 = row.createCell(0);
            cell0.setCellValue(country.getName());
            Cell cell1 = row.createCell(1);
            cell1.setCellValue(country.getShortCode());
			*/
			
			i++;
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTransportista(String sTipo,Row row,Workbook workbook) {
		
		TransportistaConstantesFunciones.generarExcelReporteHeaderTransportista(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTransportistas(String sAccionBusqueda,String sTipoArchivoReporte,List<Transportista> transportistasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transportistas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Transportista transportista : transportistasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TransportistaConstantesFunciones.getTransportistaDescripcion(transportista));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.gettipoviatransporte_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_IDENTIFICACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDENTIFICACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getidentificacion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_RUC))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_RUC);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getruc());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_APELLIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_APELLIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getapellido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getnombre_completo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.gettelefono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_IDCLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDCLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getcliente_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_PLACA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_PLACA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getplaca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TransportistaConstantesFunciones.LABEL_OBSERVACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TransportistaConstantesFunciones.LABEL_OBSERVACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(transportista.getobservacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTransportistas(String sAccionBusqueda,String sTipoArchivoReporte,List<Transportista> transportistasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Transportista> transportistasRespaldo=null;
		
		classes=TransportistaConstantesFunciones.getClassesRelationshipsOfTransportista(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.transportistaLogic.setDatosCliente(this.datosCliente);
		this.transportistaLogic.setDatosDeep(this.datosDeep);
		this.transportistaLogic.setIsConDeep(true);
		
		transportistasRespaldo=this.transportistaLogic.getTransportistas();
		
		this.transportistaLogic.setTransportistas(transportistasParaReportes);	
		this.transportistaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		transportistasParaReportes=this.transportistaLogic.getTransportistas();
		this.transportistaLogic.setTransportistas(transportistasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Transportistas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTransportista("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Transportista transportista : transportistasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTransportista("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TransportistaConstantesFunciones.generarExcelReporteDataTransportista("NORMAL",row,workbook,transportista,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(TransportistaConstantesFunciones.getTransportistaDescripcion(transportista));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public Boolean existeRelacionReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTransportista.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransportista.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTransportista() throws Exception {		
		this.startProcessTransportista(true);
	}
	
	public void startProcessTransportista(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTransportista ,this.jPanelParametrosReportesTransportista, this.jScrollPanelDatosTransportista,this.jPanelPaginacionTransportista, this.jScrollPanelDatosEdicionTransportista, this.jPanelAccionesTransportista,this.jPanelAccionesFormularioTransportista,this.jmenuBarTransportista,this.jmenuBarDetalleTransportista,this.jTtoolBarTransportista,this.jTtoolBarDetalleTransportista);		
		
		final JTabbedPane jTabbedPaneBusquedasTransportista=this.jTabbedPaneBusquedasTransportista; 
		
		final JPanel jPanelParametrosReportesTransportista=this.jPanelParametrosReportesTransportista;
		//final JScrollPane jScrollPanelDatosTransportista=this.jScrollPanelDatosTransportista;
		final JTable jTableDatosTransportista=this.jTableDatosTransportista;		
		final JPanel jPanelPaginacionTransportista=this.jPanelPaginacionTransportista;
		//final JScrollPane jScrollPanelDatosEdicionTransportista=this.jScrollPanelDatosEdicionTransportista;
		final JPanel jPanelAccionesTransportista=this.jPanelAccionesTransportista;
		
		JPanel jPanelCamposAuxiliarTransportista=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTransportista=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
			jPanelCamposAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jPanelCamposTransportista;
			jPanelAccionesFormularioAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jPanelAccionesFormularioTransportista;
		}
		
		final JPanel jPanelCamposTransportista=jPanelCamposAuxiliarTransportista;
		final JPanel jPanelAccionesFormularioTransportista=jPanelAccionesFormularioAuxiliarTransportista;
		
		
		final JMenuBar jmenuBarTransportista=this.jmenuBarTransportista;
		final JToolBar jTtoolBarTransportista=this.jTtoolBarTransportista;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTransportista=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransportista=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
			jmenuBarDetalleAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jmenuBarDetalleTransportista;
			jTtoolBarDetalleAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jTtoolBarDetalleTransportista;
		}
		
		final JMenuBar jmenuBarDetalleTransportista=jmenuBarDetalleAuxiliarTransportista;
		final JToolBar jTtoolBarDetalleTransportista=jTtoolBarDetalleAuxiliarTransportista;		
		
		
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("START");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransportista;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransportista;
			processRunnable.jTableDatos=jTableDatosTransportista;
			processRunnable.jPanelCampos=jPanelCamposTransportista;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransportista;
			processRunnable.jPanelAcciones=jPanelAccionesTransportista;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransportista;
			
			
			processRunnable.jmenuBar=jmenuBarTransportista;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransportista;
			processRunnable.jTtoolBar=jTtoolBarTransportista;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransportista;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransportista ,jPanelParametrosReportesTransportista,jTableDatosTransportista, /*jScrollPanelDatosTransportista,*/jPanelCamposTransportista,jPanelPaginacionTransportista, /*jScrollPanelDatosEdicionTransportista,*/ jPanelAccionesTransportista,jPanelAccionesFormularioTransportista,jmenuBarTransportista,jmenuBarDetalleTransportista,jTtoolBarTransportista,jTtoolBarDetalleTransportista);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTransportista ,jPanelParametrosReportesTransportista, jScrollPanelDatosTransportista,jPanelPaginacionTransportista, jScrollPanelDatosEdicionTransportista, jPanelAccionesTransportista,jPanelAccionesFormularioTransportista,jmenuBarTransportista,jmenuBarDetalleTransportista,jTtoolBarTransportista,jTtoolBarDetalleTransportista);
						
							startProcess();//this.
							
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			      }
			});
		}
		*/
	}
	
	public void finishProcessTransportista() {// throws Exception 
		this.finishProcessTransportista(true);
	}
	
	public void finishProcessTransportista(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTransportista ,this.jPanelParametrosReportesTransportista, this.jScrollPanelDatosTransportista,this.jPanelPaginacionTransportista, this.jScrollPanelDatosEdicionTransportista, this.jPanelAccionesTransportista,this.jPanelAccionesFormularioTransportista,this.jmenuBarTransportista,this.jmenuBarDetalleTransportista,this.jTtoolBarTransportista,this.jTtoolBarDetalleTransportista);		
		
		final JTabbedPane jTabbedPaneBusquedasTransportista=this.jTabbedPaneBusquedasTransportista; 
		
		final JPanel jPanelParametrosReportesTransportista=this.jPanelParametrosReportesTransportista;
		//final JScrollPane jScrollPanelDatosTransportista=this.jScrollPanelDatosTransportista;
		final JTable jTableDatosTransportista=this.jTableDatosTransportista;		
		final JPanel jPanelPaginacionTransportista=this.jPanelPaginacionTransportista;
		//final JScrollPane jScrollPanelDatosEdicionTransportista=this.jScrollPanelDatosEdicionTransportista;
		final JPanel jPanelAccionesTransportista=this.jPanelAccionesTransportista;
		
		JPanel jPanelCamposAuxiliarTransportista=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTransportista=new JPanel();
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
			jPanelCamposAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jPanelCamposTransportista;
			jPanelAccionesFormularioAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jPanelAccionesFormularioTransportista;
		}
		
		final JPanel jPanelCamposTransportista=jPanelCamposAuxiliarTransportista;
		final JPanel jPanelAccionesFormularioTransportista=jPanelAccionesFormularioAuxiliarTransportista;
		
		
		final JMenuBar jmenuBarTransportista=this.jmenuBarTransportista;		
		final JToolBar jTtoolBarTransportista=this.jTtoolBarTransportista;
				
		JMenuBar jmenuBarDetalleAuxiliarTransportista=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTransportista=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
			jmenuBarDetalleAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jmenuBarDetalleTransportista;
			jTtoolBarDetalleAuxiliarTransportista=this.jInternalFrameDetalleFormTransportista.jTtoolBarDetalleTransportista;		
		}
		
		final JMenuBar jmenuBarDetalleTransportista=jmenuBarDetalleAuxiliarTransportista;
		final JToolBar jTtoolBarDetalleTransportista=jTtoolBarDetalleAuxiliarTransportista;
		
		
		
		if(Constantes2.CON_PROCESO_HILO) {
			Thread threadRunnableProcess;
			ProcessRunnable processRunnable;
			
			processRunnable=new ProcessRunnable();
			
			processRunnable.setsTipo("END");
			processRunnable.setDesktop(jDesktopPane);
			processRunnable.setModuloActual(moduloActual);
			processRunnable.setModuloUsuarioSeleccionado(moduloActual);
			processRunnable.setOpcionActual(opcionActual);
			processRunnable.setParametroGeneralSg(parametroGeneralSg);
			processRunnable.setParametroGeneralUsuario(parametroGeneralUsuario);
			processRunnable.setResumenUsuarioActual(resumenUsuarioActual);
			processRunnable.setUsuarioActual(usuarioActual);
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTransportista;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTransportista;
			processRunnable.jTableDatos=jTableDatosTransportista;
			processRunnable.jPanelCampos=jPanelCamposTransportista;
			processRunnable.jPanelPaginacion=jPanelPaginacionTransportista;
			processRunnable.jPanelAcciones=jPanelAccionesTransportista;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTransportista;
			
			
			processRunnable.jmenuBar=jmenuBarTransportista;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTransportista;
			processRunnable.jTtoolBar=jTtoolBarTransportista;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTransportista;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTransportista ,jPanelParametrosReportesTransportista, jTableDatosTransportista,/*jScrollPanelDatosTransportista,*/jPanelCamposTransportista,jPanelPaginacionTransportista, /*jScrollPanelDatosEdicionTransportista,*/ jPanelAccionesTransportista,jPanelAccionesFormularioTransportista,jmenuBarTransportista,jmenuBarDetalleTransportista,jTtoolBarTransportista,jTtoolBarDetalleTransportista));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTransportista(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTransportista(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTransportista(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTransportista(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTransportista,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTransportista,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTransportista(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTransportista,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTransportista,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.transportistaConstantesFunciones.getsFinalQueryTransportista();
		String  finalQueryPaginacionTodos=this.transportistaConstantesFunciones.getsFinalQueryTransportista();
		
		Boolean esBusqueda=false;
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!sAccionBusqueda.equals("Todos"))	{
			esBusqueda=true;
		}
		
		this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
		this.arrDatoGeneralNo= new  ArrayList<String>();
		
		ArrayList<String> arrColumnasGlobalesNo=TransportistaConstantesFunciones.getArrayColumnasGlobalesNoTransportista(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TransportistaConstantesFunciones.getArrayColumnasGlobalesTransportista(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TransportistaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.transportistasEliminados= new ArrayList<Transportista>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTransportista();
		
				///*TransportistaSessionBean*/this.transportistaSessionBean=new TransportistaSessionBean();
			
			if(this.transportistaSessionBean==null) {
				this.transportistaSessionBean=new TransportistaSessionBean();
			}
			
			//ACTUALIZA EL TAMANIO DE PAGINACION DESDE EL COMBO
			if(this.sTipoPaginacion!=null && !this.sTipoPaginacion.equals("")) {
				if(!this.sTipoPaginacion.equals("TODOS")) {
					this.iNumeroPaginacion=Integer.parseInt(this.sTipoPaginacion);
				} else {
					this.iNumeroPaginacion=-1;
					this.iNumeroPaginacionPagina=-1;
				}
			} else {
				if(this.iNumeroPaginacion==null || (this.iNumeroPaginacion!=null && this.iNumeroPaginacion<=0)) {
					this.iNumeroPaginacion=TransportistaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TransportistaConstantesFunciones.getClassesForeignKeysOfTransportista(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/transportista."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			transportistasAux= new ArrayList<Transportista>();
			
				
			transportistaLogic.setDatosCliente(this.datosCliente);
			transportistaLogic.setDatosDeep(this.datosDeep);
			transportistaLogic.setIsConDeep(true);
			
			
			transportistaLogic.getTransportistaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					transportistaLogic.getTodosTransportistas(finalQueryGlobal,pagination);
					
					//transportistaLogic.getTodosTransportistasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(transportistaLogic.getTransportistas()==null|| transportistaLogic.getTransportistas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transportistasAux= new ArrayList<Transportista>();
							transportistasAux.addAll(transportistaLogic.getTransportistas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux= new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transportistaLogic.getTodosTransportistas(finalQueryGlobal+"",this.pagination);												
							
							//transportistaLogic.getTodosTransportistasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTransportistas("Todos",transportistaLogic.getTransportistas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							transportistaLogic.setTransportistas(new ArrayList<Transportista>());					
							transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTransportista=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTransportista=this.idActual;
				
				} else if(this.idTransportistaActual!=null && this.idTransportistaActual!=0L) {
					idTransportista=idTransportistaActual;
				}
				
					
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndicePorId(idTransportista);
				
				this.transportistas=new ArrayList<Transportista>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					transportistaLogic.getEntity(idTransportista);
					
					//transportistaLogic.getEntityWithConnection(idTransportista);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.setTransportistas(new ArrayList<Transportista>());
					transportistaLogic.getTransportistas().add(transportistaLogic.getTransportista());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportistas=new ArrayList<Transportista>();
					this.transportistas.add(transportista);
				}
				
				if(transportistaLogic.getTransportista()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("BusquedaPorIdentificacion")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasBusquedaPorIdentificacion(finalQueryGlobal,pagination,identificacionBusquedaPorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasBusquedaPorIdentificacion(finalQueryGlobal,pagination,identificacionBusquedaPorIdentificacion);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorIdentificacion(identificacionBusquedaPorIdentificacion);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("BusquedaPorIdentificacion",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("BusquedaPorIdentificacion",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorNombreCompleto")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasBusquedaPorNombreCompleto(finalQueryGlobal,pagination,nombre_completoBusquedaPorNombreCompleto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasBusquedaPorNombreCompleto(finalQueryGlobal,pagination,nombre_completoBusquedaPorNombreCompleto);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorNombreCompleto(nombre_completoBusquedaPorNombreCompleto);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("BusquedaPorNombreCompleto",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("BusquedaPorNombreCompleto",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorPlaca")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorPlaca(placaBusquedaPorPlaca);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasBusquedaPorPlaca(finalQueryGlobal,pagination,placaBusquedaPorPlaca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorPlaca(placaBusquedaPorPlaca);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorPlaca(placaBusquedaPorPlaca);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasBusquedaPorPlaca(finalQueryGlobal,pagination,placaBusquedaPorPlaca);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorPlaca(placaBusquedaPorPlaca);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorPlaca(placaBusquedaPorPlaca);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("BusquedaPorPlaca",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("BusquedaPorPlaca",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorRuc")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasBusquedaPorRuc(finalQueryGlobal,pagination,rucBusquedaPorRuc);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasBusquedaPorRuc(finalQueryGlobal,pagination,rucBusquedaPorRuc);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorRuc(rucBusquedaPorRuc);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("BusquedaPorRuc",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("BusquedaPorRuc",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("BusquedaPorTelefono")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasBusquedaPorTelefono(finalQueryGlobal,pagination,telefonoBusquedaPorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasBusquedaPorTelefono(finalQueryGlobal,pagination,telefonoBusquedaPorTelefono);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceBusquedaPorTelefono(telefonoBusquedaPorTelefono);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("BusquedaPorTelefono",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("BusquedaPorTelefono",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdCliente")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasFK_IdCliente(finalQueryGlobal,pagination,id_clienteFK_IdCliente);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdCliente(id_clienteFK_IdCliente);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("FK_IdCliente",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("FK_IdCliente",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("FK_IdEmpresa",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("FK_IdEmpresa",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("FK_IdSucursal",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("FK_IdSucursal",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTipoViaTransporte")) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					transportistaLogic.getTransportistasFK_IdTipoViaTransporte(finalQueryGlobal,pagination,id_tipo_via_transporteFK_IdTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=transportistaLogic.getTransportistas()==null||transportistaLogic.getTransportistas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=transportistas==null|| transportistas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistasAux=new ArrayList<Transportista>();
						transportistasAux.addAll(transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistasAux=new ArrayList<Transportista>();
							transportistasAux.addAll(transportistas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							transportistaLogic.getTransportistasFK_IdTipoViaTransporte(finalQueryGlobal,pagination,id_tipo_via_transporteFK_IdTipoViaTransporte);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TransportistaConstantesFunciones.getDetalleIndiceFK_IdTipoViaTransporte(id_tipo_via_transporteFK_IdTipoViaTransporte);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTransportistas("FK_IdTipoViaTransporte",transportistaLogic.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTransportistas("FK_IdTipoViaTransporte",transportistas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaLogic.setTransportistas(new ArrayList<Transportista>());
						transportistaLogic.getTransportistas().addAll(transportistasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistas=new ArrayList<Transportista>();
							transportistas.addAll(transportistasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTransportista();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTransportista();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transportistaLogic.getTransportistas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transportistas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=transportistaLogic.getTransportistas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=transportistas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Transportista transportista) {
		Boolean permite=true;
		
		if(this.transportista.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TransportistaConstantesFunciones.getOrderByListaTransportista();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TransportistaConstantesFunciones.getOrderByListaTransportista();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transportista transportista:transportistaLogic.getTransportistas()) {
				if(transportista.getsType().equals(Constantes2.S_TOTALES)) {
					transportistaTotales=transportista;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transportista transportista:this.transportistas) {
				if(transportista.getsType().equals(Constantes2.S_TOTALES)) {
					transportistaTotales=transportista;
					existe=true;
					break;
				}
			}
		}
		
		return existe;
	}
	
	public void crearFilaTotales() throws Exception {
		Boolean existe=false;
		
		existe=this.existeFilaTotales();
		
		if(!existe) {
			//SI NO ES UNO A UNO SE CREA FILA TOTALES
			this.transportistaAux=new Transportista();
			this.transportistaAux.setsType(Constantes2.S_TOTALES);
			this.transportistaAux.setIsNew(false);
			this.transportistaAux.setIsChanged(false);
			this.transportistaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TransportistaConstantesFunciones.TotalizarValoresFilaTransportista(this.transportistaLogic.getTransportistas(),this.transportistaAux);
				
				this.transportistaLogic.getTransportistas().add(this.transportistaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TransportistaConstantesFunciones.TotalizarValoresFilaTransportista(this.transportistas,this.transportistaAux);
				
				this.transportistas.add(this.transportistaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		transportistaTotales=new Transportista();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transportistaLogic.getTransportistas().remove(transportistaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.transportistas.remove(transportistaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		transportistaTotales=new Transportista();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Transportista transportista:transportistaLogic.getTransportistas()) {
				if(transportista.getsType().equals(Constantes2.S_TOTALES)) {
					transportistaTotales=transportista;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransportistaConstantesFunciones.TotalizarValoresFilaTransportista(this.transportistaLogic.getTransportistas(),transportistaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Transportista transportista:this.transportistas) {
				if(transportista.getsType().equals(Constantes2.S_TOTALES)) {
					transportistaTotales=transportista;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TransportistaConstantesFunciones.TotalizarValoresFilaTransportista(this.transportistas,transportistaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTransportistasBusquedaPorIdentificacion()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorIdentificacion";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasBusquedaPorNombreCompleto()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorNombreCompleto";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasBusquedaPorPlaca()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorPlaca";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasBusquedaPorRuc()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorRuc";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasBusquedaPorTelefono()throws Exception {
		try {
			sAccionBusqueda="BusquedaPorTelefono";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasFK_IdCliente()throws Exception {
		try {
			sAccionBusqueda="FK_IdCliente";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTransportistasFK_IdTipoViaTransporte()throws Exception {
		try {
			sAccionBusqueda="FK_IdTipoViaTransporte";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTransportistasBusquedaPorIdentificacion(String sFinalQuery,String identificacion)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasBusquedaPorIdentificacion(sFinalQuery,this.pagination,identificacion);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasBusquedaPorNombreCompleto(String sFinalQuery,String nombre_completo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasBusquedaPorNombreCompleto(sFinalQuery,this.pagination,nombre_completo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasBusquedaPorPlaca(String sFinalQuery,String placa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasBusquedaPorPlaca(sFinalQuery,this.pagination,placa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasBusquedaPorRuc(String sFinalQuery,String ruc)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasBusquedaPorRuc(sFinalQuery,this.pagination,ruc);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasBusquedaPorTelefono(String sFinalQuery,String telefono)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasBusquedaPorTelefono(sFinalQuery,this.pagination,telefono);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasFK_IdCliente(String sFinalQuery,Long id_cliente)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasFK_IdCliente(sFinalQuery,this.pagination,id_cliente);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTransportistasFK_IdTipoViaTransporte(String sFinalQuery,Long id_tipo_via_transporte)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLogic.getTransportistasFK_IdTipoViaTransporte(sFinalQuery,this.pagination,id_tipo_via_transporte);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	
	public void onLoad()throws Exception {		
		try {		
			isEntroOnLoad=true;
			//INTENTA TRAER DATOS DE BUSQUEDA ANTERIOR
			this.traerDatosBusquedaDesdeSession();
					
			//SINO SE CUMPLE VIENE DE PADRE FOREIGN O BUSQUEDA ANTIGUA
			if(this.sAccionBusqueda.equals("")) {
				this.sAccionBusqueda="Todos";
			}
								
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch (Exception e) {
			throw e;
		}
	}		
	
	public void inicializarPermisosTransportista() {
		this.isPermisoTodoTransportista=false;
		this.isPermisoNuevoTransportista=false;
		this.isPermisoActualizarTransportista=false;
		this.isPermisoActualizarOriginalTransportista=false;
		this.isPermisoEliminarTransportista=false;
		this.isPermisoGuardarCambiosTransportista=false;
		this.isPermisoConsultaTransportista=false;
		this.isPermisoBusquedaTransportista=false;
		this.isPermisoReporteTransportista=false;		
		this.isPermisoOrdenTransportista=false;		
		this.isPermisoPaginacionMedioTransportista=false;		
		this.isPermisoPaginacionAltoTransportista=false;
		this.isPermisoPaginacionTodoTransportista=false;
		this.isPermisoCopiarTransportista=false;		
		this.isPermisoVerFormTransportista=false;		
		this.isPermisoDuplicarTransportista=false;		
		this.isPermisoOrdenTransportista=false;		
	}
	
	public void setPermisosUsuarioTransportista(Boolean isPermiso) {
		this.isPermisoTodoTransportista=isPermiso;
		this.isPermisoNuevoTransportista=isPermiso;
		this.isPermisoActualizarTransportista=isPermiso;
		this.isPermisoActualizarOriginalTransportista=isPermiso;
		this.isPermisoEliminarTransportista=isPermiso;
		this.isPermisoGuardarCambiosTransportista=isPermiso;
		this.isPermisoConsultaTransportista=isPermiso;
		this.isPermisoBusquedaTransportista=isPermiso;
		this.isPermisoReporteTransportista=isPermiso;
		this.isPermisoOrdenTransportista=isPermiso;		
		this.isPermisoPaginacionMedioTransportista=isPermiso;		
		this.isPermisoPaginacionAltoTransportista=isPermiso;		
		this.isPermisoPaginacionTodoTransportista=isPermiso;		
		this.isPermisoCopiarTransportista=isPermiso;		
		this.isPermisoVerFormTransportista=isPermiso;		
		this.isPermisoDuplicarTransportista=isPermiso;
		this.isPermisoOrdenTransportista=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTransportista(Boolean isPermiso) {
		//this.isPermisoTodoTransportista=isPermiso;
		this.isPermisoNuevoTransportista=isPermiso;
		this.isPermisoActualizarTransportista=isPermiso;
		this.isPermisoActualizarOriginalTransportista=isPermiso;
		this.isPermisoEliminarTransportista=isPermiso;
		this.isPermisoGuardarCambiosTransportista=isPermiso;
		//this.isPermisoConsultaTransportista=isPermiso;
		//this.isPermisoBusquedaTransportista=isPermiso;
		//this.isPermisoReporteTransportista=isPermiso;
		//this.isPermisoOrdenTransportista=isPermiso;		
		//this.isPermisoPaginacionMedioTransportista=isPermiso;		
		//this.isPermisoPaginacionAltoTransportista=isPermiso;		
		//this.isPermisoPaginacionTodoTransportista=isPermiso;		
		//this.isPermisoCopiarTransportista=isPermiso;		
		//this.isPermisoDuplicarTransportista=isPermiso;
		//this.isPermisoOrdenTransportista=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTransportistaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(TransportistaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTransportista(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTransportistaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioTransportistaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTransportistaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTransportistaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioTransportista() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TransportistaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TransportistaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTransportista=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTransportista=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTransportista=this.isPermisoActualizarTransportista;
			this.isPermisoEliminarTransportista=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTransportista=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTransportista=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTransportista=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTransportista=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTransportista=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransportista=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTransportista=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTransportista=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTransportista=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTransportista=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTransportista=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTransportista=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTransportista=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTransportista.setToolTipText(this.jTableDatosTransportista.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTransportista(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTransportista(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TransportistaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accions=this.sistemaReturnGeneral.getAccions();
				
				
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accions=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,false);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accions.size()>0) {			
				for(Accion accion:this.accions) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
		
		
					this.tiposAcciones.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAcciones.add(reporte);
			
		} else {
			//ACCIONES FORMULARIO
			this.accionsFormulario=new ArrayList<Accion>();
			
			if(TransportistaJInternalFrame.CON_LLAMADA_SIMPLE) {
				this.accionsFormulario=this.sistemaReturnGeneral.getAccionsFormulario();
			
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.accionsFormulario=sistemaLogicAdditional.getAccionesUsuario(this.usuarioActual,this.opcionActual,true);				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}
			
			if(this.accionsFormulario.size()>0) {			
				for(Accion accion:this.accionsFormulario) {
					reporte=new Reporte();
					reporte.setsCodigo(accion.getcodigo());
					reporte.setsDescripcion(accion.getnombre());
					
					this.tiposAccionesFormulario.add(reporte);
				}
			}	
			
			

			reporte=new Reporte();
			reporte.setsCodigo("");
			reporte.setsDescripcion("");

			this.tiposAccionesFormulario.add(reporte);
		}				
	}	 	
	
	public void setRelacionesUsuarioTransportista() throws Exception {
		Reporte reporte=null;
		
		
		
		
		//ORDENAR ALFABETICAMENTE
		Collections.sort(this.tiposRelaciones, new ReporteComparator());
		/*
		reporte=new Reporte();
		reporte.setsCodigo(accion.getcodigo());
		reporte.setsDescripcion(accion.getnombre());
			
		this.tiposRelaciones.add(reporte);
		*/
	}	
	
		
	@SuppressWarnings({ "unchecked", "rawtypes" } )
	public void inicializarCombosForeignKeyTransportistaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.tipoviatransportesForeignKey=new ArrayList();
				this.clientesForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTransportistaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TransportistaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTransportistaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	

	public void cargarCombosForeignKeyEmpresaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpresaConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeySucursalListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=SucursalConstantesFunciones.SFINALQUERY;

				this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyTipoViaTransporteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

				this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyClienteListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ClienteConstantesFunciones.SFINALQUERY;

				this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTransportistaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TransportistaParameterReturnGeneral transportistaReturnGeneral=new TransportistaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.transportistaConstantesFunciones.cargarid_empresaTransportista)
					 || (this.esRecargarFks && this.transportistaConstantesFunciones.cargarid_empresaTransportista)) {

					if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+transportistaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.transportistaConstantesFunciones.cargarid_sucursalTransportista)
					 || (this.esRecargarFks && this.transportistaConstantesFunciones.cargarid_sucursalTransportista)) {

					if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+transportistaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTipoViaTransporte="";

				if(((this.tipoviatransportesForeignKey==null||this.tipoviatransportesForeignKey.size()<=0) && this.transportistaConstantesFunciones.cargarid_tipo_via_transporteTransportista)
					 || (this.esRecargarFks && this.transportistaConstantesFunciones.cargarid_tipo_via_transporteTransportista)) {

					if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TipoViaTransporteConstantesFunciones.getArrayColumnasGlobalesTipoViaTransporte(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTipoViaTransporte=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TipoViaTransporteConstantesFunciones.TABLENAME);

						finalQueryGlobalTipoViaTransporte=Funciones.GetFinalQueryAppend(finalQueryGlobalTipoViaTransporte, "");
						finalQueryGlobalTipoViaTransporte+=TipoViaTransporteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTipoViaTransportesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTipoViaTransporte=" WHERE " + ConstantesSql.ID + "="+transportistaSessionBean.getlidTipoViaTransporteActual();
					}
				} else {
					finalQueryGlobalTipoViaTransporte="NONE";
				}


				String finalQueryGlobalCliente="";

				if(((this.clientesForeignKey==null||this.clientesForeignKey.size()<=0) && this.transportistaConstantesFunciones.cargarid_clienteTransportista)
					 || (this.esRecargarFks && this.transportistaConstantesFunciones.cargarid_clienteTransportista)) {

					if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ClienteConstantesFunciones.getArrayColumnasGlobalesCliente(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalCliente=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ClienteConstantesFunciones.TABLENAME);

						finalQueryGlobalCliente=Funciones.GetFinalQueryAppend(finalQueryGlobalCliente, "");
						finalQueryGlobalCliente+=ClienteConstantesFunciones.SFINALQUERY;

						//this.cargarCombosClientesForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalCliente=" WHERE " + ConstantesSql.ID + "="+transportistaSessionBean.getlidClienteActual();
					}
				} else {
					finalQueryGlobalCliente="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				transportistaReturnGeneral=transportistaLogic.cargarCombosLoteForeignKeyTransportista(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTipoViaTransporte,finalQueryGlobalCliente);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=transportistaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=transportistaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTipoViaTransporte.equals("NONE")) {
				this.tipoviatransportesForeignKey=transportistaReturnGeneral.gettipoviatransportesForeignKey();
			}

			if(!finalQueryGlobalCliente.equals("NONE")) {
				this.clientesForeignKey=transportistaReturnGeneral.getclientesForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTransportista()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTipoViaTransporte();
			this.addItemDefectoCombosForeignKeyCliente();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.transportistaSessionBean==null) {
				this.transportistaSessionBean=new TransportistaSessionBean();
			}

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
				Empresa empresa=new Empresa();
				EmpresaConstantesFunciones.setEmpresaDescripcion(empresa,Constantes.SMENSAJE_ESCOJA_OPCION);
				empresa.setId(null);

				if(!EmpresaConstantesFunciones.ExisteEnLista(this.empresasForeignKey,empresa,true)) {

					this.empresasForeignKey.add(0,empresa);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeySucursal()throws Exception {
		try {

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
				Sucursal sucursal=new Sucursal();
				SucursalConstantesFunciones.setSucursalDescripcion(sucursal,Constantes.SMENSAJE_ESCOJA_OPCION);
				sucursal.setId(null);

				if(!SucursalConstantesFunciones.ExisteEnLista(this.sucursalsForeignKey,sucursal,true)) {

					this.sucursalsForeignKey.add(0,sucursal);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyTipoViaTransporte()throws Exception {
		try {

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionTipoViaTransporte()) {
				TipoViaTransporte tipoviatransporte=new TipoViaTransporte();
				TipoViaTransporteConstantesFunciones.setTipoViaTransporteDescripcion(tipoviatransporte,Constantes.SMENSAJE_ESCOJA_OPCION);
				tipoviatransporte.setId(null);

				if(!TipoViaTransporteConstantesFunciones.ExisteEnLista(this.tipoviatransportesForeignKey,tipoviatransporte,true)) {

					this.tipoviatransportesForeignKey.add(0,tipoviatransporte);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyCliente()throws Exception {
		try {

			if(!this.transportistaSessionBean.getisBusquedaDesdeForeignKeySesionCliente()) {
				Cliente cliente=new Cliente();
				ClienteConstantesFunciones.setClienteDescripcion(cliente,Constantes.SMENSAJE_ESCOJA_OPCION);
				cliente.setId(null);

				if(!ClienteConstantesFunciones.ExisteEnLista(this.clientesForeignKey,cliente,true)) {

					this.clientesForeignKey.add(0,cliente);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTransportista()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTransportista(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTransportista()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTransportista();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTransportista(Transportista transportista)throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(transportista.getid_tipo_via_transporte(),false,"Formulario");
			this.setActualClienteForeignKey(transportista.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTransportista(Transportista transportista,String sTipoEvento)throws Exception {	
		try {
			
			

				if(transportista.getCliente()!=null && !sTipoEvento.equals("id_clienteTransportista")) { //sTipoEvento Evita Bucle Infinito

					this.clientesForeignKey=new ArrayList<Cliente>();
					this.clientesForeignKey.add(transportista.getCliente());

					this.addItemDefectoCombosForeignKeyCliente();
					this.cargarCombosFrameClientesForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTransportista()throws Exception {	
		try {
			
			this.setActualTipoViaTransporteForeignKey(this.transportistaConstantesFunciones.getid_tipo_via_transporte(),false,"Formulario");
			this.setActualClienteForeignKey(this.transportistaConstantesFunciones.getid_cliente(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTransportista()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTransportista()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTransportista()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTransportista()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTransportista()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");
			this.cargarCombosFrameClientesForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTransportista(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTransportista()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista!=null && this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista!=null && this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista!=null && this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista!=null && this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.getItemCount()>0) {
				this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public TransportistaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TransportistaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TransportistaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.transportistaSessionBean=new TransportistaSessionBean(); 
		this.transportistaConstantesFunciones=new TransportistaConstantesFunciones(); 
		this.transportistaBean=new Transportista();//(this.transportistaConstantesFunciones); 		
		this.transportistaReturnGeneral=new TransportistaParameterReturnGeneral(); 
		
		this.transportistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.transportistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TransportistaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TransportistaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TransportistaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTransportista(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			
			
			//SE ASIGNA EN CLASE PADRE
			/*
			this.parametroGeneralSg=parametroGeneralSg;		
			this.parametroGeneralUsuario=parametroGeneralUsuario;	
			this.usuarioActual=usuarioActual;
			this.moduloActual=moduloActual;
			*/						
			
			long start_time=0;
			long end_time=0;
			
			if(Constantes2.ISDEVELOPING2) {
				start_time = System.currentTimeMillis();
			}
			
			if(!cargarTodosDatos) {
				this.sAccionBusqueda="NINGUNO";
			}
			
			this.transportistaConstantesFunciones=new TransportistaConstantesFunciones(); 
			this.transportistaBean=new Transportista();//this.transportistaConstantesFunciones); 			
			this.transportistaReturnGeneral=new TransportistaParameterReturnGeneral(); 
		
			TransportistaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Transportista Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.transportista=new Transportista();
			this.transportistas = new ArrayList<Transportista>();
			this.transportistasAux = new ArrayList<Transportista>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic=new TransportistaLogic();
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			//this.transportistaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.transportistaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTransportista);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTransportista!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransportista);	
					}
					
					if(this.jInternalFrameImportacionTransportista!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransportista);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTransportista!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTransportista);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTransportista!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTransportista);
				this.jInternalFrameDetalleFormTransportista.setVisible(false);
				this.jInternalFrameDetalleFormTransportista.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTransportista!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransportista);
					this.jInternalFrameReporteDinamicoTransportista.setVisible(false);
					this.jInternalFrameReporteDinamicoTransportista.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTransportista!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTransportista);
					this.jInternalFrameImportacionTransportista.setVisible(false);
					this.jInternalFrameImportacionTransportista.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTransportista!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTransportista);
					this.jInternalFrameOrderByTransportista.setVisible(false);
					this.jInternalFrameOrderByTransportista.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTransportistaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TransportistaConstantesFunciones.INUMEROPAGINACION;
			this.pagination=new Pagination();
			this.datosCliente=new DatosCliente();
			this.lIdUsuarioSesion=0L;	
			this.sTipoArchivoReporte="";
			this.sTipoArchivoReporteDinamico="";
			this.sTipoReporte="";
			this.sTipoReporteDinamico="";
			this.sTipoPaginacion="";
			this.sTipoRelacion="";
			this.sTipoAccion="";
			this.sTipoAccionFormulario="";
			this.sTipoSeleccionar="";			
			this.sDetalleReporte="";
			this.sTipoReporteExtra="";
			this.sValorCampoGeneral="";
			this.sPathReporteDinamico="";			
			
			this.isMostrarNumeroPaginacion=false;
			this.isSeleccionarTodos=false;
			this.isSeleccionados=false;
			this.conGraficoReporte=false;
			this.isPostAccionNuevo=false;
			this.isPostAccionSinCerrar=false;
			this.isPostAccionSinMensaje=false;
			this.esReporteDinamico=false;
			this.esRecargarFks=false;
			this.esReporteAccionProceso=false;
			
			this.transportistaReturnGeneral=new TransportistaParameterReturnGeneral();
			
			this.transportistaParameterGeneral=new TransportistaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.transportistaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarLicenciaCliente(this.datosCliente,this.moduloActual,this.usuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_CONTROLGLOBAL);
					}
					
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			}			
			
			//VERIFICAR GLOBAL
			
			//VERIFICAR SESSION ACTUAL
			//this.cargarDatosCliente();
			
			this.sistemaReturnGeneral=new SistemaParameterReturnGeneral();
			
			SistemaParameterReturnGeneralAdditional.inicializarSinSeguridad(this.sistemaReturnGeneral);
			
			if(TransportistaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransportistaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transportistaSessionBean.getEsGuardarRelacionado(),this.transportistaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TransportistaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.transportistaSessionBean.getEsGuardarRelacionado(),this.transportistaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					if(!this.sistemaReturnGeneral.getEsValidado()) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
					//FALTA
				}
			} else { 
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					if(!sistemaLogicAdditional.validarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual)) {
					 	this.setVisible(false);
						throw new Exception(Mensajes.SERROR_SESIONACTUAL);
					}
				
				} else if(Constantes.ISUSAEJBREMOTE) {
					
				} else if(Constantes.ISUSAEJBHOME) {
				}
			} 
			//VERIFICAR SESSION ACTUAL
			
			
			this.sVisibilidadTablaBusquedas="table-row";
			this.sVisibilidadTablaElementos="none";
			this.sVisibilidadTablaAcciones="none";
			
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaDuplicarTransportista=true;
			this.isVisibilidadCeldaCopiarTransportista=true;
			this.isVisibilidadCeldaVerFormTransportista=true;
			this.isVisibilidadCeldaOrdenTransportista=true;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
			this.isVisibilidadCeldaModificarTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=false;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=false;
			this.isVisibilidadCeldaGuardarTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
			
			
			this.isVisibilidadBusquedaPorIdentificacion=true;
			this.isVisibilidadBusquedaPorNombreCompleto=true;
			this.isVisibilidadBusquedaPorPlaca=true;
			this.isVisibilidadBusquedaPorRuc=true;
			this.isVisibilidadBusquedaPorTelefono=true;
			this.isVisibilidadFK_IdCliente=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTipoViaTransporte=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTransportista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTransportista();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTransportista(false);
			
			this.setPermisosUsuarioTransportista();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transportistaSessionBean.getEsGuardarRelacionado() 
				|| (this.transportistaSessionBean.getEsGuardarRelacionado() && this.transportistaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTransportistaClasesRelacionadas();
			}
			
			if(this.transportistaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTransportistaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TransportistaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTransportista();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTransportista();
			}
			
			if(!this.isPermisoBusquedaTransportista) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTransportista.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTransportista,this.isPermisoPaginacionMedioTransportista,this.isPermisoPaginacionTodoTransportista);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TransportistaConstantesFunciones.getTiposSeleccionarTransportista());
				
				this.tiposColumnasSelect=TransportistaConstantesFunciones.getTiposSeleccionarTransportista(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				
			} else {
				this.tiposArchivosReportes=new ArrayList<Reporte>();
				this.tiposArchivosReportesDinamico=new ArrayList<Reporte>();
				this.tiposReportes=new ArrayList<Reporte>();
				this.tiposReportesDinamico=new ArrayList<Reporte>();
				this.tiposGraficosReportes=new ArrayList<Reporte>();
				this.tiposPaginacion=new ArrayList<Reporte>();
				this.tiposSeleccionar=new ArrayList<Reporte>();			
				this.tiposColumnasSelect=new ArrayList<Reporte>();	
				this.tiposRelacionesSelect=new ArrayList<Reporte>();	
			}
						
			
			//FUNCIONALIDAD_RELACIONADO
			//if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTransportista();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTransportista(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTransportista(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTransportista() ;
			
			/*
			} else {
				this.tiposAcciones=new ArrayList<Reporte>();
				this.tiposAccionesFormulario=new ArrayList<Reporte>();
			}
			*/						
			
			this.inicializarInvalidValues();
						
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			
			
			this.arrOrderBy= new  ArrayList<OrderBy>();
			
			
			this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
			
			
			this.traerValoresTablaOrderBy();			
			
			
			this.isGuardarCambiosEnLote=false;
			this.isCargarCombosDependencia=false;
			
			 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.tipoviatransporteLogic=new TipoViaTransporteLogic();
			this.clienteLogic=new ClienteLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				transportistaImplementable= (TransportistaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransportistaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				transportistaImplementableHome= (TransportistaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TransportistaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.transportistas= new ArrayList<Transportista>();
			this.transportistasEliminados= new ArrayList<Transportista>();
						
			this.isEsNuevoTransportista=false;
			this.esParaAccionDesdeFormularioTransportista=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idClienteActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>() ;
			this.clientesForeignKey=new ArrayList<Cliente>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTransportista(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTransportista();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TransportistaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TransportistaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTransportista("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTransportista(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTransportista!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTransportista();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTransportista();
			}
			
			TransportistaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTransportista.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTransportista.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTransportista.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTransportista(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Transportista: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTransportista() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTransportista")) {
				iIndex=this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTransportista.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTransportista();	
			}
		}
    }
	
	
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
	}		
	
	public void cargarCombosForeignKeyTransportista(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTransportista(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTransportista(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTransportistaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTransportista();
		
		this.cargarCombosFrameForeignKeyTransportista();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTransportista();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTransportista();
		}
	}
	
	

	public void cargarCombosForeignKeyTipoViaTransporte(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTipoViaTransporteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTipoViaTransporte();
				this.cargarCombosFrameTipoViaTransportesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTipoViaTransporte(this.tipoviatransportesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyCliente(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyClienteListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyCliente();
				this.cargarCombosFrameClientesForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaCliente(this.clientesForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTransportistaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.transportistaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			
			if(jTableDatosTransportista.getRowCount()>=1) {
				jTableDatosTransportista.removeRowSelectionInterval(0, jTableDatosTransportista.getRowCount()-1);						
			}
			
			this.isEsNuevoTransportista=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTransportista(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTransportista(true);			
			//this.transportista=new Transportista();
			//this.transportista.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransportista(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransportista() ;
			
			if(TransportistaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransportista(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.transportista);	
			this.actualizarInformacion("INFO_PADRE",false,this.transportista);				
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			if(this.transportistaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Transportista: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTransportistaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTransportista.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTransportista.getSelectedRows().length;			
			}
			
			transportistasSeleccionados=this.getTransportistasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTransportista--;			
				//Transportista transportistaAux= new Transportista();			
				//transportistaAux.setId(this.iIdNuevoTransportista);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Transportista transportistaOrigen=new Transportista();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Transportista transportistaOrigen : transportistasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							transportistaOrigen =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							transportistaOrigen =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTransportista();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.transportista.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTransportista(transportistaOrigen,this.transportista,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transportistaLogic.getTransportistas().add(this.transportistaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transportistas.add(this.transportistaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTransportista(false);
				
				this.jTableDatosTransportista.setRowSelectionInterval(this.getIndiceNuevoTransportista(), this.getIndiceNuevoTransportista());
				
				int iLastRow =  this.jTableDatosTransportista.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransportista.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransportista.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransportista(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();									
		
			Transportista transportistaOrigen=new Transportista();
			Transportista transportistaDestino=new Transportista();
				
			transportistasSeleccionados=this.getTransportistasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTransportista.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || transportistasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTransportista.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaOrigen =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transportistaOrigen =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						transportistaDestino =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						transportistaDestino =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				transportistaOrigen =transportistasSeleccionados.get(0);
				transportistaDestino =transportistasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTransportista(transportistaOrigen,transportistaDestino,true,false);
				
				transportistaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(transportistaDestino,transportistaLogic.getTransportistas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(transportistaDestino,transportistas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTransportista(false);
				
				//this.jTableDatosTransportista.setRowSelectionInterval(this.getIndiceNuevoTransportista(), this.getIndiceNuevoTransportista());
				
				int iLastRow =  this.jTableDatosTransportista.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTransportista.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTransportista.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTransportista(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTransportista.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTransportista.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTransportista.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTransportista.setVisible(!isVisible);
			this.jPanelPaginacionTransportista.setVisible(!isVisible);
			this.jPanelAccionesTransportista.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTransportista();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTransportista();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTransportista();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTransportista();
			
			this.abrirFrameOrderByTransportista();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTransportista();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTransportista(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransportista);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTransportista.isMaximum()) {
					this.jInternalFrameDetalleFormTransportista.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTransportista.setSize(this.jInternalFrameDetalleFormTransportista.iWidthFormulario,this.jInternalFrameDetalleFormTransportista.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTransportista.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTransportista.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTransportista.isMaximum()) {
						this.jInternalFrameDetalleFormTransportista.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTransportista.jContentPaneDetalleTransportista.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTransportista.jContentPaneDetalleTransportista.getWidth(),TransportistaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTransportista.jContentPaneDetalleTransportista.getWidth(),TransportistaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTransportista.jContentPaneDetalleTransportista.getWidth(),TransportistaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTransportista.setVisible(true);
	        this.jInternalFrameDetalleFormTransportista.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTransportista() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTransportista==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTransportista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransportista,false,this);
				} else {
					this.jInternalFrameOrderByTransportista=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTransportista,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTransportista);
				this.jInternalFrameOrderByTransportista.setVisible(false);
				this.jInternalFrameOrderByTransportista.setSelected(false);
				
				this.jInternalFrameOrderByTransportista.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransportista"));
				
				this.inicializarActualizarBindingTablaOrderByTransportista();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTransportista() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTransportista==null) {
				
				this.jInternalFrameImportacionTransportista=new ImportacionJInternalFrame(TransportistaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTransportista);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTransportista);
				this.jInternalFrameImportacionTransportista.setVisible(false);
				this.jInternalFrameImportacionTransportista.setSelected(false);


				this.jInternalFrameImportacionTransportista.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransportista"));
				this.jInternalFrameImportacionTransportista.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransportista"));
				this.jInternalFrameImportacionTransportista.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransportista"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTransportista() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTransportista==null) {
				this.jInternalFrameReporteDinamicoTransportista=new ReporteDinamicoJInternalFrame(TransportistaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTransportista);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTransportista);
				this.jInternalFrameReporteDinamicoTransportista.setVisible(false);
				this.jInternalFrameReporteDinamicoTransportista.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTransportista.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransportista"));
				this.jInternalFrameReporteDinamicoTransportista.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransportista"));
				this.jInternalFrameReporteDinamicoTransportista.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransportista"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransportista();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
					
	public void cerrarFrameDetalleTransportista() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTransportista);
			
	       	this.jInternalFrameDetalleFormTransportista.setVisible(false);
	        this.jInternalFrameDetalleFormTransportista.setSelected(false);
			
			//this.jInternalFrameDetalleFormTransportista.dispose();
			//this.jInternalFrameDetalleFormTransportista=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTransportista() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTransportista.setVisible(true);
	        this.jInternalFrameReporteDinamicoTransportista.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTransportista() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTransportista.setVisible(true);
	        this.jInternalFrameImportacionTransportista.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTransportista() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTransportista.setVisible(true);
	        this.jInternalFrameOrderByTransportista.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTransportista() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTransportista.setVisible(false);
	        this.jInternalFrameOrderByTransportista.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTransportista() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTransportista.setVisible(false);
	        this.jInternalFrameReporteDinamicoTransportista.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTransportista() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTransportista.setVisible(false);
	        this.jInternalFrameImportacionTransportista.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTransportista(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTransportista(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTransportista(true);
			//this.isEsNuevoTransportista=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTransportista("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransportista(false) ;
			
			if(transportistaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(TransportistaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransportista(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransportista(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTransportistaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTransportista(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTransportista(true);
			//this.isEsNuevoTransportista=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.transportista.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTransportista("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTransportista(false) ;
			
			if(TransportistaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTransportista(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransportista(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Cliente")) {
				if(!this.transportistaConstantesFunciones.cargarid_clienteTransportista) {
					this.cargarCombosClientesForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingTransportista(false,false);
					this.cargarCombosFrameClientesForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_cliente (id);

				this.recargarComboTablaCliente(this.clientesForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTipoViaTransporte(List<TipoViaTransporte> tipoviatransportesForeignKey)throws Exception{
		TableColumn tableColumnTipoViaTransporte=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));
		TableCellEditor tableCellEditorTipoViaTransporte =tableColumnTipoViaTransporte.getCellEditor();

		TipoViaTransporteTableCell tipoviatransporteTableCellFk=(TipoViaTransporteTableCell)tableCellEditorTipoViaTransporte;

		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.settipoviatransportesForeignKey(tipoviatransportesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransportista.getSelectedRow();

		//if(intSelectedRow<=0) {
			//tipoviatransporteTableCellFk.setRowActual(intSelectedRow);
			//tipoviatransporteTableCellFk.settipoviatransportesForeignKeyActual(tipoviatransportesForeignKey);
		//}


		if(tipoviatransporteTableCellFk!=null) {
			tipoviatransporteTableCellFk.RecargarTipoViaTransportesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaCliente(List<Cliente> clientesForeignKey)throws Exception{
		TableColumn tableColumnCliente=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDCLIENTE));
		TableCellEditor tableCellEditorCliente =tableColumnCliente.getCellEditor();

		ClienteTableCell clienteTableCellFk=(ClienteTableCell)tableCellEditorCliente;

		if(clienteTableCellFk!=null) {
			clienteTableCellFk.setclientesForeignKey(clientesForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTransportista.getSelectedRow();

		//if(intSelectedRow<=0) {
			//clienteTableCellFk.setRowActual(intSelectedRow);
			//clienteTableCellFk.setclientesForeignKeyActual(clientesForeignKey);
		//}


		if(clienteTableCellFk!=null) {
			clienteTableCellFk.RecargarClientesForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_cliente (Long id) throws Exception {
		this.setActualClienteForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTransportista(false);
			
			//if(!this.isEsNuevoTransportista) {								
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				
			}
			
			if(this.permiteMantenimiento(this.transportista)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.transportistaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTransportista=true;
					this.inicializarActualizarBindingTablaTransportista(false);
					this.isEsNuevoTransportista=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTransportista=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTransportista=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransportista(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransportista(false);
				
				this.habilitarDeshabilitarControlesTransportista(false);
			
												
				
				if(TransportistaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTransportista();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTransportistaActionPerformed(evt,transportistaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTransportista(this.transportista,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTransportista.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,transportistaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.transportista.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTransportistaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				this.transportista.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				this.transportista.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.transportista)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.transportistaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TransportistaModel) this.jTableDatosTransportista.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTransportista=true;
				this.inicializarActualizarBindingTablaTransportista(false);
				this.isEsNuevoTransportista=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTransportista(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransportista(false);
				
				this.habilitarDeshabilitarControlesTransportista(false);
				
				
				
				if(TransportistaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTransportista();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTransportistaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTransportista.getRowCount()>=1) {
				jTableDatosTransportista.removeRowSelectionInterval(0, jTableDatosTransportista.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTransportista(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTransportista(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTransportista(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTransportista(false) ;
			
			this.isEsNuevoTransportista=false;
			
			if(TransportistaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTransportista();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTransportistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTransportista(false);
				
				//SI ES MANUAL
				if(TransportistaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTransportista();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTransportistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTransportista--;			
			//Transportista transportistaAux= new Transportista();			
			//transportistaAux.setId(this.iIdNuevoTransportista);
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTransportista();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
			
			this.transportista.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.transportistaLogic.getTransportistas().add(this.transportistaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.transportistas.add(this.transportistaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTransportista(false);
			
			this.jTableDatosTransportista.setRowSelectionInterval(this.getIndiceNuevoTransportista(), this.getIndiceNuevoTransportista());
			
			int iLastRow =  this.jTableDatosTransportista.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTransportista.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTransportista.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTransportista(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTransportistaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTransportista(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransportista(false);
			
			//SI ES MANUAL
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransportista();
			}
			
			//this.abrirFrameTreeTransportista();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTransportistaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE TransportistaS ?", "MANTENIMIENTO DE Transportista", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTransportista.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTransportista();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.transportistaReturnGeneral=transportistaLogic.procesarImportacionTransportistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.transportistaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTransportistaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTransportistaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTransportista.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTransportista.setFileImportacion(this.jInternalFrameImportacionTransportista.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTransportista.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTransportista.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTransportista.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTransportista.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTransportistaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		

		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TransportistaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TransportistaBaseDesign.jrxml";
			
			sXmlStringFile=Funciones2.getStringFromInputStream(reportFile);
						
			bufferedWriter = new BufferedWriter(new FileWriter(sPath));
			
			
			sXmlStringFile=this.actualizarReporteDinamico(sXmlStringFile);
			
			
			bufferedWriter.write(sXmlStringFile);
			
			bufferedWriter.close();
			
			try{JasperCompileManager.compileReportToFile(sPath);}catch(Exception e){e.printStackTrace();}
			
			this.actualizarVariablesTipoReporte(false,true,false,sPath);
			
			/*
			this.esReporteDinamico=true;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");
			this.sTipoReporteExtra="";
			*/
			
			this.generarReporteTransportistas("Todos",transportistasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}
	}		
	
	
	public String actualizarReporteDinamico(String sXmlStringFile) {				
		Reporte reporte=new Reporte();
		Integer iAnchoMaximoVertical=535;//781,782
		Integer iAnchoMaximoHorizontal=782;
		Integer iAnchoSum=0;
		Integer iAnchoColumna=0;
		
		Integer iAnchoMargenes=60;
		String sWidthGrafico="535";
		
		for(int index:this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransportistaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TipoViaTransporte_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TipoViaTransporte_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TipoViaTransporte_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TipoViaTransporte_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_IDENTIFICACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_entificacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_entificacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_entificacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_entificacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_RUC:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_c_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_c_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_c_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_c_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_APELLIDO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ellido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ellido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ellido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ellido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCompleto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCompleto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCompleto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCompleto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_IDCLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Cliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Cliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Cliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Cliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_PLACA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_aca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_aca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_aca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_aca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TransportistaConstantesFunciones.LABEL_OBSERVACION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_servacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_servacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_servacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_servacion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;
					
				default :
					break;
			}
		}
		
		iAnchoSum+=iAnchoMargenes;
		
		if(iAnchoSum>iAnchoMaximoVertical) {
			sXmlStringFile=sXmlStringFile.replace("595", "842");
			//sXmlStringFile=sXmlStringFile.replace("842", "595");
			sXmlStringFile=sXmlStringFile.replace("535", "782");
			sXmlStringFile=sXmlStringFile.replace("Portrait", "Landscape");			
			sWidthGrafico="782";
		
		} else {
			sXmlStringFile=sXmlStringFile.replace("842", "595");
			//sXmlStringFile=sXmlStringFile.replace("595", "842");
			sXmlStringFile=sXmlStringFile.replace("782", "535");
			sXmlStringFile=sXmlStringFile.replace("Landscape", "Portrait");
			sWidthGrafico="535";
		}
		
		if(this.jInternalFrameReporteDinamicoTransportista.getjCheckBoxConGraficoDinamico().isSelected()) {
			sXmlStringFile=this.actualizarGraficoReporteDinamico(sXmlStringFile,sWidthGrafico);
		} else {
			sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "30");
		}
		
		return sXmlStringFile;
	}
	
	
	
	public String actualizarGraficoReporteDinamico(String sXmlStringFile,String sWidthGrafico) {		
		String strGrafico="";		
		String sTipo="NORMAL";
		String strCategorySeries="";
		String sNombreCampoCategoria="";
		String sNombreCampoCategoriaValor="";
		Reporte reporte=new Reporte();
		Reporte reporteCategoriaValor=new Reporte();
		Reporte reporteTipoGraficoReporte=new Reporte();
		Boolean existe=false;
		
		sXmlStringFile=sXmlStringFile.replace("colancho_summary_colancho", "280");
		
		//CATEGORIA GRAFICO				
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TransportistaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TransportistaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoria="id_tipo_via_transporte";
					break;

				case TransportistaConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoria="identificacion";
					break;

				case TransportistaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoria="ruc";
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case TransportistaConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoria="apellido";
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoria="nombre_completo";
					break;

				case TransportistaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;

				case TransportistaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case TransportistaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoria="id_cliente";
					break;

				case TransportistaConstantesFunciones.LABEL_PLACA:
					sNombreCampoCategoria="placa";
					break;

				case TransportistaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case TransportistaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoria="observacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TransportistaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TransportistaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					sNombreCampoCategoriaValor="id_tipo_via_transporte";
					break;

				case TransportistaConstantesFunciones.LABEL_IDENTIFICACION:
					sNombreCampoCategoriaValor="identificacion";
					break;

				case TransportistaConstantesFunciones.LABEL_RUC:
					sNombreCampoCategoriaValor="ruc";
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case TransportistaConstantesFunciones.LABEL_APELLIDO:
					sNombreCampoCategoriaValor="apellido";
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					sNombreCampoCategoriaValor="nombre_completo";
					break;

				case TransportistaConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;

				case TransportistaConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case TransportistaConstantesFunciones.LABEL_IDCLIENTE:
					sNombreCampoCategoriaValor="id_cliente";
					break;

				case TransportistaConstantesFunciones.LABEL_PLACA:
					sNombreCampoCategoriaValor="placa";
					break;

				case TransportistaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case TransportistaConstantesFunciones.LABEL_OBSERVACION:
					sNombreCampoCategoriaValor="observacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTransportista.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTransportista.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TransportistaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TransportistaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Tipo Via Transporte",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_tipo_via_transporte");
					break;

				case TransportistaConstantesFunciones.LABEL_IDENTIFICACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Identificacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"identificacion");
					break;

				case TransportistaConstantesFunciones.LABEL_RUC:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ruc",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ruc");
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case TransportistaConstantesFunciones.LABEL_APELLIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Apellido",sNombreCampoCategoria,sNombreCampoCategoriaValor,"apellido");
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Completo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_completo");
					break;

				case TransportistaConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
					break;

				case TransportistaConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case TransportistaConstantesFunciones.LABEL_IDCLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_cliente");
					break;

				case TransportistaConstantesFunciones.LABEL_PLACA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Placa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"placa");
					break;

				case TransportistaConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case TransportistaConstantesFunciones.LABEL_OBSERVACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Observacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"observacion");
					break;
					
				default :
					break;
			}
		}
		//VALORES GRAFICO
		//if(sTipoGraficoReporte.equals("BARRAS") || sTipoGraficoReporte.equals("BARRAS_3D") || sTipoGraficoReporte.equals("BARRAS_XY") ||
		//   sTipoGraficoReporte.equals("PASTEL") || sTipoGraficoReporte.equals("PASTEL_3D") || sTipoGraficoReporte.equals("APILADO")) {
			
			existe=true;
			strGrafico=FuncionesReporte.getStringGraficoReporte(sTipoGraficoReporte,sWidthGrafico,strCategorySeries);			
		//}
		
		if(existe) {
			sXmlStringFile=sXmlStringFile.replace("<!--GRAFICO-->", strGrafico);
		}												
		
		return sXmlStringFile;
	}
	
	
	//@SuppressWarnings("deprecation")
	
	public void jButtonGenerarExcelReporteDinamicoTransportistaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista";//.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		Boolean existeFilas=false;
		
		Workbook workbook = null;
		FileOutputStream fileOutputStream=null;
		Reporte reporte=new Reporte();
		
		try {
			
			if(sTipoArchivoReporte=="EXCEL2") {
				workbook = new HSSFWorkbook();
				sPath+=".xls";
			
			} else if(sTipoArchivoReporte=="EXCEL2_2") {
				workbook = new XSSFWorkbook();
				sPath+=".xlsx";			
			}
		
			Sheet sheet = workbook.createSheet("Transportistas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TransportistaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.gettipoviatransporte_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_IDENTIFICACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDENTIFICACION);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getidentificacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_RUC:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_RUC);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getruc());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_APELLIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_APELLIDO);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getapellido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getnombre_completo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.gettelefono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_IDCLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDCLIENTE);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getcliente_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_PLACA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_PLACA);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getplaca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TransportistaConstantesFunciones.LABEL_OBSERVACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TransportistaConstantesFunciones.LABEL_OBSERVACION);
					iRow++;

					for(Transportista transportista:transportistasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(transportista.getobservacion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;
					
					default :
						break;
				}
			}
			
			
			//if(conCabecera) {
			//	this.getFilaCabeceraExportarExcelTransportista(row);				
			//	iRow++;
			//}				
			
			//for(Transportista transportistaAux:transportistasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTransportista(transportistaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}				
	}	
	
	
	
	
	public void buscarPorId(Long idActual) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransportista(false);
			
			//SI ES MANUAL
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTransportista();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTransportistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransportista(false);
			
			//SI ES MANUAL
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransportista();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTransportistaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTransportista(false);
			
			//SI ES MANUAL
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTransportista();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTransportista() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTransportista.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTransportista.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTransportista.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTransportista.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTransportista.setMinimumSize(dimensionMinimum);
		this.jTableDatosTransportista.setMaximumSize(dimensionMaximum);
		this.jTableDatosTransportista.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTransportista(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTransportista(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTransportista(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTransportista(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTransportista(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTransportista(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransportista(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTransportista(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TransportistaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTransportista() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTransportista();
		
		this.inicializarActualizarBindingBotonesManualTransportista(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTransportista();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTransportista() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTransportista(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTransportista(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTransportista.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTransportista.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTransportista.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTransportista!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTransportista.jCheckBoxPostAccionNuevoTransportista.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTransportista.jCheckBoxPostAccionSinCerrarTransportista.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTransportista.jCheckBoxPostAccionSinMensajeTransportista.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTransportista.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTransportista.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTransportista.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTransportista!=null) {
				this.jInternalFrameDetalleFormTransportista.jCheckBoxPostAccionNuevoTransportista.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTransportista.jCheckBoxPostAccionSinCerrarTransportista.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTransportista.jCheckBoxPostAccionSinMensajeTransportista.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTransportista.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTransportista.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTransportista.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTransportista!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTransportista.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTransportista.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTransportista.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTransportista.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTransportista!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTransportista.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTransportista.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTransportista(Boolean esInicializar) throws Exception {
		try	{	
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTransportista(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTransportista() throws Exception {
		try	{
			if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTransportista();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransportista() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTransportista() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTransportista.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTransportista.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTransportista.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTransportista.addItem(reporte);
			}
			
			
			if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTransportista.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTransportista.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTransportista.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTransportista.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTransportista.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTransportista.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTransportista.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransportista();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTransportista() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransportista!=null) {
				this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTransportista!=null) {
				this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTransportista.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTransportista!=null) {
				
				if(this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransportista.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTransportista.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTransportista.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTransportista.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTransportista()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		this.identificacionBusquedaPorIdentificacion=this.jTextFieldidentificacionBusquedaPorIdentificacionTransportista.getText();
		this.nombre_completoBusquedaPorNombreCompleto=this.jTextAreanombre_completoBusquedaPorNombreCompletoTransportista.getText();
		this.placaBusquedaPorPlaca=this.jTextFieldplacaBusquedaPorPlacaTransportista.getText();
		this.rucBusquedaPorRuc=this.jTextFieldrucBusquedaPorRucTransportista.getText();
		this.telefonoBusquedaPorTelefono=this.jTextFieldtelefonoBusquedaPorTelefonoTransportista.getText();
		if(this.jComboBoxid_clienteFK_IdClienteTransportista.getSelectedItem()!=null){this.id_clienteFK_IdCliente=((Cliente)this.jComboBoxid_clienteFK_IdClienteTransportista.getSelectedItem()).getId();}
		if(this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.getSelectedItem()!=null){this.id_tipo_via_transporteFK_IdTipoViaTransporte=((TipoViaTransporte)this.jComboBoxid_tipo_via_transporteFK_IdTipoViaTransporteTransportista.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTransportista(Boolean esInicializar) throws Exception {				
		if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTransportista();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTransportista() throws Exception {
		this.inicializarActualizarBindingTablaTransportista(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTransportista() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTransportistaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportistaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTransportista(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=transportistaLogic.getTransportistas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=transportistas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTransportista.setModel(new TransportistaModel(this.transportistaLogic.getTransportistas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTransportista.setModel(new TransportistaModel(this.transportistas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTransportista!=null && this.jInternalFrameOrderByTransportista.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTransportista();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TransportistaConstantesFunciones.SCLASSWEBTITULO,transportistaConstantesFunciones.resaltarSeleccionarTransportista,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TransportistaConstantesFunciones.SCLASSWEBTITULO,transportistaConstantesFunciones.resaltarSeleccionarTransportista,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_ID));

		if(this.transportistaConstantesFunciones.mostraridTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.transportistaConstantesFunciones.resaltaridTransportista,this.transportistaConstantesFunciones.activaridTransportista,this,true,"idTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltaridTransportista,this.transportistaConstantesFunciones.activaridTransportista,this,true,"idTransportista","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.transportistaConstantesFunciones.mostrarid_empresaTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.transportistaConstantesFunciones.resaltarid_empresaTransportista,this,this.transportistaConstantesFunciones.activarid_empresaTransportista));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.transportistaConstantesFunciones.resaltarid_empresaTransportista,this,this.transportistaConstantesFunciones.activarid_empresaTransportista,false,"id_empresaTransportista","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.transportistaConstantesFunciones.mostrarid_sucursalTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.transportistaConstantesFunciones.resaltarid_sucursalTransportista,this,this.transportistaConstantesFunciones.activarid_sucursalTransportista));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.transportistaConstantesFunciones.resaltarid_sucursalTransportista,this,this.transportistaConstantesFunciones.activarid_sucursalTransportista,false,"id_sucursalTransportista","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE));

		if(this.transportistaConstantesFunciones.mostrarid_tipo_via_transporteTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.transportistaConstantesFunciones.resaltarid_tipo_via_transporteTransportista,this,this.transportistaConstantesFunciones.activarid_tipo_via_transporteTransportista));
			tableColumn.setCellEditor(new TipoViaTransporteTableCell(this.tipoviatransportesForeignKey,this.transportistaConstantesFunciones.resaltarid_tipo_via_transporteTransportista,this,this.transportistaConstantesFunciones.activarid_tipo_via_transporteTransportista,true,"id_tipo_via_transporteTransportista","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDENTIFICACION));

		if(this.transportistaConstantesFunciones.mostraridentificacionTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_IDENTIFICACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltaridentificacionTransportista,this.transportistaConstantesFunciones.activaridentificacionTransportista,this,true,"identificacionTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltaridentificacionTransportista,this.transportistaConstantesFunciones.activaridentificacionTransportista,this,true,"identificacionTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_RUC));

		if(this.transportistaConstantesFunciones.mostrarrucTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_RUC,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarrucTransportista,this.transportistaConstantesFunciones.activarrucTransportista,this,true,"rucTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarrucTransportista,this.transportistaConstantesFunciones.activarrucTransportista,this,true,"rucTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_NOMBRE));

		if(this.transportistaConstantesFunciones.mostrarnombreTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarnombreTransportista,this.transportistaConstantesFunciones.activarnombreTransportista,this,true,"nombreTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarnombreTransportista,this.transportistaConstantesFunciones.activarnombreTransportista,this,true,"nombreTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_APELLIDO));

		if(this.transportistaConstantesFunciones.mostrarapellidoTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_APELLIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarapellidoTransportista,this.transportistaConstantesFunciones.activarapellidoTransportista,this,true,"apellidoTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarapellidoTransportista,this.transportistaConstantesFunciones.activarapellidoTransportista,this,true,"apellidoTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO));

		if(this.transportistaConstantesFunciones.mostrarnombre_completoTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarnombre_completoTransportista,this.transportistaConstantesFunciones.activarnombre_completoTransportista,this,true,"nombre_completoTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarnombre_completoTransportista,this.transportistaConstantesFunciones.activarnombre_completoTransportista,this,true,"nombre_completoTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_TELEFONO));

		if(this.transportistaConstantesFunciones.mostrartelefonoTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltartelefonoTransportista,this.transportistaConstantesFunciones.activartelefonoTransportista,this,true,"telefonoTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltartelefonoTransportista,this.transportistaConstantesFunciones.activartelefonoTransportista,this,true,"telefonoTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_DIRECCION));

		if(this.transportistaConstantesFunciones.mostrardireccionTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltardireccionTransportista,this.transportistaConstantesFunciones.activardireccionTransportista,this,true,"direccionTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltardireccionTransportista,this.transportistaConstantesFunciones.activardireccionTransportista,this,true,"direccionTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_IDCLIENTE));

		if(this.transportistaConstantesFunciones.mostrarid_clienteTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_IDCLIENTE,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ClienteTableCell(this.clientesForeignKey,this.transportistaConstantesFunciones.resaltarid_clienteTransportista,this,this.transportistaConstantesFunciones.activarid_clienteTransportista));
			tableColumn.setCellEditor(new ClienteTableCell(this.clientesForeignKey,this.transportistaConstantesFunciones.resaltarid_clienteTransportista,this,this.transportistaConstantesFunciones.activarid_clienteTransportista,true,"id_clienteTransportista","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,75);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_PLACA));

		if(this.transportistaConstantesFunciones.mostrarplacaTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_PLACA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarplacaTransportista,this.transportistaConstantesFunciones.activarplacaTransportista,this,true,"placaTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarplacaTransportista,this.transportistaConstantesFunciones.activarplacaTransportista,this,true,"placaTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_NUMERO));

		if(this.transportistaConstantesFunciones.mostrarnumeroTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarnumeroTransportista,this.transportistaConstantesFunciones.activarnumeroTransportista,this,true,"numeroTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarnumeroTransportista,this.transportistaConstantesFunciones.activarnumeroTransportista,this,true,"numeroTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTransportista,TransportistaConstantesFunciones.LABEL_OBSERVACION));

		if(this.transportistaConstantesFunciones.mostrarobservacionTransportista && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TransportistaConstantesFunciones.LABEL_OBSERVACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.transportistaConstantesFunciones.resaltarobservacionTransportista,this.transportistaConstantesFunciones.activarobservacionTransportista,this,true,"observacionTransportista","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.transportistaConstantesFunciones.resaltarobservacionTransportista,this.transportistaConstantesFunciones.activarobservacionTransportista,this,true,"observacionTransportista","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TransportistaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.transportistaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			
		}
		
		if(true) {
			String sLabelColumnAccion="Editar";
			String sLabelColumnAccionEli="Eli";
			
			if(this.esParaBusquedaForeignKey)  {
				sLabelColumnAccion="Seleccionar";
				
				//LO MISMO QUE ELSE
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transportistaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transportistaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransportista.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.transportistaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.transportistaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTransportista.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTransportista && this.isPermisoGuardarCambiosTransportista) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.transportistaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.transportistaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosTransportista.addColumn(tableColumn);
				}
			}			
						
			
			/*
			tableColumn= new TableColumn();
			tableColumn.setIdentifier(Constantes2.S_SELECCIONAR);
			tableColumn.setHeaderValue(Constantes2.S_SELECCIONAR);
			tableColumn.setCellRenderer(new IdSeleccionarTableCell(this));
			tableColumn.setCellEditor(new IdSeleccionarTableCell(this));
			
			tableColumn.setPreferredWidth(30); 	 
			tableColumn.setWidth(30); 	 
			tableColumn.setMinWidth(30); 
			
			this.iWidthTableDefinicion+=30;
			
			this.jTableDatosTransportista.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransportista && this.isPermisoGuardarCambiosTransportista) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTransportista && this.isPermisoGuardarCambiosTransportista) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosTransportista.moveColumn(this.jTableDatosTransportista.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosTransportista.moveColumn(this.jTableDatosTransportista.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTransportista.moveColumn(this.jTableDatosTransportista.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTransportista.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTransportista.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTransportista,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTransportista.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTransportista.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTransportista.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTransportista.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTransportista.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
			private static final long serialVersionUID = 1L;
			
		    @Override
		    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
		        final Component component= super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		        //POR DEFECTO ES MEJOR, SE PIERDE DATOS AL SELECCIONAR BLANCO LETRAS BLANCAS
				component.setBackground(row % 2 == 0 ? FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR) : Funciones2.getColorFilaTabla2()); //FuncionesSwing.getColorTextFields(Constantes2.S_FONDOCONTROL_COLOR)
				component.setForeground(Funciones2.getColorTextoFilaTabla1());
				
				try {
		        	int iSize=-999;
		        	
		        	if(conTotales) {
						//FILA TOTALES OTRO COLOR, SI TABLA NO ES UNO A UNO
			        	if(Constantes.ISUSAEJBLOGICLAYER) {
							iSize=transportistaLogic.getTransportistas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=transportistas.size()-1;
						}
						
						if(iSize==row) {
							component.setBackground(Funciones2.getColorFilaTablaTotales());
						}
		        	}
					
					//POR EFICIENCIA NO UTILIZAR					
					//if (component instanceof JComponent) {
		            //    JComponent jcomponent = (JComponent) component;		                 		                
		        	//}				
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
		        return component;
		    }
		});
		*/
		
		//ESTA EN LA DEFINICION DE LA TABLA
		//this.jTableDatosTransportista.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTransportista.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTransportista();
			
		}
	}
	
	/*
	//COPY_TABLES
	/* FALTARIA RESOLVER:
	   1 SOLO SCROLL PARA 2 TABLAS
	   COPIA EXACTA DE COLUMNAS DE UNA TABLA A OTRA, SI SE MODIFICA TAMANIO TAMBIEN LA OTRA
	*/
	
	public void jButtonIdActionPerformed(ActionEvent evt,int rowIndex,Boolean esRelaciones,Boolean esEliminar) { 
		try {
			if(!esEliminar) {
				this.estaModoSeleccionar=true;
				
				//this.isEsNuevoTransportista=false;
					
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
				if(this.transportistaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTransportista==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransportista.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransportista.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.transportista.getsType().equals("DUPLICADO")
				   || this.transportista.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTransportista=true;
				
				} else {
					this.isEsNuevoTransportista=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.transportistaSessionBean.getEsGuardarRelacionado()) {
					if(this.transportista.getId()>=0 && !this.transportista.getIsNew()) {						
						this.isEsNuevoTransportista=false;
						
					} else {
						this.isEsNuevoTransportista=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTransportista(esRelaciones);						
				
				this.seleccionarTransportista(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.transportista.getId()<0) {
					this.isEsNuevoTransportista=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTransportista(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTransportista(evt,rowIndex);
				}	
				
				if(this.transportistaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Transportista: " + this.dDif); 
					}
				}								
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTransportista(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.transportista)) {
					if(this.transportista.getId()>0) {
						this.transportista.setIsDeleted(true);
						
						this.transportistasEliminados.add(this.transportista);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.transportistaLogic.getTransportistas().remove(this.transportista);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.transportistas.remove(this.transportista);				
					}
					
					
					((TransportistaModel) this.jTableDatosTransportista.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTransportista(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTransportista(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTransportista) {
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTransportista.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTransportista.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTransportista(this.transportista);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.transportistaConstantesFunciones.cargarid_empresaTransportista || this.transportistaConstantesFunciones.event_dependid_empresaTransportista) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.transportista.getid_empresa());
									//this.inicializarActualizarBindingTransportista(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(transportista.getEmpresa()!=null) {
							this.empresasForeignKey.add(transportista.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.transportista.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.transportistaConstantesFunciones.cargarid_sucursalTransportista || this.transportistaConstantesFunciones.event_dependid_sucursalTransportista) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.transportista.getid_sucursal());
									//this.inicializarActualizarBindingTransportista(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(transportista.getSucursal()!=null) {
							this.sucursalsForeignKey.add(transportista.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.transportista.getid_sucursal(),false,"Formulario");

					//TipoViaTransporte
					if(!this.transportistaConstantesFunciones.cargarid_tipo_via_transporteTransportista || this.transportistaConstantesFunciones.event_dependid_tipo_via_transporteTransportista) {
						//this.cargarCombosTipoViaTransportesForeignKeyLista(" where id="+this.transportista.getid_tipo_via_transporte());
									//this.inicializarActualizarBindingTransportista(false,false);
						this.tipoviatransportesForeignKey=new ArrayList<TipoViaTransporte>();

						if(transportista.getTipoViaTransporte()!=null) {
							this.tipoviatransportesForeignKey.add(transportista.getTipoViaTransporte());
						}

						this.addItemDefectoCombosForeignKeyTipoViaTransporte();
						this.cargarCombosFrameTipoViaTransportesForeignKey("Todos");
					}
					this.setActualTipoViaTransporteForeignKey(this.transportista.getid_tipo_via_transporte(),false,"Formulario");

					//Cliente
					if(!this.transportistaConstantesFunciones.cargarid_clienteTransportista || this.transportistaConstantesFunciones.event_dependid_clienteTransportista) {
						//this.cargarCombosClientesForeignKeyLista(" where id="+this.transportista.getid_cliente());
									//this.inicializarActualizarBindingTransportista(false,false);
						this.clientesForeignKey=new ArrayList<Cliente>();

						if(transportista.getCliente()!=null) {
							this.clientesForeignKey.add(transportista.getCliente());
						}

						this.addItemDefectoCombosForeignKeyCliente();
						this.cargarCombosFrameClientesForeignKey("Todos");
					}
					this.setActualClienteForeignKey(this.transportista.getid_cliente(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTransportista("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTransportista(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTransportista() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransportista(Transportista transportista) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTransportista(transportista,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTransportista(Transportista transportista,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTransportista(transportista);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTransportista(transportista,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTransportista(transportista);
	}
	
	public void setVariablesObjetoActualToFormularioTransportista(Transportista transportista) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setText(transportista.getId().toString());
			this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setText(transportista.getidentificacion());
			this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setText(transportista.getruc());
			this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setText(transportista.getnombre());
			this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setText(transportista.getapellido());
			this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setText(transportista.getnombre_completo());
			this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setText(transportista.gettelefono());
			this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setText(transportista.getdireccion());
			this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setText(transportista.getplaca());
			this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setText(transportista.getnumero());
			this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setText(transportista.getobservacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Transportista transportistaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,transportistaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Transportista transportistaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				transportistaLocal=this.transportista;
			} else {
				transportistaLocal=this.transportistaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(transportistaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTransportista(transportistaLocal,true);
					
					if(transportistaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(transportistaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(transportistaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTransportista(Transportista transportista,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransportista(transportista,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTransportista(transportista);
	}
	
	public void setVariablesFormularioToObjetoActualTransportista(Transportista transportista,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTransportista(transportista,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTransportista(Transportista transportista,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.getText()==null || this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.getText()=="" || this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.getText()=="Id") {
				this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setText("0");
			}

			if(conColumnasBase) {transportista.setId(Long.parseLong(this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelIdTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setidentificacion(this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_IDENTIFICACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelidentificacionTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setruc(this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_RUC+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelrucTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setnombre(this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelnombreTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setapellido(this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_APELLIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelapellidoTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setnombre_completo(this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelnombre_completoTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.settelefono(this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabeltelefonoTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setdireccion(this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabeldireccionTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setplaca(this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_PLACA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelplacaTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setnumero(this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelnumeroTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			transportista.setobservacion(this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TransportistaConstantesFunciones.LABEL_OBSERVACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTransportista.jLabelobservacionTransportista,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTransportista(Transportista transportistaBean,Transportista transportista,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && transportistaBean.getid_tipo_via_transporte()!=null && !transportistaBean.getid_tipo_via_transporte().equals(-1L))) {transportista.setid_tipo_via_transporte(transportistaBean.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && transportistaBean.getid_cliente()!=null && !transportistaBean.getid_cliente().equals(-1L))) {transportista.setid_cliente(transportistaBean.getid_cliente());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTransportista(Transportista transportistaOrigen,Transportista transportista,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transportistaOrigen.getId()!=null && !transportistaOrigen.getId().equals(0L))) {transportista.setId(transportistaOrigen.getId());}}
			if(conDefault || (!conDefault && transportistaOrigen.getid_tipo_via_transporte()!=null && !transportistaOrigen.getid_tipo_via_transporte().equals(-1L))) {transportista.setid_tipo_via_transporte(transportistaOrigen.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && transportistaOrigen.getidentificacion()!=null && !transportistaOrigen.getidentificacion().equals(""))) {transportista.setidentificacion(transportistaOrigen.getidentificacion());}
			if(conDefault || (!conDefault && transportistaOrigen.getruc()!=null && !transportistaOrigen.getruc().equals(""))) {transportista.setruc(transportistaOrigen.getruc());}
			if(conDefault || (!conDefault && transportistaOrigen.getnombre()!=null && !transportistaOrigen.getnombre().equals(""))) {transportista.setnombre(transportistaOrigen.getnombre());}
			if(conDefault || (!conDefault && transportistaOrigen.getapellido()!=null && !transportistaOrigen.getapellido().equals(""))) {transportista.setapellido(transportistaOrigen.getapellido());}
			if(conDefault || (!conDefault && transportistaOrigen.getnombre_completo()!=null && !transportistaOrigen.getnombre_completo().equals(""))) {transportista.setnombre_completo(transportistaOrigen.getnombre_completo());}
			if(conDefault || (!conDefault && transportistaOrigen.gettelefono()!=null && !transportistaOrigen.gettelefono().equals(""))) {transportista.settelefono(transportistaOrigen.gettelefono());}
			if(conDefault || (!conDefault && transportistaOrigen.getdireccion()!=null && !transportistaOrigen.getdireccion().equals(""))) {transportista.setdireccion(transportistaOrigen.getdireccion());}
			if(conDefault || (!conDefault && transportistaOrigen.getid_cliente()!=null && !transportistaOrigen.getid_cliente().equals(-1L))) {transportista.setid_cliente(transportistaOrigen.getid_cliente());}
			if(conDefault || (!conDefault && transportistaOrigen.getplaca()!=null && !transportistaOrigen.getplaca().equals(""))) {transportista.setplaca(transportistaOrigen.getplaca());}
			if(conDefault || (!conDefault && transportistaOrigen.getnumero()!=null && !transportistaOrigen.getnumero().equals(""))) {transportista.setnumero(transportistaOrigen.getnumero());}
			if(conDefault || (!conDefault && transportistaOrigen.getobservacion()!=null && !transportistaOrigen.getobservacion().equals(""))) {transportista.setobservacion(transportistaOrigen.getobservacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransportista(Transportista transportista) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setText(transportista.getId().toString());
			this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setText(transportista.getidentificacion());
			this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setText(transportista.getruc());
			this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setText(transportista.getnombre());
			this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setText(transportista.getapellido());
			this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setText(transportista.getnombre_completo());
			this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setText(transportista.gettelefono());
			this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setText(transportista.getdireccion());
			this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setText(transportista.getplaca());
			this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setText(transportista.getnumero());
			this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setText(transportista.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTransportista(TransportistaBean transportistaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setText(transportistaBean.getId().toString());
			this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setText(transportistaBean.getidentificacion());
			this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setText(transportistaBean.getruc());
			this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setText(transportistaBean.getnombre());
			this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setText(transportistaBean.getapellido());
			this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setText(transportistaBean.getnombre_completo());
			this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setText(transportistaBean.gettelefono());
			this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setText(transportistaBean.getdireccion());
			this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setText(transportistaBean.getplaca());
			this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setText(transportistaBean.getnumero());
			this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setText(transportistaBean.getobservacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTransportista(TransportistaParameterReturnGeneral transportistaReturnGeneral,TransportistaBean transportistaBean,Boolean conDefault) throws Exception { 
		try {
			Transportista transportistaLocal=new Transportista();
			
			transportistaLocal=transportistaReturnGeneral.getTransportista();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && transportistaLocal.getId()!=null && !transportistaLocal.getId().equals(0L))) {transportistaBean.setId(transportistaLocal.getId());}}
			if(conDefault || (!conDefault && transportistaLocal.getid_tipo_via_transporte()!=null && !transportistaLocal.getid_tipo_via_transporte().equals(-1L))) {transportistaBean.setid_tipo_via_transporte(transportistaLocal.getid_tipo_via_transporte());}
			if(conDefault || (!conDefault && transportistaLocal.getidentificacion()!=null && !transportistaLocal.getidentificacion().equals(""))) {transportistaBean.setidentificacion(transportistaLocal.getidentificacion());}
			if(conDefault || (!conDefault && transportistaLocal.getruc()!=null && !transportistaLocal.getruc().equals(""))) {transportistaBean.setruc(transportistaLocal.getruc());}
			if(conDefault || (!conDefault && transportistaLocal.getnombre()!=null && !transportistaLocal.getnombre().equals(""))) {transportistaBean.setnombre(transportistaLocal.getnombre());}
			if(conDefault || (!conDefault && transportistaLocal.getapellido()!=null && !transportistaLocal.getapellido().equals(""))) {transportistaBean.setapellido(transportistaLocal.getapellido());}
			if(conDefault || (!conDefault && transportistaLocal.getnombre_completo()!=null && !transportistaLocal.getnombre_completo().equals(""))) {transportistaBean.setnombre_completo(transportistaLocal.getnombre_completo());}
			if(conDefault || (!conDefault && transportistaLocal.gettelefono()!=null && !transportistaLocal.gettelefono().equals(""))) {transportistaBean.settelefono(transportistaLocal.gettelefono());}
			if(conDefault || (!conDefault && transportistaLocal.getdireccion()!=null && !transportistaLocal.getdireccion().equals(""))) {transportistaBean.setdireccion(transportistaLocal.getdireccion());}
			if(conDefault || (!conDefault && transportistaLocal.getid_cliente()!=null && !transportistaLocal.getid_cliente().equals(-1L))) {transportistaBean.setid_cliente(transportistaLocal.getid_cliente());}
			if(conDefault || (!conDefault && transportistaLocal.getplaca()!=null && !transportistaLocal.getplaca().equals(""))) {transportistaBean.setplaca(transportistaLocal.getplaca());}
			if(conDefault || (!conDefault && transportistaLocal.getnumero()!=null && !transportistaLocal.getnumero().equals(""))) {transportistaBean.setnumero(transportistaLocal.getnumero());}
			if(conDefault || (!conDefault && transportistaLocal.getobservacion()!=null && !transportistaLocal.getobservacion().equals(""))) {transportistaBean.setobservacion(transportistaLocal.getobservacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTransportistaGenerico(Long idTransportistaSeleccionado,JComboBox jComboBoxTransportista,List<Transportista> transportistasLocal)throws Exception {
		try {
			Transportista  transportistaTemp=null;

			for(Transportista transportistaAux:transportistasLocal) {
				if(transportistaAux.getId()!=null && transportistaAux.getId().equals(idTransportistaSeleccionado)) {
					transportistaTemp=transportistaAux;
					break;
				}
			}

			jComboBoxTransportista.setSelectedItem(transportistaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTransportistaGenerico(JComboBox jComboBoxTransportista,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
		try {
			//GLOBAL(id_empresa,id_sucursal,id_ejercicio)
			//BASICO(normal)
			//CON_BUSQUEDA(Permite buscar Fk)
			
			String sKeyStrokeName="";
			KeyStroke keyStrokeControl=null;
			
			if(!sTipoBusqueda.equals("GLOBAL")) {
				
				//BUSCAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSCAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSCAR");
				
				jComboBoxTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransportista.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTransportista.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTransportista.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTransportista.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTransportista.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTransportista.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
				}
				//CON_BUSQUEDA
				
				
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	@SuppressWarnings("rawtypes")
	public void setHotKeysComboBoxGenerico(JComboBox jComboBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
			if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
				jComboBox.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			} else {
				jComboBox.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
				jComboBox.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
			}
		}
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextFieldGenerico(JTextField jTextField,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextField.addFocusListener(new TextFieldFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		jTextField.addActionListener(new TextFieldActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJTextAreaGenerico(JTextArea jTextArea,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jTextArea.addFocusListener(new TextAreaFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jTextArea.addActionListener(new TextAreaActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJLabelGenerico(JLabel jLabel,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jLabel.addFocusListener(new LabelFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//NO EXISTE
		//jLabel.addActionListener(new LabelActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJCheckBoxGenerico(JCheckBox jCheckBox,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jCheckBox.addFocusListener(new CheckBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
		
		//SI SE DEFINE AL CAMBIAR VALOR, ESTE NUEVO VALOR NO SE ENVIA AL EVENTO
		//jCheckBox.addItemListener(new CheckBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJDateChooserGenerico(JDateChooser jDateChooser,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		FuncionesSwing.addDateListener(jDateChooser, jInternalFrameBase, sNombreHotKeyAbstractAction);
	}
	
	//PARA INICIALIZAR CONTROLES DE TABLA
	public void setHotKeysJButtonGenerico(JButton jButton,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda) {
		jButton.addActionListener(new ButtonActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
	}
	
	public void jButtonRelacionActionPerformed(String sTipo,ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado) {
		//ABRIR RELACIONES
		try {
			
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transportista=(Transportista) transportistaLogic.getTransportistas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transportista =(Transportista) transportistas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!transportista.getIsNew() && !transportista.getIsChanged() && !transportista.getIsDeleted()) {
				sDescripcion=transportista.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=transportista.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!transportista.getIsNew() && !transportista.getIsChanged() && !transportista.getIsDeleted()) {
				sDescripcion=transportista.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=transportista.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TipoViaTransporte")) {
			//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
			if(!transportista.getIsNew() && !transportista.getIsChanged() && !transportista.getIsDeleted()) {
				sDescripcion=transportista.gettipoviatransporte_descripcion();
			} else {
				//sDescripcion=this.getActualTipoViaTransporteForeignKeyDescripcion((Long)value);
				sDescripcion=transportista.gettipoviatransporte_descripcion();
			}
		}

		if(sTipo.equals("Cliente")) {
			//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
			if(!transportista.getIsNew() && !transportista.getIsChanged() && !transportista.getIsDeleted()) {
				sDescripcion=transportista.getcliente_descripcion();
			} else {
				//sDescripcion=this.getActualClienteForeignKeyDescripcion((Long)value);
				sDescripcion=transportista.getcliente_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Transportista transportistaRow=new Transportista();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transportistaRow=(Transportista) transportistaLogic.getTransportistas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			transportistaRow=(Transportista) transportistas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTransportista(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTransportista.setVisible((this.isVisibilidadCeldaNuevoTransportista && this.isPermisoNuevoTransportista));			
			this.jButtonDuplicarTransportista.setVisible((this.isVisibilidadCeldaDuplicarTransportista && this.isPermisoDuplicarTransportista));			
			this.jButtonCopiarTransportista.setVisible((this.isVisibilidadCeldaCopiarTransportista && this.isPermisoCopiarTransportista));
			this.jButtonVerFormTransportista.setVisible((this.isVisibilidadCeldaVerFormTransportista && this.isPermisoVerFormTransportista));
			
			this.jButtonAbrirOrderByTransportista.setVisible((this.isVisibilidadCeldaOrdenTransportista && this.isPermisoOrdenTransportista));			
			
			this.jButtonNuevoRelacionesTransportista.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransportista && this.isPermisoNuevoTransportista));			
			this.jButtonNuevoGuardarCambiosTransportista.setVisible((this.isVisibilidadCeldaNuevoTransportista && this.isPermisoNuevoTransportista && this.isPermisoGuardarCambiosTransportista));
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.jInternalFrameDetalleFormTransportista.jButtonModificarTransportista.setVisible((this.isVisibilidadCeldaModificarTransportista && this.isPermisoActualizarTransportista));	
			this.jInternalFrameDetalleFormTransportista.jButtonActualizarTransportista.setVisible((this.isVisibilidadCeldaActualizarTransportista && this.isPermisoActualizarTransportista));	
			this.jInternalFrameDetalleFormTransportista.jButtonEliminarTransportista.setVisible((this.isVisibilidadCeldaEliminarTransportista && this.isPermisoEliminarTransportista));
			this.jInternalFrameDetalleFormTransportista.jButtonCancelarTransportista.setVisible(this.isVisibilidadCeldaCancelarTransportista);							
			this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.setVisible((this.isVisibilidadCeldaGuardarTransportista && this.isPermisoGuardarCambiosTransportista));			
			
			}
						
			this.jButtonGuardarCambiosTablaTransportista.setVisible((this.isVisibilidadCeldaGuardarCambiosTransportista && this.isPermisoGuardarCambiosTransportista));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTransportista.setVisible((this.isVisibilidadCeldaNuevoTransportista && this.isPermisoNuevoTransportista));						
			this.jButtonDuplicarToolBarTransportista.setVisible((this.isVisibilidadCeldaDuplicarTransportista && this.isPermisoDuplicarTransportista));						
			this.jButtonCopiarToolBarTransportista.setVisible((this.isVisibilidadCeldaCopiarTransportista && this.isPermisoCopiarTransportista));			
			this.jButtonVerFormToolBarTransportista.setVisible((this.isVisibilidadCeldaVerFormTransportista && this.isPermisoVerFormTransportista));			
			this.jButtonAbrirOrderByToolBarTransportista.setVisible((this.isVisibilidadCeldaOrdenTransportista && this.isPermisoOrdenTransportista));
			this.jButtonNuevoRelacionesToolBarTransportista.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransportista && this.isPermisoNuevoTransportista));			
			this.jButtonNuevoGuardarCambiosToolBarTransportista.setVisible((this.isVisibilidadCeldaNuevoTransportista && this.isPermisoNuevoTransportista && this.isPermisoGuardarCambiosTransportista));			
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.jInternalFrameDetalleFormTransportista.jButtonModificarToolBarTransportista.setVisible((this.isVisibilidadCeldaModificarTransportista && this.isPermisoActualizarTransportista));	
			this.jInternalFrameDetalleFormTransportista.jButtonActualizarToolBarTransportista.setVisible((this.isVisibilidadCeldaActualizarTransportista  && this.isPermisoActualizarTransportista));	
			this.jInternalFrameDetalleFormTransportista.jButtonEliminarToolBarTransportista.setVisible((this.isVisibilidadCeldaEliminarTransportista && this.isPermisoEliminarTransportista));
			this.jInternalFrameDetalleFormTransportista.jButtonCancelarToolBarTransportista.setVisible(this.isVisibilidadCeldaCancelarTransportista);				
			this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosToolBarTransportista.setVisible((this.isVisibilidadCeldaGuardarTransportista && this.isPermisoGuardarCambiosTransportista));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTransportista.setVisible((this.isVisibilidadCeldaGuardarCambiosTransportista && this.isPermisoGuardarCambiosTransportista));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTransportista.setVisible((this.isVisibilidadCeldaNuevoTransportista && this.isPermisoNuevoTransportista));			
			this.jMenuItemDuplicarTransportista.setVisible((this.isVisibilidadCeldaDuplicarTransportista && this.isPermisoDuplicarTransportista));			
			this.jMenuItemCopiarTransportista.setVisible((this.isVisibilidadCeldaCopiarTransportista && this.isPermisoCopiarTransportista));			
			this.jMenuItemVerFormTransportista.setVisible((this.isVisibilidadCeldaVerFormTransportista && this.isPermisoVerFormTransportista));			
			this.jMenuItemAbrirOrderByTransportista.setVisible((this.isVisibilidadCeldaOrdenTransportista && this.isPermisoOrdenTransportista));			
			//this.jMenuItemMostrarOcultarTransportista.setVisible((this.isVisibilidadCeldaOrdenTransportista && this.isPermisoOrdenTransportista));
			this.jMenuItemDetalleAbrirOrderByTransportista.setVisible((this.isVisibilidadCeldaOrdenTransportista && this.isPermisoOrdenTransportista));			
			//this.jMenuItemDetalleMostrarOcultarTransportista.setVisible((this.isVisibilidadCeldaOrdenTransportista && this.isPermisoOrdenTransportista));			
			this.jMenuItemNuevoRelacionesTransportista.setVisible((this.isVisibilidadCeldaNuevoRelacionesTransportista && this.isPermisoNuevoTransportista));			
			this.jMenuItemNuevoGuardarCambiosTransportista.setVisible((this.isVisibilidadCeldaNuevoTransportista && this.isPermisoNuevoTransportista && this.isPermisoGuardarCambiosTransportista));									
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.jInternalFrameDetalleFormTransportista.jMenuItemModificarTransportista.setVisible((this.isVisibilidadCeldaModificarTransportista && this.isPermisoActualizarTransportista));	
			this.jInternalFrameDetalleFormTransportista.jMenuItemActualizarTransportista.setVisible((this.isVisibilidadCeldaActualizarTransportista && this.isPermisoActualizarTransportista));	
			this.jInternalFrameDetalleFormTransportista.jMenuItemEliminarTransportista.setVisible((this.isVisibilidadCeldaEliminarTransportista && this.isPermisoEliminarTransportista));
			this.jInternalFrameDetalleFormTransportista.jMenuItemCancelarTransportista.setVisible(this.isVisibilidadCeldaCancelarTransportista);				
			}
			
			this.jMenuItemGuardarCambiosTransportista.setVisible((this.isVisibilidadCeldaGuardarTransportista && this.isPermisoGuardarCambiosTransportista));						
			this.jMenuItemGuardarCambiosTablaTransportista.setVisible((this.isVisibilidadCeldaGuardarCambiosTransportista && this.isPermisoGuardarCambiosTransportista));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTransportista=this.jButtonNuevoTransportista.isVisible();
			this.isVisibilidadCeldaDuplicarTransportista=this.jButtonDuplicarTransportista.isVisible();
			this.isVisibilidadCeldaCopiarTransportista=this.jButtonCopiarTransportista.isVisible();
			this.isVisibilidadCeldaVerFormTransportista=this.jButtonVerFormTransportista.isVisible();
			
			this.isVisibilidadCeldaOrdenTransportista=this.jButtonAbrirOrderByTransportista.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTransportista=this.jButtonNuevoRelacionesTransportista.isVisible();
			this.isVisibilidadCeldaModificarTransportista=this.jButtonModificarTransportista.isVisible();
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.isVisibilidadCeldaActualizarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonActualizarTransportista.isVisible();
			this.isVisibilidadCeldaEliminarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonEliminarTransportista.isVisible();
			this.isVisibilidadCeldaCancelarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonCancelarTransportista.isVisible();
			this.isVisibilidadCeldaGuardarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTransportista=this.jButtonGuardarCambiosTablaTransportista.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTransportista=this.jButtonNuevoToolBarTransportista.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransportista=this.jButtonNuevoRelacionesToolBarTransportista.isVisible();
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.isVisibilidadCeldaModificarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonModificarToolBarTransportista.isVisible();
			this.isVisibilidadCeldaActualizarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonActualizarToolBarTransportista.isVisible();
			this.isVisibilidadCeldaEliminarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonEliminarToolBarTransportista.isVisible();
			this.isVisibilidadCeldaCancelarTransportista=this.jInternalFrameDetalleFormTransportista.jButtonCancelarToolBarTransportista.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransportista=this.jButtonGuardarCambiosToolBarTransportista.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransportista=this.jButtonGuardarCambiosTablaToolBarTransportista.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTransportista=this.jMenuItemNuevoTransportista.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTransportista=this.jMenuItemNuevoRelacionesTransportista.isVisible();
			
			if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.isVisibilidadCeldaModificarTransportista=this.jInternalFrameDetalleFormTransportista.jMenuItemModificarTransportista.isVisible();
			this.isVisibilidadCeldaActualizarTransportista=this.jInternalFrameDetalleFormTransportista.jMenuItemActualizarTransportista.isVisible();
			this.isVisibilidadCeldaEliminarTransportista=this.jInternalFrameDetalleFormTransportista.jMenuItemEliminarTransportista.isVisible();
			this.isVisibilidadCeldaCancelarTransportista=this.jInternalFrameDetalleFormTransportista.jMenuItemCancelarTransportista.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTransportista=this.jMenuItemGuardarCambiosTransportista.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTransportista=this.jMenuItemGuardarCambiosTablaTransportista.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTransportista(Boolean esInicializar) {
		if(TransportistaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.transportistaSessionBean.getConGuardarRelaciones()) {
				//if(this.transportistaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTransportista();
			}
			
			this.inicializarActualizarBindingBotonesManualTransportista(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTransportista() {
		this.jButtonNuevoTransportista.setVisible(this.isPermisoNuevoTransportista);			
		this.jButtonDuplicarTransportista.setVisible(this.isPermisoDuplicarTransportista);			
		this.jButtonCopiarTransportista.setVisible(this.isPermisoCopiarTransportista);			
		this.jButtonVerFormTransportista.setVisible(this.isPermisoVerFormTransportista);			
		
		this.jButtonAbrirOrderByTransportista.setVisible(this.isPermisoOrdenTransportista);					
		
		this.jButtonNuevoRelacionesTransportista.setVisible(this.isPermisoNuevoTransportista);			
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonModificarTransportista.setVisible(this.isPermisoActualizarTransportista);	
			this.jInternalFrameDetalleFormTransportista.jButtonActualizarTransportista.setVisible(this.isPermisoActualizarTransportista);	
			this.jInternalFrameDetalleFormTransportista.jButtonEliminarTransportista.setVisible(this.isPermisoEliminarTransportista);
			this.jInternalFrameDetalleFormTransportista.jButtonCancelarTransportista.setVisible(this.isVisibilidadCeldaCancelarTransportista);						
			this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.setVisible(this.isPermisoGuardarCambiosTransportista);							
		}
		
		this.jButtonGuardarCambiosTablaTransportista.setVisible(this.isPermisoActualizarTransportista);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTransportista() {
		this.jInternalFrameDetalleFormTransportista.jButtonModificarTransportista.setVisible(this.isPermisoActualizarTransportista);	
		this.jInternalFrameDetalleFormTransportista.jButtonActualizarTransportista.setVisible(this.isPermisoActualizarTransportista);	
		this.jInternalFrameDetalleFormTransportista.jButtonEliminarTransportista.setVisible(this.isPermisoEliminarTransportista);
		this.jInternalFrameDetalleFormTransportista.jButtonCancelarTransportista.setVisible(this.isVisibilidadCeldaCancelarTransportista);							
		this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.setVisible((this.isVisibilidadCeldaGuardarTransportista && this.isPermisoGuardarCambiosTransportista));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTransportista() {
		if(TransportistaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTransportista();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTransportista() {
	}
	
	public void jTableDatosTransportistaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTransportista(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.transportista.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTransportistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTransportista(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransportista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransportista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.transportistaLogic.getConnexion());

				if(this.transportista.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.transportista.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransportista=(TitledBorder)this.jScrollPanelDatosTransportista.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTransportista.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.transportista.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTransportistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTransportista(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransportista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransportista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.transportistaLogic.getConnexion());

				if(this.transportista.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.transportista.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransportista=(TitledBorder)this.jScrollPanelDatosTransportista.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTransportista.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.transportista.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_tipo_via_transporteTransportistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisotipoviatransporte=true;

			idTienePermisotipoviatransporte=this.tienePermisosUsuarioEnPaginaWebTransportista(TipoViaTransporteConstantesFunciones.CLASSNAME);

			if(idTienePermisotipoviatransporte) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransportista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransportista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);

				this.tipoviatransporteBeanSwingJInternalFrame=new TipoViaTransporteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.tipoviatransporteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.tipoviatransporteBeanSwingJInternalFrame.getTipoViaTransporteLogic().setConnexion(this.transportistaLogic.getConnexion());

				if(this.transportista.getid_tipo_via_transporte()!=null) {
					this.tipoviatransporteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.tipoviatransporteBeanSwingJInternalFrame.setIdActual(this.transportista.getid_tipo_via_transporte());
					this.tipoviatransporteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.tipoviatransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaTipoViaTransporte();
				}

				JInternalFrameBase jinternalFrame =this.tipoviatransporteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransportista=(TitledBorder)this.jScrollPanelDatosTransportista.getBorder();
				TitledBorder titledBordertipoviatransporte=(TitledBorder)this.tipoviatransporteBeanSwingJInternalFrame.jScrollPanelDatosTipoViaTransporte.getBorder();

				titledBordertipoviatransporte.setTitle(titledBorderTransportista.getTitle() + " -> Tipo Via Transporte");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_tipo_via_transporteTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getid_tipo_via_transporte()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_tipo_via_transporte = "+this.transportista.getid_tipo_via_transporte().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonidentificacionTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getidentificacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where identificacion like '%"+this.transportista.getidentificacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonrucTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getruc()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ruc like '%"+this.transportista.getruc()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.transportista.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonapellidoTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getapellido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where apellido like '%"+this.transportista.getapellido()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_completoTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getnombre_completo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_completo like '%"+this.transportista.getnombre_completo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.transportista.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.transportista.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_clienteTransportistaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.clienteBeanSwingJInternalFrame.sTipoBusqueda="Cliente";

			if(!this.sFinalQueryGeneral_cliente.equals("")) {
				this.clienteBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_cliente);
				this.clienteBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.clienteBeanSwingJInternalFrame.procesarBusqueda(this.clienteBeanSwingJInternalFrame.sAccionBusqueda);
				this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingCliente(false);
			}

			if(!this.sFinalQueryComboCliente.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderTransportista=null;
			TitledBorder titledBordercliente=null;

			if(!this.jScrollPanelDatosTransportista.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderTransportista=(TitledBorder)this.jScrollPanelDatosTransportista.getBorder();
				titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderTransportista.getTitle() + " -> Cliente");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_clienteTransportistaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisocliente=true;

			idTienePermisocliente=this.tienePermisosUsuarioEnPaginaWebTransportista(ClienteConstantesFunciones.CLASSNAME);

			if(idTienePermisocliente) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTransportista.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTransportista.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);

				this.clienteBeanSwingJInternalFrame=new ClienteBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.clienteBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.clienteBeanSwingJInternalFrame.getClienteLogic().setConnexion(this.transportistaLogic.getConnexion());

				if(this.transportista.getid_cliente()!=null) {
					this.clienteBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.clienteBeanSwingJInternalFrame.setIdActual(this.transportista.getid_cliente());
					this.clienteBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.clienteBeanSwingJInternalFrame.inicializarActualizarBindingTablaCliente();
				}

				JInternalFrameBase jinternalFrame =this.clienteBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTransportista=(TitledBorder)this.jScrollPanelDatosTransportista.getBorder();
				TitledBorder titledBordercliente=(TitledBorder)this.clienteBeanSwingJInternalFrame.jScrollPanelDatosCliente.getBorder();

				titledBordercliente.setTitle(titledBorderTransportista.getTitle() + " -> Cliente");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_clienteTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getid_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_cliente = "+this.transportista.getid_cliente().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonplacaTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getplaca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where placa like '%"+this.transportista.getplaca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero like '%"+this.transportista.getnumero()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonobservacionTransportistaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTransportista.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTransportista(this.gettransportista(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.transportista==null) {
						this.transportista = new Transportista();
					}

					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);
				}

				if(this.transportista.getobservacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where observacion like '%"+this.transportista.getobservacion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTransportista(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonBusquedaPorIdentificacionTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasBusquedaPorIdentificacion();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorNombreCompletoTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasBusquedaPorNombreCompleto();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorPlacaTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasBusquedaPorPlaca();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorRucTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasBusquedaPorRuc();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonBusquedaPorTelefonoTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasBusquedaPorTelefono();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdClienteTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasFK_IdCliente();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasFK_IdEmpresa();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasFK_IdSucursal();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTipoViaTransporteTransportistaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTransportista(false,false);

			this.getTransportistasFK_IdTipoViaTransporte();

			this.inicializarActualizarBindingTransportista(false);

			//if(TransportistaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTransportista(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.transportistaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTransportista() {
		if(this.jInternalFrameDetalleFormTransportista!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
			this.jInternalFrameDetalleFormTransportista.setVisible(false);	    			
			this.jInternalFrameDetalleFormTransportista.dispose();
			this.jInternalFrameDetalleFormTransportista=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTransportista!=null) {
			this.jInternalFrameReporteDinamicoTransportista.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTransportista.dispose();
			this.jInternalFrameReporteDinamicoTransportista=null;
		}
		
		if(this.jInternalFrameImportacionTransportista!=null) {
			this.jInternalFrameImportacionTransportista.setVisible(false);	    			
			this.jInternalFrameImportacionTransportista.dispose();
			this.jInternalFrameImportacionTransportista=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTransportista();
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTransportista")) {
				jButtonDuplicarTransportistaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTransportista")) {
				jButtonCopiarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTransportista")) {
				jButtonVerFormTransportistaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTransportista")) {
				jButtonDuplicarTransportistaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTransportista")) {
				jButtonDuplicarTransportistaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTransportista")) {
				jButtonModificarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTransportista")) {
				jButtonModificarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTransportista")) {
				jButtonModificarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTransportista")) {
				jButtonActualizarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTransportista")) {
				jButtonActualizarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTransportista")) {
				jButtonActualizarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTransportista")) {
				jButtonEliminarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTransportista")) {
				jButtonEliminarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTransportista")) {
				jButtonEliminarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTransportista")) {
				jButtonCancelarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTransportista")) {
				jButtonCancelarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTransportista")) {
				jButtonCancelarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTransportista")) {
				jButtonCerrarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTransportista")) {
				jButtonCerrarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTransportista")) {
				jButtonCerrarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTransportista")) {
				jButtonMostrarOcultarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTransportista")) {
				jButtonCancelarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTransportista")) {
				jButtonCopiarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTransportista")) {
				jButtonVerFormTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTransportista")) {
				jButtonCopiarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTransportista")) {
				jButtonVerFormTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTransportista")) {
				jButtonRecargarInformacionTransportistaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTransportista")) {
				jButtonRecargarInformacionTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTransportista")) {
				jButtonRecargarInformacionTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTransportista")) {
				jButtonAnterioresTransportistaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTransportista")) {
				jButtonAnterioresTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTransportista")) {
				jButtonAnterioresTransportistaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTransportista")) {
				jButtonSiguientesTransportistaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTransportista")) {
				jButtonSiguientesTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTransportista")) {
				jButtonSiguientesTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTransportista") || sTipo.equals("MenuItemDetalleAbrirOrderByTransportista")) {
				jButtonAbrirOrderByTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTransportista") || sTipo.equals("MenuItemDetalleMostrarOcultarTransportista")) {
				jButtonMostrarOcultarTransportistaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTransportista")) {
				jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTransportista")) {
				jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTransportista")) {
				jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTransportista")) {
				jButtonCerrarReporteDinamicoTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTransportista")) {
				jButtonGenerarReporteDinamicoTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTransportista")) {
				
				jButtonGenerarExcelReporteDinamicoTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTransportista")) {
				jButtonCerrarImportacionTransportistaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTransportista")) {
				
				jButtonGenerarImportacionTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTransportista")) {
				
				jButtonAbrirImportacionTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTransportista")) {
				jComboBoxTiposAccionesTransportistaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTransportista")) {
				jComboBoxTiposRelacionesTransportistaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTransportista")) {
				jComboBoxTiposAccionesTransportistaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTransportista")) {
				
				jComboBoxTiposSeleccionarTransportistaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTransportista")) {
				jTextFieldValorCampoGeneralTransportistaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTransportista")) {
				jButtonAbrirOrderByTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTransportista")) {
				jButtonAbrirOrderByTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTransportista")) {
				jButtonCerrarOrderByTransportistaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransportistaBusqueda")) {
				this.jButtonidTransportistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransportistaUpdate")) {
				this.jButtonid_empresaTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransportistaBusqueda")) {
				this.jButtonid_empresaTransportistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTransportistaUpdate")) {
				this.jButtonid_sucursalTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTransportistaBusqueda")) {
				this.jButtonid_sucursalTransportistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransportistaUpdate")) {
				this.jButtonid_tipo_via_transporteTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransportistaBusqueda")) {
				this.jButtonid_tipo_via_transporteTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionTransportistaBusqueda")) {
				this.jButtonidentificacionTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucTransportistaBusqueda")) {
				this.jButtonrucTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransportistaBusqueda")) {
				this.jButtonnombreTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoTransportistaBusqueda")) {
				this.jButtonapellidoTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoTransportistaBusqueda")) {
				this.jButtonnombre_completoTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoTransportistaBusqueda")) {
				this.jButtontelefonoTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionTransportistaBusqueda")) {
				this.jButtondireccionTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteTransportista")) {
				this.jButtonid_clienteTransportistaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteTransportistaUpdate")) {
				this.jButtonid_clienteTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteTransportistaBusqueda")) {
				this.jButtonid_clienteTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("placaTransportistaBusqueda")) {
				this.jButtonplacaTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroTransportistaBusqueda")) {
				this.jButtonnumeroTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionTransportistaBusqueda")) {
				this.jButtonobservacionTransportistaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_clienteTransportista")) {
				this.jButtonid_clienteTransportistaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("BusquedaPorIdentificacionTransportista")) {
				this.jButtonBusquedaPorIdentificacionTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorNombreCompletoTransportista")) {
				this.jButtonBusquedaPorNombreCompletoTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorPlacaTransportista")) {
				this.jButtonBusquedaPorPlacaTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorRucTransportista")) {
				this.jButtonBusquedaPorRucTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("BusquedaPorTelefonoTransportista")) {
				this.jButtonBusquedaPorTelefonoTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdClienteTransportista")) {
				this.jButtonFK_IdClienteTransportistaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdTipoViaTransporteTransportista")) {
				this.jButtonFK_IdTipoViaTransporteTransportistaActionPerformed(evt);
			}
			
			;
			
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTransportista();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				JTextField jTextField=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				if(containerParent!=null && containerParent.getClass().equals(JTableMe.class)) {
					esControlTabla=true;
				}
						
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Transportista transportistaLocal=null;
			
			if(!this.getEsControlTabla()) {
				transportistaLocal=this.transportista;
			} else {
				transportistaLocal=this.transportistaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
		
		return existeCambio;
	}
	
	public void jTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParent=jTextField.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
							
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	//CUANDO SE CAMBIA ALGUN FORMATO(TIPO DE LETRA,NEGRILLA,ETC)
	public void jTextFieldChangedUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextField jTextField=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextField=(JTextField)evt.getSource();
			
			containerParent=jTextField.getParent();
					
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {					
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				Container containerParent=null;
				Container containerParentAux=null;
				JFormattedTextField JFormattedTextField=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JFormattedTextField=(JFormattedTextField)evt.getSource();
				
				containerParentAux=JFormattedTextField.getParent();
				
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
								
						
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextField jTextField=null;
				Container containerParent=null;
				Container containerParentAux=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextField=(JTextField)evt.getSource();
				
				containerParentAux=jTextField.getParent();
						
				if(containerParentAux!=null && containerParentAux.getClass().equals(JDateChooser.class)) {
					containerParent=containerParentAux.getParent();
				}
				
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
								
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jTextAreaFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.TEXTAREA,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JTextArea jTextArea=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jTextArea=(JTextArea)evt.getSource();
				
				containerParent=jTextArea.getParent();
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
							
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaChangedUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			/*
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			//System.out.println("UPDATE");
			
			Boolean esControlTabla=false;
			//JTextArea jTextArea=null;
			Container containerParent=null;
			Component componentOpposite=null;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			//jTextArea=(JTextArea)evt.getSource();
			
			containerParent=jTextArea.getParent();
			componentOpposite=null;//evt.getOppositeComponent();
			
			if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
				|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
			) {
				esControlTabla=true;
			}
			
			this.esControlTabla=esControlTabla;
			
			


			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JLabel jLabel=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jLabel=(JLabel)evt.getSource();
				
				containerParent=jLabel.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
								
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
			
			this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
				
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
							
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTransportista")) {
					jCheckBoxSeleccionarTodosTransportistaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTransportista")) {
					jCheckBoxSeleccionadosTransportistaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTransportista")) {
					
				}
				
				


				
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.CHECKBOX,sTipo)) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				Boolean esControlTabla=false;
				JCheckBox jCheckBox=null;
				Container containerParent=null;
				Component componentOpposite=null;
				
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
				
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				jCheckBox=(JCheckBox)evt.getSource();
				
				containerParent=jCheckBox.getParent();
						
				componentOpposite=evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
				
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
												
				
				


				
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO SE UTILIZA, SE USA EL DE ABAJO, IGUAL SE DEJA EL CODIGO COMO RESPALDO Y ES CASI IGUAL
	//ERROR:SI SE USA,AL HACER CLIC EN EL MISMO ELEMENTO O EJECUTAR SELECTEDITEM, SIEMPRE SE EJECUTA COMO SI ESCOGIERA OTRO ELEMENTO(NO DEBERIA)
	//@SuppressWarnings("rawtypes")
	public void jComboBoxActionPerformedGeneral(String sTipo,ActionEvent evt) {		
		try {
			/*		
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
			
			if(this.esUsoDesdeHijo) {
				eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			}
			
			Container containerParent=null;
			Component componentOpposite=null;
			Boolean esControlTabla=false;
				
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			JComboBox jComboBoxGenerico=null;						
			
			if(evt.getSource().getClass().equals(JComboBox.class)
				|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
					
				jComboBoxGenerico=(JComboBox)evt.getSource();
				
				containerParent=jComboBoxGenerico.getParent();
				
				componentOpposite=null;//evt.getOppositeComponent();
				
				if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
				) {					
					esControlTabla=true;
				}
				
				this.esControlTabla=esControlTabla;
			}
			
			String sFinalQueryCombo="";
			
			


			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTransportistaActual();
			
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
			
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				/*
				if(this.esUsoDesdeHijo) {
					eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				}
				*/
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=null;//evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}		
					
					this.esControlTabla=esControlTabla;
				}
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//@SuppressWarnings("rawtypes")
	public void jComboBoxFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		//MANEJADO EN ITEMLISTENER
		/*
		try {
			if(this.permiteManejarEventosControl()) {
				EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.CONTROL_CHANGE;
				
				
				//if(this.esUsoDesdeHijo) {
				//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				//}
				
				
				Container containerParent=null;
				Component componentOpposite=null;
				Boolean esControlTabla=false;
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				//PARAMETROS LLAMAR FUNCION PARENT
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();			
				Boolean esUsoDesdeHijoLocal=false;
				Boolean conIrServidorAplicacionParent=false;	
				ArrayList<String> arrClasses=new ArrayList<String>();			
				//PARAMETROS LLAMAR FUNCION PARENT_FIN
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.transportista);
				
				this.actualizarInformacion("INFO_PADRE",false,this.transportista);
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				JComboBox jComboBoxGenerico=null;						
				
				if(evt.getSource().getClass().equals(JComboBox.class)
					|| evt.getSource().getClass().equals(JComboBoxMe.class)) {
						
					jComboBoxGenerico=(JComboBox)evt.getSource();
					
					containerParent=jComboBoxGenerico.getParent();
					
					componentOpposite=evt.getOppositeComponent();
					
					if((containerParent!=null && containerParent.getClass().equals(JTableMe.class))
					|| (componentOpposite!=null && componentOpposite.getClass().equals(JTableMe.class))
					) {					
						esControlTabla=true;
					}
					
					this.esControlTabla=esControlTabla;
				}
				
				String sFinalQueryCombo="";
				
				


				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Transportista.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Transportista.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTransportistaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.transportistaAnterior =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.transportistaAnterior =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTransportista")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTransportistaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTransportista.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.transportista =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.transportista =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.transportista);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTransportista")) {
				
				}
				
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTransportista")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTransportista.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTransportista")) {
			
			}
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTransportista();
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			if(sTipo.equals("NuevoTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTransportista")) {
				jButtonDuplicarTransportistaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTransportista")) {
				jButtonCopiarTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTransportista")) {
				jButtonVerFormTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTransportista")) {
				jButtonNuevoTransportistaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTransportista")) {
				jButtonModificarTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTransportista")) {
				jButtonActualizarTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTransportista")) {
				jButtonEliminarTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTransportista")) {
				jButtonCancelarTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTransportista")) {
				jButtonCerrarTransportistaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTransportista")) {
				jButtonGuardarCambiosTransportistaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTransportista")) {
				jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTransportista")) {
				jButtonAbrirOrderByTransportistaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTransportista")) {
				jButtonRecargarInformacionTransportistaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTransportista")) {
				jButtonAnterioresTransportistaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTransportista")) {
				jButtonSiguientesTransportistaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTransportistaBusqueda")) {
				this.jButtonidTransportistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTransportistaUpdate")) {
				this.jButtonid_empresaTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTransportistaBusqueda")) {
				this.jButtonid_empresaTransportistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTransportistaUpdate")) {
				this.jButtonid_sucursalTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTransportistaBusqueda")) {
				this.jButtonid_sucursalTransportistaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransportistaUpdate")) {
				this.jButtonid_tipo_via_transporteTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_tipo_via_transporteTransportistaBusqueda")) {
				this.jButtonid_tipo_via_transporteTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("identificacionTransportistaBusqueda")) {
				this.jButtonidentificacionTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("rucTransportistaBusqueda")) {
				this.jButtonrucTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreTransportistaBusqueda")) {
				this.jButtonnombreTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("apellidoTransportistaBusqueda")) {
				this.jButtonapellidoTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_completoTransportistaBusqueda")) {
				this.jButtonnombre_completoTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoTransportistaBusqueda")) {
				this.jButtontelefonoTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionTransportistaBusqueda")) {
				this.jButtondireccionTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_clienteTransportista")) {
				this.jButtonid_clienteTransportistaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_clienteTransportistaUpdate")) {
				this.jButtonid_clienteTransportistaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_clienteTransportistaBusqueda")) {
				this.jButtonid_clienteTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("placaTransportistaBusqueda")) {
				this.jButtonplacaTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroTransportistaBusqueda")) {
				this.jButtonnumeroTransportistaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("observacionTransportistaBusqueda")) {
				this.jButtonobservacionTransportistaBusquedaActionPerformed(evt);
			}
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTransportista();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTransportista")) {
				closingInternalFrameTransportista();
				
			} else if(sTipo.equals("jButtonCancelarTransportista")) {
				JInternalFrameBase jInternalFrameDetalleFormTransportista = (JInternalFrameBase)evt.getSource();
	            	
	            TransportistaBeanSwingJInternalFrame jInternalFrameParent=(TransportistaBeanSwingJInternalFrame)jInternalFrameDetalleFormTransportista.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTransportistaActionPerformed(null);
			}
			
			TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.transportista,new Object(),this.transportistaParameterGeneral,this.transportistaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTransportista(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTransportista(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTransportista(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.transportista)) {
			if(!esControlTabla) {
				if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);			
				}
				
				if(this.transportistaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTransportista(this.transportista,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transportistaReturnGeneral=transportistaLogic.procesarEventosTransportistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transportistaLogic.getTransportistas(),this.transportista,this.transportistaParameterGeneral,this.isEsNuevoTransportista,classes);//this.transportistaLogic.getTransportista()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTransportista(this.transportistaReturnGeneral,this.transportistaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.transportistaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTransportista(classes,this.transportistaReturnGeneral,this.transportistaBean,false);
					}
						
					if(this.transportistaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTransportista(this.transportistaReturnGeneral.getTransportista());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTransportista(this.transportistaReturnGeneral.getTransportista());	
					}
						
					if(this.transportistaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTransportista(this.transportistaReturnGeneral.getTransportista(),classes);//this.transportistaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTransportista(this.transportista,classes);//this.transportistaBean);									
				}
			
				if(TransportistaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTransportista(this.transportista,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTransportista(this.transportista);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.transportistaAnterior!=null) {
						this.transportista=this.transportistaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.transportistaReturnGeneral=transportistaLogic.procesarEventosTransportistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transportistaLogic.getTransportistas(),this.transportista,this.transportistaParameterGeneral,this.isEsNuevoTransportista,classes);//this.transportistaLogic.getTransportista()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.transportistaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.transportistaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.transportistaReturnGeneral.getTransportista(),transportistaLogic.getTransportistas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.transportistaReturnGeneral.getTransportista(),this.transportistas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTransportista.repaint();
				
				//((AbstractTableModel) this.jTableDatosTransportista.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTransportista();
			}
		}
	}
	
	public void actualizarVisualTableDatosTransportista() throws Exception {
		
		TransportistaModel transportistaModel=(TransportistaModel)this.jTableDatosTransportista.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			transportistaModel.transportistas=this.transportistaLogic.getTransportistas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			transportistaModel.transportistas=this.transportistas;
		}
		
		
		((TransportistaModel) this.jTableDatosTransportista.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTransportista() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gettransportistaAnterior(),this.transportistaLogic.getTransportistas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gettransportistaAnterior(),this.transportistas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTransportista();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTransportista(Transportista transportista,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setEventoParentGeneral(Boolean esUsoDesdeHijo,String sDominio,String sDominioTipo,String sTipo,String sTipoGeneral,Boolean esControlTabla,Boolean conIrServidorAplicacion,
						Long id,Component control, EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,ArrayList<String> arrClasses,
						Object evt,GeneralEntityParameterReturnGeneral generalEntityParameterGeneral,Object otro) { 	  
		try {
			
			if(this.permiteManejarEventosControl()) {
				
				//BASE COPIADO DESDE TEXTFIELLOSTFOCUS
				
				//EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
				Boolean conTodasRelaciones=false;
				
				this.esUsoDesdeHijo=esUsoDesdeHijo;
										
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transportista,new Object(),generalEntityParameterGeneral,this.transportistaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.transportistaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TransportistaConstantesFunciones.getClassesRelationshipsOfTransportista(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TransportistaConstantesFunciones.getClassesRelationshipsFromStringsOfTransportista(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTransportista(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TransportistaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.transportista,new Object(),generalEntityParameterGeneral,this.transportistaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTransportista(TransportistaBean transportistaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTransportista(ArrayList<Classe> classes,TransportistaReturnGeneral transportistaReturnGeneral,TransportistaBean transportistaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTransportista(Transportista transportista,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.transportista)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTransportista = new TransportistaDetalleFormJInternalFrame(jDesktopPane,this.transportistaSessionBean.getConGuardarRelaciones(),this.transportistaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTransportista);
		this.jInternalFrameDetalleFormTransportista.setVisible(false);
		this.jInternalFrameDetalleFormTransportista.setSelected(false);						
		
		this.jInternalFrameDetalleFormTransportista.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTransportista.transportistaLogic=this.transportistaLogic;
		
		this.cargarCombosFrameForeignKeyTransportista("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTransportista();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTransportista();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTransportista("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTransportista();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTransportista.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransportista"));
		
		this.jInternalFrameDetalleFormTransportista.jButtonModificarTransportista.addActionListener(new ButtonActionListener(this,"ModificarTransportista"));

		
		this.jInternalFrameDetalleFormTransportista.jButtonModificarToolBarTransportista.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransportista"));
					
		this.jInternalFrameDetalleFormTransportista.jMenuItemModificarTransportista.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransportista"));		
		
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonActualizarTransportista.addActionListener (new ButtonActionListener(this,"ActualizarTransportista"));
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonActualizarToolBarTransportista.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransportista"));
						
		this.jInternalFrameDetalleFormTransportista.jMenuItemActualizarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransportista"));		
		
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonEliminarTransportista.addActionListener (new ButtonActionListener(this,"EliminarTransportista"));
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonEliminarToolBarTransportista.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransportista"));
								
		this.jInternalFrameDetalleFormTransportista.jMenuItemEliminarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransportista"));		
		
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonCancelarTransportista.addActionListener (new ButtonActionListener(this,"CancelarTransportista"));
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonCancelarToolBarTransportista.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransportista"));
					
		this.jInternalFrameDetalleFormTransportista.jMenuItemCancelarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransportista"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTransportista.jMenuItemDetalleCerrarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransportista"));		
		
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosToolBarTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransportista"));
		
		
		
		this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosToolBarTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransportista"));
		
		
		
		this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransportista"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonidTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"idTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_empresaTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_empresaTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_sucursalTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_sucursalTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_tipo_via_transporteTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_tipo_via_transporteTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonidentificacionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"identificacionTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonrucTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"rucTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnombreTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonapellidoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnombre_completoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtontelefonoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtondireccionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"direccionTransportistaBusqueda"));
		//jButtonid_clienteTransportista.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTransportistaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportista.addActionListener(new ButtonActionListener(this,"id_clienteTransportista"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonplacaTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"placaTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnumeroTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"numeroTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonobservacionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"observacionTransportistaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransportista"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTransportista"));
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTransportista"));
		}
		
		this.jTableDatosTransportista.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTransportista"));
		
		this.jTableDatosTransportista.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTransportista"));
		
		this.jButtonNuevoTransportista.addActionListener(new ButtonActionListener(this,"NuevoTransportista"));
		
		this.jButtonDuplicarTransportista.addActionListener(new ButtonActionListener(this,"DuplicarTransportista"));
		
		this.jButtonCopiarTransportista.addActionListener(new ButtonActionListener(this,"CopiarTransportista"));
		
		this.jButtonVerFormTransportista.addActionListener(new ButtonActionListener(this,"VerFormTransportista"));
		
		
		this.jButtonNuevoToolBarTransportista.addActionListener(new ButtonActionListener(this,"NuevoToolBarTransportista"));
			
		this.jButtonDuplicarToolBarTransportista.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTransportista"));
			
		this.jMenuItemNuevoTransportista.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTransportista"));
			
		this.jMenuItemDuplicarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTransportista"));		
		
		
		this.jButtonNuevoRelacionesTransportista.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTransportista"));
		
		
		this.jButtonNuevoRelacionesToolBarTransportista.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTransportista"));
			
		this.jMenuItemNuevoRelacionesTransportista.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTransportista"));		
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonModificarTransportista.addActionListener(new ButtonActionListener(this,"ModificarTransportista"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonModificarToolBarTransportista.addActionListener(new ButtonActionListener(this,"ModificarToolBarTransportista"));
			
			this.jInternalFrameDetalleFormTransportista.jMenuItemModificarTransportista.addActionListener(new ButtonActionListener(this,"MenuItemModificarTransportista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTransportista.jButtonActualizarTransportista.addActionListener (new ButtonActionListener(this,"ActualizarTransportista"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonActualizarToolBarTransportista.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTransportista"));
				
			this.jInternalFrameDetalleFormTransportista.jMenuItemActualizarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTransportista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonEliminarTransportista.addActionListener (new ButtonActionListener(this,"EliminarTransportista"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonEliminarToolBarTransportista.addActionListener (new ButtonActionListener(this,"EliminarToolBarTransportista"));
						
			this.jInternalFrameDetalleFormTransportista.jMenuItemEliminarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTransportista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonCancelarTransportista.addActionListener (new ButtonActionListener(this,"CancelarTransportista"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonCancelarToolBarTransportista.addActionListener (new ButtonActionListener(this,"CancelarToolBarTransportista"));
			
			this.jInternalFrameDetalleFormTransportista.jMenuItemCancelarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTransportista"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTransportista.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTransportista"));		
		
		
		this.jButtonCerrarTransportista.addActionListener (new ButtonActionListener(this,"CerrarTransportista"));
		
		
		this.jButtonCerrarToolBarTransportista.addActionListener (new ButtonActionListener(this,"CerrarToolBarTransportista"));
			
		this.jMenuItemCerrarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTransportista"));
			
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jMenuItemDetalleCerrarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTransportista"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTransportista"));
		}
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosToolBarTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTransportista"));
		}
		
		this.jButtonCopiarToolBarTransportista.addActionListener (new ButtonActionListener(this,"CopiarToolBarTransportista"));
			
		this.jButtonVerFormToolBarTransportista.addActionListener (new ButtonActionListener(this,"VerFormToolBarTransportista"));
		
		this.jMenuItemGuardarCambiosTransportista.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTransportista"));
			
		this.jMenuItemCopiarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTransportista"));		
		
		this.jMenuItemVerFormTransportista.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTransportista"));		
		
		
		this.jButtonGuardarCambiosTablaTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransportista"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTransportista"));
			
		this.jMenuItemGuardarCambiosTablaTransportista.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTransportista"));		
		
		
		
		this.jButtonRecargarInformacionTransportista.addActionListener (new ButtonActionListener(this,"RecargarInformacionTransportista"));
					
		this.jButtonRecargarInformacionToolBarTransportista.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTransportista"));
		
		this.jMenuItemRecargarInformacionTransportista.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTransportista"));		
		
		
		
		this.jButtonAnterioresTransportista.addActionListener (new ButtonActionListener(this,"AnterioresTransportista"));
		
		
		this.jButtonAnterioresToolBarTransportista.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTransportista"));
		
		this.jMenuItemAnterioresTransportista.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTransportista"));		
		
		
		this.jButtonSiguientesTransportista.addActionListener (new ButtonActionListener(this,"SiguientesTransportista"));
		
		
		this.jButtonSiguientesToolBarTransportista.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTransportista"));
			
		this.jMenuItemSiguientesTransportista.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTransportista"));
			
		this.jMenuItemAbrirOrderByTransportista.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTransportista"));
			
		this.jMenuItemMostrarOcultarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTransportista"));
			
		this.jMenuItemDetalleAbrirOrderByTransportista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTransportista"));
			
		this.jMenuItemDetalleMostarOcultarTransportista.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTransportista"));		
		
		
		this.jButtonNuevoGuardarCambiosTransportista.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTransportista"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTransportista.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTransportista"));
			
		this.jMenuItemNuevoGuardarCambiosTransportista.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTransportista"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTransportista.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTransportista"));

		this.jCheckBoxSeleccionadosTransportista.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTransportista"));
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTransportista"));
		}
		
		
		this.jComboBoxTiposRelacionesTransportista.addActionListener (new ButtonActionListener(this,"TiposRelacionesTransportista"));
			
		this.jComboBoxTiposAccionesTransportista.addActionListener (new ButtonActionListener(this,"TiposAccionesTransportista"));
					
		this.jComboBoxTiposSeleccionarTransportista.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTransportista"));
			
		this.jTextFieldValorCampoGeneralTransportista.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTransportista"));		
		
		
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonidTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"idTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_empresaTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_empresaTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_sucursalTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_sucursalTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_tipo_via_transporteTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_tipo_via_transporteTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonidentificacionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"identificacionTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonrucTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"rucTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnombreTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonapellidoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnombre_completoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtontelefonoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtondireccionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"direccionTransportistaBusqueda"));
		//jButtonid_clienteTransportista.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTransportistaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportista.addActionListener(new ButtonActionListener(this,"id_clienteTransportista"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonplacaTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"placaTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnumeroTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"numeroTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonobservacionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"observacionTransportistaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonBusquedaPorIdentificacionTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorIdentificacionTransportista"));

			this.jButtonBusquedaPorNombreCompletoTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCompletoTransportista"));

			this.jButtonBusquedaPorPlacaTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorPlacaTransportista"));

			this.jButtonBusquedaPorRucTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorRucTransportista"));

			this.jButtonBusquedaPorTelefonoTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoTransportista"));

			this.jButtonFK_IdClienteTransportista.addActionListener(new ButtonActionListener(this,"FK_IdClienteTransportista"));

			this.jButtonBuscarFK_IdClienteid_clienteTransportista.addActionListener(new ButtonActionListener(this,"id_clienteTransportista"));

			this.jButtonFK_IdTipoViaTransporteTransportista.addActionListener(new ButtonActionListener(this,"FK_IdTipoViaTransporteTransportista"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTransportista!=null) {
				this.jInternalFrameReporteDinamicoTransportista.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransportista"));
				this.jInternalFrameReporteDinamicoTransportista.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransportista"));
				this.jInternalFrameReporteDinamicoTransportista.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransportista"));
			}
			
			//this.jButtonCerrarReporteDinamicoTransportista.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTransportista"));				
			//this.jButtonGenerarReporteDinamicoTransportista.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTransportista"));
			//this.jButtonGenerarExcelReporteDinamicoTransportista.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTransportista"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTransportista!=null) {
				this.jInternalFrameImportacionTransportista.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTransportista"));
				this.jInternalFrameImportacionTransportista.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTransportista"));
				this.jInternalFrameImportacionTransportista.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTransportista"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTransportista.addActionListener (new ButtonActionListener(this,"AbrirOrderByTransportista"));
			
			this.jButtonAbrirOrderByToolBarTransportista.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTransportista"));			
			
			if(this.jInternalFrameOrderByTransportista!=null) {
				this.jInternalFrameOrderByTransportista.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTransportista"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTransportista!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTransportista.jTabbedPaneRelacionesTransportista.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTransportista"));
		
		;
		}
		//TABBED PANE RELACIONES FIN(EXTRA TAB)		
	}
	
	/*
	public void initActions() {
		String sMapKey = "";
		InputMap inputMap =null;
		
		this.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent event) {          	
            	try {
            		closingInternalFrameTransportista();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTransportista.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTransportista = (JInternalFrameBase)event.getSource();
	            	
	            TransportistaBeanSwingJInternalFrame jInternalFrameParent=(TransportistaBeanSwingJInternalFrame)jInternalFrameDetalleFormTransportista.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTransportistaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTransportista.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTransportistaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTransportista.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTransportista.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransportistaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransportistaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransportistaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTransportista";
		inputMap = this.jButtonNuevoTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransportistaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransportistaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransportistaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTransportistaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTransportista";
		inputMap = this.jButtonNuevoRelacionesTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTransportistaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTransportista";
		inputMap = this.jButtonModificarTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTransportistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTransportista";
		inputMap = this.jButtonActualizarTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTransportistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTransportista";
		inputMap = this.jButtonEliminarTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTransportistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTransportista";
		inputMap = this.jButtonCancelarTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTransportistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTransportista";
		inputMap = this.jButtonCerrarTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTransportistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTransportista";
		inputMap = this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTransportista.jButtonGuardarCambiosTransportista.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTransportistaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTransportista.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTransportistaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTransportista.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTransportistaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTransportista.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTransportistaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTransportista.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTransportistaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonidTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"idTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_empresaTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_empresaTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_sucursalTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_sucursalTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTransportistaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_tipo_via_transporteTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_tipo_via_transporteTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_tipo_via_transporteTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonidentificacionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"identificacionTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonrucTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"rucTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnombreTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"nombreTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonapellidoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"apellidoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnombre_completoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"nombre_completoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtontelefonoTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"telefonoTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtondireccionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"direccionTransportistaBusqueda"));
		//jButtonid_clienteTransportista.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_clienteTransportistaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportista.addActionListener(new ButtonActionListener(this,"id_clienteTransportista"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportistaUpdate.addActionListener(new ButtonActionListener(this,"id_clienteTransportistaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"id_clienteTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonplacaTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"placaTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonnumeroTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"numeroTransportistaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTransportista.jButtonobservacionTransportistaBusqueda.addActionListener(new ButtonActionListener(this,"observacionTransportistaBusqueda"));
		
		
		this.jButtonBusquedaPorIdentificacionTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorIdentificacionTransportista"));

		this.jButtonBusquedaPorNombreCompletoTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorNombreCompletoTransportista"));

		this.jButtonBusquedaPorPlacaTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorPlacaTransportista"));

		this.jButtonBusquedaPorRucTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorRucTransportista"));

		this.jButtonBusquedaPorTelefonoTransportista.addActionListener(new ButtonActionListener(this,"BusquedaPorTelefonoTransportista"));

		this.jButtonFK_IdClienteTransportista.addActionListener(new ButtonActionListener(this,"FK_IdClienteTransportista"));

		this.jButtonBuscarFK_IdClienteid_clienteTransportista.addActionListener(new ButtonActionListener(this,"id_clienteTransportista"));

		this.jButtonFK_IdTipoViaTransporteTransportista.addActionListener(new ButtonActionListener(this,"FK_IdTipoViaTransporteTransportista"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTransportista.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTransportistaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTransportistaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTransportista.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTransportista(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
					transportistaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transportista transportistaAux:transportistas) {
					transportistaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTransportistaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransportista(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
						transportistaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transportista transportistaAux:transportistas) {
						transportistaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transportista transportistaAux:transportistas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTransportista(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransportista.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransportista.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransportista,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTransportistaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTransportista(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTransportista.getSelectedRows();
			
			Transportista transportistaLocal=new Transportista();
			
			//this.seleccionarTodosTransportista(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					transportistaLocal =(Transportista) this.transportistaLogic.getTransportistas().toArray()[this.jTableDatosTransportista.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					transportistaLocal =(Transportista) this.transportistas.toArray()[this.jTableDatosTransportista.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				transportistaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
						transportistaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Transportista transportistaAux:transportistas) {
						transportistaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTransportista(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTransportista.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTransportista.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTransportista,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTransportistaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTransportistaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTransportistaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTransportista(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTransportista.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Transportista transportistaAux:this.transportistaLogic.getTransportistas()) {
				
						if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							transportistaAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							transportistaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transportistaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							transportistaAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							transportistaAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							transportistaAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							transportistaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_PLACA)) {
							existe=true;
							transportistaAux.setplaca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							transportistaAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							transportistaAux.setobservacion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transportista transportistaAux:transportistas) {
					
						if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDENTIFICACION)) {
							existe=true;
							transportistaAux.setidentificacion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_RUC)) {
							existe=true;
							transportistaAux.setruc(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							transportistaAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_APELLIDO)) {
							existe=true;
							transportistaAux.setapellido(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
							existe=true;
							transportistaAux.setnombre_completo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							transportistaAux.settelefono(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							transportistaAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_PLACA)) {
							existe=true;
							transportistaAux.setplaca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							transportistaAux.setnumero(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_OBSERVACION)) {
							existe=true;
							transportistaAux.setobservacion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTransportista(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTransportistaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTransportista(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTransportista=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTransportista.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTransportista) {				
					conSplash=true;//false;										
					
					//this.startProcessTransportista(conSplash);
				
					this.generarReporteTransportistasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTransportistasSeleccionados();
				//this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransportistasSeleccionados(false);
				//this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTransportistasSeleccionados(true);
				//this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransportista();
				
				this.exportarTransportistasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTransportistas();
				//this.importarTransportistas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTransportista();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTransportistasSeleccionados();
				//this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Transportista", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTransportista();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTransportista)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTransportista(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
				}	
			} 			
			else if(TransportistaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTransportista) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTransportista(conSplash);
					
						//this.actualizarParametrosGeneralTransportista();
						
						this.generarReporteProcesoAccionTransportistasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TransportistaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO TransportistaS SELECCIONADOS?", "MANTENIMIENTO DE Transportista", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTransportista();
				
						this.actualizarParametrosGeneralTransportista();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.transportistaReturnGeneral=transportistaLogic.procesarAccionTransportistasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.transportistaLogic.getTransportistas(),this.transportistaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTransportistaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTransportista();
					
					TransportistaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTransportistaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTransportista.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTransportista.jComboBoxTiposAccionesFormularioTransportista.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTransportista(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTransportistaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTransportista();
			
			if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
			Transportista transportista=new Transportista();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTransportista(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTransportista.getSelectedItem();
			
			
			
			
			transportistasSeleccionados=this.getTransportistasSeleccionados(true);
			//this.sTipoAccion;
			
			if(transportistasSeleccionados.size()==1) {
				for(Transportista transportistaAux:transportistasSeleccionados) {
					transportista=transportistaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTransportista();
			
      		//this.finishProcessTransportista(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTransportistaReturnGeneral() throws Exception {
		if(this.transportistaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.transportistaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.transportistaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.transportistaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.transportistaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.transportistaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTransportista(false);
		}
		
		if(this.transportistaReturnGeneral.getConRetornoLista() || this.transportistaReturnGeneral.getConRetornoObjeto()) {
			if(this.transportistaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transportistaLogic.setTransportistas(this.transportistaReturnGeneral.getTransportistas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.transportistaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.transportistaLogic.setTransportista(this.transportistaReturnGeneral.getTransportista());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTransportista(false);
		}
	}
	
	public void actualizarParametrosGeneralTransportista() throws Exception {
		
		
	}
	
	public ArrayList<Transportista> getTransportistasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTransportista) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Transportista transportistaAux:transportistaLogic.getTransportistas()) {
					if(transportistaAux.getIsSelected()) {
						transportistasSeleccionados.add(transportistaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Transportista transportistaAux:this.transportistas) {
					if(transportistaAux.getIsSelected()) {
						transportistasSeleccionados.add(transportistaAux);				
					}
				}
			}
			
			if(transportistasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						transportistasSeleccionados.addAll(this.transportistaLogic.getTransportistas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						transportistasSeleccionados.addAll(this.transportistas);				
					}
				}
			}
		} else {
			transportistasSeleccionados.add(this.transportista);
		}
		
		return transportistasSeleccionados;
	}
	
	public void actualizarVariablesTipoReporte(Boolean esReporteNormal,Boolean esReporteDinamico,Boolean esReporteAccionProceso,String sPath) {
		if(esReporteNormal) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=false;
			
		} else if(esReporteAccionProceso) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=false;
			this.sPathReporteDinamico="";
			this.esReporteAccionProceso=true;
			
		} else if(esReporteDinamico) {
			this.sTipoReporteExtra="";
			this.esReporteDinamico=true;
			this.esReporteAccionProceso=false;
			this.sPathReporteDinamico=sPath.replace(".jrxml",".jasper");			
		}
	}
	
	public void generarReporteTransportistasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTransportistasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTransportistasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransportistasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTransportistasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Transportista",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTransportistasSeleccionados() throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTransportistas("Todos",transportistasSeleccionados);
		
	}	
	
	public void generarReporteNormalTransportistasSeleccionados() throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTransportistas("Todos",transportistasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTransportistasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTransportistas("Todos",transportistasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTransportistasSeleccionados() throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTransportista();
		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTransportista();
		
		
		//this.generarReporteTransportistas("Todos",transportistasSeleccionados ,transportistaImplementable,transportistaImplementableHome);
	}
	
	public void mostrarImportacionTransportistas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTransportista();
		
		this.abrirFrameImportacionTransportista();		
		
			
		//this.generarReporteTransportistas("Todos",transportistasSeleccionados ,transportistaImplementable,transportistaImplementableHome);
	}
	
	public void importarTransportistas() throws Exception {		
	
	}
	
	public void exportarTransportistasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTransportistasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTransportistasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTransportistasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Transportista",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTransportistasSeleccionados() throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTransportista(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Transportista transportistaAux:transportistasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTransportista(transportistaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//transportistaAux.setsDetalleGeneralEntityReporte(transportistaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTransportista(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_IDENTIFICACION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_RUC;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_APELLIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_TELEFONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_IDCLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_PLACA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TransportistaConstantesFunciones.LABEL_OBSERVACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTransportista(Transportista transportista,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=transportista.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.gettipoviatransporte_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getidentificacion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getruc();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getapellido();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getnombre_completo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.gettelefono();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getcliente_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getplaca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getnumero();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=transportista.getobservacion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTransportistasSeleccionados() throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Transportistas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTransportista(row);				
				iRow++;
			}				
			
			for(Transportista transportistaAux:transportistasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTransportista(transportistaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTransportistasSeleccionados() throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();		
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"transportista.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("transportistas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("transportista");
			//elementRoot.appendChild(element);
		
			for(Transportista transportistaAux:transportistasSeleccionados) {
				element = document.createElement("transportista");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTransportista(transportistaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.transportistaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Transportista",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTransportista(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDENTIFICACION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_RUC);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_APELLIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_TELEFONO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_IDCLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_PLACA);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(TransportistaConstantesFunciones.LABEL_OBSERVACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTransportista(Transportista transportista,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.gettipoviatransporte_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getidentificacion());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getruc());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getapellido());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getnombre_completo());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.gettelefono());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getcliente_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getplaca());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(transportista.getobservacion());				
	}
	
	public void setFilaDatosExportarXmlTransportista(Transportista transportista,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TransportistaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(transportista.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TransportistaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(transportista.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TransportistaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(transportista.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TransportistaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(transportista.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementtipoviatransporte_descripcion = document.createElement(TransportistaConstantesFunciones.IDTIPOVIATRANSPORTE);
		elementtipoviatransporte_descripcion.appendChild(document.createTextNode(transportista.gettipoviatransporte_descripcion()));
		element.appendChild(elementtipoviatransporte_descripcion);

		Element elementidentificacion = document.createElement(TransportistaConstantesFunciones.IDENTIFICACION);
		elementidentificacion.appendChild(document.createTextNode(transportista.getidentificacion().trim()));
		element.appendChild(elementidentificacion);

		Element elementruc = document.createElement(TransportistaConstantesFunciones.RUC);
		elementruc.appendChild(document.createTextNode(transportista.getruc().trim()));
		element.appendChild(elementruc);

		Element elementnombre = document.createElement(TransportistaConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(transportista.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementapellido = document.createElement(TransportistaConstantesFunciones.APELLIDO);
		elementapellido.appendChild(document.createTextNode(transportista.getapellido().trim()));
		element.appendChild(elementapellido);

		Element elementnombre_completo = document.createElement(TransportistaConstantesFunciones.NOMBRECOMPLETO);
		elementnombre_completo.appendChild(document.createTextNode(transportista.getnombre_completo().trim()));
		element.appendChild(elementnombre_completo);

		Element elementtelefono = document.createElement(TransportistaConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(transportista.gettelefono().trim()));
		element.appendChild(elementtelefono);

		Element elementdireccion = document.createElement(TransportistaConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(transportista.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementcliente_descripcion = document.createElement(TransportistaConstantesFunciones.IDCLIENTE);
		elementcliente_descripcion.appendChild(document.createTextNode(transportista.getcliente_descripcion()));
		element.appendChild(elementcliente_descripcion);

		Element elementplaca = document.createElement(TransportistaConstantesFunciones.PLACA);
		elementplaca.appendChild(document.createTextNode(transportista.getplaca().trim()));
		element.appendChild(elementplaca);

		Element elementnumero = document.createElement(TransportistaConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(transportista.getnumero().trim()));
		element.appendChild(elementnumero);

		Element elementobservacion = document.createElement(TransportistaConstantesFunciones.OBSERVACION);
		elementobservacion.appendChild(document.createTextNode(transportista.getobservacion().trim()));
		element.appendChild(elementobservacion);
	}
	
	public void generarReporteGroupGenericoTransportistasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Transportista> transportistasSeleccionados=new ArrayList<Transportista>();
		
		transportistasSeleccionados=this.getTransportistasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		if(!soloTotales) {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_GENERICO;
		} else {
			this.sTipoReporteExtra=Constantes2.S_REPORTE_EXTRA_GROUP_TOTALES_GENERICO;
		}
		
		this.setColumnaDescripcionReporteGroupGenericoTransportista(transportistasSeleccionados);
		
		this.generarReporteTransportistas("Todos",transportistasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTransportista(ArrayList<Transportista> transportistasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Transportista transportistaAux:transportistasSeleccionados) {
				transportistaAux.setsDetalleGeneralEntityReporte(transportistaAux.toString());
			
				if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDTIPOVIATRANSPORTE)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.gettipoviatransporte_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDENTIFICACION)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getidentificacion());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_RUC)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getruc());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_APELLIDO)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getapellido());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NOMBRECOMPLETO)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getnombre_completo());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.gettelefono());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_IDCLIENTE)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getcliente_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_PLACA)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getplaca());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getnumero());
				}
				 else if(sTipoSeleccionar.equals(TransportistaConstantesFunciones.LABEL_OBSERVACION)) {
					existe=true;
					transportistaAux.setsDescripcionGeneralEntityReporte1(transportistaAux.getobservacion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TransportistaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTransportista(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTransportista=true;
				this.isVisibilidadCeldaNuevoRelacionesTransportista=true;
				this.isVisibilidadCeldaGuardarCambiosTransportista=true;
			}
			
			this.isVisibilidadCeldaModificarTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=false;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=true;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
			this.isVisibilidadCeldaModificarTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=true;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=true;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
			this.isVisibilidadCeldaModificarTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=true;
			this.isVisibilidadCeldaEliminarTransportista=true;
			this.isVisibilidadCeldaCancelarTransportista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=true;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
			this.isVisibilidadCeldaModificarTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=true;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=false;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTransportista=true;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=true;
			this.isVisibilidadCeldaGuardarCambiosTransportista=true;
			this.isVisibilidadCeldaModificarTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=false;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=true;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
			this.isVisibilidadCeldaActualizarTransportista=false;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=false;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
			this.isVisibilidadCeldaModificarTransportista=true;
			this.isVisibilidadCeldaActualizarTransportista=false;
			this.isVisibilidadCeldaEliminarTransportista=false;
			this.isVisibilidadCeldaCancelarTransportista=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTransportista=false;
				} else {
					this.isVisibilidadCeldaGuardarTransportista=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TransportistaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTransportista=true;
			this.isVisibilidadCeldaNuevoRelacionesTransportista=true;
			this.isVisibilidadCeldaGuardarCambiosTransportista=true;
		} else {
			this.actualizarEstadoPanelsTransportista(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTransportista=false;
			//this.isVisibilidadCeldaVerFormTransportista=false;
			this.isVisibilidadCeldaDuplicarTransportista=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!transportistaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
		} else {
			this.isVisibilidadCeldaNuevoTransportista=false;
			this.isVisibilidadCeldaGuardarCambiosTransportista=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(transportistaSessionBean.getEsGuardarRelacionado()) {
			if(!transportistaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTransportista=false;												
			}
			
			this.jButtonCerrarTransportista.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTransportista=false;
		}
		
		if(!this.permiteMantenimiento(this.transportista)) {
			this.isVisibilidadCeldaActualizarTransportista=false;
			this.isVisibilidadCeldaEliminarTransportista=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTransportista() {
	}
	
	public void actualizarEstadoPanelsTransportista(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(false);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTransportista!=null) {
				this.jScrollPanelDatosEdicionTransportista.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTransportista!=null) {
				this.jScrollPanelDatosTransportista.setVisible(true);
			}
			
			if(this.jPanelPaginacionTransportista!=null) {
				this.jPanelPaginacionTransportista.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.transportistaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTransportista!=null) {
					this.jTabbedPaneBusquedasTransportista.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.transportistaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTransportista!=null) {
				this.jTabbedPaneBusquedasTransportista.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTransportista!=null) {
				this.jPanelParametrosReportesTransportista.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadBusquedaPorIdentificacion=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorIdentificacionTransportista);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorNombreCompletoTransportista);}

			this.isVisibilidadBusquedaPorPlaca=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorPlaca) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorPlacaTransportista);}

			this.isVisibilidadBusquedaPorRuc=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorRucTransportista);}

			this.isVisibilidadBusquedaPorTelefono=isParaEmpresaNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorTelefonoTransportista);}

			this.isVisibilidadFK_IdCliente=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdClienteTransportista);}

			this.isVisibilidadFK_IdTipoViaTransporte=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdTipoViaTransporteTransportista);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadBusquedaPorIdentificacion=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorIdentificacionTransportista);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorNombreCompletoTransportista);}

			this.isVisibilidadBusquedaPorPlaca=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorPlaca) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorPlacaTransportista);}

			this.isVisibilidadBusquedaPorRuc=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorRucTransportista);}

			this.isVisibilidadBusquedaPorTelefono=isParaSucursalNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorTelefonoTransportista);}

			this.isVisibilidadFK_IdCliente=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdClienteTransportista);}

			this.isVisibilidadFK_IdTipoViaTransporte=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdTipoViaTransporteTransportista);}
		}
		
	}

	public void setVisibilidadBusquedasParaTipoViaTransporte(Boolean isParaTipoViaTransporte){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTipoViaTransporteNegation=!isParaTipoViaTransporte;

			this.isVisibilidadBusquedaPorIdentificacion=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorIdentificacionTransportista);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorNombreCompletoTransportista);}

			this.isVisibilidadBusquedaPorPlaca=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorPlaca) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorPlacaTransportista);}

			this.isVisibilidadBusquedaPorRuc=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorRucTransportista);}

			this.isVisibilidadBusquedaPorTelefono=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorTelefonoTransportista);}

			this.isVisibilidadFK_IdCliente=isParaTipoViaTransporteNegation;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdClienteTransportista);}

			this.isVisibilidadFK_IdTipoViaTransporte=isParaTipoViaTransporte;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdTipoViaTransporteTransportista);}
		}
		
	}

	public void setVisibilidadBusquedasParaCliente(Boolean isParaCliente){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaClienteNegation=!isParaCliente;

			this.isVisibilidadBusquedaPorIdentificacion=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorIdentificacion) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorIdentificacionTransportista);}

			this.isVisibilidadBusquedaPorNombreCompleto=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorNombreCompleto) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorNombreCompletoTransportista);}

			this.isVisibilidadBusquedaPorPlaca=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorPlaca) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorPlacaTransportista);}

			this.isVisibilidadBusquedaPorRuc=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorRuc) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorRucTransportista);}

			this.isVisibilidadBusquedaPorTelefono=isParaClienteNegation;
			if(!this.isVisibilidadBusquedaPorTelefono) {this.jTabbedPaneBusquedasTransportista.remove(jPanelBusquedaPorTelefonoTransportista);}

			this.isVisibilidadFK_IdCliente=isParaCliente;
			if(!this.isVisibilidadFK_IdCliente) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdClienteTransportista);}

			this.isVisibilidadFK_IdTipoViaTransporte=isParaClienteNegation;
			if(!this.isVisibilidadFK_IdTipoViaTransporte) {this.jTabbedPaneBusquedasTransportista.remove(jPanelFK_IdTipoViaTransporteTransportista);}
		}
		
	}
	
	
	
	

	public String registrarSesionTransportistaParaBusquedaClientes() throws Exception {
		Boolean isPaginaPopupCliente=false;

		try {

			if(transportistaSessionBean==null) {
				transportistaSessionBean=new TransportistaSessionBean();
			}

			if(clienteSessionBean==null) {
				clienteSessionBean=new ClienteSessionBean();
			}

			clienteSessionBean.setsPathNavegacionActual(transportistaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ClienteConstantesFunciones.SCLASSWEBTITULO);
			clienteSessionBean.setisPermiteRecargarInformacion(false);
			clienteSessionBean.setisPaginaPopup(true);
			isPaginaPopupCliente=clienteSessionBean.getisPaginaPopup();
			clienteSessionBean.setisPaginaPopup(false);
			clienteSessionBean.setEstaModoBusqueda(true);
			clienteSessionBean.setsFuncionBusquedaRapida("window.opener.transportistaFuncionGeneral.setCombosCodigoDesdeBusquedaid_cliente(TO_REPLACE);");
			clienteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeCliente(true);
			clienteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeCliente(TransportistaConstantesFunciones.SNOMBREOPCION);
			//clienteSessionBean.setisBusquedaDesdeForeignKeySesionTransportista(true);
			//clienteSessionBean.setlidTransportistaActual(this.idTransportistaActual);

			transportistaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTransportista(true);
			transportistaSessionBean.setlIdTransportistaActualForeignKey(this.idTransportistaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TransportistaSessionBean transportistaSessionBean=new TransportistaSessionBean();
		
		if(this.transportistaSessionBean==null) {
			this.transportistaSessionBean=new TransportistaSessionBean();
		}
		
		this.transportistaSessionBean.setsUltimaBusquedaTransportista(this.getsAccionBusqueda());
		this.transportistaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.transportistaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("BusquedaPorIdentificacion")) {
			transportistaSessionBean.setidentificacion(this.getidentificacionBusquedaPorIdentificacion());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorNombreCompleto")) {
			transportistaSessionBean.setnombre_completo(this.getnombre_completoBusquedaPorNombreCompleto());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorPlaca")) {
			transportistaSessionBean.setplaca(this.getplacaBusquedaPorPlaca());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorRuc")) {
			transportistaSessionBean.setruc(this.getrucBusquedaPorRuc());	
		}
		else if(this.getsAccionBusqueda().equals("BusquedaPorTelefono")) {
			transportistaSessionBean.settelefono(this.gettelefonoBusquedaPorTelefono());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
			transportistaSessionBean.setid_cliente(this.getid_clienteFK_IdCliente());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			transportistaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			transportistaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTipoViaTransporte")) {
			transportistaSessionBean.setid_tipo_via_transporte(this.getid_tipo_via_transporteFK_IdTipoViaTransporte());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TransportistaSessionBean transportistaSessionBean=new TransportistaSessionBean();
		
		if(this.transportistaSessionBean==null) {
			this.transportistaSessionBean=new TransportistaSessionBean();
		}
		
		if(this.transportistaSessionBean.getsUltimaBusquedaTransportista()!=null&&!this.transportistaSessionBean.getsUltimaBusquedaTransportista().equals("")) {
			this.setsAccionBusqueda(transportistaSessionBean.getsUltimaBusquedaTransportista());
			this.setiNumeroPaginacion(transportistaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(transportistaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("BusquedaPorIdentificacion")) {
				this.setidentificacionBusquedaPorIdentificacion(transportistaSessionBean.getidentificacion());
				transportistaSessionBean.setidentificacion("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorNombreCompleto")) {
				this.setnombre_completoBusquedaPorNombreCompleto(transportistaSessionBean.getnombre_completo());
				transportistaSessionBean.setnombre_completo("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorPlaca")) {
				this.setplacaBusquedaPorPlaca(transportistaSessionBean.getplaca());
				transportistaSessionBean.setplaca("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorRuc")) {
				this.setrucBusquedaPorRuc(transportistaSessionBean.getruc());
				transportistaSessionBean.setruc("");
			}
			 else if(this.getsAccionBusqueda().equals("BusquedaPorTelefono")) {
				this.settelefonoBusquedaPorTelefono(transportistaSessionBean.gettelefono());
				transportistaSessionBean.settelefono("");
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdCliente")) {
				this.setid_clienteFK_IdCliente(transportistaSessionBean.getid_cliente());
				transportistaSessionBean.setid_cliente(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(transportistaSessionBean.getid_empresa());
				transportistaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(transportistaSessionBean.getid_sucursal());
				transportistaSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTipoViaTransporte")) {
				this.setid_tipo_via_transporteFK_IdTipoViaTransporte(transportistaSessionBean.getid_tipo_via_transporte());
				transportistaSessionBean.setid_tipo_via_transporte(-1L);
			}
		}
		
		this.transportistaSessionBean.setsUltimaBusquedaTransportista("");
		this.transportistaSessionBean.setiNumeroPaginacion(TransportistaConstantesFunciones.INUMEROPAGINACION);
		this.transportistaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTransportista(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTransportista() {
		this.updateBorderResaltarBusquedasFormularioTransportista();
		this.updateVisibilidadBusquedasFormularioTransportista();
		this.updateHabilitarBusquedasFormularioTransportista();
	}
	
	public void updateBorderResaltarBusquedasFormularioTransportista() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTransportista.getComponents().length>0) {
	

		if(this.transportistaConstantesFunciones.resaltarBusquedaPorIdentificacionTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorIdentificacionTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorIdentificacionTransportista);
			}
		}

		if(this.transportistaConstantesFunciones.resaltarBusquedaPorNombreCompletoTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorNombreCompletoTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorNombreCompletoTransportista);
			}
		}

		if(this.transportistaConstantesFunciones.resaltarBusquedaPorPlacaTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorPlacaTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorPlacaTransportista);
			}
		}

		if(this.transportistaConstantesFunciones.resaltarBusquedaPorRucTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorRucTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorRucTransportista);
			}
		}

		if(this.transportistaConstantesFunciones.resaltarBusquedaPorTelefonoTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorTelefonoTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorTelefonoTransportista);
			}
		}

		if(this.transportistaConstantesFunciones.resaltarFK_IdClienteTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdClienteTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarFK_IdClienteTransportista);
			}
		}

		if(this.transportistaConstantesFunciones.resaltarFK_IdTipoViaTransporteTransportista!=null) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransportista);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				jPanel.setBorder(this.transportistaConstantesFunciones.resaltarFK_IdTipoViaTransporteTransportista);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTransportista() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTransportista.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorIdentificacionTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarBusquedaPorIdentificacionTransportista);
			if(!this.transportistaConstantesFunciones.mostrarBusquedaPorIdentificacionTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorNombreCompletoTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarBusquedaPorNombreCompletoTransportista);
			if(!this.transportistaConstantesFunciones.mostrarBusquedaPorNombreCompletoTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorPlacaTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarBusquedaPorPlacaTransportista);
			if(!this.transportistaConstantesFunciones.mostrarBusquedaPorPlacaTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorRucTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarBusquedaPorRucTransportista);
			if(!this.transportistaConstantesFunciones.mostrarBusquedaPorRucTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorTelefonoTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarBusquedaPorTelefonoTransportista);
			if(!this.transportistaConstantesFunciones.mostrarBusquedaPorTelefonoTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdClienteTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarFK_IdClienteTransportista);
			if(!this.transportistaConstantesFunciones.mostrarFK_IdClienteTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransportista);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.transportistaConstantesFunciones.mostrarFK_IdTipoViaTransporteTransportista);
			if(!this.transportistaConstantesFunciones.mostrarFK_IdTipoViaTransporteTransportista && index>-1) {
				this.jTabbedPaneBusquedasTransportista.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTransportista() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTransportista.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorIdentificacionTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarBusquedaPorIdentificacionTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarBusquedaPorIdentificacionTransportista);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorNombreCompletoTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarBusquedaPorNombreCompletoTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarBusquedaPorNombreCompletoTransportista);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorPlacaTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarBusquedaPorPlacaTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarBusquedaPorPlacaTransportista);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorRucTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarBusquedaPorRucTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarBusquedaPorRucTransportista);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorTelefonoTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarBusquedaPorTelefonoTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarBusquedaPorTelefonoTransportista);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdClienteTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarFK_IdClienteTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarFK_IdClienteTransportista);
			}

			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransportista);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.transportistaConstantesFunciones.activarFK_IdTipoViaTransporteTransportista);
				this.jTabbedPaneBusquedasTransportista.setEnabledAt(index,this.transportistaConstantesFunciones.activarFK_IdTipoViaTransporteTransportista);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTransportista(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("BusquedaPorIdentificacion")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorIdentificacionTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarBusquedaPorIdentificacionTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorIdentificacionTransportista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorNombreCompleto")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorNombreCompletoTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarBusquedaPorNombreCompletoTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorNombreCompletoTransportista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorPlaca")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorPlacaTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarBusquedaPorPlacaTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorPlacaTransportista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorRuc")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorRucTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarBusquedaPorRucTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorRucTransportista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("BusquedaPorTelefono")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelBusquedaPorTelefonoTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarBusquedaPorTelefonoTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarBusquedaPorTelefonoTransportista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdCliente")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdClienteTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarFK_IdClienteTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarFK_IdClienteTransportista);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdTipoViaTransporte")) {
			index= this.jTabbedPaneBusquedasTransportista.indexOfComponent(this.jPanelFK_IdTipoViaTransporteTransportista);

			this.jTabbedPaneBusquedasTransportista.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTransportista.getComponent(index);

			this.transportistaConstantesFunciones.setResaltarFK_IdTipoViaTransporteTransportista(resaltar);

			jPanel.setBorder(this.transportistaConstantesFunciones.resaltarFK_IdTipoViaTransporteTransportista);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTransportista.setBorder(resaltar);
			
		}
	}	
	
	//NO FUNCIONA
	public void windowClosed(WindowEvent e) {	
	}
		
	public void windowClosing(WindowEvent e) {	    	    
	}

	public void windowOpened(WindowEvent e) {	    
	}

	public void windowIconified(WindowEvent e) {	    
	}

	public void windowDeiconified(WindowEvent e) {	    
	}

	public void windowActivated(WindowEvent e) {	    
	}

	public void windowDeactivated(WindowEvent e) {	    
	}

	public void windowGainedFocus(WindowEvent e) {	    
	}

	public void windowLostFocus(WindowEvent e) {	    
	}
	
	public void updateControlesFormularioTransportista() throws Exception {

		if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTransportista();
		this.updateVisibilidadResaltarControlesFormularioTransportista();
		this.updateHabilitarResaltarControlesFormularioTransportista();
		
	}
	
	public void updateBorderResaltarControlesFormularioTransportista() throws Exception {
		if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.transportistaConstantesFunciones.resaltaridTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setBorder(this.transportistaConstantesFunciones.resaltaridTransportista);}
		if(this.transportistaConstantesFunciones.resaltarid_empresaTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setBorder(this.transportistaConstantesFunciones.resaltarid_empresaTransportista);}
		if(this.transportistaConstantesFunciones.resaltarid_sucursalTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setBorder(this.transportistaConstantesFunciones.resaltarid_sucursalTransportista);}
		if(this.transportistaConstantesFunciones.resaltarid_tipo_via_transporteTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setBorder(this.transportistaConstantesFunciones.resaltarid_tipo_via_transporteTransportista);}
		if(this.transportistaConstantesFunciones.resaltaridentificacionTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setBorder(this.transportistaConstantesFunciones.resaltaridentificacionTransportista);}
		if(this.transportistaConstantesFunciones.resaltarrucTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setBorder(this.transportistaConstantesFunciones.resaltarrucTransportista);}
		if(this.transportistaConstantesFunciones.resaltarnombreTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setBorder(this.transportistaConstantesFunciones.resaltarnombreTransportista);}
		if(this.transportistaConstantesFunciones.resaltarapellidoTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setBorder(this.transportistaConstantesFunciones.resaltarapellidoTransportista);}
		if(this.transportistaConstantesFunciones.resaltarnombre_completoTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setBorder(this.transportistaConstantesFunciones.resaltarnombre_completoTransportista);}
		if(this.transportistaConstantesFunciones.resaltartelefonoTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setBorder(this.transportistaConstantesFunciones.resaltartelefonoTransportista);}
		if(this.transportistaConstantesFunciones.resaltardireccionTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setBorder(this.transportistaConstantesFunciones.resaltardireccionTransportista);}
		if(this.transportistaConstantesFunciones.resaltarid_clienteTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setBorder(this.transportistaConstantesFunciones.resaltarid_clienteTransportista);}
		if(this.transportistaConstantesFunciones.resaltarplacaTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setBorder(this.transportistaConstantesFunciones.resaltarplacaTransportista);}
		if(this.transportistaConstantesFunciones.resaltarnumeroTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setBorder(this.transportistaConstantesFunciones.resaltarnumeroTransportista);}
		if(this.transportistaConstantesFunciones.resaltarobservacionTransportista!=null && this.jInternalFrameDetalleFormTransportista!=null) {this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setBorder(this.transportistaConstantesFunciones.resaltarobservacionTransportista);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTransportista() throws Exception {		
		if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
	
		//this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setVisible(this.transportistaConstantesFunciones.mostraridTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelidTransportista.setVisible(this.transportistaConstantesFunciones.mostraridTransportista);
		//this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_empresaTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelid_empresaTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_empresaTransportista);
		//this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_sucursalTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelid_sucursalTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_sucursalTransportista);
		//this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_tipo_via_transporteTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelid_tipo_via_transporteTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_tipo_via_transporteTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setVisible(this.transportistaConstantesFunciones.mostraridentificacionTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelidentificacionTransportista.setVisible(this.transportistaConstantesFunciones.mostraridentificacionTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setVisible(this.transportistaConstantesFunciones.mostrarrucTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelrucTransportista.setVisible(this.transportistaConstantesFunciones.mostrarrucTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setVisible(this.transportistaConstantesFunciones.mostrarnombreTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelnombreTransportista.setVisible(this.transportistaConstantesFunciones.mostrarnombreTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setVisible(this.transportistaConstantesFunciones.mostrarapellidoTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelapellidoTransportista.setVisible(this.transportistaConstantesFunciones.mostrarapellidoTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setVisible(this.transportistaConstantesFunciones.mostrarnombre_completoTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelnombre_completoTransportista.setVisible(this.transportistaConstantesFunciones.mostrarnombre_completoTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setVisible(this.transportistaConstantesFunciones.mostrartelefonoTransportista);
		this.jInternalFrameDetalleFormTransportista.jPaneltelefonoTransportista.setVisible(this.transportistaConstantesFunciones.mostrartelefonoTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setVisible(this.transportistaConstantesFunciones.mostrardireccionTransportista);
		this.jInternalFrameDetalleFormTransportista.jPaneldireccionTransportista.setVisible(this.transportistaConstantesFunciones.mostrardireccionTransportista);
		//this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_clienteTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelid_clienteTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_clienteTransportista);
			this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportista.setVisible(this.transportistaConstantesFunciones.mostrarid_clienteTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setVisible(this.transportistaConstantesFunciones.mostrarplacaTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelplacaTransportista.setVisible(this.transportistaConstantesFunciones.mostrarplacaTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setVisible(this.transportistaConstantesFunciones.mostrarnumeroTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelnumeroTransportista.setVisible(this.transportistaConstantesFunciones.mostrarnumeroTransportista);
		//this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setVisible(this.transportistaConstantesFunciones.mostrarobservacionTransportista);
		this.jInternalFrameDetalleFormTransportista.jPanelobservacionTransportista.setVisible(this.transportistaConstantesFunciones.mostrarobservacionTransportista);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTransportista() throws Exception {
		if(this.jInternalFrameDetalleFormTransportista==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTransportista!=null) {
	
		this.jInternalFrameDetalleFormTransportista.jLabelidTransportista.setEnabled(this.transportistaConstantesFunciones.activaridTransportista);
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_empresaTransportista.setEnabled(this.transportistaConstantesFunciones.activarid_empresaTransportista);
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_sucursalTransportista.setEnabled(this.transportistaConstantesFunciones.activarid_sucursalTransportista);
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_tipo_via_transporteTransportista.setEnabled(this.transportistaConstantesFunciones.activarid_tipo_via_transporteTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldidentificacionTransportista.setEnabled(this.transportistaConstantesFunciones.activaridentificacionTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldrucTransportista.setEnabled(this.transportistaConstantesFunciones.activarrucTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreanombreTransportista.setEnabled(this.transportistaConstantesFunciones.activarnombreTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreaapellidoTransportista.setEnabled(this.transportistaConstantesFunciones.activarapellidoTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreanombre_completoTransportista.setEnabled(this.transportistaConstantesFunciones.activarnombre_completoTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldtelefonoTransportista.setEnabled(this.transportistaConstantesFunciones.activartelefonoTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreadireccionTransportista.setEnabled(this.transportistaConstantesFunciones.activardireccionTransportista);
		this.jInternalFrameDetalleFormTransportista.jComboBoxid_clienteTransportista.setEnabled(this.transportistaConstantesFunciones.activarid_clienteTransportista);
			this.jInternalFrameDetalleFormTransportista.jButtonid_clienteTransportista.setEnabled(this.transportistaConstantesFunciones.activarid_clienteTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldplacaTransportista.setEnabled(this.transportistaConstantesFunciones.activarplacaTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextFieldnumeroTransportista.setEnabled(this.transportistaConstantesFunciones.activarnumeroTransportista);
		this.jInternalFrameDetalleFormTransportista.jTextAreaobservacionTransportista.setEnabled(this.transportistaConstantesFunciones.activarobservacionTransportista);
		}
	}
	
		
}