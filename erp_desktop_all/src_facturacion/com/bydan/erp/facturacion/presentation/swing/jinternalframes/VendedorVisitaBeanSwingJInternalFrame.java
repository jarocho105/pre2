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

import com.bydan.erp.facturacion.util.VendedorVisitaConstantesFunciones;
import com.bydan.erp.facturacion.util.VendedorVisitaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.VendedorVisitaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.VendedorVisitaBean;
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
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.comisiones.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.facturacion.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.comisiones.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class VendedorVisitaBeanSwingJInternalFrame extends VendedorVisitaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(VendedorVisitaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<VendedorVisita> vendedorvisitaValidator = new ClassValidator<VendedorVisita>(VendedorVisita.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public VendedorVisita vendedorvisita;	
	public VendedorVisita vendedorvisitaAux;
	public VendedorVisita vendedorvisitaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public VendedorVisita vendedorvisitaTotales;
	public Long idVendedorVisitaActual;
	public Long iIdNuevoVendedorVisita=0L;
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

	public String sFinalQueryComboEjercicio="";

	public List<Ejercicio> ejerciciosForeignKey;

	public List<Ejercicio> getejerciciosForeignKey() {
		return ejerciciosForeignKey;
	}

	public void setejerciciosForeignKey(List<Ejercicio> ejerciciosForeignKey) {
		this.ejerciciosForeignKey = ejerciciosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Ejercicio ejercicioForeignKey;

	public Ejercicio getejercicioForeignKey() {
		return ejercicioForeignKey;
	}

	public void setejercicioForeignKey(Ejercicio ejercicioForeignKey) {
		this.ejercicioForeignKey = ejercicioForeignKey;
	}

	public String sFinalQueryComboPeriodo="";

	public List<Periodo> periodosForeignKey;

	public List<Periodo> getperiodosForeignKey() {
		return periodosForeignKey;
	}

	public void setperiodosForeignKey(List<Periodo> periodosForeignKey) {
		this.periodosForeignKey = periodosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Periodo periodoForeignKey;

	public Periodo getperiodoForeignKey() {
		return periodoForeignKey;
	}

	public void setperiodoForeignKey(Periodo periodoForeignKey) {
		this.periodoForeignKey = periodoForeignKey;
	}

	public String sFinalQueryComboVendedor="";

	public List<Vendedor> vendedorsForeignKey;

	public List<Vendedor> getvendedorsForeignKey() {
		return vendedorsForeignKey;
	}

	public void setvendedorsForeignKey(List<Vendedor> vendedorsForeignKey) {
		this.vendedorsForeignKey = vendedorsForeignKey;
	}

	//OBJETO FK ACTUAL
	public Vendedor vendedorForeignKey;

	public Vendedor getvendedorForeignKey() {
		return vendedorForeignKey;
	}

	public void setvendedorForeignKey(Vendedor vendedorForeignKey) {
		this.vendedorForeignKey = vendedorForeignKey;
	}

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idVendedorActual=0L;

	public Long getidVendedorActual() {
		return idVendedorActual;
	}

	public void setidVendedorActual(Long idVendedorActual) {
		this.idVendedorActual= idVendedorActual;
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
	
	public Boolean isPermisoTodoVendedorVisita;
	public Boolean isPermisoNuevoVendedorVisita;
	public Boolean isPermisoActualizarVendedorVisita;
	public Boolean isPermisoActualizarOriginalVendedorVisita;
	public Boolean isPermisoEliminarVendedorVisita;
	public Boolean isPermisoGuardarCambiosVendedorVisita;
	public Boolean isPermisoConsultaVendedorVisita;
	public Boolean isPermisoBusquedaVendedorVisita;
	public Boolean isPermisoReporteVendedorVisita;
	public Boolean isPermisoPaginacionMedioVendedorVisita;
	public Boolean isPermisoPaginacionAltoVendedorVisita;
	public Boolean isPermisoPaginacionTodoVendedorVisita;
	public Boolean isPermisoCopiarVendedorVisita;
	public Boolean isPermisoVerFormVendedorVisita;
	public Boolean isPermisoDuplicarVendedorVisita;
	public Boolean isPermisoOrdenVendedorVisita;
	
	
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
	
	public VendedorVisitaParameterReturnGeneral vendedorvisitaReturnGeneral;
	public VendedorVisitaParameterReturnGeneral vendedorvisitaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoVendedorVisita=false;
	public Boolean esParaAccionDesdeFormularioVendedorVisita=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected VendedorVisitaSessionBeanAdditional vendedorvisitaSessionBeanAdditional=null;
	
	public VendedorVisitaSessionBeanAdditional getVendedorVisitaSessionBeanAdditional() {
		return this.vendedorvisitaSessionBeanAdditional;
	}
	
	public void setVendedorVisitaSessionBeanAdditional(VendedorVisitaSessionBeanAdditional vendedorvisitaSessionBeanAdditional) {
		try {
			this.vendedorvisitaSessionBeanAdditional=vendedorvisitaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected VendedorVisitaBeanSwingJInternalFrameAdditional vendedorvisitaBeanSwingJInternalFrameAdditional=null;
	//public class VendedorVisitaBeanSwingJInternalFrame
	
	public VendedorVisitaBeanSwingJInternalFrameAdditional getVendedorVisitaBeanSwingJInternalFrameAdditional() {
		return this.vendedorvisitaBeanSwingJInternalFrameAdditional;
	}
	
	public void setVendedorVisitaBeanSwingJInternalFrameAdditional(VendedorVisitaBeanSwingJInternalFrameAdditional vendedorvisitaBeanSwingJInternalFrameAdditional) {
		try {
			this.vendedorvisitaBeanSwingJInternalFrameAdditional=vendedorvisitaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public VendedorVisitaLogic vendedorvisitaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public VendedorVisita vendedorvisitaBean;
	public VendedorVisitaConstantesFunciones vendedorvisitaConstantesFunciones;
	//public VendedorVisitaParameterReturnGeneral vendedorvisitaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public VendedorLogic vendedorLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<VendedorVisita> vendedorvisitas;	
	//public List<VendedorVisita> vendedorvisitasEliminados;
	//public List<VendedorVisita> vendedorvisitasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoVendedorVisita=false;
	public Boolean isVisibilidadCeldaDuplicarVendedorVisita=true;
	public Boolean isVisibilidadCeldaCopiarVendedorVisita=true;
	public Boolean isVisibilidadCeldaVerFormVendedorVisita=true;
	public Boolean isVisibilidadCeldaOrdenVendedorVisita=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
	public Boolean isVisibilidadCeldaModificarVendedorVisita=false;
	public Boolean isVisibilidadCeldaActualizarVendedorVisita=false;
	public Boolean isVisibilidadCeldaEliminarVendedorVisita=false;
	public Boolean isVisibilidadCeldaCancelarVendedorVisita=false;
	public Boolean isVisibilidadCeldaGuardarVendedorVisita=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosVendedorVisita=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoVendedorVisita() {
		return this.iIdNuevoVendedorVisita;
	}

	public void setiIdNuevoVendedorVisita(Long iIdNuevoVendedorVisita) {
		this.iIdNuevoVendedorVisita = iIdNuevoVendedorVisita;
	}
	
	public Long getidVendedorVisitaActual() {
		return this.idVendedorVisitaActual;
	}

	public void setidVendedorVisitaActual(Long idVendedorVisitaActual) {
		this.idVendedorVisitaActual = idVendedorVisitaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public VendedorVisita getvendedorvisita() {
		return this.vendedorvisita;
	}

	public void setvendedorvisita(VendedorVisita vendedorvisita) {
		this.vendedorvisita = vendedorvisita;
	}
	
	public VendedorVisita getvendedorvisitaAux() {
		return this.vendedorvisitaAux;
	}

	public void setvendedorvisitaAux(VendedorVisita vendedorvisitaAux) {
		this.vendedorvisitaAux = vendedorvisitaAux;
	}				
	
	public VendedorVisita getvendedorvisitaAnterior() {
		return this.vendedorvisitaAnterior;
	}

	public void setvendedorvisitaAnterior(VendedorVisita vendedorvisitaAnterior) {
		this.vendedorvisitaAnterior = vendedorvisitaAnterior;
	}	
	
	public VendedorVisita getvendedorvisitaTotales() {
		return this.vendedorvisitaTotales;
	}

	public void setvendedorvisitaTotales(VendedorVisita vendedorvisitaTotales) {
		this.vendedorvisitaTotales = vendedorvisitaTotales;
	}	
	
	public VendedorVisita getvendedorvisitaBean() {
		return this.vendedorvisitaBean;
	}

	public void setvendedorvisitaBean(VendedorVisita vendedorvisitaBean) {
		this.vendedorvisitaBean = vendedorvisitaBean;
	}	
	
	public VendedorVisitaParameterReturnGeneral getvendedorvisitaReturnGeneral() {
		return this.vendedorvisitaReturnGeneral;
	}

	public void setvendedorvisitaReturnGeneral(VendedorVisitaParameterReturnGeneral vendedorvisitaReturnGeneral) {
		this.vendedorvisitaReturnGeneral = vendedorvisitaReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
	}

	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_periodoFK_IdPeriodo=-1L;

	public Long getid_periodoFK_IdPeriodo() {
		return this.id_periodoFK_IdPeriodo;
	}

	public void setid_periodoFK_IdPeriodo(Long id_periodoFK_IdPeriodo) {
		this.id_periodoFK_IdPeriodo = id_periodoFK_IdPeriodo;
	}

	public Long id_vendedorFK_IdVendedor=-1L;

	public Long getid_vendedorFK_IdVendedor() {
		return this.id_vendedorFK_IdVendedor;
	}

	public void setid_vendedorFK_IdVendedor(Long id_vendedorFK_IdVendedor) {
		this.id_vendedorFK_IdVendedor = id_vendedorFK_IdVendedor;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public VendedorVisitaLogic getVendedorVisitaLogic()	{		
		return vendedorvisitaLogic;
	}

	public void setVendedorVisitaLogic(VendedorVisitaLogic vendedorvisitaLogic) {
		this.vendedorvisitaLogic = vendedorvisitaLogic;
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
	
	public Boolean getIsEsNuevoVendedorVisita() {
		return isEsNuevoVendedorVisita;
	}

	public void setIsEsNuevoVendedorVisita(Boolean isEsNuevoVendedorVisita) {
		this.isEsNuevoVendedorVisita = isEsNuevoVendedorVisita;
	}

	public Boolean getEsParaAccionDesdeFormularioVendedorVisita() {
		return esParaAccionDesdeFormularioVendedorVisita;
	}
	
	public void setEsParaAccionDesdeFormularioVendedorVisita(Boolean esParaAccionDesdeFormularioVendedorVisita) {
		this.esParaAccionDesdeFormularioVendedorVisita = esParaAccionDesdeFormularioVendedorVisita;
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

			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(vendedorvisitaSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEjerciciosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EjercicioLogic ejercicioLogic=new EjercicioLogic();

			//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//ejercicioLogic.getEjercicioDataAccess().setIsForForeingKeyData(true);

					ejercicioLogic.getTodosEjerciciosWithConnection(sFinalQuery,new Pagination());

					this.ejerciciosForeignKey=ejercicioLogic.getEjercicios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEjercicio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					ejercicioLogic.getEntityWithConnection(vendedorvisitaSessionBean.getlidEjercicioActual());
					this.ejerciciosForeignKey.add(ejercicioLogic.getEjercicio());
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

	public void cargarCombosPeriodosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.periodosForeignKey=new ArrayList<Periodo>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			PeriodoLogic periodoLogic=new PeriodoLogic();

			//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//periodoLogic.getPeriodoDataAccess().setIsForForeingKeyData(true);

					periodoLogic.getTodosPeriodosWithConnection(sFinalQuery,new Pagination());

					this.periodosForeignKey=periodoLogic.getPeriodos();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaPeriodo(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					periodoLogic.getEntityWithConnection(vendedorvisitaSessionBean.getlidPeriodoActual());
					this.periodosForeignKey.add(periodoLogic.getPeriodo());
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

	public void cargarCombosVendedorsForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.vendedorsForeignKey=new ArrayList<Vendedor>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			VendedorLogic vendedorLogic=new VendedorLogic();

			//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//vendedorLogic.getVendedorDataAccess().setIsForForeingKeyData(true);

					vendedorLogic.getTodosVendedorsWithConnection(sFinalQuery,new Pagination());

					this.vendedorsForeignKey=vendedorLogic.getVendedors();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaVendedor(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(vendedorvisitaSessionBean.getlidVendedorActual());
					this.vendedorsForeignKey.add(vendedorLogic.getVendedor());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(vendedorvisitaSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(vendedorvisitaSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.vendedorvisita!=null) {
						this.vendedorvisita.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaVendedorVisita.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaVendedorVisitaGenerico)throws Exception
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
				jComboBoxid_empresaVendedorVisitaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaVendedorVisitaGenerico!=null && jComboBoxid_empresaVendedorVisitaGenerico.getItemCount()>0) {
					jComboBoxid_empresaVendedorVisitaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEjercicioForeignKey(Long idEjercicioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(ejercicioTemp!=null) {

					if(this.vendedorvisita!=null) {
						this.vendedorvisita.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioVendedorVisita.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){
					if(ejercicioTemp!=null && jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita!=null) {
						jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setSelectedItem(ejercicioTemp);
					} else {
						if(jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita!=null) {
							//jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setSelectedItem(ejercicioTemp);
							if(jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.getItemCount()>0) {
								jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setSelectedIndex(0);
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

	public String getActualEjercicioForeignKeyDescripcion(Long idEjercicioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}


			sDescripcion=EjercicioConstantesFunciones.getEjercicioDescripcion(ejercicioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioTemp=null;

			for(Ejercicio ejercicioAux:ejerciciosForeignKey) {
				if(ejercicioAux.getId()!=null && ejercicioAux.getId().equals(idEjercicioSeleccionado)) {
					ejercicioTemp=ejercicioAux;
					break;
				}
			}

			if(ejercicioTemp!=null) {
				jComboBoxid_ejercicioVendedorVisitaGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioVendedorVisitaGenerico!=null && jComboBoxid_ejercicioVendedorVisitaGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioVendedorVisitaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualPeriodoForeignKey(Long idPeriodoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(periodoTemp!=null) {

					if(this.vendedorvisita!=null) {
						this.vendedorvisita.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoVendedorVisita.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setSelectedIndex(0);
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

	public String getActualPeriodoForeignKeyDescripcion(Long idPeriodoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}


			sDescripcion=PeriodoConstantesFunciones.getPeriodoDescripcion(periodoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoTemp=null;

			for(Periodo periodoAux:periodosForeignKey) {
				if(periodoAux.getId()!=null && periodoAux.getId().equals(idPeriodoSeleccionado)) {
					periodoTemp=periodoAux;
					break;
				}
			}

			if(periodoTemp!=null) {
				jComboBoxid_periodoVendedorVisitaGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoVendedorVisitaGenerico!=null && jComboBoxid_periodoVendedorVisitaGenerico.getItemCount()>0) {
					jComboBoxid_periodoVendedorVisitaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualVendedorForeignKey(Long idVendedorSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(vendedorTemp!=null) {

					if(this.vendedorvisita!=null) {
						this.vendedorvisita.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorVendedorVisita.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){
					if(vendedorTemp!=null && jComboBoxid_vendedorFK_IdVendedorVendedorVisita!=null) {
						jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setSelectedItem(vendedorTemp);
					} else {
						if(jComboBoxid_vendedorFK_IdVendedorVendedorVisita!=null) {
							//jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setSelectedItem(vendedorTemp);
							if(jComboBoxid_vendedorFK_IdVendedorVendedorVisita.getItemCount()>0) {
								jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setSelectedIndex(0);
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

	public String getActualVendedorForeignKeyDescripcion(Long idVendedorSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}


			sDescripcion=VendedorConstantesFunciones.getVendedorDescripcion(vendedorTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorTemp=null;

			for(Vendedor vendedorAux:vendedorsForeignKey) {
				if(vendedorAux.getId()!=null && vendedorAux.getId().equals(idVendedorSeleccionado)) {
					vendedorTemp=vendedorAux;
					break;
				}
			}

			if(vendedorTemp!=null) {
				jComboBoxid_vendedorVendedorVisitaGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorVendedorVisitaGenerico!=null && jComboBoxid_vendedorVendedorVisitaGenerico.getItemCount()>0) {
					jComboBoxid_vendedorVendedorVisitaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.vendedorvisita!=null) {
						this.vendedorvisita.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioVendedorVisita.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioVendedorVisitaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioVendedorVisitaGenerico!=null && jComboBoxid_anioVendedorVisitaGenerico.getItemCount()>0) {
					jComboBoxid_anioVendedorVisitaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.vendedorvisita!=null) {
						this.vendedorvisita.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesVendedorVisita.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
						if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.getItemCount()>0) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesVendedorVisitaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesVendedorVisitaGenerico!=null && jComboBoxid_mesVendedorVisitaGenerico.getItemCount()>0) {
					jComboBoxid_mesVendedorVisitaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(VendedorVisita vendedorvisita,JComboBox jComboBoxid_empresaVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaVendedorVisitaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaVendedorVisitaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				vendedorvisita.setid_empresa(empresaAux.getId());
				vendedorvisita.setempresa_descripcion(VendedorVisitaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				vendedorvisita.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(VendedorVisita vendedorvisita,JComboBox jComboBoxid_ejercicioVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioVendedorVisitaGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioVendedorVisitaGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				vendedorvisita.setid_ejercicio(ejercicioAux.getId());
				vendedorvisita.setejercicio_descripcion(VendedorVisitaConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				vendedorvisita.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(VendedorVisita vendedorvisita,JComboBox jComboBoxid_periodoVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoVendedorVisitaGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoVendedorVisitaGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				vendedorvisita.setid_periodo(periodoAux.getId());
				vendedorvisita.setperiodo_descripcion(VendedorVisitaConstantesFunciones.getPeriodoDescripcion(periodoAux));
				vendedorvisita.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(VendedorVisita vendedorvisita,JComboBox jComboBoxid_vendedorVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorVendedorVisitaGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorVendedorVisitaGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				vendedorvisita.setid_vendedor(vendedorAux.getId());
				vendedorvisita.setvendedor_descripcion(VendedorVisitaConstantesFunciones.getVendedorDescripcion(vendedorAux));
				vendedorvisita.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(VendedorVisita vendedorvisita,JComboBox jComboBoxid_anioVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioVendedorVisitaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioVendedorVisitaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				vendedorvisita.setid_anio(anioAux.getId());
				vendedorvisita.setanio_descripcion(VendedorVisitaConstantesFunciones.getAnioDescripcion(anioAux));
				vendedorvisita.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(VendedorVisita vendedorvisita,JComboBox jComboBoxid_mesVendedorVisitaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesVendedorVisitaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesVendedorVisitaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				vendedorvisita.setid_mes(mesAux.getId());
				vendedorvisita.setmes_descripcion(VendedorVisitaConstantesFunciones.getMesDescripcion(mesAux));
				vendedorvisita.setMes(mesAux);			}
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

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
					}

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEjerciciosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEjercicio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
					}

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEjercicio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.addItem(ejercicio);
							}
						}

						if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFramePeriodosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingPeriodo=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
					}

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameVendedorsForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingVendedor=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
					}

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdVendedor") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorVendedorVisita.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jComboBoxid_vendedorFK_IdVendedorVendedorVisita.addItem(vendedor);
							}
						}

						if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
					}

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormVendedorVisita!=null) { 
					}

					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

	


		public void setSelectedItemCombosFrameEmpresaForeignKey(Empresa empresa,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEjercicioForeignKey(Ejercicio ejercicio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setSelectedItem(ejercicio);
						} else {
							this.jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameVendedorForeignKey(Vendedor vendedor,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setSelectedItem(vendedor);
						} else {
							this.jComboBoxid_vendedorFK_IdVendedorVendedorVisita.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesVendedorVisita() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			VendedorVisitaConstantesFunciones.refrescarForeignKeysDescripcionesVendedorVisita(this.vendedorvisitaLogic.getVendedorVisitas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			VendedorVisitaConstantesFunciones.refrescarForeignKeysDescripcionesVendedorVisita(this.vendedorvisitas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//vendedorvisitaLogic.setVendedorVisitas(this.vendedorvisitas);
			vendedorvisitaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public VendedorVisitaParameterReturnGeneral getVendedorVisitaParameterGeneral() {
		return this.vendedorvisitaParameterGeneral;
	}
	
	public void setVendedorVisitaParameterGeneral(VendedorVisitaParameterReturnGeneral vendedorvisitaParameterGeneral) {
		this.vendedorvisitaParameterGeneral = vendedorvisitaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoVendedorVisita() {
		return isPermisoTodoVendedorVisita;
	}

	public void setIsPermisoTodoVendedorVisita(Boolean isPermisoTodoVendedorVisita) {
		this.isPermisoTodoVendedorVisita = isPermisoTodoVendedorVisita;
	}

	public Boolean getIsPermisoNuevoVendedorVisita() {
		return isPermisoNuevoVendedorVisita;
	}

	public void setIsPermisoNuevoVendedorVisita(Boolean isPermisoNuevoVendedorVisita) {
		this.isPermisoNuevoVendedorVisita = isPermisoNuevoVendedorVisita;
	}

	public Boolean getIsPermisoActualizarVendedorVisita() {
		return isPermisoActualizarVendedorVisita;
	}

	public void setIsPermisoActualizarVendedorVisita(Boolean isPermisoActualizarVendedorVisita) {
		this.isPermisoActualizarVendedorVisita = isPermisoActualizarVendedorVisita;
	}

	public Boolean getIsPermisoEliminarVendedorVisita() {
		return isPermisoEliminarVendedorVisita;
	}

	public void setIsPermisoEliminarVendedorVisita(Boolean isPermisoEliminarVendedorVisita) {
		this.isPermisoEliminarVendedorVisita = isPermisoEliminarVendedorVisita;
	}

	public Boolean getIsPermisoGuardarCambiosVendedorVisita() {
		return isPermisoGuardarCambiosVendedorVisita;
	}

	public void setIsPermisoGuardarCambiosVendedorVisita(Boolean isPermisoGuardarCambiosVendedorVisita) {
		this.isPermisoGuardarCambiosVendedorVisita = isPermisoGuardarCambiosVendedorVisita;
	}
	
	public Boolean getIsPermisoConsultaVendedorVisita() {
		return isPermisoConsultaVendedorVisita;
	}

	public void setIsPermisoConsultaVendedorVisita(Boolean isPermisoConsultaVendedorVisita) {
		this.isPermisoConsultaVendedorVisita = isPermisoConsultaVendedorVisita;
	}

	public Boolean getIsPermisoBusquedaVendedorVisita() {
		return isPermisoBusquedaVendedorVisita;
	}

	public void setIsPermisoBusquedaVendedorVisita(Boolean isPermisoBusquedaVendedorVisita) {
		this.isPermisoBusquedaVendedorVisita = isPermisoBusquedaVendedorVisita;
	}

	public Boolean getIsPermisoReporteVendedorVisita() {
		return isPermisoReporteVendedorVisita;
	}

	public void setIsPermisoReporteVendedorVisita(Boolean isPermisoReporteVendedorVisita) {
		this.isPermisoReporteVendedorVisita = isPermisoReporteVendedorVisita;
	}
	
	public Boolean getIsPermisoPaginacionMedioVendedorVisita() {
		return isPermisoPaginacionMedioVendedorVisita;
	}

	public void setIsPermisoPaginacionMedioVendedorVisita(Boolean isPermisoPaginacionMedioVendedorVisita) {
		this.isPermisoPaginacionMedioVendedorVisita = isPermisoPaginacionMedioVendedorVisita;
	}
	
	public Boolean getIsPermisoPaginacionTodoVendedorVisita() {
		return isPermisoPaginacionTodoVendedorVisita;
	}

	public void setIsPermisoPaginacionTodoVendedorVisita(Boolean isPermisoPaginacionTodoVendedorVisita) {
		this.isPermisoPaginacionTodoVendedorVisita = isPermisoPaginacionTodoVendedorVisita;
	}
	
	public Boolean getIsPermisoPaginacionAltoVendedorVisita() {
		return isPermisoPaginacionAltoVendedorVisita;
	}

	public void setIsPermisoPaginacionAltoVendedorVisita(Boolean isPermisoPaginacionAltoVendedorVisita) {
		this.isPermisoPaginacionAltoVendedorVisita = isPermisoPaginacionAltoVendedorVisita;
	}
	
	public Boolean getIsPermisoCopiarVendedorVisita() {
		return isPermisoCopiarVendedorVisita;
	}

	public void setIsPermisoCopiarVendedorVisita(Boolean isPermisoCopiarVendedorVisita) {
		this.isPermisoCopiarVendedorVisita = isPermisoCopiarVendedorVisita;
	}
	
	public Boolean getIsPermisoVerFormVendedorVisita() {
		return isPermisoVerFormVendedorVisita;
	}

	public void setIsPermisoVerFormVendedorVisita(Boolean isPermisoVerFormVendedorVisita) {
		this.isPermisoVerFormVendedorVisita = isPermisoVerFormVendedorVisita;
	}
	
	public Boolean getIsPermisoDuplicarVendedorVisita() {
		return isPermisoDuplicarVendedorVisita;
	}

	public void setIsPermisoDuplicarVendedorVisita(Boolean isPermisoDuplicarVendedorVisita) {
		this.isPermisoDuplicarVendedorVisita = isPermisoDuplicarVendedorVisita;
	}
	
	public Boolean getIsPermisoOrdenVendedorVisita() {
		return isPermisoOrdenVendedorVisita;
	}

	public void setIsPermisoOrdenVendedorVisita(Boolean isPermisoOrdenVendedorVisita) {
		this.isPermisoOrdenVendedorVisita = isPermisoOrdenVendedorVisita;
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
	
	public Boolean getIsVisibilidadCeldaNuevoVendedorVisita() {
		return isVisibilidadCeldaNuevoVendedorVisita;
	}

	public void setIsVisibilidadCeldaNuevoVendedorVisita(Boolean isVisibilidadCeldaNuevoVendedorVisita) {
		this.isVisibilidadCeldaNuevoVendedorVisita = isVisibilidadCeldaNuevoVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarVendedorVisita() {
		return isVisibilidadCeldaDuplicarVendedorVisita;
	}

	public void setIsVisibilidadCeldaDuplicarVendedorVisita(Boolean isVisibilidadCeldaDuplicarVendedorVisita) {
		this.isVisibilidadCeldaDuplicarVendedorVisita = isVisibilidadCeldaDuplicarVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarVendedorVisita() {
		return isVisibilidadCeldaCopiarVendedorVisita;
	}

	public void setIsVisibilidadCeldaCopiarVendedorVisita(Boolean isVisibilidadCeldaCopiarVendedorVisita) {
		this.isVisibilidadCeldaCopiarVendedorVisita = isVisibilidadCeldaCopiarVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormVendedorVisita() {
		return isVisibilidadCeldaVerFormVendedorVisita;
	}

	public void setIsVisibilidadCeldaVerFormVendedorVisita(Boolean isVisibilidadCeldaVerFormVendedorVisita) {
		this.isVisibilidadCeldaVerFormVendedorVisita = isVisibilidadCeldaVerFormVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenVendedorVisita() {
		return isVisibilidadCeldaOrdenVendedorVisita;
	}

	public void setIsVisibilidadCeldaOrdenVendedorVisita(Boolean isVisibilidadCeldaOrdenVendedorVisita) {
		this.isVisibilidadCeldaOrdenVendedorVisita = isVisibilidadCeldaOrdenVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesVendedorVisita() {
		return isVisibilidadCeldaNuevoRelacionesVendedorVisita;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesVendedorVisita(Boolean isVisibilidadCeldaNuevoRelacionesVendedorVisita) {
		this.isVisibilidadCeldaNuevoRelacionesVendedorVisita = isVisibilidadCeldaNuevoRelacionesVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaModificarVendedorVisita() {
		return isVisibilidadCeldaModificarVendedorVisita;
	}

	public void setIsVisibilidadCeldaModificarVendedorVisita(Boolean isVisibilidadCeldaModificarVendedorVisita) {
		this.isVisibilidadCeldaModificarVendedorVisita = isVisibilidadCeldaModificarVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarVendedorVisita() {
		return isVisibilidadCeldaActualizarVendedorVisita;
	}

	public void setIsVisibilidadCeldaActualizarVendedorVisita(Boolean isVisibilidadCeldaActualizarVendedorVisita) {
		this.isVisibilidadCeldaActualizarVendedorVisita = isVisibilidadCeldaActualizarVendedorVisita;
	}

	public Boolean getIsVisibilidadCeldaEliminarVendedorVisita() {
		return isVisibilidadCeldaEliminarVendedorVisita;
	}

	public void setIsVisibilidadCeldaEliminarVendedorVisita(Boolean isVisibilidadCeldaEliminarVendedorVisita) {
		this.isVisibilidadCeldaEliminarVendedorVisita = isVisibilidadCeldaEliminarVendedorVisita;
	}

	public Boolean getIsVisibilidadCeldaCancelarVendedorVisita() {
		return isVisibilidadCeldaCancelarVendedorVisita;
	}

	public void setIsVisibilidadCeldaCancelarVendedorVisita(Boolean isVisibilidadCeldaCancelarVendedorVisita) {
		this.isVisibilidadCeldaCancelarVendedorVisita = isVisibilidadCeldaCancelarVendedorVisita;
	}

	public Boolean getIsVisibilidadCeldaGuardarVendedorVisita() {
		return isVisibilidadCeldaGuardarVendedorVisita;
	}

	public void setIsVisibilidadCeldaGuardarVendedorVisita(Boolean isVisibilidadCeldaGuardarVendedorVisita) {
		this.isVisibilidadCeldaGuardarVendedorVisita = isVisibilidadCeldaGuardarVendedorVisita;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosVendedorVisita() {
		return isVisibilidadCeldaGuardarCambiosVendedorVisita;
	}

	public void setIsVisibilidadCeldaGuardarCambiosVendedorVisita(Boolean isVisibilidadCeldaGuardarCambiosVendedorVisita) {
		this.isVisibilidadCeldaGuardarCambiosVendedorVisita = isVisibilidadCeldaGuardarCambiosVendedorVisita;
	}
		
	public VendedorVisitaSessionBean getvendedorvisitaSessionBean() {
		return this.vendedorvisitaSessionBean;
	}
	
	public void setvendedorvisitaSessionBean(VendedorVisitaSessionBean vendedorvisitaSessionBean) {
		this.vendedorvisitaSessionBean=vendedorvisitaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
	}

	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdPeriodo() {
		return this.isVisibilidadFK_IdPeriodo;
	}

	public void setisVisibilidadFK_IdPeriodo(Boolean isVisibilidadFK_IdPeriodo) {
		this.isVisibilidadFK_IdPeriodo=isVisibilidadFK_IdPeriodo;
	}

	public Boolean getisVisibilidadFK_IdVendedor() {
		return this.isVisibilidadFK_IdVendedor;
	}

	public void setisVisibilidadFK_IdVendedor(Boolean isVisibilidadFK_IdVendedor) {
		this.isVisibilidadFK_IdVendedor=isVisibilidadFK_IdVendedor;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(VendedorVisita vendedorvisita)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(vendedorvisita,null);
				this.setActualParaGuardarEjercicioForeignKey(vendedorvisita,null);
				this.setActualParaGuardarPeriodoForeignKey(vendedorvisita,null);
				this.setActualParaGuardarVendedorForeignKey(vendedorvisita,null);
				this.setActualParaGuardarAnioForeignKey(vendedorvisita,null);
				this.setActualParaGuardarMesForeignKey(vendedorvisita,null);
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
	
	public void bugActualizarReferenciaActual(VendedorVisita vendedorvisita,VendedorVisita vendedorvisitaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalVendedorVisita(vendedorvisita);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		vendedorvisitaAux.setId(vendedorvisita.getId());
		vendedorvisitaAux.setVersionRow(vendedorvisita.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessVendedorVisita();
		
			int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = vendedorvisitaValidator.getInvalidValues(this.vendedorvisita);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			vendedorvisitaLogic.setDatosCliente(datosCliente);
			vendedorvisitaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				vendedorvisitaAux=new  VendedorVisita();
				
				vendedorvisitaAux.setIsNew(true);
				vendedorvisitaAux.setIsChanged(true);
				
				vendedorvisitaAux.setVendedorVisitaOriginal(this.vendedorvisita);
				
				vendedorvisitaAux.setId(this.vendedorvisita.getId());	
				vendedorvisitaAux.setVersionRow(this.vendedorvisita.getVersionRow());	
				vendedorvisitaAux.setid_empresa(this.vendedorvisita.getid_empresa());	
				vendedorvisitaAux.setid_ejercicio(this.vendedorvisita.getid_ejercicio());	
				vendedorvisitaAux.setid_periodo(this.vendedorvisita.getid_periodo());	
				vendedorvisitaAux.setid_vendedor(this.vendedorvisita.getid_vendedor());	
				vendedorvisitaAux.setvisita_real(this.vendedorvisita.getvisita_real());	
				vendedorvisitaAux.setvisita_propuesta(this.vendedorvisita.getvisita_propuesta());	
				vendedorvisitaAux.setid_anio(this.vendedorvisita.getid_anio());	
				vendedorvisitaAux.setid_mes(this.vendedorvisita.getid_mes());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(vendedorvisitaAux,vendedorvisitaLogic.getVendedorVisitas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorvisitaAux,vendedorvisitas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaLogic.saveVendedorVisitas();//WithConnection
						//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vendedorvisita,vendedorvisitaAux);
					
					this.refrescarForeignKeysDescripcionesVendedorVisita();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vendedorvisitaLogic.saveVendedorVisitaRelaciones(vendedorvisitaAux);//WithConnection
								//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vendedorvisita,vendedorvisitaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vendedorvisitaAux,vendedorvisitaLogic.getVendedorVisitas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vendedorvisitaAux,vendedorvisitas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vendedorvisita,vendedorvisitaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				vendedorvisitaAux=new  VendedorVisita();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado() 
					|| (this.vendedorvisitaSessionBean.getEsGuardarRelacionado() && this.vendedorvisita.getId()>=0)) {
						
					vendedorvisitaAux.setIsNew(false);
				}
				
				vendedorvisitaAux.setIsDeleted(false);
			
				vendedorvisitaAux.setId(this.vendedorvisita.getId());	
				vendedorvisitaAux.setVersionRow(this.vendedorvisita.getVersionRow());	
				vendedorvisitaAux.setid_empresa(this.vendedorvisita.getid_empresa());	
				vendedorvisitaAux.setid_ejercicio(this.vendedorvisita.getid_ejercicio());	
				vendedorvisitaAux.setid_periodo(this.vendedorvisita.getid_periodo());	
				vendedorvisitaAux.setid_vendedor(this.vendedorvisita.getid_vendedor());	
				vendedorvisitaAux.setvisita_real(this.vendedorvisita.getvisita_real());	
				vendedorvisitaAux.setvisita_propuesta(this.vendedorvisita.getvisita_propuesta());	
				vendedorvisitaAux.setid_anio(this.vendedorvisita.getid_anio());	
				vendedorvisitaAux.setid_mes(this.vendedorvisita.getid_mes());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vendedorvisitaAux,vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorvisitaAux,vendedorvisitas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaLogic.saveVendedorVisitas();//WithConnection
						//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.vendedorvisita,vendedorvisitaAux);
					
					this.refrescarForeignKeysDescripcionesVendedorVisita();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vendedorvisitaLogic.saveVendedorVisitaRelaciones(vendedorvisitaAux);//WithConnection
								//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.vendedorvisita,vendedorvisitaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(vendedorvisitaAux,vendedorvisitaLogic.getVendedorVisitas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(vendedorvisitaAux,vendedorvisitas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.vendedorvisita,vendedorvisitaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				vendedorvisitaAux=new  VendedorVisita();
				
				vendedorvisitaAux.setIsNew(false);
				vendedorvisitaAux.setIsChanged(false);
				
				vendedorvisitaAux.setIsDeleted(true);
				
				vendedorvisitaAux.setId(this.vendedorvisita.getId());	
				vendedorvisitaAux.setVersionRow(this.vendedorvisita.getVersionRow());	
				vendedorvisitaAux.setid_empresa(this.vendedorvisita.getid_empresa());	
				vendedorvisitaAux.setid_ejercicio(this.vendedorvisita.getid_ejercicio());	
				vendedorvisitaAux.setid_periodo(this.vendedorvisita.getid_periodo());	
				vendedorvisitaAux.setid_vendedor(this.vendedorvisita.getid_vendedor());	
				vendedorvisitaAux.setvisita_real(this.vendedorvisita.getvisita_real());	
				vendedorvisitaAux.setvisita_propuesta(this.vendedorvisita.getvisita_propuesta());	
				vendedorvisitaAux.setid_anio(this.vendedorvisita.getid_anio());	
				vendedorvisitaAux.setid_mes(this.vendedorvisita.getid_mes());	
				
				if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.vendedorvisitaAux.getId()>=0) {	
						this.vendedorvisitasEliminados.add(vendedorvisitaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(vendedorvisitaAux,vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorvisitaAux,vendedorvisitas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaLogic.saveVendedorVisitas();//WithConnection
						//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								vendedorvisitaLogic.saveVendedorVisitaRelaciones(vendedorvisitaAux);//WithConnection
								//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
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
							if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(vendedorvisitaAux,vendedorvisitaLogic.getVendedorVisitas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(vendedorvisitaAux,vendedorvisitas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getVendedorVisitas().addAll(this.vendedorvisitasEliminados);
					
					vendedorvisitaLogic.saveVendedorVisitas();//WithConnection
					//vendedorvisitaLogic.getSetVersionRowVendedorVisitas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesVendedorVisita();
				
				this.vendedorvisitasEliminados= new ArrayList<VendedorVisita>();		
			}
			
			if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Vendedor Visita GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.vendedorvisita=vendedorvisitaAux;
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
      		//this.finishProcessVendedorVisita();
      	}
		
	}	
	
	public void actualizarRelaciones(VendedorVisita vendedorvisitaLocal) throws Exception {
		
		if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(VendedorVisita vendedorvisitaLocal) throws Exception {	
		if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				vendedorvisitaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				vendedorvisitaLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				vendedorvisitaLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				vendedorvisitaLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				vendedorvisitaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				vendedorvisitaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarVendedorVisitaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = vendedorvisitaValidator.getInvalidValues(this.vendedorvisita);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(VendedorVisita vendedorvisita,List<VendedorVisita> vendedorvisitas) throws Exception {
		try	{		
			VendedorVisitaConstantesFunciones.actualizarLista(vendedorvisita,vendedorvisitas,this.vendedorvisitaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(VendedorVisita vendedorvisita,List<VendedorVisita> vendedorvisitas) throws Exception {
		try	{			
			VendedorVisitaConstantesFunciones.actualizarSelectedLista(vendedorvisita,vendedorvisitas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<VendedorVisita> vendedorvisitasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				vendedorvisitasLocal=this.vendedorvisitaLogic.getVendedorVisitas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				vendedorvisitasLocal=this.vendedorvisitas;
			}
			//ARCHITECTURE
		
			for(VendedorVisita vendedorvisitaLocal:vendedorvisitasLocal) {
				if(this.permiteMantenimiento(vendedorvisitaLocal) && vendedorvisitaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+VendedorVisitaConstantesFunciones.getVendedorVisitaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_empresaVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_ejercicioVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_periodoVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_vendedorVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.VISITAREAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelvisita_realVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.VISITAPROPUESTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelvisita_propuestaVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_anioVendedorVisita,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(VendedorVisitaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_mesVendedorVisita,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_empresaVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_ejercicioVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_periodoVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_vendedorVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelvisita_realVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelvisita_propuestaVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_anioVendedorVisita,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormVendedorVisita.jLabelid_mesVendedorVisita,"");
		
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
		this.iIdNuevoVendedorVisita--;	
		
		
		this.vendedorvisitaAux=new VendedorVisita();
		
		this.vendedorvisitaAux.setId(this.iIdNuevoVendedorVisita);
		this.vendedorvisitaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.vendedorvisitaLogic.getVendedorVisitas().add(this.vendedorvisitaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.vendedorvisitas.add(this.vendedorvisitaAux);
		}
		//ARCHITECTURE
		
		this.vendedorvisita=this.vendedorvisitaAux;
		
		if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioVendedorVisita(this.vendedorvisita);
			this.setVariablesObjetoActualToFormularioForeignKeyVendedorVisita(this.vendedorvisita);
		}
				
		//this.setDefaultControlesVendedorVisita();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyVendedorVisita();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyVendedorVisita();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyVendedorVisita();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVendedorVisita(this.vendedorvisitaBean,this.vendedorvisita,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(VendedorVisitaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
			classes=VendedorVisitaConstantesFunciones.getClassesRelationshipsOfVendedorVisita(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.vendedorvisitaReturnGeneral=vendedorvisitaLogic.procesarEventosVendedorVisitasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vendedorvisitaLogic.getVendedorVisitas(),this.vendedorvisita,this.vendedorvisitaParameterGeneral,this.isEsNuevoVendedorVisita,classes);//this.vendedorvisitaLogic.getVendedorVisita()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanVendedorVisita(this.vendedorvisitaReturnGeneral,this.vendedorvisitaBean,false);
		
		if(this.vendedorvisitaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita());
		}
		
		if(this.vendedorvisitaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita(),classes);//this.vendedorvisitaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyVendedorVisita();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyVendedorVisita();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.RecargarFormVendedorVisita(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingVendedorVisita(false);
						
			if(vendedorvisitaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVendedorVisita();
			}
			
			this.actualizarVisualTableDatosVendedorVisita();
			
			this.jTableDatosVendedorVisita.setRowSelectionInterval(this.getIndiceNuevoVendedorVisita(), this.getIndiceNuevoVendedorVisita());
			
			this.seleccionarFilaTablaVendedorVisitaActual();
						
			this.actualizarEstadoCeldasBotonesVendedorVisita("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesVendedorVisita(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarvisita_realVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarvisita_propuestaVendedorVisita);	
		//
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarid_empresaVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarid_ejercicioVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarid_periodoVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarid_vendedorVendedorVisita);//
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarid_anioVendedorVisita);//
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setEnabled(isHabilitar && this.vendedorvisitaConstantesFunciones.activarid_mesVendedorVisita);
	};
	
	public void setDefaultControlesVendedorVisita() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoVendedorVisita(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.vendedorvisitaSessionBean.setConGuardarRelaciones(true);			
			this.vendedorvisitaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.setVisible(true);
			
					
		} else {
			//this.vendedorvisitaSessionBean.setConGuardarRelaciones(false);			
			this.vendedorvisitaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoVendedorVisita() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
				if(vendedorvisitaAux.getId().equals(this.iIdNuevoVendedorVisita)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorVisita vendedorvisitaAux:this.vendedorvisitas) {
				if(vendedorvisitaAux.getId().equals(this.iIdNuevoVendedorVisita)) {
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
	
	public int getIndiceActualVendedorVisita(VendedorVisita vendedorvisita,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
				if(vendedorvisitaAux.getId().equals(vendedorvisita.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorVisita vendedorvisitaAux:this.vendedorvisitas) {
				if(vendedorvisitaAux.getId().equals(vendedorvisita.getId())) {
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
	
	public void setCamposBaseDesdeOriginalVendedorVisita(VendedorVisita vendedorvisitaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
				if(vendedorvisitaAux.getVendedorVisitaOriginal().getId().equals(vendedorvisitaOriginal.getId())) {
					existe=true;
					vendedorvisitaOriginal.setId(vendedorvisitaAux.getId());
					vendedorvisitaOriginal.setVersionRow(vendedorvisitaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorVisita vendedorvisitaAux:this.vendedorvisitas) {
				if(vendedorvisitaAux.getVendedorVisitaOriginal().getId().equals(vendedorvisitaOriginal.getId())) {
					existe=true;
					vendedorvisitaOriginal.setId(vendedorvisitaAux.getId());
					vendedorvisitaOriginal.setVersionRow(vendedorvisitaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosVendedorVisita(Boolean esParaCancelar) throws Exception {
		vendedorvisitasAux=new ArrayList<VendedorVisita>();
		vendedorvisitaAux=new VendedorVisita();
		
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
					if(vendedorvisitaAux.getId()<0) {
						vendedorvisitasAux.add(vendedorvisitaAux);
					}		
				}
				this.iIdNuevoVendedorVisita=0L;
				this.vendedorvisitaLogic.getVendedorVisitas().removeAll(vendedorvisitasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorVisita vendedorvisitaAux:this.vendedorvisitas) {
					if(vendedorvisitaAux.getId()<0) {
						vendedorvisitasAux.add(vendedorvisitaAux);
					}		
				}
				this.iIdNuevoVendedorVisita=0L;
				this.vendedorvisitas.removeAll(vendedorvisitasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoVendedorVisita 
					&& this.vendedorvisitaLogic.getVendedorVisitas().size()>0
					) {
					vendedorvisitaAux=this.vendedorvisitaLogic.getVendedorVisitas().get(this.vendedorvisitaLogic.getVendedorVisitas().size() - 1);
				
					if(vendedorvisitaAux.getId()<0) {
						this.vendedorvisitaLogic.getVendedorVisitas().remove(vendedorvisitaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoVendedorVisita && this.vendedorvisitas.size()>0) {
					vendedorvisitaAux=this.vendedorvisitas.get(this.vendedorvisitas.size() - 1);
				
					if(vendedorvisitaAux.getId()<0) {
						this.vendedorvisitas.remove(vendedorvisitaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoVendedorVisita(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(vendedorvisita.getId()<0) {
				this.vendedorvisitaLogic.getVendedorVisitas().remove(this.vendedorvisita);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(vendedorvisita.getId()<0) {
				this.vendedorvisitas.remove(this.vendedorvisita);
			}
		}			
	}
	
	public void setEstadosInicialesVendedorVisita(List<VendedorVisita> vendedorvisitasAux) throws Exception {
		VendedorVisitaConstantesFunciones.setEstadosInicialesVendedorVisita(vendedorvisitasAux);
	}
	
	public void setEstadosInicialesVendedorVisita(VendedorVisita vendedorvisitaAux) throws Exception {
		VendedorVisitaConstantesFunciones.setEstadosInicialesVendedorVisita(vendedorvisitaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarVendedorVisitaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesVendedorVisita("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarVendedorVisitaActual()) {
				if(!this.isEsNuevoVendedorVisita) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesVendedorVisita("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoVendedorVisita=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarVendedorVisitaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Vendedor Visita ?", "MANTENIMIENTO DE Vendedor Visita", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesVendedorVisita("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(VendedorVisita vendedorvisita) throws Exception {
		VendedorVisitaConstantesFunciones.seleccionarAsignar(this.vendedorvisita,vendedorvisita);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarVendedorVisita=this.isPermisoActualizarOriginalVendedorVisita;
			
			
			this.seleccionarAsignar(vendedorvisita);
			
			

			idVendedorActual=vendedorvisita.getid_vendedor();
			this.seleccionarVendedorActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			VendedorVisitaConstantesFunciones.quitarEspaciosVendedorVisita(this.vendedorvisita,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesVendedorVisita("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.vendedorvisitaSessionBean.setsFuncionBusquedaRapida(this.vendedorvisitaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarVendedorActual() throws Exception {
		try	{
			Vendedor vendedorAux=new Vendedor();

			if(this.idVendedorActual != null && this.idVendedorActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorLogic.getEntityWithConnection(this.idVendedorActual);
					vendedorAux= vendedorLogic.getVendedor();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				vendedorsForeignKey=new ArrayList<Vendedor>();
				vendedorsForeignKey.add(vendedorAux);
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
			if(this.isEsNuevoVendedorVisita) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosVendedorVisita(esParaCancelar);				
				this.cancelarNuevoVendedorVisita(esParaCancelar);								
			}
			
			this.vendedorvisita=new VendedorVisita();
			
			this.inicializarVendedorVisita();
			
			this.actualizarEstadoCeldasBotonesVendedorVisita("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarVendedorVisita() throws Exception {
		try {
			VendedorVisitaConstantesFunciones.inicializarVendedorVisita(this.vendedorvisita);
			
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
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.vendedorvisitaLogic.getVendedorVisitas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteVendedorVisitas(String sAccionBusqueda,List<VendedorVisita> vendedorvisitasParaReportes) throws Exception {
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
					sPathReporteFinal="VendedorVisita"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="VendedorVisitaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("VendedorVisitaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="VendedorVisita"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Vendedor Visitas");		
		parameters.put("busquedapor", VendedorVisitaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceVendedorVisita=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			VendedorVisitaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			VendedorVisitaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceVendedorVisita=new JRBeanArrayDataSource(VendedorVisitaJInternalFrame.TraerVendedorVisitaBeans(vendedorvisitasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceVendedorVisita);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+VendedorVisitaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+VendedorVisitaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(VendedorVisitaBean.TraerVendedorVisitaBeans(vendedorvisitasParaReportes).toArray()));
							
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
				this.generarExcelReporteVendedorVisitas(sAccionBusqueda,sTipoArchivoReporte,vendedorvisitasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalVendedorVisitas(sAccionBusqueda,sTipoArchivoReporte,vendedorvisitasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoVendedorVisitaActionPerformed(null);
					//this.generarExcelReporteVendedorVisitas(sAccionBusqueda,sTipoArchivoReporte,vendedorvisitasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalVendedorVisitas(sAccionBusqueda,sTipoArchivoReporte,vendedorvisitasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesVendedorVisitas(sAccionBusqueda,sTipoArchivoReporte,vendedorvisitasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesVendedorVisitas(sAccionBusqueda,sTipoArchivoReporte,vendedorvisitasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteVendedorVisitas(String sAccionBusqueda,String sTipoArchivoReporte,List<VendedorVisita> vendedorvisitasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VendedorVisitas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVendedorVisita("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(VendedorVisita vendedorvisita : vendedorvisitasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			VendedorVisitaConstantesFunciones.generarExcelReporteDataVendedorVisita("NORMAL",row,workbook,vendedorvisita,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderVendedorVisita(String sTipo,Row row,Workbook workbook) {
		
		VendedorVisitaConstantesFunciones.generarExcelReporteHeaderVendedorVisita(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalVendedorVisitas(String sAccionBusqueda,String sTipoArchivoReporte,List<VendedorVisita> vendedorvisitasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VendedorVisitas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(VendedorVisita vendedorvisita : vendedorvisitasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(VendedorVisitaConstantesFunciones.getVendedorVisitaDescripcion(vendedorvisita));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getvisita_real());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getvisita_propuesta());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(VendedorVisitaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(vendedorvisita.getmes_descripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesVendedorVisitas(String sAccionBusqueda,String sTipoArchivoReporte,List<VendedorVisita> vendedorvisitasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<VendedorVisita> vendedorvisitasRespaldo=null;
		
		classes=VendedorVisitaConstantesFunciones.getClassesRelationshipsOfVendedorVisita(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.vendedorvisitaLogic.setDatosCliente(this.datosCliente);
		this.vendedorvisitaLogic.setDatosDeep(this.datosDeep);
		this.vendedorvisitaLogic.setIsConDeep(true);
		
		vendedorvisitasRespaldo=this.vendedorvisitaLogic.getVendedorVisitas();
		
		this.vendedorvisitaLogic.setVendedorVisitas(vendedorvisitasParaReportes);	
		this.vendedorvisitaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		vendedorvisitasParaReportes=this.vendedorvisitaLogic.getVendedorVisitas();
		this.vendedorvisitaLogic.setVendedorVisitas(vendedorvisitasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("VendedorVisitas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderVendedorVisita("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(VendedorVisita vendedorvisita : vendedorvisitasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderVendedorVisita("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			VendedorVisitaConstantesFunciones.generarExcelReporteDataVendedorVisita("NORMAL",row,workbook,vendedorvisita,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(VendedorVisitaConstantesFunciones.getVendedorVisitaDescripcion(vendedorvisita));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoVendedorVisita.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessVendedorVisita() throws Exception {		
		this.startProcessVendedorVisita(true);
	}
	
	public void startProcessVendedorVisita(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasVendedorVisita ,this.jPanelParametrosReportesVendedorVisita, this.jScrollPanelDatosVendedorVisita,this.jPanelPaginacionVendedorVisita, this.jScrollPanelDatosEdicionVendedorVisita, this.jPanelAccionesVendedorVisita,this.jPanelAccionesFormularioVendedorVisita,this.jmenuBarVendedorVisita,this.jmenuBarDetalleVendedorVisita,this.jTtoolBarVendedorVisita,this.jTtoolBarDetalleVendedorVisita);		
		
		final JTabbedPane jTabbedPaneBusquedasVendedorVisita=this.jTabbedPaneBusquedasVendedorVisita; 
		
		final JPanel jPanelParametrosReportesVendedorVisita=this.jPanelParametrosReportesVendedorVisita;
		//final JScrollPane jScrollPanelDatosVendedorVisita=this.jScrollPanelDatosVendedorVisita;
		final JTable jTableDatosVendedorVisita=this.jTableDatosVendedorVisita;		
		final JPanel jPanelPaginacionVendedorVisita=this.jPanelPaginacionVendedorVisita;
		//final JScrollPane jScrollPanelDatosEdicionVendedorVisita=this.jScrollPanelDatosEdicionVendedorVisita;
		final JPanel jPanelAccionesVendedorVisita=this.jPanelAccionesVendedorVisita;
		
		JPanel jPanelCamposAuxiliarVendedorVisita=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarVendedorVisita=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			jPanelCamposAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jPanelCamposVendedorVisita;
			jPanelAccionesFormularioAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jPanelAccionesFormularioVendedorVisita;
		}
		
		final JPanel jPanelCamposVendedorVisita=jPanelCamposAuxiliarVendedorVisita;
		final JPanel jPanelAccionesFormularioVendedorVisita=jPanelAccionesFormularioAuxiliarVendedorVisita;
		
		
		final JMenuBar jmenuBarVendedorVisita=this.jmenuBarVendedorVisita;
		final JToolBar jTtoolBarVendedorVisita=this.jTtoolBarVendedorVisita;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarVendedorVisita=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVendedorVisita=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			jmenuBarDetalleAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jmenuBarDetalleVendedorVisita;
			jTtoolBarDetalleAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jTtoolBarDetalleVendedorVisita;
		}
		
		final JMenuBar jmenuBarDetalleVendedorVisita=jmenuBarDetalleAuxiliarVendedorVisita;
		final JToolBar jTtoolBarDetalleVendedorVisita=jTtoolBarDetalleAuxiliarVendedorVisita;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVendedorVisita;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVendedorVisita;
			processRunnable.jTableDatos=jTableDatosVendedorVisita;
			processRunnable.jPanelCampos=jPanelCamposVendedorVisita;
			processRunnable.jPanelPaginacion=jPanelPaginacionVendedorVisita;
			processRunnable.jPanelAcciones=jPanelAccionesVendedorVisita;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVendedorVisita;
			
			
			processRunnable.jmenuBar=jmenuBarVendedorVisita;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVendedorVisita;
			processRunnable.jTtoolBar=jTtoolBarVendedorVisita;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVendedorVisita;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVendedorVisita ,jPanelParametrosReportesVendedorVisita,jTableDatosVendedorVisita, /*jScrollPanelDatosVendedorVisita,*/jPanelCamposVendedorVisita,jPanelPaginacionVendedorVisita, /*jScrollPanelDatosEdicionVendedorVisita,*/ jPanelAccionesVendedorVisita,jPanelAccionesFormularioVendedorVisita,jmenuBarVendedorVisita,jmenuBarDetalleVendedorVisita,jTtoolBarVendedorVisita,jTtoolBarDetalleVendedorVisita);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasVendedorVisita ,jPanelParametrosReportesVendedorVisita, jScrollPanelDatosVendedorVisita,jPanelPaginacionVendedorVisita, jScrollPanelDatosEdicionVendedorVisita, jPanelAccionesVendedorVisita,jPanelAccionesFormularioVendedorVisita,jmenuBarVendedorVisita,jmenuBarDetalleVendedorVisita,jTtoolBarVendedorVisita,jTtoolBarDetalleVendedorVisita);
						
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
	
	public void finishProcessVendedorVisita() {// throws Exception 
		this.finishProcessVendedorVisita(true);
	}
	
	public void finishProcessVendedorVisita(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasVendedorVisita ,this.jPanelParametrosReportesVendedorVisita, this.jScrollPanelDatosVendedorVisita,this.jPanelPaginacionVendedorVisita, this.jScrollPanelDatosEdicionVendedorVisita, this.jPanelAccionesVendedorVisita,this.jPanelAccionesFormularioVendedorVisita,this.jmenuBarVendedorVisita,this.jmenuBarDetalleVendedorVisita,this.jTtoolBarVendedorVisita,this.jTtoolBarDetalleVendedorVisita);		
		
		final JTabbedPane jTabbedPaneBusquedasVendedorVisita=this.jTabbedPaneBusquedasVendedorVisita; 
		
		final JPanel jPanelParametrosReportesVendedorVisita=this.jPanelParametrosReportesVendedorVisita;
		//final JScrollPane jScrollPanelDatosVendedorVisita=this.jScrollPanelDatosVendedorVisita;
		final JTable jTableDatosVendedorVisita=this.jTableDatosVendedorVisita;		
		final JPanel jPanelPaginacionVendedorVisita=this.jPanelPaginacionVendedorVisita;
		//final JScrollPane jScrollPanelDatosEdicionVendedorVisita=this.jScrollPanelDatosEdicionVendedorVisita;
		final JPanel jPanelAccionesVendedorVisita=this.jPanelAccionesVendedorVisita;
		
		JPanel jPanelCamposAuxiliarVendedorVisita=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarVendedorVisita=new JPanel();
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			jPanelCamposAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jPanelCamposVendedorVisita;
			jPanelAccionesFormularioAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jPanelAccionesFormularioVendedorVisita;
		}
		
		final JPanel jPanelCamposVendedorVisita=jPanelCamposAuxiliarVendedorVisita;
		final JPanel jPanelAccionesFormularioVendedorVisita=jPanelAccionesFormularioAuxiliarVendedorVisita;
		
		
		final JMenuBar jmenuBarVendedorVisita=this.jmenuBarVendedorVisita;		
		final JToolBar jTtoolBarVendedorVisita=this.jTtoolBarVendedorVisita;
				
		JMenuBar jmenuBarDetalleAuxiliarVendedorVisita=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarVendedorVisita=new JToolBar();
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			jmenuBarDetalleAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jmenuBarDetalleVendedorVisita;
			jTtoolBarDetalleAuxiliarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jTtoolBarDetalleVendedorVisita;		
		}
		
		final JMenuBar jmenuBarDetalleVendedorVisita=jmenuBarDetalleAuxiliarVendedorVisita;
		final JToolBar jTtoolBarDetalleVendedorVisita=jTtoolBarDetalleAuxiliarVendedorVisita;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasVendedorVisita;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesVendedorVisita;
			processRunnable.jTableDatos=jTableDatosVendedorVisita;
			processRunnable.jPanelCampos=jPanelCamposVendedorVisita;
			processRunnable.jPanelPaginacion=jPanelPaginacionVendedorVisita;
			processRunnable.jPanelAcciones=jPanelAccionesVendedorVisita;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioVendedorVisita;
			
			
			processRunnable.jmenuBar=jmenuBarVendedorVisita;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleVendedorVisita;
			processRunnable.jTtoolBar=jTtoolBarVendedorVisita;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleVendedorVisita;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasVendedorVisita ,jPanelParametrosReportesVendedorVisita, jTableDatosVendedorVisita,/*jScrollPanelDatosVendedorVisita,*/jPanelCamposVendedorVisita,jPanelPaginacionVendedorVisita, /*jScrollPanelDatosEdicionVendedorVisita,*/ jPanelAccionesVendedorVisita,jPanelAccionesFormularioVendedorVisita,jmenuBarVendedorVisita,jmenuBarDetalleVendedorVisita,jTtoolBarVendedorVisita,jTtoolBarDetalleVendedorVisita));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesVendedorVisita(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarVendedorVisita(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuVendedorVisita(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarVendedorVisita(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarVendedorVisita,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleVendedorVisita,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuVendedorVisita(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarVendedorVisita,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleVendedorVisita,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.vendedorvisitaConstantesFunciones.getsFinalQueryVendedorVisita();
		String  finalQueryPaginacionTodos=this.vendedorvisitaConstantesFunciones.getsFinalQueryVendedorVisita();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=VendedorVisitaConstantesFunciones.getArrayColumnasGlobalesNoVendedorVisita(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=VendedorVisitaConstantesFunciones.getArrayColumnasGlobalesVendedorVisita(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,VendedorVisitaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.vendedorvisitasEliminados= new ArrayList<VendedorVisita>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessVendedorVisita();
		
				///*VendedorVisitaSessionBean*/this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			
			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
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
					this.iNumeroPaginacion=VendedorVisitaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=VendedorVisitaConstantesFunciones.getClassesForeignKeysOfVendedorVisita(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/vendedorvisita."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			vendedorvisitasAux= new ArrayList<VendedorVisita>();
			
				
			vendedorvisitaLogic.setDatosCliente(this.datosCliente);
			vendedorvisitaLogic.setDatosDeep(this.datosDeep);
			vendedorvisitaLogic.setIsConDeep(true);
			
			
			vendedorvisitaLogic.getVendedorVisitaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					vendedorvisitaLogic.getTodosVendedorVisitas(finalQueryGlobal,pagination);
					
					//vendedorvisitaLogic.getTodosVendedorVisitasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(vendedorvisitaLogic.getVendedorVisitas()==null|| vendedorvisitaLogic.getVendedorVisitas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vendedorvisitasAux= new ArrayList<VendedorVisita>();
							vendedorvisitasAux.addAll(vendedorvisitaLogic.getVendedorVisitas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitasAux= new ArrayList<VendedorVisita>();
							vendedorvisitasAux.addAll(vendedorvisitas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vendedorvisitaLogic.getTodosVendedorVisitas(finalQueryGlobal+"",this.pagination);												
							
							//vendedorvisitaLogic.getTodosVendedorVisitasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteVendedorVisitas("Todos",vendedorvisitaLogic.getVendedorVisitas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							vendedorvisitaLogic.setVendedorVisitas(new ArrayList<VendedorVisita>());					
							vendedorvisitaLogic.getVendedorVisitas().addAll(vendedorvisitasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitas=new ArrayList<VendedorVisita>();
							vendedorvisitas.addAll(vendedorvisitasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idVendedorVisita=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idVendedorVisita=this.idActual;
				
				} else if(this.idVendedorVisitaActual!=null && this.idVendedorVisitaActual!=0L) {
					idVendedorVisita=idVendedorVisitaActual;
				}
				
					
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndicePorId(idVendedorVisita);
				
				this.vendedorvisitas=new ArrayList<VendedorVisita>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					vendedorvisitaLogic.getEntity(idVendedorVisita);
					
					//vendedorvisitaLogic.getEntityWithConnection(idVendedorVisita);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.setVendedorVisitas(new ArrayList<VendedorVisita>());
					vendedorvisitaLogic.getVendedorVisitas().add(vendedorvisitaLogic.getVendedorVisita());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisitas=new ArrayList<VendedorVisita>();
					this.vendedorvisitas.add(vendedorvisita);
				}
				
				if(vendedorvisitaLogic.getVendedorVisita()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorvisitaLogic.getVendedorVisitasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorvisitaLogic.getVendedorVisitas()==null||vendedorvisitaLogic.getVendedorVisitas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorvisitas==null|| vendedorvisitas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitasAux=new ArrayList<VendedorVisita>();
						vendedorvisitasAux.addAll(vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitasAux=new ArrayList<VendedorVisita>();
							vendedorvisitasAux.addAll(vendedorvisitas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorvisitaLogic.getVendedorVisitasFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorVisitas("FK_IdEjercicio",vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorVisitas("FK_IdEjercicio",vendedorvisitas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaLogic.setVendedorVisitas(new ArrayList<VendedorVisita>());
						vendedorvisitaLogic.getVendedorVisitas().addAll(vendedorvisitasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitas=new ArrayList<VendedorVisita>();
							vendedorvisitas.addAll(vendedorvisitasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorvisitaLogic.getVendedorVisitasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorvisitaLogic.getVendedorVisitas()==null||vendedorvisitaLogic.getVendedorVisitas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorvisitas==null|| vendedorvisitas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitasAux=new ArrayList<VendedorVisita>();
						vendedorvisitasAux.addAll(vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitasAux=new ArrayList<VendedorVisita>();
							vendedorvisitasAux.addAll(vendedorvisitas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorvisitaLogic.getVendedorVisitasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorVisitas("FK_IdEmpresa",vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorVisitas("FK_IdEmpresa",vendedorvisitas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaLogic.setVendedorVisitas(new ArrayList<VendedorVisita>());
						vendedorvisitaLogic.getVendedorVisitas().addAll(vendedorvisitasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitas=new ArrayList<VendedorVisita>();
							vendedorvisitas.addAll(vendedorvisitasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdVendedor")) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					vendedorvisitaLogic.getVendedorVisitasFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=vendedorvisitaLogic.getVendedorVisitas()==null||vendedorvisitaLogic.getVendedorVisitas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=vendedorvisitas==null|| vendedorvisitas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitasAux=new ArrayList<VendedorVisita>();
						vendedorvisitasAux.addAll(vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitasAux=new ArrayList<VendedorVisita>();
							vendedorvisitasAux.addAll(vendedorvisitas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							vendedorvisitaLogic.getVendedorVisitasFK_IdVendedor(finalQueryGlobal,pagination,id_vendedorFK_IdVendedor);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=VendedorVisitaConstantesFunciones.getDetalleIndiceFK_IdVendedor(id_vendedorFK_IdVendedor);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteVendedorVisitas("FK_IdVendedor",vendedorvisitaLogic.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteVendedorVisitas("FK_IdVendedor",vendedorvisitas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaLogic.setVendedorVisitas(new ArrayList<VendedorVisita>());
						vendedorvisitaLogic.getVendedorVisitas().addAll(vendedorvisitasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitas=new ArrayList<VendedorVisita>();
							vendedorvisitas.addAll(vendedorvisitasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesVendedorVisita();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessVendedorVisita();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vendedorvisitaLogic.getVendedorVisitas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedorvisitas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=vendedorvisitaLogic.getVendedorVisitas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=vendedorvisitas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(VendedorVisita vendedorvisita) {
		Boolean permite=true;
		
		if(this.vendedorvisita.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=VendedorVisitaConstantesFunciones.getOrderByListaVendedorVisita();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=VendedorVisitaConstantesFunciones.getOrderByListaVendedorVisita();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorVisita vendedorvisita:vendedorvisitaLogic.getVendedorVisitas()) {
				if(vendedorvisita.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorvisitaTotales=vendedorvisita;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorVisita vendedorvisita:this.vendedorvisitas) {
				if(vendedorvisita.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorvisitaTotales=vendedorvisita;
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
			this.vendedorvisitaAux=new VendedorVisita();
			this.vendedorvisitaAux.setsType(Constantes2.S_TOTALES);
			this.vendedorvisitaAux.setIsNew(false);
			this.vendedorvisitaAux.setIsChanged(false);
			this.vendedorvisitaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				VendedorVisitaConstantesFunciones.TotalizarValoresFilaVendedorVisita(this.vendedorvisitaLogic.getVendedorVisitas(),this.vendedorvisitaAux);
				
				this.vendedorvisitaLogic.getVendedorVisitas().add(this.vendedorvisitaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				VendedorVisitaConstantesFunciones.TotalizarValoresFilaVendedorVisita(this.vendedorvisitas,this.vendedorvisitaAux);
				
				this.vendedorvisitas.add(this.vendedorvisitaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		vendedorvisitaTotales=new VendedorVisita();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vendedorvisitaLogic.getVendedorVisitas().remove(vendedorvisitaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.vendedorvisitas.remove(vendedorvisitaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		vendedorvisitaTotales=new VendedorVisita();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(VendedorVisita vendedorvisita:vendedorvisitaLogic.getVendedorVisitas()) {
				if(vendedorvisita.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorvisitaTotales=vendedorvisita;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VendedorVisitaConstantesFunciones.TotalizarValoresFilaVendedorVisita(this.vendedorvisitaLogic.getVendedorVisitas(),vendedorvisitaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(VendedorVisita vendedorvisita:this.vendedorvisitas) {
				if(vendedorvisita.getsType().equals(Constantes2.S_TOTALES)) {
					vendedorvisitaTotales=vendedorvisita;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				VendedorVisitaConstantesFunciones.TotalizarValoresFilaVendedorVisita(this.vendedorvisitas,vendedorvisitaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getVendedorVisitasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorVisitasFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorVisitasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorVisitasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorVisitasFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getVendedorVisitasFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getVendedorVisitasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.getVendedorVisitasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorVisitasFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.getVendedorVisitasFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorVisitasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.getVendedorVisitasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorVisitasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.getVendedorVisitasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorVisitasFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.getVendedorVisitasFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getVendedorVisitasFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLogic.getVendedorVisitasFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosVendedorVisita() {
		this.isPermisoTodoVendedorVisita=false;
		this.isPermisoNuevoVendedorVisita=false;
		this.isPermisoActualizarVendedorVisita=false;
		this.isPermisoActualizarOriginalVendedorVisita=false;
		this.isPermisoEliminarVendedorVisita=false;
		this.isPermisoGuardarCambiosVendedorVisita=false;
		this.isPermisoConsultaVendedorVisita=false;
		this.isPermisoBusquedaVendedorVisita=false;
		this.isPermisoReporteVendedorVisita=false;		
		this.isPermisoOrdenVendedorVisita=false;		
		this.isPermisoPaginacionMedioVendedorVisita=false;		
		this.isPermisoPaginacionAltoVendedorVisita=false;
		this.isPermisoPaginacionTodoVendedorVisita=false;
		this.isPermisoCopiarVendedorVisita=false;		
		this.isPermisoVerFormVendedorVisita=false;		
		this.isPermisoDuplicarVendedorVisita=false;		
		this.isPermisoOrdenVendedorVisita=false;		
	}
	
	public void setPermisosUsuarioVendedorVisita(Boolean isPermiso) {
		this.isPermisoTodoVendedorVisita=isPermiso;
		this.isPermisoNuevoVendedorVisita=isPermiso;
		this.isPermisoActualizarVendedorVisita=isPermiso;
		this.isPermisoActualizarOriginalVendedorVisita=isPermiso;
		this.isPermisoEliminarVendedorVisita=isPermiso;
		this.isPermisoGuardarCambiosVendedorVisita=isPermiso;
		this.isPermisoConsultaVendedorVisita=isPermiso;
		this.isPermisoBusquedaVendedorVisita=isPermiso;
		this.isPermisoReporteVendedorVisita=isPermiso;
		this.isPermisoOrdenVendedorVisita=isPermiso;		
		this.isPermisoPaginacionMedioVendedorVisita=isPermiso;		
		this.isPermisoPaginacionAltoVendedorVisita=isPermiso;		
		this.isPermisoPaginacionTodoVendedorVisita=isPermiso;		
		this.isPermisoCopiarVendedorVisita=isPermiso;		
		this.isPermisoVerFormVendedorVisita=isPermiso;		
		this.isPermisoDuplicarVendedorVisita=isPermiso;
		this.isPermisoOrdenVendedorVisita=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioVendedorVisita(Boolean isPermiso) {
		//this.isPermisoTodoVendedorVisita=isPermiso;
		this.isPermisoNuevoVendedorVisita=isPermiso;
		this.isPermisoActualizarVendedorVisita=isPermiso;
		this.isPermisoActualizarOriginalVendedorVisita=isPermiso;
		this.isPermisoEliminarVendedorVisita=isPermiso;
		this.isPermisoGuardarCambiosVendedorVisita=isPermiso;
		//this.isPermisoConsultaVendedorVisita=isPermiso;
		//this.isPermisoBusquedaVendedorVisita=isPermiso;
		//this.isPermisoReporteVendedorVisita=isPermiso;
		//this.isPermisoOrdenVendedorVisita=isPermiso;		
		//this.isPermisoPaginacionMedioVendedorVisita=isPermiso;		
		//this.isPermisoPaginacionAltoVendedorVisita=isPermiso;		
		//this.isPermisoPaginacionTodoVendedorVisita=isPermiso;		
		//this.isPermisoCopiarVendedorVisita=isPermiso;		
		//this.isPermisoDuplicarVendedorVisita=isPermiso;
		//this.isPermisoOrdenVendedorVisita=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioVendedorVisitaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(VendedorVisitaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebVendedorVisita(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioVendedorVisitaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioVendedorVisitaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionVendedorVisitaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioVendedorVisitaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioVendedorVisita() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(VendedorVisitaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, VendedorVisitaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoVendedorVisita=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarVendedorVisita=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalVendedorVisita=this.isPermisoActualizarVendedorVisita;
			this.isPermisoEliminarVendedorVisita=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosVendedorVisita=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaVendedorVisita=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaVendedorVisita=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoVendedorVisita=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteVendedorVisita=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVendedorVisita=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioVendedorVisita=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoVendedorVisita=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoVendedorVisita=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarVendedorVisita=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormVendedorVisita=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarVendedorVisita=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenVendedorVisita=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosVendedorVisita.setToolTipText(this.jTableDatosVendedorVisita.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioVendedorVisita(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioVendedorVisita(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(VendedorVisitaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(VendedorVisitaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioVendedorVisita() throws Exception {
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
	public void inicializarCombosForeignKeyVendedorVisitaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyVendedorVisitaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(VendedorVisitaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyVendedorVisitaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEjercicioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EjercicioConstantesFunciones.SFINALQUERY;

				this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=PeriodoConstantesFunciones.SFINALQUERY;

				this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedorListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=VendedorConstantesFunciones.SFINALQUERY;

				this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyVendedorVisitaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			VendedorVisitaParameterReturnGeneral vendedorvisitaReturnGeneral=new VendedorVisitaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.vendedorvisitaConstantesFunciones.cargarid_empresaVendedorVisita)
					 || (this.esRecargarFks && this.vendedorvisitaConstantesFunciones.cargarid_empresaVendedorVisita)) {

					if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+vendedorvisitaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.vendedorvisitaConstantesFunciones.cargarid_ejercicioVendedorVisita)
					 || (this.esRecargarFks && this.vendedorvisitaConstantesFunciones.cargarid_ejercicioVendedorVisita)) {

					if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+vendedorvisitaSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.vendedorvisitaConstantesFunciones.cargarid_periodoVendedorVisita)
					 || (this.esRecargarFks && this.vendedorvisitaConstantesFunciones.cargarid_periodoVendedorVisita)) {

					if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+vendedorvisitaSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.vendedorvisitaConstantesFunciones.cargarid_vendedorVendedorVisita)
					 || (this.esRecargarFks && this.vendedorvisitaConstantesFunciones.cargarid_vendedorVendedorVisita)) {

					if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+vendedorvisitaSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.vendedorvisitaConstantesFunciones.cargarid_anioVendedorVisita)
					 || (this.esRecargarFks && this.vendedorvisitaConstantesFunciones.cargarid_anioVendedorVisita)) {

					if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+vendedorvisitaSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.vendedorvisitaConstantesFunciones.cargarid_mesVendedorVisita)
					 || (this.esRecargarFks && this.vendedorvisitaConstantesFunciones.cargarid_mesVendedorVisita)) {

					if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+vendedorvisitaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				vendedorvisitaReturnGeneral=vendedorvisitaLogic.cargarCombosLoteForeignKeyVendedorVisita(finalQueryGlobalEmpresa,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalVendedor,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=vendedorvisitaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=vendedorvisitaReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=vendedorvisitaReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=vendedorvisitaReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=vendedorvisitaReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=vendedorvisitaReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyVendedorVisita()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.vendedorvisitaSessionBean==null) {
				this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
				Ejercicio ejercicio=new Ejercicio();
				EjercicioConstantesFunciones.setEjercicioDescripcion(ejercicio,Constantes.SMENSAJE_ESCOJA_OPCION);
				ejercicio.setId(null);

				if(!EjercicioConstantesFunciones.ExisteEnLista(this.ejerciciosForeignKey,ejercicio,true)) {

					this.ejerciciosForeignKey.add(0,ejercicio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyPeriodo()throws Exception {
		try {

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
				Periodo periodo=new Periodo();
				PeriodoConstantesFunciones.setPeriodoDescripcion(periodo,Constantes.SMENSAJE_ESCOJA_OPCION);
				periodo.setId(null);

				if(!PeriodoConstantesFunciones.ExisteEnLista(this.periodosForeignKey,periodo,true)) {

					this.periodosForeignKey.add(0,periodo);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyVendedor()throws Exception {
		try {

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
				Vendedor vendedor=new Vendedor();
				VendedorConstantesFunciones.setVendedorDescripcion(vendedor,Constantes.SMENSAJE_ESCOJA_OPCION);
				vendedor.setId(null);

				if(!VendedorConstantesFunciones.ExisteEnLista(this.vendedorsForeignKey,vendedor,true)) {

					this.vendedorsForeignKey.add(0,vendedor);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.vendedorvisitaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyVendedorVisita()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyVendedorVisita(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyVendedorVisita()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyVendedorVisita();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyVendedorVisita(VendedorVisita vendedorvisita)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(vendedorvisita.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(vendedorvisita.getid_periodo(),false,"Formulario");
			this.setActualVendedorForeignKey(vendedorvisita.getid_vendedor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyVendedorVisita(VendedorVisita vendedorvisita,String sTipoEvento)throws Exception {	
		try {
			
			

				if(vendedorvisita.getVendedor()!=null && !sTipoEvento.equals("id_vendedorVendedorVisita")) { //sTipoEvento Evita Bucle Infinito

					this.vendedorsForeignKey=new ArrayList<Vendedor>();
					this.vendedorsForeignKey.add(vendedorvisita.getVendedor());

					this.addItemDefectoCombosForeignKeyVendedor();
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyVendedorVisita()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.vendedorvisitaConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(this.vendedorvisitaConstantesFunciones.getid_periodo(),false,"Formulario");
			this.setActualVendedorForeignKey(this.vendedorvisitaConstantesFunciones.getid_vendedor(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyVendedorVisita()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyVendedorVisita()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyVendedorVisita()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroVendedorVisita()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyVendedorVisita()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyVendedorVisita(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyVendedorVisita()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.getItemCount()>0) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public VendedorVisitaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public VendedorVisitaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public VendedorVisitaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean(); 
		this.vendedorvisitaConstantesFunciones=new VendedorVisitaConstantesFunciones(); 
		this.vendedorvisitaBean=new VendedorVisita();//(this.vendedorvisitaConstantesFunciones); 		
		this.vendedorvisitaReturnGeneral=new VendedorVisitaParameterReturnGeneral(); 
		
		this.vendedorvisitaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.vendedorvisitaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public VendedorVisitaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public VendedorVisitaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public VendedorVisitaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessVendedorVisita(true);
			
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
			
			this.vendedorvisitaConstantesFunciones=new VendedorVisitaConstantesFunciones(); 
			this.vendedorvisitaBean=new VendedorVisita();//this.vendedorvisitaConstantesFunciones); 			
			this.vendedorvisitaReturnGeneral=new VendedorVisitaParameterReturnGeneral(); 
		
			VendedorVisitaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Vendedor Visita Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.vendedorvisita=new VendedorVisita();
			this.vendedorvisitas = new ArrayList<VendedorVisita>();
			this.vendedorvisitasAux = new ArrayList<VendedorVisita>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic=new VendedorVisitaLogic();
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			//this.vendedorvisitaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.vendedorvisitaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormVendedorVisita);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVendedorVisita);	
					}
					
					if(this.jInternalFrameImportacionVendedorVisita!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVendedorVisita);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByVendedorVisita!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByVendedorVisita);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormVendedorVisita);
				this.jInternalFrameDetalleFormVendedorVisita.setVisible(false);
				this.jInternalFrameDetalleFormVendedorVisita.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVendedorVisita);
					this.jInternalFrameReporteDinamicoVendedorVisita.setVisible(false);
					this.jInternalFrameReporteDinamicoVendedorVisita.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionVendedorVisita!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionVendedorVisita);
					this.jInternalFrameImportacionVendedorVisita.setVisible(false);
					this.jInternalFrameImportacionVendedorVisita.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByVendedorVisita!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByVendedorVisita);
					this.jInternalFrameOrderByVendedorVisita.setVisible(false);
					this.jInternalFrameOrderByVendedorVisita.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idVendedorVisitaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=VendedorVisitaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.vendedorvisitaReturnGeneral=new VendedorVisitaParameterReturnGeneral();
			
			this.vendedorvisitaParameterGeneral=new VendedorVisitaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.vendedorvisitaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(VendedorVisitaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VendedorVisitaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),this.vendedorvisitaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,VendedorVisitaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),this.vendedorvisitaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaDuplicarVendedorVisita=true;
			this.isVisibilidadCeldaCopiarVendedorVisita=true;
			this.isVisibilidadCeldaVerFormVendedorVisita=true;
			this.isVisibilidadCeldaOrdenVendedorVisita=true;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
			this.isVisibilidadCeldaModificarVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=false;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=false;
			this.isVisibilidadCeldaGuardarVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesVendedorVisita("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosVendedorVisita();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioVendedorVisita(false);
			
			this.setPermisosUsuarioVendedorVisita();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado() 
				|| (this.vendedorvisitaSessionBean.getEsGuardarRelacionado() && this.vendedorvisitaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioVendedorVisitaClasesRelacionadas();
			}
			
			if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioVendedorVisitaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosVendedorVisita();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualVendedorVisita();
			}
			
			if(!this.isPermisoBusquedaVendedorVisita) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioVendedorVisita,this.isPermisoPaginacionMedioVendedorVisita,this.isPermisoPaginacionTodoVendedorVisita);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(VendedorVisitaConstantesFunciones.getTiposSeleccionarVendedorVisita());
				
				this.tiposColumnasSelect=VendedorVisitaConstantesFunciones.getTiposSeleccionarVendedorVisita(true);
				
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
			//if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioVendedorVisita();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioVendedorVisita(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioVendedorVisita(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesVendedorVisita() ;
			
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
			this.ejercicioLogic=new EjercicioLogic();
			this.periodoLogic=new PeriodoLogic();
			this.vendedorLogic=new VendedorLogic();
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				vendedorvisitaImplementable= (VendedorVisitaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VendedorVisitaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				vendedorvisitaImplementableHome= (VendedorVisitaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+VendedorVisitaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.vendedorvisitas= new ArrayList<VendedorVisita>();
			this.vendedorvisitasEliminados= new ArrayList<VendedorVisita>();
						
			this.isEsNuevoVendedorVisita=false;
			this.esParaAccionDesdeFormularioVendedorVisita=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idVendedorActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyVendedorVisita(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroVendedorVisita();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			VendedorVisitaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=VendedorVisitaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesVendedorVisita("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingVendedorVisita(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioVendedorVisita();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioVendedorVisita();
			}
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasVendedorVisita.getTabCount(); i++) {
					this.jTabbedPaneBusquedasVendedorVisita.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasVendedorVisita.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessVendedorVisita(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga VendedorVisita: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectVendedorVisita() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesVendedorVisita")) {
				iIndex=this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessVendedorVisita();	
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
	
	public void cargarCombosForeignKeyVendedorVisita(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyVendedorVisita(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyVendedorVisita(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyVendedorVisitaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyVendedorVisita();
		
		this.cargarCombosFrameForeignKeyVendedorVisita();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyVendedorVisita();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyVendedorVisita();
		}
	}
	
	

	public void cargarCombosForeignKeyEjercicio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEjercicio(this.ejerciciosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyPeriodo(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaPeriodo(this.periodosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyVendedor(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaVendedor(this.vendedorsForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoVendedorVisitaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			
			if(jTableDatosVendedorVisita.getRowCount()>=1) {
				jTableDatosVendedorVisita.removeRowSelectionInterval(0, jTableDatosVendedorVisita.getRowCount()-1);						
			}
			
			this.isEsNuevoVendedorVisita=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoVendedorVisita(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesVendedorVisita(true);			
			//this.vendedorvisita=new VendedorVisita();
			//this.vendedorvisita.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVendedorVisita(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorVisita() ;
			
			if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVendedorVisita(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.vendedorvisita);	
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);				
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar VendedorVisita: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarVendedorVisitaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosVendedorVisita.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosVendedorVisita.getSelectedRows().length;			
			}
			
			vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoVendedorVisita--;			
				//VendedorVisita vendedorvisitaAux= new VendedorVisita();			
				//vendedorvisitaAux.setId(this.iIdNuevoVendedorVisita);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//VendedorVisita vendedorvisitaOrigen=new VendedorVisita();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(VendedorVisita vendedorvisitaOrigen : vendedorvisitasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							vendedorvisitaOrigen =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							vendedorvisitaOrigen =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaVendedorVisita();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.vendedorvisita.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosVendedorVisita(vendedorvisitaOrigen,this.vendedorvisita,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vendedorvisitaLogic.getVendedorVisitas().add(this.vendedorvisitaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vendedorvisitas.add(this.vendedorvisitaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaVendedorVisita(false);
				
				this.jTableDatosVendedorVisita.setRowSelectionInterval(this.getIndiceNuevoVendedorVisita(), this.getIndiceNuevoVendedorVisita());
				
				int iLastRow =  this.jTableDatosVendedorVisita.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVendedorVisita.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVendedorVisita.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVendedorVisita(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();									
		
			VendedorVisita vendedorvisitaOrigen=new VendedorVisita();
			VendedorVisita vendedorvisitaDestino=new VendedorVisita();
				
			vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosVendedorVisita.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || vendedorvisitasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosVendedorVisita.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaOrigen =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vendedorvisitaOrigen =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						vendedorvisitaDestino =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						vendedorvisitaDestino =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				vendedorvisitaOrigen =vendedorvisitasSeleccionados.get(0);
				vendedorvisitaDestino =vendedorvisitasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosVendedorVisita(vendedorvisitaOrigen,vendedorvisitaDestino,true,false);
				
				vendedorvisitaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(vendedorvisitaDestino,vendedorvisitaLogic.getVendedorVisitas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(vendedorvisitaDestino,vendedorvisitas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaVendedorVisita(false);
				
				//this.jTableDatosVendedorVisita.setRowSelectionInterval(this.getIndiceNuevoVendedorVisita(), this.getIndiceNuevoVendedorVisita());
				
				int iLastRow =  this.jTableDatosVendedorVisita.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosVendedorVisita.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosVendedorVisita.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaVendedorVisita(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormVendedorVisita.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesVendedorVisita.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasVendedorVisita.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesVendedorVisita.setVisible(!isVisible);
			this.jPanelPaginacionVendedorVisita.setVisible(!isVisible);
			this.jPanelAccionesVendedorVisita.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameVendedorVisita();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoVendedorVisita();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionVendedorVisita();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByVendedorVisita();
			
			this.abrirFrameOrderByVendedorVisita();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByVendedorVisita();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleVendedorVisita(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormVendedorVisita);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormVendedorVisita.isMaximum()) {
					this.jInternalFrameDetalleFormVendedorVisita.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormVendedorVisita.setSize(this.jInternalFrameDetalleFormVendedorVisita.iWidthFormulario,this.jInternalFrameDetalleFormVendedorVisita.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormVendedorVisita.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormVendedorVisita.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormVendedorVisita.isMaximum()) {
						this.jInternalFrameDetalleFormVendedorVisita.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormVendedorVisita.jContentPaneDetalleVendedorVisita.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormVendedorVisita.jContentPaneDetalleVendedorVisita.getWidth(),VendedorVisitaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormVendedorVisita.jContentPaneDetalleVendedorVisita.getWidth(),VendedorVisitaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormVendedorVisita.jContentPaneDetalleVendedorVisita.getWidth(),VendedorVisitaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormVendedorVisita.setVisible(true);
	        this.jInternalFrameDetalleFormVendedorVisita.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByVendedorVisita() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByVendedorVisita==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByVendedorVisita=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorVisita,false,this);
				} else {
					this.jInternalFrameOrderByVendedorVisita=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByVendedorVisita,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByVendedorVisita);
				this.jInternalFrameOrderByVendedorVisita.setVisible(false);
				this.jInternalFrameOrderByVendedorVisita.setSelected(false);
				
				this.jInternalFrameOrderByVendedorVisita.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVendedorVisita"));
				
				this.inicializarActualizarBindingTablaOrderByVendedorVisita();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionVendedorVisita() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionVendedorVisita==null) {
				
				this.jInternalFrameImportacionVendedorVisita=new ImportacionJInternalFrame(VendedorVisitaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionVendedorVisita);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionVendedorVisita);
				this.jInternalFrameImportacionVendedorVisita.setVisible(false);
				this.jInternalFrameImportacionVendedorVisita.setSelected(false);


				this.jInternalFrameImportacionVendedorVisita.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVendedorVisita"));
				this.jInternalFrameImportacionVendedorVisita.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVendedorVisita"));
				this.jInternalFrameImportacionVendedorVisita.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVendedorVisita"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoVendedorVisita() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoVendedorVisita==null) {
				this.jInternalFrameReporteDinamicoVendedorVisita=new ReporteDinamicoJInternalFrame(VendedorVisitaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoVendedorVisita);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoVendedorVisita);
				this.jInternalFrameReporteDinamicoVendedorVisita.setVisible(false);
				this.jInternalFrameReporteDinamicoVendedorVisita.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoVendedorVisita.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVendedorVisita"));
				this.jInternalFrameReporteDinamicoVendedorVisita.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVendedorVisita"));
				this.jInternalFrameReporteDinamicoVendedorVisita.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVendedorVisita"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVendedorVisita();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleVendedorVisita() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormVendedorVisita);
			
	       	this.jInternalFrameDetalleFormVendedorVisita.setVisible(false);
	        this.jInternalFrameDetalleFormVendedorVisita.setSelected(false);
			
			//this.jInternalFrameDetalleFormVendedorVisita.dispose();
			//this.jInternalFrameDetalleFormVendedorVisita=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoVendedorVisita() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoVendedorVisita.setVisible(true);
	        this.jInternalFrameReporteDinamicoVendedorVisita.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionVendedorVisita() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionVendedorVisita.setVisible(true);
	        this.jInternalFrameImportacionVendedorVisita.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByVendedorVisita() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByVendedorVisita.setVisible(true);
	        this.jInternalFrameOrderByVendedorVisita.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByVendedorVisita() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByVendedorVisita.setVisible(false);
	        this.jInternalFrameOrderByVendedorVisita.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoVendedorVisita() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoVendedorVisita.setVisible(false);
	        this.jInternalFrameReporteDinamicoVendedorVisita.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionVendedorVisita() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionVendedorVisita.setVisible(false);
	        this.jInternalFrameImportacionVendedorVisita.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeVendedor(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeVendedor);
						VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.sTipoBusqueda="Vendedor";
						}

						vendedorBeanSwingJInternalFrame.getTodosVendedorArbol();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVendedors(vendedorBeanSwingJInternalFrame.vendedorsArbol);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.CargarTreeVendedor();
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setVisible(true);
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						vendedorBeanSwingJInternalFrame.jInternalFrameTreeVendedor.jInternalFrameParent=this;
						TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderVendedorVisita.getTitle() + " -> Vendedor");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vendedorBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(vendedorBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeVendedor(VendedorBeanSwingJInternalFrame jInternalFrameTreeVendedor) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeVendedor);
						jInternalFrameTreeVendedor.setVisible(false);
						jInternalFrameTreeVendedor.setSelected(false);
						//jInternalFrameTreeVendedor.dispose();
						//jInternalFrameTreeVendedor=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarVendedorVisita(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarVendedorVisita(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesVendedorVisita(true);
			//this.isEsNuevoVendedorVisita=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesVendedorVisita("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVendedorVisita(false) ;
			
			if(vendedorvisitaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVendedorVisita(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorVisita(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaVendedorVisitaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarVendedorVisita(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesVendedorVisita(true);
			//this.isEsNuevoVendedorVisita=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.vendedorvisita.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesVendedorVisita("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesVendedorVisita(false) ;
			
			if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleVendedorVisita(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorVisita(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Vendedor")) {
				if(!this.vendedorvisitaConstantesFunciones.cargarid_vendedorVendedorVisita) {
					this.cargarCombosVendedorsForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingVendedorVisita(false,false);
					this.cargarCombosFrameVendedorsForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_vendedor (id);

				this.recargarComboTablaVendedor(this.vendedorsForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();

		//if(intSelectedRow<=0) {
			//ejercicioTableCellFk.setRowActual(intSelectedRow);
			//ejercicioTableCellFk.setejerciciosForeignKeyActual(ejerciciosForeignKey);
		//}


		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.RecargarEjerciciosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaPeriodo(List<Periodo> periodosForeignKey)throws Exception{
		TableColumn tableColumnPeriodo=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();

		//if(intSelectedRow<=0) {
			//periodoTableCellFk.setRowActual(intSelectedRow);
			//periodoTableCellFk.setperiodosForeignKeyActual(periodosForeignKey);
		//}


		if(periodoTableCellFk!=null) {
			periodoTableCellFk.RecargarPeriodosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaVendedor(List<Vendedor> vendedorsForeignKey)throws Exception{
		TableColumn tableColumnVendedor=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_vendedor (Long id) throws Exception {
		this.setActualVendedorForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesVendedorVisita(false);
			
			//if(!this.isEsNuevoVendedorVisita) {								
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				
			}
			
			if(this.permiteMantenimiento(this.vendedorvisita)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoVendedorVisita=true;
					this.inicializarActualizarBindingTablaVendedorVisita(false);
					this.isEsNuevoVendedorVisita=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoVendedorVisita=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoVendedorVisita=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVendedorVisita(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVendedorVisita(false);
				
				this.habilitarDeshabilitarControlesVendedorVisita(false);
			
												
				
				if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleVendedorVisita();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoVendedorVisitaActionPerformed(evt,vendedorvisitaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualVendedorVisita(this.vendedorvisita,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,vendedorvisitaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.vendedorvisita.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				this.vendedorvisita.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				this.vendedorvisita.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.vendedorvisita)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((VendedorVisitaModel) this.jTableDatosVendedorVisita.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoVendedorVisita=true;
				this.inicializarActualizarBindingTablaVendedorVisita(false);
				this.isEsNuevoVendedorVisita=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesVendedorVisita(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVendedorVisita(false);
				
				this.habilitarDeshabilitarControlesVendedorVisita(false);
				
				
				
				if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleVendedorVisita();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosVendedorVisita.getRowCount()>=1) {
				jTableDatosVendedorVisita.removeRowSelectionInterval(0, jTableDatosVendedorVisita.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesVendedorVisita(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaVendedorVisita(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesVendedorVisita(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualVendedorVisita(false) ;
			
			this.isEsNuevoVendedorVisita=false;
			
			if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleVendedorVisita();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingVendedorVisita(false);
				
				//SI ES MANUAL
				if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualVendedorVisita();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoVendedorVisita--;			
			//VendedorVisita vendedorvisitaAux= new VendedorVisita();			
			//vendedorvisitaAux.setId(this.iIdNuevoVendedorVisita);
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaVendedorVisita();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
			
			this.vendedorvisita.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.vendedorvisitaLogic.getVendedorVisitas().add(this.vendedorvisitaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.vendedorvisitas.add(this.vendedorvisitaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaVendedorVisita(false);
			
			this.jTableDatosVendedorVisita.setRowSelectionInterval(this.getIndiceNuevoVendedorVisita(), this.getIndiceNuevoVendedorVisita());
			
			int iLastRow =  this.jTableDatosVendedorVisita.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosVendedorVisita.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosVendedorVisita.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaVendedorVisita(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingVendedorVisita(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorVisita(false);
			
			//SI ES MANUAL
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVendedorVisita();
			}
			
			//this.abrirFrameTreeVendedorVisita();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Vendedor VisitaS ?", "MANTENIMIENTO DE Vendedor Visita", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionVendedorVisita.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralVendedorVisita();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.vendedorvisitaReturnGeneral=vendedorvisitaLogic.procesarImportacionVendedorVisitasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.vendedorvisitaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarVendedorVisitaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionVendedorVisita.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionVendedorVisita.setFileImportacion(this.jInternalFrameImportacionVendedorVisita.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionVendedorVisita.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionVendedorVisita.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionVendedorVisita.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionVendedorVisita.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		

		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("VendedorVisitaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"VendedorVisitaBaseDesign.jrxml";
			
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
			
			this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAREAL:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sitaReal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sitaReal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sitaReal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sitaReal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sitaPropuesta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sitaPropuesta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sitaPropuesta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sitaPropuesta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoVendedorVisita.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAREAL:
					sNombreCampoCategoria="visita_real";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA:
					sNombreCampoCategoria="visita_propuesta";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAREAL:
					sNombreCampoCategoriaValor="visita_real";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA:
					sNombreCampoCategoriaValor="visita_propuesta";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAREAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Visita Real",sNombreCampoCategoria,sNombreCampoCategoriaValor,"visita_real");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Visita Propuesta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"visita_propuesta");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
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
	
	public void jButtonGenerarExcelReporteDinamicoVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("VendedorVisitas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAREAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getvisita_real());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getvisita_propuesta());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case VendedorVisitaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(VendedorVisita vendedorvisita:vendedorvisitasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(vendedorvisita.getmes_descripcion());
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
			//	this.getFilaCabeceraExportarExcelVendedorVisita(row);				
			//	iRow++;
			//}				
			
			//for(VendedorVisita vendedorvisitaAux:vendedorvisitasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelVendedorVisita(vendedorvisitaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
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
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorVisita(false);
			
			//SI ES MANUAL
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualVendedorVisita();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorVisita(false);
			
			//SI ES MANUAL
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVendedorVisita();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingVendedorVisita(false);
			
			//SI ES MANUAL
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualVendedorVisita();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaVendedorVisita() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosVendedorVisita.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosVendedorVisita.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosVendedorVisita.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosVendedorVisita.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosVendedorVisita.setMinimumSize(dimensionMinimum);
		this.jTableDatosVendedorVisita.setMaximumSize(dimensionMaximum);
		this.jTableDatosVendedorVisita.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingVendedorVisita(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingVendedorVisita(esInicializar,true);
	}
	
	public void inicializarActualizarBindingVendedorVisita(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaVendedorVisita(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesVendedorVisita(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasVendedorVisita(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVendedorVisita(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesVendedorVisita(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualVendedorVisita() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaVendedorVisita();
		
		this.inicializarActualizarBindingBotonesManualVendedorVisita(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualVendedorVisita();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesVendedorVisita() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualVendedorVisita(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualVendedorVisita(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosVendedorVisita.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosVendedorVisita.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteVendedorVisita.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormVendedorVisita.jCheckBoxPostAccionNuevoVendedorVisita.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormVendedorVisita.jCheckBoxPostAccionSinCerrarVendedorVisita.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormVendedorVisita.jCheckBoxPostAccionSinMensajeVendedorVisita.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosVendedorVisita.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosVendedorVisita.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteVendedorVisita.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
				this.jInternalFrameDetalleFormVendedorVisita.jCheckBoxPostAccionNuevoVendedorVisita.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormVendedorVisita.jCheckBoxPostAccionSinCerrarVendedorVisita.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormVendedorVisita.jCheckBoxPostAccionSinMensajeVendedorVisita.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionVendedorVisita.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionVendedorVisita.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesVendedorVisita.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesVendedorVisita.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesVendedorVisita.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarVendedorVisita.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesVendedorVisita.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesVendedorVisita.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralVendedorVisita.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesVendedorVisita(Boolean esInicializar) throws Exception {
		try	{	
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualVendedorVisita(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesVendedorVisita() throws Exception {
		try	{
			if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualVendedorVisita();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVendedorVisita() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualVendedorVisita() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesVendedorVisita.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesVendedorVisita.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesVendedorVisita.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionVendedorVisita.addItem(reporte);
			}
			
			
			if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionVendedorVisita.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionVendedorVisita.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesVendedorVisita.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesVendedorVisita.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarVendedorVisita.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarVendedorVisita.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarVendedorVisita.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVendedorVisita();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualVendedorVisita() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
				this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
				this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
				
				if(this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoVendedorVisita.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVendedorVisita.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=VendedorVisitaConstantesFunciones.getTiposSeleccionarVendedorVisita(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=VendedorVisitaConstantesFunciones.getTiposSeleccionarVendedorVisita(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=VendedorVisitaConstantesFunciones.getTiposSeleccionarVendedorVisita(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoVendedorVisita.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoVendedorVisita.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualVendedorVisita()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.getSelectedItem()!=null){this.id_ejercicioFK_IdEjercicio=((Ejercicio)this.jComboBoxid_ejercicioFK_IdEjercicioVendedorVisita.getSelectedItem()).getId();}
		if(this.jComboBoxid_vendedorFK_IdVendedorVendedorVisita.getSelectedItem()!=null){this.id_vendedorFK_IdVendedor=((Vendedor)this.jComboBoxid_vendedorFK_IdVendedorVendedorVisita.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasVendedorVisita(Boolean esInicializar) throws Exception {				
		if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualVendedorVisita();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaVendedorVisita() throws Exception {
		this.inicializarActualizarBindingTablaVendedorVisita(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByVendedorVisita() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosVendedorVisitaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisitaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaVendedorVisita(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=vendedorvisitaLogic.getVendedorVisitas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=vendedorvisitas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosVendedorVisita.setModel(new VendedorVisitaModel(this.vendedorvisitaLogic.getVendedorVisitas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosVendedorVisita.setModel(new VendedorVisitaModel(this.vendedorvisitas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByVendedorVisita!=null && this.jInternalFrameOrderByVendedorVisita.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByVendedorVisita();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO,vendedorvisitaConstantesFunciones.resaltarSeleccionarVendedorVisita,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+VendedorVisitaConstantesFunciones.SCLASSWEBTITULO,vendedorvisitaConstantesFunciones.resaltarSeleccionarVendedorVisita,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_ID));

		if(this.vendedorvisitaConstantesFunciones.mostraridVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vendedorvisitaConstantesFunciones.resaltaridVendedorVisita,this.vendedorvisitaConstantesFunciones.activaridVendedorVisita,iSizeTabla,this,true,"idVendedorVisita","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vendedorvisitaConstantesFunciones.resaltaridVendedorVisita,this.vendedorvisitaConstantesFunciones.activaridVendedorVisita,this,true,"idVendedorVisita","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.vendedorvisitaConstantesFunciones.mostrarid_empresaVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_empresaVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_empresaVendedorVisita,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_empresaVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_empresaVendedorVisita,false,"id_empresaVendedorVisita","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.vendedorvisitaConstantesFunciones.mostrarid_ejercicioVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_ejercicioVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_ejercicioVendedorVisita,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_ejercicioVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_ejercicioVendedorVisita,true,"id_ejercicioVendedorVisita","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDPERIODO));

		if(this.vendedorvisitaConstantesFunciones.mostrarid_periodoVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_periodoVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_periodoVendedorVisita,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_periodoVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_periodoVendedorVisita,true,"id_periodoVendedorVisita","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.vendedorvisitaConstantesFunciones.mostrarid_vendedorVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_vendedorVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_vendedorVendedorVisita,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_vendedorVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_vendedorVendedorVisita,true,"id_vendedorVendedorVisita","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_VISITAREAL));

		if(this.vendedorvisitaConstantesFunciones.mostrarvisita_realVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_VISITAREAL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vendedorvisitaConstantesFunciones.resaltarvisita_realVendedorVisita,this.vendedorvisitaConstantesFunciones.activarvisita_realVendedorVisita,iSizeTabla,this,true,"visita_realVendedorVisita","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vendedorvisitaConstantesFunciones.resaltarvisita_realVendedorVisita,this.vendedorvisitaConstantesFunciones.activarvisita_realVendedorVisita,this,true,"visita_realVendedorVisita","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA));

		if(this.vendedorvisitaConstantesFunciones.mostrarvisita_propuestaVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.vendedorvisitaConstantesFunciones.resaltarvisita_propuestaVendedorVisita,this.vendedorvisitaConstantesFunciones.activarvisita_propuestaVendedorVisita,iSizeTabla,this,true,"visita_propuestaVendedorVisita","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.vendedorvisitaConstantesFunciones.resaltarvisita_propuestaVendedorVisita,this.vendedorvisitaConstantesFunciones.activarvisita_propuestaVendedorVisita,this,true,"visita_propuestaVendedorVisita","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDANIO));

		if(this.vendedorvisitaConstantesFunciones.mostrarid_anioVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_anioVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_anioVendedorVisita,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_anioVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_anioVendedorVisita,true,"id_anioVendedorVisita","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,VendedorVisitaConstantesFunciones.LABEL_IDMES));

		if(this.vendedorvisitaConstantesFunciones.mostrarid_mesVendedorVisita && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,VendedorVisitaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_mesVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_mesVendedorVisita,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.vendedorvisitaConstantesFunciones.resaltarid_mesVendedorVisita,this,this.vendedorvisitaConstantesFunciones.activarid_mesVendedorVisita,true,"id_mesVendedorVisita","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new VendedorVisitaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVendedorVisita.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosVendedorVisita.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosVendedorVisita.addColumn(tableColumn);
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
			
			this.jTableDatosVendedorVisita.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosVendedorVisita.moveColumn(this.jTableDatosVendedorVisita.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosVendedorVisita.moveColumn(this.jTableDatosVendedorVisita.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosVendedorVisita.moveColumn(this.jTableDatosVendedorVisita.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosVendedorVisita.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosVendedorVisita.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosVendedorVisita,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosVendedorVisita.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosVendedorVisita.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosVendedorVisita.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosVendedorVisita.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosVendedorVisita.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=vendedorvisitaLogic.getVendedorVisitas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=vendedorvisitas.size()-1;
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
		//this.jTableDatosVendedorVisita.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosVendedorVisita.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosVendedorVisita();
			
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
				
				//this.isEsNuevoVendedorVisita=false;
					
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
				if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormVendedorVisita==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVendedorVisita.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.vendedorvisita.getsType().equals("DUPLICADO")
				   || this.vendedorvisita.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoVendedorVisita=true;
				
				} else {
					this.isEsNuevoVendedorVisita=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
					if(this.vendedorvisita.getId()>=0 && !this.vendedorvisita.getIsNew()) {						
						this.isEsNuevoVendedorVisita=false;
						
					} else {
						this.isEsNuevoVendedorVisita=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoVendedorVisita(esRelaciones);						
				
				this.seleccionarVendedorVisita(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.vendedorvisita.getId()<0) {
					this.isEsNuevoVendedorVisita=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarVendedorVisita(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarVendedorVisita(evt,rowIndex);
				}	
				
				if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion VendedorVisita: " + this.dDif); 
					}
				}								
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarVendedorVisita(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.vendedorvisita)) {
					if(this.vendedorvisita.getId()>0) {
						this.vendedorvisita.setIsDeleted(true);
						
						this.vendedorvisitasEliminados.add(this.vendedorvisita);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.vendedorvisitaLogic.getVendedorVisitas().remove(this.vendedorvisita);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.vendedorvisitas.remove(this.vendedorvisita);				
					}
					
					
					((VendedorVisitaModel) this.jTableDatosVendedorVisita.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaVendedorVisita(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarVendedorVisita(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoVendedorVisita) {
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosVendedorVisita.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosVendedorVisita.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioVendedorVisita(this.vendedorvisita);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.vendedorvisitaConstantesFunciones.cargarid_empresaVendedorVisita || this.vendedorvisitaConstantesFunciones.event_dependid_empresaVendedorVisita) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.vendedorvisita.getid_empresa());
									//this.inicializarActualizarBindingVendedorVisita(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(vendedorvisita.getEmpresa()!=null) {
							this.empresasForeignKey.add(vendedorvisita.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.vendedorvisita.getid_empresa(),false,"Formulario");

					//Ejercicio
					if(!this.vendedorvisitaConstantesFunciones.cargarid_ejercicioVendedorVisita || this.vendedorvisitaConstantesFunciones.event_dependid_ejercicioVendedorVisita) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.vendedorvisita.getid_ejercicio());
									//this.inicializarActualizarBindingVendedorVisita(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(vendedorvisita.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(vendedorvisita.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.vendedorvisita.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.vendedorvisitaConstantesFunciones.cargarid_periodoVendedorVisita || this.vendedorvisitaConstantesFunciones.event_dependid_periodoVendedorVisita) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.vendedorvisita.getid_periodo());
									//this.inicializarActualizarBindingVendedorVisita(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(vendedorvisita.getPeriodo()!=null) {
							this.periodosForeignKey.add(vendedorvisita.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.vendedorvisita.getid_periodo(),false,"Formulario");

					//Vendedor
					if(!this.vendedorvisitaConstantesFunciones.cargarid_vendedorVendedorVisita || this.vendedorvisitaConstantesFunciones.event_dependid_vendedorVendedorVisita) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.vendedorvisita.getid_vendedor());
									//this.inicializarActualizarBindingVendedorVisita(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(vendedorvisita.getVendedor()!=null) {
							this.vendedorsForeignKey.add(vendedorvisita.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.vendedorvisita.getid_vendedor(),false,"Formulario");

					//Anio
					if(!this.vendedorvisitaConstantesFunciones.cargarid_anioVendedorVisita || this.vendedorvisitaConstantesFunciones.event_dependid_anioVendedorVisita) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.vendedorvisita.getid_anio());
									//this.inicializarActualizarBindingVendedorVisita(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(vendedorvisita.getAnio()!=null) {
							this.aniosForeignKey.add(vendedorvisita.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.vendedorvisita.getid_anio(),false,"Formulario");

					//Mes
					if(!this.vendedorvisitaConstantesFunciones.cargarid_mesVendedorVisita || this.vendedorvisitaConstantesFunciones.event_dependid_mesVendedorVisita) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.vendedorvisita.getid_mes());
									//this.inicializarActualizarBindingVendedorVisita(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(vendedorvisita.getMes()!=null) {
							this.messForeignKey.add(vendedorvisita.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.vendedorvisita.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesVendedorVisita("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesVendedorVisita(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualVendedorVisita() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoVendedorVisita(VendedorVisita vendedorvisita) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoVendedorVisita(vendedorvisita,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoVendedorVisita(VendedorVisita vendedorvisita,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioVendedorVisita(vendedorvisita);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyVendedorVisita(vendedorvisita,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyVendedorVisita(vendedorvisita);
	}
	
	public void setVariablesObjetoActualToFormularioVendedorVisita(VendedorVisita vendedorvisita) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setText(vendedorvisita.getId().toString());
			this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setText(vendedorvisita.getvisita_real().toString());
			this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setText(vendedorvisita.getvisita_propuesta().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,VendedorVisita vendedorvisitaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,vendedorvisitaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,VendedorVisita vendedorvisitaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				vendedorvisitaLocal=this.vendedorvisita;
			} else {
				vendedorvisitaLocal=this.vendedorvisitaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(vendedorvisitaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoVendedorVisita(vendedorvisitaLocal,true);
					
					if(vendedorvisitaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(vendedorvisitaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(vendedorvisitaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoVendedorVisita(VendedorVisita vendedorvisita,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVendedorVisita(vendedorvisita,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(vendedorvisita);
	}
	
	public void setVariablesFormularioToObjetoActualVendedorVisita(VendedorVisita vendedorvisita,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualVendedorVisita(vendedorvisita,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualVendedorVisita(VendedorVisita vendedorvisita,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.getText()==null || this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.getText()=="" || this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.getText()=="Id") {
				this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setText("0");
			}

			if(conColumnasBase) {vendedorvisita.setId(Long.parseLong(this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VendedorVisitaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelIdVendedorVisita,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vendedorvisita.setvisita_real(Double.parseDouble(this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VendedorVisitaConstantesFunciones.LABEL_VISITAREAL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelvisita_realVendedorVisita,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			vendedorvisita.setvisita_propuesta(Double.parseDouble(this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormVendedorVisita.jLabelvisita_propuestaVendedorVisita,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualVendedorVisita(VendedorVisita vendedorvisitaBean,VendedorVisita vendedorvisita,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosVendedorVisita(VendedorVisita vendedorvisitaOrigen,VendedorVisita vendedorvisita,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vendedorvisitaOrigen.getId()!=null && !vendedorvisitaOrigen.getId().equals(0L))) {vendedorvisita.setId(vendedorvisitaOrigen.getId());}}
			if(conDefault || (!conDefault && vendedorvisitaOrigen.getvisita_real()!=null && !vendedorvisitaOrigen.getvisita_real().equals(0.0))) {vendedorvisita.setvisita_real(vendedorvisitaOrigen.getvisita_real());}
			if(conDefault || (!conDefault && vendedorvisitaOrigen.getvisita_propuesta()!=null && !vendedorvisitaOrigen.getvisita_propuesta().equals(0.0))) {vendedorvisita.setvisita_propuesta(vendedorvisitaOrigen.getvisita_propuesta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVendedorVisita(VendedorVisita vendedorvisita) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setText(vendedorvisita.getId().toString());
			this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setText(vendedorvisita.getvisita_real().toString());
			this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setText(vendedorvisita.getvisita_propuesta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioVendedorVisita(VendedorVisitaBean vendedorvisitaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setText(vendedorvisitaBean.getId().toString());
			this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setText(vendedorvisitaBean.getvisita_real().toString());
			this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setText(vendedorvisitaBean.getvisita_propuesta().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanVendedorVisita(VendedorVisitaParameterReturnGeneral vendedorvisitaReturnGeneral,VendedorVisitaBean vendedorvisitaBean,Boolean conDefault) throws Exception { 
		try {
			VendedorVisita vendedorvisitaLocal=new VendedorVisita();
			
			vendedorvisitaLocal=vendedorvisitaReturnGeneral.getVendedorVisita();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && vendedorvisitaLocal.getId()!=null && !vendedorvisitaLocal.getId().equals(0L))) {vendedorvisitaBean.setId(vendedorvisitaLocal.getId());}}
			if(conDefault || (!conDefault && vendedorvisitaLocal.getvisita_real()!=null && !vendedorvisitaLocal.getvisita_real().equals(0.0))) {vendedorvisitaBean.setvisita_real(vendedorvisitaLocal.getvisita_real());}
			if(conDefault || (!conDefault && vendedorvisitaLocal.getvisita_propuesta()!=null && !vendedorvisitaLocal.getvisita_propuesta().equals(0.0))) {vendedorvisitaBean.setvisita_propuesta(vendedorvisitaLocal.getvisita_propuesta());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxVendedorVisitaGenerico(Long idVendedorVisitaSeleccionado,JComboBox jComboBoxVendedorVisita,List<VendedorVisita> vendedorvisitasLocal)throws Exception {
		try {
			VendedorVisita  vendedorvisitaTemp=null;

			for(VendedorVisita vendedorvisitaAux:vendedorvisitasLocal) {
				if(vendedorvisitaAux.getId()!=null && vendedorvisitaAux.getId().equals(idVendedorVisitaSeleccionado)) {
					vendedorvisitaTemp=vendedorvisitaAux;
					break;
				}
			}

			jComboBoxVendedorVisita.setSelectedItem(vendedorvisitaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxVendedorVisitaGenerico(JComboBox jComboBoxVendedorVisita,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVendedorVisita.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxVendedorVisita.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxVendedorVisita.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxVendedorVisita.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxVendedorVisita.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxVendedorVisita.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vendedorvisita=(VendedorVisita) vendedorvisitaLogic.getVendedorVisitas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vendedorvisita =(VendedorVisita) vendedorvisitas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!vendedorvisita.getIsNew() && !vendedorvisita.getIsChanged() && !vendedorvisita.getIsDeleted()) {
				sDescripcion=vendedorvisita.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorvisita.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!vendedorvisita.getIsNew() && !vendedorvisita.getIsChanged() && !vendedorvisita.getIsDeleted()) {
				sDescripcion=vendedorvisita.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorvisita.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!vendedorvisita.getIsNew() && !vendedorvisita.getIsChanged() && !vendedorvisita.getIsDeleted()) {
				sDescripcion=vendedorvisita.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorvisita.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!vendedorvisita.getIsNew() && !vendedorvisita.getIsChanged() && !vendedorvisita.getIsDeleted()) {
				sDescripcion=vendedorvisita.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorvisita.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!vendedorvisita.getIsNew() && !vendedorvisita.getIsChanged() && !vendedorvisita.getIsDeleted()) {
				sDescripcion=vendedorvisita.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorvisita.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!vendedorvisita.getIsNew() && !vendedorvisita.getIsChanged() && !vendedorvisita.getIsDeleted()) {
				sDescripcion=vendedorvisita.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=vendedorvisita.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		VendedorVisita vendedorvisitaRow=new VendedorVisita();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vendedorvisitaRow=(VendedorVisita) vendedorvisitaLogic.getVendedorVisitas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			vendedorvisitaRow=(VendedorVisita) vendedorvisitas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualVendedorVisita(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoVendedorVisita && this.isPermisoNuevoVendedorVisita));			
			this.jButtonDuplicarVendedorVisita.setVisible((this.isVisibilidadCeldaDuplicarVendedorVisita && this.isPermisoDuplicarVendedorVisita));			
			this.jButtonCopiarVendedorVisita.setVisible((this.isVisibilidadCeldaCopiarVendedorVisita && this.isPermisoCopiarVendedorVisita));
			this.jButtonVerFormVendedorVisita.setVisible((this.isVisibilidadCeldaVerFormVendedorVisita && this.isPermisoVerFormVendedorVisita));
			
			this.jButtonAbrirOrderByVendedorVisita.setVisible((this.isVisibilidadCeldaOrdenVendedorVisita && this.isPermisoOrdenVendedorVisita));			
			
			this.jButtonNuevoRelacionesVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoRelacionesVendedorVisita && this.isPermisoNuevoVendedorVisita));			
			this.jButtonNuevoGuardarCambiosVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoVendedorVisita && this.isPermisoNuevoVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarVendedorVisita.setVisible((this.isVisibilidadCeldaModificarVendedorVisita && this.isPermisoActualizarVendedorVisita));	
			this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarVendedorVisita.setVisible((this.isVisibilidadCeldaActualizarVendedorVisita && this.isPermisoActualizarVendedorVisita));	
			this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarVendedorVisita.setVisible((this.isVisibilidadCeldaEliminarVendedorVisita && this.isPermisoEliminarVendedorVisita));
			this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarVendedorVisita.setVisible(this.isVisibilidadCeldaCancelarVendedorVisita);							
			this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));			
			
			}
						
			this.jButtonGuardarCambiosTablaVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarCambiosVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoVendedorVisita && this.isPermisoNuevoVendedorVisita));						
			this.jButtonDuplicarToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaDuplicarVendedorVisita && this.isPermisoDuplicarVendedorVisita));						
			this.jButtonCopiarToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaCopiarVendedorVisita && this.isPermisoCopiarVendedorVisita));			
			this.jButtonVerFormToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaVerFormVendedorVisita && this.isPermisoVerFormVendedorVisita));			
			this.jButtonAbrirOrderByToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaOrdenVendedorVisita && this.isPermisoOrdenVendedorVisita));
			this.jButtonNuevoRelacionesToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoRelacionesVendedorVisita && this.isPermisoNuevoVendedorVisita));			
			this.jButtonNuevoGuardarCambiosToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoVendedorVisita && this.isPermisoNuevoVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));			
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaModificarVendedorVisita && this.isPermisoActualizarVendedorVisita));	
			this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaActualizarVendedorVisita  && this.isPermisoActualizarVendedorVisita));	
			this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaEliminarVendedorVisita && this.isPermisoEliminarVendedorVisita));
			this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarToolBarVendedorVisita.setVisible(this.isVisibilidadCeldaCancelarVendedorVisita);				
			this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarCambiosVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoVendedorVisita && this.isPermisoNuevoVendedorVisita));			
			this.jMenuItemDuplicarVendedorVisita.setVisible((this.isVisibilidadCeldaDuplicarVendedorVisita && this.isPermisoDuplicarVendedorVisita));			
			this.jMenuItemCopiarVendedorVisita.setVisible((this.isVisibilidadCeldaCopiarVendedorVisita && this.isPermisoCopiarVendedorVisita));			
			this.jMenuItemVerFormVendedorVisita.setVisible((this.isVisibilidadCeldaVerFormVendedorVisita && this.isPermisoVerFormVendedorVisita));			
			this.jMenuItemAbrirOrderByVendedorVisita.setVisible((this.isVisibilidadCeldaOrdenVendedorVisita && this.isPermisoOrdenVendedorVisita));			
			//this.jMenuItemMostrarOcultarVendedorVisita.setVisible((this.isVisibilidadCeldaOrdenVendedorVisita && this.isPermisoOrdenVendedorVisita));
			this.jMenuItemDetalleAbrirOrderByVendedorVisita.setVisible((this.isVisibilidadCeldaOrdenVendedorVisita && this.isPermisoOrdenVendedorVisita));			
			//this.jMenuItemDetalleMostrarOcultarVendedorVisita.setVisible((this.isVisibilidadCeldaOrdenVendedorVisita && this.isPermisoOrdenVendedorVisita));			
			this.jMenuItemNuevoRelacionesVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoRelacionesVendedorVisita && this.isPermisoNuevoVendedorVisita));			
			this.jMenuItemNuevoGuardarCambiosVendedorVisita.setVisible((this.isVisibilidadCeldaNuevoVendedorVisita && this.isPermisoNuevoVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));									
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemModificarVendedorVisita.setVisible((this.isVisibilidadCeldaModificarVendedorVisita && this.isPermisoActualizarVendedorVisita));	
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemActualizarVendedorVisita.setVisible((this.isVisibilidadCeldaActualizarVendedorVisita && this.isPermisoActualizarVendedorVisita));	
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemEliminarVendedorVisita.setVisible((this.isVisibilidadCeldaEliminarVendedorVisita && this.isPermisoEliminarVendedorVisita));
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemCancelarVendedorVisita.setVisible(this.isVisibilidadCeldaCancelarVendedorVisita);				
			}
			
			this.jMenuItemGuardarCambiosVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));						
			this.jMenuItemGuardarCambiosTablaVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarCambiosVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoVendedorVisita=this.jButtonNuevoVendedorVisita.isVisible();
			this.isVisibilidadCeldaDuplicarVendedorVisita=this.jButtonDuplicarVendedorVisita.isVisible();
			this.isVisibilidadCeldaCopiarVendedorVisita=this.jButtonCopiarVendedorVisita.isVisible();
			this.isVisibilidadCeldaVerFormVendedorVisita=this.jButtonVerFormVendedorVisita.isVisible();
			
			this.isVisibilidadCeldaOrdenVendedorVisita=this.jButtonAbrirOrderByVendedorVisita.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=this.jButtonNuevoRelacionesVendedorVisita.isVisible();
			this.isVisibilidadCeldaModificarVendedorVisita=this.jButtonModificarVendedorVisita.isVisible();
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.isVisibilidadCeldaActualizarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarVendedorVisita.isVisible();
			this.isVisibilidadCeldaEliminarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarVendedorVisita.isVisible();
			this.isVisibilidadCeldaCancelarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarVendedorVisita.isVisible();
			this.isVisibilidadCeldaGuardarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=this.jButtonGuardarCambiosTablaVendedorVisita.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoVendedorVisita=this.jButtonNuevoToolBarVendedorVisita.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=this.jButtonNuevoRelacionesToolBarVendedorVisita.isVisible();
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.isVisibilidadCeldaModificarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarToolBarVendedorVisita.isVisible();
			this.isVisibilidadCeldaActualizarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarToolBarVendedorVisita.isVisible();
			this.isVisibilidadCeldaEliminarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarToolBarVendedorVisita.isVisible();
			this.isVisibilidadCeldaCancelarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarToolBarVendedorVisita.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVendedorVisita=this.jButtonGuardarCambiosToolBarVendedorVisita.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=this.jButtonGuardarCambiosTablaToolBarVendedorVisita.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoVendedorVisita=this.jMenuItemNuevoVendedorVisita.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=this.jMenuItemNuevoRelacionesVendedorVisita.isVisible();
			
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.isVisibilidadCeldaModificarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jMenuItemModificarVendedorVisita.isVisible();
			this.isVisibilidadCeldaActualizarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jMenuItemActualizarVendedorVisita.isVisible();
			this.isVisibilidadCeldaEliminarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jMenuItemEliminarVendedorVisita.isVisible();
			this.isVisibilidadCeldaCancelarVendedorVisita=this.jInternalFrameDetalleFormVendedorVisita.jMenuItemCancelarVendedorVisita.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarVendedorVisita=this.jMenuItemGuardarCambiosVendedorVisita.isVisible();
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=this.jMenuItemGuardarCambiosTablaVendedorVisita.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesVendedorVisita(Boolean esInicializar) {
		if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
				//if(this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesVendedorVisita();
			}
			
			this.inicializarActualizarBindingBotonesManualVendedorVisita(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualVendedorVisita() {
		this.jButtonNuevoVendedorVisita.setVisible(this.isPermisoNuevoVendedorVisita);			
		this.jButtonDuplicarVendedorVisita.setVisible(this.isPermisoDuplicarVendedorVisita);			
		this.jButtonCopiarVendedorVisita.setVisible(this.isPermisoCopiarVendedorVisita);			
		this.jButtonVerFormVendedorVisita.setVisible(this.isPermisoVerFormVendedorVisita);			
		
		this.jButtonAbrirOrderByVendedorVisita.setVisible(this.isPermisoOrdenVendedorVisita);					
		
		this.jButtonNuevoRelacionesVendedorVisita.setVisible(this.isPermisoNuevoVendedorVisita);			
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarVendedorVisita.setVisible(this.isPermisoActualizarVendedorVisita);	
			this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarVendedorVisita.setVisible(this.isPermisoActualizarVendedorVisita);	
			this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarVendedorVisita.setVisible(this.isPermisoEliminarVendedorVisita);
			this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarVendedorVisita.setVisible(this.isVisibilidadCeldaCancelarVendedorVisita);						
			this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.setVisible(this.isPermisoGuardarCambiosVendedorVisita);							
		}
		
		this.jButtonGuardarCambiosTablaVendedorVisita.setVisible(this.isPermisoActualizarVendedorVisita);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleVendedorVisita() {
		this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarVendedorVisita.setVisible(this.isPermisoActualizarVendedorVisita);	
		this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarVendedorVisita.setVisible(this.isPermisoActualizarVendedorVisita);	
		this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarVendedorVisita.setVisible(this.isPermisoEliminarVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarVendedorVisita.setVisible(this.isVisibilidadCeldaCancelarVendedorVisita);							
		this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.setVisible((this.isVisibilidadCeldaGuardarVendedorVisita && this.isPermisoGuardarCambiosVendedorVisita));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosVendedorVisita() {
		if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualVendedorVisita();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesVendedorVisita() {
	}
	
	public void jTableDatosVendedorVisitaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarVendedorVisita(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.vendedorvisita.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaVendedorVisitaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebVendedorVisita(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorVisita.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.vendedorvisitaLogic.getConnexion());

				if(this.vendedorvisita.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.vendedorvisita.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderVendedorVisita.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.vendedorvisita.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioVendedorVisitaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebVendedorVisita(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorVisita.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.vendedorvisitaLogic.getConnexion());

				if(this.vendedorvisita.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.vendedorvisita.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderVendedorVisita.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.vendedorvisita.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoVendedorVisitaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebVendedorVisita(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorVisita.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.vendedorvisitaLogic.getConnexion());

				if(this.vendedorvisita.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.vendedorvisita.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderVendedorVisita.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.vendedorvisita.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorVendedorVisitaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="Vendedor";

			if(!this.sFinalQueryGeneral_vendedor.equals("")) {
				this.vendedorBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_vendedor);
				this.vendedorBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.vendedorBeanSwingJInternalFrame.procesarBusqueda(this.vendedorBeanSwingJInternalFrame.sAccionBusqueda);
				this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingVendedor(false);
			}

			if(!this.sFinalQueryComboVendedor.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderVendedorVisita=null;
			TitledBorder titledBordervendedor=null;

			if(!this.jScrollPanelDatosVendedorVisita.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderVendedorVisita.getTitle() + " -> Vendedor");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_vendedorVendedorVisitaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebVendedorVisita(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorVisita.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.vendedorvisitaLogic.getConnexion());

				if(this.vendedorvisita.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.vendedorvisita.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderVendedorVisita.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.vendedorvisita.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvisita_realVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getvisita_real()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where visita_real = "+this.vendedorvisita.getvisita_real().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvisita_propuestaVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getvisita_propuesta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where visita_propuesta = "+this.vendedorvisita.getvisita_propuesta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioVendedorVisitaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebVendedorVisita(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorVisita.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.vendedorvisitaLogic.getConnexion());

				if(this.vendedorvisita.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.vendedorvisita.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderVendedorVisita.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.vendedorvisita.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesVendedorVisitaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebVendedorVisita(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosVendedorVisita.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosVendedorVisita.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.vendedorvisitaLogic.getConnexion());

				if(this.vendedorvisita.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.vendedorvisita.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderVendedorVisita=(TitledBorder)this.jScrollPanelDatosVendedorVisita.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderVendedorVisita.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesVendedorVisitaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.getvendedorvisita(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.vendedorvisita==null) {
						this.vendedorvisita = new VendedorVisita();
					}

					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);
				}

				if(this.vendedorvisita.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.vendedorvisita.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingVendedorVisita(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorVisita(false,false);

			this.getVendedorVisitasFK_IdAnio();

			this.inicializarActualizarBindingVendedorVisita(false);

			//if(VendedorVisitaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorVisita(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEjercicioVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorVisita(false,false);

			this.getVendedorVisitasFK_IdEjercicio();

			this.inicializarActualizarBindingVendedorVisita(false);

			//if(VendedorVisitaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorVisita(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorVisita(false,false);

			this.getVendedorVisitasFK_IdEmpresa();

			this.inicializarActualizarBindingVendedorVisita(false);

			//if(VendedorVisitaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorVisita(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorVisita(false,false);

			this.getVendedorVisitasFK_IdMes();

			this.inicializarActualizarBindingVendedorVisita(false);

			//if(VendedorVisitaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorVisita(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorVisita(false,false);

			this.getVendedorVisitasFK_IdPeriodo();

			this.inicializarActualizarBindingVendedorVisita(false);

			//if(VendedorVisitaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorVisita(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorVendedorVisitaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingVendedorVisita(false,false);

			this.getVendedorVisitasFK_IdVendedor();

			this.inicializarActualizarBindingVendedorVisita(false);

			//if(VendedorVisitaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingVendedorVisita(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.vendedorvisitaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameVendedorVisita() {
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
			this.jInternalFrameDetalleFormVendedorVisita.setVisible(false);	    			
			this.jInternalFrameDetalleFormVendedorVisita.dispose();
			this.jInternalFrameDetalleFormVendedorVisita=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
			this.jInternalFrameReporteDinamicoVendedorVisita.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoVendedorVisita.dispose();
			this.jInternalFrameReporteDinamicoVendedorVisita=null;
		}
		
		if(this.jInternalFrameImportacionVendedorVisita!=null) {
			this.jInternalFrameImportacionVendedorVisita.setVisible(false);	    			
			this.jInternalFrameImportacionVendedorVisita.dispose();
			this.jInternalFrameImportacionVendedorVisita=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessVendedorVisita();
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			
			if(sTipo.equals("NuevoVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarVendedorVisita")) {
				jButtonDuplicarVendedorVisitaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarVendedorVisita")) {
				jButtonCopiarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("VerFormVendedorVisita")) {
				jButtonVerFormVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarVendedorVisita")) {
				jButtonDuplicarVendedorVisitaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarVendedorVisita")) {
				jButtonDuplicarVendedorVisitaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarVendedorVisita")) {
				jButtonModificarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarVendedorVisita")) {
				jButtonModificarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarVendedorVisita")) {
				jButtonModificarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarVendedorVisita")) {
				jButtonActualizarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarVendedorVisita")) {
				jButtonActualizarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarVendedorVisita")) {
				jButtonActualizarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("EliminarVendedorVisita")) {
				jButtonEliminarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarVendedorVisita")) {
				jButtonEliminarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarVendedorVisita")) {
				jButtonEliminarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("CancelarVendedorVisita")) {
				jButtonCancelarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarVendedorVisita")) {
				jButtonCancelarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarVendedorVisita")) {
				jButtonCancelarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("CerrarVendedorVisita")) {
				jButtonCerrarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarVendedorVisita")) {
				jButtonCerrarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarVendedorVisita")) {
				jButtonCerrarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarVendedorVisita")) {
				jButtonMostrarOcultarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarVendedorVisita")) {
				jButtonCancelarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarVendedorVisita")) {
				jButtonCopiarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarVendedorVisita")) {
				jButtonVerFormVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarVendedorVisita")) {
				jButtonCopiarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormVendedorVisita")) {
				jButtonVerFormVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionVendedorVisita")) {
				jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarVendedorVisita")) {
				jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionVendedorVisita")) {
				jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresVendedorVisita")) {
				jButtonAnterioresVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarVendedorVisita")) {
				jButtonAnterioresVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreVendedorVisita")) {
				jButtonAnterioresVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesVendedorVisita")) {
				jButtonSiguientesVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarVendedorVisita")) {
				jButtonSiguientesVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesVendedorVisita")) {
				jButtonSiguientesVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByVendedorVisita") || sTipo.equals("MenuItemDetalleAbrirOrderByVendedorVisita")) {
				jButtonAbrirOrderByVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarVendedorVisita") || sTipo.equals("MenuItemDetalleMostrarOcultarVendedorVisita")) {
				jButtonMostrarOcultarVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosVendedorVisita")) {
				jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarVendedorVisita")) {
				jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosVendedorVisita")) {
				jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoVendedorVisita")) {
				jButtonCerrarReporteDinamicoVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoVendedorVisita")) {
				jButtonGenerarReporteDinamicoVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoVendedorVisita")) {
				
				jButtonGenerarExcelReporteDinamicoVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionVendedorVisita")) {
				jButtonCerrarImportacionVendedorVisitaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionVendedorVisita")) {
				
				jButtonGenerarImportacionVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionVendedorVisita")) {
				
				jButtonAbrirImportacionVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesVendedorVisita")) {
				jComboBoxTiposAccionesVendedorVisitaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesVendedorVisita")) {
				jComboBoxTiposRelacionesVendedorVisitaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioVendedorVisita")) {
				jComboBoxTiposAccionesVendedorVisitaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarVendedorVisita")) {
				
				jComboBoxTiposSeleccionarVendedorVisitaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralVendedorVisita")) {
				jTextFieldValorCampoGeneralVendedorVisitaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByVendedorVisita")) {
				jButtonAbrirOrderByVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarVendedorVisita")) {
				jButtonAbrirOrderByVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByVendedorVisita")) {
				jButtonCerrarOrderByVendedorVisitaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVendedorVisitaBusqueda")) {
				this.jButtonidVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVendedorVisitaUpdate")) {
				this.jButtonid_empresaVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVendedorVisitaBusqueda")) {
				this.jButtonid_empresaVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioVendedorVisitaUpdate")) {
				this.jButtonid_ejercicioVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioVendedorVisitaBusqueda")) {
				this.jButtonid_ejercicioVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoVendedorVisitaUpdate")) {
				this.jButtonid_periodoVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoVendedorVisitaBusqueda")) {
				this.jButtonid_periodoVendedorVisitaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisita")) {
				this.jButtonid_vendedorVendedorVisitaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisitaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisitaUpdate")) {
				this.jButtonid_vendedorVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisitaBusqueda")) {
				this.jButtonid_vendedorVendedorVisitaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("visita_realVendedorVisitaBusqueda")) {
				this.jButtonvisita_realVendedorVisitaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("visita_propuestaVendedorVisitaBusqueda")) {
				this.jButtonvisita_propuestaVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioVendedorVisitaUpdate")) {
				this.jButtonid_anioVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioVendedorVisitaBusqueda")) {
				this.jButtonid_anioVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesVendedorVisitaUpdate")) {
				this.jButtonid_mesVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesVendedorVisitaBusqueda")) {
				this.jButtonid_mesVendedorVisitaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_vendedorVendedorVisita")) {
				this.jButtonid_vendedorVendedorVisitaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEjercicioVendedorVisita")) {
				this.jButtonFK_IdEjercicioVendedorVisitaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdVendedorVendedorVisita")) {
				this.jButtonFK_IdVendedorVendedorVisitaActionPerformed(evt);
			}
			
			;
			
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessVendedorVisita();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			VendedorVisita vendedorvisitaLocal=null;
			
			if(!this.getEsControlTabla()) {
				vendedorvisitaLocal=this.vendedorvisita;
			} else {
				vendedorvisitaLocal=this.vendedorvisitaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
							
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
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
			
			


			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
								
						
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
								
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
							
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
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
			
			


			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
								
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
			
			this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosVendedorVisita")) {
					jCheckBoxSeleccionarTodosVendedorVisitaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosVendedorVisita")) {
					jCheckBoxSeleccionadosVendedorVisitaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarVendedorVisita")) {
					
				}
				
				


				
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
												
				
				


				
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
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
			
			


			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaVendedorVisitaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.vendedorvisita);
				
				this.actualizarInformacion("INFO_PADRE",false,this.vendedorvisita);
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
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
				
				


				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(VendedorVisita.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",VendedorVisita.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaVendedorVisitaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.vendedorvisitaAnterior =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarVendedorVisita")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosVendedorVisitaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosVendedorVisita.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.vendedorvisita =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.vendedorvisita =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.vendedorvisita);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarVendedorVisita")) {
				
				}
				
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarVendedorVisita")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosVendedorVisita.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarVendedorVisita")) {
			
			}
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessVendedorVisita();
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			if(sTipo.equals("NuevoVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarVendedorVisita")) {
				jButtonDuplicarVendedorVisitaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarVendedorVisita")) {
				jButtonCopiarVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormVendedorVisita")) {
				jButtonVerFormVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesVendedorVisita")) {
				jButtonNuevoVendedorVisitaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarVendedorVisita")) {
				jButtonModificarVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarVendedorVisita")) {
				jButtonActualizarVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarVendedorVisita")) {
				jButtonEliminarVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarVendedorVisita")) {
				jButtonCancelarVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarVendedorVisita")) {
				jButtonCerrarVendedorVisitaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosVendedorVisita")) {
				jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosVendedorVisita")) {
				jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByVendedorVisita")) {
				jButtonAbrirOrderByVendedorVisitaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionVendedorVisita")) {
				jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresVendedorVisita")) {
				jButtonAnterioresVendedorVisitaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesVendedorVisita")) {
				jButtonSiguientesVendedorVisitaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idVendedorVisitaBusqueda")) {
				this.jButtonidVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaVendedorVisitaUpdate")) {
				this.jButtonid_empresaVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaVendedorVisitaBusqueda")) {
				this.jButtonid_empresaVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioVendedorVisitaUpdate")) {
				this.jButtonid_ejercicioVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioVendedorVisitaBusqueda")) {
				this.jButtonid_ejercicioVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoVendedorVisitaUpdate")) {
				this.jButtonid_periodoVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoVendedorVisitaBusqueda")) {
				this.jButtonid_periodoVendedorVisitaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisita")) {
				this.jButtonid_vendedorVendedorVisitaActionPerformed(evt);
			}
			//BUSQUEDA ARBOL CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisitaArbol")) {
				this.abrirFrameTreeVendedor("BUSQUEDA_FK");
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisitaUpdate")) {
				this.jButtonid_vendedorVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorVendedorVisitaBusqueda")) {
				this.jButtonid_vendedorVendedorVisitaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("visita_realVendedorVisitaBusqueda")) {
				this.jButtonvisita_realVendedorVisitaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("visita_propuestaVendedorVisitaBusqueda")) {
				this.jButtonvisita_propuestaVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioVendedorVisitaUpdate")) {
				this.jButtonid_anioVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioVendedorVisitaBusqueda")) {
				this.jButtonid_anioVendedorVisitaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesVendedorVisitaUpdate")) {
				this.jButtonid_mesVendedorVisitaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesVendedorVisitaBusqueda")) {
				this.jButtonid_mesVendedorVisitaBusquedaActionPerformed(evt);
			}
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessVendedorVisita();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameVendedorVisita")) {
				closingInternalFrameVendedorVisita();
				
			} else if(sTipo.equals("jButtonCancelarVendedorVisita")) {
				JInternalFrameBase jInternalFrameDetalleFormVendedorVisita = (JInternalFrameBase)evt.getSource();
	            	
	            VendedorVisitaBeanSwingJInternalFrame jInternalFrameParent=(VendedorVisitaBeanSwingJInternalFrame)jInternalFrameDetalleFormVendedorVisita.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarVendedorVisitaActionPerformed(null);
			}
			
			VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.vendedorvisita,new Object(),this.vendedorvisitaParameterGeneral,this.vendedorvisitaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormVendedorVisita(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormVendedorVisita(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormVendedorVisita(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.vendedorvisita)) {
			if(!esControlTabla) {
				if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);			
				}
				
				if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualVendedorVisita(this.vendedorvisita,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vendedorvisitaReturnGeneral=vendedorvisitaLogic.procesarEventosVendedorVisitasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorvisitaLogic.getVendedorVisitas(),this.vendedorvisita,this.vendedorvisitaParameterGeneral,this.isEsNuevoVendedorVisita,classes);//this.vendedorvisitaLogic.getVendedorVisita()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanVendedorVisita(this.vendedorvisitaReturnGeneral,this.vendedorvisitaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanVendedorVisita(classes,this.vendedorvisitaReturnGeneral,this.vendedorvisitaBean,false);
					}
						
					if(this.vendedorvisitaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita());	
					}
						
					if(this.vendedorvisitaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita(),classes);//this.vendedorvisitaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioVendedorVisita(this.vendedorvisita,classes);//this.vendedorvisitaBean);									
				}
			
				if(VendedorVisitaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualVendedorVisita(this.vendedorvisita,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysVendedorVisita(this.vendedorvisita);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.vendedorvisitaAnterior!=null) {
						this.vendedorvisita=this.vendedorvisitaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.vendedorvisitaReturnGeneral=vendedorvisitaLogic.procesarEventosVendedorVisitasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorvisitaLogic.getVendedorVisitas(),this.vendedorvisita,this.vendedorvisitaParameterGeneral,this.isEsNuevoVendedorVisita,classes);//this.vendedorvisitaLogic.getVendedorVisita()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.vendedorvisitaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.vendedorvisitaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.vendedorvisitaReturnGeneral.getVendedorVisita(),vendedorvisitaLogic.getVendedorVisitas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.vendedorvisitaReturnGeneral.getVendedorVisita(),this.vendedorvisitas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosVendedorVisita.repaint();
				
				//((AbstractTableModel) this.jTableDatosVendedorVisita.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosVendedorVisita();
			}
		}
	}
	
	public void actualizarVisualTableDatosVendedorVisita() throws Exception {
		
		VendedorVisitaModel vendedorvisitaModel=(VendedorVisitaModel)this.jTableDatosVendedorVisita.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			vendedorvisitaModel.vendedorvisitas=this.vendedorvisitaLogic.getVendedorVisitas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			vendedorvisitaModel.vendedorvisitas=this.vendedorvisitas;
		}
		
		
		((VendedorVisitaModel) this.jTableDatosVendedorVisita.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaVendedorVisita() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getvendedorvisitaAnterior(),this.vendedorvisitaLogic.getVendedorVisitas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getvendedorvisitaAnterior(),this.vendedorvisitas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosVendedorVisita();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioVendedorVisita(VendedorVisita vendedorvisita,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
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
										
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorvisita,new Object(),generalEntityParameterGeneral,this.vendedorvisitaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.vendedorvisitaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=VendedorVisitaConstantesFunciones.getClassesRelationshipsOfVendedorVisita(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=VendedorVisitaConstantesFunciones.getClassesRelationshipsFromStringsOfVendedorVisita(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormVendedorVisita(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				VendedorVisitaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.vendedorvisita,new Object(),generalEntityParameterGeneral,this.vendedorvisitaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioVendedorVisita(VendedorVisitaBean vendedorvisitaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanVendedorVisita(ArrayList<Classe> classes,VendedorVisitaReturnGeneral vendedorvisitaReturnGeneral,VendedorVisitaBean vendedorvisitaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualVendedorVisita(VendedorVisita vendedorvisita,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.vendedorvisita)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormVendedorVisita = new VendedorVisitaDetalleFormJInternalFrame(jDesktopPane,this.vendedorvisitaSessionBean.getConGuardarRelaciones(),this.vendedorvisitaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.setVisible(false);
		this.jInternalFrameDetalleFormVendedorVisita.setSelected(false);						
		
		this.jInternalFrameDetalleFormVendedorVisita.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormVendedorVisita.vendedorvisitaLogic=this.vendedorvisitaLogic;
		
		this.cargarCombosFrameForeignKeyVendedorVisita("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleVendedorVisita();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleVendedorVisita();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyVendedorVisita("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyVendedorVisita();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormVendedorVisita.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVendedorVisita"));
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarVendedorVisita.addActionListener(new ButtonActionListener(this,"ModificarVendedorVisita"));

		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"ModificarToolBarVendedorVisita"));
					
		this.jInternalFrameDetalleFormVendedorVisita.jMenuItemModificarVendedorVisita.addActionListener(new ButtonActionListener(this,"MenuItemModificarVendedorVisita"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarVendedorVisita.addActionListener (new ButtonActionListener(this,"ActualizarVendedorVisita"));
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVendedorVisita"));
						
		this.jInternalFrameDetalleFormVendedorVisita.jMenuItemActualizarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVendedorVisita"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarVendedorVisita.addActionListener (new ButtonActionListener(this,"EliminarVendedorVisita"));
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"EliminarToolBarVendedorVisita"));
								
		this.jInternalFrameDetalleFormVendedorVisita.jMenuItemEliminarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVendedorVisita"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarVendedorVisita.addActionListener (new ButtonActionListener(this,"CancelarVendedorVisita"));
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"CancelarToolBarVendedorVisita"));
					
		this.jInternalFrameDetalleFormVendedorVisita.jMenuItemCancelarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVendedorVisita"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jMenuItemDetalleCerrarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVendedorVisita"));		
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVendedorVisita"));
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVendedorVisita"));
		
		
		
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVendedorVisita"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonidVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"idVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_empresaVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_empresaVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_ejercicioVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_ejercicioVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_periodoVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_periodoVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoVendedorVisitaBusqueda"));
		//jButtonid_vendedorVendedorVisita.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorVendedorVisitaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisita"));
		//jButtonid_vendedorVendedorVisitaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonvisita_realVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"visita_realVendedorVisitaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonvisita_propuestaVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"visita_propuestaVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_anioVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_anioVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_anioVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_mesVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_mesVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_mesVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesVendedorVisitaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVendedorVisita"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameVendedorVisita"));
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarVendedorVisita"));
		}
		
		this.jTableDatosVendedorVisita.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarVendedorVisita"));
		
		this.jTableDatosVendedorVisita.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarVendedorVisita"));
		
		this.jButtonNuevoVendedorVisita.addActionListener(new ButtonActionListener(this,"NuevoVendedorVisita"));
		
		this.jButtonDuplicarVendedorVisita.addActionListener(new ButtonActionListener(this,"DuplicarVendedorVisita"));
		
		this.jButtonCopiarVendedorVisita.addActionListener(new ButtonActionListener(this,"CopiarVendedorVisita"));
		
		this.jButtonVerFormVendedorVisita.addActionListener(new ButtonActionListener(this,"VerFormVendedorVisita"));
		
		
		this.jButtonNuevoToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"NuevoToolBarVendedorVisita"));
			
		this.jButtonDuplicarToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"DuplicarToolBarVendedorVisita"));
			
		this.jMenuItemNuevoVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemNuevoVendedorVisita"));
			
		this.jMenuItemDuplicarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarVendedorVisita"));		
		
		
		this.jButtonNuevoRelacionesVendedorVisita.addActionListener (new ButtonActionListener(this,"NuevoRelacionesVendedorVisita"));
		
		
		this.jButtonNuevoRelacionesToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarVendedorVisita"));
			
		this.jMenuItemNuevoRelacionesVendedorVisita.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesVendedorVisita"));		
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarVendedorVisita.addActionListener(new ButtonActionListener(this,"ModificarVendedorVisita"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonModificarToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"ModificarToolBarVendedorVisita"));
			
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemModificarVendedorVisita.addActionListener(new ButtonActionListener(this,"MenuItemModificarVendedorVisita"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarVendedorVisita.addActionListener (new ButtonActionListener(this,"ActualizarVendedorVisita"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonActualizarToolBarVendedorVisita.addActionListener(new ButtonActionListener(this,"ActualizarToolBarVendedorVisita"));
				
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemActualizarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemActualizarVendedorVisita"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarVendedorVisita.addActionListener (new ButtonActionListener(this,"EliminarVendedorVisita"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonEliminarToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"EliminarToolBarVendedorVisita"));
						
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemEliminarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemEliminarVendedorVisita"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarVendedorVisita.addActionListener (new ButtonActionListener(this,"CancelarVendedorVisita"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonCancelarToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"CancelarToolBarVendedorVisita"));
			
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemCancelarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemCancelarVendedorVisita"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarVendedorVisita"));		
		
		
		this.jButtonCerrarVendedorVisita.addActionListener (new ButtonActionListener(this,"CerrarVendedorVisita"));
		
		
		this.jButtonCerrarToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"CerrarToolBarVendedorVisita"));
			
		this.jMenuItemCerrarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemCerrarVendedorVisita"));
			
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jMenuItemDetalleCerrarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarVendedorVisita"));		
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosVendedorVisita"));
		}
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarVendedorVisita"));
		}
		
		this.jButtonCopiarToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"CopiarToolBarVendedorVisita"));
			
		this.jButtonVerFormToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"VerFormToolBarVendedorVisita"));
		
		this.jMenuItemGuardarCambiosVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosVendedorVisita"));
			
		this.jMenuItemCopiarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemCopiarVendedorVisita"));		
		
		this.jMenuItemVerFormVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemVerFormVendedorVisita"));		
		
		
		this.jButtonGuardarCambiosTablaVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVendedorVisita"));
		
		
		this.jButtonGuardarCambiosTablaToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarVendedorVisita"));
			
		this.jMenuItemGuardarCambiosTablaVendedorVisita.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaVendedorVisita"));		
		
		
		
		this.jButtonRecargarInformacionVendedorVisita.addActionListener (new ButtonActionListener(this,"RecargarInformacionVendedorVisita"));
					
		this.jButtonRecargarInformacionToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarVendedorVisita"));
		
		this.jMenuItemRecargarInformacionVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionVendedorVisita"));		
		
		
		
		this.jButtonAnterioresVendedorVisita.addActionListener (new ButtonActionListener(this,"AnterioresVendedorVisita"));
		
		
		this.jButtonAnterioresToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"AnterioresToolBarVendedorVisita"));
		
		this.jMenuItemAnterioresVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresVendedorVisita"));		
		
		
		this.jButtonSiguientesVendedorVisita.addActionListener (new ButtonActionListener(this,"SiguientesVendedorVisita"));
		
		
		this.jButtonSiguientesToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"SiguientesToolBarVendedorVisita"));
			
		this.jMenuItemSiguientesVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesVendedorVisita"));
			
		this.jMenuItemAbrirOrderByVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByVendedorVisita"));
			
		this.jMenuItemMostrarOcultarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarVendedorVisita"));
			
		this.jMenuItemDetalleAbrirOrderByVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByVendedorVisita"));
			
		this.jMenuItemDetalleMostarOcultarVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarVendedorVisita"));		
		
		
		this.jButtonNuevoGuardarCambiosVendedorVisita.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosVendedorVisita"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarVendedorVisita"));
			
		this.jMenuItemNuevoGuardarCambiosVendedorVisita.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosVendedorVisita"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosVendedorVisita.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosVendedorVisita"));

		this.jCheckBoxSeleccionadosVendedorVisita.addItemListener(new CheckBoxItemListener(this,"SeleccionadosVendedorVisita"));
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioVendedorVisita"));
		}
		
		
		this.jComboBoxTiposRelacionesVendedorVisita.addActionListener (new ButtonActionListener(this,"TiposRelacionesVendedorVisita"));
			
		this.jComboBoxTiposAccionesVendedorVisita.addActionListener (new ButtonActionListener(this,"TiposAccionesVendedorVisita"));
					
		this.jComboBoxTiposSeleccionarVendedorVisita.addActionListener (new ButtonActionListener(this,"TiposSeleccionarVendedorVisita"));
			
		this.jTextFieldValorCampoGeneralVendedorVisita.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralVendedorVisita"));		
		
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonidVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"idVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_empresaVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_empresaVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_ejercicioVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_ejercicioVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_periodoVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_periodoVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoVendedorVisitaBusqueda"));
		//jButtonid_vendedorVendedorVisita.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorVendedorVisitaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisita"));
		//jButtonid_vendedorVendedorVisitaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonvisita_realVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"visita_realVendedorVisitaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonvisita_propuestaVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"visita_propuestaVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_anioVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_anioVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_anioVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_mesVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_mesVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_mesVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesVendedorVisitaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEjercicioVendedorVisita.addActionListener(new ButtonActionListener(this,"FK_IdEjercicioVendedorVisita"));

			this.jButtonFK_IdVendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"FK_IdVendedorVendedorVisita"));

			this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisita"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoVendedorVisita!=null) {
				this.jInternalFrameReporteDinamicoVendedorVisita.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVendedorVisita"));
				this.jInternalFrameReporteDinamicoVendedorVisita.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVendedorVisita"));
				this.jInternalFrameReporteDinamicoVendedorVisita.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVendedorVisita"));
			}
			
			//this.jButtonCerrarReporteDinamicoVendedorVisita.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoVendedorVisita"));				
			//this.jButtonGenerarReporteDinamicoVendedorVisita.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoVendedorVisita"));
			//this.jButtonGenerarExcelReporteDinamicoVendedorVisita.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoVendedorVisita"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionVendedorVisita!=null) {
				this.jInternalFrameImportacionVendedorVisita.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionVendedorVisita"));
				this.jInternalFrameImportacionVendedorVisita.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionVendedorVisita"));
				this.jInternalFrameImportacionVendedorVisita.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionVendedorVisita"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByVendedorVisita.addActionListener (new ButtonActionListener(this,"AbrirOrderByVendedorVisita"));
			
			this.jButtonAbrirOrderByToolBarVendedorVisita.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarVendedorVisita"));			
			
			if(this.jInternalFrameOrderByVendedorVisita!=null) {
				this.jInternalFrameOrderByVendedorVisita.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByVendedorVisita"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormVendedorVisita.jTabbedPaneRelacionesVendedorVisita.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesVendedorVisita"));
		
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
            		closingInternalFrameVendedorVisita();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormVendedorVisita.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormVendedorVisita = (JInternalFrameBase)event.getSource();
	            	
	            VendedorVisitaBeanSwingJInternalFrame jInternalFrameParent=(VendedorVisitaBeanSwingJInternalFrame)jInternalFrameDetalleFormVendedorVisita.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarVendedorVisitaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosVendedorVisita.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosVendedorVisitaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosVendedorVisita.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosVendedorVisita.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorVisitaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorVisitaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorVisitaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoVendedorVisita";
		inputMap = this.jButtonNuevoVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVendedorVisitaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorVisitaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorVisitaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoVendedorVisitaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesVendedorVisita";
		inputMap = this.jButtonNuevoRelacionesVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoVendedorVisitaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarVendedorVisita";
		inputMap = this.jButtonModificarVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarVendedorVisitaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarVendedorVisita";
		inputMap = this.jButtonActualizarVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarVendedorVisitaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarVendedorVisita";
		inputMap = this.jButtonEliminarVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarVendedorVisitaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarVendedorVisita";
		inputMap = this.jButtonCancelarVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarVendedorVisitaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarVendedorVisita";
		inputMap = this.jButtonCerrarVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarVendedorVisitaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosVendedorVisita";
		inputMap = this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormVendedorVisita.jButtonGuardarCambiosVendedorVisita.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosVendedorVisitaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosVendedorVisita.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosVendedorVisitaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesVendedorVisita.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesVendedorVisitaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarVendedorVisita.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarVendedorVisitaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralVendedorVisita.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralVendedorVisitaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonidVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"idVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_empresaVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_empresaVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_ejercicioVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_ejercicioVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_periodoVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_periodoVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_periodoVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoVendedorVisitaBusqueda"));
		//jButtonid_vendedorVendedorVisita.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_vendedorVendedorVisitaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisita"));
		//jButtonid_vendedorVendedorVisitaArbol.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			abrirFrameTreeVendedor("BUSQUEDA_FK");
		//		}
		//	}
		//);

		//BUSQUEDA ARBOL CAMPO
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaArbol.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaArbol"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisitaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonvisita_realVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"visita_realVendedorVisitaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonvisita_propuestaVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"visita_propuestaVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_anioVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_anioVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_anioVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioVendedorVisitaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_mesVendedorVisitaUpdate.addActionListener(new ButtonActionListener(this,"id_mesVendedorVisitaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormVendedorVisita.jButtonid_mesVendedorVisitaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesVendedorVisitaBusqueda"));
		
		
		this.jButtonFK_IdEjercicioVendedorVisita.addActionListener(new ButtonActionListener(this,"FK_IdEjercicioVendedorVisita"));

		this.jButtonFK_IdVendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"FK_IdVendedorVendedorVisita"));

		this.jButtonBuscarFK_IdVendedorid_vendedorVendedorVisita.addActionListener(new ButtonActionListener(this,"id_vendedorVendedorVisita"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionVendedorVisita.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionVendedorVisitaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarVendedorVisitaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarVendedorVisita.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosVendedorVisita(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
					vendedorvisitaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorVisita vendedorvisitaAux:vendedorvisitas) {
					vendedorvisitaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosVendedorVisitaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVendedorVisita(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
						vendedorvisitaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VendedorVisita vendedorvisitaAux:vendedorvisitas) {
						vendedorvisitaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VendedorVisita vendedorvisitaAux:vendedorvisitas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaVendedorVisita(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVendedorVisita.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVendedorVisita.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosVendedorVisitaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingVendedorVisita(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosVendedorVisita.getSelectedRows();
			
			VendedorVisita vendedorvisitaLocal=new VendedorVisita();
			
			//this.seleccionarTodosVendedorVisita(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					vendedorvisitaLocal =(VendedorVisita) this.vendedorvisitaLogic.getVendedorVisitas().toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					vendedorvisitaLocal =(VendedorVisita) this.vendedorvisitas.toArray()[this.jTableDatosVendedorVisita.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				vendedorvisitaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
						vendedorvisitaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(VendedorVisita vendedorvisitaAux:vendedorvisitas) {
						vendedorvisitaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaVendedorVisita(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosVendedorVisita.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosVendedorVisita.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosVendedorVisita,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualVendedorVisitaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarVendedorVisitaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralVendedorVisitaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingVendedorVisita(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralVendedorVisita.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(VendedorVisita vendedorvisitaAux:this.vendedorvisitaLogic.getVendedorVisitas()) {
				
						if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL)) {
							existe=true;
							vendedorvisitaAux.setvisita_real(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA)) {
							existe=true;
							vendedorvisitaAux.setvisita_propuesta(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorVisita vendedorvisitaAux:vendedorvisitas) {
					
						if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL)) {
							existe=true;
							vendedorvisitaAux.setvisita_real(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA)) {
							existe=true;
							vendedorvisitaAux.setvisita_propuesta(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaVendedorVisita(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesVendedorVisitaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingVendedorVisita(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioVendedorVisita=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesVendedorVisita.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteVendedorVisita) {				
					conSplash=true;//false;										
					
					//this.startProcessVendedorVisita(conSplash);
				
					this.generarReporteVendedorVisitasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoVendedorVisitasSeleccionados();
				//this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVendedorVisitasSeleccionados(false);
				//this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoVendedorVisitasSeleccionados(true);
				//this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVendedorVisita();
				
				this.exportarVendedorVisitasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionVendedorVisitas();
				//this.importarVendedorVisitas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessVendedorVisita();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelVendedorVisitasSeleccionados();
				//this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Vendedor Visita", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessVendedorVisita();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoVendedorVisita)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyVendedorVisita(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
				}	
			} 			
			else if(VendedorVisitaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteVendedorVisita) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessVendedorVisita(conSplash);
					
						//this.actualizarParametrosGeneralVendedorVisita();
						
						this.generarReporteProcesoAccionVendedorVisitasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(VendedorVisitaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Vendedor VisitaS SELECCIONADOS?", "MANTENIMIENTO DE Vendedor Visita", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessVendedorVisita();
				
						this.actualizarParametrosGeneralVendedorVisita();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.vendedorvisitaReturnGeneral=vendedorvisitaLogic.procesarAccionVendedorVisitasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.vendedorvisitaLogic.getVendedorVisitas(),this.vendedorvisitaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarVendedorVisitaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralVendedorVisita();
					
					VendedorVisitaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarVendedorVisitaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesVendedorVisita.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormVendedorVisita.jComboBoxTiposAccionesFormularioVendedorVisita.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessVendedorVisita(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesVendedorVisitaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessVendedorVisita();
			
			if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
			VendedorVisita vendedorvisita=new VendedorVisita();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingVendedorVisita(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesVendedorVisita.getSelectedItem();
			
			
			
			
			vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
			//this.sTipoAccion;
			
			if(vendedorvisitasSeleccionados.size()==1) {
				for(VendedorVisita vendedorvisitaAux:vendedorvisitasSeleccionados) {
					vendedorvisita=vendedorvisitaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessVendedorVisita();
			
      		//this.finishProcessVendedorVisita(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarVendedorVisitaReturnGeneral() throws Exception {
		if(this.vendedorvisitaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.vendedorvisitaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.vendedorvisitaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.vendedorvisitaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.vendedorvisitaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.vendedorvisitaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingVendedorVisita(false);
		}
		
		if(this.vendedorvisitaReturnGeneral.getConRetornoLista() || this.vendedorvisitaReturnGeneral.getConRetornoObjeto()) {
			if(this.vendedorvisitaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vendedorvisitaLogic.setVendedorVisitas(this.vendedorvisitaReturnGeneral.getVendedorVisitas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.vendedorvisitaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.vendedorvisitaLogic.setVendedorVisita(this.vendedorvisitaReturnGeneral.getVendedorVisita());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingVendedorVisita(false);
		}
	}
	
	public void actualizarParametrosGeneralVendedorVisita() throws Exception {
		
		
	}
	
	public ArrayList<VendedorVisita> getVendedorVisitasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioVendedorVisita) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(VendedorVisita vendedorvisitaAux:vendedorvisitaLogic.getVendedorVisitas()) {
					if(vendedorvisitaAux.getIsSelected()) {
						vendedorvisitasSeleccionados.add(vendedorvisitaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(VendedorVisita vendedorvisitaAux:this.vendedorvisitas) {
					if(vendedorvisitaAux.getIsSelected()) {
						vendedorvisitasSeleccionados.add(vendedorvisitaAux);				
					}
				}
			}
			
			if(vendedorvisitasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						vendedorvisitasSeleccionados.addAll(this.vendedorvisitaLogic.getVendedorVisitas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						vendedorvisitasSeleccionados.addAll(this.vendedorvisitas);				
					}
				}
			}
		} else {
			vendedorvisitasSeleccionados.add(this.vendedorvisita);
		}
		
		return vendedorvisitasSeleccionados;
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
	
	public void generarReporteVendedorVisitasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalVendedorVisitasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoVendedorVisitasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVendedorVisitasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoVendedorVisitasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Vendedor Visita",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesVendedorVisitasSeleccionados() throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados);
		
	}	
	
	public void generarReporteNormalVendedorVisitasSeleccionados() throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionVendedorVisitasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoVendedorVisitasSeleccionados() throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		
		this.abrirInicializarFrameReporteDinamicoVendedorVisita();
		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoVendedorVisita();
		
		
		//this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados ,vendedorvisitaImplementable,vendedorvisitaImplementableHome);
	}
	
	public void mostrarImportacionVendedorVisitas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionVendedorVisita();
		
		this.abrirFrameImportacionVendedorVisita();		
		
			
		//this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados ,vendedorvisitaImplementable,vendedorvisitaImplementableHome);
	}
	
	public void importarVendedorVisitas() throws Exception {		
	
	}
	
	public void exportarVendedorVisitasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelVendedorVisitasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoVendedorVisitasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlVendedorVisitasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Vendedor Visita",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoVendedorVisitasSeleccionados() throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarVendedorVisita(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(VendedorVisita vendedorvisitaAux:vendedorvisitasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarVendedorVisita(vendedorvisitaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//vendedorvisitaAux.setsDetalleGeneralEntityReporte(vendedorvisitaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarVendedorVisita(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_VISITAREAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=VendedorVisitaConstantesFunciones.LABEL_IDMES;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarVendedorVisita(VendedorVisita vendedorvisita,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=vendedorvisita.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getvisita_real().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getvisita_propuesta().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=vendedorvisita.getmes_descripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelVendedorVisitasSeleccionados() throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("VendedorVisitas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelVendedorVisita(row);				
				iRow++;
			}				
			
			for(VendedorVisita vendedorvisitaAux:vendedorvisitasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelVendedorVisita(vendedorvisitaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlVendedorVisitasSeleccionados() throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();		
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"vendedorvisita.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("vendedorvisitas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("vendedorvisita");
			//elementRoot.appendChild(element);
		
			for(VendedorVisita vendedorvisitaAux:vendedorvisitasSeleccionados) {
				element = document.createElement("vendedorvisita");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlVendedorVisita(vendedorvisitaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Vendedor Visita",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelVendedorVisita(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VISITAREAL);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_VISITAPROPUESTA);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(VendedorVisitaConstantesFunciones.LABEL_IDMES);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelVendedorVisita(VendedorVisita vendedorvisita,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getvisita_real());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getvisita_propuesta());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(vendedorvisita.getmes_descripcion());				
	}
	
	public void setFilaDatosExportarXmlVendedorVisita(VendedorVisita vendedorvisita,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(VendedorVisitaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(vendedorvisita.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(VendedorVisitaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(vendedorvisita.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(VendedorVisitaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(vendedorvisita.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(VendedorVisitaConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(vendedorvisita.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(VendedorVisitaConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(vendedorvisita.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementvendedor_descripcion = document.createElement(VendedorVisitaConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(vendedorvisita.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementvisita_real = document.createElement(VendedorVisitaConstantesFunciones.VISITAREAL);
		elementvisita_real.appendChild(document.createTextNode(vendedorvisita.getvisita_real().toString().trim()));
		element.appendChild(elementvisita_real);

		Element elementvisita_propuesta = document.createElement(VendedorVisitaConstantesFunciones.VISITAPROPUESTA);
		elementvisita_propuesta.appendChild(document.createTextNode(vendedorvisita.getvisita_propuesta().toString().trim()));
		element.appendChild(elementvisita_propuesta);

		Element elementanio_descripcion = document.createElement(VendedorVisitaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(vendedorvisita.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(VendedorVisitaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(vendedorvisita.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);
	}
	
	public void generarReporteGroupGenericoVendedorVisitasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<VendedorVisita> vendedorvisitasSeleccionados=new ArrayList<VendedorVisita>();
		
		vendedorvisitasSeleccionados=this.getVendedorVisitasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoVendedorVisita(vendedorvisitasSeleccionados);
		
		this.generarReporteVendedorVisitas("Todos",vendedorvisitasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoVendedorVisita(ArrayList<VendedorVisita> vendedorvisitasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(VendedorVisita vendedorvisitaAux:vendedorvisitasSeleccionados) {
				vendedorvisitaAux.setsDetalleGeneralEntityReporte(vendedorvisitaAux.toString());
			
				if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					vendedorvisitaAux.setsDescripcionGeneralEntityReporte1(vendedorvisitaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					vendedorvisitaAux.setsDescripcionGeneralEntityReporte1(vendedorvisitaAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					vendedorvisitaAux.setsDescripcionGeneralEntityReporte1(vendedorvisitaAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					vendedorvisitaAux.setsDescripcionGeneralEntityReporte1(vendedorvisitaAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					vendedorvisitaAux.setsDescripcionGeneralEntityReporte1(vendedorvisitaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(VendedorVisitaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					vendedorvisitaAux.setsDescripcionGeneralEntityReporte1(vendedorvisitaAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,VendedorVisitaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesVendedorVisita(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoVendedorVisita=true;
				this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=true;
				this.isVisibilidadCeldaGuardarCambiosVendedorVisita=true;
			}
			
			this.isVisibilidadCeldaModificarVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=false;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
			this.isVisibilidadCeldaModificarVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=true;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
			this.isVisibilidadCeldaModificarVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=true;
			this.isVisibilidadCeldaEliminarVendedorVisita=true;
			this.isVisibilidadCeldaCancelarVendedorVisita=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
			this.isVisibilidadCeldaModificarVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=true;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoVendedorVisita=true;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=true;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=true;
			this.isVisibilidadCeldaModificarVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=false;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=true;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
			this.isVisibilidadCeldaActualizarVendedorVisita=false;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
			this.isVisibilidadCeldaModificarVendedorVisita=true;
			this.isVisibilidadCeldaActualizarVendedorVisita=false;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
			this.isVisibilidadCeldaCancelarVendedorVisita=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				} else {
					this.isVisibilidadCeldaGuardarVendedorVisita=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(VendedorVisitaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoVendedorVisita=true;
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=true;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=true;
		} else {
			this.actualizarEstadoPanelsVendedorVisita(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarVendedorVisita=false;
			//this.isVisibilidadCeldaVerFormVendedorVisita=false;
			this.isVisibilidadCeldaDuplicarVendedorVisita=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!vendedorvisitaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
		} else {
			this.isVisibilidadCeldaNuevoVendedorVisita=false;
			this.isVisibilidadCeldaGuardarCambiosVendedorVisita=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			if(!vendedorvisitaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;												
			}
			
			this.jButtonCerrarVendedorVisita.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesVendedorVisita=false;
		}
		
		if(!this.permiteMantenimiento(this.vendedorvisita)) {
			this.isVisibilidadCeldaActualizarVendedorVisita=false;
			this.isVisibilidadCeldaEliminarVendedorVisita=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesVendedorVisita() {
	}
	
	public void actualizarEstadoPanelsVendedorVisita(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(false);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(false);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(false);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionVendedorVisita!=null) {
				this.jScrollPanelDatosEdicionVendedorVisita.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosVendedorVisita!=null) {
				this.jScrollPanelDatosVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelPaginacionVendedorVisita!=null) {
				this.jPanelPaginacionVendedorVisita.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
					this.jTabbedPaneBusquedasVendedorVisita.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.vendedorvisitaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasVendedorVisita!=null) {
				this.jTabbedPaneBusquedasVendedorVisita.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesVendedorVisita!=null) {
				this.jPanelParametrosReportesVendedorVisita.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEjercicio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdEjercicioVendedorVisita);}

			this.isVisibilidadFK_IdVendedor=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdVendedorVendedorVisita);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdEjercicio=isParaEjercicio;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdEjercicioVendedorVisita);}

			this.isVisibilidadFK_IdVendedor=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdVendedorVendedorVisita);}
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;

			this.isVisibilidadFK_IdEjercicio=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdEjercicioVendedorVisita);}

			this.isVisibilidadFK_IdVendedor=isParaPeriodoNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdVendedorVendedorVisita);}
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;

			this.isVisibilidadFK_IdEjercicio=isParaVendedorNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdEjercicioVendedorVisita);}

			this.isVisibilidadFK_IdVendedor=isParaVendedor;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdVendedorVendedorVisita);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdEjercicio=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdEjercicioVendedorVisita);}

			this.isVisibilidadFK_IdVendedor=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdVendedorVendedorVisita);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdEjercicio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEjercicio) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdEjercicioVendedorVisita);}

			this.isVisibilidadFK_IdVendedor=isParaMesNegation;
			if(!this.isVisibilidadFK_IdVendedor) {this.jTabbedPaneBusquedasVendedorVisita.remove(jPanelFK_IdVendedorVendedorVisita);}
		}
		
	}
	
	
	
	

	public String registrarSesionVendedorVisitaParaBusquedaVendedores() throws Exception {
		Boolean isPaginaPopupVendedor=false;

		try {

			if(vendedorvisitaSessionBean==null) {
				vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
			}

			if(vendedorSessionBean==null) {
				vendedorSessionBean=new VendedorSessionBean();
			}

			vendedorSessionBean.setsPathNavegacionActual(vendedorvisitaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VendedorConstantesFunciones.SCLASSWEBTITULO);
			vendedorSessionBean.setisPermiteRecargarInformacion(false);
			vendedorSessionBean.setisPaginaPopup(true);
			isPaginaPopupVendedor=vendedorSessionBean.getisPaginaPopup();
			vendedorSessionBean.setisPaginaPopup(false);
			vendedorSessionBean.setEstaModoBusqueda(true);
			vendedorSessionBean.setsFuncionBusquedaRapida("window.opener.vendedorvisitaFuncionGeneral.setCombosCodigoDesdeBusquedaid_vendedor(TO_REPLACE);");
			vendedorSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVendedor(true);
			vendedorSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVendedor(VendedorVisitaConstantesFunciones.SNOMBREOPCION);
			//vendedorSessionBean.setisBusquedaDesdeForeignKeySesionVendedorVisita(true);
			//vendedorSessionBean.setlidVendedorVisitaActual(this.idVendedorVisitaActual);

			vendedorvisitaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyVendedorVisita(true);
			vendedorvisitaSessionBean.setlIdVendedorVisitaActualForeignKey(this.idVendedorVisitaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//VendedorVisitaSessionBean vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
		
		if(this.vendedorvisitaSessionBean==null) {
			this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
		}
		
		this.vendedorvisitaSessionBean.setsUltimaBusquedaVendedorVisita(this.getsAccionBusqueda());
		this.vendedorvisitaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.vendedorvisitaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			vendedorvisitaSessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			vendedorvisitaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
			vendedorvisitaSessionBean.setid_vendedor(this.getid_vendedorFK_IdVendedor());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//VendedorVisitaSessionBean vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
		
		if(this.vendedorvisitaSessionBean==null) {
			this.vendedorvisitaSessionBean=new VendedorVisitaSessionBean();
		}
		
		if(this.vendedorvisitaSessionBean.getsUltimaBusquedaVendedorVisita()!=null&&!this.vendedorvisitaSessionBean.getsUltimaBusquedaVendedorVisita().equals("")) {
			this.setsAccionBusqueda(vendedorvisitaSessionBean.getsUltimaBusquedaVendedorVisita());
			this.setiNumeroPaginacion(vendedorvisitaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(vendedorvisitaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(vendedorvisitaSessionBean.getid_ejercicio());
				vendedorvisitaSessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(vendedorvisitaSessionBean.getid_empresa());
				vendedorvisitaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdVendedor")) {
				this.setid_vendedorFK_IdVendedor(vendedorvisitaSessionBean.getid_vendedor());
				vendedorvisitaSessionBean.setid_vendedor(-1L);
			}
		}
		
		this.vendedorvisitaSessionBean.setsUltimaBusquedaVendedorVisita("");
		this.vendedorvisitaSessionBean.setiNumeroPaginacion(VendedorVisitaConstantesFunciones.INUMEROPAGINACION);
		this.vendedorvisitaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaVendedorVisita(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioVendedorVisita() {
		this.updateBorderResaltarBusquedasFormularioVendedorVisita();
		this.updateVisibilidadBusquedasFormularioVendedorVisita();
		this.updateHabilitarBusquedasFormularioVendedorVisita();
	}
	
	public void updateBorderResaltarBusquedasFormularioVendedorVisita() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasVendedorVisita.getComponents().length>0) {
	

		if(this.vendedorvisitaConstantesFunciones.resaltarFK_IdEjercicioVendedorVisita!=null) {
			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdEjercicioVendedorVisita);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);
				jPanel.setBorder(this.vendedorvisitaConstantesFunciones.resaltarFK_IdEjercicioVendedorVisita);
			}
		}

		if(this.vendedorvisitaConstantesFunciones.resaltarFK_IdVendedorVendedorVisita!=null) {
			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdVendedorVendedorVisita);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);
				jPanel.setBorder(this.vendedorvisitaConstantesFunciones.resaltarFK_IdVendedorVendedorVisita);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioVendedorVisita() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasVendedorVisita.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdEjercicioVendedorVisita);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vendedorvisitaConstantesFunciones.mostrarFK_IdEjercicioVendedorVisita);
			if(!this.vendedorvisitaConstantesFunciones.mostrarFK_IdEjercicioVendedorVisita && index>-1) {
				this.jTabbedPaneBusquedasVendedorVisita.remove(index);
			}

			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdVendedorVendedorVisita);
			jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.vendedorvisitaConstantesFunciones.mostrarFK_IdVendedorVendedorVisita);
			if(!this.vendedorvisitaConstantesFunciones.mostrarFK_IdVendedorVendedorVisita && index>-1) {
				this.jTabbedPaneBusquedasVendedorVisita.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioVendedorVisita() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasVendedorVisita.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdEjercicioVendedorVisita);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vendedorvisitaConstantesFunciones.activarFK_IdEjercicioVendedorVisita);
				this.jTabbedPaneBusquedasVendedorVisita.setEnabledAt(index,this.vendedorvisitaConstantesFunciones.activarFK_IdEjercicioVendedorVisita);
			}

			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdVendedorVendedorVisita);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.vendedorvisitaConstantesFunciones.activarFK_IdVendedorVendedorVisita);
				this.jTabbedPaneBusquedasVendedorVisita.setEnabledAt(index,this.vendedorvisitaConstantesFunciones.activarFK_IdVendedorVendedorVisita);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaVendedorVisita(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEjercicio")) {
			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdEjercicioVendedorVisita);

			this.jTabbedPaneBusquedasVendedorVisita.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);

			this.vendedorvisitaConstantesFunciones.setResaltarFK_IdEjercicioVendedorVisita(resaltar);

			jPanel.setBorder(this.vendedorvisitaConstantesFunciones.resaltarFK_IdEjercicioVendedorVisita);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdVendedor")) {
			index= this.jTabbedPaneBusquedasVendedorVisita.indexOfComponent(this.jPanelFK_IdVendedorVendedorVisita);

			this.jTabbedPaneBusquedasVendedorVisita.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasVendedorVisita.getComponent(index);

			this.vendedorvisitaConstantesFunciones.setResaltarFK_IdVendedorVendedorVisita(resaltar);

			jPanel.setBorder(this.vendedorvisitaConstantesFunciones.resaltarFK_IdVendedorVendedorVisita);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarVendedorVisita.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioVendedorVisita() throws Exception {

		if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioVendedorVisita();
		this.updateVisibilidadResaltarControlesFormularioVendedorVisita();
		this.updateHabilitarResaltarControlesFormularioVendedorVisita();
		
	}
	
	public void updateBorderResaltarControlesFormularioVendedorVisita() throws Exception {
		if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.vendedorvisitaConstantesFunciones.resaltaridVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltaridVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarid_empresaVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarid_empresaVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarid_ejercicioVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarid_ejercicioVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarid_periodoVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarid_periodoVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarid_vendedorVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarid_vendedorVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarvisita_realVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarvisita_realVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarvisita_propuestaVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarvisita_propuestaVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarid_anioVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarid_anioVendedorVisita);}
		if(this.vendedorvisitaConstantesFunciones.resaltarid_mesVendedorVisita!=null && this.jInternalFrameDetalleFormVendedorVisita!=null) {this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setBorder(this.vendedorvisitaConstantesFunciones.resaltarid_mesVendedorVisita);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioVendedorVisita() throws Exception {		
		if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
	
		//this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostraridVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelidVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostraridVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_empresaVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelid_empresaVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_empresaVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_ejercicioVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelid_ejercicioVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_ejercicioVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_periodoVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelid_periodoVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_periodoVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_vendedorVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelid_vendedorVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_vendedorVendedorVisita);
			this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_vendedorVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarvisita_realVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelvisita_realVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarvisita_realVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarvisita_propuestaVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelvisita_propuestaVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarvisita_propuestaVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_anioVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelid_anioVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_anioVendedorVisita);
		//this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_mesVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jPanelid_mesVendedorVisita.setVisible(this.vendedorvisitaConstantesFunciones.mostrarid_mesVendedorVisita);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioVendedorVisita() throws Exception {
		if(this.jInternalFrameDetalleFormVendedorVisita==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormVendedorVisita!=null) {
	
		this.jInternalFrameDetalleFormVendedorVisita.jLabelidVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activaridVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_empresaVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_empresaVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_ejercicioVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_ejercicioVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_periodoVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_periodoVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_vendedorVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_vendedorVendedorVisita);
			this.jInternalFrameDetalleFormVendedorVisita.jButtonid_vendedorVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_vendedorVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_realVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarvisita_realVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jTextFieldvisita_propuestaVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarvisita_propuestaVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_anioVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_anioVendedorVisita);
		this.jInternalFrameDetalleFormVendedorVisita.jComboBoxid_mesVendedorVisita.setEnabled(this.vendedorvisitaConstantesFunciones.activarid_mesVendedorVisita);
		}
	}
	
		
}