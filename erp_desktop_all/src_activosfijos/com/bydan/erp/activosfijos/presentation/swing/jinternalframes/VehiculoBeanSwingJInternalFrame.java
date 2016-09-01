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
package com.bydan.erp.activosfijos.presentation.swing.jinternalframes;




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

import com.bydan.erp.activosfijos.util.VehiculoConstantesFunciones;
import com.bydan.erp.activosfijos.util.VehiculoParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.VehiculoParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.VehiculoBean;
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

import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.activosfijos.resources.reportes.AuxiliarReportes;


import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.activosfijos.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.cartera.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;
import com.bydan.erp.activosfijos.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.activosfijos.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.cartera.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.activosfijos.presentation.swing.jinternalframes.auxiliar.*;






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


import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.activosfijos.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.cartera.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.activosfijos.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.cartera.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.activosfijos.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VehiculoBeanSwingJInternalFrame extends VehiculoJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VehiculoBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Vehiculo> vehiculoValidator = new ClassValidator<Vehiculo>(Vehiculo.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Vehiculo vehiculo;	
	public Vehiculo vehiculoAux;
	public Vehiculo vehiculoAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Vehiculo vehiculoTotales;
	public Long idVehiculoActual;
	public Long iIdNuevoVehiculo=0L;
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

	public String sFinalQueryComboDetalleActivoFijo="";

	public List<DetalleActivoFijo> detalleactivofijosForeignKey;

	public List<DetalleActivoFijo> getdetalleactivofijosForeignKey() {
		return detalleactivofijosForeignKey;
	}

	public void setdetalleactivofijosForeignKey(List<DetalleActivoFijo> detalleactivofijosForeignKey) {
		this.detalleactivofijosForeignKey = detalleactivofijosForeignKey;
	}

	//OBJETO FK ACTUAL
	public DetalleActivoFijo detalleactivofijoForeignKey;

	public DetalleActivoFijo getdetalleactivofijoForeignKey() {
		return detalleactivofijoForeignKey;
	}

	public void setdetalleactivofijoForeignKey(DetalleActivoFijo detalleactivofijoForeignKey) {
		this.detalleactivofijoForeignKey = detalleactivofijoForeignKey;
	}

	public String sFinalQueryComboAseguradora="";

	public List<Aseguradora> aseguradorasForeignKey;

	public List<Aseguradora> getaseguradorasForeignKey() {
		return aseguradorasForeignKey;
	}

	public void setaseguradorasForeignKey(List<Aseguradora> aseguradorasForeignKey) {
		this.aseguradorasForeignKey = aseguradorasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Aseguradora aseguradoraForeignKey;

	public Aseguradora getaseguradoraForeignKey() {
		return aseguradoraForeignKey;
	}

	public void setaseguradoraForeignKey(Aseguradora aseguradoraForeignKey) {
		this.aseguradoraForeignKey = aseguradoraForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosServicioTransporte=false;

	public Boolean getIsTienePermisosServicioTransporte() {
		return isTienePermisosServicioTransporte;
	}

	public void setIsTienePermisosServicioTransporte(Boolean isTienePermisosServicioTransporte) {
		this.isTienePermisosServicioTransporte= isTienePermisosServicioTransporte;
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
	
	public Boolean isPermisoTodoVehiculo;
	public Boolean isPermisoNuevoVehiculo;
	public Boolean isPermisoActualizarVehiculo;
	public Boolean isPermisoActualizarOriginalVehiculo;
	public Boolean isPermisoEliminarVehiculo;
	public Boolean isPermisoGuardarCambiosVehiculo;
	public Boolean isPermisoConsultaVehiculo;
	public Boolean isPermisoBusquedaVehiculo;
	public Boolean isPermisoReporteVehiculo;
	public Boolean isPermisoPaginacionMedioVehiculo;
	public Boolean isPermisoPaginacionAltoVehiculo;
	public Boolean isPermisoPaginacionTodoVehiculo;
	public Boolean isPermisoCopiarVehiculo;
	public Boolean isPermisoVerFormVehiculo;
	public Boolean isPermisoDuplicarVehiculo;
	public Boolean isPermisoOrdenVehiculo;
	
	
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
	
	public VehiculoParameterReturnGeneral vehiculoReturnGeneral;
	public VehiculoParameterReturnGeneral vehiculoParameterGeneral;
	
	

	public ServicioTransporteLogic serviciotransporteLogic=null;

	public ServicioTransporteLogic getServicioTransporteLogic() {
		return serviciotransporteLogic;
	}

	public void setServicioTransporteLogic(ServicioTransporteLogic serviciotransporteLogic) {
		this.serviciotransporteLogic = serviciotransporteLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVehiculo=false;
	public Boolean esParaAccionDesdeFormularioVehiculo=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VehiculoSessionBeanAdditional vehiculoSessionBeanAdditional=null;
	
	public VehiculoSessionBeanAdditional getVehiculoSessionBeanAdditional() {
		return this.vehiculoSessionBeanAdditional;
	}
	
	public void setVehiculoSessionBeanAdditional(VehiculoSessionBeanAdditional vehiculoSessionBeanAdditional) {
		try {
			this.vehiculoSessionBeanAdditional=vehiculoSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VehiculoBeanSwingJInternalFrameAdditional vehiculoBeanSwingJInternalFrameAdditional=null;
	//public class VehiculoBeanSwingJInternalFrame
	
	public VehiculoBeanSwingJInternalFrameAdditional getVehiculoBeanSwingJInternalFrameAdditional() {
		return this.vehiculoBeanSwingJInternalFrameAdditional;
	}
	
	public void setVehiculoBeanSwingJInternalFrameAdditional(VehiculoBeanSwingJInternalFrameAdditional vehiculoBeanSwingJInternalFrameAdditional) {
		try {
			this.vehiculoBeanSwingJInternalFrameAdditional=vehiculoBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VehiculoLogic vehiculoLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Vehiculo vehiculoBean;
	public VehiculoConstantesFunciones vehiculoConstantesFunciones;
	//public VehiculoParameterReturnGeneral vehiculoReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public DetalleActivoFijoLogic detalleactivofijoLogic;
	public AseguradoraLogic aseguradoraLogic;
	
	//PARAMETROS
	
	
	//public List<Vehiculo> vehiculos;	
	//public List<Vehiculo> vehiculosEliminados;
	//public List<Vehiculo> vehiculosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVehiculo=false;
	public Boolean isVisibilidadCeldaDuplicarVehiculo=true;
	public Boolean isVisibilidadCeldaCopiarVehiculo=true;
	public Boolean isVisibilidadCeldaVerFormVehiculo=true;
	public Boolean isVisibilidadCeldaOrdenVehiculo=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVehiculo=false;
	public Boolean isVisibilidadCeldaModificarVehiculo=false;
	public Boolean isVisibilidadCeldaActualizarVehiculo=false;
	public Boolean isVisibilidadCeldaEliminarVehiculo=false;
	public Boolean isVisibilidadCeldaCancelarVehiculo=false;
	public Boolean isVisibilidadCeldaGuardarVehiculo=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVehiculo=false;	
	
	
	public Boolean isVisibilidadFK_IdAseguradora=false;
	public Boolean isVisibilidadFK_IdDetalleActivoFijo=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoVehiculo() {
		return this.iIdNuevoVehiculo;
	}

	public void setiIdNuevoVehiculo(Long iIdNuevoVehiculo) {
		this.iIdNuevoVehiculo = iIdNuevoVehiculo;
	}
	
	public Long getidVehiculoActual() {
		return this.idVehiculoActual;
	}

	public void setidVehiculoActual(Long idVehiculoActual) {
		this.idVehiculoActual = idVehiculoActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Vehiculo getvehiculo() {
		return this.vehiculo;
	}

	public void setvehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public Vehiculo getvehiculoAux() {
		return this.vehiculoAux;
	}

	public void setvehiculoAux(Vehiculo vehiculoAux) {
		this.vehiculoAux = vehiculoAux;
	}				
	
	public Vehiculo getvehiculoAnterior() {
		return this.vehiculoAnterior;
	}

	public void setvehiculoAnterior(Vehiculo vehiculoAnterior) {
		this.vehiculoAnterior = vehiculoAnterior;
	}	
	
	public Vehiculo getvehiculoTotales() {
		return this.vehiculoTotales;
	}

	public void setvehiculoTotales(Vehiculo vehiculoTotales) {
		this.vehiculoTotales = vehiculoTotales;
	}	
	
	public Vehiculo getvehiculoBean() {
		return this.vehiculoBean;
	}

	public void setvehiculoBean(Vehiculo vehiculoBean) {
		this.vehiculoBean = vehiculoBean;
	}	
	
	public VehiculoParameterReturnGeneral getvehiculoReturnGeneral() {
		return this.vehiculoReturnGeneral;
	}

	public void setvehiculoReturnGeneral(VehiculoParameterReturnGeneral vehiculoReturnGeneral) {
		this.vehiculoReturnGeneral = vehiculoReturnGeneral;
	}	
	
	
	public Long id_aseguradoraFK_IdAseguradora=-1L;

	public Long getid_aseguradoraFK_IdAseguradora() {
		return this.id_aseguradoraFK_IdAseguradora;
	}

	public void setid_aseguradoraFK_IdAseguradora(Long id_aseguradoraFK_IdAseguradora) {
		this.id_aseguradoraFK_IdAseguradora = id_aseguradoraFK_IdAseguradora;
	}

	public Long id_detalle_activo_fijoFK_IdDetalleActivoFijo=-1L;

	public Long getid_detalle_activo_fijoFK_IdDetalleActivoFijo() {
		return this.id_detalle_activo_fijoFK_IdDetalleActivoFijo;
	}

	public void setid_detalle_activo_fijoFK_IdDetalleActivoFijo(Long id_detalle_activo_fijoFK_IdDetalleActivoFijo) {
		this.id_detalle_activo_fijoFK_IdDetalleActivoFijo = id_detalle_activo_fijoFK_IdDetalleActivoFijo;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VehiculoLogic getVehiculoLogic()	{		
		return vehiculoLogic;
	}

	public void setVehiculoLogic(VehiculoLogic vehiculoLogic) {
		this.vehiculoLogic = vehiculoLogic;
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
	
	public Boolean getIsEsNuevoVehiculo() {
		return isEsNuevoVehiculo;
	}

	public void setIsEsNuevoVehiculo(Boolean isEsNuevoVehiculo) {
		this.isEsNuevoVehiculo = isEsNuevoVehiculo;
	}

	public Boolean getEsParaAccionDesdeFormularioVehiculo() {
		return esParaAccionDesdeFormularioVehiculo;
	}
	
	public void setEsParaAccionDesdeFormularioVehiculo(Boolean esParaAccionDesdeFormularioVehiculo) {
		this.esParaAccionDesdeFormularioVehiculo = esParaAccionDesdeFormularioVehiculo;
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

			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
			}

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(vehiculoSessionBean.getlidEmpresaActual());
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

			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
			}

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(vehiculoSessionBean.getlidSucursalActual());
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

	public void cargarCombosDetalleActivoFijosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			DetalleActivoFijoLogic detalleactivofijoLogic=new DetalleActivoFijoLogic();

			//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
			}

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//detalleactivofijoLogic.getDetalleActivoFijoDataAccess().setIsForForeingKeyData(true);

					detalleactivofijoLogic.getTodosDetalleActivoFijosWithConnection(sFinalQuery,new Pagination());

					this.detalleactivofijosForeignKey=detalleactivofijoLogic.getDetalleActivoFijos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaDetalleActivoFijo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleactivofijoLogic.getEntityWithConnection(vehiculoSessionBean.getlidDetalleActivoFijoActual());
					this.detalleactivofijosForeignKey.add(detalleactivofijoLogic.getDetalleActivoFijo());
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

	public void cargarCombosAseguradorasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aseguradorasForeignKey=new ArrayList<Aseguradora>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AseguradoraLogic aseguradoraLogic=new AseguradoraLogic();

			//aseguradoraLogic.getAseguradoraDataAccess().setIsForForeingKeyData(true);

			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
			}

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionAseguradora()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//aseguradoraLogic.getAseguradoraDataAccess().setIsForForeingKeyData(true);

					aseguradoraLogic.getTodosAseguradorasWithConnection(sFinalQuery,new Pagination());

					this.aseguradorasForeignKey=aseguradoraLogic.getAseguradoras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAseguradora(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					aseguradoraLogic.getEntityWithConnection(vehiculoSessionBean.getlidAseguradoraActual());
					this.aseguradorasForeignKey.add(aseguradoraLogic.getAseguradora());
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

					if(this.vehiculo!=null) {
						this.vehiculo.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVehiculo.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.getItemCount()>0) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVehiculoGenerico)throws Exception
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
				jComboBoxid_empresaVehiculoGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVehiculoGenerico!=null && jComboBoxid_empresaVehiculoGenerico.getItemCount()>0) {
					jComboBoxid_empresaVehiculoGenerico.setSelectedIndex(0);
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

					if(this.vehiculo!=null) {
						this.vehiculo.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalVehiculo.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.getItemCount()>0) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalVehiculoGenerico)throws Exception
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
				jComboBoxid_sucursalVehiculoGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalVehiculoGenerico!=null && jComboBoxid_sucursalVehiculoGenerico.getItemCount()>0) {
					jComboBoxid_sucursalVehiculoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualDetalleActivoFijoForeignKey(Long idDetalleActivoFijoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(detalleactivofijoTemp!=null) {

					if(this.vehiculo!=null) {
						this.vehiculo.setDetalleActivoFijo(detalleactivofijoTemp);
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setSelectedItem(detalleactivofijoTemp);
					}
				} else {
					//jComboBoxid_detalle_activo_fijoVehiculo.setSelectedItem(detalleactivofijoTemp);
					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.getItemCount()>0) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){
					if(detalleactivofijoTemp!=null && jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo!=null) {
						jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setSelectedItem(detalleactivofijoTemp);
					} else {
						if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo!=null) {
							//jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setSelectedItem(detalleactivofijoTemp);
							if(jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.getItemCount()>0) {
								jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setSelectedIndex(0);
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

	public String getActualDetalleActivoFijoForeignKeyDescripcion(Long idDetalleActivoFijoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}


			sDescripcion=DetalleActivoFijoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualDetalleActivoFijoForeignKeyGenerico(Long idDetalleActivoFijoSeleccionado,JComboBox jComboBoxid_detalle_activo_fijoVehiculoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoTemp=null;

			for(DetalleActivoFijo detalleactivofijoAux:detalleactivofijosForeignKey) {
				if(detalleactivofijoAux.getId()!=null && detalleactivofijoAux.getId().equals(idDetalleActivoFijoSeleccionado)) {
					detalleactivofijoTemp=detalleactivofijoAux;
					break;
				}
			}

			if(detalleactivofijoTemp!=null) {
				jComboBoxid_detalle_activo_fijoVehiculoGenerico.setSelectedItem(detalleactivofijoTemp);
			} else {
				if(jComboBoxid_detalle_activo_fijoVehiculoGenerico!=null && jComboBoxid_detalle_activo_fijoVehiculoGenerico.getItemCount()>0) {
					jComboBoxid_detalle_activo_fijoVehiculoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAseguradoraForeignKey(Long idAseguradoraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Aseguradora  aseguradoraTemp=null;

			for(Aseguradora aseguradoraAux:aseguradorasForeignKey) {
				if(aseguradoraAux.getId()!=null && aseguradoraAux.getId().equals(idAseguradoraSeleccionado)) {
					aseguradoraTemp=aseguradoraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(aseguradoraTemp!=null) {

					if(this.vehiculo!=null) {
						this.vehiculo.setAseguradora(aseguradoraTemp);
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setSelectedItem(aseguradoraTemp);
					}
				} else {
					//jComboBoxid_aseguradoraVehiculo.setSelectedItem(aseguradoraTemp);
					if(this.jInternalFrameDetalleFormVehiculo!=null) {
						if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.getItemCount()>0) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAseguradora") || sFormularioTipoBusqueda.equals("Todos")){
					if(aseguradoraTemp!=null && jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo!=null) {
						jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setSelectedItem(aseguradoraTemp);
					} else {
						if(jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo!=null) {
							//jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setSelectedItem(aseguradoraTemp);
							if(jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.getItemCount()>0) {
								jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setSelectedIndex(0);
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

	public String getActualAseguradoraForeignKeyDescripcion(Long idAseguradoraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Aseguradora  aseguradoraTemp=null;

			for(Aseguradora aseguradoraAux:aseguradorasForeignKey) {
				if(aseguradoraAux.getId()!=null && aseguradoraAux.getId().equals(idAseguradoraSeleccionado)) {
					aseguradoraTemp=aseguradoraAux;
					break;
				}
			}


			sDescripcion=AseguradoraConstantesFunciones.getAseguradoraDescripcion(aseguradoraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAseguradoraForeignKeyGenerico(Long idAseguradoraSeleccionado,JComboBox jComboBoxid_aseguradoraVehiculoGenerico)throws Exception
	{
		try
		{
			Aseguradora  aseguradoraTemp=null;

			for(Aseguradora aseguradoraAux:aseguradorasForeignKey) {
				if(aseguradoraAux.getId()!=null && aseguradoraAux.getId().equals(idAseguradoraSeleccionado)) {
					aseguradoraTemp=aseguradoraAux;
					break;
				}
			}

			if(aseguradoraTemp!=null) {
				jComboBoxid_aseguradoraVehiculoGenerico.setSelectedItem(aseguradoraTemp);
			} else {
				if(jComboBoxid_aseguradoraVehiculoGenerico!=null && jComboBoxid_aseguradoraVehiculoGenerico.getItemCount()>0) {
					jComboBoxid_aseguradoraVehiculoGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Vehiculo vehiculo,JComboBox jComboBoxid_empresaVehiculoGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVehiculoGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVehiculoGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				vehiculo.setid_empresa(empresaAux.getId());
				vehiculo.setempresa_descripcion(VehiculoConstantesFunciones.getEmpresaDescripcion(empresaAux));
				vehiculo.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(Vehiculo vehiculo,JComboBox jComboBoxid_sucursalVehiculoGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalVehiculoGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalVehiculoGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				vehiculo.setid_sucursal(sucursalAux.getId());
				vehiculo.setsucursal_descripcion(VehiculoConstantesFunciones.getSucursalDescripcion(sucursalAux));
				vehiculo.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarDetalleActivoFijoForeignKey(Vehiculo vehiculo,JComboBox jComboBoxid_detalle_activo_fijoVehiculoGenerico)throws Exception
	{
		try
		{
			DetalleActivoFijo  detalleactivofijoAux=new DetalleActivoFijo();

			if(jComboBoxid_detalle_activo_fijoVehiculoGenerico==null) {
				detalleactivofijoAux=(DetalleActivoFijo)this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.getSelectedItem();
			} else {
				detalleactivofijoAux=(DetalleActivoFijo)jComboBoxid_detalle_activo_fijoVehiculoGenerico.getSelectedItem();
			}

			if(detalleactivofijoAux!=null && detalleactivofijoAux.getId()!=null) {
				vehiculo.setid_detalle_activo_fijo(detalleactivofijoAux.getId());
				vehiculo.setdetalleactivofijo_descripcion(VehiculoConstantesFunciones.getDetalleActivoFijoDescripcion(detalleactivofijoAux));
				vehiculo.setDetalleActivoFijo(detalleactivofijoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAseguradoraForeignKey(Vehiculo vehiculo,JComboBox jComboBoxid_aseguradoraVehiculoGenerico)throws Exception
	{
		try
		{
			Aseguradora  aseguradoraAux=new Aseguradora();

			if(jComboBoxid_aseguradoraVehiculoGenerico==null) {
				aseguradoraAux=(Aseguradora)this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.getSelectedItem();
			} else {
				aseguradoraAux=(Aseguradora)jComboBoxid_aseguradoraVehiculoGenerico.getSelectedItem();
			}

			if(aseguradoraAux!=null && aseguradoraAux.getId()!=null) {
				vehiculo.setid_aseguradora(aseguradoraAux.getId());
				vehiculo.setaseguradora_descripcion(VehiculoConstantesFunciones.getAseguradoraDescripcion(aseguradoraAux));
				vehiculo.setAseguradora(aseguradoraAux);			}
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

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) { 
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) { 
					}

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
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

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) { 
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) { 
					}

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameDetalleActivoFijosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingDetalleActivoFijo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) { 
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.addItem(detalleactivofijo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) { 
					}

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdDetalleActivoFijo") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.removeAllItems();

							for(DetalleActivoFijo detalleactivofijo:this.detalleactivofijosForeignKey) {
								this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.addItem(detalleactivofijo);
							}
						}

						if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAseguradorasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAseguradora=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) { 
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.removeAllItems();

							for(Aseguradora aseguradora:this.aseguradorasForeignKey) {
								this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.addItem(aseguradora);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVehiculo!=null) { 
					}

					if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAseguradora") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.removeAllItems();

							for(Aseguradora aseguradora:this.aseguradorasForeignKey) {
								this.jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.addItem(aseguradora);
							}
						}

						if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameDetalleActivoFijoForeignKey(DetalleActivoFijo detalleactivofijo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setSelectedItem(detalleactivofijo);
						}
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setSelectedItem(detalleactivofijo);
						} else {
							this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAseguradoraForeignKey(Aseguradora aseguradora,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setSelectedItem(aseguradora);
						}
					} else {
						if(this.jInternalFrameDetalleFormVehiculo!=null) {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setSelectedItem(aseguradora);
						} else {
							this.jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesVehiculo() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VehiculoConstantesFunciones.refrescarForeignKeysDescripcionesVehiculo(this.vehiculoLogic.getVehiculos());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VehiculoConstantesFunciones.refrescarForeignKeysDescripcionesVehiculo(this.vehiculos);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(DetalleActivoFijo.class));
		classes.add(new Classe(Aseguradora.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vehiculoLogic.setVehiculos(this.vehiculos);
			vehiculoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VehiculoParameterReturnGeneral getVehiculoParameterGeneral() {
		return this.vehiculoParameterGeneral;
	}
	
	public void setVehiculoParameterGeneral(VehiculoParameterReturnGeneral vehiculoParameterGeneral) {
		this.vehiculoParameterGeneral = vehiculoParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVehiculo() {
		return isPermisoTodoVehiculo;
	}

	public void setIsPermisoTodoVehiculo(Boolean isPermisoTodoVehiculo) {
		this.isPermisoTodoVehiculo = isPermisoTodoVehiculo;
	}

	public Boolean getIsPermisoNuevoVehiculo() {
		return isPermisoNuevoVehiculo;
	}

	public void setIsPermisoNuevoVehiculo(Boolean isPermisoNuevoVehiculo) {
		this.isPermisoNuevoVehiculo = isPermisoNuevoVehiculo;
	}

	public Boolean getIsPermisoActualizarVehiculo() {
		return isPermisoActualizarVehiculo;
	}

	public void setIsPermisoActualizarVehiculo(Boolean isPermisoActualizarVehiculo) {
		this.isPermisoActualizarVehiculo = isPermisoActualizarVehiculo;
	}

	public Boolean getIsPermisoEliminarVehiculo() {
		return isPermisoEliminarVehiculo;
	}

	public void setIsPermisoEliminarVehiculo(Boolean isPermisoEliminarVehiculo) {
		this.isPermisoEliminarVehiculo = isPermisoEliminarVehiculo;
	}

	public Boolean getIsPermisoGuardarCambiosVehiculo() {
		return isPermisoGuardarCambiosVehiculo;
	}

	public void setIsPermisoGuardarCambiosVehiculo(Boolean isPermisoGuardarCambiosVehiculo) {
		this.isPermisoGuardarCambiosVehiculo = isPermisoGuardarCambiosVehiculo;
	}
	
	public Boolean getIsPermisoConsultaVehiculo() {
		return isPermisoConsultaVehiculo;
	}

	public void setIsPermisoConsultaVehiculo(Boolean isPermisoConsultaVehiculo) {
		this.isPermisoConsultaVehiculo = isPermisoConsultaVehiculo;
	}

	public Boolean getIsPermisoBusquedaVehiculo() {
		return isPermisoBusquedaVehiculo;
	}

	public void setIsPermisoBusquedaVehiculo(Boolean isPermisoBusquedaVehiculo) {
		this.isPermisoBusquedaVehiculo = isPermisoBusquedaVehiculo;
	}

	public Boolean getIsPermisoReporteVehiculo() {
		return isPermisoReporteVehiculo;
	}

	public void setIsPermisoReporteVehiculo(Boolean isPermisoReporteVehiculo) {
		this.isPermisoReporteVehiculo = isPermisoReporteVehiculo;
	}
	
	public Boolean getIsPermisoPaginacionMedioVehiculo() {
		return isPermisoPaginacionMedioVehiculo;
	}

	public void setIsPermisoPaginacionMedioVehiculo(Boolean isPermisoPaginacionMedioVehiculo) {
		this.isPermisoPaginacionMedioVehiculo = isPermisoPaginacionMedioVehiculo;
	}
	
	public Boolean getIsPermisoPaginacionTodoVehiculo() {
		return isPermisoPaginacionTodoVehiculo;
	}

	public void setIsPermisoPaginacionTodoVehiculo(Boolean isPermisoPaginacionTodoVehiculo) {
		this.isPermisoPaginacionTodoVehiculo = isPermisoPaginacionTodoVehiculo;
	}
	
	public Boolean getIsPermisoPaginacionAltoVehiculo() {
		return isPermisoPaginacionAltoVehiculo;
	}

	public void setIsPermisoPaginacionAltoVehiculo(Boolean isPermisoPaginacionAltoVehiculo) {
		this.isPermisoPaginacionAltoVehiculo = isPermisoPaginacionAltoVehiculo;
	}
	
	public Boolean getIsPermisoCopiarVehiculo() {
		return isPermisoCopiarVehiculo;
	}

	public void setIsPermisoCopiarVehiculo(Boolean isPermisoCopiarVehiculo) {
		this.isPermisoCopiarVehiculo = isPermisoCopiarVehiculo;
	}
	
	public Boolean getIsPermisoVerFormVehiculo() {
		return isPermisoVerFormVehiculo;
	}

	public void setIsPermisoVerFormVehiculo(Boolean isPermisoVerFormVehiculo) {
		this.isPermisoVerFormVehiculo = isPermisoVerFormVehiculo;
	}
	
	public Boolean getIsPermisoDuplicarVehiculo() {
		return isPermisoDuplicarVehiculo;
	}

	public void setIsPermisoDuplicarVehiculo(Boolean isPermisoDuplicarVehiculo) {
		this.isPermisoDuplicarVehiculo = isPermisoDuplicarVehiculo;
	}
	
	public Boolean getIsPermisoOrdenVehiculo() {
		return isPermisoOrdenVehiculo;
	}

	public void setIsPermisoOrdenVehiculo(Boolean isPermisoOrdenVehiculo) {
		this.isPermisoOrdenVehiculo = isPermisoOrdenVehiculo;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVehiculo() {
		return isVisibilidadCeldaNuevoVehiculo;
	}

	public void setIsVisibilidadCeldaNuevoVehiculo(Boolean isVisibilidadCeldaNuevoVehiculo) {
		this.isVisibilidadCeldaNuevoVehiculo = isVisibilidadCeldaNuevoVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVehiculo() {
		return isVisibilidadCeldaDuplicarVehiculo;
	}

	public void setIsVisibilidadCeldaDuplicarVehiculo(Boolean isVisibilidadCeldaDuplicarVehiculo) {
		this.isVisibilidadCeldaDuplicarVehiculo = isVisibilidadCeldaDuplicarVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVehiculo() {
		return isVisibilidadCeldaCopiarVehiculo;
	}

	public void setIsVisibilidadCeldaCopiarVehiculo(Boolean isVisibilidadCeldaCopiarVehiculo) {
		this.isVisibilidadCeldaCopiarVehiculo = isVisibilidadCeldaCopiarVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVehiculo() {
		return isVisibilidadCeldaVerFormVehiculo;
	}

	public void setIsVisibilidadCeldaVerFormVehiculo(Boolean isVisibilidadCeldaVerFormVehiculo) {
		this.isVisibilidadCeldaVerFormVehiculo = isVisibilidadCeldaVerFormVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVehiculo() {
		return isVisibilidadCeldaOrdenVehiculo;
	}

	public void setIsVisibilidadCeldaOrdenVehiculo(Boolean isVisibilidadCeldaOrdenVehiculo) {
		this.isVisibilidadCeldaOrdenVehiculo = isVisibilidadCeldaOrdenVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVehiculo() {
		return isVisibilidadCeldaNuevoRelacionesVehiculo;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVehiculo(Boolean isVisibilidadCeldaNuevoRelacionesVehiculo) {
		this.isVisibilidadCeldaNuevoRelacionesVehiculo = isVisibilidadCeldaNuevoRelacionesVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVehiculo() {
		return isVisibilidadCeldaModificarVehiculo;
	}

	public void setIsVisibilidadCeldaModificarVehiculo(Boolean isVisibilidadCeldaModificarVehiculo) {
		this.isVisibilidadCeldaModificarVehiculo = isVisibilidadCeldaModificarVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVehiculo() {
		return isVisibilidadCeldaActualizarVehiculo;
	}

	public void setIsVisibilidadCeldaActualizarVehiculo(Boolean isVisibilidadCeldaActualizarVehiculo) {
		this.isVisibilidadCeldaActualizarVehiculo = isVisibilidadCeldaActualizarVehiculo;
	}

	public Boolean getIsVisibilidadCeldaEliminarVehiculo() {
		return isVisibilidadCeldaEliminarVehiculo;
	}

	public void setIsVisibilidadCeldaEliminarVehiculo(Boolean isVisibilidadCeldaEliminarVehiculo) {
		this.isVisibilidadCeldaEliminarVehiculo = isVisibilidadCeldaEliminarVehiculo;
	}

	public Boolean getIsVisibilidadCeldaCancelarVehiculo() {
		return isVisibilidadCeldaCancelarVehiculo;
	}

	public void setIsVisibilidadCeldaCancelarVehiculo(Boolean isVisibilidadCeldaCancelarVehiculo) {
		this.isVisibilidadCeldaCancelarVehiculo = isVisibilidadCeldaCancelarVehiculo;
	}

	public Boolean getIsVisibilidadCeldaGuardarVehiculo() {
		return isVisibilidadCeldaGuardarVehiculo;
	}

	public void setIsVisibilidadCeldaGuardarVehiculo(Boolean isVisibilidadCeldaGuardarVehiculo) {
		this.isVisibilidadCeldaGuardarVehiculo = isVisibilidadCeldaGuardarVehiculo;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVehiculo() {
		return isVisibilidadCeldaGuardarCambiosVehiculo;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVehiculo(Boolean isVisibilidadCeldaGuardarCambiosVehiculo) {
		this.isVisibilidadCeldaGuardarCambiosVehiculo = isVisibilidadCeldaGuardarCambiosVehiculo;
	}
		
	public VehiculoSessionBean getvehiculoSessionBean() {
		return this.vehiculoSessionBean;
	}
	
	public void setvehiculoSessionBean(VehiculoSessionBean vehiculoSessionBean) {
		this.vehiculoSessionBean=vehiculoSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAseguradora() {
		return this.isVisibilidadFK_IdAseguradora;
	}

	public void setisVisibilidadFK_IdAseguradora(Boolean isVisibilidadFK_IdAseguradora) {
		this.isVisibilidadFK_IdAseguradora=isVisibilidadFK_IdAseguradora;
	}

	public Boolean getisVisibilidadFK_IdDetalleActivoFijo() {
		return this.isVisibilidadFK_IdDetalleActivoFijo;
	}

	public void setisVisibilidadFK_IdDetalleActivoFijo(Boolean isVisibilidadFK_IdDetalleActivoFijo) {
		this.isVisibilidadFK_IdDetalleActivoFijo=isVisibilidadFK_IdDetalleActivoFijo;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVehiculo(Vehiculo vehiculo)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(vehiculo,null);
				this.setActualParaGuardarSucursalForeignKey(vehiculo,null);
				this.setActualParaGuardarDetalleActivoFijoForeignKey(vehiculo,null);
				this.setActualParaGuardarAseguradoraForeignKey(vehiculo,null);
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
	
	public void bugActualizarReferenciaActual(Vehiculo vehiculo,Vehiculo vehiculoAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVehiculo(vehiculo);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vehiculoAux.setId(vehiculo.getId());
		vehiculoAux.setVersionRow(vehiculo.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVehiculo();
		
			int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vehiculoValidator.getInvalidValues(this.vehiculo);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vehiculoLogic.setDatosCliente(datosCliente);
			vehiculoLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vehiculoAux=new  Vehiculo();
				
				vehiculoAux.setIsNew(true);
				vehiculoAux.setIsChanged(true);
				
				vehiculoAux.setVehiculoOriginal(this.vehiculo);
				
				vehiculoAux.setId(this.vehiculo.getId());	
				vehiculoAux.setVersionRow(this.vehiculo.getVersionRow());	
				vehiculoAux.setid_empresa(this.vehiculo.getid_empresa());	
				vehiculoAux.setid_sucursal(this.vehiculo.getid_sucursal());	
				vehiculoAux.setid_detalle_activo_fijo(this.vehiculo.getid_detalle_activo_fijo());	
				vehiculoAux.setid_aseguradora(this.vehiculo.getid_aseguradora());	
				vehiculoAux.setnumero_poliza(this.vehiculo.getnumero_poliza());	
				vehiculoAux.setfecha_emision(this.vehiculo.getfecha_emision());	
				vehiculoAux.setfecha_vencimiento(this.vehiculo.getfecha_vencimiento());	
				vehiculoAux.setvalor_asegurado(this.vehiculo.getvalor_asegurado());	
				vehiculoAux.setvalor_deducible(this.vehiculo.getvalor_deducible());	
				vehiculoAux.setnumero_matricula(this.vehiculo.getnumero_matricula());	
				vehiculoAux.setnumero_motor(this.vehiculo.getnumero_motor());	
				vehiculoAux.setnumero_chasis(this.vehiculo.getnumero_chasis());	
				vehiculoAux.setnumero_placa(this.vehiculo.getnumero_placa());	
				vehiculoAux.setvalor_comercial(this.vehiculo.getvalor_comercial());	
				vehiculoAux.setdescripcion(this.vehiculo.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vehiculoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vehiculoAux,vehiculoLogic.getVehiculos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoAux,vehiculos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vehiculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.saveVehiculos();//WithConnection
						//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vehiculo,vehiculoAux);
					
					this.refrescarForeignKeysDescripcionesVehiculo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes().addAll(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes.addAll(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vehiculoLogic.saveVehiculoRelaciones(vehiculoAux,this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());//WithConnection
								//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vehiculo,vehiculoAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(new ArrayList<ServicioTransporte>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes= new ArrayList<ServicioTransporte>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();}
							vehiculoAux.setServicioTransportes(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vehiculoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vehiculoAux,vehiculoLogic.getVehiculos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vehiculoAux,vehiculos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vehiculo,vehiculoAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vehiculoAux=new  Vehiculo();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vehiculoSessionBean.getEsGuardarRelacionado() 
					|| (this.vehiculoSessionBean.getEsGuardarRelacionado() && this.vehiculo.getId()>=0)) {
						
					vehiculoAux.setIsNew(false);
				}
				
				vehiculoAux.setIsDeleted(false);
			
				vehiculoAux.setId(this.vehiculo.getId());	
				vehiculoAux.setVersionRow(this.vehiculo.getVersionRow());	
				vehiculoAux.setid_empresa(this.vehiculo.getid_empresa());	
				vehiculoAux.setid_sucursal(this.vehiculo.getid_sucursal());	
				vehiculoAux.setid_detalle_activo_fijo(this.vehiculo.getid_detalle_activo_fijo());	
				vehiculoAux.setid_aseguradora(this.vehiculo.getid_aseguradora());	
				vehiculoAux.setnumero_poliza(this.vehiculo.getnumero_poliza());	
				vehiculoAux.setfecha_emision(this.vehiculo.getfecha_emision());	
				vehiculoAux.setfecha_vencimiento(this.vehiculo.getfecha_vencimiento());	
				vehiculoAux.setvalor_asegurado(this.vehiculo.getvalor_asegurado());	
				vehiculoAux.setvalor_deducible(this.vehiculo.getvalor_deducible());	
				vehiculoAux.setnumero_matricula(this.vehiculo.getnumero_matricula());	
				vehiculoAux.setnumero_motor(this.vehiculo.getnumero_motor());	
				vehiculoAux.setnumero_chasis(this.vehiculo.getnumero_chasis());	
				vehiculoAux.setnumero_placa(this.vehiculo.getnumero_placa());	
				vehiculoAux.setvalor_comercial(this.vehiculo.getvalor_comercial());	
				vehiculoAux.setdescripcion(this.vehiculo.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vehiculoAux,vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoAux,vehiculos);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vehiculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.saveVehiculos();//WithConnection
						//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vehiculo,vehiculoAux);
					
					this.refrescarForeignKeysDescripcionesVehiculo();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes().addAll(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes.addAll(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						}
						//ARCHITECTURE
						
						if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vehiculoLogic.saveVehiculoRelaciones(vehiculoAux,this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());//WithConnection
								//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vehiculo,vehiculoAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(new ArrayList<ServicioTransporte>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes= new ArrayList<ServicioTransporte>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();}
							vehiculoAux.setServicioTransportes(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vehiculoSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vehiculoAux,vehiculoLogic.getVehiculos());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vehiculoAux,vehiculos);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vehiculo,vehiculoAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vehiculoAux=new  Vehiculo();
				
				vehiculoAux.setIsNew(false);
				vehiculoAux.setIsChanged(false);
				
				vehiculoAux.setIsDeleted(true);
				
				vehiculoAux.setId(this.vehiculo.getId());	
				vehiculoAux.setVersionRow(this.vehiculo.getVersionRow());	
				vehiculoAux.setid_empresa(this.vehiculo.getid_empresa());	
				vehiculoAux.setid_sucursal(this.vehiculo.getid_sucursal());	
				vehiculoAux.setid_detalle_activo_fijo(this.vehiculo.getid_detalle_activo_fijo());	
				vehiculoAux.setid_aseguradora(this.vehiculo.getid_aseguradora());	
				vehiculoAux.setnumero_poliza(this.vehiculo.getnumero_poliza());	
				vehiculoAux.setfecha_emision(this.vehiculo.getfecha_emision());	
				vehiculoAux.setfecha_vencimiento(this.vehiculo.getfecha_vencimiento());	
				vehiculoAux.setvalor_asegurado(this.vehiculo.getvalor_asegurado());	
				vehiculoAux.setvalor_deducible(this.vehiculo.getvalor_deducible());	
				vehiculoAux.setnumero_matricula(this.vehiculo.getnumero_matricula());	
				vehiculoAux.setnumero_motor(this.vehiculo.getnumero_motor());	
				vehiculoAux.setnumero_chasis(this.vehiculo.getnumero_chasis());	
				vehiculoAux.setnumero_placa(this.vehiculo.getnumero_placa());	
				vehiculoAux.setvalor_comercial(this.vehiculo.getvalor_comercial());	
				vehiculoAux.setdescripcion(this.vehiculo.getdescripcion());	
				
				if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vehiculoAux.getId()>=0) {	
						this.vehiculosEliminados.add(vehiculoAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vehiculoAux,vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoAux,vehiculos);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vehiculoSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.saveVehiculos();//WithConnection
						//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes().addAll(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes.addAll(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportesEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vehiculoLogic.saveVehiculoRelaciones(vehiculoAux,this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());//WithConnection
								//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(new ArrayList<ServicioTransporte>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes= new ArrayList<ServicioTransporte>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();}
							vehiculoAux.setServicioTransportes(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vehiculoSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vehiculoAux,vehiculoLogic.getVehiculos());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vehiculoAux,vehiculos);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getVehiculos().addAll(this.vehiculosEliminados);
					
					vehiculoLogic.saveVehiculos();//WithConnection
					//vehiculoLogic.getSetVersionRowVehiculos();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVehiculo();
				
				this.vehiculosEliminados= new ArrayList<Vehiculo>();		
			}
			
			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vehiculo GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vehiculo=vehiculoAux;
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
      		//this.finishProcessVehiculo();
      	}
		
	}	
	
	public void actualizarRelaciones(Vehiculo vehiculoLocal) throws Exception {
		
		if(this.vehiculoSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				vehiculoLocal.setServicioTransportes(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
			
			} else {
			
				vehiculoLocal.setServicioTransportes(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransportes);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Vehiculo vehiculoLocal) throws Exception {	
		if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				vehiculoLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				vehiculoLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(DetalleActivoFijoDetalleFormJInternalFrame.class)) {
				DetalleActivoFijoBeanSwingJInternalFrame detalleactivofijoBeanSwingJInternalFrameLocal=(DetalleActivoFijoBeanSwingJInternalFrame) ((DetalleActivoFijoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				detalleactivofijoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.getdetalleactivofijo(),true);
				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarLista(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo,this.detalleactivofijosForeignKey);

				detalleactivofijoBeanSwingJInternalFrameLocal.actualizarRelaciones(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				vehiculoLocal.setDetalleActivoFijo(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo);

				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey("Formulario");
				this.setActualDetalleActivoFijoForeignKey(detalleactivofijoBeanSwingJInternalFrameLocal.detalleactivofijo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AseguradoraDetalleFormJInternalFrame.class)) {
				AseguradoraBeanSwingJInternalFrame aseguradoraBeanSwingJInternalFrameLocal=(AseguradoraBeanSwingJInternalFrame) ((AseguradoraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				aseguradoraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAseguradora(aseguradoraBeanSwingJInternalFrameLocal.getaseguradora(),true);
				aseguradoraBeanSwingJInternalFrameLocal.actualizarLista(aseguradoraBeanSwingJInternalFrameLocal.aseguradora,this.aseguradorasForeignKey);

				aseguradoraBeanSwingJInternalFrameLocal.actualizarRelaciones(aseguradoraBeanSwingJInternalFrameLocal.aseguradora);

				vehiculoLocal.setAseguradora(aseguradoraBeanSwingJInternalFrameLocal.aseguradora);

				this.addItemDefectoCombosForeignKeyAseguradora();
				this.cargarCombosFrameAseguradorasForeignKey("Formulario");
				this.setActualAseguradoraForeignKey(aseguradoraBeanSwingJInternalFrameLocal.aseguradora.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVehiculoActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vehiculoValidator.getInvalidValues(this.vehiculo);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Vehiculo vehiculo,List<Vehiculo> vehiculos) throws Exception {
		try	{		
			VehiculoConstantesFunciones.actualizarLista(vehiculo,vehiculos,this.vehiculoSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Vehiculo vehiculo,List<Vehiculo> vehiculos) throws Exception {
		try	{			
			VehiculoConstantesFunciones.actualizarSelectedLista(vehiculo,vehiculos);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Vehiculo> vehiculosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vehiculosLocal=this.vehiculoLogic.getVehiculos();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vehiculosLocal=this.vehiculos;
			}
			//ARCHITECTURE
		
			for(Vehiculo vehiculoLocal:vehiculosLocal) {
				if(this.permiteMantenimiento(vehiculoLocal) && vehiculoLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VehiculoConstantesFunciones.getVehiculoLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelid_empresaVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelid_sucursalVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.IDDETALLEACTIVOFIJO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelid_detalle_activo_fijoVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.IDASEGURADORA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelid_aseguradoraVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.NUMEROPOLIZA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_polizaVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.FECHAEMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelfecha_emisionVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.FECHAVENCIMIENTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelfecha_vencimientoVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.VALORASEGURADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_aseguradoVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.VALORDEDUCIBLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_deducibleVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.NUMEROMATRICULA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_matriculaVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.NUMEROMOTOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_motorVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.NUMEROCHASIS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_chasisVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.NUMEROPLACA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_placaVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.VALORCOMERCIAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_comercialVehiculo,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VehiculoConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabeldescripcionVehiculo,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelid_empresaVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelid_sucursalVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelid_detalle_activo_fijoVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelid_aseguradoraVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_polizaVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelfecha_emisionVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelfecha_vencimientoVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_aseguradoVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_deducibleVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_matriculaVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_motorVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_chasisVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_placaVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_comercialVehiculo,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVehiculo.jLabeldescripcionVehiculo,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("ServicioTransporte")) {
			if(this.vehiculo==null) {
				this.vehiculo= new Vehiculo();
			}

			if(this.vehiculoSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoVehiculo
				this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);

				this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.getserviciotransporte().setVehiculo(this.vehiculo);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoVehiculo--;	
		
		
		this.vehiculoAux=new Vehiculo();
		
		this.vehiculoAux.setId(this.iIdNuevoVehiculo);
		this.vehiculoAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vehiculoLogic.getVehiculos().add(this.vehiculoAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vehiculos.add(this.vehiculoAux);
		}
		//ARCHITECTURE
		
		this.vehiculo=this.vehiculoAux;
		
		if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVehiculo(this.vehiculo);
			this.setVariablesObjetoActualToFormularioForeignKeyVehiculo(this.vehiculo);
		}
				
		//this.setDefaultControlesVehiculo();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVehiculo();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVehiculo();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVehiculo();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVehiculo(this.vehiculoBean,this.vehiculo,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VehiculoConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
			classes=VehiculoConstantesFunciones.getClassesRelationshipsOfVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vehiculoReturnGeneral=vehiculoLogic.procesarEventosVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vehiculoLogic.getVehiculos(),this.vehiculo,this.vehiculoParameterGeneral,this.isEsNuevoVehiculo,classes);//this.vehiculoLogic.getVehiculo()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVehiculo(this.vehiculoReturnGeneral,this.vehiculoBean,false);
		
		if(this.vehiculoReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVehiculo(this.vehiculoReturnGeneral.getVehiculo());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVehiculo(this.vehiculoReturnGeneral.getVehiculo());
		}
		
		if(this.vehiculoReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVehiculo(this.vehiculoReturnGeneral.getVehiculo(),classes);//this.vehiculoBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVehiculo();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVehiculo();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VehiculoBeanSwingJInternalFrameAdditional.RecargarFormVehiculo(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVehiculo(false);
						
			if(vehiculoSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getEsGuardarRelacionado() && ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonServicioTransporteActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVehiculo();
			}
			
			this.actualizarVisualTableDatosVehiculo();
			
			this.jTableDatosVehiculo.setRowSelectionInterval(this.getIndiceNuevoVehiculo(), this.getIndiceNuevoVehiculo());
			
			this.seleccionarFilaTablaVehiculoActual();
						
			this.actualizarEstadoCeldasBotonesVehiculo("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVehiculo(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarnumero_polizaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarfecha_emisionVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarfecha_vencimientoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarvalor_aseguradoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarvalor_deducibleVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarnumero_matriculaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarnumero_motorVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarnumero_chasisVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarnumero_placaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarvalor_comercialVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activardescripcionVehiculo);	
		//
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarid_empresaVehiculo);//
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarid_sucursalVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarid_detalle_activo_fijoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setEnabled(isHabilitar && this.vehiculoConstantesFunciones.activarid_aseguradoraVehiculo);
	};
	
	public void setDefaultControlesVehiculo() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVehiculo(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vehiculoSessionBean.setConGuardarRelaciones(true);			
			this.vehiculoSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.vehiculoSessionBean.setConGuardarRelaciones(false);			
			this.vehiculoSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoVehiculo() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
				if(vehiculoAux.getId().equals(this.iIdNuevoVehiculo)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vehiculo vehiculoAux:this.vehiculos) {
				if(vehiculoAux.getId().equals(this.iIdNuevoVehiculo)) {
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
	
	public int getIndiceActualVehiculo(Vehiculo vehiculo,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
				if(vehiculoAux.getId().equals(vehiculo.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vehiculo vehiculoAux:this.vehiculos) {
				if(vehiculoAux.getId().equals(vehiculo.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVehiculo(Vehiculo vehiculoOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
				if(vehiculoAux.getVehiculoOriginal().getId().equals(vehiculoOriginal.getId())) {
					existe=true;
					vehiculoOriginal.setId(vehiculoAux.getId());
					vehiculoOriginal.setVersionRow(vehiculoAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vehiculo vehiculoAux:this.vehiculos) {
				if(vehiculoAux.getVehiculoOriginal().getId().equals(vehiculoOriginal.getId())) {
					existe=true;
					vehiculoOriginal.setId(vehiculoAux.getId());
					vehiculoOriginal.setVersionRow(vehiculoAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVehiculo(Boolean esParaCancelar) throws Exception {
		vehiculosAux=new ArrayList<Vehiculo>();
		vehiculoAux=new Vehiculo();
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
					if(vehiculoAux.getId()<0) {
						vehiculosAux.add(vehiculoAux);
					}		
				}
				this.iIdNuevoVehiculo=0L;
				this.vehiculoLogic.getVehiculos().removeAll(vehiculosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vehiculo vehiculoAux:this.vehiculos) {
					if(vehiculoAux.getId()<0) {
						vehiculosAux.add(vehiculoAux);
					}		
				}
				this.iIdNuevoVehiculo=0L;
				this.vehiculos.removeAll(vehiculosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVehiculo 
					&& this.vehiculoLogic.getVehiculos().size()>0
					) {
					vehiculoAux=this.vehiculoLogic.getVehiculos().get(this.vehiculoLogic.getVehiculos().size() - 1);
				
					if(vehiculoAux.getId()<0) {
						this.vehiculoLogic.getVehiculos().remove(vehiculoAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVehiculo && this.vehiculos.size()>0) {
					vehiculoAux=this.vehiculos.get(this.vehiculos.size() - 1);
				
					if(vehiculoAux.getId()<0) {
						this.vehiculos.remove(vehiculoAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVehiculo(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vehiculo.getId()<0) {
				this.vehiculoLogic.getVehiculos().remove(this.vehiculo);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vehiculo.getId()<0) {
				this.vehiculos.remove(this.vehiculo);
			}
		}			
	}
	
	public void setEstadosInicialesVehiculo(List<Vehiculo> vehiculosAux) throws Exception {
		VehiculoConstantesFunciones.setEstadosInicialesVehiculo(vehiculosAux);
	}
	
	public void setEstadosInicialesVehiculo(Vehiculo vehiculoAux) throws Exception {
		VehiculoConstantesFunciones.setEstadosInicialesVehiculo(vehiculoAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVehiculoActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVehiculoActual()) {
				if(!this.isEsNuevoVehiculo) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVehiculo=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVehiculoActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vehiculo ?", "MANTENIMIENTO DE Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Vehiculo vehiculo) throws Exception {
		VehiculoConstantesFunciones.seleccionarAsignar(this.vehiculo,vehiculo);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVehiculo=this.isPermisoActualizarOriginalVehiculo;
			
			
			this.seleccionarAsignar(vehiculo);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VehiculoConstantesFunciones.quitarEspaciosVehiculo(this.vehiculo,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVehiculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vehiculoSessionBean.setsFuncionBusquedaRapida(this.vehiculoSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoVehiculo) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVehiculo(esParaCancelar);				
				this.cancelarNuevoVehiculo(esParaCancelar);								
			}
			
			this.vehiculo=new Vehiculo();
			
			this.inicializarVehiculo();
			
			this.actualizarEstadoCeldasBotonesVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVehiculo() throws Exception {
		try {
			VehiculoConstantesFunciones.inicializarVehiculo(this.vehiculo);
			
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
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vehiculoLogic.getVehiculos().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVehiculos(String sAccionBusqueda,List<Vehiculo> vehiculosParaReportes) throws Exception {
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
					sPathReporteFinal="Vehiculo"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VehiculoMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VehiculoMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Vehiculo"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Vehiculos");		
		parameters.put("busquedapor", VehiculoConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(ServicioTransporte.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					VehiculoLogic vehiculoLogicAuxiliar=new VehiculoLogic();
					vehiculoLogicAuxiliar.setDatosCliente(vehiculoLogic.getDatosCliente());				
					vehiculoLogicAuxiliar.setVehiculos(vehiculosParaReportes);
					
					vehiculoLogicAuxiliar.cargarRelacionesLoteForeignKeyVehiculoWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					vehiculosParaReportes=vehiculoLogicAuxiliar.getVehiculos();
					
					//vehiculoLogic.getNewConnexionToDeep();
					
					//for (Vehiculo vehiculo:vehiculosParaReportes) {
					//	vehiculoLogic.deepLoad(vehiculo, false, DeepLoadType.INCLUDE, classes);
					//}						
					//vehiculoLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//vehiculoLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileServicioTransporte = AuxiliarReportes.class.getResourceAsStream("ServicioTransporteDetalleRelacionesDesign.jasper");
			parameters.put("subreport_serviciotransporte", reportFileServicioTransporte);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVehiculo=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VehiculoConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVehiculo=new JRBeanArrayDataSource(VehiculoJInternalFrame.TraerVehiculoBeans(vehiculosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVehiculo);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VehiculoConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VehiculoConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VehiculoBean.TraerVehiculoBeans(vehiculosParaReportes).toArray()));
							
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
				this.generarExcelReporteVehiculos(sAccionBusqueda,sTipoArchivoReporte,vehiculosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVehiculos(sAccionBusqueda,sTipoArchivoReporte,vehiculosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVehiculoActionPerformed(null);
					//this.generarExcelReporteVehiculos(sAccionBusqueda,sTipoArchivoReporte,vehiculosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVehiculos(sAccionBusqueda,sTipoArchivoReporte,vehiculosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVehiculos(sAccionBusqueda,sTipoArchivoReporte,vehiculosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVehiculos(sAccionBusqueda,sTipoArchivoReporte,vehiculosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVehiculos(String sAccionBusqueda,String sTipoArchivoReporte,List<Vehiculo> vehiculosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Vehiculos");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVehiculo("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Vehiculo vehiculo : vehiculosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VehiculoConstantesFunciones.generarExcelReporteDataVehiculo("NORMAL",row,workbook,vehiculo,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVehiculo(String sTipo,Row row,Workbook workbook) {
		
		VehiculoConstantesFunciones.generarExcelReporteHeaderVehiculo(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVehiculos(String sAccionBusqueda,String sTipoArchivoReporte,List<Vehiculo> vehiculosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Vehiculos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Vehiculo vehiculo : vehiculosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VehiculoConstantesFunciones.getVehiculoDescripcion(vehiculo));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getdetalleactivofijo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_IDASEGURADORA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDASEGURADORA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getaseguradora_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getnumero_poliza());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_FECHAEMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_FECHAEMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getfecha_emision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getfecha_vencimiento());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_VALORASEGURADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORASEGURADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getvalor_asegurado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getvalor_deducible());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getnumero_matricula());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getnumero_motor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getnumero_chasis());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_NUMEROPLACA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROPLACA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getnumero_placa());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getvalor_comercial());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VehiculoConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VehiculoConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vehiculo.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVehiculos(String sAccionBusqueda,String sTipoArchivoReporte,List<Vehiculo> vehiculosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Vehiculo> vehiculosRespaldo=null;
		
		classes=VehiculoConstantesFunciones.getClassesRelationshipsOfVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vehiculoLogic.setDatosCliente(this.datosCliente);
		this.vehiculoLogic.setDatosDeep(this.datosDeep);
		this.vehiculoLogic.setIsConDeep(true);
		
		vehiculosRespaldo=this.vehiculoLogic.getVehiculos();
		
		this.vehiculoLogic.setVehiculos(vehiculosParaReportes);	
		this.vehiculoLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vehiculosParaReportes=this.vehiculoLogic.getVehiculos();
		this.vehiculoLogic.setVehiculos(vehiculosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Vehiculos");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVehiculo("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Vehiculo vehiculo : vehiculosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVehiculo("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VehiculoConstantesFunciones.generarExcelReporteDataVehiculo("NORMAL",row,workbook,vehiculo,cellStyleDataAux);
		
			
			


				//ServicioTransporte
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO))) {

				if(vehiculo.getServicioTransportes()!=null && vehiculo.getServicioTransportes().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					ServicioTransporteConstantesFunciones.generarExcelReporteHeaderServicioTransporte("RELACIONADO",row,workbook);
				}

				if(vehiculo.getServicioTransportes()!=null) {
					i2=0;
					for(ServicioTransporte serviciotransporte : vehiculo.getServicioTransportes()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						ServicioTransporteConstantesFunciones.generarExcelReporteDataServicioTransporte("RELACIONADO",row,workbook,serviciotransporte,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VehiculoConstantesFunciones.getVehiculoDescripcion(vehiculo));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVehiculo.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVehiculo() throws Exception {		
		this.startProcessVehiculo(true);
	}
	
	public void startProcessVehiculo(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVehiculo ,this.jPanelParametrosReportesVehiculo, this.jScrollPanelDatosVehiculo,this.jPanelPaginacionVehiculo, this.jScrollPanelDatosEdicionVehiculo, this.jPanelAccionesVehiculo,this.jPanelAccionesFormularioVehiculo,this.jmenuBarVehiculo,this.jmenuBarDetalleVehiculo,this.jTtoolBarVehiculo,this.jTtoolBarDetalleVehiculo);		
		
		final JTabbedPane jTabbedPaneBusquedasVehiculo=this.jTabbedPaneBusquedasVehiculo; 
		
		final JPanel jPanelParametrosReportesVehiculo=this.jPanelParametrosReportesVehiculo;
		//final JScrollPane jScrollPanelDatosVehiculo=this.jScrollPanelDatosVehiculo;
		final JTable jTableDatosVehiculo=this.jTableDatosVehiculo;		
		final JPanel jPanelPaginacionVehiculo=this.jPanelPaginacionVehiculo;
		//final JScrollPane jScrollPanelDatosEdicionVehiculo=this.jScrollPanelDatosEdicionVehiculo;
		final JPanel jPanelAccionesVehiculo=this.jPanelAccionesVehiculo;
		
		JPanel jPanelCamposAuxiliarVehiculo=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVehiculo=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
			jPanelCamposAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jPanelCamposVehiculo;
			jPanelAccionesFormularioAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jPanelAccionesFormularioVehiculo;
		}
		
		final JPanel jPanelCamposVehiculo=jPanelCamposAuxiliarVehiculo;
		final JPanel jPanelAccionesFormularioVehiculo=jPanelAccionesFormularioAuxiliarVehiculo;
		
		
		final JMenuBar jmenuBarVehiculo=this.jmenuBarVehiculo;
		final JToolBar jTtoolBarVehiculo=this.jTtoolBarVehiculo;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVehiculo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVehiculo=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
			jmenuBarDetalleAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jmenuBarDetalleVehiculo;
			jTtoolBarDetalleAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jTtoolBarDetalleVehiculo;
		}
		
		final JMenuBar jmenuBarDetalleVehiculo=jmenuBarDetalleAuxiliarVehiculo;
		final JToolBar jTtoolBarDetalleVehiculo=jTtoolBarDetalleAuxiliarVehiculo;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVehiculo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVehiculo;
			processRunnable.jTableDatos=jTableDatosVehiculo;
			processRunnable.jPanelCampos=jPanelCamposVehiculo;
			processRunnable.jPanelPaginacion=jPanelPaginacionVehiculo;
			processRunnable.jPanelAcciones=jPanelAccionesVehiculo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVehiculo;
			
			
			processRunnable.jmenuBar=jmenuBarVehiculo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVehiculo;
			processRunnable.jTtoolBar=jTtoolBarVehiculo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVehiculo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVehiculo ,jPanelParametrosReportesVehiculo,jTableDatosVehiculo, /*jScrollPanelDatosVehiculo,*/jPanelCamposVehiculo,jPanelPaginacionVehiculo, /*jScrollPanelDatosEdicionVehiculo,*/ jPanelAccionesVehiculo,jPanelAccionesFormularioVehiculo,jmenuBarVehiculo,jmenuBarDetalleVehiculo,jTtoolBarVehiculo,jTtoolBarDetalleVehiculo);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVehiculo ,jPanelParametrosReportesVehiculo, jScrollPanelDatosVehiculo,jPanelPaginacionVehiculo, jScrollPanelDatosEdicionVehiculo, jPanelAccionesVehiculo,jPanelAccionesFormularioVehiculo,jmenuBarVehiculo,jmenuBarDetalleVehiculo,jTtoolBarVehiculo,jTtoolBarDetalleVehiculo);
						
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
	
	public void finishProcessVehiculo() {// throws Exception 
		this.finishProcessVehiculo(true);
	}
	
	public void finishProcessVehiculo(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVehiculo ,this.jPanelParametrosReportesVehiculo, this.jScrollPanelDatosVehiculo,this.jPanelPaginacionVehiculo, this.jScrollPanelDatosEdicionVehiculo, this.jPanelAccionesVehiculo,this.jPanelAccionesFormularioVehiculo,this.jmenuBarVehiculo,this.jmenuBarDetalleVehiculo,this.jTtoolBarVehiculo,this.jTtoolBarDetalleVehiculo);		
		
		final JTabbedPane jTabbedPaneBusquedasVehiculo=this.jTabbedPaneBusquedasVehiculo; 
		
		final JPanel jPanelParametrosReportesVehiculo=this.jPanelParametrosReportesVehiculo;
		//final JScrollPane jScrollPanelDatosVehiculo=this.jScrollPanelDatosVehiculo;
		final JTable jTableDatosVehiculo=this.jTableDatosVehiculo;		
		final JPanel jPanelPaginacionVehiculo=this.jPanelPaginacionVehiculo;
		//final JScrollPane jScrollPanelDatosEdicionVehiculo=this.jScrollPanelDatosEdicionVehiculo;
		final JPanel jPanelAccionesVehiculo=this.jPanelAccionesVehiculo;
		
		JPanel jPanelCamposAuxiliarVehiculo=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVehiculo=new JPanel();
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
			jPanelCamposAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jPanelCamposVehiculo;
			jPanelAccionesFormularioAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jPanelAccionesFormularioVehiculo;
		}
		
		final JPanel jPanelCamposVehiculo=jPanelCamposAuxiliarVehiculo;
		final JPanel jPanelAccionesFormularioVehiculo=jPanelAccionesFormularioAuxiliarVehiculo;
		
		
		final JMenuBar jmenuBarVehiculo=this.jmenuBarVehiculo;		
		final JToolBar jTtoolBarVehiculo=this.jTtoolBarVehiculo;
				
		JMenuBar jmenuBarDetalleAuxiliarVehiculo=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVehiculo=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
			jmenuBarDetalleAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jmenuBarDetalleVehiculo;
			jTtoolBarDetalleAuxiliarVehiculo=this.jInternalFrameDetalleFormVehiculo.jTtoolBarDetalleVehiculo;		
		}
		
		final JMenuBar jmenuBarDetalleVehiculo=jmenuBarDetalleAuxiliarVehiculo;
		final JToolBar jTtoolBarDetalleVehiculo=jTtoolBarDetalleAuxiliarVehiculo;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVehiculo;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVehiculo;
			processRunnable.jTableDatos=jTableDatosVehiculo;
			processRunnable.jPanelCampos=jPanelCamposVehiculo;
			processRunnable.jPanelPaginacion=jPanelPaginacionVehiculo;
			processRunnable.jPanelAcciones=jPanelAccionesVehiculo;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVehiculo;
			
			
			processRunnable.jmenuBar=jmenuBarVehiculo;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVehiculo;
			processRunnable.jTtoolBar=jTtoolBarVehiculo;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVehiculo;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVehiculo ,jPanelParametrosReportesVehiculo, jTableDatosVehiculo,/*jScrollPanelDatosVehiculo,*/jPanelCamposVehiculo,jPanelPaginacionVehiculo, /*jScrollPanelDatosEdicionVehiculo,*/ jPanelAccionesVehiculo,jPanelAccionesFormularioVehiculo,jmenuBarVehiculo,jmenuBarDetalleVehiculo,jTtoolBarVehiculo,jTtoolBarDetalleVehiculo));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVehiculo(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVehiculo(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVehiculo(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVehiculo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVehiculo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVehiculo,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVehiculo(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVehiculo,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVehiculo,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vehiculoConstantesFunciones.getsFinalQueryVehiculo();
		String  finalQueryPaginacionTodos=this.vehiculoConstantesFunciones.getsFinalQueryVehiculo();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VehiculoConstantesFunciones.getArrayColumnasGlobalesNoVehiculo(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VehiculoConstantesFunciones.getArrayColumnasGlobalesVehiculo(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VehiculoConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vehiculosEliminados= new ArrayList<Vehiculo>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVehiculo();
		
				///*VehiculoSessionBean*/this.vehiculoSessionBean=new VehiculoSessionBean();
			
			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
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
					this.iNumeroPaginacion=VehiculoConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VehiculoConstantesFunciones.getClassesForeignKeysOfVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vehiculo."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vehiculosAux= new ArrayList<Vehiculo>();
			
				
			vehiculoLogic.setDatosCliente(this.datosCliente);
			vehiculoLogic.setDatosDeep(this.datosDeep);
			vehiculoLogic.setIsConDeep(true);
			
			
			vehiculoLogic.getVehiculoDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vehiculoLogic.getTodosVehiculos(finalQueryGlobal,pagination);
					
					//vehiculoLogic.getTodosVehiculosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vehiculoLogic.getVehiculos()==null|| vehiculoLogic.getVehiculos().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vehiculosAux= new ArrayList<Vehiculo>();
							vehiculosAux.addAll(vehiculoLogic.getVehiculos());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculosAux= new ArrayList<Vehiculo>();
							vehiculosAux.addAll(vehiculos);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vehiculoLogic.getTodosVehiculos(finalQueryGlobal+"",this.pagination);												
							
							//vehiculoLogic.getTodosVehiculosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVehiculos("Todos",vehiculoLogic.getVehiculos() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());					
							vehiculoLogic.getVehiculos().addAll(vehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculos=new ArrayList<Vehiculo>();
							vehiculos.addAll(vehiculosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVehiculo=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVehiculo=this.idActual;
				
				} else if(this.idVehiculoActual!=null && this.idVehiculoActual!=0L) {
					idVehiculo=idVehiculoActual;
				}
				
					
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndicePorId(idVehiculo);
				
				this.vehiculos=new ArrayList<Vehiculo>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vehiculoLogic.getEntity(idVehiculo);
					
					//vehiculoLogic.getEntityWithConnection(idVehiculo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
					vehiculoLogic.getVehiculos().add(vehiculoLogic.getVehiculo());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculos=new ArrayList<Vehiculo>();
					this.vehiculos.add(vehiculo);
				}
				
				if(vehiculoLogic.getVehiculo()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAseguradora")) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdAseguradora(id_aseguradoraFK_IdAseguradora);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vehiculoLogic.getVehiculosFK_IdAseguradora(finalQueryGlobal,pagination,id_aseguradoraFK_IdAseguradora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdAseguradora(id_aseguradoraFK_IdAseguradora);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdAseguradora(id_aseguradoraFK_IdAseguradora);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vehiculoLogic.getVehiculos()==null||vehiculoLogic.getVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vehiculos==null|| vehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculosAux=new ArrayList<Vehiculo>();
						vehiculosAux.addAll(vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculosAux=new ArrayList<Vehiculo>();
							vehiculosAux.addAll(vehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vehiculoLogic.getVehiculosFK_IdAseguradora(finalQueryGlobal,pagination,id_aseguradoraFK_IdAseguradora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdAseguradora(id_aseguradoraFK_IdAseguradora);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdAseguradora(id_aseguradoraFK_IdAseguradora);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVehiculos("FK_IdAseguradora",vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVehiculos("FK_IdAseguradora",vehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
						vehiculoLogic.getVehiculos().addAll(vehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculos=new ArrayList<Vehiculo>();
							vehiculos.addAll(vehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdDetalleActivoFijo")) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vehiculoLogic.getVehiculosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vehiculoLogic.getVehiculos()==null||vehiculoLogic.getVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vehiculos==null|| vehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculosAux=new ArrayList<Vehiculo>();
						vehiculosAux.addAll(vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculosAux=new ArrayList<Vehiculo>();
							vehiculosAux.addAll(vehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vehiculoLogic.getVehiculosFK_IdDetalleActivoFijo(finalQueryGlobal,pagination,id_detalle_activo_fijoFK_IdDetalleActivoFijo);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdDetalleActivoFijo(id_detalle_activo_fijoFK_IdDetalleActivoFijo);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVehiculos("FK_IdDetalleActivoFijo",vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVehiculos("FK_IdDetalleActivoFijo",vehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
						vehiculoLogic.getVehiculos().addAll(vehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculos=new ArrayList<Vehiculo>();
							vehiculos.addAll(vehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vehiculoLogic.getVehiculosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vehiculoLogic.getVehiculos()==null||vehiculoLogic.getVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vehiculos==null|| vehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculosAux=new ArrayList<Vehiculo>();
						vehiculosAux.addAll(vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculosAux=new ArrayList<Vehiculo>();
							vehiculosAux.addAll(vehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vehiculoLogic.getVehiculosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVehiculos("FK_IdEmpresa",vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVehiculos("FK_IdEmpresa",vehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
						vehiculoLogic.getVehiculos().addAll(vehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculos=new ArrayList<Vehiculo>();
							vehiculos.addAll(vehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vehiculoLogic.getVehiculosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vehiculoLogic.getVehiculos()==null||vehiculoLogic.getVehiculos().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vehiculos==null|| vehiculos.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculosAux=new ArrayList<Vehiculo>();
						vehiculosAux.addAll(vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculosAux=new ArrayList<Vehiculo>();
							vehiculosAux.addAll(vehiculos);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vehiculoLogic.getVehiculosFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VehiculoConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVehiculos("FK_IdSucursal",vehiculoLogic.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVehiculos("FK_IdSucursal",vehiculos);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
						vehiculoLogic.getVehiculos().addAll(vehiculosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculos=new ArrayList<Vehiculo>();
							vehiculos.addAll(vehiculosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVehiculo();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVehiculo();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vehiculoLogic.getVehiculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vehiculos.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vehiculoLogic.getVehiculos().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vehiculos.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Vehiculo vehiculo) {
		Boolean permite=true;
		
		if(this.vehiculo.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VehiculoConstantesFunciones.getOrderByListaVehiculo();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VehiculoConstantesFunciones.getOrderByListaVehiculo();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vehiculo vehiculo:vehiculoLogic.getVehiculos()) {
				if(vehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoTotales=vehiculo;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vehiculo vehiculo:this.vehiculos) {
				if(vehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoTotales=vehiculo;
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
			this.vehiculoAux=new Vehiculo();
			this.vehiculoAux.setsType(Constantes2.S_TOTALES);
			this.vehiculoAux.setIsNew(false);
			this.vehiculoAux.setIsChanged(false);
			this.vehiculoAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VehiculoConstantesFunciones.TotalizarValoresFilaVehiculo(this.vehiculoLogic.getVehiculos(),this.vehiculoAux);
				
				this.vehiculoLogic.getVehiculos().add(this.vehiculoAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VehiculoConstantesFunciones.TotalizarValoresFilaVehiculo(this.vehiculos,this.vehiculoAux);
				
				this.vehiculos.add(this.vehiculoAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vehiculoTotales=new Vehiculo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vehiculoLogic.getVehiculos().remove(vehiculoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vehiculos.remove(vehiculoTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vehiculoTotales=new Vehiculo();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Vehiculo vehiculo:vehiculoLogic.getVehiculos()) {
				if(vehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoTotales=vehiculo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VehiculoConstantesFunciones.TotalizarValoresFilaVehiculo(this.vehiculoLogic.getVehiculos(),vehiculoTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Vehiculo vehiculo:this.vehiculos) {
				if(vehiculo.getsType().equals(Constantes2.S_TOTALES)) {
					vehiculoTotales=vehiculo;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VehiculoConstantesFunciones.TotalizarValoresFilaVehiculo(this.vehiculos,vehiculoTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVehiculosFK_IdAseguradora()throws Exception {
		try {
			sAccionBusqueda="FK_IdAseguradora";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVehiculosFK_IdDetalleActivoFijo()throws Exception {
		try {
			sAccionBusqueda="FK_IdDetalleActivoFijo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVehiculosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVehiculosFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVehiculosFK_IdAseguradora(String sFinalQuery,Long id_aseguradora)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoLogic.getVehiculosFK_IdAseguradora(sFinalQuery,this.pagination,id_aseguradora);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVehiculosFK_IdDetalleActivoFijo(String sFinalQuery,Long id_detalle_activo_fijo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoLogic.getVehiculosFK_IdDetalleActivoFijo(sFinalQuery,this.pagination,id_detalle_activo_fijo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVehiculosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoLogic.getVehiculosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVehiculosFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoLogic.getVehiculosFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosVehiculo() {
		this.isPermisoTodoVehiculo=false;
		this.isPermisoNuevoVehiculo=false;
		this.isPermisoActualizarVehiculo=false;
		this.isPermisoActualizarOriginalVehiculo=false;
		this.isPermisoEliminarVehiculo=false;
		this.isPermisoGuardarCambiosVehiculo=false;
		this.isPermisoConsultaVehiculo=false;
		this.isPermisoBusquedaVehiculo=false;
		this.isPermisoReporteVehiculo=false;		
		this.isPermisoOrdenVehiculo=false;		
		this.isPermisoPaginacionMedioVehiculo=false;		
		this.isPermisoPaginacionAltoVehiculo=false;
		this.isPermisoPaginacionTodoVehiculo=false;
		this.isPermisoCopiarVehiculo=false;		
		this.isPermisoVerFormVehiculo=false;		
		this.isPermisoDuplicarVehiculo=false;		
		this.isPermisoOrdenVehiculo=false;		
	}
	
	public void setPermisosUsuarioVehiculo(Boolean isPermiso) {
		this.isPermisoTodoVehiculo=isPermiso;
		this.isPermisoNuevoVehiculo=isPermiso;
		this.isPermisoActualizarVehiculo=isPermiso;
		this.isPermisoActualizarOriginalVehiculo=isPermiso;
		this.isPermisoEliminarVehiculo=isPermiso;
		this.isPermisoGuardarCambiosVehiculo=isPermiso;
		this.isPermisoConsultaVehiculo=isPermiso;
		this.isPermisoBusquedaVehiculo=isPermiso;
		this.isPermisoReporteVehiculo=isPermiso;
		this.isPermisoOrdenVehiculo=isPermiso;		
		this.isPermisoPaginacionMedioVehiculo=isPermiso;		
		this.isPermisoPaginacionAltoVehiculo=isPermiso;		
		this.isPermisoPaginacionTodoVehiculo=isPermiso;		
		this.isPermisoCopiarVehiculo=isPermiso;		
		this.isPermisoVerFormVehiculo=isPermiso;		
		this.isPermisoDuplicarVehiculo=isPermiso;
		this.isPermisoOrdenVehiculo=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVehiculo(Boolean isPermiso) {
		//this.isPermisoTodoVehiculo=isPermiso;
		this.isPermisoNuevoVehiculo=isPermiso;
		this.isPermisoActualizarVehiculo=isPermiso;
		this.isPermisoActualizarOriginalVehiculo=isPermiso;
		this.isPermisoEliminarVehiculo=isPermiso;
		this.isPermisoGuardarCambiosVehiculo=isPermiso;
		//this.isPermisoConsultaVehiculo=isPermiso;
		//this.isPermisoBusquedaVehiculo=isPermiso;
		//this.isPermisoReporteVehiculo=isPermiso;
		//this.isPermisoOrdenVehiculo=isPermiso;		
		//this.isPermisoPaginacionMedioVehiculo=isPermiso;		
		//this.isPermisoPaginacionAltoVehiculo=isPermiso;		
		//this.isPermisoPaginacionTodoVehiculo=isPermiso;		
		//this.isPermisoCopiarVehiculo=isPermiso;		
		//this.isPermisoDuplicarVehiculo=isPermiso;
		//this.isPermisoOrdenVehiculo=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVehiculoClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(ServicioTransporteConstantesFunciones.SNOMBREOPCION);
		
		if(VehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosServicioTransporte=false;
		this.isTienePermisosServicioTransporte=this.verificarGetPermisosUsuarioOpcionVehiculoClaseRelacionada(this.opcionsRelacionadas,ServicioTransporteConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebVehiculo(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVehiculoClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosServicioTransporte=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioVehiculoClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVehiculoClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVehiculoClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosServicioTransporte && this.jInternalFrameDetalleFormVehiculo!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.remove(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioVehiculo() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VehiculoConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVehiculo=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVehiculo=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVehiculo=this.isPermisoActualizarVehiculo;
			this.isPermisoEliminarVehiculo=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVehiculo=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVehiculo=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVehiculo=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVehiculo=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVehiculo=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVehiculo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVehiculo=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVehiculo=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVehiculo=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVehiculo=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVehiculo=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVehiculo=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVehiculo=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVehiculo.setToolTipText(this.jTableDatosVehiculo.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVehiculo(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVehiculo(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVehiculo() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosServicioTransporte && this.vehiculoConstantesFunciones.mostrarServicioTransporteVehiculo && !VehiculoConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Servicio Transporte");
			reporte.setsDescripcion("Servicio Transporte");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyVehiculoListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.detalleactivofijosForeignKey=new ArrayList();
				this.aseguradorasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVehiculoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VehiculoJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVehiculoListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAseguradoraListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyDetalleActivoFijoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

				this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAseguradoraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aseguradorasForeignKey==null||this.aseguradorasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AseguradoraConstantesFunciones.getArrayColumnasGlobalesAseguradora(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AseguradoraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AseguradoraConstantesFunciones.SFINALQUERY;

				this.cargarCombosAseguradorasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVehiculoListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VehiculoParameterReturnGeneral vehiculoReturnGeneral=new VehiculoParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.vehiculoConstantesFunciones.cargarid_empresaVehiculo)
					 || (this.esRecargarFks && this.vehiculoConstantesFunciones.cargarid_empresaVehiculo)) {

					if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+vehiculoSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.vehiculoConstantesFunciones.cargarid_sucursalVehiculo)
					 || (this.esRecargarFks && this.vehiculoConstantesFunciones.cargarid_sucursalVehiculo)) {

					if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+vehiculoSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalDetalleActivoFijo="";

				if(((this.detalleactivofijosForeignKey==null||this.detalleactivofijosForeignKey.size()<=0) && this.vehiculoConstantesFunciones.cargarid_detalle_activo_fijoVehiculo)
					 || (this.esRecargarFks && this.vehiculoConstantesFunciones.cargarid_detalle_activo_fijoVehiculo)) {

					if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=DetalleActivoFijoConstantesFunciones.getArrayColumnasGlobalesDetalleActivoFijo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalDetalleActivoFijo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,DetalleActivoFijoConstantesFunciones.TABLENAME);

						finalQueryGlobalDetalleActivoFijo=Funciones.GetFinalQueryAppend(finalQueryGlobalDetalleActivoFijo, "");
						finalQueryGlobalDetalleActivoFijo+=DetalleActivoFijoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosDetalleActivoFijosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalDetalleActivoFijo=" WHERE " + ConstantesSql.ID + "="+vehiculoSessionBean.getlidDetalleActivoFijoActual();
					}
				} else {
					finalQueryGlobalDetalleActivoFijo="NONE";
				}


				String finalQueryGlobalAseguradora="";

				if(((this.aseguradorasForeignKey==null||this.aseguradorasForeignKey.size()<=0) && this.vehiculoConstantesFunciones.cargarid_aseguradoraVehiculo)
					 || (this.esRecargarFks && this.vehiculoConstantesFunciones.cargarid_aseguradoraVehiculo)) {

					if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionAseguradora()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AseguradoraConstantesFunciones.getArrayColumnasGlobalesAseguradora(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAseguradora=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AseguradoraConstantesFunciones.TABLENAME);

						finalQueryGlobalAseguradora=Funciones.GetFinalQueryAppend(finalQueryGlobalAseguradora, "");
						finalQueryGlobalAseguradora+=AseguradoraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAseguradorasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAseguradora=" WHERE " + ConstantesSql.ID + "="+vehiculoSessionBean.getlidAseguradoraActual();
					}
				} else {
					finalQueryGlobalAseguradora="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vehiculoReturnGeneral=vehiculoLogic.cargarCombosLoteForeignKeyVehiculo(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalDetalleActivoFijo,finalQueryGlobalAseguradora);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=vehiculoReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=vehiculoReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalDetalleActivoFijo.equals("NONE")) {
				this.detalleactivofijosForeignKey=vehiculoReturnGeneral.getdetalleactivofijosForeignKey();
			}

			if(!finalQueryGlobalAseguradora.equals("NONE")) {
				this.aseguradorasForeignKey=vehiculoReturnGeneral.getaseguradorasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVehiculo()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
			this.addItemDefectoCombosForeignKeyAseguradora();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
			}

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyDetalleActivoFijo()throws Exception {
		try {

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionDetalleActivoFijo()) {
				DetalleActivoFijo detalleactivofijo=new DetalleActivoFijo();
				DetalleActivoFijoConstantesFunciones.setDetalleActivoFijoDescripcion(detalleactivofijo,Constantes.SMENSAJE_ESCOJA_OPCION);
				detalleactivofijo.setId(null);

				if(!DetalleActivoFijoConstantesFunciones.ExisteEnLista(this.detalleactivofijosForeignKey,detalleactivofijo,true)) {

					this.detalleactivofijosForeignKey.add(0,detalleactivofijo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAseguradora()throws Exception {
		try {

			if(!this.vehiculoSessionBean.getisBusquedaDesdeForeignKeySesionAseguradora()) {
				Aseguradora aseguradora=new Aseguradora();
				AseguradoraConstantesFunciones.setAseguradoraDescripcion(aseguradora,Constantes.SMENSAJE_ESCOJA_OPCION);
				aseguradora.setId(null);

				if(!AseguradoraConstantesFunciones.ExisteEnLista(this.aseguradorasForeignKey,aseguradora,true)) {

					this.aseguradorasForeignKey.add(0,aseguradora);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVehiculo()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVehiculo(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVehiculo()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
				this.vehiculo.setfecha_emision(this.parametroGeneralUsuario.getfecha_sistema());
				this.vehiculo.setfecha_vencimiento(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVehiculo();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVehiculo(Vehiculo vehiculo)throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(vehiculo.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualAseguradoraForeignKey(vehiculo.getid_aseguradora(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVehiculo(Vehiculo vehiculo,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVehiculo()throws Exception {	
		try {
			
			this.setActualDetalleActivoFijoForeignKey(this.vehiculoConstantesFunciones.getid_detalle_activo_fijo(),false,"Formulario");
			this.setActualAseguradoraForeignKey(this.vehiculoConstantesFunciones.getid_aseguradora(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVehiculo()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVehiculo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVehiculo()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVehiculo()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVehiculo()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
			this.cargarCombosFrameAseguradorasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVehiculo(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAseguradorasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVehiculo()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo!=null && this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.getItemCount()>0) {
				this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo!=null && this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.getItemCount()>0) {
				this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo!=null && this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.getItemCount()>0) {
				this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo!=null && this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.getItemCount()>0) {
				this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public VehiculoBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VehiculoBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VehiculoBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vehiculoSessionBean=new VehiculoSessionBean(); 
		this.vehiculoConstantesFunciones=new VehiculoConstantesFunciones(); 
		this.vehiculoBean=new Vehiculo();//(this.vehiculoConstantesFunciones); 		
		this.vehiculoReturnGeneral=new VehiculoParameterReturnGeneral(); 
		
		this.vehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VehiculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VehiculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VehiculoBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVehiculo(true);
			
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
			
			this.vehiculoConstantesFunciones=new VehiculoConstantesFunciones(); 
			this.vehiculoBean=new Vehiculo();//this.vehiculoConstantesFunciones); 			
			this.vehiculoReturnGeneral=new VehiculoParameterReturnGeneral(); 
		
			VehiculoBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vehiculo Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.vehiculo=new Vehiculo();
			this.vehiculos = new ArrayList<Vehiculo>();
			this.vehiculosAux = new ArrayList<Vehiculo>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic=new VehiculoLogic();
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			//this.vehiculoSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vehiculoSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVehiculo);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVehiculo);	
					}
					
					if(this.jInternalFrameImportacionVehiculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVehiculo);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVehiculo!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVehiculo);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVehiculo!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVehiculo);
				this.jInternalFrameDetalleFormVehiculo.setVisible(false);
				this.jInternalFrameDetalleFormVehiculo.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVehiculo);
					this.jInternalFrameReporteDinamicoVehiculo.setVisible(false);
					this.jInternalFrameReporteDinamicoVehiculo.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVehiculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVehiculo);
					this.jInternalFrameImportacionVehiculo.setVisible(false);
					this.jInternalFrameImportacionVehiculo.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVehiculo!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVehiculo);
					this.jInternalFrameOrderByVehiculo.setVisible(false);
					this.jInternalFrameOrderByVehiculo.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVehiculoActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VehiculoConstantesFunciones.INUMEROPAGINACION;
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
			
			this.vehiculoReturnGeneral=new VehiculoParameterReturnGeneral();
			
			this.vehiculoParameterGeneral=new VehiculoParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vehiculoLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VehiculoJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(ServicioTransporteConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VehiculoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vehiculoSessionBean.getEsGuardarRelacionado(),this.vehiculoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VehiculoConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vehiculoSessionBean.getEsGuardarRelacionado(),this.vehiculoSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaDuplicarVehiculo=true;
			this.isVisibilidadCeldaCopiarVehiculo=true;
			this.isVisibilidadCeldaVerFormVehiculo=true;
			this.isVisibilidadCeldaOrdenVehiculo=true;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
			this.isVisibilidadCeldaModificarVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=false;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=false;
			this.isVisibilidadCeldaGuardarVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
			
			
			this.isVisibilidadFK_IdAseguradora=true;
			this.isVisibilidadFK_IdDetalleActivoFijo=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVehiculo();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVehiculo(false);
			
			this.setPermisosUsuarioVehiculo();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vehiculoSessionBean.getEsGuardarRelacionado() 
				|| (this.vehiculoSessionBean.getEsGuardarRelacionado() && this.vehiculoSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVehiculoClasesRelacionadas();
			}
			
			if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVehiculoClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VehiculoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVehiculo();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVehiculo();
			}
			
			if(!this.isPermisoBusquedaVehiculo) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVehiculo.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVehiculo,this.isPermisoPaginacionMedioVehiculo,this.isPermisoPaginacionTodoVehiculo);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VehiculoConstantesFunciones.getTiposSeleccionarVehiculo());
				
				this.tiposColumnasSelect=VehiculoConstantesFunciones.getTiposSeleccionarVehiculo(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectVehiculo();				
				//this.tiposRelacionesSelect=VehiculoConstantesFunciones.getTiposRelacionesVehiculo(true);
				
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
			//if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVehiculo();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioVehiculo(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioVehiculo(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVehiculo() ;
			
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
			
			
			this.serviciotransporteLogic=new ServicioTransporteLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.detalleactivofijoLogic=new DetalleActivoFijoLogic();
			this.aseguradoraLogic=new AseguradoraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				vehiculoImplementable= (VehiculoImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VehiculoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vehiculoImplementableHome= (VehiculoImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VehiculoConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vehiculos= new ArrayList<Vehiculo>();
			this.vehiculosEliminados= new ArrayList<Vehiculo>();
						
			this.isEsNuevoVehiculo=false;
			this.esParaAccionDesdeFormularioVehiculo=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>() ;
			this.aseguradorasForeignKey=new ArrayList<Aseguradora>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVehiculo(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVehiculo();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VehiculoBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VehiculoConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVehiculo("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVehiculo(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVehiculo!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVehiculo();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVehiculo();
			}
			
			VehiculoBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVehiculo.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVehiculo.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVehiculo.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVehiculo(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Vehiculo: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVehiculo() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVehiculo")) {
				iIndex=this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();	
				
				

				if(sTitle.equals("Servicio Transportes")) {
					if(!ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessVehiculo();

						this.cargarParteTabPanelRelacionadaServicioTransporte(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVehiculo();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaServicioTransporte(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormVehiculo.cargarSessionConBeanSwingJInternalFrameServicioTransporte(false,true,iIndex);
		this.jButtonServicioTransporteActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaServicioTransporte();

		//this.jTabbedPaneRelacionesVehiculo.updateUI();
		//this.jTabbedPaneRelacionesVehiculo.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesVehiculo.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("ServicioTransporte")) {
				int row=this.jTableDatosVehiculo.getSelectedRow();
				jButtonServicioTransporteActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Servicio Transporte")) {

					if(this.isTienePermisosServicioTransporte && this.vehiculoConstantesFunciones.mostrarServicioTransporteVehiculo && !VehiculoConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Servicio Transportes"+"("+ServicioTransporteConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Servicio Transportes");

						if(vehiculoConstantesFunciones.resaltarServicioTransporteVehiculo!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(vehiculoConstantesFunciones.resaltarServicioTransporteVehiculo);
						}

						jmenuItem.setEnabled(this.vehiculoConstantesFunciones.activarServicioTransporteVehiculo);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"ServicioTransporte"));

						

						this.jInternalFrameDetalleFormVehiculo.jmenuDetalleVehiculo.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyVehiculo(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVehiculo(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVehiculo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVehiculoListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVehiculo();
		
		this.cargarCombosFrameForeignKeyVehiculo();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVehiculo();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVehiculo();
		}
	}
	
	

	public void cargarCombosForeignKeyDetalleActivoFijo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyDetalleActivoFijoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
				this.cargarCombosFrameDetalleActivoFijosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaDetalleActivoFijo(this.detalleactivofijosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAseguradora(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAseguradoraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAseguradora();
				this.cargarCombosFrameAseguradorasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAseguradora(this.aseguradorasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVehiculoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			
			if(jTableDatosVehiculo.getRowCount()>=1) {
				jTableDatosVehiculo.removeRowSelectionInterval(0, jTableDatosVehiculo.getRowCount()-1);						
			}
			
			this.isEsNuevoVehiculo=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVehiculo(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVehiculo(true);			
			//this.vehiculo=new Vehiculo();
			//this.vehiculo.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVehiculo(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculo() ;
			
			if(VehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVehiculo(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vehiculo);	
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);				
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Vehiculo: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVehiculoActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVehiculo.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVehiculo.getSelectedRows().length;			
			}
			
			vehiculosSeleccionados=this.getVehiculosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVehiculo--;			
				//Vehiculo vehiculoAux= new Vehiculo();			
				//vehiculoAux.setId(this.iIdNuevoVehiculo);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Vehiculo vehiculoOrigen=new Vehiculo();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Vehiculo vehiculoOrigen : vehiculosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vehiculoOrigen =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vehiculoOrigen =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVehiculo();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vehiculo.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVehiculo(vehiculoOrigen,this.vehiculo,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vehiculoLogic.getVehiculos().add(this.vehiculoAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vehiculos.add(this.vehiculoAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVehiculo(false);
				
				this.jTableDatosVehiculo.setRowSelectionInterval(this.getIndiceNuevoVehiculo(), this.getIndiceNuevoVehiculo());
				
				int iLastRow =  this.jTableDatosVehiculo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVehiculo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVehiculo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVehiculo(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();									
		
			Vehiculo vehiculoOrigen=new Vehiculo();
			Vehiculo vehiculoDestino=new Vehiculo();
				
			vehiculosSeleccionados=this.getVehiculosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVehiculo.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vehiculosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVehiculo.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoOrigen =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vehiculoOrigen =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vehiculoDestino =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vehiculoDestino =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vehiculoOrigen =vehiculosSeleccionados.get(0);
				vehiculoDestino =vehiculosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVehiculo(vehiculoOrigen,vehiculoDestino,true,false);
				
				vehiculoDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vehiculoDestino,vehiculoLogic.getVehiculos());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vehiculoDestino,vehiculos);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVehiculo(false);
				
				//this.jTableDatosVehiculo.setRowSelectionInterval(this.getIndiceNuevoVehiculo(), this.getIndiceNuevoVehiculo());
				
				int iLastRow =  this.jTableDatosVehiculo.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVehiculo.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVehiculo.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVehiculo(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVehiculo.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVehiculo.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVehiculo.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVehiculo.setVisible(!isVisible);
			this.jPanelPaginacionVehiculo.setVisible(!isVisible);
			this.jPanelAccionesVehiculo.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVehiculo();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVehiculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVehiculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVehiculo();
			
			this.abrirFrameOrderByVehiculo();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVehiculo();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVehiculo(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVehiculo);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVehiculo.isMaximum()) {
					this.jInternalFrameDetalleFormVehiculo.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVehiculo.setSize(this.jInternalFrameDetalleFormVehiculo.iWidthFormulario,this.jInternalFrameDetalleFormVehiculo.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVehiculo.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVehiculo.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVehiculo.isMaximum()) {
						this.jInternalFrameDetalleFormVehiculo.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVehiculo.jContentPaneDetalleVehiculo.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVehiculo.jContentPaneDetalleVehiculo.getWidth(),VehiculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVehiculo.jContentPaneDetalleVehiculo.getWidth(),VehiculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVehiculo.jContentPaneDetalleVehiculo.getWidth(),VehiculoConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaServicioTransporte();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVehiculo.setVisible(true);
	        this.jInternalFrameDetalleFormVehiculo.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVehiculo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVehiculo==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculo,false,this);
				} else {
					this.jInternalFrameOrderByVehiculo=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVehiculo,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVehiculo);
				this.jInternalFrameOrderByVehiculo.setVisible(false);
				this.jInternalFrameOrderByVehiculo.setSelected(false);
				
				this.jInternalFrameOrderByVehiculo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVehiculo"));
				
				this.inicializarActualizarBindingTablaOrderByVehiculo();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVehiculo() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVehiculo==null) {
				
				this.jInternalFrameImportacionVehiculo=new ImportacionJInternalFrame(VehiculoConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVehiculo);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVehiculo);
				this.jInternalFrameImportacionVehiculo.setVisible(false);
				this.jInternalFrameImportacionVehiculo.setSelected(false);


				this.jInternalFrameImportacionVehiculo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVehiculo"));
				this.jInternalFrameImportacionVehiculo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVehiculo"));
				this.jInternalFrameImportacionVehiculo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVehiculo"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVehiculo() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVehiculo==null) {
				this.jInternalFrameReporteDinamicoVehiculo=new ReporteDinamicoJInternalFrame(VehiculoConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVehiculo);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVehiculo);
				this.jInternalFrameReporteDinamicoVehiculo.setVisible(false);
				this.jInternalFrameReporteDinamicoVehiculo.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVehiculo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVehiculo"));
				this.jInternalFrameReporteDinamicoVehiculo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVehiculo"));
				this.jInternalFrameReporteDinamicoVehiculo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVehiculo"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVehiculo();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaServicioTransporte() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormVehiculo.jContentPaneDetalleVehiculo.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleVehiculo() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVehiculo);
			
	       	this.jInternalFrameDetalleFormVehiculo.setVisible(false);
	        this.jInternalFrameDetalleFormVehiculo.setSelected(false);
			
			//this.jInternalFrameDetalleFormVehiculo.dispose();
			//this.jInternalFrameDetalleFormVehiculo=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVehiculo() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVehiculo.setVisible(true);
	        this.jInternalFrameReporteDinamicoVehiculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVehiculo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVehiculo.setVisible(true);
	        this.jInternalFrameImportacionVehiculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVehiculo() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVehiculo.setVisible(true);
	        this.jInternalFrameOrderByVehiculo.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVehiculo() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVehiculo.setVisible(false);
	        this.jInternalFrameOrderByVehiculo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVehiculo() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVehiculo.setVisible(false);
	        this.jInternalFrameReporteDinamicoVehiculo.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVehiculo() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVehiculo.setVisible(false);
	        this.jInternalFrameImportacionVehiculo.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVehiculo(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVehiculo(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVehiculo(true);
			//this.isEsNuevoVehiculo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVehiculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVehiculo(false) ;
			
			if(vehiculoSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getEsGuardarRelacionado() && ServicioTransporteJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonServicioTransporteActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(VehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVehiculo(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVehiculoActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVehiculo(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVehiculo(true);
			//this.isEsNuevoVehiculo=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vehiculo.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVehiculo("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVehiculo(false) ;
			
			if(VehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVehiculo(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculo(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaDetalleActivoFijo(List<DetalleActivoFijo> detalleactivofijosForeignKey)throws Exception{
		TableColumn tableColumnDetalleActivoFijo=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));
		TableCellEditor tableCellEditorDetalleActivoFijo =tableColumnDetalleActivoFijo.getCellEditor();

		DetalleActivoFijoTableCell detalleactivofijoTableCellFk=(DetalleActivoFijoTableCell)tableCellEditorDetalleActivoFijo;

		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.setdetalleactivofijosForeignKey(detalleactivofijosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVehiculo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//detalleactivofijoTableCellFk.setRowActual(intSelectedRow);
			//detalleactivofijoTableCellFk.setdetalleactivofijosForeignKeyActual(detalleactivofijosForeignKey);
		//}


		if(detalleactivofijoTableCellFk!=null) {
			detalleactivofijoTableCellFk.RecargarDetalleActivoFijosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAseguradora(List<Aseguradora> aseguradorasForeignKey)throws Exception{
		TableColumn tableColumnAseguradora=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_IDASEGURADORA));
		TableCellEditor tableCellEditorAseguradora =tableColumnAseguradora.getCellEditor();

		AseguradoraTableCell aseguradoraTableCellFk=(AseguradoraTableCell)tableCellEditorAseguradora;

		if(aseguradoraTableCellFk!=null) {
			aseguradoraTableCellFk.setaseguradorasForeignKey(aseguradorasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVehiculo.getSelectedRow();

		//if(intSelectedRow<=0) {
			//aseguradoraTableCellFk.setRowActual(intSelectedRow);
			//aseguradoraTableCellFk.setaseguradorasForeignKeyActual(aseguradorasForeignKey);
		//}


		if(aseguradoraTableCellFk!=null) {
			aseguradoraTableCellFk.RecargarAseguradorasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVehiculo(false);
			
			//if(!this.isEsNuevoVehiculo) {								
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				
			}
			
			if(this.permiteMantenimiento(this.vehiculo)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVehiculo=true;
					this.inicializarActualizarBindingTablaVehiculo(false);
					this.isEsNuevoVehiculo=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVehiculo=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVehiculo=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVehiculo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVehiculo(false);
				
				this.habilitarDeshabilitarControlesVehiculo(false);
			
												
				
				if(VehiculoJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVehiculo();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVehiculoActionPerformed(evt,vehiculoSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVehiculo(this.vehiculo,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVehiculo.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vehiculoSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vehiculo.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVehiculoActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				this.vehiculo.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				this.vehiculo.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vehiculo)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VehiculoModel) this.jTableDatosVehiculo.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVehiculo=true;
				this.inicializarActualizarBindingTablaVehiculo(false);
				this.isEsNuevoVehiculo=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVehiculo(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVehiculo(false);
				
				this.habilitarDeshabilitarControlesVehiculo(false);
				
				
				
				if(VehiculoJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVehiculo();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVehiculoActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVehiculo.getRowCount()>=1) {
				jTableDatosVehiculo.removeRowSelectionInterval(0, jTableDatosVehiculo.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVehiculo(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVehiculo(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVehiculo(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVehiculo(false) ;
			
			this.isEsNuevoVehiculo=false;
			
			if(VehiculoJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVehiculo();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVehiculo(false);
				
				//SI ES MANUAL
				if(VehiculoJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVehiculo();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVehiculo--;			
			//Vehiculo vehiculoAux= new Vehiculo();			
			//vehiculoAux.setId(this.iIdNuevoVehiculo);
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVehiculo();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
			
			this.vehiculo.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vehiculoLogic.getVehiculos().add(this.vehiculoAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vehiculos.add(this.vehiculoAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVehiculo(false);
			
			this.jTableDatosVehiculo.setRowSelectionInterval(this.getIndiceNuevoVehiculo(), this.getIndiceNuevoVehiculo());
			
			int iLastRow =  this.jTableDatosVehiculo.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVehiculo.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVehiculo.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVehiculo(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVehiculo(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculo(false);
			
			//SI ES MANUAL
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVehiculo();
			}
			
			//this.abrirFrameTreeVehiculo();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVehiculoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE VehiculoS ?", "MANTENIMIENTO DE Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVehiculo.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVehiculo();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vehiculoReturnGeneral=vehiculoLogic.procesarImportacionVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vehiculoParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVehiculoReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVehiculoActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVehiculo.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVehiculo.setFileImportacion(this.jInternalFrameImportacionVehiculo.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVehiculo.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVehiculo.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVehiculo.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVehiculo.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		

		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VehiculoBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VehiculoBaseDesign.jrxml";
			
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
			
			this.generarReporteVehiculos("Todos",vehiculosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VehiculoConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_DetalleActivoFijo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_DetalleActivoFijo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_DetalleActivoFijo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_DetalleActivoFijo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_IDASEGURADORA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Aseguradora_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Aseguradora_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Aseguradora_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Aseguradora_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPoliza_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPoliza_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPoliza_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPoliza_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_FECHAEMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEmision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEmision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEmision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEmision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaVencimiento_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaVencimiento_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaVencimiento_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaVencimiento_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_VALORASEGURADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorAsegurado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorAsegurado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorAsegurado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorAsegurado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorDeducible_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorDeducible_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorDeducible_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorDeducible_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMatricula_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMatricula_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMatricula_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMatricula_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMOTOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroMotor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroMotor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroMotor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroMotor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROCHASIS:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroChasis_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroChasis_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroChasis_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroChasis_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPlaca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPlaca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPlaca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPlaca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorComercial_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorComercial_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorComercial_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorComercial_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VehiculoConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVehiculo.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VehiculoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VehiculoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoria="id_detalle_activo_fijo";
					break;

				case VehiculoConstantesFunciones.LABEL_IDASEGURADORA:
					sNombreCampoCategoria="id_aseguradora";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA:
					sNombreCampoCategoria="numero_poliza";
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoria="fecha_emision";
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoria="fecha_vencimiento";
					break;

				case VehiculoConstantesFunciones.LABEL_VALORASEGURADO:
					sNombreCampoCategoria="valor_asegurado";
					break;

				case VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE:
					sNombreCampoCategoria="valor_deducible";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA:
					sNombreCampoCategoria="numero_matricula";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMOTOR:
					sNombreCampoCategoria="numero_motor";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROCHASIS:
					sNombreCampoCategoria="numero_chasis";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					sNombreCampoCategoria="numero_placa";
					break;

				case VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL:
					sNombreCampoCategoria="valor_comercial";
					break;

				case VehiculoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VehiculoConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VehiculoConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					sNombreCampoCategoriaValor="id_detalle_activo_fijo";
					break;

				case VehiculoConstantesFunciones.LABEL_IDASEGURADORA:
					sNombreCampoCategoriaValor="id_aseguradora";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA:
					sNombreCampoCategoriaValor="numero_poliza";
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAEMISION:
					sNombreCampoCategoriaValor="fecha_emision";
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					sNombreCampoCategoriaValor="fecha_vencimiento";
					break;

				case VehiculoConstantesFunciones.LABEL_VALORASEGURADO:
					sNombreCampoCategoriaValor="valor_asegurado";
					break;

				case VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE:
					sNombreCampoCategoriaValor="valor_deducible";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA:
					sNombreCampoCategoriaValor="numero_matricula";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMOTOR:
					sNombreCampoCategoriaValor="numero_motor";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROCHASIS:
					sNombreCampoCategoriaValor="numero_chasis";
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					sNombreCampoCategoriaValor="numero_placa";
					break;

				case VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL:
					sNombreCampoCategoriaValor="valor_comercial";
					break;

				case VehiculoConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VehiculoConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VehiculoConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle Activo Fijo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_detalle_activo_fijo");
					break;

				case VehiculoConstantesFunciones.LABEL_IDASEGURADORA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Aseguradora",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_aseguradora");
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Poliza",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_poliza");
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAEMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Emision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_emision");
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Vencimiento",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_vencimiento");
					break;

				case VehiculoConstantesFunciones.LABEL_VALORASEGURADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Asegurado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_asegurado");
					break;

				case VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Deducible",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_deducible");
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Matricula",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_matricula");
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMOTOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Motor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_motor");
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROCHASIS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Chasis",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_chasis");
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Placa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_placa");
					break;

				case VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Comercial",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_comercial");
					break;

				case VehiculoConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
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
	
	public void jButtonGenerarExcelReporteDinamicoVehiculoActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Vehiculos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VehiculoConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getdetalleactivofijo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_IDASEGURADORA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDASEGURADORA);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getaseguradora_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getnumero_poliza());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAEMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_FECHAEMISION);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getfecha_emision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getfecha_vencimiento());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_VALORASEGURADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORASEGURADO);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getvalor_asegurado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getvalor_deducible());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getnumero_matricula());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROMOTOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getnumero_motor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROCHASIS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getnumero_chasis());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_NUMEROPLACA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROPLACA);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getnumero_placa());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getvalor_comercial());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VehiculoConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VehiculoConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(Vehiculo vehiculo:vehiculosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vehiculo.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelVehiculo(row);				
			//	iRow++;
			//}				
			
			//for(Vehiculo vehiculoAux:vehiculosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVehiculo(vehiculoAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
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
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculo(false);
			
			//SI ES MANUAL
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVehiculo();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculo(false);
			
			//SI ES MANUAL
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVehiculo();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVehiculoActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVehiculo(false);
			
			//SI ES MANUAL
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVehiculo();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVehiculo() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVehiculo.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVehiculo.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVehiculo.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVehiculo.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVehiculo.setMinimumSize(dimensionMinimum);
		this.jTableDatosVehiculo.setMaximumSize(dimensionMaximum);
		this.jTableDatosVehiculo.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVehiculo(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVehiculo(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVehiculo(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVehiculo(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVehiculo(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVehiculo(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVehiculo(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVehiculo(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VehiculoJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVehiculo() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVehiculo();
		
		this.inicializarActualizarBindingBotonesManualVehiculo(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVehiculo();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVehiculo() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVehiculo(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVehiculo(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVehiculo.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVehiculo.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVehiculo.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVehiculo!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVehiculo.jCheckBoxPostAccionNuevoVehiculo.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVehiculo.jCheckBoxPostAccionSinCerrarVehiculo.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVehiculo.jCheckBoxPostAccionSinMensajeVehiculo.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVehiculo.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVehiculo.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVehiculo.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVehiculo!=null) {
				this.jInternalFrameDetalleFormVehiculo.jCheckBoxPostAccionNuevoVehiculo.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVehiculo.jCheckBoxPostAccionSinCerrarVehiculo.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVehiculo.jCheckBoxPostAccionSinMensajeVehiculo.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVehiculo.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVehiculo.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVehiculo.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVehiculo.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVehiculo.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVehiculo.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVehiculo.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVehiculo.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVehiculo.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVehiculo(Boolean esInicializar) throws Exception {
		try	{	
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVehiculo(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVehiculo() throws Exception {
		try	{
			if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVehiculo();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVehiculo() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVehiculo() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVehiculo.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVehiculo.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVehiculo.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVehiculo.addItem(reporte);
			}
			
			
			if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVehiculo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVehiculo.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVehiculo.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVehiculo.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVehiculo.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVehiculo.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVehiculo.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVehiculo();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVehiculo() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
				this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
				this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
				
				if(this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVehiculo.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVehiculo.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVehiculo.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VehiculoConstantesFunciones.getTiposSeleccionarVehiculo(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VehiculoConstantesFunciones.getTiposSeleccionarVehiculo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VehiculoConstantesFunciones.getTiposSeleccionarVehiculo(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVehiculo.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVehiculo.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVehiculo()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.getSelectedItem()!=null){this.id_aseguradoraFK_IdAseguradora=((Aseguradora)this.jComboBoxid_aseguradoraFK_IdAseguradoraVehiculo.getSelectedItem()).getId();}
		if(this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.getSelectedItem()!=null){this.id_detalle_activo_fijoFK_IdDetalleActivoFijo=((DetalleActivoFijo)this.jComboBoxid_detalle_activo_fijoFK_IdDetalleActivoFijoVehiculo.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVehiculo(Boolean esInicializar) throws Exception {				
		if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVehiculo();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVehiculo() throws Exception {
		this.inicializarActualizarBindingTablaVehiculo(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVehiculo() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVehiculoOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculoOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVehiculo(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vehiculoLogic.getVehiculos().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vehiculos.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVehiculo.setModel(new VehiculoModel(this.vehiculoLogic.getVehiculos(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVehiculo.setModel(new VehiculoModel(this.vehiculos,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVehiculo!=null && this.jInternalFrameOrderByVehiculo.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVehiculo();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VehiculoConstantesFunciones.SCLASSWEBTITULO,vehiculoConstantesFunciones.resaltarSeleccionarVehiculo,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VehiculoConstantesFunciones.SCLASSWEBTITULO,vehiculoConstantesFunciones.resaltarSeleccionarVehiculo,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_ID));

		if(this.vehiculoConstantesFunciones.mostraridVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoConstantesFunciones.resaltaridVehiculo,this.vehiculoConstantesFunciones.activaridVehiculo,iSizeTabla,this,true,"idVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltaridVehiculo,this.vehiculoConstantesFunciones.activaridVehiculo,this,true,"idVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_IDEMPRESA));

		if(this.vehiculoConstantesFunciones.mostrarid_empresaVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.vehiculoConstantesFunciones.resaltarid_empresaVehiculo,this,this.vehiculoConstantesFunciones.activarid_empresaVehiculo,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.vehiculoConstantesFunciones.resaltarid_empresaVehiculo,this,this.vehiculoConstantesFunciones.activarid_empresaVehiculo,false,"id_empresaVehiculo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.vehiculoConstantesFunciones.mostrarid_sucursalVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.vehiculoConstantesFunciones.resaltarid_sucursalVehiculo,this,this.vehiculoConstantesFunciones.activarid_sucursalVehiculo,iSizeTabla));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.vehiculoConstantesFunciones.resaltarid_sucursalVehiculo,this,this.vehiculoConstantesFunciones.activarid_sucursalVehiculo,false,"id_sucursalVehiculo","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO));

		if(this.vehiculoConstantesFunciones.mostrarid_detalle_activo_fijoVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.vehiculoConstantesFunciones.resaltarid_detalle_activo_fijoVehiculo,this,this.vehiculoConstantesFunciones.activarid_detalle_activo_fijoVehiculo,iSizeTabla));
			tableColumn.setCellEditor(new DetalleActivoFijoTableCell(this.detalleactivofijosForeignKey,this.vehiculoConstantesFunciones.resaltarid_detalle_activo_fijoVehiculo,this,this.vehiculoConstantesFunciones.activarid_detalle_activo_fijoVehiculo,true,"id_detalle_activo_fijoVehiculo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_IDASEGURADORA));

		if(this.vehiculoConstantesFunciones.mostrarid_aseguradoraVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_IDASEGURADORA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AseguradoraTableCell(this.aseguradorasForeignKey,this.vehiculoConstantesFunciones.resaltarid_aseguradoraVehiculo,this,this.vehiculoConstantesFunciones.activarid_aseguradoraVehiculo,iSizeTabla));
			tableColumn.setCellEditor(new AseguradoraTableCell(this.aseguradorasForeignKey,this.vehiculoConstantesFunciones.resaltarid_aseguradoraVehiculo,this,this.vehiculoConstantesFunciones.activarid_aseguradoraVehiculo,true,"id_aseguradoraVehiculo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA));

		if(this.vehiculoConstantesFunciones.mostrarnumero_polizaVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoConstantesFunciones.resaltarnumero_polizaVehiculo,this.vehiculoConstantesFunciones.activarnumero_polizaVehiculo,iSizeTabla,this,true,"numero_polizaVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarnumero_polizaVehiculo,this.vehiculoConstantesFunciones.activarnumero_polizaVehiculo,this,true,"numero_polizaVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_FECHAEMISION));

		if(this.vehiculoConstantesFunciones.mostrarfecha_emisionVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_FECHAEMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.vehiculoConstantesFunciones.resaltarfecha_emisionVehiculo,this.vehiculoConstantesFunciones.activarfecha_emisionVehiculo,iSizeTabla,this,true,"fecha_emisionVehiculo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.vehiculoConstantesFunciones.resaltarfecha_emisionVehiculo,this.vehiculoConstantesFunciones.activarfecha_emisionVehiculo,this,true,"fecha_emisionVehiculo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO));

		if(this.vehiculoConstantesFunciones.mostrarfecha_vencimientoVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.vehiculoConstantesFunciones.resaltarfecha_vencimientoVehiculo,this.vehiculoConstantesFunciones.activarfecha_vencimientoVehiculo,iSizeTabla,this,true,"fecha_vencimientoVehiculo","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.vehiculoConstantesFunciones.resaltarfecha_vencimientoVehiculo,this.vehiculoConstantesFunciones.activarfecha_vencimientoVehiculo,this,true,"fecha_vencimientoVehiculo","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_VALORASEGURADO));

		if(this.vehiculoConstantesFunciones.mostrarvalor_aseguradoVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_VALORASEGURADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoConstantesFunciones.resaltarvalor_aseguradoVehiculo,this.vehiculoConstantesFunciones.activarvalor_aseguradoVehiculo,iSizeTabla,this,true,"valor_aseguradoVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarvalor_aseguradoVehiculo,this.vehiculoConstantesFunciones.activarvalor_aseguradoVehiculo,this,true,"valor_aseguradoVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE));

		if(this.vehiculoConstantesFunciones.mostrarvalor_deducibleVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoConstantesFunciones.resaltarvalor_deducibleVehiculo,this.vehiculoConstantesFunciones.activarvalor_deducibleVehiculo,iSizeTabla,this,true,"valor_deducibleVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarvalor_deducibleVehiculo,this.vehiculoConstantesFunciones.activarvalor_deducibleVehiculo,this,true,"valor_deducibleVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA));

		if(this.vehiculoConstantesFunciones.mostrarnumero_matriculaVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoConstantesFunciones.resaltarnumero_matriculaVehiculo,this.vehiculoConstantesFunciones.activarnumero_matriculaVehiculo,iSizeTabla,this,true,"numero_matriculaVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarnumero_matriculaVehiculo,this.vehiculoConstantesFunciones.activarnumero_matriculaVehiculo,this,true,"numero_matriculaVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_NUMEROMOTOR));

		if(this.vehiculoConstantesFunciones.mostrarnumero_motorVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_NUMEROMOTOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoConstantesFunciones.resaltarnumero_motorVehiculo,this.vehiculoConstantesFunciones.activarnumero_motorVehiculo,iSizeTabla,this,true,"numero_motorVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarnumero_motorVehiculo,this.vehiculoConstantesFunciones.activarnumero_motorVehiculo,this,true,"numero_motorVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_NUMEROCHASIS));

		if(this.vehiculoConstantesFunciones.mostrarnumero_chasisVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_NUMEROCHASIS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoConstantesFunciones.resaltarnumero_chasisVehiculo,this.vehiculoConstantesFunciones.activarnumero_chasisVehiculo,iSizeTabla,this,true,"numero_chasisVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarnumero_chasisVehiculo,this.vehiculoConstantesFunciones.activarnumero_chasisVehiculo,this,true,"numero_chasisVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_NUMEROPLACA));

		if(this.vehiculoConstantesFunciones.mostrarnumero_placaVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_NUMEROPLACA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoConstantesFunciones.resaltarnumero_placaVehiculo,this.vehiculoConstantesFunciones.activarnumero_placaVehiculo,iSizeTabla,this,true,"numero_placaVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarnumero_placaVehiculo,this.vehiculoConstantesFunciones.activarnumero_placaVehiculo,this,true,"numero_placaVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL));

		if(this.vehiculoConstantesFunciones.mostrarvalor_comercialVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vehiculoConstantesFunciones.resaltarvalor_comercialVehiculo,this.vehiculoConstantesFunciones.activarvalor_comercialVehiculo,iSizeTabla,this,true,"valor_comercialVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltarvalor_comercialVehiculo,this.vehiculoConstantesFunciones.activarvalor_comercialVehiculo,this,true,"valor_comercialVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,VehiculoConstantesFunciones.LABEL_DESCRIPCION));

		if(this.vehiculoConstantesFunciones.mostrardescripcionVehiculo && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VehiculoConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.vehiculoConstantesFunciones.resaltardescripcionVehiculo,this.vehiculoConstantesFunciones.activardescripcionVehiculo,iSizeTabla,this,true,"descripcionVehiculo","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vehiculoConstantesFunciones.resaltardescripcionVehiculo,this.vehiculoConstantesFunciones.activardescripcionVehiculo,this,true,"descripcionVehiculo","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VehiculoPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vehiculoSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosServicioTransporte && this.vehiculoConstantesFunciones.mostrarServicioTransporteVehiculo && !VehiculoConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Servicio Transportes");
				tableColumn.setHeaderValue("Servicio Transportes");
				tableColumn.setCellRenderer(new ServicioTransporteTableCell(vehiculoConstantesFunciones.resaltarServicioTransporteVehiculo,this,this.vehiculoConstantesFunciones.activarServicioTransporteVehiculo));
				tableColumn.setCellEditor(new ServicioTransporteTableCell(vehiculoConstantesFunciones.resaltarServicioTransporteVehiculo,this,this.vehiculoConstantesFunciones.activarServicioTransporteVehiculo));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosVehiculo.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vehiculoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vehiculoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVehiculo.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vehiculoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vehiculoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVehiculo.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVehiculo && this.isPermisoGuardarCambiosVehiculo) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vehiculoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vehiculoSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVehiculo.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.vehiculoSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false,iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,true,false,iSizeTabla));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosVehiculo.addColumn(tableColumn);
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
			
			this.jTableDatosVehiculo.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVehiculo && this.isPermisoGuardarCambiosVehiculo) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.vehiculoSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVehiculo && this.isPermisoGuardarCambiosVehiculo) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVehiculo.moveColumn(this.jTableDatosVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVehiculo.moveColumn(this.jTableDatosVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.vehiculoSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosVehiculo.moveColumn(this.jTableDatosVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVehiculo.moveColumn(this.jTableDatosVehiculo.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVehiculo.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVehiculo.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVehiculo,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVehiculo.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVehiculo.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVehiculo.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVehiculo.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVehiculo.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=vehiculoLogic.getVehiculos().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vehiculos.size()-1;
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
		//this.jTableDatosVehiculo.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVehiculo.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVehiculo();
			
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
				
				//this.isEsNuevoVehiculo=false;
					
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
				if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVehiculo==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVehiculo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVehiculo.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vehiculo.getsType().equals("DUPLICADO")
				   || this.vehiculo.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVehiculo=true;
				
				} else {
					this.isEsNuevoVehiculo=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vehiculoSessionBean.getEsGuardarRelacionado()) {
					if(this.vehiculo.getId()>=0 && !this.vehiculo.getIsNew()) {						
						this.isEsNuevoVehiculo=false;
						
					} else {
						this.isEsNuevoVehiculo=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVehiculo(esRelaciones);						
				
				this.seleccionarVehiculo(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vehiculo.getId()<0) {
					this.isEsNuevoVehiculo=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVehiculo(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVehiculo(evt,rowIndex);
				}	
				
				if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Vehiculo: " + this.dDif); 
					}
				}								
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVehiculo(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vehiculo)) {
					if(this.vehiculo.getId()>0) {
						this.vehiculo.setIsDeleted(true);
						
						this.vehiculosEliminados.add(this.vehiculo);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vehiculoLogic.getVehiculos().remove(this.vehiculo);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vehiculos.remove(this.vehiculo);				
					}
					
					
					((VehiculoModel) this.jTableDatosVehiculo.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVehiculo(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVehiculo(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVehiculo) {
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVehiculo.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVehiculo.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVehiculo(this.vehiculo);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.vehiculoConstantesFunciones.cargarid_empresaVehiculo || this.vehiculoConstantesFunciones.event_dependid_empresaVehiculo) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.vehiculo.getid_empresa());
									//this.inicializarActualizarBindingVehiculo(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(vehiculo.getEmpresa()!=null) {
							this.empresasForeignKey.add(vehiculo.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.vehiculo.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.vehiculoConstantesFunciones.cargarid_sucursalVehiculo || this.vehiculoConstantesFunciones.event_dependid_sucursalVehiculo) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.vehiculo.getid_sucursal());
									//this.inicializarActualizarBindingVehiculo(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(vehiculo.getSucursal()!=null) {
							this.sucursalsForeignKey.add(vehiculo.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.vehiculo.getid_sucursal(),false,"Formulario");

					//DetalleActivoFijo
					if(!this.vehiculoConstantesFunciones.cargarid_detalle_activo_fijoVehiculo || this.vehiculoConstantesFunciones.event_dependid_detalle_activo_fijoVehiculo) {
						//this.cargarCombosDetalleActivoFijosForeignKeyLista(" where id="+this.vehiculo.getid_detalle_activo_fijo());
									//this.inicializarActualizarBindingVehiculo(false,false);
						this.detalleactivofijosForeignKey=new ArrayList<DetalleActivoFijo>();

						if(vehiculo.getDetalleActivoFijo()!=null) {
							this.detalleactivofijosForeignKey.add(vehiculo.getDetalleActivoFijo());
						}

						this.addItemDefectoCombosForeignKeyDetalleActivoFijo();
						this.cargarCombosFrameDetalleActivoFijosForeignKey("Todos");
					}
					this.setActualDetalleActivoFijoForeignKey(this.vehiculo.getid_detalle_activo_fijo(),false,"Formulario");

					//Aseguradora
					if(!this.vehiculoConstantesFunciones.cargarid_aseguradoraVehiculo || this.vehiculoConstantesFunciones.event_dependid_aseguradoraVehiculo) {
						//this.cargarCombosAseguradorasForeignKeyLista(" where id="+this.vehiculo.getid_aseguradora());
									//this.inicializarActualizarBindingVehiculo(false,false);
						this.aseguradorasForeignKey=new ArrayList<Aseguradora>();

						if(vehiculo.getAseguradora()!=null) {
							this.aseguradorasForeignKey.add(vehiculo.getAseguradora());
						}

						this.addItemDefectoCombosForeignKeyAseguradora();
						this.cargarCombosFrameAseguradorasForeignKey("Todos");
					}
					this.setActualAseguradoraForeignKey(this.vehiculo.getid_aseguradora(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVehiculo("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVehiculo(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVehiculo() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVehiculo(Vehiculo vehiculo) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVehiculo(vehiculo,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVehiculo(Vehiculo vehiculo,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVehiculo(vehiculo);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVehiculo(vehiculo,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVehiculo(vehiculo);
	}
	
	public void setVariablesObjetoActualToFormularioVehiculo(Vehiculo vehiculo) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setText(vehiculo.getId().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setText(vehiculo.getnumero_poliza());
			this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setDate(vehiculo.getfecha_emision());
			this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setDate(vehiculo.getfecha_vencimiento());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setText(vehiculo.getvalor_asegurado().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setText(vehiculo.getvalor_deducible().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setText(vehiculo.getnumero_matricula());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setText(vehiculo.getnumero_motor());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setText(vehiculo.getnumero_chasis());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setText(vehiculo.getnumero_placa());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setText(vehiculo.getvalor_comercial().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setText(vehiculo.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Vehiculo vehiculoLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vehiculoLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Vehiculo vehiculoLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vehiculoLocal=this.vehiculo;
			} else {
				vehiculoLocal=this.vehiculoAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vehiculoLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVehiculo(vehiculoLocal,true);
					
					if(vehiculoSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vehiculoLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vehiculoLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVehiculo(Vehiculo vehiculo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVehiculo(vehiculo,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(vehiculo);
	}
	
	public void setVariablesFormularioToObjetoActualVehiculo(Vehiculo vehiculo,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVehiculo(vehiculo,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVehiculo(Vehiculo vehiculo,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.getText()==null || this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.getText()=="" || this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.getText()=="Id") {
				this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setText("0");
			}

			if(conColumnasBase) {vehiculo.setId(Long.parseLong(this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelIdVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setnumero_poliza(this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_polizaVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setfecha_emision(this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_FECHAEMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelfecha_emisionVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setfecha_vencimiento(this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelfecha_vencimientoVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setvalor_asegurado(Double.parseDouble(this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_VALORASEGURADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_aseguradoVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setvalor_deducible(Double.parseDouble(this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_deducibleVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setnumero_matricula(this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_matriculaVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setnumero_motor(this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_NUMEROMOTOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_motorVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setnumero_chasis(this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_NUMEROCHASIS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_chasisVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setnumero_placa(this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_NUMEROPLACA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelnumero_placaVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setvalor_comercial(Double.parseDouble(this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabelvalor_comercialVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vehiculo.setdescripcion(this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VehiculoConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVehiculo.jLabeldescripcionVehiculo,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVehiculo(Vehiculo vehiculoBean,Vehiculo vehiculo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && vehiculoBean.getid_detalle_activo_fijo()!=null && !vehiculoBean.getid_detalle_activo_fijo().equals(-1L))) {vehiculo.setid_detalle_activo_fijo(vehiculoBean.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && vehiculoBean.getid_aseguradora()!=null && !vehiculoBean.getid_aseguradora().equals(-1L))) {vehiculo.setid_aseguradora(vehiculoBean.getid_aseguradora());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVehiculo(Vehiculo vehiculoOrigen,Vehiculo vehiculo,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vehiculoOrigen.getId()!=null && !vehiculoOrigen.getId().equals(0L))) {vehiculo.setId(vehiculoOrigen.getId());}}
			if(conDefault || (!conDefault && vehiculoOrigen.getid_detalle_activo_fijo()!=null && !vehiculoOrigen.getid_detalle_activo_fijo().equals(-1L))) {vehiculo.setid_detalle_activo_fijo(vehiculoOrigen.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && vehiculoOrigen.getid_aseguradora()!=null && !vehiculoOrigen.getid_aseguradora().equals(-1L))) {vehiculo.setid_aseguradora(vehiculoOrigen.getid_aseguradora());}
			if(conDefault || (!conDefault && vehiculoOrigen.getnumero_poliza()!=null && !vehiculoOrigen.getnumero_poliza().equals(""))) {vehiculo.setnumero_poliza(vehiculoOrigen.getnumero_poliza());}
			if(conDefault || (!conDefault && vehiculoOrigen.getfecha_emision()!=null && !vehiculoOrigen.getfecha_emision().equals(new Date()))) {vehiculo.setfecha_emision(vehiculoOrigen.getfecha_emision());}
			if(conDefault || (!conDefault && vehiculoOrigen.getfecha_vencimiento()!=null && !vehiculoOrigen.getfecha_vencimiento().equals(new Date()))) {vehiculo.setfecha_vencimiento(vehiculoOrigen.getfecha_vencimiento());}
			if(conDefault || (!conDefault && vehiculoOrigen.getvalor_asegurado()!=null && !vehiculoOrigen.getvalor_asegurado().equals(0.0))) {vehiculo.setvalor_asegurado(vehiculoOrigen.getvalor_asegurado());}
			if(conDefault || (!conDefault && vehiculoOrigen.getvalor_deducible()!=null && !vehiculoOrigen.getvalor_deducible().equals(0.0))) {vehiculo.setvalor_deducible(vehiculoOrigen.getvalor_deducible());}
			if(conDefault || (!conDefault && vehiculoOrigen.getnumero_matricula()!=null && !vehiculoOrigen.getnumero_matricula().equals(""))) {vehiculo.setnumero_matricula(vehiculoOrigen.getnumero_matricula());}
			if(conDefault || (!conDefault && vehiculoOrigen.getnumero_motor()!=null && !vehiculoOrigen.getnumero_motor().equals(""))) {vehiculo.setnumero_motor(vehiculoOrigen.getnumero_motor());}
			if(conDefault || (!conDefault && vehiculoOrigen.getnumero_chasis()!=null && !vehiculoOrigen.getnumero_chasis().equals(""))) {vehiculo.setnumero_chasis(vehiculoOrigen.getnumero_chasis());}
			if(conDefault || (!conDefault && vehiculoOrigen.getnumero_placa()!=null && !vehiculoOrigen.getnumero_placa().equals(""))) {vehiculo.setnumero_placa(vehiculoOrigen.getnumero_placa());}
			if(conDefault || (!conDefault && vehiculoOrigen.getvalor_comercial()!=null && !vehiculoOrigen.getvalor_comercial().equals(0.0))) {vehiculo.setvalor_comercial(vehiculoOrigen.getvalor_comercial());}
			if(conDefault || (!conDefault && vehiculoOrigen.getdescripcion()!=null && !vehiculoOrigen.getdescripcion().equals(""))) {vehiculo.setdescripcion(vehiculoOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVehiculo(Vehiculo vehiculo) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setText(vehiculo.getId().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setText(vehiculo.getnumero_poliza());
			this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setDate(vehiculo.getfecha_emision());
			this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setDate(vehiculo.getfecha_vencimiento());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setText(vehiculo.getvalor_asegurado().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setText(vehiculo.getvalor_deducible().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setText(vehiculo.getnumero_matricula());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setText(vehiculo.getnumero_motor());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setText(vehiculo.getnumero_chasis());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setText(vehiculo.getnumero_placa());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setText(vehiculo.getvalor_comercial().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setText(vehiculo.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVehiculo(VehiculoBean vehiculoBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setText(vehiculoBean.getId().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setText(vehiculoBean.getnumero_poliza());
			this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setDate(vehiculoBean.getfecha_emision());
			this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setDate(vehiculoBean.getfecha_vencimiento());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setText(vehiculoBean.getvalor_asegurado().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setText(vehiculoBean.getvalor_deducible().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setText(vehiculoBean.getnumero_matricula());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setText(vehiculoBean.getnumero_motor());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setText(vehiculoBean.getnumero_chasis());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setText(vehiculoBean.getnumero_placa());
			this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setText(vehiculoBean.getvalor_comercial().toString());
			this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setText(vehiculoBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVehiculo(VehiculoParameterReturnGeneral vehiculoReturnGeneral,VehiculoBean vehiculoBean,Boolean conDefault) throws Exception { 
		try {
			Vehiculo vehiculoLocal=new Vehiculo();
			
			vehiculoLocal=vehiculoReturnGeneral.getVehiculo();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vehiculoLocal.getId()!=null && !vehiculoLocal.getId().equals(0L))) {vehiculoBean.setId(vehiculoLocal.getId());}}
			if(conDefault || (!conDefault && vehiculoLocal.getid_detalle_activo_fijo()!=null && !vehiculoLocal.getid_detalle_activo_fijo().equals(-1L))) {vehiculoBean.setid_detalle_activo_fijo(vehiculoLocal.getid_detalle_activo_fijo());}
			if(conDefault || (!conDefault && vehiculoLocal.getid_aseguradora()!=null && !vehiculoLocal.getid_aseguradora().equals(-1L))) {vehiculoBean.setid_aseguradora(vehiculoLocal.getid_aseguradora());}
			if(conDefault || (!conDefault && vehiculoLocal.getnumero_poliza()!=null && !vehiculoLocal.getnumero_poliza().equals(""))) {vehiculoBean.setnumero_poliza(vehiculoLocal.getnumero_poliza());}
			if(conDefault || (!conDefault && vehiculoLocal.getfecha_emision()!=null && !vehiculoLocal.getfecha_emision().equals(new Date()))) {vehiculoBean.setfecha_emision(vehiculoLocal.getfecha_emision());}
			if(conDefault || (!conDefault && vehiculoLocal.getfecha_vencimiento()!=null && !vehiculoLocal.getfecha_vencimiento().equals(new Date()))) {vehiculoBean.setfecha_vencimiento(vehiculoLocal.getfecha_vencimiento());}
			if(conDefault || (!conDefault && vehiculoLocal.getvalor_asegurado()!=null && !vehiculoLocal.getvalor_asegurado().equals(0.0))) {vehiculoBean.setvalor_asegurado(vehiculoLocal.getvalor_asegurado());}
			if(conDefault || (!conDefault && vehiculoLocal.getvalor_deducible()!=null && !vehiculoLocal.getvalor_deducible().equals(0.0))) {vehiculoBean.setvalor_deducible(vehiculoLocal.getvalor_deducible());}
			if(conDefault || (!conDefault && vehiculoLocal.getnumero_matricula()!=null && !vehiculoLocal.getnumero_matricula().equals(""))) {vehiculoBean.setnumero_matricula(vehiculoLocal.getnumero_matricula());}
			if(conDefault || (!conDefault && vehiculoLocal.getnumero_motor()!=null && !vehiculoLocal.getnumero_motor().equals(""))) {vehiculoBean.setnumero_motor(vehiculoLocal.getnumero_motor());}
			if(conDefault || (!conDefault && vehiculoLocal.getnumero_chasis()!=null && !vehiculoLocal.getnumero_chasis().equals(""))) {vehiculoBean.setnumero_chasis(vehiculoLocal.getnumero_chasis());}
			if(conDefault || (!conDefault && vehiculoLocal.getnumero_placa()!=null && !vehiculoLocal.getnumero_placa().equals(""))) {vehiculoBean.setnumero_placa(vehiculoLocal.getnumero_placa());}
			if(conDefault || (!conDefault && vehiculoLocal.getvalor_comercial()!=null && !vehiculoLocal.getvalor_comercial().equals(0.0))) {vehiculoBean.setvalor_comercial(vehiculoLocal.getvalor_comercial());}
			if(conDefault || (!conDefault && vehiculoLocal.getdescripcion()!=null && !vehiculoLocal.getdescripcion().equals(""))) {vehiculoBean.setdescripcion(vehiculoLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVehiculoGenerico(Long idVehiculoSeleccionado,JComboBox jComboBoxVehiculo,List<Vehiculo> vehiculosLocal)throws Exception {
		try {
			Vehiculo  vehiculoTemp=null;

			for(Vehiculo vehiculoAux:vehiculosLocal) {
				if(vehiculoAux.getId()!=null && vehiculoAux.getId().equals(idVehiculoSeleccionado)) {
					vehiculoTemp=vehiculoAux;
					break;
				}
			}

			jComboBoxVehiculo.setSelectedItem(vehiculoTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVehiculoGenerico(JComboBox jComboBoxVehiculo,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVehiculo.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVehiculo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVehiculo.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVehiculo.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVehiculo.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVehiculo.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("ServicioTransporte")) {
			jButtonServicioTransporteActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vehiculo=(Vehiculo) vehiculoLogic.getVehiculos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vehiculo =(Vehiculo) vehiculos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!vehiculo.getIsNew() && !vehiculo.getIsChanged() && !vehiculo.getIsDeleted()) {
				sDescripcion=vehiculo.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=vehiculo.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!vehiculo.getIsNew() && !vehiculo.getIsChanged() && !vehiculo.getIsDeleted()) {
				sDescripcion=vehiculo.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=vehiculo.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("DetalleActivoFijo")) {
			//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
			if(!vehiculo.getIsNew() && !vehiculo.getIsChanged() && !vehiculo.getIsDeleted()) {
				sDescripcion=vehiculo.getdetalleactivofijo_descripcion();
			} else {
				//sDescripcion=this.getActualDetalleActivoFijoForeignKeyDescripcion((Long)value);
				sDescripcion=vehiculo.getdetalleactivofijo_descripcion();
			}
		}

		if(sTipo.equals("Aseguradora")) {
			//sDescripcion=this.getActualAseguradoraForeignKeyDescripcion((Long)value);
			if(!vehiculo.getIsNew() && !vehiculo.getIsChanged() && !vehiculo.getIsDeleted()) {
				sDescripcion=vehiculo.getaseguradora_descripcion();
			} else {
				//sDescripcion=this.getActualAseguradoraForeignKeyDescripcion((Long)value);
				sDescripcion=vehiculo.getaseguradora_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Vehiculo vehiculoRow=new Vehiculo();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vehiculoRow=(Vehiculo) vehiculoLogic.getVehiculos().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vehiculoRow=(Vehiculo) vehiculos.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonServicioTransporteActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Vehiculo vehiculo) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormVehiculo==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo = (Vehiculo)this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.vehiculo = (Vehiculo)this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(vehiculo!=null) {
						this.vehiculo = vehiculo;
					} else {
						this.vehiculo = new Vehiculo();
					}
				}

				if(this.isTienePermisosServicioTransporte && this.permiteMantenimiento(this.vehiculo)) {
					ServicioTransporteBeanSwingJInternalFrame serviciotransporteBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup=new ServicioTransporteBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						serviciotransporteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup;
					} else {
						serviciotransporteBeanSwingJInternalFrame=this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame;
					}

					List<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
					vehiculos.add(this.vehiculo);
					if(!esRelacionado) {
						//serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setConGuardarRelaciones(false);
						//serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					serviciotransporteBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormVehiculo.cargarServicioTransporteBeanSwingJInternalFrame(vehiculos,this.vehiculo,serviciotransporteBeanSwingJInternalFrame,/*conInicializar,*/serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getConGuardarRelaciones(),serviciotransporteBeanSwingJInternalFrame.serviciotransporteSessionBean.getEsGuardarRelacionado());
					serviciotransporteBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						serviciotransporteBeanSwingJInternalFrame.actualizarEstadoPanelsServicioTransporte("no_relacionado");

						serviciotransporteBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(ServicioTransporteConstantesFunciones.ITAMANIOFILATABLA + (ServicioTransporteConstantesFunciones.ITAMANIOFILATABLA/2));

						serviciotransporteBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderVehiculo=(TitledBorder)this.jScrollPanelDatosVehiculo.getBorder();
						TitledBorder titledBorderServicioTransporte=(TitledBorder)serviciotransporteBeanSwingJInternalFrame.jScrollPanelDatosServicioTransporte.getBorder();

						titledBorderServicioTransporte.setTitle(titledBorderVehiculo.getTitle() + " -> Servicio Transporte");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,serviciotransporteBeanSwingJInternalFrame);
						}

						serviciotransporteBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(serviciotransporteBeanSwingJInternalFrame);

						serviciotransporteBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.vehiculoSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Servicio Transporte",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVehiculo(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVehiculo.setVisible((this.isVisibilidadCeldaNuevoVehiculo && this.isPermisoNuevoVehiculo));			
			this.jButtonDuplicarVehiculo.setVisible((this.isVisibilidadCeldaDuplicarVehiculo && this.isPermisoDuplicarVehiculo));			
			this.jButtonCopiarVehiculo.setVisible((this.isVisibilidadCeldaCopiarVehiculo && this.isPermisoCopiarVehiculo));
			this.jButtonVerFormVehiculo.setVisible((this.isVisibilidadCeldaVerFormVehiculo && this.isPermisoVerFormVehiculo));
			
			this.jButtonAbrirOrderByVehiculo.setVisible((this.isVisibilidadCeldaOrdenVehiculo && this.isPermisoOrdenVehiculo));			
			
			this.jButtonNuevoRelacionesVehiculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesVehiculo && this.isPermisoNuevoVehiculo));			
			this.jButtonNuevoGuardarCambiosVehiculo.setVisible((this.isVisibilidadCeldaNuevoVehiculo && this.isPermisoNuevoVehiculo && this.isPermisoGuardarCambiosVehiculo));
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.jInternalFrameDetalleFormVehiculo.jButtonModificarVehiculo.setVisible((this.isVisibilidadCeldaModificarVehiculo && this.isPermisoActualizarVehiculo));	
			this.jInternalFrameDetalleFormVehiculo.jButtonActualizarVehiculo.setVisible((this.isVisibilidadCeldaActualizarVehiculo && this.isPermisoActualizarVehiculo));	
			this.jInternalFrameDetalleFormVehiculo.jButtonEliminarVehiculo.setVisible((this.isVisibilidadCeldaEliminarVehiculo && this.isPermisoEliminarVehiculo));
			this.jInternalFrameDetalleFormVehiculo.jButtonCancelarVehiculo.setVisible(this.isVisibilidadCeldaCancelarVehiculo);							
			this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.setVisible((this.isVisibilidadCeldaGuardarVehiculo && this.isPermisoGuardarCambiosVehiculo));			
			
			}
						
			this.jButtonGuardarCambiosTablaVehiculo.setVisible((this.isVisibilidadCeldaGuardarCambiosVehiculo && this.isPermisoGuardarCambiosVehiculo));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVehiculo.setVisible((this.isVisibilidadCeldaNuevoVehiculo && this.isPermisoNuevoVehiculo));						
			this.jButtonDuplicarToolBarVehiculo.setVisible((this.isVisibilidadCeldaDuplicarVehiculo && this.isPermisoDuplicarVehiculo));						
			this.jButtonCopiarToolBarVehiculo.setVisible((this.isVisibilidadCeldaCopiarVehiculo && this.isPermisoCopiarVehiculo));			
			this.jButtonVerFormToolBarVehiculo.setVisible((this.isVisibilidadCeldaVerFormVehiculo && this.isPermisoVerFormVehiculo));			
			this.jButtonAbrirOrderByToolBarVehiculo.setVisible((this.isVisibilidadCeldaOrdenVehiculo && this.isPermisoOrdenVehiculo));
			this.jButtonNuevoRelacionesToolBarVehiculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesVehiculo && this.isPermisoNuevoVehiculo));			
			this.jButtonNuevoGuardarCambiosToolBarVehiculo.setVisible((this.isVisibilidadCeldaNuevoVehiculo && this.isPermisoNuevoVehiculo && this.isPermisoGuardarCambiosVehiculo));			
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.jInternalFrameDetalleFormVehiculo.jButtonModificarToolBarVehiculo.setVisible((this.isVisibilidadCeldaModificarVehiculo && this.isPermisoActualizarVehiculo));	
			this.jInternalFrameDetalleFormVehiculo.jButtonActualizarToolBarVehiculo.setVisible((this.isVisibilidadCeldaActualizarVehiculo  && this.isPermisoActualizarVehiculo));	
			this.jInternalFrameDetalleFormVehiculo.jButtonEliminarToolBarVehiculo.setVisible((this.isVisibilidadCeldaEliminarVehiculo && this.isPermisoEliminarVehiculo));
			this.jInternalFrameDetalleFormVehiculo.jButtonCancelarToolBarVehiculo.setVisible(this.isVisibilidadCeldaCancelarVehiculo);				
			this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosToolBarVehiculo.setVisible((this.isVisibilidadCeldaGuardarVehiculo && this.isPermisoGuardarCambiosVehiculo));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVehiculo.setVisible((this.isVisibilidadCeldaGuardarCambiosVehiculo && this.isPermisoGuardarCambiosVehiculo));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVehiculo.setVisible((this.isVisibilidadCeldaNuevoVehiculo && this.isPermisoNuevoVehiculo));			
			this.jMenuItemDuplicarVehiculo.setVisible((this.isVisibilidadCeldaDuplicarVehiculo && this.isPermisoDuplicarVehiculo));			
			this.jMenuItemCopiarVehiculo.setVisible((this.isVisibilidadCeldaCopiarVehiculo && this.isPermisoCopiarVehiculo));			
			this.jMenuItemVerFormVehiculo.setVisible((this.isVisibilidadCeldaVerFormVehiculo && this.isPermisoVerFormVehiculo));			
			this.jMenuItemAbrirOrderByVehiculo.setVisible((this.isVisibilidadCeldaOrdenVehiculo && this.isPermisoOrdenVehiculo));			
			//this.jMenuItemMostrarOcultarVehiculo.setVisible((this.isVisibilidadCeldaOrdenVehiculo && this.isPermisoOrdenVehiculo));
			this.jMenuItemDetalleAbrirOrderByVehiculo.setVisible((this.isVisibilidadCeldaOrdenVehiculo && this.isPermisoOrdenVehiculo));			
			//this.jMenuItemDetalleMostrarOcultarVehiculo.setVisible((this.isVisibilidadCeldaOrdenVehiculo && this.isPermisoOrdenVehiculo));			
			this.jMenuItemNuevoRelacionesVehiculo.setVisible((this.isVisibilidadCeldaNuevoRelacionesVehiculo && this.isPermisoNuevoVehiculo));			
			this.jMenuItemNuevoGuardarCambiosVehiculo.setVisible((this.isVisibilidadCeldaNuevoVehiculo && this.isPermisoNuevoVehiculo && this.isPermisoGuardarCambiosVehiculo));									
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.jInternalFrameDetalleFormVehiculo.jMenuItemModificarVehiculo.setVisible((this.isVisibilidadCeldaModificarVehiculo && this.isPermisoActualizarVehiculo));	
			this.jInternalFrameDetalleFormVehiculo.jMenuItemActualizarVehiculo.setVisible((this.isVisibilidadCeldaActualizarVehiculo && this.isPermisoActualizarVehiculo));	
			this.jInternalFrameDetalleFormVehiculo.jMenuItemEliminarVehiculo.setVisible((this.isVisibilidadCeldaEliminarVehiculo && this.isPermisoEliminarVehiculo));
			this.jInternalFrameDetalleFormVehiculo.jMenuItemCancelarVehiculo.setVisible(this.isVisibilidadCeldaCancelarVehiculo);				
			}
			
			this.jMenuItemGuardarCambiosVehiculo.setVisible((this.isVisibilidadCeldaGuardarVehiculo && this.isPermisoGuardarCambiosVehiculo));						
			this.jMenuItemGuardarCambiosTablaVehiculo.setVisible((this.isVisibilidadCeldaGuardarCambiosVehiculo && this.isPermisoGuardarCambiosVehiculo));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVehiculo=this.jButtonNuevoVehiculo.isVisible();
			this.isVisibilidadCeldaDuplicarVehiculo=this.jButtonDuplicarVehiculo.isVisible();
			this.isVisibilidadCeldaCopiarVehiculo=this.jButtonCopiarVehiculo.isVisible();
			this.isVisibilidadCeldaVerFormVehiculo=this.jButtonVerFormVehiculo.isVisible();
			
			this.isVisibilidadCeldaOrdenVehiculo=this.jButtonAbrirOrderByVehiculo.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=this.jButtonNuevoRelacionesVehiculo.isVisible();
			this.isVisibilidadCeldaModificarVehiculo=this.jButtonModificarVehiculo.isVisible();
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.isVisibilidadCeldaActualizarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonActualizarVehiculo.isVisible();
			this.isVisibilidadCeldaEliminarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonEliminarVehiculo.isVisible();
			this.isVisibilidadCeldaCancelarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonCancelarVehiculo.isVisible();
			this.isVisibilidadCeldaGuardarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVehiculo=this.jButtonGuardarCambiosTablaVehiculo.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVehiculo=this.jButtonNuevoToolBarVehiculo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=this.jButtonNuevoRelacionesToolBarVehiculo.isVisible();
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.isVisibilidadCeldaModificarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonModificarToolBarVehiculo.isVisible();
			this.isVisibilidadCeldaActualizarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonActualizarToolBarVehiculo.isVisible();
			this.isVisibilidadCeldaEliminarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonEliminarToolBarVehiculo.isVisible();
			this.isVisibilidadCeldaCancelarVehiculo=this.jInternalFrameDetalleFormVehiculo.jButtonCancelarToolBarVehiculo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVehiculo=this.jButtonGuardarCambiosToolBarVehiculo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVehiculo=this.jButtonGuardarCambiosTablaToolBarVehiculo.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVehiculo=this.jMenuItemNuevoVehiculo.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=this.jMenuItemNuevoRelacionesVehiculo.isVisible();
			
			if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.isVisibilidadCeldaModificarVehiculo=this.jInternalFrameDetalleFormVehiculo.jMenuItemModificarVehiculo.isVisible();
			this.isVisibilidadCeldaActualizarVehiculo=this.jInternalFrameDetalleFormVehiculo.jMenuItemActualizarVehiculo.isVisible();
			this.isVisibilidadCeldaEliminarVehiculo=this.jInternalFrameDetalleFormVehiculo.jMenuItemEliminarVehiculo.isVisible();
			this.isVisibilidadCeldaCancelarVehiculo=this.jInternalFrameDetalleFormVehiculo.jMenuItemCancelarVehiculo.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVehiculo=this.jMenuItemGuardarCambiosVehiculo.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVehiculo=this.jMenuItemGuardarCambiosTablaVehiculo.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVehiculo(Boolean esInicializar) {
		if(VehiculoJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
				//if(this.vehiculoSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVehiculo();
			}
			
			this.inicializarActualizarBindingBotonesManualVehiculo(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVehiculo() {
		this.jButtonNuevoVehiculo.setVisible(this.isPermisoNuevoVehiculo);			
		this.jButtonDuplicarVehiculo.setVisible(this.isPermisoDuplicarVehiculo);			
		this.jButtonCopiarVehiculo.setVisible(this.isPermisoCopiarVehiculo);			
		this.jButtonVerFormVehiculo.setVisible(this.isPermisoVerFormVehiculo);			
		
		this.jButtonAbrirOrderByVehiculo.setVisible(this.isPermisoOrdenVehiculo);					
		
		this.jButtonNuevoRelacionesVehiculo.setVisible(this.isPermisoNuevoVehiculo);			
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonModificarVehiculo.setVisible(this.isPermisoActualizarVehiculo);	
			this.jInternalFrameDetalleFormVehiculo.jButtonActualizarVehiculo.setVisible(this.isPermisoActualizarVehiculo);	
			this.jInternalFrameDetalleFormVehiculo.jButtonEliminarVehiculo.setVisible(this.isPermisoEliminarVehiculo);
			this.jInternalFrameDetalleFormVehiculo.jButtonCancelarVehiculo.setVisible(this.isVisibilidadCeldaCancelarVehiculo);						
			this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.setVisible(this.isPermisoGuardarCambiosVehiculo);							
		}
		
		this.jButtonGuardarCambiosTablaVehiculo.setVisible(this.isPermisoActualizarVehiculo);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVehiculo() {
		this.jInternalFrameDetalleFormVehiculo.jButtonModificarVehiculo.setVisible(this.isPermisoActualizarVehiculo);	
		this.jInternalFrameDetalleFormVehiculo.jButtonActualizarVehiculo.setVisible(this.isPermisoActualizarVehiculo);	
		this.jInternalFrameDetalleFormVehiculo.jButtonEliminarVehiculo.setVisible(this.isPermisoEliminarVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jButtonCancelarVehiculo.setVisible(this.isVisibilidadCeldaCancelarVehiculo);							
		this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.setVisible((this.isVisibilidadCeldaGuardarVehiculo && this.isPermisoGuardarCambiosVehiculo));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVehiculo() {
		if(VehiculoJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVehiculo();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVehiculo() {
	}
	
	public void jTableDatosVehiculoListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVehiculo(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vehiculo.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVehiculoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVehiculo(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVehiculo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVehiculo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.vehiculoLogic.getConnexion());

				if(this.vehiculo.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.vehiculo.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVehiculo=(TitledBorder)this.jScrollPanelDatosVehiculo.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVehiculo.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.vehiculo.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalVehiculoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebVehiculo(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVehiculo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVehiculo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.vehiculoLogic.getConnexion());

				if(this.vehiculo.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.vehiculo.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVehiculo=(TitledBorder)this.jScrollPanelDatosVehiculo.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderVehiculo.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.vehiculo.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_detalle_activo_fijoVehiculoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisodetalleactivofijo=true;

			idTienePermisodetalleactivofijo=this.tienePermisosUsuarioEnPaginaWebVehiculo(DetalleActivoFijoConstantesFunciones.CLASSNAME);

			if(idTienePermisodetalleactivofijo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVehiculo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVehiculo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);

				this.detalleactivofijoBeanSwingJInternalFrame=new DetalleActivoFijoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.detalleactivofijoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.detalleactivofijoBeanSwingJInternalFrame.getDetalleActivoFijoLogic().setConnexion(this.vehiculoLogic.getConnexion());

				if(this.vehiculo.getid_detalle_activo_fijo()!=null) {
					this.detalleactivofijoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.detalleactivofijoBeanSwingJInternalFrame.setIdActual(this.vehiculo.getid_detalle_activo_fijo());
					this.detalleactivofijoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.detalleactivofijoBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleActivoFijo();
				}

				JInternalFrameBase jinternalFrame =this.detalleactivofijoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVehiculo=(TitledBorder)this.jScrollPanelDatosVehiculo.getBorder();
				TitledBorder titledBorderdetalleactivofijo=(TitledBorder)this.detalleactivofijoBeanSwingJInternalFrame.jScrollPanelDatosDetalleActivoFijo.getBorder();

				titledBorderdetalleactivofijo.setTitle(titledBorderVehiculo.getTitle() + " -> Detalle Activo Fijo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_detalle_activo_fijoVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getid_detalle_activo_fijo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_detalle_activo_fijo = "+this.vehiculo.getid_detalle_activo_fijo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_aseguradoraVehiculoUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoaseguradora=true;

			idTienePermisoaseguradora=this.tienePermisosUsuarioEnPaginaWebVehiculo(AseguradoraConstantesFunciones.CLASSNAME);

			if(idTienePermisoaseguradora) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVehiculo.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVehiculo.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);

				this.aseguradoraBeanSwingJInternalFrame=new AseguradoraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.aseguradoraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.aseguradoraBeanSwingJInternalFrame.getAseguradoraLogic().setConnexion(this.vehiculoLogic.getConnexion());

				if(this.vehiculo.getid_aseguradora()!=null) {
					this.aseguradoraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.aseguradoraBeanSwingJInternalFrame.setIdActual(this.vehiculo.getid_aseguradora());
					this.aseguradoraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.aseguradoraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.aseguradoraBeanSwingJInternalFrame.inicializarActualizarBindingTablaAseguradora();
				}

				JInternalFrameBase jinternalFrame =this.aseguradoraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVehiculo=(TitledBorder)this.jScrollPanelDatosVehiculo.getBorder();
				TitledBorder titledBorderaseguradora=(TitledBorder)this.aseguradoraBeanSwingJInternalFrame.jScrollPanelDatosAseguradora.getBorder();

				titledBorderaseguradora.setTitle(titledBorderVehiculo.getTitle() + " -> Aseguradora");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_aseguradoraVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getid_aseguradora()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_aseguradora = "+this.vehiculo.getid_aseguradora().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_polizaVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getnumero_poliza()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_poliza like '%"+this.vehiculo.getnumero_poliza()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_emisionVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getfecha_emision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_emision = '"+Funciones2.getStringPostgresDate(this.vehiculo.getfecha_emision())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_vencimientoVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getfecha_vencimiento()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_vencimiento = '"+Funciones2.getStringPostgresDate(this.vehiculo.getfecha_vencimiento())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_aseguradoVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getvalor_asegurado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_asegurado = "+this.vehiculo.getvalor_asegurado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_deducibleVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getvalor_deducible()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_deducible = "+this.vehiculo.getvalor_deducible().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_matriculaVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getnumero_matricula()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_matricula like '%"+this.vehiculo.getnumero_matricula()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_motorVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getnumero_motor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_motor like '%"+this.vehiculo.getnumero_motor()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_chasisVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getnumero_chasis()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_chasis like '%"+this.vehiculo.getnumero_chasis()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_placaVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getnumero_placa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_placa like '%"+this.vehiculo.getnumero_placa()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_comercialVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getvalor_comercial()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_comercial = "+this.vehiculo.getvalor_comercial().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionVehiculoBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.getvehiculo(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vehiculo==null) {
						this.vehiculo = new Vehiculo();
					}

					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);
				}

				if(this.vehiculo.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.vehiculo.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVehiculo(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAseguradoraVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVehiculo(false,false);

			this.getVehiculosFK_IdAseguradora();

			this.inicializarActualizarBindingVehiculo(false);

			//if(VehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdDetalleActivoFijoVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVehiculo(false,false);

			this.getVehiculosFK_IdDetalleActivoFijo();

			this.inicializarActualizarBindingVehiculo(false);

			//if(VehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVehiculo(false,false);

			this.getVehiculosFK_IdEmpresa();

			this.inicializarActualizarBindingVehiculo(false);

			//if(VehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalVehiculoActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVehiculo(false,false);

			this.getVehiculosFK_IdSucursal();

			this.inicializarActualizarBindingVehiculo(false);

			//if(VehiculoBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVehiculo(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vehiculoLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVehiculo() {
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
		

		if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
			this.jInternalFrameDetalleFormVehiculo.setVisible(false);	    			
			this.jInternalFrameDetalleFormVehiculo.dispose();
			this.jInternalFrameDetalleFormVehiculo=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
			this.jInternalFrameReporteDinamicoVehiculo.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVehiculo.dispose();
			this.jInternalFrameReporteDinamicoVehiculo=null;
		}
		
		if(this.jInternalFrameImportacionVehiculo!=null) {
			this.jInternalFrameImportacionVehiculo.setVisible(false);	    			
			this.jInternalFrameImportacionVehiculo.dispose();
			this.jInternalFrameImportacionVehiculo=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVehiculo();
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			
			if(sTipo.equals("NuevoVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVehiculo")) {
				jButtonDuplicarVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVehiculo")) {
				jButtonCopiarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("VerFormVehiculo")) {
				jButtonVerFormVehiculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVehiculo")) {
				jButtonDuplicarVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVehiculo")) {
				jButtonDuplicarVehiculoActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVehiculo")) {
				jButtonModificarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVehiculo")) {
				jButtonModificarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVehiculo")) {
				jButtonModificarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVehiculo")) {
				jButtonActualizarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVehiculo")) {
				jButtonActualizarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVehiculo")) {
				jButtonActualizarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("EliminarVehiculo")) {
				jButtonEliminarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVehiculo")) {
				jButtonEliminarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVehiculo")) {
				jButtonEliminarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CancelarVehiculo")) {
				jButtonCancelarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVehiculo")) {
				jButtonCancelarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVehiculo")) {
				jButtonCancelarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CerrarVehiculo")) {
				jButtonCerrarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVehiculo")) {
				jButtonCerrarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVehiculo")) {
				jButtonCerrarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVehiculo")) {
				jButtonMostrarOcultarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVehiculo")) {
				jButtonCancelarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVehiculo")) {
				jButtonCopiarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVehiculo")) {
				jButtonVerFormVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVehiculo")) {
				jButtonCopiarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVehiculo")) {
				jButtonVerFormVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVehiculo")) {
				jButtonRecargarInformacionVehiculoActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVehiculo")) {
				jButtonRecargarInformacionVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVehiculo")) {
				jButtonRecargarInformacionVehiculoActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVehiculo")) {
				jButtonAnterioresVehiculoActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVehiculo")) {
				jButtonAnterioresVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVehiculo")) {
				jButtonAnterioresVehiculoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVehiculo")) {
				jButtonSiguientesVehiculoActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVehiculo")) {
				jButtonSiguientesVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVehiculo")) {
				jButtonSiguientesVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVehiculo") || sTipo.equals("MenuItemDetalleAbrirOrderByVehiculo")) {
				jButtonAbrirOrderByVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVehiculo") || sTipo.equals("MenuItemDetalleMostrarOcultarVehiculo")) {
				jButtonMostrarOcultarVehiculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVehiculo")) {
				jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVehiculo")) {
				jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVehiculo")) {
				jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVehiculo")) {
				jButtonCerrarReporteDinamicoVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVehiculo")) {
				jButtonGenerarReporteDinamicoVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVehiculo")) {
				
				jButtonGenerarExcelReporteDinamicoVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVehiculo")) {
				jButtonCerrarImportacionVehiculoActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVehiculo")) {
				
				jButtonGenerarImportacionVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVehiculo")) {
				
				jButtonAbrirImportacionVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVehiculo")) {
				jComboBoxTiposAccionesVehiculoActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVehiculo")) {
				jComboBoxTiposRelacionesVehiculoActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVehiculo")) {
				jComboBoxTiposAccionesVehiculoActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVehiculo")) {
				
				jComboBoxTiposSeleccionarVehiculoActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVehiculo")) {
				jTextFieldValorCampoGeneralVehiculoActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVehiculo")) {
				jButtonAbrirOrderByVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVehiculo")) {
				jButtonAbrirOrderByVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVehiculo")) {
				jButtonCerrarOrderByVehiculoActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVehiculoBusqueda")) {
				this.jButtonidVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVehiculoUpdate")) {
				this.jButtonid_empresaVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVehiculoBusqueda")) {
				this.jButtonid_empresaVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVehiculoUpdate")) {
				this.jButtonid_sucursalVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVehiculoBusqueda")) {
				this.jButtonid_sucursalVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoVehiculoUpdate")) {
				this.jButtonid_detalle_activo_fijoVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoVehiculoBusqueda")) {
				this.jButtonid_detalle_activo_fijoVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_aseguradoraVehiculoUpdate")) {
				this.jButtonid_aseguradoraVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_aseguradoraVehiculoBusqueda")) {
				this.jButtonid_aseguradoraVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_polizaVehiculoBusqueda")) {
				this.jButtonnumero_polizaVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVehiculoBusqueda")) {
				this.jButtonfecha_emisionVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoVehiculoBusqueda")) {
				this.jButtonfecha_vencimientoVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_aseguradoVehiculoBusqueda")) {
				this.jButtonvalor_aseguradoVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_deducibleVehiculoBusqueda")) {
				this.jButtonvalor_deducibleVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_matriculaVehiculoBusqueda")) {
				this.jButtonnumero_matriculaVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_motorVehiculoBusqueda")) {
				this.jButtonnumero_motorVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chasisVehiculoBusqueda")) {
				this.jButtonnumero_chasisVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_placaVehiculoBusqueda")) {
				this.jButtonnumero_placaVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_comercialVehiculoBusqueda")) {
				this.jButtonvalor_comercialVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionVehiculoBusqueda")) {
				this.jButtondescripcionVehiculoBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAseguradoraVehiculo")) {
				this.jButtonFK_IdAseguradoraVehiculoActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdDetalleActivoFijoVehiculo")) {
				this.jButtonFK_IdDetalleActivoFijoVehiculoActionPerformed(evt);
			}
			
			;
			
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVehiculo();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Vehiculo vehiculoLocal=null;
			
			if(!this.getEsControlTabla()) {
				vehiculoLocal=this.vehiculo;
			} else {
				vehiculoLocal=this.vehiculoAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
							
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
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
			
			


			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
								
						
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
								
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
							
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
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
			
			


			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
								
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVehiculo")) {
					jCheckBoxSeleccionarTodosVehiculoItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVehiculo")) {
					jCheckBoxSeleccionadosVehiculoItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVehiculo")) {
					
				}
				
				


				
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
												
				
				


				
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
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
			
			


			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVehiculoActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vehiculo);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vehiculo);
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
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
				
				


				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Vehiculo.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Vehiculo.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVehiculoActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vehiculoAnterior =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVehiculo")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVehiculoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVehiculo.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vehiculo =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vehiculo =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vehiculo);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVehiculo")) {
				
				}
				
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVehiculo")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVehiculo.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVehiculo")) {
			
			}
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVehiculo();
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			if(sTipo.equals("NuevoVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVehiculo")) {
				jButtonDuplicarVehiculoActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVehiculo")) {
				jButtonCopiarVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVehiculo")) {
				jButtonVerFormVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVehiculo")) {
				jButtonNuevoVehiculoActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVehiculo")) {
				jButtonModificarVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVehiculo")) {
				jButtonActualizarVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVehiculo")) {
				jButtonEliminarVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVehiculo")) {
				jButtonCancelarVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVehiculo")) {
				jButtonCerrarVehiculoActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVehiculo")) {
				jButtonGuardarCambiosVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVehiculo")) {
				jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVehiculo")) {
				jButtonAbrirOrderByVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVehiculo")) {
				jButtonRecargarInformacionVehiculoActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVehiculo")) {
				jButtonAnterioresVehiculoActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVehiculo")) {
				jButtonSiguientesVehiculoActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVehiculoBusqueda")) {
				this.jButtonidVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVehiculoUpdate")) {
				this.jButtonid_empresaVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVehiculoBusqueda")) {
				this.jButtonid_empresaVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalVehiculoUpdate")) {
				this.jButtonid_sucursalVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalVehiculoBusqueda")) {
				this.jButtonid_sucursalVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoVehiculoUpdate")) {
				this.jButtonid_detalle_activo_fijoVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_detalle_activo_fijoVehiculoBusqueda")) {
				this.jButtonid_detalle_activo_fijoVehiculoBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_aseguradoraVehiculoUpdate")) {
				this.jButtonid_aseguradoraVehiculoUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_aseguradoraVehiculoBusqueda")) {
				this.jButtonid_aseguradoraVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_polizaVehiculoBusqueda")) {
				this.jButtonnumero_polizaVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_emisionVehiculoBusqueda")) {
				this.jButtonfecha_emisionVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_vencimientoVehiculoBusqueda")) {
				this.jButtonfecha_vencimientoVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_aseguradoVehiculoBusqueda")) {
				this.jButtonvalor_aseguradoVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_deducibleVehiculoBusqueda")) {
				this.jButtonvalor_deducibleVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_matriculaVehiculoBusqueda")) {
				this.jButtonnumero_matriculaVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_motorVehiculoBusqueda")) {
				this.jButtonnumero_motorVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_chasisVehiculoBusqueda")) {
				this.jButtonnumero_chasisVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_placaVehiculoBusqueda")) {
				this.jButtonnumero_placaVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_comercialVehiculoBusqueda")) {
				this.jButtonvalor_comercialVehiculoBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionVehiculoBusqueda")) {
				this.jButtondescripcionVehiculoBusquedaActionPerformed(evt);
			}
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVehiculo();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVehiculo")) {
				closingInternalFrameVehiculo();
				
			} else if(sTipo.equals("jButtonCancelarVehiculo")) {
				JInternalFrameBase jInternalFrameDetalleFormVehiculo = (JInternalFrameBase)evt.getSource();
	            	
	            VehiculoBeanSwingJInternalFrame jInternalFrameParent=(VehiculoBeanSwingJInternalFrame)jInternalFrameDetalleFormVehiculo.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVehiculoActionPerformed(null);
			}
			
			VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vehiculo,new Object(),this.vehiculoParameterGeneral,this.vehiculoReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVehiculo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVehiculo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVehiculo(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vehiculo)) {
			if(!esControlTabla) {
				if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);			
				}
				
				if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVehiculo(this.vehiculo,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vehiculoReturnGeneral=vehiculoLogic.procesarEventosVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculoLogic.getVehiculos(),this.vehiculo,this.vehiculoParameterGeneral,this.isEsNuevoVehiculo,classes);//this.vehiculoLogic.getVehiculo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVehiculo(this.vehiculoReturnGeneral,this.vehiculoBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVehiculo(classes,this.vehiculoReturnGeneral,this.vehiculoBean,false);
					}
						
					if(this.vehiculoReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVehiculo(this.vehiculoReturnGeneral.getVehiculo());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVehiculo(this.vehiculoReturnGeneral.getVehiculo());	
					}
						
					if(this.vehiculoReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVehiculo(this.vehiculoReturnGeneral.getVehiculo(),classes);//this.vehiculoBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVehiculo(this.vehiculo,classes);//this.vehiculoBean);									
				}
			
				if(VehiculoJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVehiculo(this.vehiculo,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVehiculo(this.vehiculo);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vehiculoAnterior!=null) {
						this.vehiculo=this.vehiculoAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vehiculoReturnGeneral=vehiculoLogic.procesarEventosVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculoLogic.getVehiculos(),this.vehiculo,this.vehiculoParameterGeneral,this.isEsNuevoVehiculo,classes);//this.vehiculoLogic.getVehiculo()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vehiculoSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vehiculoSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vehiculoReturnGeneral.getVehiculo(),vehiculoLogic.getVehiculos());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vehiculoReturnGeneral.getVehiculo(),this.vehiculos);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVehiculo.repaint();
				
				//((AbstractTableModel) this.jTableDatosVehiculo.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVehiculo();
			}
		}
	}
	
	public void actualizarVisualTableDatosVehiculo() throws Exception {
		
		VehiculoModel vehiculoModel=(VehiculoModel)this.jTableDatosVehiculo.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vehiculoModel.vehiculos=this.vehiculoLogic.getVehiculos();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vehiculoModel.vehiculos=this.vehiculos;
		}
		
		
		((VehiculoModel) this.jTableDatosVehiculo.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVehiculo() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvehiculoAnterior(),this.vehiculoLogic.getVehiculos());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvehiculoAnterior(),this.vehiculos);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVehiculo();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVehiculo(Vehiculo vehiculo,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ServicioTransporte.class)) {
					this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(vehiculo.getServicioTransportes());
					this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
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
										
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculo,new Object(),generalEntityParameterGeneral,this.vehiculoReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vehiculoSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VehiculoConstantesFunciones.getClassesRelationshipsOfVehiculo(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VehiculoConstantesFunciones.getClassesRelationshipsFromStringsOfVehiculo(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVehiculo(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VehiculoBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vehiculo,new Object(),generalEntityParameterGeneral,this.vehiculoReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVehiculo(VehiculoBean vehiculoBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(ServicioTransporte.class)) {
					this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.setServicioTransportes(vehiculo.getServicioTransportes());
					this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.inicializarActualizarBindingTablaServicioTransporte(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVehiculo(ArrayList<Classe> classes,VehiculoReturnGeneral vehiculoReturnGeneral,VehiculoBean vehiculoBean,Boolean conDefault) throws Exception {
		
			this.vehiculoBean.setServicioTransportes(vehiculoReturnGeneral.getVehiculo().getServicioTransportes());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVehiculo(Vehiculo vehiculo,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(ServicioTransporte.class)) {
					vehiculo.setServicioTransportes(this.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.serviciotransporteLogic.getServicioTransportes());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vehiculo)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVehiculo = new VehiculoDetalleFormJInternalFrame(jDesktopPane,this.vehiculoSessionBean.getConGuardarRelaciones(),this.vehiculoSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVehiculo);
		this.jInternalFrameDetalleFormVehiculo.setVisible(false);
		this.jInternalFrameDetalleFormVehiculo.setSelected(false);						
		
		this.jInternalFrameDetalleFormVehiculo.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVehiculo.vehiculoLogic=this.vehiculoLogic;
		
		this.cargarCombosFrameForeignKeyVehiculo("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVehiculo();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVehiculo();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVehiculo("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVehiculo();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVehiculo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVehiculo"));
		
		this.jInternalFrameDetalleFormVehiculo.jButtonModificarVehiculo.addActionListener(new ButtonActionListener(this,"ModificarVehiculo"));

		
		this.jInternalFrameDetalleFormVehiculo.jButtonModificarToolBarVehiculo.addActionListener(new ButtonActionListener(this,"ModificarToolBarVehiculo"));
					
		this.jInternalFrameDetalleFormVehiculo.jMenuItemModificarVehiculo.addActionListener(new ButtonActionListener(this,"MenuItemModificarVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonActualizarVehiculo.addActionListener (new ButtonActionListener(this,"ActualizarVehiculo"));
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonActualizarToolBarVehiculo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVehiculo"));
						
		this.jInternalFrameDetalleFormVehiculo.jMenuItemActualizarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonEliminarVehiculo.addActionListener (new ButtonActionListener(this,"EliminarVehiculo"));
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonEliminarToolBarVehiculo.addActionListener (new ButtonActionListener(this,"EliminarToolBarVehiculo"));
								
		this.jInternalFrameDetalleFormVehiculo.jMenuItemEliminarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonCancelarVehiculo.addActionListener (new ButtonActionListener(this,"CancelarVehiculo"));
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonCancelarToolBarVehiculo.addActionListener (new ButtonActionListener(this,"CancelarToolBarVehiculo"));
					
		this.jInternalFrameDetalleFormVehiculo.jMenuItemCancelarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVehiculo"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jMenuItemDetalleCerrarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVehiculo"));		
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosToolBarVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVehiculo"));
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosToolBarVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVehiculo"));
		
		
		
		this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVehiculo"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonidVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"idVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_empresaVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_empresaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_sucursalVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_sucursalVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_detalle_activo_fijoVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_detalle_activo_fijoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_aseguradoraVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_aseguradoraVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_aseguradoraVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_aseguradoraVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_polizaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_polizaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonfecha_emisionVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonfecha_vencimientoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_aseguradoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_aseguradoVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_deducibleVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_deducibleVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_matriculaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_matriculaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_motorVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_motorVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_chasisVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chasisVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_placaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_comercialVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_comercialVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtondescripcionVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVehiculoBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVehiculo"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVehiculo"));
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVehiculo"));
		}
		
		this.jTableDatosVehiculo.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVehiculo"));
		
		this.jTableDatosVehiculo.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVehiculo"));
		
		this.jButtonNuevoVehiculo.addActionListener(new ButtonActionListener(this,"NuevoVehiculo"));
		
		this.jButtonDuplicarVehiculo.addActionListener(new ButtonActionListener(this,"DuplicarVehiculo"));
		
		this.jButtonCopiarVehiculo.addActionListener(new ButtonActionListener(this,"CopiarVehiculo"));
		
		this.jButtonVerFormVehiculo.addActionListener(new ButtonActionListener(this,"VerFormVehiculo"));
		
		
		this.jButtonNuevoToolBarVehiculo.addActionListener(new ButtonActionListener(this,"NuevoToolBarVehiculo"));
			
		this.jButtonDuplicarToolBarVehiculo.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVehiculo"));
			
		this.jMenuItemNuevoVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVehiculo"));
			
		this.jMenuItemDuplicarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVehiculo"));		
		
		
		this.jButtonNuevoRelacionesVehiculo.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVehiculo"));
		
		
		this.jButtonNuevoRelacionesToolBarVehiculo.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVehiculo"));
			
		this.jMenuItemNuevoRelacionesVehiculo.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVehiculo"));		
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonModificarVehiculo.addActionListener(new ButtonActionListener(this,"ModificarVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonModificarToolBarVehiculo.addActionListener(new ButtonActionListener(this,"ModificarToolBarVehiculo"));
			
			this.jInternalFrameDetalleFormVehiculo.jMenuItemModificarVehiculo.addActionListener(new ButtonActionListener(this,"MenuItemModificarVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVehiculo.jButtonActualizarVehiculo.addActionListener (new ButtonActionListener(this,"ActualizarVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonActualizarToolBarVehiculo.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVehiculo"));
				
			this.jInternalFrameDetalleFormVehiculo.jMenuItemActualizarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonEliminarVehiculo.addActionListener (new ButtonActionListener(this,"EliminarVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonEliminarToolBarVehiculo.addActionListener (new ButtonActionListener(this,"EliminarToolBarVehiculo"));
						
			this.jInternalFrameDetalleFormVehiculo.jMenuItemEliminarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonCancelarVehiculo.addActionListener (new ButtonActionListener(this,"CancelarVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonCancelarToolBarVehiculo.addActionListener (new ButtonActionListener(this,"CancelarToolBarVehiculo"));
			
			this.jInternalFrameDetalleFormVehiculo.jMenuItemCancelarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVehiculo"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVehiculo.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVehiculo"));		
		
		
		this.jButtonCerrarVehiculo.addActionListener (new ButtonActionListener(this,"CerrarVehiculo"));
		
		
		this.jButtonCerrarToolBarVehiculo.addActionListener (new ButtonActionListener(this,"CerrarToolBarVehiculo"));
			
		this.jMenuItemCerrarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVehiculo"));
			
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jMenuItemDetalleCerrarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVehiculo"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosVehiculo"));
		}
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosToolBarVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVehiculo"));
		}
		
		this.jButtonCopiarToolBarVehiculo.addActionListener (new ButtonActionListener(this,"CopiarToolBarVehiculo"));
			
		this.jButtonVerFormToolBarVehiculo.addActionListener (new ButtonActionListener(this,"VerFormToolBarVehiculo"));
		
		this.jMenuItemGuardarCambiosVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVehiculo"));
			
		this.jMenuItemCopiarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVehiculo"));		
		
		this.jMenuItemVerFormVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVehiculo"));		
		
		
		this.jButtonGuardarCambiosTablaVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVehiculo"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVehiculo"));
			
		this.jMenuItemGuardarCambiosTablaVehiculo.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVehiculo"));		
		
		
		
		this.jButtonRecargarInformacionVehiculo.addActionListener (new ButtonActionListener(this,"RecargarInformacionVehiculo"));
					
		this.jButtonRecargarInformacionToolBarVehiculo.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVehiculo"));
		
		this.jMenuItemRecargarInformacionVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVehiculo"));		
		
		
		
		this.jButtonAnterioresVehiculo.addActionListener (new ButtonActionListener(this,"AnterioresVehiculo"));
		
		
		this.jButtonAnterioresToolBarVehiculo.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVehiculo"));
		
		this.jMenuItemAnterioresVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVehiculo"));		
		
		
		this.jButtonSiguientesVehiculo.addActionListener (new ButtonActionListener(this,"SiguientesVehiculo"));
		
		
		this.jButtonSiguientesToolBarVehiculo.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVehiculo"));
			
		this.jMenuItemSiguientesVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVehiculo"));
			
		this.jMenuItemAbrirOrderByVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVehiculo"));
			
		this.jMenuItemMostrarOcultarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVehiculo"));
			
		this.jMenuItemDetalleAbrirOrderByVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVehiculo"));
			
		this.jMenuItemDetalleMostarOcultarVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVehiculo"));		
		
		
		this.jButtonNuevoGuardarCambiosVehiculo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVehiculo"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVehiculo.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVehiculo"));
			
		this.jMenuItemNuevoGuardarCambiosVehiculo.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVehiculo"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVehiculo.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVehiculo"));

		this.jCheckBoxSeleccionadosVehiculo.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVehiculo"));
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVehiculo"));
		}
		
		
		this.jComboBoxTiposRelacionesVehiculo.addActionListener (new ButtonActionListener(this,"TiposRelacionesVehiculo"));
			
		this.jComboBoxTiposAccionesVehiculo.addActionListener (new ButtonActionListener(this,"TiposAccionesVehiculo"));
					
		this.jComboBoxTiposSeleccionarVehiculo.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVehiculo"));
			
		this.jTextFieldValorCampoGeneralVehiculo.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVehiculo"));		
		
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonidVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"idVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_empresaVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_empresaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_sucursalVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_sucursalVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_detalle_activo_fijoVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_detalle_activo_fijoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_aseguradoraVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_aseguradoraVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_aseguradoraVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_aseguradoraVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_polizaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_polizaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonfecha_emisionVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonfecha_vencimientoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_aseguradoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_aseguradoVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_deducibleVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_deducibleVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_matriculaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_matriculaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_motorVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_motorVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_chasisVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chasisVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_placaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_comercialVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_comercialVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtondescripcionVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVehiculoBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAseguradoraVehiculo.addActionListener(new ButtonActionListener(this,"FK_IdAseguradoraVehiculo"));

			this.jButtonFK_IdDetalleActivoFijoVehiculo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoVehiculo"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVehiculo!=null) {
				this.jInternalFrameReporteDinamicoVehiculo.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVehiculo"));
				this.jInternalFrameReporteDinamicoVehiculo.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVehiculo"));
				this.jInternalFrameReporteDinamicoVehiculo.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVehiculo"));
			}
			
			//this.jButtonCerrarReporteDinamicoVehiculo.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVehiculo"));				
			//this.jButtonGenerarReporteDinamicoVehiculo.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVehiculo"));
			//this.jButtonGenerarExcelReporteDinamicoVehiculo.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVehiculo"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVehiculo!=null) {
				this.jInternalFrameImportacionVehiculo.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVehiculo"));
				this.jInternalFrameImportacionVehiculo.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVehiculo"));
				this.jInternalFrameImportacionVehiculo.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVehiculo"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVehiculo.addActionListener (new ButtonActionListener(this,"AbrirOrderByVehiculo"));
			
			this.jButtonAbrirOrderByToolBarVehiculo.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVehiculo"));			
			
			if(this.jInternalFrameOrderByVehiculo!=null) {
				this.jInternalFrameOrderByVehiculo.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVehiculo"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVehiculo!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVehiculo.jTabbedPaneRelacionesVehiculo.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVehiculo"));
		
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
            		closingInternalFrameVehiculo();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVehiculo.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVehiculo = (JInternalFrameBase)event.getSource();
	            	
	            VehiculoBeanSwingJInternalFrame jInternalFrameParent=(VehiculoBeanSwingJInternalFrame)jInternalFrameDetalleFormVehiculo.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVehiculoActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVehiculo.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVehiculoListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVehiculo.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVehiculo.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVehiculo";
		inputMap = this.jButtonNuevoVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVehiculoActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVehiculoActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVehiculo";
		inputMap = this.jButtonNuevoRelacionesVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVehiculoActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVehiculo";
		inputMap = this.jButtonModificarVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVehiculo";
		inputMap = this.jButtonActualizarVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVehiculo";
		inputMap = this.jButtonEliminarVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVehiculo";
		inputMap = this.jButtonCancelarVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVehiculo";
		inputMap = this.jButtonCerrarVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVehiculo";
		inputMap = this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVehiculo.jButtonGuardarCambiosVehiculo.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVehiculoActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVehiculo.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVehiculoItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVehiculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVehiculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVehiculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVehiculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVehiculo.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVehiculoActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonidVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"idVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_empresaVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_empresaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_sucursalVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_sucursalVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_detalle_activo_fijoVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_detalle_activo_fijoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_detalle_activo_fijoVehiculoBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVehiculo.jButtonid_aseguradoraVehiculoUpdate.addActionListener(new ButtonActionListener(this,"id_aseguradoraVehiculoUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonid_aseguradoraVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"id_aseguradoraVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_polizaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_polizaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonfecha_emisionVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_emisionVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonfecha_vencimientoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"fecha_vencimientoVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_aseguradoVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_aseguradoVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_deducibleVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_deducibleVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_matriculaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_matriculaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_motorVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_motorVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_chasisVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_chasisVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonnumero_placaVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"numero_placaVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtonvalor_comercialVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"valor_comercialVehiculoBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVehiculo.jButtondescripcionVehiculoBusqueda.addActionListener(new ButtonActionListener(this,"descripcionVehiculoBusqueda"));
		
		
		this.jButtonFK_IdAseguradoraVehiculo.addActionListener(new ButtonActionListener(this,"FK_IdAseguradoraVehiculo"));

		this.jButtonFK_IdDetalleActivoFijoVehiculo.addActionListener(new ButtonActionListener(this,"FK_IdDetalleActivoFijoVehiculo"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVehiculo.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVehiculoActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVehiculoActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVehiculo.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVehiculo(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
					vehiculoAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vehiculo vehiculoAux:vehiculos) {
					vehiculoAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVehiculoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVehiculo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
						vehiculoAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Vehiculo vehiculoAux:vehiculos) {
						vehiculoAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Vehiculo vehiculoAux:vehiculos) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVehiculo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVehiculo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVehiculo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVehiculoItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVehiculo(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVehiculo.getSelectedRows();
			
			Vehiculo vehiculoLocal=new Vehiculo();
			
			//this.seleccionarTodosVehiculo(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vehiculoLocal =(Vehiculo) this.vehiculoLogic.getVehiculos().toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vehiculoLocal =(Vehiculo) this.vehiculos.toArray()[this.jTableDatosVehiculo.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vehiculoLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
						vehiculoAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Vehiculo vehiculoAux:vehiculos) {
						vehiculoAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVehiculo(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVehiculo.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVehiculo.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVehiculo,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVehiculoItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVehiculoParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVehiculoActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVehiculo(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVehiculo.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Vehiculo vehiculoAux:this.vehiculoLogic.getVehiculos()) {
				
						if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA)) {
							existe=true;
							vehiculoAux.setnumero_poliza(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							vehiculoAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							vehiculoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_VALORASEGURADO)) {
							existe=true;
							vehiculoAux.setvalor_asegurado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE)) {
							existe=true;
							vehiculoAux.setvalor_deducible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA)) {
							existe=true;
							vehiculoAux.setnumero_matricula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR)) {
							existe=true;
							vehiculoAux.setnumero_motor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS)) {
							existe=true;
							vehiculoAux.setnumero_chasis(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROPLACA)) {
							existe=true;
							vehiculoAux.setnumero_placa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL)) {
							existe=true;
							vehiculoAux.setvalor_comercial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							vehiculoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vehiculo vehiculoAux:vehiculos) {
					
						if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA)) {
							existe=true;
							vehiculoAux.setnumero_poliza(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_FECHAEMISION)) {
							existe=true;
							vehiculoAux.setfecha_emision(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
							existe=true;
							vehiculoAux.setfecha_vencimiento(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_VALORASEGURADO)) {
							existe=true;
							vehiculoAux.setvalor_asegurado(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE)) {
							existe=true;
							vehiculoAux.setvalor_deducible(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA)) {
							existe=true;
							vehiculoAux.setnumero_matricula(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR)) {
							existe=true;
							vehiculoAux.setnumero_motor(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS)) {
							existe=true;
							vehiculoAux.setnumero_chasis(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROPLACA)) {
							existe=true;
							vehiculoAux.setnumero_placa(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL)) {
							existe=true;
							vehiculoAux.setvalor_comercial(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							vehiculoAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVehiculo(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVehiculoActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVehiculo(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVehiculo=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVehiculo.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVehiculo) {				
					conSplash=true;//false;										
					
					//this.startProcessVehiculo(conSplash);
				
					this.generarReporteVehiculosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVehiculosSeleccionados();
				//this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVehiculosSeleccionados(false);
				//this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVehiculosSeleccionados(true);
				//this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVehiculo();
				
				this.exportarVehiculosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVehiculos();
				//this.importarVehiculos();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVehiculo();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVehiculosSeleccionados();
				//this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVehiculo();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVehiculo)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVehiculo(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
				}	
			} 			
			else if(VehiculoBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVehiculo) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVehiculo(conSplash);
					
						//this.actualizarParametrosGeneralVehiculo();
						
						this.generarReporteProcesoAccionVehiculosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VehiculoBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO VehiculoS SELECCIONADOS?", "MANTENIMIENTO DE Vehiculo", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVehiculo();
				
						this.actualizarParametrosGeneralVehiculo();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vehiculoReturnGeneral=vehiculoLogic.procesarAccionVehiculosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vehiculoLogic.getVehiculos(),this.vehiculoParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVehiculoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVehiculo();
					
					VehiculoBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVehiculoReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVehiculo.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVehiculo.jComboBoxTiposAccionesFormularioVehiculo.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVehiculo(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVehiculoActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVehiculo();
			
			if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
			Vehiculo vehiculo=new Vehiculo();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVehiculo(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVehiculo.getSelectedItem();
			
			
			
			
			vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
			//this.sTipoAccion;
			
			if(vehiculosSeleccionados.size()==1) {
				for(Vehiculo vehiculoAux:vehiculosSeleccionados) {
					vehiculo=vehiculoAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Servicio Transporte")) {
					jButtonServicioTransporteActionPerformed(null,rowIndex,true,false,vehiculo);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVehiculo();
			
      		//this.finishProcessVehiculo(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVehiculoReturnGeneral() throws Exception {
		if(this.vehiculoReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vehiculoReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vehiculoReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vehiculoReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vehiculoReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vehiculoReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVehiculo(false);
		}
		
		if(this.vehiculoReturnGeneral.getConRetornoLista() || this.vehiculoReturnGeneral.getConRetornoObjeto()) {
			if(this.vehiculoReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vehiculoLogic.setVehiculos(this.vehiculoReturnGeneral.getVehiculos());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vehiculoReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vehiculoLogic.setVehiculo(this.vehiculoReturnGeneral.getVehiculo());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVehiculo(false);
		}
	}
	
	public void actualizarParametrosGeneralVehiculo() throws Exception {
		
		
	}
	
	public ArrayList<Vehiculo> getVehiculosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVehiculo) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Vehiculo vehiculoAux:vehiculoLogic.getVehiculos()) {
					if(vehiculoAux.getIsSelected()) {
						vehiculosSeleccionados.add(vehiculoAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Vehiculo vehiculoAux:this.vehiculos) {
					if(vehiculoAux.getIsSelected()) {
						vehiculosSeleccionados.add(vehiculoAux);				
					}
				}
			}
			
			if(vehiculosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vehiculosSeleccionados.addAll(this.vehiculoLogic.getVehiculos());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vehiculosSeleccionados.addAll(this.vehiculos);				
					}
				}
			}
		} else {
			vehiculosSeleccionados.add(this.vehiculo);
		}
		
		return vehiculosSeleccionados;
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
	
	public void generarReporteVehiculosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVehiculosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVehiculosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVehiculosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVehiculosSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesVehiculosSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vehiculo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVehiculosSeleccionados() throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVehiculos("Todos",vehiculosSeleccionados);
		
	}	
	
	public void generarReporteNormalVehiculosSeleccionados() throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVehiculos("Todos",vehiculosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVehiculosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVehiculos("Todos",vehiculosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVehiculosSeleccionados() throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVehiculo();
		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVehiculo();
		
		
		//this.generarReporteVehiculos("Todos",vehiculosSeleccionados ,vehiculoImplementable,vehiculoImplementableHome);
	}
	
	public void mostrarImportacionVehiculos() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVehiculo();
		
		this.abrirFrameImportacionVehiculo();		
		
			
		//this.generarReporteVehiculos("Todos",vehiculosSeleccionados ,vehiculoImplementable,vehiculoImplementableHome);
	}
	
	public void importarVehiculos() throws Exception {		
	
	}
	
	public void exportarVehiculosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVehiculosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVehiculosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVehiculosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vehiculo",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVehiculosSeleccionados() throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVehiculo(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Vehiculo vehiculoAux:vehiculosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVehiculo(vehiculoAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vehiculoAux.setsDetalleGeneralEntityReporte(vehiculoAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVehiculo(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_IDASEGURADORA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_FECHAEMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_VALORASEGURADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_NUMEROMOTOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_NUMEROCHASIS;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_NUMEROPLACA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VehiculoConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVehiculo(Vehiculo vehiculo,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vehiculo.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getdetalleactivofijo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getaseguradora_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getnumero_poliza();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getfecha_emision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getfecha_vencimiento().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getvalor_asegurado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getvalor_deducible().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getnumero_matricula();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getnumero_motor();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getnumero_chasis();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getnumero_placa();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getvalor_comercial().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vehiculo.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVehiculosSeleccionados() throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Vehiculos");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVehiculo(row);				
				iRow++;
			}				
			
			for(Vehiculo vehiculoAux:vehiculosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVehiculo(vehiculoAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVehiculosSeleccionados() throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();		
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vehiculo.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vehiculos");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vehiculo");
			//elementRoot.appendChild(element);
		
			for(Vehiculo vehiculoAux:vehiculosSeleccionados) {
				element = document.createElement("vehiculo");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVehiculo(vehiculoAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vehiculo",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVehiculo(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_IDASEGURADORA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_FECHAEMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORASEGURADO);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORDEDUCIBLE);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_NUMEROPLACA);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_VALORCOMERCIAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VehiculoConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVehiculo(Vehiculo vehiculo,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getdetalleactivofijo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getaseguradora_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getnumero_poliza());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getfecha_emision());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getfecha_vencimiento());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getvalor_asegurado());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getvalor_deducible());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getnumero_matricula());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getnumero_motor());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getnumero_chasis());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getnumero_placa());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getvalor_comercial());
		cell = row.createCell(iColumn++);cell.setCellValue(vehiculo.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlVehiculo(Vehiculo vehiculo,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VehiculoConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vehiculo.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VehiculoConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vehiculo.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VehiculoConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(vehiculo.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(VehiculoConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(vehiculo.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementdetalleactivofijo_descripcion = document.createElement(VehiculoConstantesFunciones.IDDETALLEACTIVOFIJO);
		elementdetalleactivofijo_descripcion.appendChild(document.createTextNode(vehiculo.getdetalleactivofijo_descripcion()));
		element.appendChild(elementdetalleactivofijo_descripcion);

		Element elementaseguradora_descripcion = document.createElement(VehiculoConstantesFunciones.IDASEGURADORA);
		elementaseguradora_descripcion.appendChild(document.createTextNode(vehiculo.getaseguradora_descripcion()));
		element.appendChild(elementaseguradora_descripcion);

		Element elementnumero_poliza = document.createElement(VehiculoConstantesFunciones.NUMEROPOLIZA);
		elementnumero_poliza.appendChild(document.createTextNode(vehiculo.getnumero_poliza().trim()));
		element.appendChild(elementnumero_poliza);

		Element elementfecha_emision = document.createElement(VehiculoConstantesFunciones.FECHAEMISION);
		elementfecha_emision.appendChild(document.createTextNode(vehiculo.getfecha_emision().toString().trim()));
		element.appendChild(elementfecha_emision);

		Element elementfecha_vencimiento = document.createElement(VehiculoConstantesFunciones.FECHAVENCIMIENTO);
		elementfecha_vencimiento.appendChild(document.createTextNode(vehiculo.getfecha_vencimiento().toString().trim()));
		element.appendChild(elementfecha_vencimiento);

		Element elementvalor_asegurado = document.createElement(VehiculoConstantesFunciones.VALORASEGURADO);
		elementvalor_asegurado.appendChild(document.createTextNode(vehiculo.getvalor_asegurado().toString().trim()));
		element.appendChild(elementvalor_asegurado);

		Element elementvalor_deducible = document.createElement(VehiculoConstantesFunciones.VALORDEDUCIBLE);
		elementvalor_deducible.appendChild(document.createTextNode(vehiculo.getvalor_deducible().toString().trim()));
		element.appendChild(elementvalor_deducible);

		Element elementnumero_matricula = document.createElement(VehiculoConstantesFunciones.NUMEROMATRICULA);
		elementnumero_matricula.appendChild(document.createTextNode(vehiculo.getnumero_matricula().trim()));
		element.appendChild(elementnumero_matricula);

		Element elementnumero_motor = document.createElement(VehiculoConstantesFunciones.NUMEROMOTOR);
		elementnumero_motor.appendChild(document.createTextNode(vehiculo.getnumero_motor().trim()));
		element.appendChild(elementnumero_motor);

		Element elementnumero_chasis = document.createElement(VehiculoConstantesFunciones.NUMEROCHASIS);
		elementnumero_chasis.appendChild(document.createTextNode(vehiculo.getnumero_chasis().trim()));
		element.appendChild(elementnumero_chasis);

		Element elementnumero_placa = document.createElement(VehiculoConstantesFunciones.NUMEROPLACA);
		elementnumero_placa.appendChild(document.createTextNode(vehiculo.getnumero_placa().trim()));
		element.appendChild(elementnumero_placa);

		Element elementvalor_comercial = document.createElement(VehiculoConstantesFunciones.VALORCOMERCIAL);
		elementvalor_comercial.appendChild(document.createTextNode(vehiculo.getvalor_comercial().toString().trim()));
		element.appendChild(elementvalor_comercial);

		Element elementdescripcion = document.createElement(VehiculoConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(vehiculo.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoVehiculosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Vehiculo> vehiculosSeleccionados=new ArrayList<Vehiculo>();
		
		vehiculosSeleccionados=this.getVehiculosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVehiculo(vehiculosSeleccionados);
		
		this.generarReporteVehiculos("Todos",vehiculosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVehiculo(ArrayList<Vehiculo> vehiculosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Vehiculo vehiculoAux:vehiculosSeleccionados) {
				vehiculoAux.setsDetalleGeneralEntityReporte(vehiculoAux.toString());
			
				if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_IDDETALLEACTIVOFIJO)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getdetalleactivofijo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_IDASEGURADORA)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getaseguradora_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROPOLIZA)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getnumero_poliza());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_FECHAEMISION)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(vehiculoAux.getfecha_emision()));
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_FECHAVENCIMIENTO)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(vehiculoAux.getfecha_vencimiento()));
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROMATRICULA)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getnumero_matricula());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROMOTOR)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getnumero_motor());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROCHASIS)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getnumero_chasis());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_NUMEROPLACA)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getnumero_placa());
				}
				 else if(sTipoSeleccionar.equals(VehiculoConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					vehiculoAux.setsDescripcionGeneralEntityReporte1(vehiculoAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VehiculoConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVehiculo(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVehiculo=true;
				this.isVisibilidadCeldaNuevoRelacionesVehiculo=true;
				this.isVisibilidadCeldaGuardarCambiosVehiculo=true;
			}
			
			this.isVisibilidadCeldaModificarVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=false;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
			this.isVisibilidadCeldaModificarVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=true;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
			this.isVisibilidadCeldaModificarVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=true;
			this.isVisibilidadCeldaEliminarVehiculo=true;
			this.isVisibilidadCeldaCancelarVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
			this.isVisibilidadCeldaModificarVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=true;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVehiculo=true;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=true;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=true;
			this.isVisibilidadCeldaModificarVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=false;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=true;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
			this.isVisibilidadCeldaActualizarVehiculo=false;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
			this.isVisibilidadCeldaModificarVehiculo=true;
			this.isVisibilidadCeldaActualizarVehiculo=false;
			this.isVisibilidadCeldaEliminarVehiculo=false;
			this.isVisibilidadCeldaCancelarVehiculo=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				} else {
					this.isVisibilidadCeldaGuardarVehiculo=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VehiculoJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVehiculo=true;
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=true;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=true;
		} else {
			this.actualizarEstadoPanelsVehiculo(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVehiculo=false;
			//this.isVisibilidadCeldaVerFormVehiculo=false;
			this.isVisibilidadCeldaDuplicarVehiculo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vehiculoSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
		} else {
			this.isVisibilidadCeldaNuevoVehiculo=false;
			this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vehiculoSessionBean.getEsGuardarRelacionado()) {
			if(!vehiculoSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;												
			}
			
			this.jButtonCerrarVehiculo.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVehiculo=false;
		}
		
		if(!this.permiteMantenimiento(this.vehiculo)) {
			this.isVisibilidadCeldaActualizarVehiculo=false;
			this.isVisibilidadCeldaEliminarVehiculo=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVehiculo() {
		this.isVisibilidadCeldaNuevoVehiculo=false;
		this.isVisibilidadCeldaGuardarCambiosVehiculo=false;
	}
	
	public void actualizarEstadoPanelsVehiculo(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(false);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVehiculo!=null) {
				this.jScrollPanelDatosEdicionVehiculo.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVehiculo!=null) {
				this.jScrollPanelDatosVehiculo.setVisible(true);
			}
			
			if(this.jPanelPaginacionVehiculo!=null) {
				this.jPanelPaginacionVehiculo.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVehiculo!=null) {
					this.jTabbedPaneBusquedasVehiculo.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vehiculoSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVehiculo!=null) {
				this.jTabbedPaneBusquedasVehiculo.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVehiculo!=null) {
				this.jPanelParametrosReportesVehiculo.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAseguradora=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAseguradora) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdAseguradoraVehiculo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdDetalleActivoFijoVehiculo);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdAseguradora=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdAseguradora) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdAseguradoraVehiculo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdDetalleActivoFijoVehiculo);}
		}
		
	}

	public void setVisibilidadBusquedasParaDetalleActivoFijo(Boolean isParaDetalleActivoFijo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaDetalleActivoFijoNegation=!isParaDetalleActivoFijo;

			this.isVisibilidadFK_IdAseguradora=isParaDetalleActivoFijoNegation;
			if(!this.isVisibilidadFK_IdAseguradora) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdAseguradoraVehiculo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaDetalleActivoFijo;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdDetalleActivoFijoVehiculo);}
		}
		
	}

	public void setVisibilidadBusquedasParaAseguradora(Boolean isParaAseguradora){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAseguradoraNegation=!isParaAseguradora;

			this.isVisibilidadFK_IdAseguradora=isParaAseguradora;
			if(!this.isVisibilidadFK_IdAseguradora) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdAseguradoraVehiculo);}

			this.isVisibilidadFK_IdDetalleActivoFijo=isParaAseguradoraNegation;
			if(!this.isVisibilidadFK_IdDetalleActivoFijo) {this.jTabbedPaneBusquedasVehiculo.remove(jPanelFK_IdDetalleActivoFijoVehiculo);}
		}
		
	}
	
	

	public String registrarSesionVehiculoParaServicioTransportes() throws Exception {
		Boolean isPaginaPopupServicioTransporte=false;

		try {

			if(this.vehiculoSessionBean==null) {
				this.vehiculoSessionBean=new VehiculoSessionBean();
			}

			if(this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean==null) {
				this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean=new ServicioTransporteSessionBean();
			}

			this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.setsPathNavegacionActual(vehiculoSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+ServicioTransporteConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupServicioTransporte=this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeServicioTransporte(true);
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeServicioTransporte(VehiculoConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.setisBusquedaDesdeForeignKeySesionVehiculo(true);
			this.jInternalFrameDetalleFormVehiculo.serviciotransporteSessionBean.setlidVehiculoActual(this.idVehiculoActual);

			vehiculoSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVehiculo(true);
			vehiculoSessionBean.setlIdVehiculoActualForeignKey(this.idVehiculoActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VehiculoSessionBean vehiculoSessionBean=new VehiculoSessionBean();
		
		if(this.vehiculoSessionBean==null) {
			this.vehiculoSessionBean=new VehiculoSessionBean();
		}
		
		this.vehiculoSessionBean.setsUltimaBusquedaVehiculo(this.getsAccionBusqueda());
		this.vehiculoSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vehiculoSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAseguradora")) {
			vehiculoSessionBean.setid_aseguradora(this.getid_aseguradoraFK_IdAseguradora());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
			vehiculoSessionBean.setid_detalle_activo_fijo(this.getid_detalle_activo_fijoFK_IdDetalleActivoFijo());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			vehiculoSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			vehiculoSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VehiculoSessionBean vehiculoSessionBean=new VehiculoSessionBean();
		
		if(this.vehiculoSessionBean==null) {
			this.vehiculoSessionBean=new VehiculoSessionBean();
		}
		
		if(this.vehiculoSessionBean.getsUltimaBusquedaVehiculo()!=null&&!this.vehiculoSessionBean.getsUltimaBusquedaVehiculo().equals("")) {
			this.setsAccionBusqueda(vehiculoSessionBean.getsUltimaBusquedaVehiculo());
			this.setiNumeroPaginacion(vehiculoSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vehiculoSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAseguradora")) {
				this.setid_aseguradoraFK_IdAseguradora(vehiculoSessionBean.getid_aseguradora());
				vehiculoSessionBean.setid_aseguradora(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdDetalleActivoFijo")) {
				this.setid_detalle_activo_fijoFK_IdDetalleActivoFijo(vehiculoSessionBean.getid_detalle_activo_fijo());
				vehiculoSessionBean.setid_detalle_activo_fijo(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(vehiculoSessionBean.getid_empresa());
				vehiculoSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(vehiculoSessionBean.getid_sucursal());
				vehiculoSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.vehiculoSessionBean.setsUltimaBusquedaVehiculo("");
		this.vehiculoSessionBean.setiNumeroPaginacion(VehiculoConstantesFunciones.INUMEROPAGINACION);
		this.vehiculoSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVehiculo(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVehiculo() {
		this.updateBorderResaltarBusquedasFormularioVehiculo();
		this.updateVisibilidadBusquedasFormularioVehiculo();
		this.updateHabilitarBusquedasFormularioVehiculo();
	}
	
	public void updateBorderResaltarBusquedasFormularioVehiculo() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVehiculo.getComponents().length>0) {
	

		if(this.vehiculoConstantesFunciones.resaltarFK_IdAseguradoraVehiculo!=null) {
			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdAseguradoraVehiculo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);
				jPanel.setBorder(this.vehiculoConstantesFunciones.resaltarFK_IdAseguradoraVehiculo);
			}
		}

		if(this.vehiculoConstantesFunciones.resaltarFK_IdDetalleActivoFijoVehiculo!=null) {
			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoVehiculo);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);
				jPanel.setBorder(this.vehiculoConstantesFunciones.resaltarFK_IdDetalleActivoFijoVehiculo);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVehiculo() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVehiculo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdAseguradoraVehiculo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vehiculoConstantesFunciones.mostrarFK_IdAseguradoraVehiculo);
			if(!this.vehiculoConstantesFunciones.mostrarFK_IdAseguradoraVehiculo && index>-1) {
				this.jTabbedPaneBusquedasVehiculo.remove(index);
			}

			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoVehiculo);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vehiculoConstantesFunciones.mostrarFK_IdDetalleActivoFijoVehiculo);
			if(!this.vehiculoConstantesFunciones.mostrarFK_IdDetalleActivoFijoVehiculo && index>-1) {
				this.jTabbedPaneBusquedasVehiculo.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVehiculo() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVehiculo.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdAseguradoraVehiculo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vehiculoConstantesFunciones.activarFK_IdAseguradoraVehiculo);
				this.jTabbedPaneBusquedasVehiculo.setEnabledAt(index,this.vehiculoConstantesFunciones.activarFK_IdAseguradoraVehiculo);
			}

			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoVehiculo);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vehiculoConstantesFunciones.activarFK_IdDetalleActivoFijoVehiculo);
				this.jTabbedPaneBusquedasVehiculo.setEnabledAt(index,this.vehiculoConstantesFunciones.activarFK_IdDetalleActivoFijoVehiculo);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVehiculo(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAseguradora")) {
			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdAseguradoraVehiculo);

			this.jTabbedPaneBusquedasVehiculo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);

			this.vehiculoConstantesFunciones.setResaltarFK_IdAseguradoraVehiculo(resaltar);

			jPanel.setBorder(this.vehiculoConstantesFunciones.resaltarFK_IdAseguradoraVehiculo);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdDetalleActivoFijo")) {
			index= this.jTabbedPaneBusquedasVehiculo.indexOfComponent(this.jPanelFK_IdDetalleActivoFijoVehiculo);

			this.jTabbedPaneBusquedasVehiculo.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVehiculo.getComponent(index);

			this.vehiculoConstantesFunciones.setResaltarFK_IdDetalleActivoFijoVehiculo(resaltar);

			jPanel.setBorder(this.vehiculoConstantesFunciones.resaltarFK_IdDetalleActivoFijoVehiculo);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVehiculo.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVehiculo() throws Exception {

		if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVehiculo();
		this.updateVisibilidadResaltarControlesFormularioVehiculo();
		this.updateHabilitarResaltarControlesFormularioVehiculo();
		
	}
	
	public void updateBorderResaltarControlesFormularioVehiculo() throws Exception {
		if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vehiculoConstantesFunciones.resaltaridVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltaridVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarid_empresaVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarid_empresaVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarid_sucursalVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarid_sucursalVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarid_detalle_activo_fijoVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarid_detalle_activo_fijoVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarid_aseguradoraVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarid_aseguradoraVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarnumero_polizaVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarnumero_polizaVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarfecha_emisionVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarfecha_emisionVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarfecha_vencimientoVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarfecha_vencimientoVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarvalor_aseguradoVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarvalor_aseguradoVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarvalor_deducibleVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarvalor_deducibleVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarnumero_matriculaVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarnumero_matriculaVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarnumero_motorVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarnumero_motorVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarnumero_chasisVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarnumero_chasisVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarnumero_placaVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarnumero_placaVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltarvalor_comercialVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltarvalor_comercialVehiculo);}
		if(this.vehiculoConstantesFunciones.resaltardescripcionVehiculo!=null && this.jInternalFrameDetalleFormVehiculo!=null) {this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setBorder(this.vehiculoConstantesFunciones.resaltardescripcionVehiculo);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVehiculo() throws Exception {		
		if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
	
		//this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setVisible(this.vehiculoConstantesFunciones.mostraridVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelidVehiculo.setVisible(this.vehiculoConstantesFunciones.mostraridVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_empresaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelid_empresaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_empresaVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_sucursalVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelid_sucursalVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_sucursalVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_detalle_activo_fijoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelid_detalle_activo_fijoVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_detalle_activo_fijoVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_aseguradoraVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelid_aseguradoraVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarid_aseguradoraVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_polizaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelnumero_polizaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_polizaVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarfecha_emisionVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelfecha_emisionVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarfecha_emisionVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarfecha_vencimientoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelfecha_vencimientoVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarfecha_vencimientoVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarvalor_aseguradoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelvalor_aseguradoVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarvalor_aseguradoVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarvalor_deducibleVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelvalor_deducibleVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarvalor_deducibleVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_matriculaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelnumero_matriculaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_matriculaVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_motorVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelnumero_motorVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_motorVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_chasisVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelnumero_chasisVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_chasisVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_placaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelnumero_placaVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarnumero_placaVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarvalor_comercialVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPanelvalor_comercialVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrarvalor_comercialVehiculo);
		//this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrardescripcionVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jPaneldescripcionVehiculo.setVisible(this.vehiculoConstantesFunciones.mostrardescripcionVehiculo);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVehiculo() throws Exception {
		if(this.jInternalFrameDetalleFormVehiculo==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVehiculo!=null) {
	
		this.jInternalFrameDetalleFormVehiculo.jLabelidVehiculo.setEnabled(this.vehiculoConstantesFunciones.activaridVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_empresaVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarid_empresaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_sucursalVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarid_sucursalVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_detalle_activo_fijoVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarid_detalle_activo_fijoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jComboBoxid_aseguradoraVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarid_aseguradoraVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_polizaVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarnumero_polizaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_emisionVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarfecha_emisionVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jDateChooserfecha_vencimientoVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarfecha_vencimientoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_aseguradoVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarvalor_aseguradoVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_deducibleVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarvalor_deducibleVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_matriculaVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarnumero_matriculaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_motorVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarnumero_motorVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_chasisVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarnumero_chasisVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldnumero_placaVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarnumero_placaVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextFieldvalor_comercialVehiculo.setEnabled(this.vehiculoConstantesFunciones.activarvalor_comercialVehiculo);
		this.jInternalFrameDetalleFormVehiculo.jTextAreadescripcionVehiculo.setEnabled(this.vehiculoConstantesFunciones.activardescripcionVehiculo);
		}
	}
	
		
}