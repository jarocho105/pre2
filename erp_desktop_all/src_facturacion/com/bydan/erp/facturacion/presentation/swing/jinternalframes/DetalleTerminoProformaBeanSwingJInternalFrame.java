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

import com.bydan.erp.facturacion.util.DetalleTerminoProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.DetalleTerminoProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.DetalleTerminoProformaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.DetalleTerminoProformaBean;
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

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class DetalleTerminoProformaBeanSwingJInternalFrame extends DetalleTerminoProformaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(DetalleTerminoProformaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<DetalleTerminoProforma> detalleterminoproformaValidator = new ClassValidator<DetalleTerminoProforma>(DetalleTerminoProforma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public DetalleTerminoProforma detalleterminoproforma;	
	public DetalleTerminoProforma detalleterminoproformaAux;
	public DetalleTerminoProforma detalleterminoproformaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public DetalleTerminoProforma detalleterminoproformaTotales;
	public Long idDetalleTerminoProformaActual;
	public Long iIdNuevoDetalleTerminoProforma=0L;
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

	public String sFinalQueryComboTerminoProforma="";

	public List<TerminoProforma> terminoproformasForeignKey;

	public List<TerminoProforma> getterminoproformasForeignKey() {
		return terminoproformasForeignKey;
	}

	public void setterminoproformasForeignKey(List<TerminoProforma> terminoproformasForeignKey) {
		this.terminoproformasForeignKey = terminoproformasForeignKey;
	}

	//OBJETO FK ACTUAL
	public TerminoProforma terminoproformaForeignKey;

	public TerminoProforma getterminoproformaForeignKey() {
		return terminoproformaForeignKey;
	}

	public void setterminoproformaForeignKey(TerminoProforma terminoproformaForeignKey) {
		this.terminoproformaForeignKey = terminoproformaForeignKey;
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
	
	public Boolean isPermisoTodoDetalleTerminoProforma;
	public Boolean isPermisoNuevoDetalleTerminoProforma;
	public Boolean isPermisoActualizarDetalleTerminoProforma;
	public Boolean isPermisoActualizarOriginalDetalleTerminoProforma;
	public Boolean isPermisoEliminarDetalleTerminoProforma;
	public Boolean isPermisoGuardarCambiosDetalleTerminoProforma;
	public Boolean isPermisoConsultaDetalleTerminoProforma;
	public Boolean isPermisoBusquedaDetalleTerminoProforma;
	public Boolean isPermisoReporteDetalleTerminoProforma;
	public Boolean isPermisoPaginacionMedioDetalleTerminoProforma;
	public Boolean isPermisoPaginacionAltoDetalleTerminoProforma;
	public Boolean isPermisoPaginacionTodoDetalleTerminoProforma;
	public Boolean isPermisoCopiarDetalleTerminoProforma;
	public Boolean isPermisoVerFormDetalleTerminoProforma;
	public Boolean isPermisoDuplicarDetalleTerminoProforma;
	public Boolean isPermisoOrdenDetalleTerminoProforma;
	
	
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
	
	public DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaReturnGeneral;
	public DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoDetalleTerminoProforma=false;
	public Boolean esParaAccionDesdeFormularioDetalleTerminoProforma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected DetalleTerminoProformaSessionBeanAdditional detalleterminoproformaSessionBeanAdditional=null;
	
	public DetalleTerminoProformaSessionBeanAdditional getDetalleTerminoProformaSessionBeanAdditional() {
		return this.detalleterminoproformaSessionBeanAdditional;
	}
	
	public void setDetalleTerminoProformaSessionBeanAdditional(DetalleTerminoProformaSessionBeanAdditional detalleterminoproformaSessionBeanAdditional) {
		try {
			this.detalleterminoproformaSessionBeanAdditional=detalleterminoproformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected DetalleTerminoProformaBeanSwingJInternalFrameAdditional detalleterminoproformaBeanSwingJInternalFrameAdditional=null;
	//public class DetalleTerminoProformaBeanSwingJInternalFrame
	
	public DetalleTerminoProformaBeanSwingJInternalFrameAdditional getDetalleTerminoProformaBeanSwingJInternalFrameAdditional() {
		return this.detalleterminoproformaBeanSwingJInternalFrameAdditional;
	}
	
	public void setDetalleTerminoProformaBeanSwingJInternalFrameAdditional(DetalleTerminoProformaBeanSwingJInternalFrameAdditional detalleterminoproformaBeanSwingJInternalFrameAdditional) {
		try {
			this.detalleterminoproformaBeanSwingJInternalFrameAdditional=detalleterminoproformaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public DetalleTerminoProformaLogic detalleterminoproformaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public DetalleTerminoProforma detalleterminoproformaBean;
	public DetalleTerminoProformaConstantesFunciones detalleterminoproformaConstantesFunciones;
	//public DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public TerminoProformaLogic terminoproformaLogic;
	
	//PARAMETROS
	
	
	//public List<DetalleTerminoProforma> detalleterminoproformas;	
	//public List<DetalleTerminoProforma> detalleterminoproformasEliminados;
	//public List<DetalleTerminoProforma> detalleterminoproformasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
	public Boolean isVisibilidadCeldaDuplicarDetalleTerminoProforma=true;
	public Boolean isVisibilidadCeldaCopiarDetalleTerminoProforma=true;
	public Boolean isVisibilidadCeldaVerFormDetalleTerminoProforma=true;
	public Boolean isVisibilidadCeldaOrdenDetalleTerminoProforma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
	public Boolean isVisibilidadCeldaModificarDetalleTerminoProforma=false;
	public Boolean isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
	public Boolean isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
	public Boolean isVisibilidadCeldaCancelarDetalleTerminoProforma=false;
	public Boolean isVisibilidadCeldaGuardarDetalleTerminoProforma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	public Boolean isVisibilidadFK_IdTerminoProforma=false;
	
	public Long getiIdNuevoDetalleTerminoProforma() {
		return this.iIdNuevoDetalleTerminoProforma;
	}

	public void setiIdNuevoDetalleTerminoProforma(Long iIdNuevoDetalleTerminoProforma) {
		this.iIdNuevoDetalleTerminoProforma = iIdNuevoDetalleTerminoProforma;
	}
	
	public Long getidDetalleTerminoProformaActual() {
		return this.idDetalleTerminoProformaActual;
	}

	public void setidDetalleTerminoProformaActual(Long idDetalleTerminoProformaActual) {
		this.idDetalleTerminoProformaActual = idDetalleTerminoProformaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public DetalleTerminoProforma getdetalleterminoproforma() {
		return this.detalleterminoproforma;
	}

	public void setdetalleterminoproforma(DetalleTerminoProforma detalleterminoproforma) {
		this.detalleterminoproforma = detalleterminoproforma;
	}
	
	public DetalleTerminoProforma getdetalleterminoproformaAux() {
		return this.detalleterminoproformaAux;
	}

	public void setdetalleterminoproformaAux(DetalleTerminoProforma detalleterminoproformaAux) {
		this.detalleterminoproformaAux = detalleterminoproformaAux;
	}				
	
	public DetalleTerminoProforma getdetalleterminoproformaAnterior() {
		return this.detalleterminoproformaAnterior;
	}

	public void setdetalleterminoproformaAnterior(DetalleTerminoProforma detalleterminoproformaAnterior) {
		this.detalleterminoproformaAnterior = detalleterminoproformaAnterior;
	}	
	
	public DetalleTerminoProforma getdetalleterminoproformaTotales() {
		return this.detalleterminoproformaTotales;
	}

	public void setdetalleterminoproformaTotales(DetalleTerminoProforma detalleterminoproformaTotales) {
		this.detalleterminoproformaTotales = detalleterminoproformaTotales;
	}	
	
	public DetalleTerminoProforma getdetalleterminoproformaBean() {
		return this.detalleterminoproformaBean;
	}

	public void setdetalleterminoproformaBean(DetalleTerminoProforma detalleterminoproformaBean) {
		this.detalleterminoproformaBean = detalleterminoproformaBean;
	}	
	
	public DetalleTerminoProformaParameterReturnGeneral getdetalleterminoproformaReturnGeneral() {
		return this.detalleterminoproformaReturnGeneral;
	}

	public void setdetalleterminoproformaReturnGeneral(DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaReturnGeneral) {
		this.detalleterminoproformaReturnGeneral = detalleterminoproformaReturnGeneral;
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

	public Long id_termino_proformaFK_IdTerminoProforma=-1L;

	public Long getid_termino_proformaFK_IdTerminoProforma() {
		return this.id_termino_proformaFK_IdTerminoProforma;
	}

	public void setid_termino_proformaFK_IdTerminoProforma(Long id_termino_proformaFK_IdTerminoProforma) {
		this.id_termino_proformaFK_IdTerminoProforma = id_termino_proformaFK_IdTerminoProforma;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public DetalleTerminoProformaLogic getDetalleTerminoProformaLogic()	{		
		return detalleterminoproformaLogic;
	}

	public void setDetalleTerminoProformaLogic(DetalleTerminoProformaLogic detalleterminoproformaLogic) {
		this.detalleterminoproformaLogic = detalleterminoproformaLogic;
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
	
	public Boolean getIsEsNuevoDetalleTerminoProforma() {
		return isEsNuevoDetalleTerminoProforma;
	}

	public void setIsEsNuevoDetalleTerminoProforma(Boolean isEsNuevoDetalleTerminoProforma) {
		this.isEsNuevoDetalleTerminoProforma = isEsNuevoDetalleTerminoProforma;
	}

	public Boolean getEsParaAccionDesdeFormularioDetalleTerminoProforma() {
		return esParaAccionDesdeFormularioDetalleTerminoProforma;
	}
	
	public void setEsParaAccionDesdeFormularioDetalleTerminoProforma(Boolean esParaAccionDesdeFormularioDetalleTerminoProforma) {
		this.esParaAccionDesdeFormularioDetalleTerminoProforma = esParaAccionDesdeFormularioDetalleTerminoProforma;
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

			if(this.detalleterminoproformaSessionBean==null) {
				this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
			}

			if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(detalleterminoproformaSessionBean.getlidEmpresaActual());
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

			if(this.detalleterminoproformaSessionBean==null) {
				this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
			}

			if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(detalleterminoproformaSessionBean.getlidSucursalActual());
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

	public void cargarCombosTerminoProformasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.terminoproformasForeignKey=new ArrayList<TerminoProforma>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			TerminoProformaLogic terminoproformaLogic=new TerminoProformaLogic();

			//terminoproformaLogic.getTerminoProformaDataAccess().setIsForForeingKeyData(true);

			if(this.detalleterminoproformaSessionBean==null) {
				this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
			}

			if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionTerminoProforma()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//terminoproformaLogic.getTerminoProformaDataAccess().setIsForForeingKeyData(true);

					terminoproformaLogic.getTodosTerminoProformasWithConnection(sFinalQuery,new Pagination());

					this.terminoproformasForeignKey=terminoproformaLogic.getTerminoProformas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaTerminoProforma(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLogic.getEntityWithConnection(detalleterminoproformaSessionBean.getlidTerminoProformaActual());
					this.terminoproformasForeignKey.add(terminoproformaLogic.getTerminoProforma());
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

					if(this.detalleterminoproforma!=null) {
						this.detalleterminoproforma.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
						this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaDetalleTerminoProforma.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaDetalleTerminoProformaGenerico)throws Exception
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
				jComboBoxid_empresaDetalleTerminoProformaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaDetalleTerminoProformaGenerico!=null && jComboBoxid_empresaDetalleTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_empresaDetalleTerminoProformaGenerico.setSelectedIndex(0);
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

					if(this.detalleterminoproforma!=null) {
						this.detalleterminoproforma.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
						this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalDetalleTerminoProforma.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalDetalleTerminoProformaGenerico)throws Exception
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
				jComboBoxid_sucursalDetalleTerminoProformaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalDetalleTerminoProformaGenerico!=null && jComboBoxid_sucursalDetalleTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalDetalleTerminoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualTerminoProformaForeignKey(Long idTerminoProformaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			TerminoProforma  terminoproformaTemp=null;

			for(TerminoProforma terminoproformaAux:terminoproformasForeignKey) {
				if(terminoproformaAux.getId()!=null && terminoproformaAux.getId().equals(idTerminoProformaSeleccionado)) {
					terminoproformaTemp=terminoproformaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(terminoproformaTemp!=null) {

					if(this.detalleterminoproforma!=null) {
						this.detalleterminoproforma.setTerminoProforma(terminoproformaTemp);
					}

					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
						this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setSelectedItem(terminoproformaTemp);
					}
				} else {
					//jComboBoxid_termino_proformaDetalleTerminoProforma.setSelectedItem(terminoproformaTemp);
					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdTerminoProforma") || sFormularioTipoBusqueda.equals("Todos")){
					if(terminoproformaTemp!=null && jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma!=null) {
						jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setSelectedItem(terminoproformaTemp);
					} else {
						if(jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma!=null) {
							//jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setSelectedItem(terminoproformaTemp);
							if(jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.getItemCount()>0) {
								jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setSelectedIndex(0);
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

	public String getActualTerminoProformaForeignKeyDescripcion(Long idTerminoProformaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			TerminoProforma  terminoproformaTemp=null;

			for(TerminoProforma terminoproformaAux:terminoproformasForeignKey) {
				if(terminoproformaAux.getId()!=null && terminoproformaAux.getId().equals(idTerminoProformaSeleccionado)) {
					terminoproformaTemp=terminoproformaAux;
					break;
				}
			}


			sDescripcion=TerminoProformaConstantesFunciones.getTerminoProformaDescripcion(terminoproformaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualTerminoProformaForeignKeyGenerico(Long idTerminoProformaSeleccionado,JComboBox jComboBoxid_termino_proformaDetalleTerminoProformaGenerico)throws Exception
	{
		try
		{
			TerminoProforma  terminoproformaTemp=null;

			for(TerminoProforma terminoproformaAux:terminoproformasForeignKey) {
				if(terminoproformaAux.getId()!=null && terminoproformaAux.getId().equals(idTerminoProformaSeleccionado)) {
					terminoproformaTemp=terminoproformaAux;
					break;
				}
			}

			if(terminoproformaTemp!=null) {
				jComboBoxid_termino_proformaDetalleTerminoProformaGenerico.setSelectedItem(terminoproformaTemp);
			} else {
				if(jComboBoxid_termino_proformaDetalleTerminoProformaGenerico!=null && jComboBoxid_termino_proformaDetalleTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_termino_proformaDetalleTerminoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(DetalleTerminoProforma detalleterminoproforma,JComboBox jComboBoxid_empresaDetalleTerminoProformaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaDetalleTerminoProformaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaDetalleTerminoProformaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				detalleterminoproforma.setid_empresa(empresaAux.getId());
				detalleterminoproforma.setempresa_descripcion(DetalleTerminoProformaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				detalleterminoproforma.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(DetalleTerminoProforma detalleterminoproforma,JComboBox jComboBoxid_sucursalDetalleTerminoProformaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalDetalleTerminoProformaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalDetalleTerminoProformaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				detalleterminoproforma.setid_sucursal(sucursalAux.getId());
				detalleterminoproforma.setsucursal_descripcion(DetalleTerminoProformaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				detalleterminoproforma.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarTerminoProformaForeignKey(DetalleTerminoProforma detalleterminoproforma,JComboBox jComboBoxid_termino_proformaDetalleTerminoProformaGenerico)throws Exception
	{
		try
		{
			TerminoProforma  terminoproformaAux=new TerminoProforma();

			if(jComboBoxid_termino_proformaDetalleTerminoProformaGenerico==null) {
				terminoproformaAux=(TerminoProforma)this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.getSelectedItem();
			} else {
				terminoproformaAux=(TerminoProforma)jComboBoxid_termino_proformaDetalleTerminoProformaGenerico.getSelectedItem();
			}

			if(terminoproformaAux!=null && terminoproformaAux.getId()!=null) {
				detalleterminoproforma.setid_termino_proforma(terminoproformaAux.getId());
				detalleterminoproforma.setterminoproforma_descripcion(DetalleTerminoProformaConstantesFunciones.getTerminoProformaDescripcion(terminoproformaAux));
				detalleterminoproforma.setTerminoProforma(terminoproformaAux);			}
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

					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { 
					}

					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { 
					}

					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameTerminoProformasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingTerminoProforma=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.removeAllItems();

							for(TerminoProforma terminoproforma:this.terminoproformasForeignKey) {
								this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.addItem(terminoproforma);
							}
						}
					}

					if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { 
					}

					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdTerminoProforma") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.removeAllItems();

							for(TerminoProforma terminoproforma:this.terminoproformasForeignKey) {
								this.jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.addItem(terminoproforma);
							}
						}

						if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameTerminoProformaForeignKey(TerminoProforma terminoproforma,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setSelectedItem(terminoproforma);
						}
					} else {
						if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setSelectedItem(terminoproforma);
						} else {
							this.jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesDetalleTerminoProforma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			DetalleTerminoProformaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleTerminoProforma(this.detalleterminoproformaLogic.getDetalleTerminoProformas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			DetalleTerminoProformaConstantesFunciones.refrescarForeignKeysDescripcionesDetalleTerminoProforma(this.detalleterminoproformas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(TerminoProforma.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//detalleterminoproformaLogic.setDetalleTerminoProformas(this.detalleterminoproformas);
			detalleterminoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public DetalleTerminoProformaParameterReturnGeneral getDetalleTerminoProformaParameterGeneral() {
		return this.detalleterminoproformaParameterGeneral;
	}
	
	public void setDetalleTerminoProformaParameterGeneral(DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaParameterGeneral) {
		this.detalleterminoproformaParameterGeneral = detalleterminoproformaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoDetalleTerminoProforma() {
		return isPermisoTodoDetalleTerminoProforma;
	}

	public void setIsPermisoTodoDetalleTerminoProforma(Boolean isPermisoTodoDetalleTerminoProforma) {
		this.isPermisoTodoDetalleTerminoProforma = isPermisoTodoDetalleTerminoProforma;
	}

	public Boolean getIsPermisoNuevoDetalleTerminoProforma() {
		return isPermisoNuevoDetalleTerminoProforma;
	}

	public void setIsPermisoNuevoDetalleTerminoProforma(Boolean isPermisoNuevoDetalleTerminoProforma) {
		this.isPermisoNuevoDetalleTerminoProforma = isPermisoNuevoDetalleTerminoProforma;
	}

	public Boolean getIsPermisoActualizarDetalleTerminoProforma() {
		return isPermisoActualizarDetalleTerminoProforma;
	}

	public void setIsPermisoActualizarDetalleTerminoProforma(Boolean isPermisoActualizarDetalleTerminoProforma) {
		this.isPermisoActualizarDetalleTerminoProforma = isPermisoActualizarDetalleTerminoProforma;
	}

	public Boolean getIsPermisoEliminarDetalleTerminoProforma() {
		return isPermisoEliminarDetalleTerminoProforma;
	}

	public void setIsPermisoEliminarDetalleTerminoProforma(Boolean isPermisoEliminarDetalleTerminoProforma) {
		this.isPermisoEliminarDetalleTerminoProforma = isPermisoEliminarDetalleTerminoProforma;
	}

	public Boolean getIsPermisoGuardarCambiosDetalleTerminoProforma() {
		return isPermisoGuardarCambiosDetalleTerminoProforma;
	}

	public void setIsPermisoGuardarCambiosDetalleTerminoProforma(Boolean isPermisoGuardarCambiosDetalleTerminoProforma) {
		this.isPermisoGuardarCambiosDetalleTerminoProforma = isPermisoGuardarCambiosDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoConsultaDetalleTerminoProforma() {
		return isPermisoConsultaDetalleTerminoProforma;
	}

	public void setIsPermisoConsultaDetalleTerminoProforma(Boolean isPermisoConsultaDetalleTerminoProforma) {
		this.isPermisoConsultaDetalleTerminoProforma = isPermisoConsultaDetalleTerminoProforma;
	}

	public Boolean getIsPermisoBusquedaDetalleTerminoProforma() {
		return isPermisoBusquedaDetalleTerminoProforma;
	}

	public void setIsPermisoBusquedaDetalleTerminoProforma(Boolean isPermisoBusquedaDetalleTerminoProforma) {
		this.isPermisoBusquedaDetalleTerminoProforma = isPermisoBusquedaDetalleTerminoProforma;
	}

	public Boolean getIsPermisoReporteDetalleTerminoProforma() {
		return isPermisoReporteDetalleTerminoProforma;
	}

	public void setIsPermisoReporteDetalleTerminoProforma(Boolean isPermisoReporteDetalleTerminoProforma) {
		this.isPermisoReporteDetalleTerminoProforma = isPermisoReporteDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoPaginacionMedioDetalleTerminoProforma() {
		return isPermisoPaginacionMedioDetalleTerminoProforma;
	}

	public void setIsPermisoPaginacionMedioDetalleTerminoProforma(Boolean isPermisoPaginacionMedioDetalleTerminoProforma) {
		this.isPermisoPaginacionMedioDetalleTerminoProforma = isPermisoPaginacionMedioDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoPaginacionTodoDetalleTerminoProforma() {
		return isPermisoPaginacionTodoDetalleTerminoProforma;
	}

	public void setIsPermisoPaginacionTodoDetalleTerminoProforma(Boolean isPermisoPaginacionTodoDetalleTerminoProforma) {
		this.isPermisoPaginacionTodoDetalleTerminoProforma = isPermisoPaginacionTodoDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoPaginacionAltoDetalleTerminoProforma() {
		return isPermisoPaginacionAltoDetalleTerminoProforma;
	}

	public void setIsPermisoPaginacionAltoDetalleTerminoProforma(Boolean isPermisoPaginacionAltoDetalleTerminoProforma) {
		this.isPermisoPaginacionAltoDetalleTerminoProforma = isPermisoPaginacionAltoDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoCopiarDetalleTerminoProforma() {
		return isPermisoCopiarDetalleTerminoProforma;
	}

	public void setIsPermisoCopiarDetalleTerminoProforma(Boolean isPermisoCopiarDetalleTerminoProforma) {
		this.isPermisoCopiarDetalleTerminoProforma = isPermisoCopiarDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoVerFormDetalleTerminoProforma() {
		return isPermisoVerFormDetalleTerminoProforma;
	}

	public void setIsPermisoVerFormDetalleTerminoProforma(Boolean isPermisoVerFormDetalleTerminoProforma) {
		this.isPermisoVerFormDetalleTerminoProforma = isPermisoVerFormDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoDuplicarDetalleTerminoProforma() {
		return isPermisoDuplicarDetalleTerminoProforma;
	}

	public void setIsPermisoDuplicarDetalleTerminoProforma(Boolean isPermisoDuplicarDetalleTerminoProforma) {
		this.isPermisoDuplicarDetalleTerminoProforma = isPermisoDuplicarDetalleTerminoProforma;
	}
	
	public Boolean getIsPermisoOrdenDetalleTerminoProforma() {
		return isPermisoOrdenDetalleTerminoProforma;
	}

	public void setIsPermisoOrdenDetalleTerminoProforma(Boolean isPermisoOrdenDetalleTerminoProforma) {
		this.isPermisoOrdenDetalleTerminoProforma = isPermisoOrdenDetalleTerminoProforma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoDetalleTerminoProforma() {
		return isVisibilidadCeldaNuevoDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaNuevoDetalleTerminoProforma(Boolean isVisibilidadCeldaNuevoDetalleTerminoProforma) {
		this.isVisibilidadCeldaNuevoDetalleTerminoProforma = isVisibilidadCeldaNuevoDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarDetalleTerminoProforma() {
		return isVisibilidadCeldaDuplicarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaDuplicarDetalleTerminoProforma(Boolean isVisibilidadCeldaDuplicarDetalleTerminoProforma) {
		this.isVisibilidadCeldaDuplicarDetalleTerminoProforma = isVisibilidadCeldaDuplicarDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarDetalleTerminoProforma() {
		return isVisibilidadCeldaCopiarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaCopiarDetalleTerminoProforma(Boolean isVisibilidadCeldaCopiarDetalleTerminoProforma) {
		this.isVisibilidadCeldaCopiarDetalleTerminoProforma = isVisibilidadCeldaCopiarDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormDetalleTerminoProforma() {
		return isVisibilidadCeldaVerFormDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaVerFormDetalleTerminoProforma(Boolean isVisibilidadCeldaVerFormDetalleTerminoProforma) {
		this.isVisibilidadCeldaVerFormDetalleTerminoProforma = isVisibilidadCeldaVerFormDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenDetalleTerminoProforma() {
		return isVisibilidadCeldaOrdenDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaOrdenDetalleTerminoProforma(Boolean isVisibilidadCeldaOrdenDetalleTerminoProforma) {
		this.isVisibilidadCeldaOrdenDetalleTerminoProforma = isVisibilidadCeldaOrdenDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma() {
		return isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma(Boolean isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma) {
		this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma = isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarDetalleTerminoProforma() {
		return isVisibilidadCeldaModificarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaModificarDetalleTerminoProforma(Boolean isVisibilidadCeldaModificarDetalleTerminoProforma) {
		this.isVisibilidadCeldaModificarDetalleTerminoProforma = isVisibilidadCeldaModificarDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarDetalleTerminoProforma() {
		return isVisibilidadCeldaActualizarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaActualizarDetalleTerminoProforma(Boolean isVisibilidadCeldaActualizarDetalleTerminoProforma) {
		this.isVisibilidadCeldaActualizarDetalleTerminoProforma = isVisibilidadCeldaActualizarDetalleTerminoProforma;
	}

	public Boolean getIsVisibilidadCeldaEliminarDetalleTerminoProforma() {
		return isVisibilidadCeldaEliminarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaEliminarDetalleTerminoProforma(Boolean isVisibilidadCeldaEliminarDetalleTerminoProforma) {
		this.isVisibilidadCeldaEliminarDetalleTerminoProforma = isVisibilidadCeldaEliminarDetalleTerminoProforma;
	}

	public Boolean getIsVisibilidadCeldaCancelarDetalleTerminoProforma() {
		return isVisibilidadCeldaCancelarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaCancelarDetalleTerminoProforma(Boolean isVisibilidadCeldaCancelarDetalleTerminoProforma) {
		this.isVisibilidadCeldaCancelarDetalleTerminoProforma = isVisibilidadCeldaCancelarDetalleTerminoProforma;
	}

	public Boolean getIsVisibilidadCeldaGuardarDetalleTerminoProforma() {
		return isVisibilidadCeldaGuardarDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaGuardarDetalleTerminoProforma(Boolean isVisibilidadCeldaGuardarDetalleTerminoProforma) {
		this.isVisibilidadCeldaGuardarDetalleTerminoProforma = isVisibilidadCeldaGuardarDetalleTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosDetalleTerminoProforma() {
		return isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosDetalleTerminoProforma(Boolean isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma) {
		this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma = isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma;
	}
		
	public DetalleTerminoProformaSessionBean getdetalleterminoproformaSessionBean() {
		return this.detalleterminoproformaSessionBean;
	}
	
	public void setdetalleterminoproformaSessionBean(DetalleTerminoProformaSessionBean detalleterminoproformaSessionBean) {
		this.detalleterminoproformaSessionBean=detalleterminoproformaSessionBean;
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

	public Boolean getisVisibilidadFK_IdTerminoProforma() {
		return this.isVisibilidadFK_IdTerminoProforma;
	}

	public void setisVisibilidadFK_IdTerminoProforma(Boolean isVisibilidadFK_IdTerminoProforma) {
		this.isVisibilidadFK_IdTerminoProforma=isVisibilidadFK_IdTerminoProforma;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(detalleterminoproforma,null);
				this.setActualParaGuardarSucursalForeignKey(detalleterminoproforma,null);
				this.setActualParaGuardarTerminoProformaForeignKey(detalleterminoproforma,null);
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
	
	public void bugActualizarReferenciaActual(DetalleTerminoProforma detalleterminoproforma,DetalleTerminoProforma detalleterminoproformaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalDetalleTerminoProforma(detalleterminoproforma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		detalleterminoproformaAux.setId(detalleterminoproforma.getId());
		detalleterminoproformaAux.setVersionRow(detalleterminoproforma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessDetalleTerminoProforma();
		
			int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = detalleterminoproformaValidator.getInvalidValues(this.detalleterminoproforma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			detalleterminoproformaLogic.setDatosCliente(datosCliente);
			detalleterminoproformaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				detalleterminoproformaAux=new  DetalleTerminoProforma();
				
				detalleterminoproformaAux.setIsNew(true);
				detalleterminoproformaAux.setIsChanged(true);
				
				detalleterminoproformaAux.setDetalleTerminoProformaOriginal(this.detalleterminoproforma);
				
				detalleterminoproformaAux.setId(this.detalleterminoproforma.getId());	
				detalleterminoproformaAux.setVersionRow(this.detalleterminoproforma.getVersionRow());	
				detalleterminoproformaAux.setid_empresa(this.detalleterminoproforma.getid_empresa());	
				detalleterminoproformaAux.setid_sucursal(this.detalleterminoproforma.getid_sucursal());	
				detalleterminoproformaAux.setid_termino_proforma(this.detalleterminoproforma.getid_termino_proforma());	
				detalleterminoproformaAux.setnumero(this.detalleterminoproforma.getnumero());	
				detalleterminoproformaAux.setdetalle(this.detalleterminoproforma.getdetalle());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(detalleterminoproformaAux,detalleterminoproformaLogic.getDetalleTerminoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleterminoproformaAux,detalleterminoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaLogic.saveDetalleTerminoProformas();//WithConnection
						//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleterminoproforma,detalleterminoproformaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleTerminoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleterminoproformaLogic.saveDetalleTerminoProformaRelaciones(detalleterminoproformaAux);//WithConnection
								//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleterminoproforma,detalleterminoproformaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleterminoproformaAux,detalleterminoproformaLogic.getDetalleTerminoProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleterminoproformaAux,detalleterminoproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleterminoproforma,detalleterminoproformaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				detalleterminoproformaAux=new  DetalleTerminoProforma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() 
					|| (this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() && this.detalleterminoproforma.getId()>=0)) {
						
					detalleterminoproformaAux.setIsNew(false);
				}
				
				detalleterminoproformaAux.setIsDeleted(false);
			
				detalleterminoproformaAux.setId(this.detalleterminoproforma.getId());	
				detalleterminoproformaAux.setVersionRow(this.detalleterminoproforma.getVersionRow());	
				detalleterminoproformaAux.setid_empresa(this.detalleterminoproforma.getid_empresa());	
				detalleterminoproformaAux.setid_sucursal(this.detalleterminoproforma.getid_sucursal());	
				detalleterminoproformaAux.setid_termino_proforma(this.detalleterminoproforma.getid_termino_proforma());	
				detalleterminoproformaAux.setnumero(this.detalleterminoproforma.getnumero());	
				detalleterminoproformaAux.setdetalle(this.detalleterminoproforma.getdetalle());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleterminoproformaAux,detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleterminoproformaAux,detalleterminoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaLogic.saveDetalleTerminoProformas();//WithConnection
						//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.detalleterminoproforma,detalleterminoproformaAux);
					
					this.refrescarForeignKeysDescripcionesDetalleTerminoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleterminoproformaLogic.saveDetalleTerminoProformaRelaciones(detalleterminoproformaAux);//WithConnection
								//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.detalleterminoproforma,detalleterminoproformaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(detalleterminoproformaAux,detalleterminoproformaLogic.getDetalleTerminoProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(detalleterminoproformaAux,detalleterminoproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.detalleterminoproforma,detalleterminoproformaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				detalleterminoproformaAux=new  DetalleTerminoProforma();
				
				detalleterminoproformaAux.setIsNew(false);
				detalleterminoproformaAux.setIsChanged(false);
				
				detalleterminoproformaAux.setIsDeleted(true);
				
				detalleterminoproformaAux.setId(this.detalleterminoproforma.getId());	
				detalleterminoproformaAux.setVersionRow(this.detalleterminoproforma.getVersionRow());	
				detalleterminoproformaAux.setid_empresa(this.detalleterminoproforma.getid_empresa());	
				detalleterminoproformaAux.setid_sucursal(this.detalleterminoproforma.getid_sucursal());	
				detalleterminoproformaAux.setid_termino_proforma(this.detalleterminoproforma.getid_termino_proforma());	
				detalleterminoproformaAux.setnumero(this.detalleterminoproforma.getnumero());	
				detalleterminoproformaAux.setdetalle(this.detalleterminoproforma.getdetalle());	
				
				if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.detalleterminoproformaAux.getId()>=0) {	
						this.detalleterminoproformasEliminados.add(detalleterminoproformaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(detalleterminoproformaAux,detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleterminoproformaAux,detalleterminoproformas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaLogic.saveDetalleTerminoProformas();//WithConnection
						//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								detalleterminoproformaLogic.saveDetalleTerminoProformaRelaciones(detalleterminoproformaAux);//WithConnection
								//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						}
					}  else {
							
						
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(detalleterminoproformaAux,detalleterminoproformaLogic.getDetalleTerminoProformas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(detalleterminoproformaAux,detalleterminoproformas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(this.detalleterminoproformasEliminados);
					
					detalleterminoproformaLogic.saveDetalleTerminoProformas();//WithConnection
					//detalleterminoproformaLogic.getSetVersionRowDetalleTerminoProformas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesDetalleTerminoProforma();
				
				this.detalleterminoproformasEliminados= new ArrayList<DetalleTerminoProforma>();		
			}
			
			if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Detalle Termino Proforma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.detalleterminoproforma=detalleterminoproformaAux;
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
      		//this.finishProcessDetalleTerminoProforma();
      	}
		
	}	
	
	public void actualizarRelaciones(DetalleTerminoProforma detalleterminoproformaLocal) throws Exception {
		
		if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(DetalleTerminoProforma detalleterminoproformaLocal) throws Exception {	
		if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				detalleterminoproformaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				detalleterminoproformaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(TerminoProformaDetalleFormJInternalFrame.class)) {
				TerminoProformaBeanSwingJInternalFrame terminoproformaBeanSwingJInternalFrameLocal=(TerminoProformaBeanSwingJInternalFrame) ((TerminoProformaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				terminoproformaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoTerminoProforma(terminoproformaBeanSwingJInternalFrameLocal.getterminoproforma(),true);
				terminoproformaBeanSwingJInternalFrameLocal.actualizarLista(terminoproformaBeanSwingJInternalFrameLocal.terminoproforma,this.terminoproformasForeignKey);

				terminoproformaBeanSwingJInternalFrameLocal.actualizarRelaciones(terminoproformaBeanSwingJInternalFrameLocal.terminoproforma);

				detalleterminoproformaLocal.setTerminoProforma(terminoproformaBeanSwingJInternalFrameLocal.terminoproforma);

				this.addItemDefectoCombosForeignKeyTerminoProforma();
				this.cargarCombosFrameTerminoProformasForeignKey("Formulario");
				this.setActualTerminoProformaForeignKey(terminoproformaBeanSwingJInternalFrameLocal.terminoproforma.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarDetalleTerminoProformaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = detalleterminoproformaValidator.getInvalidValues(this.detalleterminoproforma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(DetalleTerminoProforma detalleterminoproforma,List<DetalleTerminoProforma> detalleterminoproformas) throws Exception {
		try	{		
			DetalleTerminoProformaConstantesFunciones.actualizarLista(detalleterminoproforma,detalleterminoproformas,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(DetalleTerminoProforma detalleterminoproforma,List<DetalleTerminoProforma> detalleterminoproformas) throws Exception {
		try	{			
			DetalleTerminoProformaConstantesFunciones.actualizarSelectedLista(detalleterminoproforma,detalleterminoproformas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<DetalleTerminoProforma> detalleterminoproformasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				detalleterminoproformasLocal=this.detalleterminoproformaLogic.getDetalleTerminoProformas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				detalleterminoproformasLocal=this.detalleterminoproformas;
			}
			//ARCHITECTURE
		
			for(DetalleTerminoProforma detalleterminoproformaLocal:detalleterminoproformasLocal) {
				if(this.permiteMantenimiento(detalleterminoproformaLocal) && detalleterminoproformaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+DetalleTerminoProformaConstantesFunciones.getDetalleTerminoProformaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(DetalleTerminoProformaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelid_empresaDetalleTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTerminoProformaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelid_sucursalDetalleTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTerminoProformaConstantesFunciones.IDTERMINOPROFORMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelid_termino_proformaDetalleTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTerminoProformaConstantesFunciones.NUMERO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelnumeroDetalleTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(DetalleTerminoProformaConstantesFunciones.DETALLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabeldetalleDetalleTerminoProforma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelid_empresaDetalleTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelid_sucursalDetalleTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelid_termino_proformaDetalleTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelnumeroDetalleTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabeldetalleDetalleTerminoProforma,"");
		
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
		this.iIdNuevoDetalleTerminoProforma--;	
		
		
		this.detalleterminoproformaAux=new DetalleTerminoProforma();
		
		this.detalleterminoproformaAux.setId(this.iIdNuevoDetalleTerminoProforma);
		this.detalleterminoproformaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.detalleterminoproformaLogic.getDetalleTerminoProformas().add(this.detalleterminoproformaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.detalleterminoproformas.add(this.detalleterminoproformaAux);
		}
		//ARCHITECTURE
		
		this.detalleterminoproforma=this.detalleterminoproformaAux;
		
		if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproforma);
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleTerminoProforma(this.detalleterminoproforma);
		}
				
		//this.setDefaultControlesDetalleTerminoProforma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyDetalleTerminoProforma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyDetalleTerminoProforma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleTerminoProforma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleTerminoProforma(this.detalleterminoproformaBean,this.detalleterminoproforma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
			classes=DetalleTerminoProformaConstantesFunciones.getClassesRelationshipsOfDetalleTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.detalleterminoproformaReturnGeneral=detalleterminoproformaLogic.procesarEventosDetalleTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleterminoproformaLogic.getDetalleTerminoProformas(),this.detalleterminoproforma,this.detalleterminoproformaParameterGeneral,this.isEsNuevoDetalleTerminoProforma,classes);//this.detalleterminoproformaLogic.getDetalleTerminoProforma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral,this.detalleterminoproformaBean,false);
		
		if(this.detalleterminoproformaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma());
		}
		
		if(this.detalleterminoproformaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma(),classes);//this.detalleterminoproformaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyDetalleTerminoProforma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyDetalleTerminoProforma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.RecargarFormDetalleTerminoProforma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
						
			if(detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleTerminoProforma();
			}
			
			this.actualizarVisualTableDatosDetalleTerminoProforma();
			
			this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoDetalleTerminoProforma(), this.getIndiceNuevoDetalleTerminoProforma());
			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
						
			this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesDetalleTerminoProforma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setEnabled(isHabilitar && this.detalleterminoproformaConstantesFunciones.activarnumeroDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setEnabled(isHabilitar && this.detalleterminoproformaConstantesFunciones.activardetalleDetalleTerminoProforma);	
		//
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setEnabled(isHabilitar && this.detalleterminoproformaConstantesFunciones.activarid_empresaDetalleTerminoProforma);//
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setEnabled(isHabilitar && this.detalleterminoproformaConstantesFunciones.activarid_sucursalDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setEnabled(isHabilitar && this.detalleterminoproformaConstantesFunciones.activarid_termino_proformaDetalleTerminoProforma);
	};
	
	public void setDefaultControlesDetalleTerminoProforma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoDetalleTerminoProforma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.detalleterminoproformaSessionBean.setConGuardarRelaciones(true);			
			this.detalleterminoproformaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.setVisible(true);
			
					
		} else {
			//this.detalleterminoproformaSessionBean.setConGuardarRelaciones(false);			
			this.detalleterminoproformaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoDetalleTerminoProforma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
				if(detalleterminoproformaAux.getId().equals(this.iIdNuevoDetalleTerminoProforma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformas) {
				if(detalleterminoproformaAux.getId().equals(this.iIdNuevoDetalleTerminoProforma)) {
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
	
	public int getIndiceActualDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
				if(detalleterminoproformaAux.getId().equals(detalleterminoproforma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformas) {
				if(detalleterminoproformaAux.getId().equals(detalleterminoproforma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproformaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
				if(detalleterminoproformaAux.getDetalleTerminoProformaOriginal().getId().equals(detalleterminoproformaOriginal.getId())) {
					existe=true;
					detalleterminoproformaOriginal.setId(detalleterminoproformaAux.getId());
					detalleterminoproformaOriginal.setVersionRow(detalleterminoproformaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformas) {
				if(detalleterminoproformaAux.getDetalleTerminoProformaOriginal().getId().equals(detalleterminoproformaOriginal.getId())) {
					existe=true;
					detalleterminoproformaOriginal.setId(detalleterminoproformaAux.getId());
					detalleterminoproformaOriginal.setVersionRow(detalleterminoproformaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosDetalleTerminoProforma(Boolean esParaCancelar) throws Exception {
		detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
		detalleterminoproformaAux=new DetalleTerminoProforma();
		
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
					if(detalleterminoproformaAux.getId()<0) {
						detalleterminoproformasAux.add(detalleterminoproformaAux);
					}		
				}
				this.iIdNuevoDetalleTerminoProforma=0L;
				this.detalleterminoproformaLogic.getDetalleTerminoProformas().removeAll(detalleterminoproformasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformas) {
					if(detalleterminoproformaAux.getId()<0) {
						detalleterminoproformasAux.add(detalleterminoproformaAux);
					}		
				}
				this.iIdNuevoDetalleTerminoProforma=0L;
				this.detalleterminoproformas.removeAll(detalleterminoproformasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoDetalleTerminoProforma 
					&& this.detalleterminoproformaLogic.getDetalleTerminoProformas().size()>0
					) {
					detalleterminoproformaAux=this.detalleterminoproformaLogic.getDetalleTerminoProformas().get(this.detalleterminoproformaLogic.getDetalleTerminoProformas().size() - 1);
				
					if(detalleterminoproformaAux.getId()<0) {
						this.detalleterminoproformaLogic.getDetalleTerminoProformas().remove(detalleterminoproformaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoDetalleTerminoProforma && this.detalleterminoproformas.size()>0) {
					detalleterminoproformaAux=this.detalleterminoproformas.get(this.detalleterminoproformas.size() - 1);
				
					if(detalleterminoproformaAux.getId()<0) {
						this.detalleterminoproformas.remove(detalleterminoproformaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoDetalleTerminoProforma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(detalleterminoproforma.getId()<0) {
				this.detalleterminoproformaLogic.getDetalleTerminoProformas().remove(this.detalleterminoproforma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(detalleterminoproforma.getId()<0) {
				this.detalleterminoproformas.remove(this.detalleterminoproforma);
			}
		}			
	}
	
	public void setEstadosInicialesDetalleTerminoProforma(List<DetalleTerminoProforma> detalleterminoproformasAux) throws Exception {
		DetalleTerminoProformaConstantesFunciones.setEstadosInicialesDetalleTerminoProforma(detalleterminoproformasAux);
	}
	
	public void setEstadosInicialesDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproformaAux) throws Exception {
		DetalleTerminoProformaConstantesFunciones.setEstadosInicialesDetalleTerminoProforma(detalleterminoproformaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarDetalleTerminoProformaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarDetalleTerminoProformaActual()) {
				if(!this.isEsNuevoDetalleTerminoProforma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoDetalleTerminoProforma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarDetalleTerminoProformaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Detalle Termino Proforma ?", "MANTENIMIENTO DE Detalle Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(DetalleTerminoProforma detalleterminoproforma) throws Exception {
		DetalleTerminoProformaConstantesFunciones.seleccionarAsignar(this.detalleterminoproforma,detalleterminoproforma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarDetalleTerminoProforma=this.isPermisoActualizarOriginalDetalleTerminoProforma;
			
			
			this.seleccionarAsignar(detalleterminoproforma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			DetalleTerminoProformaConstantesFunciones.quitarEspaciosDetalleTerminoProforma(this.detalleterminoproforma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.detalleterminoproformaSessionBean.setsFuncionBusquedaRapida(this.detalleterminoproformaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoDetalleTerminoProforma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosDetalleTerminoProforma(esParaCancelar);				
				this.cancelarNuevoDetalleTerminoProforma(esParaCancelar);								
			}
			
			this.detalleterminoproforma=new DetalleTerminoProforma();
			
			this.inicializarDetalleTerminoProforma();
			
			this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarDetalleTerminoProforma() throws Exception {
		try {
			DetalleTerminoProformaConstantesFunciones.inicializarDetalleTerminoProforma(this.detalleterminoproforma);
			
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
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.detalleterminoproformaLogic.getDetalleTerminoProformas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteDetalleTerminoProformas(String sAccionBusqueda,List<DetalleTerminoProforma> detalleterminoproformasParaReportes) throws Exception {
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
					sPathReporteFinal="DetalleTerminoProforma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="DetalleTerminoProformaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("DetalleTerminoProformaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="DetalleTerminoProforma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Detalle Termino Proformas");		
		parameters.put("busquedapor", DetalleTerminoProformaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceDetalleTerminoProforma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			DetalleTerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			DetalleTerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceDetalleTerminoProforma=new JRBeanArrayDataSource(DetalleTerminoProformaJInternalFrame.TraerDetalleTerminoProformaBeans(detalleterminoproformasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceDetalleTerminoProforma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+DetalleTerminoProformaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+DetalleTerminoProformaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(DetalleTerminoProformaBean.TraerDetalleTerminoProformaBeans(detalleterminoproformasParaReportes).toArray()));
							
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
				this.generarExcelReporteDetalleTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,detalleterminoproformasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalDetalleTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,detalleterminoproformasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProformaActionPerformed(null);
					//this.generarExcelReporteDetalleTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,detalleterminoproformasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalDetalleTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,detalleterminoproformasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesDetalleTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,detalleterminoproformasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesDetalleTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,detalleterminoproformasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteDetalleTerminoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleTerminoProforma> detalleterminoproformasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleTerminoProformas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleTerminoProforma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(DetalleTerminoProforma detalleterminoproforma : detalleterminoproformasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			DetalleTerminoProformaConstantesFunciones.generarExcelReporteDataDetalleTerminoProforma("NORMAL",row,workbook,detalleterminoproforma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderDetalleTerminoProforma(String sTipo,Row row,Workbook workbook) {
		
		DetalleTerminoProformaConstantesFunciones.generarExcelReporteHeaderDetalleTerminoProforma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalDetalleTerminoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleTerminoProforma> detalleterminoproformasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleTerminoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(DetalleTerminoProforma detalleterminoproforma : detalleterminoproformasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(DetalleTerminoProformaConstantesFunciones.getDetalleTerminoProformaDescripcion(detalleterminoproforma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleterminoproforma.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleterminoproforma.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleterminoproforma.getterminoproforma_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleterminoproforma.getnumero());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(detalleterminoproforma.getdetalle());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesDetalleTerminoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<DetalleTerminoProforma> detalleterminoproformasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<DetalleTerminoProforma> detalleterminoproformasRespaldo=null;
		
		classes=DetalleTerminoProformaConstantesFunciones.getClassesRelationshipsOfDetalleTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.detalleterminoproformaLogic.setDatosCliente(this.datosCliente);
		this.detalleterminoproformaLogic.setDatosDeep(this.datosDeep);
		this.detalleterminoproformaLogic.setIsConDeep(true);
		
		detalleterminoproformasRespaldo=this.detalleterminoproformaLogic.getDetalleTerminoProformas();
		
		this.detalleterminoproformaLogic.setDetalleTerminoProformas(detalleterminoproformasParaReportes);	
		this.detalleterminoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		detalleterminoproformasParaReportes=this.detalleterminoproformaLogic.getDetalleTerminoProformas();
		this.detalleterminoproformaLogic.setDetalleTerminoProformas(detalleterminoproformasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("DetalleTerminoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderDetalleTerminoProforma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(DetalleTerminoProforma detalleterminoproforma : detalleterminoproformasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderDetalleTerminoProforma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			DetalleTerminoProformaConstantesFunciones.generarExcelReporteDataDetalleTerminoProforma("NORMAL",row,workbook,detalleterminoproforma,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(DetalleTerminoProformaConstantesFunciones.getDetalleTerminoProformaDescripcion(detalleterminoproforma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessDetalleTerminoProforma() throws Exception {		
		this.startProcessDetalleTerminoProforma(true);
	}
	
	public void startProcessDetalleTerminoProforma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasDetalleTerminoProforma ,this.jPanelParametrosReportesDetalleTerminoProforma, this.jScrollPanelDatosDetalleTerminoProforma,this.jPanelPaginacionDetalleTerminoProforma, this.jScrollPanelDatosEdicionDetalleTerminoProforma, this.jPanelAccionesDetalleTerminoProforma,this.jPanelAccionesFormularioDetalleTerminoProforma,this.jmenuBarDetalleTerminoProforma,this.jmenuBarDetalleDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,this.jTtoolBarDetalleDetalleTerminoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleTerminoProforma=this.jTabbedPaneBusquedasDetalleTerminoProforma; 
		
		final JPanel jPanelParametrosReportesDetalleTerminoProforma=this.jPanelParametrosReportesDetalleTerminoProforma;
		//final JScrollPane jScrollPanelDatosDetalleTerminoProforma=this.jScrollPanelDatosDetalleTerminoProforma;
		final JTable jTableDatosDetalleTerminoProforma=this.jTableDatosDetalleTerminoProforma;		
		final JPanel jPanelPaginacionDetalleTerminoProforma=this.jPanelPaginacionDetalleTerminoProforma;
		//final JScrollPane jScrollPanelDatosEdicionDetalleTerminoProforma=this.jScrollPanelDatosEdicionDetalleTerminoProforma;
		final JPanel jPanelAccionesDetalleTerminoProforma=this.jPanelAccionesDetalleTerminoProforma;
		
		JPanel jPanelCamposAuxiliarDetalleTerminoProforma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarDetalleTerminoProforma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			jPanelCamposAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelCamposDetalleTerminoProforma;
			jPanelAccionesFormularioAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelAccionesFormularioDetalleTerminoProforma;
		}
		
		final JPanel jPanelCamposDetalleTerminoProforma=jPanelCamposAuxiliarDetalleTerminoProforma;
		final JPanel jPanelAccionesFormularioDetalleTerminoProforma=jPanelAccionesFormularioAuxiliarDetalleTerminoProforma;
		
		
		final JMenuBar jmenuBarDetalleTerminoProforma=this.jmenuBarDetalleTerminoProforma;
		final JToolBar jTtoolBarDetalleTerminoProforma=this.jTtoolBarDetalleTerminoProforma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarDetalleTerminoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleTerminoProforma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			jmenuBarDetalleAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jmenuBarDetalleDetalleTerminoProforma;
			jTtoolBarDetalleAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jTtoolBarDetalleDetalleTerminoProforma;
		}
		
		final JMenuBar jmenuBarDetalleDetalleTerminoProforma=jmenuBarDetalleAuxiliarDetalleTerminoProforma;
		final JToolBar jTtoolBarDetalleDetalleTerminoProforma=jTtoolBarDetalleAuxiliarDetalleTerminoProforma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleTerminoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleTerminoProforma;
			processRunnable.jTableDatos=jTableDatosDetalleTerminoProforma;
			processRunnable.jPanelCampos=jPanelCamposDetalleTerminoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleTerminoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleTerminoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleTerminoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleTerminoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleTerminoProforma;
			processRunnable.jTtoolBar=jTtoolBarDetalleTerminoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleTerminoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleTerminoProforma ,jPanelParametrosReportesDetalleTerminoProforma,jTableDatosDetalleTerminoProforma, /*jScrollPanelDatosDetalleTerminoProforma,*/jPanelCamposDetalleTerminoProforma,jPanelPaginacionDetalleTerminoProforma, /*jScrollPanelDatosEdicionDetalleTerminoProforma,*/ jPanelAccionesDetalleTerminoProforma,jPanelAccionesFormularioDetalleTerminoProforma,jmenuBarDetalleTerminoProforma,jmenuBarDetalleDetalleTerminoProforma,jTtoolBarDetalleTerminoProforma,jTtoolBarDetalleDetalleTerminoProforma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasDetalleTerminoProforma ,jPanelParametrosReportesDetalleTerminoProforma, jScrollPanelDatosDetalleTerminoProforma,jPanelPaginacionDetalleTerminoProforma, jScrollPanelDatosEdicionDetalleTerminoProforma, jPanelAccionesDetalleTerminoProforma,jPanelAccionesFormularioDetalleTerminoProforma,jmenuBarDetalleTerminoProforma,jmenuBarDetalleDetalleTerminoProforma,jTtoolBarDetalleTerminoProforma,jTtoolBarDetalleDetalleTerminoProforma);
						
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
	
	public void finishProcessDetalleTerminoProforma() {// throws Exception 
		this.finishProcessDetalleTerminoProforma(true);
	}
	
	public void finishProcessDetalleTerminoProforma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasDetalleTerminoProforma ,this.jPanelParametrosReportesDetalleTerminoProforma, this.jScrollPanelDatosDetalleTerminoProforma,this.jPanelPaginacionDetalleTerminoProforma, this.jScrollPanelDatosEdicionDetalleTerminoProforma, this.jPanelAccionesDetalleTerminoProforma,this.jPanelAccionesFormularioDetalleTerminoProforma,this.jmenuBarDetalleTerminoProforma,this.jmenuBarDetalleDetalleTerminoProforma,this.jTtoolBarDetalleTerminoProforma,this.jTtoolBarDetalleDetalleTerminoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasDetalleTerminoProforma=this.jTabbedPaneBusquedasDetalleTerminoProforma; 
		
		final JPanel jPanelParametrosReportesDetalleTerminoProforma=this.jPanelParametrosReportesDetalleTerminoProforma;
		//final JScrollPane jScrollPanelDatosDetalleTerminoProforma=this.jScrollPanelDatosDetalleTerminoProforma;
		final JTable jTableDatosDetalleTerminoProforma=this.jTableDatosDetalleTerminoProforma;		
		final JPanel jPanelPaginacionDetalleTerminoProforma=this.jPanelPaginacionDetalleTerminoProforma;
		//final JScrollPane jScrollPanelDatosEdicionDetalleTerminoProforma=this.jScrollPanelDatosEdicionDetalleTerminoProforma;
		final JPanel jPanelAccionesDetalleTerminoProforma=this.jPanelAccionesDetalleTerminoProforma;
		
		JPanel jPanelCamposAuxiliarDetalleTerminoProforma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarDetalleTerminoProforma=new JPanel();
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			jPanelCamposAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelCamposDetalleTerminoProforma;
			jPanelAccionesFormularioAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelAccionesFormularioDetalleTerminoProforma;
		}
		
		final JPanel jPanelCamposDetalleTerminoProforma=jPanelCamposAuxiliarDetalleTerminoProforma;
		final JPanel jPanelAccionesFormularioDetalleTerminoProforma=jPanelAccionesFormularioAuxiliarDetalleTerminoProforma;
		
		
		final JMenuBar jmenuBarDetalleTerminoProforma=this.jmenuBarDetalleTerminoProforma;		
		final JToolBar jTtoolBarDetalleTerminoProforma=this.jTtoolBarDetalleTerminoProforma;
				
		JMenuBar jmenuBarDetalleAuxiliarDetalleTerminoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarDetalleTerminoProforma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			jmenuBarDetalleAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jmenuBarDetalleDetalleTerminoProforma;
			jTtoolBarDetalleAuxiliarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jTtoolBarDetalleDetalleTerminoProforma;		
		}
		
		final JMenuBar jmenuBarDetalleDetalleTerminoProforma=jmenuBarDetalleAuxiliarDetalleTerminoProforma;
		final JToolBar jTtoolBarDetalleDetalleTerminoProforma=jTtoolBarDetalleAuxiliarDetalleTerminoProforma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasDetalleTerminoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesDetalleTerminoProforma;
			processRunnable.jTableDatos=jTableDatosDetalleTerminoProforma;
			processRunnable.jPanelCampos=jPanelCamposDetalleTerminoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionDetalleTerminoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesDetalleTerminoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioDetalleTerminoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarDetalleTerminoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleDetalleTerminoProforma;
			processRunnable.jTtoolBar=jTtoolBarDetalleTerminoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleDetalleTerminoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasDetalleTerminoProforma ,jPanelParametrosReportesDetalleTerminoProforma, jTableDatosDetalleTerminoProforma,/*jScrollPanelDatosDetalleTerminoProforma,*/jPanelCamposDetalleTerminoProforma,jPanelPaginacionDetalleTerminoProforma, /*jScrollPanelDatosEdicionDetalleTerminoProforma,*/ jPanelAccionesDetalleTerminoProforma,jPanelAccionesFormularioDetalleTerminoProforma,jmenuBarDetalleTerminoProforma,jmenuBarDetalleDetalleTerminoProforma,jTtoolBarDetalleTerminoProforma,jTtoolBarDetalleDetalleTerminoProforma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesDetalleTerminoProforma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarDetalleTerminoProforma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuDetalleTerminoProforma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarDetalleTerminoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTerminoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleDetalleTerminoProforma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuDetalleTerminoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTerminoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleDetalleTerminoProforma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.detalleterminoproformaConstantesFunciones.getsFinalQueryDetalleTerminoProforma();
		String  finalQueryPaginacionTodos=this.detalleterminoproformaConstantesFunciones.getsFinalQueryDetalleTerminoProforma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=DetalleTerminoProformaConstantesFunciones.getArrayColumnasGlobalesNoDetalleTerminoProforma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=DetalleTerminoProformaConstantesFunciones.getArrayColumnasGlobalesDetalleTerminoProforma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,DetalleTerminoProformaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.detalleterminoproformasEliminados= new ArrayList<DetalleTerminoProforma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessDetalleTerminoProforma();
		
				///*DetalleTerminoProformaSessionBean*/this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
			
			if(this.detalleterminoproformaSessionBean==null) {
				this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
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
					this.iNumeroPaginacion=DetalleTerminoProformaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=DetalleTerminoProformaConstantesFunciones.getClassesForeignKeysOfDetalleTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/detalleterminoproforma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			detalleterminoproformasAux= new ArrayList<DetalleTerminoProforma>();
			
				
			detalleterminoproformaLogic.setDatosCliente(this.datosCliente);
			detalleterminoproformaLogic.setDatosDeep(this.datosDeep);
			detalleterminoproformaLogic.setIsConDeep(true);
			
			
			detalleterminoproformaLogic.getDetalleTerminoProformaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					detalleterminoproformaLogic.getTodosDetalleTerminoProformas(finalQueryGlobal,pagination);
					
					//detalleterminoproformaLogic.getTodosDetalleTerminoProformasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(detalleterminoproformaLogic.getDetalleTerminoProformas()==null|| detalleterminoproformaLogic.getDetalleTerminoProformas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleterminoproformasAux= new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformasAux.addAll(detalleterminoproformaLogic.getDetalleTerminoProformas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformasAux= new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformasAux.addAll(detalleterminoproformas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleterminoproformaLogic.getTodosDetalleTerminoProformas(finalQueryGlobal+"",this.pagination);												
							
							//detalleterminoproformaLogic.getTodosDetalleTerminoProformasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformaLogic.getDetalleTerminoProformas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());					
							detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(detalleterminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformas=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformas.addAll(detalleterminoproformasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idDetalleTerminoProforma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idDetalleTerminoProforma=this.idActual;
				
				} else if(this.idDetalleTerminoProformaActual!=null && this.idDetalleTerminoProformaActual!=0L) {
					idDetalleTerminoProforma=idDetalleTerminoProformaActual;
				}
				
					
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndicePorId(idDetalleTerminoProforma);
				
				this.detalleterminoproformas=new ArrayList<DetalleTerminoProforma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					detalleterminoproformaLogic.getEntity(idDetalleTerminoProforma);
					
					//detalleterminoproformaLogic.getEntityWithConnection(idDetalleTerminoProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
					detalleterminoproformaLogic.getDetalleTerminoProformas().add(detalleterminoproformaLogic.getDetalleTerminoProforma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleterminoproformas=new ArrayList<DetalleTerminoProforma>();
					this.detalleterminoproformas.add(detalleterminoproforma);
				}
				
				if(detalleterminoproformaLogic.getDetalleTerminoProforma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleterminoproformaLogic.getDetalleTerminoProformas()==null||detalleterminoproformaLogic.getDetalleTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleterminoproformas==null|| detalleterminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
						detalleterminoproformasAux.addAll(detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformasAux.addAll(detalleterminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTerminoProformas("FK_IdEmpresa",detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTerminoProformas("FK_IdEmpresa",detalleterminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
						detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(detalleterminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformas=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformas.addAll(detalleterminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleterminoproformaLogic.getDetalleTerminoProformas()==null||detalleterminoproformaLogic.getDetalleTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleterminoproformas==null|| detalleterminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
						detalleterminoproformasAux.addAll(detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformasAux.addAll(detalleterminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTerminoProformas("FK_IdSucursal",detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTerminoProformas("FK_IdSucursal",detalleterminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
						detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(detalleterminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformas=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformas.addAll(detalleterminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdTerminoProforma")) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdTerminoProforma(id_termino_proformaFK_IdTerminoProforma);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdTerminoProforma(finalQueryGlobal,pagination,id_termino_proformaFK_IdTerminoProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdTerminoProforma(id_termino_proformaFK_IdTerminoProforma);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdTerminoProforma(id_termino_proformaFK_IdTerminoProforma);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=detalleterminoproformaLogic.getDetalleTerminoProformas()==null||detalleterminoproformaLogic.getDetalleTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=detalleterminoproformas==null|| detalleterminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
						detalleterminoproformasAux.addAll(detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformasAux=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformasAux.addAll(detalleterminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdTerminoProforma(finalQueryGlobal,pagination,id_termino_proformaFK_IdTerminoProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdTerminoProforma(id_termino_proformaFK_IdTerminoProforma);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=DetalleTerminoProformaConstantesFunciones.getDetalleIndiceFK_IdTerminoProforma(id_termino_proformaFK_IdTerminoProforma);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteDetalleTerminoProformas("FK_IdTerminoProforma",detalleterminoproformaLogic.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteDetalleTerminoProformas("FK_IdTerminoProforma",detalleterminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
						detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(detalleterminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformas=new ArrayList<DetalleTerminoProforma>();
							detalleterminoproformas.addAll(detalleterminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesDetalleTerminoProforma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessDetalleTerminoProforma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleterminoproformaLogic.getDetalleTerminoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleterminoproformas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=detalleterminoproformaLogic.getDetalleTerminoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=detalleterminoproformas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(DetalleTerminoProforma detalleterminoproforma) {
		Boolean permite=true;
		
		if(this.detalleterminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=DetalleTerminoProformaConstantesFunciones.getOrderByListaDetalleTerminoProforma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=DetalleTerminoProformaConstantesFunciones.getOrderByListaDetalleTerminoProforma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformaLogic.getDetalleTerminoProformas()) {
				if(detalleterminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					detalleterminoproformaTotales=detalleterminoproforma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTerminoProforma detalleterminoproforma:this.detalleterminoproformas) {
				if(detalleterminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					detalleterminoproformaTotales=detalleterminoproforma;
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
			this.detalleterminoproformaAux=new DetalleTerminoProforma();
			this.detalleterminoproformaAux.setsType(Constantes2.S_TOTALES);
			this.detalleterminoproformaAux.setIsNew(false);
			this.detalleterminoproformaAux.setIsChanged(false);
			this.detalleterminoproformaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				DetalleTerminoProformaConstantesFunciones.TotalizarValoresFilaDetalleTerminoProforma(this.detalleterminoproformaLogic.getDetalleTerminoProformas(),this.detalleterminoproformaAux);
				
				this.detalleterminoproformaLogic.getDetalleTerminoProformas().add(this.detalleterminoproformaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				DetalleTerminoProformaConstantesFunciones.TotalizarValoresFilaDetalleTerminoProforma(this.detalleterminoproformas,this.detalleterminoproformaAux);
				
				this.detalleterminoproformas.add(this.detalleterminoproformaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		detalleterminoproformaTotales=new DetalleTerminoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleterminoproformaLogic.getDetalleTerminoProformas().remove(detalleterminoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.detalleterminoproformas.remove(detalleterminoproformaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		detalleterminoproformaTotales=new DetalleTerminoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformaLogic.getDetalleTerminoProformas()) {
				if(detalleterminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					detalleterminoproformaTotales=detalleterminoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleTerminoProformaConstantesFunciones.TotalizarValoresFilaDetalleTerminoProforma(this.detalleterminoproformaLogic.getDetalleTerminoProformas(),detalleterminoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(DetalleTerminoProforma detalleterminoproforma:this.detalleterminoproformas) {
				if(detalleterminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					detalleterminoproformaTotales=detalleterminoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				DetalleTerminoProformaConstantesFunciones.TotalizarValoresFilaDetalleTerminoProforma(this.detalleterminoproformas,detalleterminoproformaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getDetalleTerminoProformasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTerminoProformasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getDetalleTerminoProformasFK_IdTerminoProforma()throws Exception {
		try {
			sAccionBusqueda="FK_IdTerminoProforma";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getDetalleTerminoProformasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTerminoProformasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getDetalleTerminoProformasFK_IdTerminoProforma(String sFinalQuery,Long id_termino_proforma)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleterminoproformaLogic.getDetalleTerminoProformasFK_IdTerminoProforma(sFinalQuery,this.pagination,id_termino_proforma);
				
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
	
	public void inicializarPermisosDetalleTerminoProforma() {
		this.isPermisoTodoDetalleTerminoProforma=false;
		this.isPermisoNuevoDetalleTerminoProforma=false;
		this.isPermisoActualizarDetalleTerminoProforma=false;
		this.isPermisoActualizarOriginalDetalleTerminoProforma=false;
		this.isPermisoEliminarDetalleTerminoProforma=false;
		this.isPermisoGuardarCambiosDetalleTerminoProforma=false;
		this.isPermisoConsultaDetalleTerminoProforma=false;
		this.isPermisoBusquedaDetalleTerminoProforma=false;
		this.isPermisoReporteDetalleTerminoProforma=false;		
		this.isPermisoOrdenDetalleTerminoProforma=false;		
		this.isPermisoPaginacionMedioDetalleTerminoProforma=false;		
		this.isPermisoPaginacionAltoDetalleTerminoProforma=false;
		this.isPermisoPaginacionTodoDetalleTerminoProforma=false;
		this.isPermisoCopiarDetalleTerminoProforma=false;		
		this.isPermisoVerFormDetalleTerminoProforma=false;		
		this.isPermisoDuplicarDetalleTerminoProforma=false;		
		this.isPermisoOrdenDetalleTerminoProforma=false;		
	}
	
	public void setPermisosUsuarioDetalleTerminoProforma(Boolean isPermiso) {
		this.isPermisoTodoDetalleTerminoProforma=isPermiso;
		this.isPermisoNuevoDetalleTerminoProforma=isPermiso;
		this.isPermisoActualizarDetalleTerminoProforma=isPermiso;
		this.isPermisoActualizarOriginalDetalleTerminoProforma=isPermiso;
		this.isPermisoEliminarDetalleTerminoProforma=isPermiso;
		this.isPermisoGuardarCambiosDetalleTerminoProforma=isPermiso;
		this.isPermisoConsultaDetalleTerminoProforma=isPermiso;
		this.isPermisoBusquedaDetalleTerminoProforma=isPermiso;
		this.isPermisoReporteDetalleTerminoProforma=isPermiso;
		this.isPermisoOrdenDetalleTerminoProforma=isPermiso;		
		this.isPermisoPaginacionMedioDetalleTerminoProforma=isPermiso;		
		this.isPermisoPaginacionAltoDetalleTerminoProforma=isPermiso;		
		this.isPermisoPaginacionTodoDetalleTerminoProforma=isPermiso;		
		this.isPermisoCopiarDetalleTerminoProforma=isPermiso;		
		this.isPermisoVerFormDetalleTerminoProforma=isPermiso;		
		this.isPermisoDuplicarDetalleTerminoProforma=isPermiso;
		this.isPermisoOrdenDetalleTerminoProforma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioDetalleTerminoProforma(Boolean isPermiso) {
		//this.isPermisoTodoDetalleTerminoProforma=isPermiso;
		this.isPermisoNuevoDetalleTerminoProforma=isPermiso;
		this.isPermisoActualizarDetalleTerminoProforma=isPermiso;
		this.isPermisoActualizarOriginalDetalleTerminoProforma=isPermiso;
		this.isPermisoEliminarDetalleTerminoProforma=isPermiso;
		this.isPermisoGuardarCambiosDetalleTerminoProforma=isPermiso;
		//this.isPermisoConsultaDetalleTerminoProforma=isPermiso;
		//this.isPermisoBusquedaDetalleTerminoProforma=isPermiso;
		//this.isPermisoReporteDetalleTerminoProforma=isPermiso;
		//this.isPermisoOrdenDetalleTerminoProforma=isPermiso;		
		//this.isPermisoPaginacionMedioDetalleTerminoProforma=isPermiso;		
		//this.isPermisoPaginacionAltoDetalleTerminoProforma=isPermiso;		
		//this.isPermisoPaginacionTodoDetalleTerminoProforma=isPermiso;		
		//this.isPermisoCopiarDetalleTerminoProforma=isPermiso;		
		//this.isPermisoDuplicarDetalleTerminoProforma=isPermiso;
		//this.isPermisoOrdenDetalleTerminoProforma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioDetalleTerminoProformaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(DetalleTerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebDetalleTerminoProforma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioDetalleTerminoProformaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioDetalleTerminoProformaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionDetalleTerminoProformaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioDetalleTerminoProformaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioDetalleTerminoProforma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(DetalleTerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, DetalleTerminoProformaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoDetalleTerminoProforma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarDetalleTerminoProforma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalDetalleTerminoProforma=this.isPermisoActualizarDetalleTerminoProforma;
			this.isPermisoEliminarDetalleTerminoProforma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosDetalleTerminoProforma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaDetalleTerminoProforma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaDetalleTerminoProforma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoDetalleTerminoProforma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteDetalleTerminoProforma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleTerminoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioDetalleTerminoProforma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoDetalleTerminoProforma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoDetalleTerminoProforma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarDetalleTerminoProforma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormDetalleTerminoProforma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarDetalleTerminoProforma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenDetalleTerminoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosDetalleTerminoProforma.setToolTipText(this.jTableDatosDetalleTerminoProforma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioDetalleTerminoProforma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioDetalleTerminoProforma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(DetalleTerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(DetalleTerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioDetalleTerminoProforma() throws Exception {
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
	public void inicializarCombosForeignKeyDetalleTerminoProformaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.terminoproformasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyDetalleTerminoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(DetalleTerminoProformaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyDetalleTerminoProformaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyTerminoProformaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyTerminoProformaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.terminoproformasForeignKey==null||this.terminoproformasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=TerminoProformaConstantesFunciones.getArrayColumnasGlobalesTerminoProforma(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TerminoProformaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=TerminoProformaConstantesFunciones.SFINALQUERY;

				this.cargarCombosTerminoProformasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyDetalleTerminoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaReturnGeneral=new DetalleTerminoProformaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.detalleterminoproformaConstantesFunciones.cargarid_empresaDetalleTerminoProforma)
					 || (this.esRecargarFks && this.detalleterminoproformaConstantesFunciones.cargarid_empresaDetalleTerminoProforma)) {

					if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+detalleterminoproformaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.detalleterminoproformaConstantesFunciones.cargarid_sucursalDetalleTerminoProforma)
					 || (this.esRecargarFks && this.detalleterminoproformaConstantesFunciones.cargarid_sucursalDetalleTerminoProforma)) {

					if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+detalleterminoproformaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalTerminoProforma="";

				if(((this.terminoproformasForeignKey==null||this.terminoproformasForeignKey.size()<=0) && this.detalleterminoproformaConstantesFunciones.cargarid_termino_proformaDetalleTerminoProforma)
					 || (this.esRecargarFks && this.detalleterminoproformaConstantesFunciones.cargarid_termino_proformaDetalleTerminoProforma)) {

					if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionTerminoProforma()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=TerminoProformaConstantesFunciones.getArrayColumnasGlobalesTerminoProforma(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalTerminoProforma=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,TerminoProformaConstantesFunciones.TABLENAME);

						finalQueryGlobalTerminoProforma=Funciones.GetFinalQueryAppend(finalQueryGlobalTerminoProforma, "");
						finalQueryGlobalTerminoProforma+=TerminoProformaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosTerminoProformasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalTerminoProforma=" WHERE " + ConstantesSql.ID + "="+detalleterminoproformaSessionBean.getlidTerminoProformaActual();
					}
				} else {
					finalQueryGlobalTerminoProforma="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				detalleterminoproformaReturnGeneral=detalleterminoproformaLogic.cargarCombosLoteForeignKeyDetalleTerminoProforma(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalTerminoProforma);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=detalleterminoproformaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=detalleterminoproformaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalTerminoProforma.equals("NONE")) {
				this.terminoproformasForeignKey=detalleterminoproformaReturnGeneral.getterminoproformasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyDetalleTerminoProforma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyTerminoProforma();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.detalleterminoproformaSessionBean==null) {
				this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
			}

			if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyTerminoProforma()throws Exception {
		try {

			if(!this.detalleterminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionTerminoProforma()) {
				TerminoProforma terminoproforma=new TerminoProforma();
				TerminoProformaConstantesFunciones.setTerminoProformaDescripcion(terminoproforma,Constantes.SMENSAJE_ESCOJA_OPCION);
				terminoproforma.setId(null);

				if(!TerminoProformaConstantesFunciones.ExisteEnLista(this.terminoproformasForeignKey,terminoproforma,true)) {

					this.terminoproformasForeignKey.add(0,terminoproforma);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyDetalleTerminoProforma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyDetalleTerminoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyDetalleTerminoProforma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleTerminoProforma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma)throws Exception {	
		try {
			
			this.setActualTerminoProformaForeignKey(detalleterminoproforma.getid_termino_proforma(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyDetalleTerminoProforma()throws Exception {	
		try {
			
			this.setActualTerminoProformaForeignKey(this.detalleterminoproformaConstantesFunciones.getid_termino_proforma(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyDetalleTerminoProforma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyDetalleTerminoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyDetalleTerminoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroDetalleTerminoProforma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyDetalleTerminoProforma()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameTerminoProformasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyDetalleTerminoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameTerminoProformasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyDetalleTerminoProforma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public DetalleTerminoProformaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public DetalleTerminoProformaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public DetalleTerminoProformaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean(); 
		this.detalleterminoproformaConstantesFunciones=new DetalleTerminoProformaConstantesFunciones(); 
		this.detalleterminoproformaBean=new DetalleTerminoProforma();//(this.detalleterminoproformaConstantesFunciones); 		
		this.detalleterminoproformaReturnGeneral=new DetalleTerminoProformaParameterReturnGeneral(); 
		
		this.detalleterminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public DetalleTerminoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public DetalleTerminoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public DetalleTerminoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessDetalleTerminoProforma(true);
			
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
			
			this.detalleterminoproformaConstantesFunciones=new DetalleTerminoProformaConstantesFunciones(); 
			this.detalleterminoproformaBean=new DetalleTerminoProforma();//this.detalleterminoproformaConstantesFunciones); 			
			this.detalleterminoproformaReturnGeneral=new DetalleTerminoProformaParameterReturnGeneral(); 
		
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Detalle Termino Proforma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.detalleterminoproforma=new DetalleTerminoProforma();
			this.detalleterminoproformas = new ArrayList<DetalleTerminoProforma>();
			this.detalleterminoproformasAux = new ArrayList<DetalleTerminoProforma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic=new DetalleTerminoProformaLogic();
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.detalleterminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.detalleterminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormDetalleTerminoProforma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleTerminoProforma);	
					}
					
					if(this.jInternalFrameImportacionDetalleTerminoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleTerminoProforma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByDetalleTerminoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByDetalleTerminoProforma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleTerminoProforma);
				this.jInternalFrameDetalleFormDetalleTerminoProforma.setVisible(false);
				this.jInternalFrameDetalleFormDetalleTerminoProforma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleTerminoProforma);
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setVisible(false);
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionDetalleTerminoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionDetalleTerminoProforma);
					this.jInternalFrameImportacionDetalleTerminoProforma.setVisible(false);
					this.jInternalFrameImportacionDetalleTerminoProforma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByDetalleTerminoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByDetalleTerminoProforma);
					this.jInternalFrameOrderByDetalleTerminoProforma.setVisible(false);
					this.jInternalFrameOrderByDetalleTerminoProforma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idDetalleTerminoProformaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=DetalleTerminoProformaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.detalleterminoproformaReturnGeneral=new DetalleTerminoProformaParameterReturnGeneral();
			
			this.detalleterminoproformaParameterGeneral=new DetalleTerminoProformaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.detalleterminoproformaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(DetalleTerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleTerminoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado(),this.detalleterminoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,DetalleTerminoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado(),this.detalleterminoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaDuplicarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaCopiarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaVerFormDetalleTerminoProforma=true;
			this.isVisibilidadCeldaOrdenDetalleTerminoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdSucursal=true;
			this.isVisibilidadFK_IdTerminoProforma=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosDetalleTerminoProforma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioDetalleTerminoProforma(false);
			
			this.setPermisosUsuarioDetalleTerminoProforma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() 
				|| (this.detalleterminoproformaSessionBean.getEsGuardarRelacionado() && this.detalleterminoproformaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioDetalleTerminoProformaClasesRelacionadas();
			}
			
			if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioDetalleTerminoProformaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosDetalleTerminoProforma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualDetalleTerminoProforma();
			}
			
			if(!this.isPermisoBusquedaDetalleTerminoProforma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioDetalleTerminoProforma,this.isPermisoPaginacionMedioDetalleTerminoProforma,this.isPermisoPaginacionTodoDetalleTerminoProforma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(DetalleTerminoProformaConstantesFunciones.getTiposSeleccionarDetalleTerminoProforma());
				
				this.tiposColumnasSelect=DetalleTerminoProformaConstantesFunciones.getTiposSeleccionarDetalleTerminoProforma(true);
				
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
			//if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioDetalleTerminoProforma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioDetalleTerminoProforma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioDetalleTerminoProforma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTerminoProforma() ;
			
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
			this.terminoproformaLogic=new TerminoProformaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				detalleterminoproformaImplementable= (DetalleTerminoProformaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleTerminoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				detalleterminoproformaImplementableHome= (DetalleTerminoProformaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+DetalleTerminoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.detalleterminoproformas= new ArrayList<DetalleTerminoProforma>();
			this.detalleterminoproformasEliminados= new ArrayList<DetalleTerminoProforma>();
						
			this.isEsNuevoDetalleTerminoProforma=false;
			this.esParaAccionDesdeFormularioDetalleTerminoProforma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.terminoproformasForeignKey=new ArrayList<TerminoProforma>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyDetalleTerminoProforma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroDetalleTerminoProforma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=DetalleTerminoProformaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingDetalleTerminoProforma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioDetalleTerminoProforma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioDetalleTerminoProforma();
			}
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasDetalleTerminoProforma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasDetalleTerminoProforma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasDetalleTerminoProforma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessDetalleTerminoProforma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga DetalleTerminoProforma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectDetalleTerminoProforma() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesDetalleTerminoProforma")) {
				iIndex=this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessDetalleTerminoProforma();	
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
	
	public void cargarCombosForeignKeyDetalleTerminoProforma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyDetalleTerminoProforma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyDetalleTerminoProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyDetalleTerminoProformaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyDetalleTerminoProforma();
		
		this.cargarCombosFrameForeignKeyDetalleTerminoProforma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyDetalleTerminoProforma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyDetalleTerminoProforma();
		}
	}
	
	

	public void cargarCombosForeignKeyTerminoProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyTerminoProformaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyTerminoProforma();
				this.cargarCombosFrameTerminoProformasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaTerminoProforma(this.terminoproformasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoDetalleTerminoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			
			if(jTableDatosDetalleTerminoProforma.getRowCount()>=1) {
				jTableDatosDetalleTerminoProforma.removeRowSelectionInterval(0, jTableDatosDetalleTerminoProforma.getRowCount()-1);						
			}
			
			this.isEsNuevoDetalleTerminoProforma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoDetalleTerminoProforma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesDetalleTerminoProforma(true);			
			//this.detalleterminoproforma=new DetalleTerminoProforma();
			//this.detalleterminoproforma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma() ;
			
			if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleTerminoProforma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.detalleterminoproforma);	
			this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);				
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar DetalleTerminoProforma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarDetalleTerminoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosDetalleTerminoProforma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosDetalleTerminoProforma.getSelectedRows().length;			
			}
			
			detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoDetalleTerminoProforma--;			
				//DetalleTerminoProforma detalleterminoproformaAux= new DetalleTerminoProforma();			
				//detalleterminoproformaAux.setId(this.iIdNuevoDetalleTerminoProforma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//DetalleTerminoProforma detalleterminoproformaOrigen=new DetalleTerminoProforma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(DetalleTerminoProforma detalleterminoproformaOrigen : detalleterminoproformasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							detalleterminoproformaOrigen =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							detalleterminoproformaOrigen =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaDetalleTerminoProforma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.detalleterminoproforma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosDetalleTerminoProforma(detalleterminoproformaOrigen,this.detalleterminoproforma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleterminoproformaLogic.getDetalleTerminoProformas().add(this.detalleterminoproformaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleterminoproformas.add(this.detalleterminoproformaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
				
				this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoDetalleTerminoProforma(), this.getIndiceNuevoDetalleTerminoProforma());
				
				int iLastRow =  this.jTableDatosDetalleTerminoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleTerminoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleTerminoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();									
		
			DetalleTerminoProforma detalleterminoproformaOrigen=new DetalleTerminoProforma();
			DetalleTerminoProforma detalleterminoproformaDestino=new DetalleTerminoProforma();
				
			detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosDetalleTerminoProforma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || detalleterminoproformasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosDetalleTerminoProforma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaOrigen =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleterminoproformaOrigen =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						detalleterminoproformaDestino =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						detalleterminoproformaDestino =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				detalleterminoproformaOrigen =detalleterminoproformasSeleccionados.get(0);
				detalleterminoproformaDestino =detalleterminoproformasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosDetalleTerminoProforma(detalleterminoproformaOrigen,detalleterminoproformaDestino,true,false);
				
				detalleterminoproformaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(detalleterminoproformaDestino,detalleterminoproformaLogic.getDetalleTerminoProformas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(detalleterminoproformaDestino,detalleterminoproformas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
				
				//this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoDetalleTerminoProforma(), this.getIndiceNuevoDetalleTerminoProforma());
				
				int iLastRow =  this.jTableDatosDetalleTerminoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosDetalleTerminoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosDetalleTerminoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesDetalleTerminoProforma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(!isVisible);
			this.jPanelPaginacionDetalleTerminoProforma.setVisible(!isVisible);
			this.jPanelAccionesDetalleTerminoProforma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameDetalleTerminoProforma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoDetalleTerminoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionDetalleTerminoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByDetalleTerminoProforma();
			
			this.abrirFrameOrderByDetalleTerminoProforma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByDetalleTerminoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleDetalleTerminoProforma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleTerminoProforma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormDetalleTerminoProforma.isMaximum()) {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormDetalleTerminoProforma.setSize(this.jInternalFrameDetalleFormDetalleTerminoProforma.iWidthFormulario,this.jInternalFrameDetalleFormDetalleTerminoProforma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormDetalleTerminoProforma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormDetalleTerminoProforma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormDetalleTerminoProforma.isMaximum()) {
						this.jInternalFrameDetalleFormDetalleTerminoProforma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jContentPaneDetalleDetalleTerminoProforma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormDetalleTerminoProforma.jContentPaneDetalleDetalleTerminoProforma.getWidth(),DetalleTerminoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormDetalleTerminoProforma.jContentPaneDetalleDetalleTerminoProforma.getWidth(),DetalleTerminoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormDetalleTerminoProforma.jContentPaneDetalleDetalleTerminoProforma.getWidth(),DetalleTerminoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormDetalleTerminoProforma.setVisible(true);
	        this.jInternalFrameDetalleFormDetalleTerminoProforma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByDetalleTerminoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByDetalleTerminoProforma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByDetalleTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTerminoProforma,false,this);
				} else {
					this.jInternalFrameOrderByDetalleTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByDetalleTerminoProforma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByDetalleTerminoProforma);
				this.jInternalFrameOrderByDetalleTerminoProforma.setVisible(false);
				this.jInternalFrameOrderByDetalleTerminoProforma.setSelected(false);
				
				this.jInternalFrameOrderByDetalleTerminoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleTerminoProforma"));
				
				this.inicializarActualizarBindingTablaOrderByDetalleTerminoProforma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionDetalleTerminoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionDetalleTerminoProforma==null) {
				
				this.jInternalFrameImportacionDetalleTerminoProforma=new ImportacionJInternalFrame(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionDetalleTerminoProforma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionDetalleTerminoProforma);
				this.jInternalFrameImportacionDetalleTerminoProforma.setVisible(false);
				this.jInternalFrameImportacionDetalleTerminoProforma.setSelected(false);


				this.jInternalFrameImportacionDetalleTerminoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleTerminoProforma"));
				this.jInternalFrameImportacionDetalleTerminoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleTerminoProforma"));
				this.jInternalFrameImportacionDetalleTerminoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleTerminoProforma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoDetalleTerminoProforma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma==null) {
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma=new ReporteDinamicoJInternalFrame(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoDetalleTerminoProforma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoDetalleTerminoProforma);
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setVisible(false);
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleTerminoProforma"));
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleTerminoProforma"));
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleTerminoProforma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleTerminoProforma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleDetalleTerminoProforma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormDetalleTerminoProforma);
			
	       	this.jInternalFrameDetalleFormDetalleTerminoProforma.setVisible(false);
	        this.jInternalFrameDetalleFormDetalleTerminoProforma.setSelected(false);
			
			//this.jInternalFrameDetalleFormDetalleTerminoProforma.dispose();
			//this.jInternalFrameDetalleFormDetalleTerminoProforma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoDetalleTerminoProforma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setVisible(true);
	        this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionDetalleTerminoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionDetalleTerminoProforma.setVisible(true);
	        this.jInternalFrameImportacionDetalleTerminoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByDetalleTerminoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByDetalleTerminoProforma.setVisible(true);
	        this.jInternalFrameOrderByDetalleTerminoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByDetalleTerminoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByDetalleTerminoProforma.setVisible(false);
	        this.jInternalFrameOrderByDetalleTerminoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoDetalleTerminoProforma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setVisible(false);
	        this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionDetalleTerminoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionDetalleTerminoProforma.setVisible(false);
	        this.jInternalFrameImportacionDetalleTerminoProforma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarDetalleTerminoProforma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarDetalleTerminoProforma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesDetalleTerminoProforma(true);
			//this.isEsNuevoDetalleTerminoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false) ;
			
			if(detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleTerminoProforma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaDetalleTerminoProformaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarDetalleTerminoProforma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesDetalleTerminoProforma(true);
			//this.isEsNuevoDetalleTerminoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.detalleterminoproforma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false) ;
			
			if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleDetalleTerminoProforma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
			
	
	public void recargarComboTablaTerminoProforma(List<TerminoProforma> terminoproformasForeignKey)throws Exception{
		TableColumn tableColumnTerminoProforma=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA));
		TableCellEditor tableCellEditorTerminoProforma =tableColumnTerminoProforma.getCellEditor();

		TerminoProformaTableCell terminoproformaTableCellFk=(TerminoProformaTableCell)tableCellEditorTerminoProforma;

		if(terminoproformaTableCellFk!=null) {
			terminoproformaTableCellFk.setterminoproformasForeignKey(terminoproformasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosDetalleTerminoProforma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//terminoproformaTableCellFk.setRowActual(intSelectedRow);
			//terminoproformaTableCellFk.setterminoproformasForeignKeyActual(terminoproformasForeignKey);
		//}


		if(terminoproformaTableCellFk!=null) {
			terminoproformaTableCellFk.RecargarTerminoProformasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesDetalleTerminoProforma(false);
			
			//if(!this.isEsNuevoDetalleTerminoProforma) {								
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				
			}
			
			if(this.permiteMantenimiento(this.detalleterminoproforma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoDetalleTerminoProforma=true;
					this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
					this.isEsNuevoDetalleTerminoProforma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoDetalleTerminoProforma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoDetalleTerminoProforma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(false);
				
				this.habilitarDeshabilitarControlesDetalleTerminoProforma(false);
			
												
				
				if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleDetalleTerminoProforma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoDetalleTerminoProformaActionPerformed(evt,detalleterminoproformaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualDetalleTerminoProforma(this.detalleterminoproforma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,detalleterminoproformaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.detalleterminoproforma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				this.detalleterminoproforma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				this.detalleterminoproforma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.detalleterminoproforma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((DetalleTerminoProformaModel) this.jTableDatosDetalleTerminoProforma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoDetalleTerminoProforma=true;
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
				this.isEsNuevoDetalleTerminoProforma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(false);
				
				this.habilitarDeshabilitarControlesDetalleTerminoProforma(false);
				
				
				
				if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleDetalleTerminoProforma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosDetalleTerminoProforma.getRowCount()>=1) {
				jTableDatosDetalleTerminoProforma.removeRowSelectionInterval(0, jTableDatosDetalleTerminoProforma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesDetalleTerminoProforma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(false) ;
			
			this.isEsNuevoDetalleTerminoProforma=false;
			
			if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleDetalleTerminoProforma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingDetalleTerminoProforma(false);
				
				//SI ES MANUAL
				if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualDetalleTerminoProforma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoDetalleTerminoProforma--;			
			//DetalleTerminoProforma detalleterminoproformaAux= new DetalleTerminoProforma();			
			//detalleterminoproformaAux.setId(this.iIdNuevoDetalleTerminoProforma);
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaDetalleTerminoProforma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
			
			this.detalleterminoproforma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.detalleterminoproformaLogic.getDetalleTerminoProformas().add(this.detalleterminoproformaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.detalleterminoproformas.add(this.detalleterminoproformaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			
			this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoDetalleTerminoProforma(), this.getIndiceNuevoDetalleTerminoProforma());
			
			int iLastRow =  this.jTableDatosDetalleTerminoProforma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosDetalleTerminoProforma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosDetalleTerminoProforma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
			
			//SI ES MANUAL
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleTerminoProforma();
			}
			
			//this.abrirFrameTreeDetalleTerminoProforma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Detalle Termino ProformaS ?", "MANTENIMIENTO DE Detalle Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionDetalleTerminoProforma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralDetalleTerminoProforma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.detalleterminoproformaReturnGeneral=detalleterminoproformaLogic.procesarImportacionDetalleTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.detalleterminoproformaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarDetalleTerminoProformaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionDetalleTerminoProforma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionDetalleTerminoProforma.setFileImportacion(this.jInternalFrameImportacionDetalleTerminoProforma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionDetalleTerminoProforma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionDetalleTerminoProforma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionDetalleTerminoProforma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionDetalleTerminoProforma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		

		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("DetalleTerminoProformaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"DetalleTerminoProformaBaseDesign.jrxml";
			
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
			
			this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_TerminoProforma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_TerminoProforma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_TerminoProforma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_TerminoProforma_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mero_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mero_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mero_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mero_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talle_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talle_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talle_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talle_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA:
					sNombreCampoCategoria="id_termino_proforma";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoria="numero";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoria="detalle";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA:
					sNombreCampoCategoriaValor="id_termino_proforma";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO:
					sNombreCampoCategoriaValor="numero";
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE:
					sNombreCampoCategoriaValor="detalle";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Termino Proforma",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_termino_proforma");
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero");
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Detalle",sNombreCampoCategoria,sNombreCampoCategoriaValor,"detalle");
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
	
	public void jButtonGenerarExcelReporteDinamicoDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("DetalleTerminoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleterminoproforma.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleterminoproforma.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA);
					iRow++;

					for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleterminoproforma.getterminoproforma_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO);
					iRow++;

					for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleterminoproforma.getnumero());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE);
					iRow++;

					for(DetalleTerminoProforma detalleterminoproforma:detalleterminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(detalleterminoproforma.getdetalle());
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
			//	this.getFilaCabeceraExportarExcelDetalleTerminoProforma(row);				
			//	iRow++;
			//}				
			
			//for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelDetalleTerminoProforma(detalleterminoproformaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
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
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
			
			//SI ES MANUAL
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualDetalleTerminoProforma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
			
			//SI ES MANUAL
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleTerminoProforma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
			
			//SI ES MANUAL
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualDetalleTerminoProforma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaDetalleTerminoProforma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosDetalleTerminoProforma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosDetalleTerminoProforma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosDetalleTerminoProforma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosDetalleTerminoProforma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosDetalleTerminoProforma.setMinimumSize(dimensionMinimum);
		this.jTableDatosDetalleTerminoProforma.setMaximumSize(dimensionMaximum);
		this.jTableDatosDetalleTerminoProforma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingDetalleTerminoProforma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingDetalleTerminoProforma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingDetalleTerminoProforma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaDetalleTerminoProforma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesDetalleTerminoProforma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasDetalleTerminoProforma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTerminoProforma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesDetalleTerminoProforma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualDetalleTerminoProforma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaDetalleTerminoProforma();
		
		this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleTerminoProforma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTerminoProforma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleTerminoProforma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleTerminoProforma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosDetalleTerminoProforma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteDetalleTerminoProforma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormDetalleTerminoProforma.jCheckBoxPostAccionNuevoDetalleTerminoProforma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormDetalleTerminoProforma.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormDetalleTerminoProforma.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosDetalleTerminoProforma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteDetalleTerminoProforma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jCheckBoxPostAccionNuevoDetalleTerminoProforma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jCheckBoxPostAccionSinCerrarDetalleTerminoProforma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jCheckBoxPostAccionSinMensajeDetalleTerminoProforma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionDetalleTerminoProforma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionDetalleTerminoProforma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesDetalleTerminoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesDetalleTerminoProforma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarDetalleTerminoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesDetalleTerminoProforma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralDetalleTerminoProforma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesDetalleTerminoProforma(Boolean esInicializar) throws Exception {
		try	{	
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualDetalleTerminoProforma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesDetalleTerminoProforma() throws Exception {
		try	{
			if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleTerminoProforma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleTerminoProforma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualDetalleTerminoProforma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesDetalleTerminoProforma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesDetalleTerminoProforma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesDetalleTerminoProforma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionDetalleTerminoProforma.addItem(reporte);
			}
			
			
			if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionDetalleTerminoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionDetalleTerminoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesDetalleTerminoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesDetalleTerminoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarDetalleTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarDetalleTerminoProforma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarDetalleTerminoProforma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleTerminoProforma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualDetalleTerminoProforma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
				
				if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualDetalleTerminoProforma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.getSelectedItem()!=null){this.id_termino_proformaFK_IdTerminoProforma=((TerminoProforma)this.jComboBoxid_termino_proformaFK_IdTerminoProformaDetalleTerminoProforma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasDetalleTerminoProforma(Boolean esInicializar) throws Exception {				
		if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualDetalleTerminoProforma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaDetalleTerminoProforma() throws Exception {
		this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByDetalleTerminoProforma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosDetalleTerminoProformaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProformaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaDetalleTerminoProforma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=detalleterminoproformaLogic.getDetalleTerminoProformas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=detalleterminoproformas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosDetalleTerminoProforma.setModel(new DetalleTerminoProformaModel(this.detalleterminoproformaLogic.getDetalleTerminoProformas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosDetalleTerminoProforma.setModel(new DetalleTerminoProformaModel(this.detalleterminoproformas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByDetalleTerminoProforma!=null && this.jInternalFrameOrderByDetalleTerminoProforma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByDetalleTerminoProforma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO,detalleterminoproformaConstantesFunciones.resaltarSeleccionarDetalleTerminoProforma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO,detalleterminoproformaConstantesFunciones.resaltarSeleccionarDetalleTerminoProforma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_ID));

		if(this.detalleterminoproformaConstantesFunciones.mostraridDetalleTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTerminoProformaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleterminoproformaConstantesFunciones.resaltaridDetalleTerminoProforma,this.detalleterminoproformaConstantesFunciones.activaridDetalleTerminoProforma,this,true,"idDetalleTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleterminoproformaConstantesFunciones.resaltaridDetalleTerminoProforma,this.detalleterminoproformaConstantesFunciones.activaridDetalleTerminoProforma,this,true,"idDetalleTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.detalleterminoproformaConstantesFunciones.mostrarid_empresaDetalleTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.detalleterminoproformaConstantesFunciones.resaltarid_empresaDetalleTerminoProforma,this,this.detalleterminoproformaConstantesFunciones.activarid_empresaDetalleTerminoProforma));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.detalleterminoproformaConstantesFunciones.resaltarid_empresaDetalleTerminoProforma,this,this.detalleterminoproformaConstantesFunciones.activarid_empresaDetalleTerminoProforma,false,"id_empresaDetalleTerminoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.detalleterminoproformaConstantesFunciones.mostrarid_sucursalDetalleTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.detalleterminoproformaConstantesFunciones.resaltarid_sucursalDetalleTerminoProforma,this,this.detalleterminoproformaConstantesFunciones.activarid_sucursalDetalleTerminoProforma));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.detalleterminoproformaConstantesFunciones.resaltarid_sucursalDetalleTerminoProforma,this,this.detalleterminoproformaConstantesFunciones.activarid_sucursalDetalleTerminoProforma,false,"id_sucursalDetalleTerminoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA));

		if(this.detalleterminoproformaConstantesFunciones.mostrarid_termino_proformaDetalleTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new TerminoProformaTableCell(this.terminoproformasForeignKey,this.detalleterminoproformaConstantesFunciones.resaltarid_termino_proformaDetalleTerminoProforma,this,this.detalleterminoproformaConstantesFunciones.activarid_termino_proformaDetalleTerminoProforma));
			tableColumn.setCellEditor(new TerminoProformaTableCell(this.terminoproformasForeignKey,this.detalleterminoproformaConstantesFunciones.resaltarid_termino_proformaDetalleTerminoProforma,this,this.detalleterminoproformaConstantesFunciones.activarid_termino_proformaDetalleTerminoProforma,true,"id_termino_proformaDetalleTerminoProforma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO));

		if(this.detalleterminoproformaConstantesFunciones.mostrarnumeroDetalleTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.detalleterminoproformaConstantesFunciones.resaltarnumeroDetalleTerminoProforma,this.detalleterminoproformaConstantesFunciones.activarnumeroDetalleTerminoProforma,this,true,"numeroDetalleTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleterminoproformaConstantesFunciones.resaltarnumeroDetalleTerminoProforma,this.detalleterminoproformaConstantesFunciones.activarnumeroDetalleTerminoProforma,this,true,"numeroDetalleTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE));

		if(this.detalleterminoproformaConstantesFunciones.mostrardetalleDetalleTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.detalleterminoproformaConstantesFunciones.resaltardetalleDetalleTerminoProforma,this.detalleterminoproformaConstantesFunciones.activardetalleDetalleTerminoProforma,this,true,"detalleDetalleTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.detalleterminoproformaConstantesFunciones.resaltardetalleDetalleTerminoProforma,this.detalleterminoproformaConstantesFunciones.activardetalleDetalleTerminoProforma,this,true,"detalleDetalleTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new DetalleTerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleTerminoProforma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosDetalleTerminoProforma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosDetalleTerminoProforma.addColumn(tableColumn);
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
			
			this.jTableDatosDetalleTerminoProforma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosDetalleTerminoProforma.moveColumn(this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosDetalleTerminoProforma.moveColumn(this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosDetalleTerminoProforma.moveColumn(this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosDetalleTerminoProforma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosDetalleTerminoProforma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosDetalleTerminoProforma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosDetalleTerminoProforma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosDetalleTerminoProforma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosDetalleTerminoProforma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=detalleterminoproformaLogic.getDetalleTerminoProformas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=detalleterminoproformas.size()-1;
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
		//this.jTableDatosDetalleTerminoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosDetalleTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosDetalleTerminoProforma();
			
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
				
				//this.isEsNuevoDetalleTerminoProforma=false;
					
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
				if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleTerminoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleTerminoProforma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.detalleterminoproforma.getsType().equals("DUPLICADO")
				   || this.detalleterminoproforma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoDetalleTerminoProforma=true;
				
				} else {
					this.isEsNuevoDetalleTerminoProforma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
					if(this.detalleterminoproforma.getId()>=0 && !this.detalleterminoproforma.getIsNew()) {						
						this.isEsNuevoDetalleTerminoProforma=false;
						
					} else {
						this.isEsNuevoDetalleTerminoProforma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoDetalleTerminoProforma(esRelaciones);						
				
				this.seleccionarDetalleTerminoProforma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.detalleterminoproforma.getId()<0) {
					this.isEsNuevoDetalleTerminoProforma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarDetalleTerminoProforma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarDetalleTerminoProforma(evt,rowIndex);
				}	
				
				if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion DetalleTerminoProforma: " + this.dDif); 
					}
				}								
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarDetalleTerminoProforma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.detalleterminoproforma)) {
					if(this.detalleterminoproforma.getId()>0) {
						this.detalleterminoproforma.setIsDeleted(true);
						
						this.detalleterminoproformasEliminados.add(this.detalleterminoproforma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.detalleterminoproformaLogic.getDetalleTerminoProformas().remove(this.detalleterminoproforma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.detalleterminoproformas.remove(this.detalleterminoproforma);				
					}
					
					
					((DetalleTerminoProformaModel) this.jTableDatosDetalleTerminoProforma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarDetalleTerminoProforma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoDetalleTerminoProforma) {
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosDetalleTerminoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosDetalleTerminoProforma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproforma);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.detalleterminoproformaConstantesFunciones.cargarid_empresaDetalleTerminoProforma || this.detalleterminoproformaConstantesFunciones.event_dependid_empresaDetalleTerminoProforma) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.detalleterminoproforma.getid_empresa());
									//this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(detalleterminoproforma.getEmpresa()!=null) {
							this.empresasForeignKey.add(detalleterminoproforma.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.detalleterminoproforma.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.detalleterminoproformaConstantesFunciones.cargarid_sucursalDetalleTerminoProforma || this.detalleterminoproformaConstantesFunciones.event_dependid_sucursalDetalleTerminoProforma) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.detalleterminoproforma.getid_sucursal());
									//this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(detalleterminoproforma.getSucursal()!=null) {
							this.sucursalsForeignKey.add(detalleterminoproforma.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.detalleterminoproforma.getid_sucursal(),false,"Formulario");

					//TerminoProforma
					if(!this.detalleterminoproformaConstantesFunciones.cargarid_termino_proformaDetalleTerminoProforma || this.detalleterminoproformaConstantesFunciones.event_dependid_termino_proformaDetalleTerminoProforma) {
						//this.cargarCombosTerminoProformasForeignKeyLista(" where id="+this.detalleterminoproforma.getid_termino_proforma());
									//this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
						this.terminoproformasForeignKey=new ArrayList<TerminoProforma>();

						if(detalleterminoproforma.getTerminoProforma()!=null) {
							this.terminoproformasForeignKey.add(detalleterminoproforma.getTerminoProforma());
						}

						this.addItemDefectoCombosForeignKeyTerminoProforma();
						this.cargarCombosFrameTerminoProformasForeignKey("Todos");
					}
					this.setActualTerminoProformaForeignKey(this.detalleterminoproforma.getid_termino_proforma(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesDetalleTerminoProforma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesDetalleTerminoProforma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoDetalleTerminoProforma(detalleterminoproforma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioDetalleTerminoProforma(detalleterminoproforma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyDetalleTerminoProforma(detalleterminoproforma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyDetalleTerminoProforma(detalleterminoproforma);
	}
	
	public void setVariablesObjetoActualToFormularioDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setText(detalleterminoproforma.getId().toString());
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setText(detalleterminoproforma.getnumero().toString());
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setText(detalleterminoproforma.getdetalle());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,DetalleTerminoProforma detalleterminoproformaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,detalleterminoproformaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,DetalleTerminoProforma detalleterminoproformaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				detalleterminoproformaLocal=this.detalleterminoproforma;
			} else {
				detalleterminoproformaLocal=this.detalleterminoproformaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(detalleterminoproformaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoDetalleTerminoProforma(detalleterminoproformaLocal,true);
					
					if(detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(detalleterminoproformaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(detalleterminoproformaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(detalleterminoproforma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(detalleterminoproforma);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(detalleterminoproforma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.getText()==null || this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.getText()=="" || this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.getText()=="Id") {
				this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setText("0");
			}

			if(conColumnasBase) {detalleterminoproforma.setId(Long.parseLong(this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTerminoProformaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelIdDetalleTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleterminoproforma.setnumero(Integer.parseInt(this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelnumeroDetalleTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			detalleterminoproforma.setdetalle(this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabeldetalleDetalleTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproformaBean,DetalleTerminoProforma detalleterminoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && detalleterminoproformaBean.getid_termino_proforma()!=null && !detalleterminoproformaBean.getid_termino_proforma().equals(-1L))) {detalleterminoproforma.setid_termino_proforma(detalleterminoproformaBean.getid_termino_proforma());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproformaOrigen,DetalleTerminoProforma detalleterminoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleterminoproformaOrigen.getId()!=null && !detalleterminoproformaOrigen.getId().equals(0L))) {detalleterminoproforma.setId(detalleterminoproformaOrigen.getId());}}
			if(conDefault || (!conDefault && detalleterminoproformaOrigen.getid_termino_proforma()!=null && !detalleterminoproformaOrigen.getid_termino_proforma().equals(-1L))) {detalleterminoproforma.setid_termino_proforma(detalleterminoproformaOrigen.getid_termino_proforma());}
			if(conDefault || (!conDefault && detalleterminoproformaOrigen.getnumero()!=null && !detalleterminoproformaOrigen.getnumero().equals(0))) {detalleterminoproforma.setnumero(detalleterminoproformaOrigen.getnumero());}
			if(conDefault || (!conDefault && detalleterminoproformaOrigen.getdetalle()!=null && !detalleterminoproformaOrigen.getdetalle().equals(""))) {detalleterminoproforma.setdetalle(detalleterminoproformaOrigen.getdetalle());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setText(detalleterminoproforma.getId().toString());
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setText(detalleterminoproforma.getnumero().toString());
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setText(detalleterminoproforma.getdetalle());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioDetalleTerminoProforma(DetalleTerminoProformaBean detalleterminoproformaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setText(detalleterminoproformaBean.getId().toString());
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setText(detalleterminoproformaBean.getnumero().toString());
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setText(detalleterminoproformaBean.getdetalle());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanDetalleTerminoProforma(DetalleTerminoProformaParameterReturnGeneral detalleterminoproformaReturnGeneral,DetalleTerminoProformaBean detalleterminoproformaBean,Boolean conDefault) throws Exception { 
		try {
			DetalleTerminoProforma detalleterminoproformaLocal=new DetalleTerminoProforma();
			
			detalleterminoproformaLocal=detalleterminoproformaReturnGeneral.getDetalleTerminoProforma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && detalleterminoproformaLocal.getId()!=null && !detalleterminoproformaLocal.getId().equals(0L))) {detalleterminoproformaBean.setId(detalleterminoproformaLocal.getId());}}
			if(conDefault || (!conDefault && detalleterminoproformaLocal.getid_termino_proforma()!=null && !detalleterminoproformaLocal.getid_termino_proforma().equals(-1L))) {detalleterminoproformaBean.setid_termino_proforma(detalleterminoproformaLocal.getid_termino_proforma());}
			if(conDefault || (!conDefault && detalleterminoproformaLocal.getnumero()!=null && !detalleterminoproformaLocal.getnumero().equals(0))) {detalleterminoproformaBean.setnumero(detalleterminoproformaLocal.getnumero());}
			if(conDefault || (!conDefault && detalleterminoproformaLocal.getdetalle()!=null && !detalleterminoproformaLocal.getdetalle().equals(""))) {detalleterminoproformaBean.setdetalle(detalleterminoproformaLocal.getdetalle());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxDetalleTerminoProformaGenerico(Long idDetalleTerminoProformaSeleccionado,JComboBox jComboBoxDetalleTerminoProforma,List<DetalleTerminoProforma> detalleterminoproformasLocal)throws Exception {
		try {
			DetalleTerminoProforma  detalleterminoproformaTemp=null;

			for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasLocal) {
				if(detalleterminoproformaAux.getId()!=null && detalleterminoproformaAux.getId().equals(idDetalleTerminoProformaSeleccionado)) {
					detalleterminoproformaTemp=detalleterminoproformaAux;
					break;
				}
			}

			jComboBoxDetalleTerminoProforma.setSelectedItem(detalleterminoproformaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxDetalleTerminoProformaGenerico(JComboBox jComboBoxDetalleTerminoProforma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleTerminoProforma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxDetalleTerminoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxDetalleTerminoProforma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxDetalleTerminoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxDetalleTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxDetalleTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleterminoproforma=(DetalleTerminoProforma) detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleterminoproforma =(DetalleTerminoProforma) detalleterminoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!detalleterminoproforma.getIsNew() && !detalleterminoproforma.getIsChanged() && !detalleterminoproforma.getIsDeleted()) {
				sDescripcion=detalleterminoproforma.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleterminoproforma.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!detalleterminoproforma.getIsNew() && !detalleterminoproforma.getIsChanged() && !detalleterminoproforma.getIsDeleted()) {
				sDescripcion=detalleterminoproforma.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=detalleterminoproforma.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("TerminoProforma")) {
			//sDescripcion=this.getActualTerminoProformaForeignKeyDescripcion((Long)value);
			if(!detalleterminoproforma.getIsNew() && !detalleterminoproforma.getIsChanged() && !detalleterminoproforma.getIsDeleted()) {
				sDescripcion=detalleterminoproforma.getterminoproforma_descripcion();
			} else {
				//sDescripcion=this.getActualTerminoProformaForeignKeyDescripcion((Long)value);
				sDescripcion=detalleterminoproforma.getterminoproforma_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		DetalleTerminoProforma detalleterminoproformaRow=new DetalleTerminoProforma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleterminoproformaRow=(DetalleTerminoProforma) detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			detalleterminoproformaRow=(DetalleTerminoProforma) detalleterminoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualDetalleTerminoProforma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma));			
			this.jButtonDuplicarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaDuplicarDetalleTerminoProforma && this.isPermisoDuplicarDetalleTerminoProforma));			
			this.jButtonCopiarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaCopiarDetalleTerminoProforma && this.isPermisoCopiarDetalleTerminoProforma));
			this.jButtonVerFormDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaVerFormDetalleTerminoProforma && this.isPermisoVerFormDetalleTerminoProforma));
			
			this.jButtonAbrirOrderByDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenDetalleTerminoProforma && this.isPermisoOrdenDetalleTerminoProforma));			
			
			this.jButtonNuevoRelacionesDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma));			
			this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaModificarDetalleTerminoProforma && this.isPermisoActualizarDetalleTerminoProforma));	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaActualizarDetalleTerminoProforma && this.isPermisoActualizarDetalleTerminoProforma));	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaEliminarDetalleTerminoProforma && this.isPermisoEliminarDetalleTerminoProforma));
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarDetalleTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarDetalleTerminoProforma);							
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));			
			
			}
						
			this.jButtonGuardarCambiosTablaDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma));						
			this.jButtonDuplicarToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaDuplicarDetalleTerminoProforma && this.isPermisoDuplicarDetalleTerminoProforma));						
			this.jButtonCopiarToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaCopiarDetalleTerminoProforma && this.isPermisoCopiarDetalleTerminoProforma));			
			this.jButtonVerFormToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaVerFormDetalleTerminoProforma && this.isPermisoVerFormDetalleTerminoProforma));			
			this.jButtonAbrirOrderByToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenDetalleTerminoProforma && this.isPermisoOrdenDetalleTerminoProforma));
			this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma));			
			this.jButtonNuevoGuardarCambiosToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));			
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaModificarDetalleTerminoProforma && this.isPermisoActualizarDetalleTerminoProforma));	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaActualizarDetalleTerminoProforma  && this.isPermisoActualizarDetalleTerminoProforma));	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaEliminarDetalleTerminoProforma && this.isPermisoEliminarDetalleTerminoProforma));
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarToolBarDetalleTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarDetalleTerminoProforma);				
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma));			
			this.jMenuItemDuplicarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaDuplicarDetalleTerminoProforma && this.isPermisoDuplicarDetalleTerminoProforma));			
			this.jMenuItemCopiarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaCopiarDetalleTerminoProforma && this.isPermisoCopiarDetalleTerminoProforma));			
			this.jMenuItemVerFormDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaVerFormDetalleTerminoProforma && this.isPermisoVerFormDetalleTerminoProforma));			
			this.jMenuItemAbrirOrderByDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenDetalleTerminoProforma && this.isPermisoOrdenDetalleTerminoProforma));			
			//this.jMenuItemMostrarOcultarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenDetalleTerminoProforma && this.isPermisoOrdenDetalleTerminoProforma));
			this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenDetalleTerminoProforma && this.isPermisoOrdenDetalleTerminoProforma));			
			//this.jMenuItemDetalleMostrarOcultarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenDetalleTerminoProforma && this.isPermisoOrdenDetalleTerminoProforma));			
			this.jMenuItemNuevoRelacionesDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma));			
			this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoDetalleTerminoProforma && this.isPermisoNuevoDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));									
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemModificarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaModificarDetalleTerminoProforma && this.isPermisoActualizarDetalleTerminoProforma));	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemActualizarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaActualizarDetalleTerminoProforma && this.isPermisoActualizarDetalleTerminoProforma));	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemEliminarDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaEliminarDetalleTerminoProforma && this.isPermisoEliminarDetalleTerminoProforma));
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemCancelarDetalleTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarDetalleTerminoProforma);				
			}
			
			this.jMenuItemGuardarCambiosDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));						
			this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=this.jButtonNuevoDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaDuplicarDetalleTerminoProforma=this.jButtonDuplicarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaCopiarDetalleTerminoProforma=this.jButtonCopiarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaVerFormDetalleTerminoProforma=this.jButtonVerFormDetalleTerminoProforma.isVisible();
			
			this.isVisibilidadCeldaOrdenDetalleTerminoProforma=this.jButtonAbrirOrderByDetalleTerminoProforma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=this.jButtonNuevoRelacionesDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=this.jButtonModificarDetalleTerminoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaGuardarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=this.jButtonGuardarCambiosTablaDetalleTerminoProforma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=this.jButtonNuevoToolBarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarToolBarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarToolBarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarToolBarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarToolBarDetalleTerminoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleTerminoProforma=this.jButtonGuardarCambiosToolBarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=this.jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=this.jMenuItemNuevoDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=this.jMenuItemNuevoRelacionesDetalleTerminoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemModificarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemActualizarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemEliminarDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemCancelarDetalleTerminoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarDetalleTerminoProforma=this.jMenuItemGuardarCambiosDetalleTerminoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesDetalleTerminoProforma(Boolean esInicializar) {
		if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
				//if(this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleTerminoProforma();
			}
			
			this.inicializarActualizarBindingBotonesManualDetalleTerminoProforma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualDetalleTerminoProforma() {
		this.jButtonNuevoDetalleTerminoProforma.setVisible(this.isPermisoNuevoDetalleTerminoProforma);			
		this.jButtonDuplicarDetalleTerminoProforma.setVisible(this.isPermisoDuplicarDetalleTerminoProforma);			
		this.jButtonCopiarDetalleTerminoProforma.setVisible(this.isPermisoCopiarDetalleTerminoProforma);			
		this.jButtonVerFormDetalleTerminoProforma.setVisible(this.isPermisoVerFormDetalleTerminoProforma);			
		
		this.jButtonAbrirOrderByDetalleTerminoProforma.setVisible(this.isPermisoOrdenDetalleTerminoProforma);					
		
		this.jButtonNuevoRelacionesDetalleTerminoProforma.setVisible(this.isPermisoNuevoDetalleTerminoProforma);			
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarDetalleTerminoProforma.setVisible(this.isPermisoActualizarDetalleTerminoProforma);	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarDetalleTerminoProforma.setVisible(this.isPermisoActualizarDetalleTerminoProforma);	
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarDetalleTerminoProforma.setVisible(this.isPermisoEliminarDetalleTerminoProforma);
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarDetalleTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarDetalleTerminoProforma);						
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.setVisible(this.isPermisoGuardarCambiosDetalleTerminoProforma);							
		}
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.setVisible(this.isPermisoActualizarDetalleTerminoProforma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleTerminoProforma() {
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarDetalleTerminoProforma.setVisible(this.isPermisoActualizarDetalleTerminoProforma);	
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarDetalleTerminoProforma.setVisible(this.isPermisoActualizarDetalleTerminoProforma);	
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarDetalleTerminoProforma.setVisible(this.isPermisoEliminarDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarDetalleTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarDetalleTerminoProforma);							
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarDetalleTerminoProforma && this.isPermisoGuardarCambiosDetalleTerminoProforma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosDetalleTerminoProforma() {
		if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualDetalleTerminoProforma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesDetalleTerminoProforma() {
	}
	
	public void jTableDatosDetalleTerminoProformaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarDetalleTerminoProforma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidDetalleTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleterminoproforma==null) {
						this.detalleterminoproforma = new DetalleTerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				}

				if(this.detalleterminoproforma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.detalleterminoproforma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaDetalleTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebDetalleTerminoProforma(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.detalleterminoproformaLogic.getConnexion());

				if(this.detalleterminoproforma.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.detalleterminoproforma.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTerminoProforma=(TitledBorder)this.jScrollPanelDatosDetalleTerminoProforma.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderDetalleTerminoProforma.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaDetalleTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleterminoproforma==null) {
						this.detalleterminoproforma = new DetalleTerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				}

				if(this.detalleterminoproforma.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.detalleterminoproforma.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalDetalleTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebDetalleTerminoProforma(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.detalleterminoproformaLogic.getConnexion());

				if(this.detalleterminoproforma.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.detalleterminoproforma.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTerminoProforma=(TitledBorder)this.jScrollPanelDatosDetalleTerminoProforma.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderDetalleTerminoProforma.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalDetalleTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleterminoproforma==null) {
						this.detalleterminoproforma = new DetalleTerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				}

				if(this.detalleterminoproforma.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.detalleterminoproforma.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_termino_proformaDetalleTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoterminoproforma=true;

			idTienePermisoterminoproforma=this.tienePermisosUsuarioEnPaginaWebDetalleTerminoProforma(TerminoProformaConstantesFunciones.CLASSNAME);

			if(idTienePermisoterminoproforma) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosDetalleTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosDetalleTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);

				this.terminoproformaBeanSwingJInternalFrame=new TerminoProformaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.terminoproformaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.terminoproformaBeanSwingJInternalFrame.getTerminoProformaLogic().setConnexion(this.detalleterminoproformaLogic.getConnexion());

				if(this.detalleterminoproforma.getid_termino_proforma()!=null) {
					this.terminoproformaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.terminoproformaBeanSwingJInternalFrame.setIdActual(this.detalleterminoproforma.getid_termino_proforma());
					this.terminoproformaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.terminoproformaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.terminoproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaTerminoProforma();
				}

				JInternalFrameBase jinternalFrame =this.terminoproformaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderDetalleTerminoProforma=(TitledBorder)this.jScrollPanelDatosDetalleTerminoProforma.getBorder();
				TitledBorder titledBorderterminoproforma=(TitledBorder)this.terminoproformaBeanSwingJInternalFrame.jScrollPanelDatosTerminoProforma.getBorder();

				titledBorderterminoproforma.setTitle(titledBorderDetalleTerminoProforma.getTitle() + " -> Termino Proforma");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_termino_proformaDetalleTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleterminoproforma==null) {
						this.detalleterminoproforma = new DetalleTerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				}

				if(this.detalleterminoproforma.getid_termino_proforma()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_termino_proforma = "+this.detalleterminoproforma.getid_termino_proforma().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumeroDetalleTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleterminoproforma==null) {
						this.detalleterminoproforma = new DetalleTerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				}

				if(this.detalleterminoproforma.getnumero()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero = "+this.detalleterminoproforma.getnumero().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondetalleDetalleTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.getdetalleterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.detalleterminoproforma==null) {
						this.detalleterminoproforma = new DetalleTerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);
				}

				if(this.detalleterminoproforma.getdetalle()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where detalle like '%"+this.detalleterminoproforma.getdetalle()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingDetalleTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);

			this.getDetalleTerminoProformasFK_IdEmpresa();

			this.inicializarActualizarBindingDetalleTerminoProforma(false);

			//if(DetalleTerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);

			this.getDetalleTerminoProformasFK_IdSucursal();

			this.inicializarActualizarBindingDetalleTerminoProforma(false);

			//if(DetalleTerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdTerminoProformaDetalleTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);

			this.getDetalleTerminoProformasFK_IdTerminoProforma();

			this.inicializarActualizarBindingDetalleTerminoProforma(false);

			//if(DetalleTerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.detalleterminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameDetalleTerminoProforma() {
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.setVisible(false);	    			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.dispose();
			this.jInternalFrameDetalleFormDetalleTerminoProforma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
			this.jInternalFrameReporteDinamicoDetalleTerminoProforma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoDetalleTerminoProforma.dispose();
			this.jInternalFrameReporteDinamicoDetalleTerminoProforma=null;
		}
		
		if(this.jInternalFrameImportacionDetalleTerminoProforma!=null) {
			this.jInternalFrameImportacionDetalleTerminoProforma.setVisible(false);	    			
			this.jInternalFrameImportacionDetalleTerminoProforma.dispose();
			this.jInternalFrameImportacionDetalleTerminoProforma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessDetalleTerminoProforma();
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			
			if(sTipo.equals("NuevoDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarDetalleTerminoProforma")) {
				jButtonDuplicarDetalleTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarDetalleTerminoProforma")) {
				jButtonCopiarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormDetalleTerminoProforma")) {
				jButtonVerFormDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarDetalleTerminoProforma")) {
				jButtonDuplicarDetalleTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarDetalleTerminoProforma")) {
				jButtonDuplicarDetalleTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarDetalleTerminoProforma")) {
				jButtonModificarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarDetalleTerminoProforma")) {
				jButtonModificarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarDetalleTerminoProforma")) {
				jButtonModificarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarDetalleTerminoProforma")) {
				jButtonActualizarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarDetalleTerminoProforma")) {
				jButtonActualizarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarDetalleTerminoProforma")) {
				jButtonActualizarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarDetalleTerminoProforma")) {
				jButtonEliminarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarDetalleTerminoProforma")) {
				jButtonEliminarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarDetalleTerminoProforma")) {
				jButtonEliminarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarDetalleTerminoProforma")) {
				jButtonCancelarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarDetalleTerminoProforma")) {
				jButtonCancelarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarDetalleTerminoProforma")) {
				jButtonCancelarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarDetalleTerminoProforma")) {
				jButtonCerrarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarDetalleTerminoProforma")) {
				jButtonCerrarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarDetalleTerminoProforma")) {
				jButtonCerrarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarDetalleTerminoProforma")) {
				jButtonMostrarOcultarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarDetalleTerminoProforma")) {
				jButtonCancelarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarDetalleTerminoProforma")) {
				jButtonCopiarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarDetalleTerminoProforma")) {
				jButtonVerFormDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarDetalleTerminoProforma")) {
				jButtonCopiarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormDetalleTerminoProforma")) {
				jButtonVerFormDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionDetalleTerminoProforma")) {
				jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarDetalleTerminoProforma")) {
				jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionDetalleTerminoProforma")) {
				jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresDetalleTerminoProforma")) {
				jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarDetalleTerminoProforma")) {
				jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreDetalleTerminoProforma")) {
				jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesDetalleTerminoProforma")) {
				jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarDetalleTerminoProforma")) {
				jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesDetalleTerminoProforma")) {
				jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByDetalleTerminoProforma") || sTipo.equals("MenuItemDetalleAbrirOrderByDetalleTerminoProforma")) {
				jButtonAbrirOrderByDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarDetalleTerminoProforma") || sTipo.equals("MenuItemDetalleMostrarOcultarDetalleTerminoProforma")) {
				jButtonMostrarOcultarDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleTerminoProforma")) {
				jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarDetalleTerminoProforma")) {
				jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosDetalleTerminoProforma")) {
				jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoDetalleTerminoProforma")) {
				jButtonCerrarReporteDinamicoDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoDetalleTerminoProforma")) {
				jButtonGenerarReporteDinamicoDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoDetalleTerminoProforma")) {
				
				jButtonGenerarExcelReporteDinamicoDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionDetalleTerminoProforma")) {
				jButtonCerrarImportacionDetalleTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionDetalleTerminoProforma")) {
				
				jButtonGenerarImportacionDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionDetalleTerminoProforma")) {
				
				jButtonAbrirImportacionDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesDetalleTerminoProforma")) {
				jComboBoxTiposAccionesDetalleTerminoProformaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesDetalleTerminoProforma")) {
				jComboBoxTiposRelacionesDetalleTerminoProformaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioDetalleTerminoProforma")) {
				jComboBoxTiposAccionesDetalleTerminoProformaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarDetalleTerminoProforma")) {
				
				jComboBoxTiposSeleccionarDetalleTerminoProformaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralDetalleTerminoProforma")) {
				jTextFieldValorCampoGeneralDetalleTerminoProformaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByDetalleTerminoProforma")) {
				jButtonAbrirOrderByDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarDetalleTerminoProforma")) {
				jButtonAbrirOrderByDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByDetalleTerminoProforma")) {
				jButtonCerrarOrderByDetalleTerminoProformaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleTerminoProformaBusqueda")) {
				this.jButtonidDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleTerminoProformaUpdate")) {
				this.jButtonid_empresaDetalleTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleTerminoProformaBusqueda")) {
				this.jButtonid_empresaDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleTerminoProformaUpdate")) {
				this.jButtonid_sucursalDetalleTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleTerminoProformaBusqueda")) {
				this.jButtonid_sucursalDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_termino_proformaDetalleTerminoProformaUpdate")) {
				this.jButtonid_termino_proformaDetalleTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_termino_proformaDetalleTerminoProformaBusqueda")) {
				this.jButtonid_termino_proformaDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroDetalleTerminoProformaBusqueda")) {
				this.jButtonnumeroDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleDetalleTerminoProformaBusqueda")) {
				this.jButtondetalleDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdTerminoProformaDetalleTerminoProforma")) {
				this.jButtonFK_IdTerminoProformaDetalleTerminoProformaActionPerformed(evt);
			}
			
			;
			
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessDetalleTerminoProforma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			DetalleTerminoProforma detalleterminoproformaLocal=null;
			
			if(!this.getEsControlTabla()) {
				detalleterminoproformaLocal=this.detalleterminoproforma;
			} else {
				detalleterminoproformaLocal=this.detalleterminoproformaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
							
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
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
			
			


			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
								
						
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
								
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
							
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
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
			
			


			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
								
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosDetalleTerminoProforma")) {
					jCheckBoxSeleccionarTodosDetalleTerminoProformaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosDetalleTerminoProforma")) {
					jCheckBoxSeleccionadosDetalleTerminoProformaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarDetalleTerminoProforma")) {
					
				}
				
				


				
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
												
				
				


				
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
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
			
			


			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.detalleterminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.detalleterminoproforma);
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
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
				
				


				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(DetalleTerminoProforma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",DetalleTerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaDetalleTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.detalleterminoproformaAnterior =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarDetalleTerminoProforma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosDetalleTerminoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosDetalleTerminoProforma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.detalleterminoproforma =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.detalleterminoproforma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarDetalleTerminoProforma")) {
				
				}
				
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarDetalleTerminoProforma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosDetalleTerminoProforma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarDetalleTerminoProforma")) {
			
			}
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessDetalleTerminoProforma();
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			if(sTipo.equals("NuevoDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarDetalleTerminoProforma")) {
				jButtonDuplicarDetalleTerminoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarDetalleTerminoProforma")) {
				jButtonCopiarDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormDetalleTerminoProforma")) {
				jButtonVerFormDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesDetalleTerminoProforma")) {
				jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarDetalleTerminoProforma")) {
				jButtonModificarDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarDetalleTerminoProforma")) {
				jButtonActualizarDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarDetalleTerminoProforma")) {
				jButtonEliminarDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarDetalleTerminoProforma")) {
				jButtonCancelarDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarDetalleTerminoProforma")) {
				jButtonCerrarDetalleTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosDetalleTerminoProforma")) {
				jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosDetalleTerminoProforma")) {
				jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByDetalleTerminoProforma")) {
				jButtonAbrirOrderByDetalleTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionDetalleTerminoProforma")) {
				jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresDetalleTerminoProforma")) {
				jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesDetalleTerminoProforma")) {
				jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idDetalleTerminoProformaBusqueda")) {
				this.jButtonidDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaDetalleTerminoProformaUpdate")) {
				this.jButtonid_empresaDetalleTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaDetalleTerminoProformaBusqueda")) {
				this.jButtonid_empresaDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalDetalleTerminoProformaUpdate")) {
				this.jButtonid_sucursalDetalleTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalDetalleTerminoProformaBusqueda")) {
				this.jButtonid_sucursalDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_termino_proformaDetalleTerminoProformaUpdate")) {
				this.jButtonid_termino_proformaDetalleTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_termino_proformaDetalleTerminoProformaBusqueda")) {
				this.jButtonid_termino_proformaDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numeroDetalleTerminoProformaBusqueda")) {
				this.jButtonnumeroDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("detalleDetalleTerminoProformaBusqueda")) {
				this.jButtondetalleDetalleTerminoProformaBusquedaActionPerformed(evt);
			}
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessDetalleTerminoProforma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameDetalleTerminoProforma")) {
				closingInternalFrameDetalleTerminoProforma();
				
			} else if(sTipo.equals("jButtonCancelarDetalleTerminoProforma")) {
				JInternalFrameBase jInternalFrameDetalleFormDetalleTerminoProforma = (JInternalFrameBase)evt.getSource();
	            	
	            DetalleTerminoProformaBeanSwingJInternalFrame jInternalFrameParent=(DetalleTerminoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleTerminoProforma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarDetalleTerminoProformaActionPerformed(null);
			}
			
			DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.detalleterminoproforma,new Object(),this.detalleterminoproformaParameterGeneral,this.detalleterminoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormDetalleTerminoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormDetalleTerminoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormDetalleTerminoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.detalleterminoproforma)) {
			if(!esControlTabla) {
				if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);			
				}
				
				if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleterminoproformaReturnGeneral=detalleterminoproformaLogic.procesarEventosDetalleTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleterminoproformaLogic.getDetalleTerminoProformas(),this.detalleterminoproforma,this.detalleterminoproformaParameterGeneral,this.isEsNuevoDetalleTerminoProforma,classes);//this.detalleterminoproformaLogic.getDetalleTerminoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral,this.detalleterminoproformaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanDetalleTerminoProforma(classes,this.detalleterminoproformaReturnGeneral,this.detalleterminoproformaBean,false);
					}
						
					if(this.detalleterminoproformaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma());	
					}
						
					if(this.detalleterminoproformaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma(),classes);//this.detalleterminoproformaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioDetalleTerminoProforma(this.detalleterminoproforma,classes);//this.detalleterminoproformaBean);									
				}
			
				if(DetalleTerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualDetalleTerminoProforma(this.detalleterminoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysDetalleTerminoProforma(this.detalleterminoproforma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.detalleterminoproformaAnterior!=null) {
						this.detalleterminoproforma=this.detalleterminoproformaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.detalleterminoproformaReturnGeneral=detalleterminoproformaLogic.procesarEventosDetalleTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleterminoproformaLogic.getDetalleTerminoProformas(),this.detalleterminoproforma,this.detalleterminoproformaParameterGeneral,this.isEsNuevoDetalleTerminoProforma,classes);//this.detalleterminoproformaLogic.getDetalleTerminoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.detalleterminoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.detalleterminoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma(),detalleterminoproformaLogic.getDetalleTerminoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma(),this.detalleterminoproformas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosDetalleTerminoProforma.repaint();
				
				//((AbstractTableModel) this.jTableDatosDetalleTerminoProforma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosDetalleTerminoProforma();
			}
		}
	}
	
	public void actualizarVisualTableDatosDetalleTerminoProforma() throws Exception {
		
		DetalleTerminoProformaModel detalleterminoproformaModel=(DetalleTerminoProformaModel)this.jTableDatosDetalleTerminoProforma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			detalleterminoproformaModel.detalleterminoproformas=this.detalleterminoproformaLogic.getDetalleTerminoProformas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			detalleterminoproformaModel.detalleterminoproformas=this.detalleterminoproformas;
		}
		
		
		((DetalleTerminoProformaModel) this.jTableDatosDetalleTerminoProforma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaDetalleTerminoProforma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getdetalleterminoproformaAnterior(),this.detalleterminoproformaLogic.getDetalleTerminoProformas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getdetalleterminoproformaAnterior(),this.detalleterminoproformas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosDetalleTerminoProforma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
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
										
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleterminoproforma,new Object(),generalEntityParameterGeneral,this.detalleterminoproformaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=DetalleTerminoProformaConstantesFunciones.getClassesRelationshipsOfDetalleTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=DetalleTerminoProformaConstantesFunciones.getClassesRelationshipsFromStringsOfDetalleTerminoProforma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormDetalleTerminoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				DetalleTerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.detalleterminoproforma,new Object(),generalEntityParameterGeneral,this.detalleterminoproformaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioDetalleTerminoProforma(DetalleTerminoProformaBean detalleterminoproformaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanDetalleTerminoProforma(ArrayList<Classe> classes,DetalleTerminoProformaReturnGeneral detalleterminoproformaReturnGeneral,DetalleTerminoProformaBean detalleterminoproformaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.detalleterminoproforma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma = new DetalleTerminoProformaDetalleFormJInternalFrame(jDesktopPane,this.detalleterminoproformaSessionBean.getConGuardarRelaciones(),this.detalleterminoproformaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.setVisible(false);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.setSelected(false);						
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.detalleterminoproformaLogic=this.detalleterminoproformaLogic;
		
		this.cargarCombosFrameForeignKeyDetalleTerminoProforma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleDetalleTerminoProforma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleDetalleTerminoProforma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyDetalleTerminoProforma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyDetalleTerminoProforma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleTerminoProforma"));
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarDetalleTerminoProforma"));

		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleTerminoProforma"));
					
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemModificarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"ActualizarDetalleTerminoProforma"));
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleTerminoProforma"));
						
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemActualizarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarDetalleTerminoProforma"));
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleTerminoProforma"));
								
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemEliminarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarDetalleTerminoProforma"));
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleTerminoProforma"));
					
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemCancelarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleTerminoProforma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemDetalleCerrarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleTerminoProforma"));
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleTerminoProforma"));
		
		
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleTerminoProforma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonidDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_empresaDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_empresaDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_sucursalDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_sucursalDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_termino_proformaDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_termino_proformaDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_termino_proformaDetalleTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonnumeroDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"numeroDetalleTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtondetalleDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"detalleDetalleTerminoProformaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleTerminoProforma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameDetalleTerminoProforma"));
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarDetalleTerminoProforma"));
		}
		
		this.jTableDatosDetalleTerminoProforma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarDetalleTerminoProforma"));
		
		this.jTableDatosDetalleTerminoProforma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarDetalleTerminoProforma"));
		
		this.jButtonNuevoDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"NuevoDetalleTerminoProforma"));
		
		this.jButtonDuplicarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"DuplicarDetalleTerminoProforma"));
		
		this.jButtonCopiarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"CopiarDetalleTerminoProforma"));
		
		this.jButtonVerFormDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"VerFormDetalleTerminoProforma"));
		
		
		this.jButtonNuevoToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"NuevoToolBarDetalleTerminoProforma"));
			
		this.jButtonDuplicarToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarDetalleTerminoProforma"));
			
		this.jMenuItemNuevoDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoDetalleTerminoProforma"));
			
		this.jMenuItemDuplicarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarDetalleTerminoProforma"));		
		
		
		this.jButtonNuevoRelacionesDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesDetalleTerminoProforma"));
		
		
		this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarDetalleTerminoProforma"));
			
		this.jMenuItemNuevoRelacionesDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesDetalleTerminoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarDetalleTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonModificarToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarDetalleTerminoProforma"));
			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemModificarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarDetalleTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"ActualizarDetalleTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonActualizarToolBarDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarDetalleTerminoProforma"));
				
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemActualizarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarDetalleTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarDetalleTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonEliminarToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarDetalleTerminoProforma"));
						
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemEliminarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarDetalleTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarDetalleTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonCancelarToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarDetalleTerminoProforma"));
			
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemCancelarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarDetalleTerminoProforma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarDetalleTerminoProforma"));		
		
		
		this.jButtonCerrarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CerrarDetalleTerminoProforma"));
		
		
		this.jButtonCerrarToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CerrarToolBarDetalleTerminoProforma"));
			
		this.jMenuItemCerrarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarDetalleTerminoProforma"));
			
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jMenuItemDetalleCerrarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarDetalleTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosDetalleTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarDetalleTerminoProforma"));
		}
		
		this.jButtonCopiarToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CopiarToolBarDetalleTerminoProforma"));
			
		this.jButtonVerFormToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"VerFormToolBarDetalleTerminoProforma"));
		
		this.jMenuItemGuardarCambiosDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosDetalleTerminoProforma"));
			
		this.jMenuItemCopiarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarDetalleTerminoProforma"));		
		
		this.jMenuItemVerFormDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormDetalleTerminoProforma"));		
		
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleTerminoProforma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarDetalleTerminoProforma"));
			
		this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaDetalleTerminoProforma"));		
		
		
		
		this.jButtonRecargarInformacionDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionDetalleTerminoProforma"));
					
		this.jButtonRecargarInformacionToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarDetalleTerminoProforma"));
		
		this.jMenuItemRecargarInformacionDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionDetalleTerminoProforma"));		
		
		
		
		this.jButtonAnterioresDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"AnterioresDetalleTerminoProforma"));
		
		
		this.jButtonAnterioresToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarDetalleTerminoProforma"));
		
		this.jMenuItemAnterioresDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresDetalleTerminoProforma"));		
		
		
		this.jButtonSiguientesDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"SiguientesDetalleTerminoProforma"));
		
		
		this.jButtonSiguientesToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarDetalleTerminoProforma"));
			
		this.jMenuItemSiguientesDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesDetalleTerminoProforma"));
			
		this.jMenuItemAbrirOrderByDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByDetalleTerminoProforma"));
			
		this.jMenuItemMostrarOcultarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarDetalleTerminoProforma"));
			
		this.jMenuItemDetalleAbrirOrderByDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByDetalleTerminoProforma"));
			
		this.jMenuItemDetalleMostarOcultarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarDetalleTerminoProforma"));		
		
		
		this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosDetalleTerminoProforma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarDetalleTerminoProforma"));
			
		this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosDetalleTerminoProforma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosDetalleTerminoProforma"));

		this.jCheckBoxSeleccionadosDetalleTerminoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosDetalleTerminoProforma"));
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioDetalleTerminoProforma"));
		}
		
		
		this.jComboBoxTiposRelacionesDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposRelacionesDetalleTerminoProforma"));
			
		this.jComboBoxTiposAccionesDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesDetalleTerminoProforma"));
					
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarDetalleTerminoProforma"));
			
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralDetalleTerminoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonidDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_empresaDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_empresaDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_sucursalDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_sucursalDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_termino_proformaDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_termino_proformaDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_termino_proformaDetalleTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonnumeroDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"numeroDetalleTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtondetalleDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"detalleDetalleTerminoProformaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdTerminoProformaDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"FK_IdTerminoProformaDetalleTerminoProforma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoDetalleTerminoProforma!=null) {
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleTerminoProforma"));
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleTerminoProforma"));
				this.jInternalFrameReporteDinamicoDetalleTerminoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleTerminoProforma"));
			}
			
			//this.jButtonCerrarReporteDinamicoDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoDetalleTerminoProforma"));				
			//this.jButtonGenerarReporteDinamicoDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoDetalleTerminoProforma"));
			//this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoDetalleTerminoProforma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionDetalleTerminoProforma!=null) {
				this.jInternalFrameImportacionDetalleTerminoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionDetalleTerminoProforma"));
				this.jInternalFrameImportacionDetalleTerminoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionDetalleTerminoProforma"));
				this.jInternalFrameImportacionDetalleTerminoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionDetalleTerminoProforma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByDetalleTerminoProforma"));
			
			this.jButtonAbrirOrderByToolBarDetalleTerminoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarDetalleTerminoProforma"));			
			
			if(this.jInternalFrameOrderByDetalleTerminoProforma!=null) {
				this.jInternalFrameOrderByDetalleTerminoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByDetalleTerminoProforma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormDetalleTerminoProforma.jTabbedPaneRelacionesDetalleTerminoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesDetalleTerminoProforma"));
		
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
            		closingInternalFrameDetalleTerminoProforma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormDetalleTerminoProforma = (JInternalFrameBase)event.getSource();
	            	
	            DetalleTerminoProformaBeanSwingJInternalFrame jInternalFrameParent=(DetalleTerminoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormDetalleTerminoProforma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarDetalleTerminoProformaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosDetalleTerminoProforma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosDetalleTerminoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosDetalleTerminoProforma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosDetalleTerminoProforma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoDetalleTerminoProforma";
		inputMap = this.jButtonNuevoDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesDetalleTerminoProforma";
		inputMap = this.jButtonNuevoRelacionesDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoDetalleTerminoProformaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarDetalleTerminoProforma";
		inputMap = this.jButtonModificarDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarDetalleTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarDetalleTerminoProforma";
		inputMap = this.jButtonActualizarDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarDetalleTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarDetalleTerminoProforma";
		inputMap = this.jButtonEliminarDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarDetalleTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarDetalleTerminoProforma";
		inputMap = this.jButtonCancelarDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarDetalleTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarDetalleTerminoProforma";
		inputMap = this.jButtonCerrarDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarDetalleTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosDetalleTerminoProforma";
		inputMap = this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonGuardarCambiosDetalleTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosDetalleTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosDetalleTerminoProforma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosDetalleTerminoProformaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesDetalleTerminoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesDetalleTerminoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarDetalleTerminoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarDetalleTerminoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralDetalleTerminoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralDetalleTerminoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonidDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_empresaDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_empresaDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_sucursalDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_sucursalDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalDetalleTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_termino_proformaDetalleTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_termino_proformaDetalleTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonid_termino_proformaDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_termino_proformaDetalleTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtonnumeroDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"numeroDetalleTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jButtondetalleDetalleTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"detalleDetalleTerminoProformaBusqueda"));
		
		
		this.jButtonFK_IdTerminoProformaDetalleTerminoProforma.addActionListener(new ButtonActionListener(this,"FK_IdTerminoProformaDetalleTerminoProforma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionDetalleTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionDetalleTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarDetalleTerminoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarDetalleTerminoProforma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosDetalleTerminoProforma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
					detalleterminoproformaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformas) {
					detalleterminoproformaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosDetalleTerminoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
						detalleterminoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformas) {
						detalleterminoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleTerminoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleTerminoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosDetalleTerminoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosDetalleTerminoProforma.getSelectedRows();
			
			DetalleTerminoProforma detalleterminoproformaLocal=new DetalleTerminoProforma();
			
			//this.seleccionarTodosDetalleTerminoProforma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					detalleterminoproformaLocal =(DetalleTerminoProforma) this.detalleterminoproformaLogic.getDetalleTerminoProformas().toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					detalleterminoproformaLocal =(DetalleTerminoProforma) this.detalleterminoproformas.toArray()[this.jTableDatosDetalleTerminoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				detalleterminoproformaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
						detalleterminoproformaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformas) {
						detalleterminoproformaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosDetalleTerminoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosDetalleTerminoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosDetalleTerminoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualDetalleTerminoProformaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarDetalleTerminoProformaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralDetalleTerminoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralDetalleTerminoProforma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformaLogic.getDetalleTerminoProformas()) {
				
						if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							detalleterminoproformaAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							detalleterminoproformaAux.setdetalle(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformas) {
					
						if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO)) {
							existe=true;
							detalleterminoproformaAux.setnumero(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE)) {
							existe=true;
							detalleterminoproformaAux.setdetalle(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesDetalleTerminoProformaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioDetalleTerminoProforma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesDetalleTerminoProforma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteDetalleTerminoProforma) {				
					conSplash=true;//false;										
					
					//this.startProcessDetalleTerminoProforma(conSplash);
				
					this.generarReporteDetalleTerminoProformasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoDetalleTerminoProformasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleTerminoProformasSeleccionados(false);
				//this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoDetalleTerminoProformasSeleccionados(true);
				//this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleTerminoProforma();
				
				this.exportarDetalleTerminoProformasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionDetalleTerminoProformas();
				//this.importarDetalleTerminoProformas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessDetalleTerminoProforma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelDetalleTerminoProformasSeleccionados();
				//this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Detalle Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessDetalleTerminoProforma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoDetalleTerminoProforma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyDetalleTerminoProforma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
				}	
			} 			
			else if(DetalleTerminoProformaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteDetalleTerminoProforma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessDetalleTerminoProforma(conSplash);
					
						//this.actualizarParametrosGeneralDetalleTerminoProforma();
						
						this.generarReporteProcesoAccionDetalleTerminoProformasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(DetalleTerminoProformaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Detalle Termino ProformaS SELECCIONADOS?", "MANTENIMIENTO DE Detalle Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessDetalleTerminoProforma();
				
						this.actualizarParametrosGeneralDetalleTerminoProforma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.detalleterminoproformaReturnGeneral=detalleterminoproformaLogic.procesarAccionDetalleTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.detalleterminoproformaLogic.getDetalleTerminoProformas(),this.detalleterminoproformaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarDetalleTerminoProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralDetalleTerminoProforma();
					
					DetalleTerminoProformaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarDetalleTerminoProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesDetalleTerminoProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxTiposAccionesFormularioDetalleTerminoProforma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessDetalleTerminoProforma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesDetalleTerminoProformaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessDetalleTerminoProforma();
			
			if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
			DetalleTerminoProforma detalleterminoproforma=new DetalleTerminoProforma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingDetalleTerminoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesDetalleTerminoProforma.getSelectedItem();
			
			
			
			
			detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
			//this.sTipoAccion;
			
			if(detalleterminoproformasSeleccionados.size()==1) {
				for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasSeleccionados) {
					detalleterminoproforma=detalleterminoproformaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessDetalleTerminoProforma();
			
      		//this.finishProcessDetalleTerminoProforma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarDetalleTerminoProformaReturnGeneral() throws Exception {
		if(this.detalleterminoproformaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.detalleterminoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.detalleterminoproformaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.detalleterminoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.detalleterminoproformaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.detalleterminoproformaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
		}
		
		if(this.detalleterminoproformaReturnGeneral.getConRetornoLista() || this.detalleterminoproformaReturnGeneral.getConRetornoObjeto()) {
			if(this.detalleterminoproformaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleterminoproformaLogic.setDetalleTerminoProformas(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.detalleterminoproformaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.detalleterminoproformaLogic.setDetalleTerminoProforma(this.detalleterminoproformaReturnGeneral.getDetalleTerminoProforma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingDetalleTerminoProforma(false);
		}
	}
	
	public void actualizarParametrosGeneralDetalleTerminoProforma() throws Exception {
		
		
	}
	
	public ArrayList<DetalleTerminoProforma> getDetalleTerminoProformasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioDetalleTerminoProforma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformaLogic.getDetalleTerminoProformas()) {
					if(detalleterminoproformaAux.getIsSelected()) {
						detalleterminoproformasSeleccionados.add(detalleterminoproformaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(DetalleTerminoProforma detalleterminoproformaAux:this.detalleterminoproformas) {
					if(detalleterminoproformaAux.getIsSelected()) {
						detalleterminoproformasSeleccionados.add(detalleterminoproformaAux);				
					}
				}
			}
			
			if(detalleterminoproformasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						detalleterminoproformasSeleccionados.addAll(this.detalleterminoproformaLogic.getDetalleTerminoProformas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						detalleterminoproformasSeleccionados.addAll(this.detalleterminoproformas);				
					}
				}
			}
		} else {
			detalleterminoproformasSeleccionados.add(this.detalleterminoproforma);
		}
		
		return detalleterminoproformasSeleccionados;
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
	
	public void generarReporteDetalleTerminoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalDetalleTerminoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoDetalleTerminoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleTerminoProformasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoDetalleTerminoProformasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Detalle Termino Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesDetalleTerminoProformasSeleccionados() throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados);
		
	}	
	
	public void generarReporteNormalDetalleTerminoProformasSeleccionados() throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionDetalleTerminoProformasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoDetalleTerminoProformasSeleccionados() throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoDetalleTerminoProforma();
		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoDetalleTerminoProforma();
		
		
		//this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados ,detalleterminoproformaImplementable,detalleterminoproformaImplementableHome);
	}
	
	public void mostrarImportacionDetalleTerminoProformas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionDetalleTerminoProforma();
		
		this.abrirFrameImportacionDetalleTerminoProforma();		
		
			
		//this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados ,detalleterminoproformaImplementable,detalleterminoproformaImplementableHome);
	}
	
	public void importarDetalleTerminoProformas() throws Exception {		
	
	}
	
	public void exportarDetalleTerminoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelDetalleTerminoProformasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoDetalleTerminoProformasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlDetalleTerminoProformasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Detalle Termino Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoDetalleTerminoProformasSeleccionados() throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarDetalleTerminoProforma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarDetalleTerminoProforma(detalleterminoproformaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//detalleterminoproformaAux.setsDetalleGeneralEntityReporte(detalleterminoproformaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarDetalleTerminoProforma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=detalleterminoproforma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleterminoproforma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleterminoproforma.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleterminoproforma.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleterminoproforma.getterminoproforma_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleterminoproforma.getnumero().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=detalleterminoproforma.getdetalle();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelDetalleTerminoProformasSeleccionados() throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("DetalleTerminoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelDetalleTerminoProforma(row);				
				iRow++;
			}				
			
			for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelDetalleTerminoProforma(detalleterminoproformaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlDetalleTerminoProformasSeleccionados() throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();		
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"detalleterminoproforma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("detalleterminoproformas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("detalleterminoproforma");
			//elementRoot.appendChild(element);
		
			for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasSeleccionados) {
				element = document.createElement("detalleterminoproforma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlDetalleTerminoProforma(detalleterminoproformaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Detalle Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelDetalleTerminoProforma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO);
		cell = row.createCell(iColumn++);cell.setCellValue(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(detalleterminoproforma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleterminoproforma.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleterminoproforma.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleterminoproforma.getterminoproforma_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleterminoproforma.getnumero());
		cell = row.createCell(iColumn++);cell.setCellValue(detalleterminoproforma.getdetalle());				
	}
	
	public void setFilaDatosExportarXmlDetalleTerminoProforma(DetalleTerminoProforma detalleterminoproforma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(DetalleTerminoProformaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(detalleterminoproforma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(DetalleTerminoProformaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(detalleterminoproforma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(DetalleTerminoProformaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(detalleterminoproforma.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(DetalleTerminoProformaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(detalleterminoproforma.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementterminoproforma_descripcion = document.createElement(DetalleTerminoProformaConstantesFunciones.IDTERMINOPROFORMA);
		elementterminoproforma_descripcion.appendChild(document.createTextNode(detalleterminoproforma.getterminoproforma_descripcion()));
		element.appendChild(elementterminoproforma_descripcion);

		Element elementnumero = document.createElement(DetalleTerminoProformaConstantesFunciones.NUMERO);
		elementnumero.appendChild(document.createTextNode(detalleterminoproforma.getnumero().toString().trim()));
		element.appendChild(elementnumero);

		Element elementdetalle = document.createElement(DetalleTerminoProformaConstantesFunciones.DETALLE);
		elementdetalle.appendChild(document.createTextNode(detalleterminoproforma.getdetalle().trim()));
		element.appendChild(elementdetalle);
	}
	
	public void generarReporteGroupGenericoDetalleTerminoProformasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados=new ArrayList<DetalleTerminoProforma>();
		
		detalleterminoproformasSeleccionados=this.getDetalleTerminoProformasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoDetalleTerminoProforma(detalleterminoproformasSeleccionados);
		
		this.generarReporteDetalleTerminoProformas("Todos",detalleterminoproformasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoDetalleTerminoProforma(ArrayList<DetalleTerminoProforma> detalleterminoproformasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(DetalleTerminoProforma detalleterminoproformaAux:detalleterminoproformasSeleccionados) {
				detalleterminoproformaAux.setsDetalleGeneralEntityReporte(detalleterminoproformaAux.toString());
			
				if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					detalleterminoproformaAux.setsDescripcionGeneralEntityReporte1(detalleterminoproformaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					detalleterminoproformaAux.setsDescripcionGeneralEntityReporte1(detalleterminoproformaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_IDTERMINOPROFORMA)) {
					existe=true;
					detalleterminoproformaAux.setsDescripcionGeneralEntityReporte1(detalleterminoproformaAux.getterminoproforma_descripcion());
				}
				 else if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_NUMERO)) {
					existe=true;
					detalleterminoproformaAux.setsDescripcionGeneralEntityReporte1(detalleterminoproformaAux.getnumero().toString());
				}
				 else if(sTipoSeleccionar.equals(DetalleTerminoProformaConstantesFunciones.LABEL_DETALLE)) {
					existe=true;
					detalleterminoproformaAux.setsDescripcionGeneralEntityReporte1(detalleterminoproformaAux.getdetalle());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,DetalleTerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesDetalleTerminoProforma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoDetalleTerminoProforma=true;
				this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=true;
				this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=true;
			}
			
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=true;
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
			this.isVisibilidadCeldaModificarDetalleTerminoProforma=true;
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaCancelarDetalleTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarDetalleTerminoProforma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(DetalleTerminoProformaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=true;
		} else {
			this.actualizarEstadoPanelsDetalleTerminoProforma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarDetalleTerminoProforma=false;
			//this.isVisibilidadCeldaVerFormDetalleTerminoProforma=false;
			this.isVisibilidadCeldaDuplicarDetalleTerminoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!detalleterminoproformaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
		} else {
			this.isVisibilidadCeldaNuevoDetalleTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosDetalleTerminoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!detalleterminoproformaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;												
			}
			
			this.jButtonCerrarDetalleTerminoProforma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesDetalleTerminoProforma=false;
		}
		
		if(!this.permiteMantenimiento(this.detalleterminoproforma)) {
			this.isVisibilidadCeldaActualizarDetalleTerminoProforma=false;
			this.isVisibilidadCeldaEliminarDetalleTerminoProforma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesDetalleTerminoProforma() {
	}
	
	public void actualizarEstadoPanelsDetalleTerminoProforma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionDetalleTerminoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosDetalleTerminoProforma!=null) {
				this.jScrollPanelDatosDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionDetalleTerminoProforma!=null) {
				this.jPanelPaginacionDetalleTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
					this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.detalleterminoproformaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasDetalleTerminoProforma!=null) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesDetalleTerminoProforma!=null) {
				this.jPanelParametrosReportesDetalleTerminoProforma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdTerminoProforma=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdTerminoProforma) {this.jTabbedPaneBusquedasDetalleTerminoProforma.remove(jPanelFK_IdTerminoProformaDetalleTerminoProforma);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdTerminoProforma=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdTerminoProforma) {this.jTabbedPaneBusquedasDetalleTerminoProforma.remove(jPanelFK_IdTerminoProformaDetalleTerminoProforma);}
		}
		
	}

	public void setVisibilidadBusquedasParaTerminoProforma(Boolean isParaTerminoProforma){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaTerminoProformaNegation=!isParaTerminoProforma;

			this.isVisibilidadFK_IdTerminoProforma=isParaTerminoProforma;
			if(!this.isVisibilidadFK_IdTerminoProforma) {this.jTabbedPaneBusquedasDetalleTerminoProforma.remove(jPanelFK_IdTerminoProformaDetalleTerminoProforma);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//DetalleTerminoProformaSessionBean detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		
		if(this.detalleterminoproformaSessionBean==null) {
			this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		}
		
		this.detalleterminoproformaSessionBean.setsUltimaBusquedaDetalleTerminoProforma(this.getsAccionBusqueda());
		this.detalleterminoproformaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.detalleterminoproformaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			detalleterminoproformaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			detalleterminoproformaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdTerminoProforma")) {
			detalleterminoproformaSessionBean.setid_termino_proforma(this.getid_termino_proformaFK_IdTerminoProforma());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//DetalleTerminoProformaSessionBean detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		
		if(this.detalleterminoproformaSessionBean==null) {
			this.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
		}
		
		if(this.detalleterminoproformaSessionBean.getsUltimaBusquedaDetalleTerminoProforma()!=null&&!this.detalleterminoproformaSessionBean.getsUltimaBusquedaDetalleTerminoProforma().equals("")) {
			this.setsAccionBusqueda(detalleterminoproformaSessionBean.getsUltimaBusquedaDetalleTerminoProforma());
			this.setiNumeroPaginacion(detalleterminoproformaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(detalleterminoproformaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(detalleterminoproformaSessionBean.getid_empresa());
				detalleterminoproformaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(detalleterminoproformaSessionBean.getid_sucursal());
				detalleterminoproformaSessionBean.setid_sucursal(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdTerminoProforma")) {
				this.setid_termino_proformaFK_IdTerminoProforma(detalleterminoproformaSessionBean.getid_termino_proforma());
				detalleterminoproformaSessionBean.setid_termino_proforma(-1L);
			}
		}
		
		this.detalleterminoproformaSessionBean.setsUltimaBusquedaDetalleTerminoProforma("");
		this.detalleterminoproformaSessionBean.setiNumeroPaginacion(DetalleTerminoProformaConstantesFunciones.INUMEROPAGINACION);
		this.detalleterminoproformaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioDetalleTerminoProforma() {
		this.updateBorderResaltarBusquedasFormularioDetalleTerminoProforma();
		this.updateVisibilidadBusquedasFormularioDetalleTerminoProforma();
		this.updateHabilitarBusquedasFormularioDetalleTerminoProforma();
	}
	
	public void updateBorderResaltarBusquedasFormularioDetalleTerminoProforma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponents().length>0) {
	

		if(this.detalleterminoproformaConstantesFunciones.resaltarFK_IdTerminoProformaDetalleTerminoProforma!=null) {
			index= this.jTabbedPaneBusquedasDetalleTerminoProforma.indexOfComponent(this.jPanelFK_IdTerminoProformaDetalleTerminoProforma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponent(index);
				jPanel.setBorder(this.detalleterminoproformaConstantesFunciones.resaltarFK_IdTerminoProformaDetalleTerminoProforma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioDetalleTerminoProforma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleTerminoProforma.indexOfComponent(this.jPanelFK_IdTerminoProformaDetalleTerminoProforma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarFK_IdTerminoProformaDetalleTerminoProforma);
			if(!this.detalleterminoproformaConstantesFunciones.mostrarFK_IdTerminoProformaDetalleTerminoProforma && index>-1) {
				this.jTabbedPaneBusquedasDetalleTerminoProforma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioDetalleTerminoProforma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasDetalleTerminoProforma.indexOfComponent(this.jPanelFK_IdTerminoProformaDetalleTerminoProforma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.detalleterminoproformaConstantesFunciones.activarFK_IdTerminoProformaDetalleTerminoProforma);
				this.jTabbedPaneBusquedasDetalleTerminoProforma.setEnabledAt(index,this.detalleterminoproformaConstantesFunciones.activarFK_IdTerminoProformaDetalleTerminoProforma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaDetalleTerminoProforma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdTerminoProforma")) {
			index= this.jTabbedPaneBusquedasDetalleTerminoProforma.indexOfComponent(this.jPanelFK_IdTerminoProformaDetalleTerminoProforma);

			this.jTabbedPaneBusquedasDetalleTerminoProforma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasDetalleTerminoProforma.getComponent(index);

			this.detalleterminoproformaConstantesFunciones.setResaltarFK_IdTerminoProformaDetalleTerminoProforma(resaltar);

			jPanel.setBorder(this.detalleterminoproformaConstantesFunciones.resaltarFK_IdTerminoProformaDetalleTerminoProforma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarDetalleTerminoProforma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioDetalleTerminoProforma() throws Exception {

		if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioDetalleTerminoProforma();
		this.updateVisibilidadResaltarControlesFormularioDetalleTerminoProforma();
		this.updateHabilitarResaltarControlesFormularioDetalleTerminoProforma();
		
	}
	
	public void updateBorderResaltarControlesFormularioDetalleTerminoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.detalleterminoproformaConstantesFunciones.resaltaridDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setBorder(this.detalleterminoproformaConstantesFunciones.resaltaridDetalleTerminoProforma);}
		if(this.detalleterminoproformaConstantesFunciones.resaltarid_empresaDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setBorder(this.detalleterminoproformaConstantesFunciones.resaltarid_empresaDetalleTerminoProforma);}
		if(this.detalleterminoproformaConstantesFunciones.resaltarid_sucursalDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setBorder(this.detalleterminoproformaConstantesFunciones.resaltarid_sucursalDetalleTerminoProforma);}
		if(this.detalleterminoproformaConstantesFunciones.resaltarid_termino_proformaDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setBorder(this.detalleterminoproformaConstantesFunciones.resaltarid_termino_proformaDetalleTerminoProforma);}
		if(this.detalleterminoproformaConstantesFunciones.resaltarnumeroDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setBorder(this.detalleterminoproformaConstantesFunciones.resaltarnumeroDetalleTerminoProforma);}
		if(this.detalleterminoproformaConstantesFunciones.resaltardetalleDetalleTerminoProforma!=null && this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setBorder(this.detalleterminoproformaConstantesFunciones.resaltardetalleDetalleTerminoProforma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioDetalleTerminoProforma() throws Exception {		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
	
		//this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostraridDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelidDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostraridDetalleTerminoProforma);
		//this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarid_empresaDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelid_empresaDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarid_empresaDetalleTerminoProforma);
		//this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarid_sucursalDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelid_sucursalDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarid_sucursalDetalleTerminoProforma);
		//this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarid_termino_proformaDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelid_termino_proformaDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarid_termino_proformaDetalleTerminoProforma);
		//this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarnumeroDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jPanelnumeroDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrarnumeroDetalleTerminoProforma);
		//this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrardetalleDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jPaneldetalleDetalleTerminoProforma.setVisible(this.detalleterminoproformaConstantesFunciones.mostrardetalleDetalleTerminoProforma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioDetalleTerminoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormDetalleTerminoProforma!=null) {
	
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jLabelidDetalleTerminoProforma.setEnabled(this.detalleterminoproformaConstantesFunciones.activaridDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_empresaDetalleTerminoProforma.setEnabled(this.detalleterminoproformaConstantesFunciones.activarid_empresaDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_sucursalDetalleTerminoProforma.setEnabled(this.detalleterminoproformaConstantesFunciones.activarid_sucursalDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jComboBoxid_termino_proformaDetalleTerminoProforma.setEnabled(this.detalleterminoproformaConstantesFunciones.activarid_termino_proformaDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextFieldnumeroDetalleTerminoProforma.setEnabled(this.detalleterminoproformaConstantesFunciones.activarnumeroDetalleTerminoProforma);
		this.jInternalFrameDetalleFormDetalleTerminoProforma.jTextAreadetalleDetalleTerminoProforma.setEnabled(this.detalleterminoproformaConstantesFunciones.activardetalleDetalleTerminoProforma);
		}
	}
	
		
}