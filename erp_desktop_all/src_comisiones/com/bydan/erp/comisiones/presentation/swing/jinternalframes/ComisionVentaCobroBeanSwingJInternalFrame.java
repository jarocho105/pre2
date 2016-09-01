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
package com.bydan.erp.comisiones.presentation.swing.jinternalframes;




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

import com.bydan.erp.comisiones.util.ComisionVentaCobroConstantesFunciones;
import com.bydan.erp.comisiones.util.ComisionVentaCobroParameterReturnGeneral;
//import com.bydan.erp.comisiones.util.ComisionVentaCobroParameterGeneral;
//import com.bydan.erp.comisiones.presentation.report.source.ComisionVentaCobroBean;
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

import com.bydan.erp.comisiones.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.comisiones.resources.reportes.AuxiliarReportes;


import com.bydan.erp.comisiones.util.*;
import com.bydan.erp.comisiones.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;
import com.bydan.erp.contabilidad.business.logic.*;
import com.bydan.erp.facturacion.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.comisiones.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.*;
import com.bydan.erp.facturacion.presentation.swing.jinternalframes.*;

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;
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


import com.bydan.erp.comisiones.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.facturacion.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.facturacion.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.facturacion.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class ComisionVentaCobroBeanSwingJInternalFrame extends ComisionVentaCobroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(ComisionVentaCobroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<ComisionVentaCobro> comisionventacobroValidator = new ClassValidator<ComisionVentaCobro>(ComisionVentaCobro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public ComisionVentaCobro comisionventacobro;	
	public ComisionVentaCobro comisionventacobroAux;
	public ComisionVentaCobro comisionventacobroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public ComisionVentaCobro comisionventacobroTotales;
	public Long idComisionVentaCobroActual;
	public Long iIdNuevoComisionVentaCobro=0L;
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

	public String sFinalQueryComboFactura="";

	public List<Factura> facturasForeignKey;

	public List<Factura> getfacturasForeignKey() {
		return facturasForeignKey;
	}

	public void setfacturasForeignKey(List<Factura> facturasForeignKey) {
		this.facturasForeignKey = facturasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Factura facturaForeignKey;

	public Factura getfacturaForeignKey() {
		return facturaForeignKey;
	}

	public void setfacturaForeignKey(Factura facturaForeignKey) {
		this.facturaForeignKey = facturaForeignKey;
	}

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idFacturaActual=0L;

	public Long getidFacturaActual() {
		return idFacturaActual;
	}

	public void setidFacturaActual(Long idFacturaActual) {
		this.idFacturaActual= idFacturaActual;
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
	
	public Boolean isPermisoTodoComisionVentaCobro;
	public Boolean isPermisoNuevoComisionVentaCobro;
	public Boolean isPermisoActualizarComisionVentaCobro;
	public Boolean isPermisoActualizarOriginalComisionVentaCobro;
	public Boolean isPermisoEliminarComisionVentaCobro;
	public Boolean isPermisoGuardarCambiosComisionVentaCobro;
	public Boolean isPermisoConsultaComisionVentaCobro;
	public Boolean isPermisoBusquedaComisionVentaCobro;
	public Boolean isPermisoReporteComisionVentaCobro;
	public Boolean isPermisoPaginacionMedioComisionVentaCobro;
	public Boolean isPermisoPaginacionAltoComisionVentaCobro;
	public Boolean isPermisoPaginacionTodoComisionVentaCobro;
	public Boolean isPermisoCopiarComisionVentaCobro;
	public Boolean isPermisoVerFormComisionVentaCobro;
	public Boolean isPermisoDuplicarComisionVentaCobro;
	public Boolean isPermisoOrdenComisionVentaCobro;
	
	
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
	
	public ComisionVentaCobroParameterReturnGeneral comisionventacobroReturnGeneral;
	public ComisionVentaCobroParameterReturnGeneral comisionventacobroParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoComisionVentaCobro=false;
	public Boolean esParaAccionDesdeFormularioComisionVentaCobro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected ComisionVentaCobroSessionBeanAdditional comisionventacobroSessionBeanAdditional=null;
	
	public ComisionVentaCobroSessionBeanAdditional getComisionVentaCobroSessionBeanAdditional() {
		return this.comisionventacobroSessionBeanAdditional;
	}
	
	public void setComisionVentaCobroSessionBeanAdditional(ComisionVentaCobroSessionBeanAdditional comisionventacobroSessionBeanAdditional) {
		try {
			this.comisionventacobroSessionBeanAdditional=comisionventacobroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected ComisionVentaCobroBeanSwingJInternalFrameAdditional comisionventacobroBeanSwingJInternalFrameAdditional=null;
	//public class ComisionVentaCobroBeanSwingJInternalFrame
	
	public ComisionVentaCobroBeanSwingJInternalFrameAdditional getComisionVentaCobroBeanSwingJInternalFrameAdditional() {
		return this.comisionventacobroBeanSwingJInternalFrameAdditional;
	}
	
	public void setComisionVentaCobroBeanSwingJInternalFrameAdditional(ComisionVentaCobroBeanSwingJInternalFrameAdditional comisionventacobroBeanSwingJInternalFrameAdditional) {
		try {
			this.comisionventacobroBeanSwingJInternalFrameAdditional=comisionventacobroBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public ComisionVentaCobroLogic comisionventacobroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public ComisionVentaCobro comisionventacobroBean;
	public ComisionVentaCobroConstantesFunciones comisionventacobroConstantesFunciones;
	//public ComisionVentaCobroParameterReturnGeneral comisionventacobroReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EjercicioLogic ejercicioLogic;
	public PeriodoLogic periodoLogic;
	public VendedorLogic vendedorLogic;
	public FacturaLogic facturaLogic;
	
	//PARAMETROS
	
	
	//public List<ComisionVentaCobro> comisionventacobros;	
	//public List<ComisionVentaCobro> comisionventacobrosEliminados;
	//public List<ComisionVentaCobro> comisionventacobrosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoComisionVentaCobro=false;
	public Boolean isVisibilidadCeldaDuplicarComisionVentaCobro=true;
	public Boolean isVisibilidadCeldaCopiarComisionVentaCobro=true;
	public Boolean isVisibilidadCeldaVerFormComisionVentaCobro=true;
	public Boolean isVisibilidadCeldaOrdenComisionVentaCobro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
	public Boolean isVisibilidadCeldaModificarComisionVentaCobro=false;
	public Boolean isVisibilidadCeldaActualizarComisionVentaCobro=false;
	public Boolean isVisibilidadCeldaEliminarComisionVentaCobro=false;
	public Boolean isVisibilidadCeldaCancelarComisionVentaCobro=false;
	public Boolean isVisibilidadCeldaGuardarComisionVentaCobro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdFactura=false;
	public Boolean isVisibilidadFK_IdPeriodo=false;
	public Boolean isVisibilidadFK_IdVendedor=false;
	
	public Long getiIdNuevoComisionVentaCobro() {
		return this.iIdNuevoComisionVentaCobro;
	}

	public void setiIdNuevoComisionVentaCobro(Long iIdNuevoComisionVentaCobro) {
		this.iIdNuevoComisionVentaCobro = iIdNuevoComisionVentaCobro;
	}
	
	public Long getidComisionVentaCobroActual() {
		return this.idComisionVentaCobroActual;
	}

	public void setidComisionVentaCobroActual(Long idComisionVentaCobroActual) {
		this.idComisionVentaCobroActual = idComisionVentaCobroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public ComisionVentaCobro getcomisionventacobro() {
		return this.comisionventacobro;
	}

	public void setcomisionventacobro(ComisionVentaCobro comisionventacobro) {
		this.comisionventacobro = comisionventacobro;
	}
	
	public ComisionVentaCobro getcomisionventacobroAux() {
		return this.comisionventacobroAux;
	}

	public void setcomisionventacobroAux(ComisionVentaCobro comisionventacobroAux) {
		this.comisionventacobroAux = comisionventacobroAux;
	}				
	
	public ComisionVentaCobro getcomisionventacobroAnterior() {
		return this.comisionventacobroAnterior;
	}

	public void setcomisionventacobroAnterior(ComisionVentaCobro comisionventacobroAnterior) {
		this.comisionventacobroAnterior = comisionventacobroAnterior;
	}	
	
	public ComisionVentaCobro getcomisionventacobroTotales() {
		return this.comisionventacobroTotales;
	}

	public void setcomisionventacobroTotales(ComisionVentaCobro comisionventacobroTotales) {
		this.comisionventacobroTotales = comisionventacobroTotales;
	}	
	
	public ComisionVentaCobro getcomisionventacobroBean() {
		return this.comisionventacobroBean;
	}

	public void setcomisionventacobroBean(ComisionVentaCobro comisionventacobroBean) {
		this.comisionventacobroBean = comisionventacobroBean;
	}	
	
	public ComisionVentaCobroParameterReturnGeneral getcomisionventacobroReturnGeneral() {
		return this.comisionventacobroReturnGeneral;
	}

	public void setcomisionventacobroReturnGeneral(ComisionVentaCobroParameterReturnGeneral comisionventacobroReturnGeneral) {
		this.comisionventacobroReturnGeneral = comisionventacobroReturnGeneral;
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

	public Long id_facturaFK_IdFactura=-1L;

	public Long getid_facturaFK_IdFactura() {
		return this.id_facturaFK_IdFactura;
	}

	public void setid_facturaFK_IdFactura(Long id_facturaFK_IdFactura) {
		this.id_facturaFK_IdFactura = id_facturaFK_IdFactura;
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
	
	
	public ComisionVentaCobroLogic getComisionVentaCobroLogic()	{		
		return comisionventacobroLogic;
	}

	public void setComisionVentaCobroLogic(ComisionVentaCobroLogic comisionventacobroLogic) {
		this.comisionventacobroLogic = comisionventacobroLogic;
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
	
	public Boolean getIsEsNuevoComisionVentaCobro() {
		return isEsNuevoComisionVentaCobro;
	}

	public void setIsEsNuevoComisionVentaCobro(Boolean isEsNuevoComisionVentaCobro) {
		this.isEsNuevoComisionVentaCobro = isEsNuevoComisionVentaCobro;
	}

	public Boolean getEsParaAccionDesdeFormularioComisionVentaCobro() {
		return esParaAccionDesdeFormularioComisionVentaCobro;
	}
	
	public void setEsParaAccionDesdeFormularioComisionVentaCobro(Boolean esParaAccionDesdeFormularioComisionVentaCobro) {
		this.esParaAccionDesdeFormularioComisionVentaCobro = esParaAccionDesdeFormularioComisionVentaCobro;
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

			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(comisionventacobroSessionBean.getlidEmpresaActual());
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

			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(comisionventacobroSessionBean.getlidEjercicioActual());
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

			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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
					periodoLogic.getEntityWithConnection(comisionventacobroSessionBean.getlidPeriodoActual());
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

			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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
					vendedorLogic.getEntityWithConnection(comisionventacobroSessionBean.getlidVendedorActual());
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

	public void cargarCombosFacturasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.facturasForeignKey=new ArrayList<Factura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			FacturaLogic facturaLogic=new FacturaLogic();

			//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//facturaLogic.getFacturaDataAccess().setIsForForeingKeyData(true);

					facturaLogic.getTodosFacturasWithConnection(sFinalQuery,new Pagination());

					this.facturasForeignKey=facturaLogic.getFacturas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaFactura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(comisionventacobroSessionBean.getlidFacturaActual());
					this.facturasForeignKey.add(facturaLogic.getFactura());
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

					if(this.comisionventacobro!=null) {
						this.comisionventacobro.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaComisionVentaCobro.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaComisionVentaCobroGenerico)throws Exception
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
				jComboBoxid_empresaComisionVentaCobroGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaComisionVentaCobroGenerico!=null && jComboBoxid_empresaComisionVentaCobroGenerico.getItemCount()>0) {
					jComboBoxid_empresaComisionVentaCobroGenerico.setSelectedIndex(0);
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

					if(this.comisionventacobro!=null) {
						this.comisionventacobro.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioComisionVentaCobro.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioComisionVentaCobroGenerico)throws Exception
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
				jComboBoxid_ejercicioComisionVentaCobroGenerico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioComisionVentaCobroGenerico!=null && jComboBoxid_ejercicioComisionVentaCobroGenerico.getItemCount()>0) {
					jComboBoxid_ejercicioComisionVentaCobroGenerico.setSelectedIndex(0);
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

					if(this.comisionventacobro!=null) {
						this.comisionventacobro.setPeriodo(periodoTemp);
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setSelectedItem(periodoTemp);
					}
				} else {
					//jComboBoxid_periodoComisionVentaCobro.setSelectedItem(periodoTemp);
					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setSelectedIndex(0);
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
	public void setActualPeriodoForeignKeyGenerico(Long idPeriodoSeleccionado,JComboBox jComboBoxid_periodoComisionVentaCobroGenerico)throws Exception
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
				jComboBoxid_periodoComisionVentaCobroGenerico.setSelectedItem(periodoTemp);
			} else {
				if(jComboBoxid_periodoComisionVentaCobroGenerico!=null && jComboBoxid_periodoComisionVentaCobroGenerico.getItemCount()>0) {
					jComboBoxid_periodoComisionVentaCobroGenerico.setSelectedIndex(0);
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

					if(this.comisionventacobro!=null) {
						this.comisionventacobro.setVendedor(vendedorTemp);
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setSelectedItem(vendedorTemp);
					}
				} else {
					//jComboBoxid_vendedorComisionVentaCobro.setSelectedItem(vendedorTemp);
					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setSelectedIndex(0);
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
	public void setActualVendedorForeignKeyGenerico(Long idVendedorSeleccionado,JComboBox jComboBoxid_vendedorComisionVentaCobroGenerico)throws Exception
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
				jComboBoxid_vendedorComisionVentaCobroGenerico.setSelectedItem(vendedorTemp);
			} else {
				if(jComboBoxid_vendedorComisionVentaCobroGenerico!=null && jComboBoxid_vendedorComisionVentaCobroGenerico.getItemCount()>0) {
					jComboBoxid_vendedorComisionVentaCobroGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualFacturaForeignKey(Long idFacturaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(facturaTemp!=null) {

					if(this.comisionventacobro!=null) {
						this.comisionventacobro.setFactura(facturaTemp);
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setSelectedItem(facturaTemp);
					}
				} else {
					//jComboBoxid_facturaComisionVentaCobro.setSelectedItem(facturaTemp);
					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.getItemCount()>0) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setSelectedIndex(0);
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

	public String getActualFacturaForeignKeyDescripcion(Long idFacturaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}


			sDescripcion=FacturaConstantesFunciones.getFacturaDescripcion(facturaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualFacturaForeignKeyGenerico(Long idFacturaSeleccionado,JComboBox jComboBoxid_facturaComisionVentaCobroGenerico)throws Exception
	{
		try
		{
			Factura  facturaTemp=null;

			for(Factura facturaAux:facturasForeignKey) {
				if(facturaAux.getId()!=null && facturaAux.getId().equals(idFacturaSeleccionado)) {
					facturaTemp=facturaAux;
					break;
				}
			}

			if(facturaTemp!=null) {
				jComboBoxid_facturaComisionVentaCobroGenerico.setSelectedItem(facturaTemp);
			} else {
				if(jComboBoxid_facturaComisionVentaCobroGenerico!=null && jComboBoxid_facturaComisionVentaCobroGenerico.getItemCount()>0) {
					jComboBoxid_facturaComisionVentaCobroGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(ComisionVentaCobro comisionventacobro,JComboBox jComboBoxid_empresaComisionVentaCobroGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaComisionVentaCobroGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaComisionVentaCobroGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				comisionventacobro.setid_empresa(empresaAux.getId());
				comisionventacobro.setempresa_descripcion(ComisionVentaCobroConstantesFunciones.getEmpresaDescripcion(empresaAux));
				comisionventacobro.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(ComisionVentaCobro comisionventacobro,JComboBox jComboBoxid_ejercicioComisionVentaCobroGenerico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioComisionVentaCobroGenerico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioComisionVentaCobroGenerico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				comisionventacobro.setid_ejercicio(ejercicioAux.getId());
				comisionventacobro.setejercicio_descripcion(ComisionVentaCobroConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				comisionventacobro.setEjercicio(ejercicioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarPeriodoForeignKey(ComisionVentaCobro comisionventacobro,JComboBox jComboBoxid_periodoComisionVentaCobroGenerico)throws Exception
	{
		try
		{
			Periodo  periodoAux=new Periodo();

			if(jComboBoxid_periodoComisionVentaCobroGenerico==null) {
				periodoAux=(Periodo)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.getSelectedItem();
			} else {
				periodoAux=(Periodo)jComboBoxid_periodoComisionVentaCobroGenerico.getSelectedItem();
			}

			if(periodoAux!=null && periodoAux.getId()!=null) {
				if(periodoAux.getid_estado_periodo().equals(0L)) {
					throw new Exception("Periodo INACTIVO, NO PUEDE GUARDAR LA INFORMACION CONSULTE CON EL ADMINISTRADOR");
				}

				comisionventacobro.setid_periodo(periodoAux.getId());
				comisionventacobro.setperiodo_descripcion(ComisionVentaCobroConstantesFunciones.getPeriodoDescripcion(periodoAux));
				comisionventacobro.setPeriodo(periodoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarVendedorForeignKey(ComisionVentaCobro comisionventacobro,JComboBox jComboBoxid_vendedorComisionVentaCobroGenerico)throws Exception
	{
		try
		{
			Vendedor  vendedorAux=new Vendedor();

			if(jComboBoxid_vendedorComisionVentaCobroGenerico==null) {
				vendedorAux=(Vendedor)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.getSelectedItem();
			} else {
				vendedorAux=(Vendedor)jComboBoxid_vendedorComisionVentaCobroGenerico.getSelectedItem();
			}

			if(vendedorAux!=null && vendedorAux.getId()!=null) {
				comisionventacobro.setid_vendedor(vendedorAux.getId());
				comisionventacobro.setvendedor_descripcion(ComisionVentaCobroConstantesFunciones.getVendedorDescripcion(vendedorAux));
				comisionventacobro.setVendedor(vendedorAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarFacturaForeignKey(ComisionVentaCobro comisionventacobro,JComboBox jComboBoxid_facturaComisionVentaCobroGenerico)throws Exception
	{
		try
		{
			Factura  facturaAux=new Factura();

			if(jComboBoxid_facturaComisionVentaCobroGenerico==null) {
				facturaAux=(Factura)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.getSelectedItem();
			} else {
				facturaAux=(Factura)jComboBoxid_facturaComisionVentaCobroGenerico.getSelectedItem();
			}

			if(facturaAux!=null && facturaAux.getId()!=null) {
				comisionventacobro.setid_factura(facturaAux.getId());
				comisionventacobro.setfactura_descripcion(ComisionVentaCobroConstantesFunciones.getFacturaDescripcion(facturaAux));
				comisionventacobro.setFactura(facturaAux);			}
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

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
					}

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
					}

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.removeAllItems();

							for(Periodo periodo:this.periodosForeignKey) {
								this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.addItem(periodo);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
					}

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.removeAllItems();

							for(Vendedor vendedor:this.vendedorsForeignKey) {
								this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.addItem(vendedor);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
					}

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameFacturasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingFactura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.removeAllItems();

							for(Factura factura:this.facturasForeignKey) {
								this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.addItem(factura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { 
					}

					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFramePeriodoForeignKey(Periodo periodo,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setSelectedItem(periodo);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setSelectedItem(vendedor);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameFacturaForeignKey(Factura factura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setSelectedItem(factura);
						}
					} else {
						if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesComisionVentaCobro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			ComisionVentaCobroConstantesFunciones.refrescarForeignKeysDescripcionesComisionVentaCobro(this.comisionventacobroLogic.getComisionVentaCobros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			ComisionVentaCobroConstantesFunciones.refrescarForeignKeysDescripcionesComisionVentaCobro(this.comisionventacobros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Ejercicio.class));
		classes.add(new Classe(Periodo.class));
		classes.add(new Classe(Vendedor.class));
		classes.add(new Classe(Factura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//comisionventacobroLogic.setComisionVentaCobros(this.comisionventacobros);
			comisionventacobroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public ComisionVentaCobroParameterReturnGeneral getComisionVentaCobroParameterGeneral() {
		return this.comisionventacobroParameterGeneral;
	}
	
	public void setComisionVentaCobroParameterGeneral(ComisionVentaCobroParameterReturnGeneral comisionventacobroParameterGeneral) {
		this.comisionventacobroParameterGeneral = comisionventacobroParameterGeneral;
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
	
	public Boolean getIsPermisoTodoComisionVentaCobro() {
		return isPermisoTodoComisionVentaCobro;
	}

	public void setIsPermisoTodoComisionVentaCobro(Boolean isPermisoTodoComisionVentaCobro) {
		this.isPermisoTodoComisionVentaCobro = isPermisoTodoComisionVentaCobro;
	}

	public Boolean getIsPermisoNuevoComisionVentaCobro() {
		return isPermisoNuevoComisionVentaCobro;
	}

	public void setIsPermisoNuevoComisionVentaCobro(Boolean isPermisoNuevoComisionVentaCobro) {
		this.isPermisoNuevoComisionVentaCobro = isPermisoNuevoComisionVentaCobro;
	}

	public Boolean getIsPermisoActualizarComisionVentaCobro() {
		return isPermisoActualizarComisionVentaCobro;
	}

	public void setIsPermisoActualizarComisionVentaCobro(Boolean isPermisoActualizarComisionVentaCobro) {
		this.isPermisoActualizarComisionVentaCobro = isPermisoActualizarComisionVentaCobro;
	}

	public Boolean getIsPermisoEliminarComisionVentaCobro() {
		return isPermisoEliminarComisionVentaCobro;
	}

	public void setIsPermisoEliminarComisionVentaCobro(Boolean isPermisoEliminarComisionVentaCobro) {
		this.isPermisoEliminarComisionVentaCobro = isPermisoEliminarComisionVentaCobro;
	}

	public Boolean getIsPermisoGuardarCambiosComisionVentaCobro() {
		return isPermisoGuardarCambiosComisionVentaCobro;
	}

	public void setIsPermisoGuardarCambiosComisionVentaCobro(Boolean isPermisoGuardarCambiosComisionVentaCobro) {
		this.isPermisoGuardarCambiosComisionVentaCobro = isPermisoGuardarCambiosComisionVentaCobro;
	}
	
	public Boolean getIsPermisoConsultaComisionVentaCobro() {
		return isPermisoConsultaComisionVentaCobro;
	}

	public void setIsPermisoConsultaComisionVentaCobro(Boolean isPermisoConsultaComisionVentaCobro) {
		this.isPermisoConsultaComisionVentaCobro = isPermisoConsultaComisionVentaCobro;
	}

	public Boolean getIsPermisoBusquedaComisionVentaCobro() {
		return isPermisoBusquedaComisionVentaCobro;
	}

	public void setIsPermisoBusquedaComisionVentaCobro(Boolean isPermisoBusquedaComisionVentaCobro) {
		this.isPermisoBusquedaComisionVentaCobro = isPermisoBusquedaComisionVentaCobro;
	}

	public Boolean getIsPermisoReporteComisionVentaCobro() {
		return isPermisoReporteComisionVentaCobro;
	}

	public void setIsPermisoReporteComisionVentaCobro(Boolean isPermisoReporteComisionVentaCobro) {
		this.isPermisoReporteComisionVentaCobro = isPermisoReporteComisionVentaCobro;
	}
	
	public Boolean getIsPermisoPaginacionMedioComisionVentaCobro() {
		return isPermisoPaginacionMedioComisionVentaCobro;
	}

	public void setIsPermisoPaginacionMedioComisionVentaCobro(Boolean isPermisoPaginacionMedioComisionVentaCobro) {
		this.isPermisoPaginacionMedioComisionVentaCobro = isPermisoPaginacionMedioComisionVentaCobro;
	}
	
	public Boolean getIsPermisoPaginacionTodoComisionVentaCobro() {
		return isPermisoPaginacionTodoComisionVentaCobro;
	}

	public void setIsPermisoPaginacionTodoComisionVentaCobro(Boolean isPermisoPaginacionTodoComisionVentaCobro) {
		this.isPermisoPaginacionTodoComisionVentaCobro = isPermisoPaginacionTodoComisionVentaCobro;
	}
	
	public Boolean getIsPermisoPaginacionAltoComisionVentaCobro() {
		return isPermisoPaginacionAltoComisionVentaCobro;
	}

	public void setIsPermisoPaginacionAltoComisionVentaCobro(Boolean isPermisoPaginacionAltoComisionVentaCobro) {
		this.isPermisoPaginacionAltoComisionVentaCobro = isPermisoPaginacionAltoComisionVentaCobro;
	}
	
	public Boolean getIsPermisoCopiarComisionVentaCobro() {
		return isPermisoCopiarComisionVentaCobro;
	}

	public void setIsPermisoCopiarComisionVentaCobro(Boolean isPermisoCopiarComisionVentaCobro) {
		this.isPermisoCopiarComisionVentaCobro = isPermisoCopiarComisionVentaCobro;
	}
	
	public Boolean getIsPermisoVerFormComisionVentaCobro() {
		return isPermisoVerFormComisionVentaCobro;
	}

	public void setIsPermisoVerFormComisionVentaCobro(Boolean isPermisoVerFormComisionVentaCobro) {
		this.isPermisoVerFormComisionVentaCobro = isPermisoVerFormComisionVentaCobro;
	}
	
	public Boolean getIsPermisoDuplicarComisionVentaCobro() {
		return isPermisoDuplicarComisionVentaCobro;
	}

	public void setIsPermisoDuplicarComisionVentaCobro(Boolean isPermisoDuplicarComisionVentaCobro) {
		this.isPermisoDuplicarComisionVentaCobro = isPermisoDuplicarComisionVentaCobro;
	}
	
	public Boolean getIsPermisoOrdenComisionVentaCobro() {
		return isPermisoOrdenComisionVentaCobro;
	}

	public void setIsPermisoOrdenComisionVentaCobro(Boolean isPermisoOrdenComisionVentaCobro) {
		this.isPermisoOrdenComisionVentaCobro = isPermisoOrdenComisionVentaCobro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoComisionVentaCobro() {
		return isVisibilidadCeldaNuevoComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaNuevoComisionVentaCobro(Boolean isVisibilidadCeldaNuevoComisionVentaCobro) {
		this.isVisibilidadCeldaNuevoComisionVentaCobro = isVisibilidadCeldaNuevoComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarComisionVentaCobro() {
		return isVisibilidadCeldaDuplicarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaDuplicarComisionVentaCobro(Boolean isVisibilidadCeldaDuplicarComisionVentaCobro) {
		this.isVisibilidadCeldaDuplicarComisionVentaCobro = isVisibilidadCeldaDuplicarComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarComisionVentaCobro() {
		return isVisibilidadCeldaCopiarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaCopiarComisionVentaCobro(Boolean isVisibilidadCeldaCopiarComisionVentaCobro) {
		this.isVisibilidadCeldaCopiarComisionVentaCobro = isVisibilidadCeldaCopiarComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormComisionVentaCobro() {
		return isVisibilidadCeldaVerFormComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaVerFormComisionVentaCobro(Boolean isVisibilidadCeldaVerFormComisionVentaCobro) {
		this.isVisibilidadCeldaVerFormComisionVentaCobro = isVisibilidadCeldaVerFormComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenComisionVentaCobro() {
		return isVisibilidadCeldaOrdenComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaOrdenComisionVentaCobro(Boolean isVisibilidadCeldaOrdenComisionVentaCobro) {
		this.isVisibilidadCeldaOrdenComisionVentaCobro = isVisibilidadCeldaOrdenComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesComisionVentaCobro() {
		return isVisibilidadCeldaNuevoRelacionesComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesComisionVentaCobro(Boolean isVisibilidadCeldaNuevoRelacionesComisionVentaCobro) {
		this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro = isVisibilidadCeldaNuevoRelacionesComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarComisionVentaCobro() {
		return isVisibilidadCeldaModificarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaModificarComisionVentaCobro(Boolean isVisibilidadCeldaModificarComisionVentaCobro) {
		this.isVisibilidadCeldaModificarComisionVentaCobro = isVisibilidadCeldaModificarComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarComisionVentaCobro() {
		return isVisibilidadCeldaActualizarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaActualizarComisionVentaCobro(Boolean isVisibilidadCeldaActualizarComisionVentaCobro) {
		this.isVisibilidadCeldaActualizarComisionVentaCobro = isVisibilidadCeldaActualizarComisionVentaCobro;
	}

	public Boolean getIsVisibilidadCeldaEliminarComisionVentaCobro() {
		return isVisibilidadCeldaEliminarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaEliminarComisionVentaCobro(Boolean isVisibilidadCeldaEliminarComisionVentaCobro) {
		this.isVisibilidadCeldaEliminarComisionVentaCobro = isVisibilidadCeldaEliminarComisionVentaCobro;
	}

	public Boolean getIsVisibilidadCeldaCancelarComisionVentaCobro() {
		return isVisibilidadCeldaCancelarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaCancelarComisionVentaCobro(Boolean isVisibilidadCeldaCancelarComisionVentaCobro) {
		this.isVisibilidadCeldaCancelarComisionVentaCobro = isVisibilidadCeldaCancelarComisionVentaCobro;
	}

	public Boolean getIsVisibilidadCeldaGuardarComisionVentaCobro() {
		return isVisibilidadCeldaGuardarComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaGuardarComisionVentaCobro(Boolean isVisibilidadCeldaGuardarComisionVentaCobro) {
		this.isVisibilidadCeldaGuardarComisionVentaCobro = isVisibilidadCeldaGuardarComisionVentaCobro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosComisionVentaCobro() {
		return isVisibilidadCeldaGuardarCambiosComisionVentaCobro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosComisionVentaCobro(Boolean isVisibilidadCeldaGuardarCambiosComisionVentaCobro) {
		this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro = isVisibilidadCeldaGuardarCambiosComisionVentaCobro;
	}
		
	public ComisionVentaCobroSessionBean getcomisionventacobroSessionBean() {
		return this.comisionventacobroSessionBean;
	}
	
	public void setcomisionventacobroSessionBean(ComisionVentaCobroSessionBean comisionventacobroSessionBean) {
		this.comisionventacobroSessionBean=comisionventacobroSessionBean;
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

	public Boolean getisVisibilidadFK_IdFactura() {
		return this.isVisibilidadFK_IdFactura;
	}

	public void setisVisibilidadFK_IdFactura(Boolean isVisibilidadFK_IdFactura) {
		this.isVisibilidadFK_IdFactura=isVisibilidadFK_IdFactura;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(ComisionVentaCobro comisionventacobro)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(comisionventacobro,null);
				this.setActualParaGuardarEjercicioForeignKey(comisionventacobro,null);
				this.setActualParaGuardarPeriodoForeignKey(comisionventacobro,null);
				this.setActualParaGuardarVendedorForeignKey(comisionventacobro,null);
				this.setActualParaGuardarFacturaForeignKey(comisionventacobro,null);
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
	
	public void bugActualizarReferenciaActual(ComisionVentaCobro comisionventacobro,ComisionVentaCobro comisionventacobroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalComisionVentaCobro(comisionventacobro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		comisionventacobroAux.setId(comisionventacobro.getId());
		comisionventacobroAux.setVersionRow(comisionventacobro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessComisionVentaCobro();
		
			int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = comisionventacobroValidator.getInvalidValues(this.comisionventacobro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			comisionventacobroLogic.setDatosCliente(datosCliente);
			comisionventacobroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				comisionventacobroAux=new  ComisionVentaCobro();
				
				comisionventacobroAux.setIsNew(true);
				comisionventacobroAux.setIsChanged(true);
				
				comisionventacobroAux.setComisionVentaCobroOriginal(this.comisionventacobro);
				
				comisionventacobroAux.setId(this.comisionventacobro.getId());	
				comisionventacobroAux.setVersionRow(this.comisionventacobro.getVersionRow());	
				comisionventacobroAux.setid_empresa(this.comisionventacobro.getid_empresa());	
				comisionventacobroAux.setid_ejercicio(this.comisionventacobro.getid_ejercicio());	
				comisionventacobroAux.setid_periodo(this.comisionventacobro.getid_periodo());	
				comisionventacobroAux.setid_vendedor(this.comisionventacobro.getid_vendedor());	
				comisionventacobroAux.setid_factura(this.comisionventacobro.getid_factura());	
				comisionventacobroAux.setnumero_factura(this.comisionventacobro.getnumero_factura());	
				comisionventacobroAux.setfecha_pago(this.comisionventacobro.getfecha_pago());	
				comisionventacobroAux.setnombre_cliente(this.comisionventacobro.getnombre_cliente());	
				comisionventacobroAux.setnumero_comprobante(this.comisionventacobro.getnumero_comprobante());	
				comisionventacobroAux.setestado(this.comisionventacobro.getestado());	
				comisionventacobroAux.settotal_factura(this.comisionventacobro.gettotal_factura());	
				comisionventacobroAux.settotal_abono(this.comisionventacobro.gettotal_abono());	
				comisionventacobroAux.setporcentaje_comision(this.comisionventacobro.getporcentaje_comision());	
				comisionventacobroAux.settotal_comision_cobro(this.comisionventacobro.gettotal_comision_cobro());	
				comisionventacobroAux.setnumero_dias(this.comisionventacobro.getnumero_dias());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(comisionventacobroAux,comisionventacobroLogic.getComisionVentaCobros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionventacobroAux,comisionventacobros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobroLogic.saveComisionVentaCobros();//WithConnection
						//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionventacobro,comisionventacobroAux);
					
					this.refrescarForeignKeysDescripcionesComisionVentaCobro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionventacobroLogic.saveComisionVentaCobroRelaciones(comisionventacobroAux);//WithConnection
								//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionventacobro,comisionventacobroAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionventacobroAux,comisionventacobroLogic.getComisionVentaCobros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionventacobroAux,comisionventacobros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionventacobro,comisionventacobroAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				comisionventacobroAux=new  ComisionVentaCobro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado() 
					|| (this.comisionventacobroSessionBean.getEsGuardarRelacionado() && this.comisionventacobro.getId()>=0)) {
						
					comisionventacobroAux.setIsNew(false);
				}
				
				comisionventacobroAux.setIsDeleted(false);
			
				comisionventacobroAux.setId(this.comisionventacobro.getId());	
				comisionventacobroAux.setVersionRow(this.comisionventacobro.getVersionRow());	
				comisionventacobroAux.setid_empresa(this.comisionventacobro.getid_empresa());	
				comisionventacobroAux.setid_ejercicio(this.comisionventacobro.getid_ejercicio());	
				comisionventacobroAux.setid_periodo(this.comisionventacobro.getid_periodo());	
				comisionventacobroAux.setid_vendedor(this.comisionventacobro.getid_vendedor());	
				comisionventacobroAux.setid_factura(this.comisionventacobro.getid_factura());	
				comisionventacobroAux.setnumero_factura(this.comisionventacobro.getnumero_factura());	
				comisionventacobroAux.setfecha_pago(this.comisionventacobro.getfecha_pago());	
				comisionventacobroAux.setnombre_cliente(this.comisionventacobro.getnombre_cliente());	
				comisionventacobroAux.setnumero_comprobante(this.comisionventacobro.getnumero_comprobante());	
				comisionventacobroAux.setestado(this.comisionventacobro.getestado());	
				comisionventacobroAux.settotal_factura(this.comisionventacobro.gettotal_factura());	
				comisionventacobroAux.settotal_abono(this.comisionventacobro.gettotal_abono());	
				comisionventacobroAux.setporcentaje_comision(this.comisionventacobro.getporcentaje_comision());	
				comisionventacobroAux.settotal_comision_cobro(this.comisionventacobro.gettotal_comision_cobro());	
				comisionventacobroAux.setnumero_dias(this.comisionventacobro.getnumero_dias());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionventacobroAux,comisionventacobroLogic.getComisionVentaCobros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionventacobroAux,comisionventacobros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobroLogic.saveComisionVentaCobros();//WithConnection
						//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.comisionventacobro,comisionventacobroAux);
					
					this.refrescarForeignKeysDescripcionesComisionVentaCobro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionventacobroLogic.saveComisionVentaCobroRelaciones(comisionventacobroAux);//WithConnection
								//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.comisionventacobro,comisionventacobroAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(comisionventacobroAux,comisionventacobroLogic.getComisionVentaCobros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(comisionventacobroAux,comisionventacobros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.comisionventacobro,comisionventacobroAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				comisionventacobroAux=new  ComisionVentaCobro();
				
				comisionventacobroAux.setIsNew(false);
				comisionventacobroAux.setIsChanged(false);
				
				comisionventacobroAux.setIsDeleted(true);
				
				comisionventacobroAux.setId(this.comisionventacobro.getId());	
				comisionventacobroAux.setVersionRow(this.comisionventacobro.getVersionRow());	
				comisionventacobroAux.setid_empresa(this.comisionventacobro.getid_empresa());	
				comisionventacobroAux.setid_ejercicio(this.comisionventacobro.getid_ejercicio());	
				comisionventacobroAux.setid_periodo(this.comisionventacobro.getid_periodo());	
				comisionventacobroAux.setid_vendedor(this.comisionventacobro.getid_vendedor());	
				comisionventacobroAux.setid_factura(this.comisionventacobro.getid_factura());	
				comisionventacobroAux.setnumero_factura(this.comisionventacobro.getnumero_factura());	
				comisionventacobroAux.setfecha_pago(this.comisionventacobro.getfecha_pago());	
				comisionventacobroAux.setnombre_cliente(this.comisionventacobro.getnombre_cliente());	
				comisionventacobroAux.setnumero_comprobante(this.comisionventacobro.getnumero_comprobante());	
				comisionventacobroAux.setestado(this.comisionventacobro.getestado());	
				comisionventacobroAux.settotal_factura(this.comisionventacobro.gettotal_factura());	
				comisionventacobroAux.settotal_abono(this.comisionventacobro.gettotal_abono());	
				comisionventacobroAux.setporcentaje_comision(this.comisionventacobro.getporcentaje_comision());	
				comisionventacobroAux.settotal_comision_cobro(this.comisionventacobro.gettotal_comision_cobro());	
				comisionventacobroAux.setnumero_dias(this.comisionventacobro.getnumero_dias());	
				
				if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.comisionventacobroAux.getId()>=0) {	
						this.comisionventacobrosEliminados.add(comisionventacobroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(comisionventacobroAux,comisionventacobroLogic.getComisionVentaCobros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionventacobroAux,comisionventacobros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobroLogic.saveComisionVentaCobros();//WithConnection
						//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								comisionventacobroLogic.saveComisionVentaCobroRelaciones(comisionventacobroAux);//WithConnection
								//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
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
							if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(comisionventacobroAux,comisionventacobroLogic.getComisionVentaCobros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(comisionventacobroAux,comisionventacobros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getComisionVentaCobros().addAll(this.comisionventacobrosEliminados);
					
					comisionventacobroLogic.saveComisionVentaCobros();//WithConnection
					//comisionventacobroLogic.getSetVersionRowComisionVentaCobros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesComisionVentaCobro();
				
				this.comisionventacobrosEliminados= new ArrayList<ComisionVentaCobro>();		
			}
			
			if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Comision Venta Cobro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.comisionventacobro=comisionventacobroAux;
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
      		//this.finishProcessComisionVentaCobro();
      	}
		
	}	
	
	public void actualizarRelaciones(ComisionVentaCobro comisionventacobroLocal) throws Exception {
		
		if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(ComisionVentaCobro comisionventacobroLocal) throws Exception {	
		if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				comisionventacobroLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				comisionventacobroLocal.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(PeriodoDetalleFormJInternalFrame.class)) {
				PeriodoBeanSwingJInternalFrame periodoBeanSwingJInternalFrameLocal=(PeriodoBeanSwingJInternalFrame) ((PeriodoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				periodoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoPeriodo(periodoBeanSwingJInternalFrameLocal.getperiodo(),true);
				periodoBeanSwingJInternalFrameLocal.actualizarLista(periodoBeanSwingJInternalFrameLocal.periodo,this.periodosForeignKey);

				periodoBeanSwingJInternalFrameLocal.actualizarRelaciones(periodoBeanSwingJInternalFrameLocal.periodo);

				comisionventacobroLocal.setPeriodo(periodoBeanSwingJInternalFrameLocal.periodo);

				this.addItemDefectoCombosForeignKeyPeriodo();
				this.cargarCombosFramePeriodosForeignKey("Formulario");
				this.setActualPeriodoForeignKey(periodoBeanSwingJInternalFrameLocal.periodo.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(VendedorDetalleFormJInternalFrame.class)) {
				VendedorBeanSwingJInternalFrame vendedorBeanSwingJInternalFrameLocal=(VendedorBeanSwingJInternalFrame) ((VendedorDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				vendedorBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoVendedor(vendedorBeanSwingJInternalFrameLocal.getvendedor(),true);
				vendedorBeanSwingJInternalFrameLocal.actualizarLista(vendedorBeanSwingJInternalFrameLocal.vendedor,this.vendedorsForeignKey);

				vendedorBeanSwingJInternalFrameLocal.actualizarRelaciones(vendedorBeanSwingJInternalFrameLocal.vendedor);

				comisionventacobroLocal.setVendedor(vendedorBeanSwingJInternalFrameLocal.vendedor);

				this.addItemDefectoCombosForeignKeyVendedor();
				this.cargarCombosFrameVendedorsForeignKey("Formulario");
				this.setActualVendedorForeignKey(vendedorBeanSwingJInternalFrameLocal.vendedor.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(FacturaDetalleFormJInternalFrame.class)) {
				FacturaBeanSwingJInternalFrame facturaBeanSwingJInternalFrameLocal=(FacturaBeanSwingJInternalFrame) ((FacturaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				facturaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoFactura(facturaBeanSwingJInternalFrameLocal.getfactura(),true);
				facturaBeanSwingJInternalFrameLocal.actualizarLista(facturaBeanSwingJInternalFrameLocal.factura,this.facturasForeignKey);

				facturaBeanSwingJInternalFrameLocal.actualizarRelaciones(facturaBeanSwingJInternalFrameLocal.factura);

				comisionventacobroLocal.setFactura(facturaBeanSwingJInternalFrameLocal.factura);

				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey("Formulario");
				this.setActualFacturaForeignKey(facturaBeanSwingJInternalFrameLocal.factura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarComisionVentaCobroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = comisionventacobroValidator.getInvalidValues(this.comisionventacobro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(ComisionVentaCobro comisionventacobro,List<ComisionVentaCobro> comisionventacobros) throws Exception {
		try	{		
			ComisionVentaCobroConstantesFunciones.actualizarLista(comisionventacobro,comisionventacobros,this.comisionventacobroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(ComisionVentaCobro comisionventacobro,List<ComisionVentaCobro> comisionventacobros) throws Exception {
		try	{			
			ComisionVentaCobroConstantesFunciones.actualizarSelectedLista(comisionventacobro,comisionventacobros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<ComisionVentaCobro> comisionventacobrosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				comisionventacobrosLocal=this.comisionventacobroLogic.getComisionVentaCobros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				comisionventacobrosLocal=this.comisionventacobros;
			}
			//ARCHITECTURE
		
			for(ComisionVentaCobro comisionventacobroLocal:comisionventacobrosLocal) {
				if(this.permiteMantenimiento(comisionventacobroLocal) && comisionventacobroLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+ComisionVentaCobroConstantesFunciones.getComisionVentaCobroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_empresaComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_ejercicioComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.IDPERIODO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_periodoComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.IDVENDEDOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_vendedorComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.IDFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_facturaComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.NUMEROFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_facturaComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.FECHAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelfecha_pagoComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.NOMBRECLIENTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnombre_clienteComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.NUMEROCOMPROBANTE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_comprobanteComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.ESTADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelestadoComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.TOTALFACTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_facturaComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.TOTALABONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_abonoComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.PORCENTAJECOMISION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelporcentaje_comisionComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.TOTALCOMISIONCOBRO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_comision_cobroComisionVentaCobro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(ComisionVentaCobroConstantesFunciones.NUMERODIAS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_diasComisionVentaCobro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_empresaComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_ejercicioComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_periodoComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_vendedorComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelid_facturaComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_facturaComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelfecha_pagoComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnombre_clienteComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_comprobanteComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelestadoComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_facturaComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_abonoComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelporcentaje_comisionComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_comision_cobroComisionVentaCobro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_diasComisionVentaCobro,"");
		
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
		this.iIdNuevoComisionVentaCobro--;	
		
		
		this.comisionventacobroAux=new ComisionVentaCobro();
		
		this.comisionventacobroAux.setId(this.iIdNuevoComisionVentaCobro);
		this.comisionventacobroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.comisionventacobroLogic.getComisionVentaCobros().add(this.comisionventacobroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.comisionventacobros.add(this.comisionventacobroAux);
		}
		//ARCHITECTURE
		
		this.comisionventacobro=this.comisionventacobroAux;
		
		if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobro);
			this.setVariablesObjetoActualToFormularioForeignKeyComisionVentaCobro(this.comisionventacobro);
		}
				
		//this.setDefaultControlesComisionVentaCobro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyComisionVentaCobro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyComisionVentaCobro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionVentaCobro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionVentaCobro(this.comisionventacobroBean,this.comisionventacobro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
			classes=ComisionVentaCobroConstantesFunciones.getClassesRelationshipsOfComisionVentaCobro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.comisionventacobroReturnGeneral=comisionventacobroLogic.procesarEventosComisionVentaCobrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionventacobroLogic.getComisionVentaCobros(),this.comisionventacobro,this.comisionventacobroParameterGeneral,this.isEsNuevoComisionVentaCobro,classes);//this.comisionventacobroLogic.getComisionVentaCobro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanComisionVentaCobro(this.comisionventacobroReturnGeneral,this.comisionventacobroBean,false);
		
		if(this.comisionventacobroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro());
		}
		
		if(this.comisionventacobroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro(),classes);//this.comisionventacobroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyComisionVentaCobro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyComisionVentaCobro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.RecargarFormComisionVentaCobro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingComisionVentaCobro(false);
						
			if(comisionventacobroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionVentaCobro();
			}
			
			this.actualizarVisualTableDatosComisionVentaCobro();
			
			this.jTableDatosComisionVentaCobro.setRowSelectionInterval(this.getIndiceNuevoComisionVentaCobro(), this.getIndiceNuevoComisionVentaCobro());
			
			this.seleccionarFilaTablaComisionVentaCobroActual();
						
			this.actualizarEstadoCeldasBotonesComisionVentaCobro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesComisionVentaCobro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarnumero_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarfecha_pagoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarnombre_clienteComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarnumero_comprobanteComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarestadoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activartotal_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activartotal_abonoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarporcentaje_comisionComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activartotal_comision_cobroComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarnumero_diasComisionVentaCobro);	
		//
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarid_empresaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarid_ejercicioComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarid_periodoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarid_vendedorComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setEnabled(isHabilitar && this.comisionventacobroConstantesFunciones.activarid_facturaComisionVentaCobro);
	};
	
	public void setDefaultControlesComisionVentaCobro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoComisionVentaCobro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.comisionventacobroSessionBean.setConGuardarRelaciones(true);			
			this.comisionventacobroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.setVisible(true);
			
					
		} else {
			//this.comisionventacobroSessionBean.setConGuardarRelaciones(false);			
			this.comisionventacobroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoComisionVentaCobro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
				if(comisionventacobroAux.getId().equals(this.iIdNuevoComisionVentaCobro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobros) {
				if(comisionventacobroAux.getId().equals(this.iIdNuevoComisionVentaCobro)) {
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
	
	public int getIndiceActualComisionVentaCobro(ComisionVentaCobro comisionventacobro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
				if(comisionventacobroAux.getId().equals(comisionventacobro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobros) {
				if(comisionventacobroAux.getId().equals(comisionventacobro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalComisionVentaCobro(ComisionVentaCobro comisionventacobroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
				if(comisionventacobroAux.getComisionVentaCobroOriginal().getId().equals(comisionventacobroOriginal.getId())) {
					existe=true;
					comisionventacobroOriginal.setId(comisionventacobroAux.getId());
					comisionventacobroOriginal.setVersionRow(comisionventacobroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobros) {
				if(comisionventacobroAux.getComisionVentaCobroOriginal().getId().equals(comisionventacobroOriginal.getId())) {
					existe=true;
					comisionventacobroOriginal.setId(comisionventacobroAux.getId());
					comisionventacobroOriginal.setVersionRow(comisionventacobroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosComisionVentaCobro(Boolean esParaCancelar) throws Exception {
		comisionventacobrosAux=new ArrayList<ComisionVentaCobro>();
		comisionventacobroAux=new ComisionVentaCobro();
		
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
					if(comisionventacobroAux.getId()<0) {
						comisionventacobrosAux.add(comisionventacobroAux);
					}		
				}
				this.iIdNuevoComisionVentaCobro=0L;
				this.comisionventacobroLogic.getComisionVentaCobros().removeAll(comisionventacobrosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobros) {
					if(comisionventacobroAux.getId()<0) {
						comisionventacobrosAux.add(comisionventacobroAux);
					}		
				}
				this.iIdNuevoComisionVentaCobro=0L;
				this.comisionventacobros.removeAll(comisionventacobrosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoComisionVentaCobro 
					&& this.comisionventacobroLogic.getComisionVentaCobros().size()>0
					) {
					comisionventacobroAux=this.comisionventacobroLogic.getComisionVentaCobros().get(this.comisionventacobroLogic.getComisionVentaCobros().size() - 1);
				
					if(comisionventacobroAux.getId()<0) {
						this.comisionventacobroLogic.getComisionVentaCobros().remove(comisionventacobroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoComisionVentaCobro && this.comisionventacobros.size()>0) {
					comisionventacobroAux=this.comisionventacobros.get(this.comisionventacobros.size() - 1);
				
					if(comisionventacobroAux.getId()<0) {
						this.comisionventacobros.remove(comisionventacobroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoComisionVentaCobro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(comisionventacobro.getId()<0) {
				this.comisionventacobroLogic.getComisionVentaCobros().remove(this.comisionventacobro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(comisionventacobro.getId()<0) {
				this.comisionventacobros.remove(this.comisionventacobro);
			}
		}			
	}
	
	public void setEstadosInicialesComisionVentaCobro(List<ComisionVentaCobro> comisionventacobrosAux) throws Exception {
		ComisionVentaCobroConstantesFunciones.setEstadosInicialesComisionVentaCobro(comisionventacobrosAux);
	}
	
	public void setEstadosInicialesComisionVentaCobro(ComisionVentaCobro comisionventacobroAux) throws Exception {
		ComisionVentaCobroConstantesFunciones.setEstadosInicialesComisionVentaCobro(comisionventacobroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarComisionVentaCobroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesComisionVentaCobro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarComisionVentaCobroActual()) {
				if(!this.isEsNuevoComisionVentaCobro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesComisionVentaCobro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoComisionVentaCobro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarComisionVentaCobroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Comision Venta Cobro ?", "MANTENIMIENTO DE Comision Venta Cobro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesComisionVentaCobro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(ComisionVentaCobro comisionventacobro) throws Exception {
		ComisionVentaCobroConstantesFunciones.seleccionarAsignar(this.comisionventacobro,comisionventacobro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarComisionVentaCobro=this.isPermisoActualizarOriginalComisionVentaCobro;
			
			
			this.seleccionarAsignar(comisionventacobro);
			
			

			idFacturaActual=comisionventacobro.getid_factura();
			this.seleccionarFacturaActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			ComisionVentaCobroConstantesFunciones.quitarEspaciosComisionVentaCobro(this.comisionventacobro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesComisionVentaCobro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.comisionventacobroSessionBean.setsFuncionBusquedaRapida(this.comisionventacobroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarFacturaActual() throws Exception {
		try	{
			Factura facturaAux=new Factura();

			if(this.idFacturaActual != null && this.idFacturaActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					facturaLogic.getEntityWithConnection(this.idFacturaActual);
					facturaAux= facturaLogic.getFactura();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				facturasForeignKey=new ArrayList<Factura>();
				facturasForeignKey.add(facturaAux);
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
			if(this.isEsNuevoComisionVentaCobro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosComisionVentaCobro(esParaCancelar);				
				this.cancelarNuevoComisionVentaCobro(esParaCancelar);								
			}
			
			this.comisionventacobro=new ComisionVentaCobro();
			
			this.inicializarComisionVentaCobro();
			
			this.actualizarEstadoCeldasBotonesComisionVentaCobro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarComisionVentaCobro() throws Exception {
		try {
			ComisionVentaCobroConstantesFunciones.inicializarComisionVentaCobro(this.comisionventacobro);
			
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
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.comisionventacobroLogic.getComisionVentaCobros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteComisionVentaCobros(String sAccionBusqueda,List<ComisionVentaCobro> comisionventacobrosParaReportes) throws Exception {
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
					sPathReporteFinal="ComisionVentaCobro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="ComisionVentaCobroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("ComisionVentaCobroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="ComisionVentaCobro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Comision Venta Cobroes");		
		parameters.put("busquedapor", ComisionVentaCobroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceComisionVentaCobro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			ComisionVentaCobroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			ComisionVentaCobroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceComisionVentaCobro=new JRBeanArrayDataSource(ComisionVentaCobroJInternalFrame.TraerComisionVentaCobroBeans(comisionventacobrosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceComisionVentaCobro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+ComisionVentaCobroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+ComisionVentaCobroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(ComisionVentaCobroBean.TraerComisionVentaCobroBeans(comisionventacobrosParaReportes).toArray()));
							
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
				this.generarExcelReporteComisionVentaCobros(sAccionBusqueda,sTipoArchivoReporte,comisionventacobrosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalComisionVentaCobros(sAccionBusqueda,sTipoArchivoReporte,comisionventacobrosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoComisionVentaCobroActionPerformed(null);
					//this.generarExcelReporteComisionVentaCobros(sAccionBusqueda,sTipoArchivoReporte,comisionventacobrosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalComisionVentaCobros(sAccionBusqueda,sTipoArchivoReporte,comisionventacobrosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesComisionVentaCobros(sAccionBusqueda,sTipoArchivoReporte,comisionventacobrosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesComisionVentaCobros(sAccionBusqueda,sTipoArchivoReporte,comisionventacobrosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteComisionVentaCobros(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionVentaCobro> comisionventacobrosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionVentaCobros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionVentaCobro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(ComisionVentaCobro comisionventacobro : comisionventacobrosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			ComisionVentaCobroConstantesFunciones.generarExcelReporteDataComisionVentaCobro("NORMAL",row,workbook,comisionventacobro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderComisionVentaCobro(String sTipo,Row row,Workbook workbook) {
		
		ComisionVentaCobroConstantesFunciones.generarExcelReporteHeaderComisionVentaCobro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalComisionVentaCobros(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionVentaCobro> comisionventacobrosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionVentaCobros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(ComisionVentaCobro comisionventacobro : comisionventacobrosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(ComisionVentaCobroConstantesFunciones.getComisionVentaCobroDescripcion(comisionventacobro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getperiodo_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getvendedor_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getfactura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getnumero_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getfecha_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getnombre_cliente());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getnumero_comprobante());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getestado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.gettotal_factura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.gettotal_abono());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getporcentaje_comision());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.gettotal_comision_cobro());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(comisionventacobro.getnumero_dias());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesComisionVentaCobros(String sAccionBusqueda,String sTipoArchivoReporte,List<ComisionVentaCobro> comisionventacobrosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<ComisionVentaCobro> comisionventacobrosRespaldo=null;
		
		classes=ComisionVentaCobroConstantesFunciones.getClassesRelationshipsOfComisionVentaCobro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.comisionventacobroLogic.setDatosCliente(this.datosCliente);
		this.comisionventacobroLogic.setDatosDeep(this.datosDeep);
		this.comisionventacobroLogic.setIsConDeep(true);
		
		comisionventacobrosRespaldo=this.comisionventacobroLogic.getComisionVentaCobros();
		
		this.comisionventacobroLogic.setComisionVentaCobros(comisionventacobrosParaReportes);	
		this.comisionventacobroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		comisionventacobrosParaReportes=this.comisionventacobroLogic.getComisionVentaCobros();
		this.comisionventacobroLogic.setComisionVentaCobros(comisionventacobrosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("ComisionVentaCobros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderComisionVentaCobro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(ComisionVentaCobro comisionventacobro : comisionventacobrosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderComisionVentaCobro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			ComisionVentaCobroConstantesFunciones.generarExcelReporteDataComisionVentaCobro("NORMAL",row,workbook,comisionventacobro,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(ComisionVentaCobroConstantesFunciones.getComisionVentaCobroDescripcion(comisionventacobro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessComisionVentaCobro() throws Exception {		
		this.startProcessComisionVentaCobro(true);
	}
	
	public void startProcessComisionVentaCobro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasComisionVentaCobro ,this.jPanelParametrosReportesComisionVentaCobro, this.jScrollPanelDatosComisionVentaCobro,this.jPanelPaginacionComisionVentaCobro, this.jScrollPanelDatosEdicionComisionVentaCobro, this.jPanelAccionesComisionVentaCobro,this.jPanelAccionesFormularioComisionVentaCobro,this.jmenuBarComisionVentaCobro,this.jmenuBarDetalleComisionVentaCobro,this.jTtoolBarComisionVentaCobro,this.jTtoolBarDetalleComisionVentaCobro);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionVentaCobro=this.jTabbedPaneBusquedasComisionVentaCobro; 
		
		final JPanel jPanelParametrosReportesComisionVentaCobro=this.jPanelParametrosReportesComisionVentaCobro;
		//final JScrollPane jScrollPanelDatosComisionVentaCobro=this.jScrollPanelDatosComisionVentaCobro;
		final JTable jTableDatosComisionVentaCobro=this.jTableDatosComisionVentaCobro;		
		final JPanel jPanelPaginacionComisionVentaCobro=this.jPanelPaginacionComisionVentaCobro;
		//final JScrollPane jScrollPanelDatosEdicionComisionVentaCobro=this.jScrollPanelDatosEdicionComisionVentaCobro;
		final JPanel jPanelAccionesComisionVentaCobro=this.jPanelAccionesComisionVentaCobro;
		
		JPanel jPanelCamposAuxiliarComisionVentaCobro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarComisionVentaCobro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			jPanelCamposAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jPanelCamposComisionVentaCobro;
			jPanelAccionesFormularioAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jPanelAccionesFormularioComisionVentaCobro;
		}
		
		final JPanel jPanelCamposComisionVentaCobro=jPanelCamposAuxiliarComisionVentaCobro;
		final JPanel jPanelAccionesFormularioComisionVentaCobro=jPanelAccionesFormularioAuxiliarComisionVentaCobro;
		
		
		final JMenuBar jmenuBarComisionVentaCobro=this.jmenuBarComisionVentaCobro;
		final JToolBar jTtoolBarComisionVentaCobro=this.jTtoolBarComisionVentaCobro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarComisionVentaCobro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionVentaCobro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			jmenuBarDetalleAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jmenuBarDetalleComisionVentaCobro;
			jTtoolBarDetalleAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jTtoolBarDetalleComisionVentaCobro;
		}
		
		final JMenuBar jmenuBarDetalleComisionVentaCobro=jmenuBarDetalleAuxiliarComisionVentaCobro;
		final JToolBar jTtoolBarDetalleComisionVentaCobro=jTtoolBarDetalleAuxiliarComisionVentaCobro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionVentaCobro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionVentaCobro;
			processRunnable.jTableDatos=jTableDatosComisionVentaCobro;
			processRunnable.jPanelCampos=jPanelCamposComisionVentaCobro;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionVentaCobro;
			processRunnable.jPanelAcciones=jPanelAccionesComisionVentaCobro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionVentaCobro;
			
			
			processRunnable.jmenuBar=jmenuBarComisionVentaCobro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionVentaCobro;
			processRunnable.jTtoolBar=jTtoolBarComisionVentaCobro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionVentaCobro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionVentaCobro ,jPanelParametrosReportesComisionVentaCobro,jTableDatosComisionVentaCobro, /*jScrollPanelDatosComisionVentaCobro,*/jPanelCamposComisionVentaCobro,jPanelPaginacionComisionVentaCobro, /*jScrollPanelDatosEdicionComisionVentaCobro,*/ jPanelAccionesComisionVentaCobro,jPanelAccionesFormularioComisionVentaCobro,jmenuBarComisionVentaCobro,jmenuBarDetalleComisionVentaCobro,jTtoolBarComisionVentaCobro,jTtoolBarDetalleComisionVentaCobro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasComisionVentaCobro ,jPanelParametrosReportesComisionVentaCobro, jScrollPanelDatosComisionVentaCobro,jPanelPaginacionComisionVentaCobro, jScrollPanelDatosEdicionComisionVentaCobro, jPanelAccionesComisionVentaCobro,jPanelAccionesFormularioComisionVentaCobro,jmenuBarComisionVentaCobro,jmenuBarDetalleComisionVentaCobro,jTtoolBarComisionVentaCobro,jTtoolBarDetalleComisionVentaCobro);
						
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
	
	public void finishProcessComisionVentaCobro() {// throws Exception 
		this.finishProcessComisionVentaCobro(true);
	}
	
	public void finishProcessComisionVentaCobro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasComisionVentaCobro ,this.jPanelParametrosReportesComisionVentaCobro, this.jScrollPanelDatosComisionVentaCobro,this.jPanelPaginacionComisionVentaCobro, this.jScrollPanelDatosEdicionComisionVentaCobro, this.jPanelAccionesComisionVentaCobro,this.jPanelAccionesFormularioComisionVentaCobro,this.jmenuBarComisionVentaCobro,this.jmenuBarDetalleComisionVentaCobro,this.jTtoolBarComisionVentaCobro,this.jTtoolBarDetalleComisionVentaCobro);		
		
		final JTabbedPane jTabbedPaneBusquedasComisionVentaCobro=this.jTabbedPaneBusquedasComisionVentaCobro; 
		
		final JPanel jPanelParametrosReportesComisionVentaCobro=this.jPanelParametrosReportesComisionVentaCobro;
		//final JScrollPane jScrollPanelDatosComisionVentaCobro=this.jScrollPanelDatosComisionVentaCobro;
		final JTable jTableDatosComisionVentaCobro=this.jTableDatosComisionVentaCobro;		
		final JPanel jPanelPaginacionComisionVentaCobro=this.jPanelPaginacionComisionVentaCobro;
		//final JScrollPane jScrollPanelDatosEdicionComisionVentaCobro=this.jScrollPanelDatosEdicionComisionVentaCobro;
		final JPanel jPanelAccionesComisionVentaCobro=this.jPanelAccionesComisionVentaCobro;
		
		JPanel jPanelCamposAuxiliarComisionVentaCobro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarComisionVentaCobro=new JPanel();
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			jPanelCamposAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jPanelCamposComisionVentaCobro;
			jPanelAccionesFormularioAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jPanelAccionesFormularioComisionVentaCobro;
		}
		
		final JPanel jPanelCamposComisionVentaCobro=jPanelCamposAuxiliarComisionVentaCobro;
		final JPanel jPanelAccionesFormularioComisionVentaCobro=jPanelAccionesFormularioAuxiliarComisionVentaCobro;
		
		
		final JMenuBar jmenuBarComisionVentaCobro=this.jmenuBarComisionVentaCobro;		
		final JToolBar jTtoolBarComisionVentaCobro=this.jTtoolBarComisionVentaCobro;
				
		JMenuBar jmenuBarDetalleAuxiliarComisionVentaCobro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarComisionVentaCobro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			jmenuBarDetalleAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jmenuBarDetalleComisionVentaCobro;
			jTtoolBarDetalleAuxiliarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jTtoolBarDetalleComisionVentaCobro;		
		}
		
		final JMenuBar jmenuBarDetalleComisionVentaCobro=jmenuBarDetalleAuxiliarComisionVentaCobro;
		final JToolBar jTtoolBarDetalleComisionVentaCobro=jTtoolBarDetalleAuxiliarComisionVentaCobro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasComisionVentaCobro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesComisionVentaCobro;
			processRunnable.jTableDatos=jTableDatosComisionVentaCobro;
			processRunnable.jPanelCampos=jPanelCamposComisionVentaCobro;
			processRunnable.jPanelPaginacion=jPanelPaginacionComisionVentaCobro;
			processRunnable.jPanelAcciones=jPanelAccionesComisionVentaCobro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioComisionVentaCobro;
			
			
			processRunnable.jmenuBar=jmenuBarComisionVentaCobro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleComisionVentaCobro;
			processRunnable.jTtoolBar=jTtoolBarComisionVentaCobro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleComisionVentaCobro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasComisionVentaCobro ,jPanelParametrosReportesComisionVentaCobro, jTableDatosComisionVentaCobro,/*jScrollPanelDatosComisionVentaCobro,*/jPanelCamposComisionVentaCobro,jPanelPaginacionComisionVentaCobro, /*jScrollPanelDatosEdicionComisionVentaCobro,*/ jPanelAccionesComisionVentaCobro,jPanelAccionesFormularioComisionVentaCobro,jmenuBarComisionVentaCobro,jmenuBarDetalleComisionVentaCobro,jTtoolBarComisionVentaCobro,jTtoolBarDetalleComisionVentaCobro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesComisionVentaCobro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarComisionVentaCobro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuComisionVentaCobro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarComisionVentaCobro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarComisionVentaCobro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleComisionVentaCobro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuComisionVentaCobro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarComisionVentaCobro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleComisionVentaCobro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.comisionventacobroConstantesFunciones.getsFinalQueryComisionVentaCobro();
		String  finalQueryPaginacionTodos=this.comisionventacobroConstantesFunciones.getsFinalQueryComisionVentaCobro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=ComisionVentaCobroConstantesFunciones.getArrayColumnasGlobalesNoComisionVentaCobro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=ComisionVentaCobroConstantesFunciones.getArrayColumnasGlobalesComisionVentaCobro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,ComisionVentaCobroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.comisionventacobrosEliminados= new ArrayList<ComisionVentaCobro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessComisionVentaCobro();
		
				///*ComisionVentaCobroSessionBean*/this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			
			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
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
					this.iNumeroPaginacion=ComisionVentaCobroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=ComisionVentaCobroConstantesFunciones.getClassesForeignKeysOfComisionVentaCobro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/comisionventacobro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			comisionventacobrosAux= new ArrayList<ComisionVentaCobro>();
			
				
			comisionventacobroLogic.setDatosCliente(this.datosCliente);
			comisionventacobroLogic.setDatosDeep(this.datosDeep);
			comisionventacobroLogic.setIsConDeep(true);
			
			
			comisionventacobroLogic.getComisionVentaCobroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					comisionventacobroLogic.getTodosComisionVentaCobros(finalQueryGlobal,pagination);
					
					//comisionventacobroLogic.getTodosComisionVentaCobrosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(comisionventacobroLogic.getComisionVentaCobros()==null|| comisionventacobroLogic.getComisionVentaCobros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionventacobrosAux= new ArrayList<ComisionVentaCobro>();
							comisionventacobrosAux.addAll(comisionventacobroLogic.getComisionVentaCobros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionventacobrosAux= new ArrayList<ComisionVentaCobro>();
							comisionventacobrosAux.addAll(comisionventacobros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionventacobroLogic.getTodosComisionVentaCobros(finalQueryGlobal+"",this.pagination);												
							
							//comisionventacobroLogic.getTodosComisionVentaCobrosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteComisionVentaCobros("Todos",comisionventacobroLogic.getComisionVentaCobros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							comisionventacobroLogic.setComisionVentaCobros(new ArrayList<ComisionVentaCobro>());					
							comisionventacobroLogic.getComisionVentaCobros().addAll(comisionventacobrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionventacobros=new ArrayList<ComisionVentaCobro>();
							comisionventacobros.addAll(comisionventacobrosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idComisionVentaCobro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idComisionVentaCobro=this.idActual;
				
				} else if(this.idComisionVentaCobroActual!=null && this.idComisionVentaCobroActual!=0L) {
					idComisionVentaCobro=idComisionVentaCobroActual;
				}
				
					
				this.sDetalleReporte=ComisionVentaCobroConstantesFunciones.getDetalleIndicePorId(idComisionVentaCobro);
				
				this.comisionventacobros=new ArrayList<ComisionVentaCobro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					comisionventacobroLogic.getEntity(idComisionVentaCobro);
					
					//comisionventacobroLogic.getEntityWithConnection(idComisionVentaCobro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLogic.setComisionVentaCobros(new ArrayList<ComisionVentaCobro>());
					comisionventacobroLogic.getComisionVentaCobros().add(comisionventacobroLogic.getComisionVentaCobro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobros=new ArrayList<ComisionVentaCobro>();
					this.comisionventacobros.add(comisionventacobro);
				}
				
				if(comisionventacobroLogic.getComisionVentaCobro()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=ComisionVentaCobroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					comisionventacobroLogic.getComisionVentaCobrosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionVentaCobroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionVentaCobroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=comisionventacobroLogic.getComisionVentaCobros()==null||comisionventacobroLogic.getComisionVentaCobros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=comisionventacobros==null|| comisionventacobros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobrosAux=new ArrayList<ComisionVentaCobro>();
						comisionventacobrosAux.addAll(comisionventacobroLogic.getComisionVentaCobros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionventacobrosAux=new ArrayList<ComisionVentaCobro>();
							comisionventacobrosAux.addAll(comisionventacobros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							comisionventacobroLogic.getComisionVentaCobrosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=ComisionVentaCobroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=ComisionVentaCobroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteComisionVentaCobros("FK_IdEmpresa",comisionventacobroLogic.getComisionVentaCobros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteComisionVentaCobros("FK_IdEmpresa",comisionventacobros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobroLogic.setComisionVentaCobros(new ArrayList<ComisionVentaCobro>());
						comisionventacobroLogic.getComisionVentaCobros().addAll(comisionventacobrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionventacobros=new ArrayList<ComisionVentaCobro>();
							comisionventacobros.addAll(comisionventacobrosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesComisionVentaCobro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessComisionVentaCobro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionventacobroLogic.getComisionVentaCobros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionventacobros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=comisionventacobroLogic.getComisionVentaCobros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=comisionventacobros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(ComisionVentaCobro comisionventacobro) {
		Boolean permite=true;
		
		if(this.comisionventacobro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=ComisionVentaCobroConstantesFunciones.getOrderByListaComisionVentaCobro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=ComisionVentaCobroConstantesFunciones.getOrderByListaComisionVentaCobro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionVentaCobro comisionventacobro:comisionventacobroLogic.getComisionVentaCobros()) {
				if(comisionventacobro.getsType().equals(Constantes2.S_TOTALES)) {
					comisionventacobroTotales=comisionventacobro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionVentaCobro comisionventacobro:this.comisionventacobros) {
				if(comisionventacobro.getsType().equals(Constantes2.S_TOTALES)) {
					comisionventacobroTotales=comisionventacobro;
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
			this.comisionventacobroAux=new ComisionVentaCobro();
			this.comisionventacobroAux.setsType(Constantes2.S_TOTALES);
			this.comisionventacobroAux.setIsNew(false);
			this.comisionventacobroAux.setIsChanged(false);
			this.comisionventacobroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				ComisionVentaCobroConstantesFunciones.TotalizarValoresFilaComisionVentaCobro(this.comisionventacobroLogic.getComisionVentaCobros(),this.comisionventacobroAux);
				
				this.comisionventacobroLogic.getComisionVentaCobros().add(this.comisionventacobroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				ComisionVentaCobroConstantesFunciones.TotalizarValoresFilaComisionVentaCobro(this.comisionventacobros,this.comisionventacobroAux);
				
				this.comisionventacobros.add(this.comisionventacobroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		comisionventacobroTotales=new ComisionVentaCobro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionventacobroLogic.getComisionVentaCobros().remove(comisionventacobroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.comisionventacobros.remove(comisionventacobroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		comisionventacobroTotales=new ComisionVentaCobro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(ComisionVentaCobro comisionventacobro:comisionventacobroLogic.getComisionVentaCobros()) {
				if(comisionventacobro.getsType().equals(Constantes2.S_TOTALES)) {
					comisionventacobroTotales=comisionventacobro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionVentaCobroConstantesFunciones.TotalizarValoresFilaComisionVentaCobro(this.comisionventacobroLogic.getComisionVentaCobros(),comisionventacobroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(ComisionVentaCobro comisionventacobro:this.comisionventacobros) {
				if(comisionventacobro.getsType().equals(Constantes2.S_TOTALES)) {
					comisionventacobroTotales=comisionventacobro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				ComisionVentaCobroConstantesFunciones.TotalizarValoresFilaComisionVentaCobro(this.comisionventacobros,comisionventacobroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getComisionVentaCobrosFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionVentaCobrosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionVentaCobrosFK_IdFactura()throws Exception {
		try {
			sAccionBusqueda="FK_IdFactura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionVentaCobrosFK_IdPeriodo()throws Exception {
		try {
			sAccionBusqueda="FK_IdPeriodo";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getComisionVentaCobrosFK_IdVendedor()throws Exception {
		try {
			sAccionBusqueda="FK_IdVendedor";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getComisionVentaCobrosFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLogic.getComisionVentaCobrosFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionVentaCobrosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLogic.getComisionVentaCobrosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionVentaCobrosFK_IdFactura(String sFinalQuery,Long id_factura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLogic.getComisionVentaCobrosFK_IdFactura(sFinalQuery,this.pagination,id_factura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionVentaCobrosFK_IdPeriodo(String sFinalQuery,Long id_periodo)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLogic.getComisionVentaCobrosFK_IdPeriodo(sFinalQuery,this.pagination,id_periodo);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getComisionVentaCobrosFK_IdVendedor(String sFinalQuery,Long id_vendedor)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLogic.getComisionVentaCobrosFK_IdVendedor(sFinalQuery,this.pagination,id_vendedor);
				
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
	
	public void inicializarPermisosComisionVentaCobro() {
		this.isPermisoTodoComisionVentaCobro=false;
		this.isPermisoNuevoComisionVentaCobro=false;
		this.isPermisoActualizarComisionVentaCobro=false;
		this.isPermisoActualizarOriginalComisionVentaCobro=false;
		this.isPermisoEliminarComisionVentaCobro=false;
		this.isPermisoGuardarCambiosComisionVentaCobro=false;
		this.isPermisoConsultaComisionVentaCobro=false;
		this.isPermisoBusquedaComisionVentaCobro=false;
		this.isPermisoReporteComisionVentaCobro=false;		
		this.isPermisoOrdenComisionVentaCobro=false;		
		this.isPermisoPaginacionMedioComisionVentaCobro=false;		
		this.isPermisoPaginacionAltoComisionVentaCobro=false;
		this.isPermisoPaginacionTodoComisionVentaCobro=false;
		this.isPermisoCopiarComisionVentaCobro=false;		
		this.isPermisoVerFormComisionVentaCobro=false;		
		this.isPermisoDuplicarComisionVentaCobro=false;		
		this.isPermisoOrdenComisionVentaCobro=false;		
	}
	
	public void setPermisosUsuarioComisionVentaCobro(Boolean isPermiso) {
		this.isPermisoTodoComisionVentaCobro=isPermiso;
		this.isPermisoNuevoComisionVentaCobro=isPermiso;
		this.isPermisoActualizarComisionVentaCobro=isPermiso;
		this.isPermisoActualizarOriginalComisionVentaCobro=isPermiso;
		this.isPermisoEliminarComisionVentaCobro=isPermiso;
		this.isPermisoGuardarCambiosComisionVentaCobro=isPermiso;
		this.isPermisoConsultaComisionVentaCobro=isPermiso;
		this.isPermisoBusquedaComisionVentaCobro=isPermiso;
		this.isPermisoReporteComisionVentaCobro=isPermiso;
		this.isPermisoOrdenComisionVentaCobro=isPermiso;		
		this.isPermisoPaginacionMedioComisionVentaCobro=isPermiso;		
		this.isPermisoPaginacionAltoComisionVentaCobro=isPermiso;		
		this.isPermisoPaginacionTodoComisionVentaCobro=isPermiso;		
		this.isPermisoCopiarComisionVentaCobro=isPermiso;		
		this.isPermisoVerFormComisionVentaCobro=isPermiso;		
		this.isPermisoDuplicarComisionVentaCobro=isPermiso;
		this.isPermisoOrdenComisionVentaCobro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioComisionVentaCobro(Boolean isPermiso) {
		//this.isPermisoTodoComisionVentaCobro=isPermiso;
		this.isPermisoNuevoComisionVentaCobro=isPermiso;
		this.isPermisoActualizarComisionVentaCobro=isPermiso;
		this.isPermisoActualizarOriginalComisionVentaCobro=isPermiso;
		this.isPermisoEliminarComisionVentaCobro=isPermiso;
		this.isPermisoGuardarCambiosComisionVentaCobro=isPermiso;
		//this.isPermisoConsultaComisionVentaCobro=isPermiso;
		//this.isPermisoBusquedaComisionVentaCobro=isPermiso;
		//this.isPermisoReporteComisionVentaCobro=isPermiso;
		//this.isPermisoOrdenComisionVentaCobro=isPermiso;		
		//this.isPermisoPaginacionMedioComisionVentaCobro=isPermiso;		
		//this.isPermisoPaginacionAltoComisionVentaCobro=isPermiso;		
		//this.isPermisoPaginacionTodoComisionVentaCobro=isPermiso;		
		//this.isPermisoCopiarComisionVentaCobro=isPermiso;		
		//this.isPermisoDuplicarComisionVentaCobro=isPermiso;
		//this.isPermisoOrdenComisionVentaCobro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioComisionVentaCobroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(ComisionVentaCobroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebComisionVentaCobro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioComisionVentaCobroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioComisionVentaCobroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionComisionVentaCobroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioComisionVentaCobroClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioComisionVentaCobro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(ComisionVentaCobroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, ComisionVentaCobroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoComisionVentaCobro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarComisionVentaCobro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalComisionVentaCobro=this.isPermisoActualizarComisionVentaCobro;
			this.isPermisoEliminarComisionVentaCobro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosComisionVentaCobro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaComisionVentaCobro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaComisionVentaCobro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoComisionVentaCobro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteComisionVentaCobro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionVentaCobro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioComisionVentaCobro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoComisionVentaCobro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoComisionVentaCobro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarComisionVentaCobro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormComisionVentaCobro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarComisionVentaCobro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenComisionVentaCobro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosComisionVentaCobro.setToolTipText(this.jTableDatosComisionVentaCobro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioComisionVentaCobro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioComisionVentaCobro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(ComisionVentaCobroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(ComisionVentaCobroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioComisionVentaCobro() throws Exception {
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
	public void inicializarCombosForeignKeyComisionVentaCobroListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
				this.periodosForeignKey=new ArrayList();
				this.vendedorsForeignKey=new ArrayList();
				this.facturasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyComisionVentaCobroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(ComisionVentaCobroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyComisionVentaCobroListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyPeriodoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyVendedorListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyFacturaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=FacturaConstantesFunciones.SFINALQUERY;

				this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyComisionVentaCobroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			ComisionVentaCobroParameterReturnGeneral comisionventacobroReturnGeneral=new ComisionVentaCobroParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.comisionventacobroConstantesFunciones.cargarid_empresaComisionVentaCobro)
					 || (this.esRecargarFks && this.comisionventacobroConstantesFunciones.cargarid_empresaComisionVentaCobro)) {

					if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+comisionventacobroSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.comisionventacobroConstantesFunciones.cargarid_ejercicioComisionVentaCobro)
					 || (this.esRecargarFks && this.comisionventacobroConstantesFunciones.cargarid_ejercicioComisionVentaCobro)) {

					if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+comisionventacobroSessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}


				String finalQueryGlobalPeriodo="";

				if(((this.periodosForeignKey==null||this.periodosForeignKey.size()<=0) && this.comisionventacobroConstantesFunciones.cargarid_periodoComisionVentaCobro)
					 || (this.esRecargarFks && this.comisionventacobroConstantesFunciones.cargarid_periodoComisionVentaCobro)) {

					if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=PeriodoConstantesFunciones.getArrayColumnasGlobalesPeriodo(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalPeriodo=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,PeriodoConstantesFunciones.TABLENAME);

						finalQueryGlobalPeriodo=Funciones.GetFinalQueryAppend(finalQueryGlobalPeriodo, "");
						finalQueryGlobalPeriodo+=PeriodoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosPeriodosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalPeriodo=" WHERE " + ConstantesSql.ID + "="+comisionventacobroSessionBean.getlidPeriodoActual();
					}
				} else {
					finalQueryGlobalPeriodo="NONE";
				}


				String finalQueryGlobalVendedor="";

				if(((this.vendedorsForeignKey==null||this.vendedorsForeignKey.size()<=0) && this.comisionventacobroConstantesFunciones.cargarid_vendedorComisionVentaCobro)
					 || (this.esRecargarFks && this.comisionventacobroConstantesFunciones.cargarid_vendedorComisionVentaCobro)) {

					if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=VendedorConstantesFunciones.getArrayColumnasGlobalesVendedor(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalVendedor=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,VendedorConstantesFunciones.TABLENAME);

						finalQueryGlobalVendedor=Funciones.GetFinalQueryAppend(finalQueryGlobalVendedor, "");
						finalQueryGlobalVendedor+=VendedorConstantesFunciones.SFINALQUERY;

						//this.cargarCombosVendedorsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalVendedor=" WHERE " + ConstantesSql.ID + "="+comisionventacobroSessionBean.getlidVendedorActual();
					}
				} else {
					finalQueryGlobalVendedor="NONE";
				}


				String finalQueryGlobalFactura="";

				if(((this.facturasForeignKey==null||this.facturasForeignKey.size()<=0) && this.comisionventacobroConstantesFunciones.cargarid_facturaComisionVentaCobro)
					 || (this.esRecargarFks && this.comisionventacobroConstantesFunciones.cargarid_facturaComisionVentaCobro)) {

					if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=FacturaConstantesFunciones.getArrayColumnasGlobalesFactura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalFactura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,FacturaConstantesFunciones.TABLENAME);

						finalQueryGlobalFactura=Funciones.GetFinalQueryAppend(finalQueryGlobalFactura, "");
						finalQueryGlobalFactura+=FacturaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosFacturasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalFactura=" WHERE " + ConstantesSql.ID + "="+comisionventacobroSessionBean.getlidFacturaActual();
					}
				} else {
					finalQueryGlobalFactura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				comisionventacobroReturnGeneral=comisionventacobroLogic.cargarCombosLoteForeignKeyComisionVentaCobro(finalQueryGlobalEmpresa,finalQueryGlobalEjercicio,finalQueryGlobalPeriodo,finalQueryGlobalVendedor,finalQueryGlobalFactura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=comisionventacobroReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=comisionventacobroReturnGeneral.getejerciciosForeignKey();
			}

			if(!finalQueryGlobalPeriodo.equals("NONE")) {
				this.periodosForeignKey=comisionventacobroReturnGeneral.getperiodosForeignKey();
			}

			if(!finalQueryGlobalVendedor.equals("NONE")) {
				this.vendedorsForeignKey=comisionventacobroReturnGeneral.getvendedorsForeignKey();
			}

			if(!finalQueryGlobalFactura.equals("NONE")) {
				this.facturasForeignKey=comisionventacobroReturnGeneral.getfacturasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyComisionVentaCobro()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEjercicio();
			this.addItemDefectoCombosForeignKeyPeriodo();
			this.addItemDefectoCombosForeignKeyVendedor();
			this.addItemDefectoCombosForeignKeyFactura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.comisionventacobroSessionBean==null) {
				this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionPeriodo()) {
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

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionVendedor()) {
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

	public void addItemDefectoCombosForeignKeyFactura()throws Exception {
		try {

			if(!this.comisionventacobroSessionBean.getisBusquedaDesdeForeignKeySesionFactura()) {
				Factura factura=new Factura();
				FacturaConstantesFunciones.setFacturaDescripcion(factura,Constantes.SMENSAJE_ESCOJA_OPCION);
				factura.setId(null);

				if(!FacturaConstantesFunciones.ExisteEnLista(this.facturasForeignKey,factura,true)) {

					this.facturasForeignKey.add(0,factura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyComisionVentaCobro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyComisionVentaCobro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyComisionVentaCobro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.comisionventacobro.setfecha_pago(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyComisionVentaCobro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyComisionVentaCobro(ComisionVentaCobro comisionventacobro)throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(comisionventacobro.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(comisionventacobro.getid_periodo(),false,"Formulario");
			this.setActualVendedorForeignKey(comisionventacobro.getid_vendedor(),false,"Formulario");
			this.setActualFacturaForeignKey(comisionventacobro.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyComisionVentaCobro(ComisionVentaCobro comisionventacobro,String sTipoEvento)throws Exception {	
		try {
			
			

				if(comisionventacobro.getFactura()!=null && !sTipoEvento.equals("id_facturaComisionVentaCobro")) { //sTipoEvento Evita Bucle Infinito

					this.facturasForeignKey=new ArrayList<Factura>();
					this.facturasForeignKey.add(comisionventacobro.getFactura());

					this.addItemDefectoCombosForeignKeyFactura();
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyComisionVentaCobro()throws Exception {	
		try {
			
			this.setActualEjercicioForeignKey(this.comisionventacobroConstantesFunciones.getid_ejercicio(),false,"Formulario");
			this.setActualPeriodoForeignKey(this.comisionventacobroConstantesFunciones.getid_periodo(),false,"Formulario");
			this.setActualVendedorForeignKey(this.comisionventacobroConstantesFunciones.getid_vendedor(),false,"Formulario");
			this.setActualFacturaForeignKey(this.comisionventacobroConstantesFunciones.getid_factura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyComisionVentaCobro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyComisionVentaCobro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyComisionVentaCobro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroComisionVentaCobro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyComisionVentaCobro()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");
			this.cargarCombosFramePeriodosForeignKey("Todos");
			this.cargarCombosFrameVendedorsForeignKey("Todos");
			this.cargarCombosFrameFacturasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyComisionVentaCobro(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFramePeriodosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameVendedorsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyComisionVentaCobro()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.getItemCount()>0) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public ComisionVentaCobroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public ComisionVentaCobroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public ComisionVentaCobroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean(); 
		this.comisionventacobroConstantesFunciones=new ComisionVentaCobroConstantesFunciones(); 
		this.comisionventacobroBean=new ComisionVentaCobro();//(this.comisionventacobroConstantesFunciones); 		
		this.comisionventacobroReturnGeneral=new ComisionVentaCobroParameterReturnGeneral(); 
		
		this.comisionventacobroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.comisionventacobroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public ComisionVentaCobroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public ComisionVentaCobroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public ComisionVentaCobroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessComisionVentaCobro(true);
			
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
			
			this.comisionventacobroConstantesFunciones=new ComisionVentaCobroConstantesFunciones(); 
			this.comisionventacobroBean=new ComisionVentaCobro();//this.comisionventacobroConstantesFunciones); 			
			this.comisionventacobroReturnGeneral=new ComisionVentaCobroParameterReturnGeneral(); 
		
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Comision Venta Cobro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.comisionventacobro=new ComisionVentaCobro();
			this.comisionventacobros = new ArrayList<ComisionVentaCobro>();
			this.comisionventacobrosAux = new ArrayList<ComisionVentaCobro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic=new ComisionVentaCobroLogic();
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			//this.comisionventacobroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.comisionventacobroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormComisionVentaCobro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionVentaCobro);	
					}
					
					if(this.jInternalFrameImportacionComisionVentaCobro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionVentaCobro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByComisionVentaCobro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByComisionVentaCobro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionVentaCobro);
				this.jInternalFrameDetalleFormComisionVentaCobro.setVisible(false);
				this.jInternalFrameDetalleFormComisionVentaCobro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionVentaCobro);
					this.jInternalFrameReporteDinamicoComisionVentaCobro.setVisible(false);
					this.jInternalFrameReporteDinamicoComisionVentaCobro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionComisionVentaCobro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionComisionVentaCobro);
					this.jInternalFrameImportacionComisionVentaCobro.setVisible(false);
					this.jInternalFrameImportacionComisionVentaCobro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByComisionVentaCobro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByComisionVentaCobro);
					this.jInternalFrameOrderByComisionVentaCobro.setVisible(false);
					this.jInternalFrameOrderByComisionVentaCobro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idComisionVentaCobroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=ComisionVentaCobroConstantesFunciones.INUMEROPAGINACION;
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
			
			this.comisionventacobroReturnGeneral=new ComisionVentaCobroParameterReturnGeneral();
			
			this.comisionventacobroParameterGeneral=new ComisionVentaCobroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.comisionventacobroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
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
			
			if(ComisionVentaCobroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionVentaCobroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),this.comisionventacobroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,ComisionVentaCobroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),this.comisionventacobroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaDuplicarComisionVentaCobro=true;
			this.isVisibilidadCeldaCopiarComisionVentaCobro=true;
			this.isVisibilidadCeldaVerFormComisionVentaCobro=true;
			this.isVisibilidadCeldaOrdenComisionVentaCobro=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
			this.isVisibilidadCeldaModificarComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=false;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdFactura=true;
			this.isVisibilidadFK_IdPeriodo=true;
			this.isVisibilidadFK_IdVendedor=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesComisionVentaCobro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosComisionVentaCobro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioComisionVentaCobro(false);
			
			this.setPermisosUsuarioComisionVentaCobro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado() 
				|| (this.comisionventacobroSessionBean.getEsGuardarRelacionado() && this.comisionventacobroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioComisionVentaCobroClasesRelacionadas();
			}
			
			if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioComisionVentaCobroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosComisionVentaCobro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualComisionVentaCobro();
			}
			
			if(!this.isPermisoBusquedaComisionVentaCobro) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioComisionVentaCobro,this.isPermisoPaginacionMedioComisionVentaCobro,this.isPermisoPaginacionTodoComisionVentaCobro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(ComisionVentaCobroConstantesFunciones.getTiposSeleccionarComisionVentaCobro());
				
				this.tiposColumnasSelect=ComisionVentaCobroConstantesFunciones.getTiposSeleccionarComisionVentaCobro(true);
				
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
			//if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioComisionVentaCobro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioComisionVentaCobro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioComisionVentaCobro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionVentaCobro() ;
			
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
			this.facturaLogic=new FacturaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				comisionventacobroImplementable= (ComisionVentaCobroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionVentaCobroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				comisionventacobroImplementableHome= (ComisionVentaCobroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+ComisionVentaCobroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.comisionventacobros= new ArrayList<ComisionVentaCobro>();
			this.comisionventacobrosEliminados= new ArrayList<ComisionVentaCobro>();
						
			this.isEsNuevoComisionVentaCobro=false;
			this.esParaAccionDesdeFormularioComisionVentaCobro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idFacturaActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			this.periodosForeignKey=new ArrayList<Periodo>() ;
			this.vendedorsForeignKey=new ArrayList<Vendedor>() ;
			this.facturasForeignKey=new ArrayList<Factura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyComisionVentaCobro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroComisionVentaCobro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=ComisionVentaCobroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesComisionVentaCobro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingComisionVentaCobro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioComisionVentaCobro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioComisionVentaCobro();
			}
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasComisionVentaCobro.getTabCount(); i++) {
					this.jTabbedPaneBusquedasComisionVentaCobro.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasComisionVentaCobro.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessComisionVentaCobro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga ComisionVentaCobro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectComisionVentaCobro() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesComisionVentaCobro")) {
				iIndex=this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessComisionVentaCobro();	
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
	
	public void cargarCombosForeignKeyComisionVentaCobro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyComisionVentaCobro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyComisionVentaCobro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyComisionVentaCobroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyComisionVentaCobro();
		
		this.cargarCombosFrameForeignKeyComisionVentaCobro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyComisionVentaCobro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyComisionVentaCobro();
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

	public void cargarCombosForeignKeyFactura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyFacturaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyFactura();
				this.cargarCombosFrameFacturasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaFactura(this.facturasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoComisionVentaCobroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			
			if(jTableDatosComisionVentaCobro.getRowCount()>=1) {
				jTableDatosComisionVentaCobro.removeRowSelectionInterval(0, jTableDatosComisionVentaCobro.getRowCount()-1);						
			}
			
			this.isEsNuevoComisionVentaCobro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoComisionVentaCobro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesComisionVentaCobro(true);			
			//this.comisionventacobro=new ComisionVentaCobro();
			//this.comisionventacobro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionVentaCobro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionVentaCobro() ;
			
			if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionVentaCobro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.comisionventacobro);	
			this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);				
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar ComisionVentaCobro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarComisionVentaCobroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosComisionVentaCobro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosComisionVentaCobro.getSelectedRows().length;			
			}
			
			comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoComisionVentaCobro--;			
				//ComisionVentaCobro comisionventacobroAux= new ComisionVentaCobro();			
				//comisionventacobroAux.setId(this.iIdNuevoComisionVentaCobro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//ComisionVentaCobro comisionventacobroOrigen=new ComisionVentaCobro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(ComisionVentaCobro comisionventacobroOrigen : comisionventacobrosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							comisionventacobroOrigen =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							comisionventacobroOrigen =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaComisionVentaCobro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.comisionventacobro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosComisionVentaCobro(comisionventacobroOrigen,this.comisionventacobro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionventacobroLogic.getComisionVentaCobros().add(this.comisionventacobroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionventacobros.add(this.comisionventacobroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
				
				this.jTableDatosComisionVentaCobro.setRowSelectionInterval(this.getIndiceNuevoComisionVentaCobro(), this.getIndiceNuevoComisionVentaCobro());
				
				int iLastRow =  this.jTableDatosComisionVentaCobro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionVentaCobro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionVentaCobro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionVentaCobro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();									
		
			ComisionVentaCobro comisionventacobroOrigen=new ComisionVentaCobro();
			ComisionVentaCobro comisionventacobroDestino=new ComisionVentaCobro();
				
			comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosComisionVentaCobro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || comisionventacobrosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosComisionVentaCobro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobroOrigen =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionventacobroOrigen =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						comisionventacobroDestino =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						comisionventacobroDestino =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				comisionventacobroOrigen =comisionventacobrosSeleccionados.get(0);
				comisionventacobroDestino =comisionventacobrosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosComisionVentaCobro(comisionventacobroOrigen,comisionventacobroDestino,true,false);
				
				comisionventacobroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(comisionventacobroDestino,comisionventacobroLogic.getComisionVentaCobros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(comisionventacobroDestino,comisionventacobros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
				
				//this.jTableDatosComisionVentaCobro.setRowSelectionInterval(this.getIndiceNuevoComisionVentaCobro(), this.getIndiceNuevoComisionVentaCobro());
				
				int iLastRow =  this.jTableDatosComisionVentaCobro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosComisionVentaCobro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosComisionVentaCobro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionVentaCobro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormComisionVentaCobro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesComisionVentaCobro.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesComisionVentaCobro.setVisible(!isVisible);
			this.jPanelPaginacionComisionVentaCobro.setVisible(!isVisible);
			this.jPanelAccionesComisionVentaCobro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameComisionVentaCobro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoComisionVentaCobro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionComisionVentaCobro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByComisionVentaCobro();
			
			this.abrirFrameOrderByComisionVentaCobro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByComisionVentaCobro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleComisionVentaCobro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionVentaCobro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormComisionVentaCobro.isMaximum()) {
					this.jInternalFrameDetalleFormComisionVentaCobro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormComisionVentaCobro.setSize(this.jInternalFrameDetalleFormComisionVentaCobro.iWidthFormulario,this.jInternalFrameDetalleFormComisionVentaCobro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormComisionVentaCobro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormComisionVentaCobro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormComisionVentaCobro.isMaximum()) {
						this.jInternalFrameDetalleFormComisionVentaCobro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormComisionVentaCobro.jContentPaneDetalleComisionVentaCobro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormComisionVentaCobro.jContentPaneDetalleComisionVentaCobro.getWidth(),ComisionVentaCobroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormComisionVentaCobro.jContentPaneDetalleComisionVentaCobro.getWidth(),ComisionVentaCobroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormComisionVentaCobro.jContentPaneDetalleComisionVentaCobro.getWidth(),ComisionVentaCobroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormComisionVentaCobro.setVisible(true);
	        this.jInternalFrameDetalleFormComisionVentaCobro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByComisionVentaCobro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByComisionVentaCobro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByComisionVentaCobro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionVentaCobro,false,this);
				} else {
					this.jInternalFrameOrderByComisionVentaCobro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByComisionVentaCobro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByComisionVentaCobro);
				this.jInternalFrameOrderByComisionVentaCobro.setVisible(false);
				this.jInternalFrameOrderByComisionVentaCobro.setSelected(false);
				
				this.jInternalFrameOrderByComisionVentaCobro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionVentaCobro"));
				
				this.inicializarActualizarBindingTablaOrderByComisionVentaCobro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionComisionVentaCobro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionComisionVentaCobro==null) {
				
				this.jInternalFrameImportacionComisionVentaCobro=new ImportacionJInternalFrame(ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionComisionVentaCobro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionComisionVentaCobro);
				this.jInternalFrameImportacionComisionVentaCobro.setVisible(false);
				this.jInternalFrameImportacionComisionVentaCobro.setSelected(false);


				this.jInternalFrameImportacionComisionVentaCobro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionVentaCobro"));
				this.jInternalFrameImportacionComisionVentaCobro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionVentaCobro"));
				this.jInternalFrameImportacionComisionVentaCobro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionVentaCobro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoComisionVentaCobro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoComisionVentaCobro==null) {
				this.jInternalFrameReporteDinamicoComisionVentaCobro=new ReporteDinamicoJInternalFrame(ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoComisionVentaCobro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoComisionVentaCobro);
				this.jInternalFrameReporteDinamicoComisionVentaCobro.setVisible(false);
				this.jInternalFrameReporteDinamicoComisionVentaCobro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionVentaCobro"));
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionVentaCobro"));
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionVentaCobro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionVentaCobro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleComisionVentaCobro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormComisionVentaCobro);
			
	       	this.jInternalFrameDetalleFormComisionVentaCobro.setVisible(false);
	        this.jInternalFrameDetalleFormComisionVentaCobro.setSelected(false);
			
			//this.jInternalFrameDetalleFormComisionVentaCobro.dispose();
			//this.jInternalFrameDetalleFormComisionVentaCobro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoComisionVentaCobro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoComisionVentaCobro.setVisible(true);
	        this.jInternalFrameReporteDinamicoComisionVentaCobro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionComisionVentaCobro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionComisionVentaCobro.setVisible(true);
	        this.jInternalFrameImportacionComisionVentaCobro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByComisionVentaCobro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByComisionVentaCobro.setVisible(true);
	        this.jInternalFrameOrderByComisionVentaCobro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByComisionVentaCobro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByComisionVentaCobro.setVisible(false);
	        this.jInternalFrameOrderByComisionVentaCobro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoComisionVentaCobro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoComisionVentaCobro.setVisible(false);
	        this.jInternalFrameReporteDinamicoComisionVentaCobro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionComisionVentaCobro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionComisionVentaCobro.setVisible(false);
	        this.jInternalFrameImportacionComisionVentaCobro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
						TitledBorder titledBorderVendedor=(TitledBorder)vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

						titledBorderVendedor.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Vendedor");


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
	
	public void jButtonModificarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarComisionVentaCobro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarComisionVentaCobro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesComisionVentaCobro(true);
			//this.isEsNuevoComisionVentaCobro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesComisionVentaCobro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionVentaCobro(false) ;
			
			if(comisionventacobroSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionVentaCobro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionVentaCobro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaComisionVentaCobroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarComisionVentaCobro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesComisionVentaCobro(true);
			//this.isEsNuevoComisionVentaCobro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.comisionventacobro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesComisionVentaCobro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesComisionVentaCobro(false) ;
			
			if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleComisionVentaCobro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionVentaCobro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Factura")) {
				if(!this.comisionventacobroConstantesFunciones.cargarid_facturaComisionVentaCobro) {
					this.cargarCombosFacturasForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingComisionVentaCobro(false,false);
					this.cargarCombosFrameFacturasForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_factura (id);

				this.recargarComboTablaFactura(this.facturasForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEjercicio(List<Ejercicio> ejerciciosForeignKey)throws Exception{
		TableColumn tableColumnEjercicio=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO));
		TableCellEditor tableCellEditorEjercicio =tableColumnEjercicio.getCellEditor();

		EjercicioTableCell ejercicioTableCellFk=(EjercicioTableCell)tableCellEditorEjercicio;

		if(ejercicioTableCellFk!=null) {
			ejercicioTableCellFk.setejerciciosForeignKey(ejerciciosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionVentaCobro.getSelectedRow();

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
		TableColumn tableColumnPeriodo=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO));
		TableCellEditor tableCellEditorPeriodo =tableColumnPeriodo.getCellEditor();

		PeriodoTableCell periodoTableCellFk=(PeriodoTableCell)tableCellEditorPeriodo;

		if(periodoTableCellFk!=null) {
			periodoTableCellFk.setperiodosForeignKey(periodosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionVentaCobro.getSelectedRow();

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
		TableColumn tableColumnVendedor=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR));
		TableCellEditor tableCellEditorVendedor =tableColumnVendedor.getCellEditor();

		VendedorTableCell vendedorTableCellFk=(VendedorTableCell)tableCellEditorVendedor;

		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.setvendedorsForeignKey(vendedorsForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionVentaCobro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//vendedorTableCellFk.setRowActual(intSelectedRow);
			//vendedorTableCellFk.setvendedorsForeignKeyActual(vendedorsForeignKey);
		//}


		if(vendedorTableCellFk!=null) {
			vendedorTableCellFk.RecargarVendedorsForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaFactura(List<Factura> facturasForeignKey)throws Exception{
		TableColumn tableColumnFactura=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA));
		TableCellEditor tableCellEditorFactura =tableColumnFactura.getCellEditor();

		FacturaTableCell facturaTableCellFk=(FacturaTableCell)tableCellEditorFactura;

		if(facturaTableCellFk!=null) {
			facturaTableCellFk.setfacturasForeignKey(facturasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosComisionVentaCobro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//facturaTableCellFk.setRowActual(intSelectedRow);
			//facturaTableCellFk.setfacturasForeignKeyActual(facturasForeignKey);
		//}


		if(facturaTableCellFk!=null) {
			facturaTableCellFk.RecargarFacturasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_factura (Long id) throws Exception {
		this.setActualFacturaForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesComisionVentaCobro(false);
			
			//if(!this.isEsNuevoComisionVentaCobro) {								
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				
			}
			
			if(this.permiteMantenimiento(this.comisionventacobro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoComisionVentaCobro=true;
					this.inicializarActualizarBindingTablaComisionVentaCobro(false);
					this.isEsNuevoComisionVentaCobro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoComisionVentaCobro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoComisionVentaCobro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionVentaCobro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionVentaCobro(false);
				
				this.habilitarDeshabilitarControlesComisionVentaCobro(false);
			
												
				
				if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleComisionVentaCobro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoComisionVentaCobroActionPerformed(evt,comisionventacobroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualComisionVentaCobro(this.comisionventacobro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosComisionVentaCobro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,comisionventacobroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.comisionventacobro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				this.comisionventacobro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				this.comisionventacobro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.comisionventacobro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((ComisionVentaCobroModel) this.jTableDatosComisionVentaCobro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoComisionVentaCobro=true;
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
				this.isEsNuevoComisionVentaCobro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesComisionVentaCobro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionVentaCobro(false);
				
				this.habilitarDeshabilitarControlesComisionVentaCobro(false);
				
				
				
				if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleComisionVentaCobro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosComisionVentaCobro.getRowCount()>=1) {
				jTableDatosComisionVentaCobro.removeRowSelectionInterval(0, jTableDatosComisionVentaCobro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesComisionVentaCobro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesComisionVentaCobro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualComisionVentaCobro(false) ;
			
			this.isEsNuevoComisionVentaCobro=false;
			
			if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleComisionVentaCobro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingComisionVentaCobro(false);
				
				//SI ES MANUAL
				if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualComisionVentaCobro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoComisionVentaCobro--;			
			//ComisionVentaCobro comisionventacobroAux= new ComisionVentaCobro();			
			//comisionventacobroAux.setId(this.iIdNuevoComisionVentaCobro);
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaComisionVentaCobro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
			
			this.comisionventacobro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.comisionventacobroLogic.getComisionVentaCobros().add(this.comisionventacobroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.comisionventacobros.add(this.comisionventacobroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			
			this.jTableDatosComisionVentaCobro.setRowSelectionInterval(this.getIndiceNuevoComisionVentaCobro(), this.getIndiceNuevoComisionVentaCobro());
			
			int iLastRow =  this.jTableDatosComisionVentaCobro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosComisionVentaCobro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosComisionVentaCobro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingComisionVentaCobro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionVentaCobro(false);
			
			//SI ES MANUAL
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionVentaCobro();
			}
			
			//this.abrirFrameTreeComisionVentaCobro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Comision Venta CobroES ?", "MANTENIMIENTO DE Comision Venta Cobro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionComisionVentaCobro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralComisionVentaCobro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.comisionventacobroReturnGeneral=comisionventacobroLogic.procesarImportacionComisionVentaCobrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.comisionventacobroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarComisionVentaCobroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionComisionVentaCobro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionComisionVentaCobro.setFileImportacion(this.jInternalFrameImportacionComisionVentaCobro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionComisionVentaCobro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionComisionVentaCobro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionComisionVentaCobro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionComisionVentaCobro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		

		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("ComisionVentaCobroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"ComisionVentaCobroBaseDesign.jrxml";
			
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
			
			this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Periodo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Periodo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Periodo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Periodo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Vendedor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Vendedor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Vendedor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Vendedor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Factura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Factura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Factura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Factura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbreCliente_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbreCliente_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbreCliente_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbreCliente_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroComprobante_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroComprobante_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroComprobante_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroComprobante_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_ESTADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_tado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_tado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_tado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_tado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talFactura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talFactura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talFactura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talFactura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talAbono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talAbono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talAbono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talAbono_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcentajeComision_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcentajeComision_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcentajeComision_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcentajeComision_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_talComisionCobro_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_talComisionCobro_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_talComisionCobro_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_talComisionCobro_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroDias_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroDias_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroDias_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroDias_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoria="id_periodo";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoria="id_vendedor";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoria="id_factura";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoria="numero_factura";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoria="fecha_pago";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoria="nombre_cliente";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoria="numero_comprobante";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoria="estado";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA:
					sNombreCampoCategoria="total_factura";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO:
					sNombreCampoCategoria="total_abono";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION:
					sNombreCampoCategoria="porcentaje_comision";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO:
					sNombreCampoCategoria="total_comision_cobro";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoria="numero_dias";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO:
					sNombreCampoCategoriaValor="id_periodo";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR:
					sNombreCampoCategoriaValor="id_vendedor";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA:
					sNombreCampoCategoriaValor="id_factura";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA:
					sNombreCampoCategoriaValor="numero_factura";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoriaValor="fecha_pago";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE:
					sNombreCampoCategoriaValor="nombre_cliente";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					sNombreCampoCategoriaValor="numero_comprobante";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_ESTADO:
					sNombreCampoCategoriaValor="estado";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA:
					sNombreCampoCategoriaValor="total_factura";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO:
					sNombreCampoCategoriaValor="total_abono";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION:
					sNombreCampoCategoriaValor="porcentaje_comision";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO:
					sNombreCampoCategoriaValor="total_comision_cobro";
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS:
					sNombreCampoCategoriaValor="numero_dias";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Periodo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_periodo");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Vendedor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_vendedor");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_factura");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nro Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_factura");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pago");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre Cliente",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre_cliente");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nro Comprobante",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_comprobante");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_ESTADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"estado");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Factura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_factura");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Abono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_abono");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"% Comision",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcentaje_comision");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Total Comision Cobro",sNombreCampoCategoria,sNombreCampoCategoriaValor,"total_comision_cobro");
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nro Dias",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_dias");
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
	
	public void jButtonGenerarExcelReporteDinamicoComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("ComisionVentaCobros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getperiodo_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getvendedor_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getfactura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getnumero_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getfecha_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getnombre_cliente());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getnumero_comprobante());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_ESTADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getestado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.gettotal_factura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.gettotal_abono());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getporcentaje_comision());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.gettotal_comision_cobro());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS);
					iRow++;

					for(ComisionVentaCobro comisionventacobro:comisionventacobrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(comisionventacobro.getnumero_dias());
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
			//	this.getFilaCabeceraExportarExcelComisionVentaCobro(row);				
			//	iRow++;
			//}				
			
			//for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelComisionVentaCobro(comisionventacobroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
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
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionVentaCobro(false);
			
			//SI ES MANUAL
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualComisionVentaCobro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionVentaCobro(false);
			
			//SI ES MANUAL
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionVentaCobro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingComisionVentaCobro(false);
			
			//SI ES MANUAL
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualComisionVentaCobro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaComisionVentaCobro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosComisionVentaCobro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosComisionVentaCobro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosComisionVentaCobro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosComisionVentaCobro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosComisionVentaCobro.setMinimumSize(dimensionMinimum);
		this.jTableDatosComisionVentaCobro.setMaximumSize(dimensionMaximum);
		this.jTableDatosComisionVentaCobro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingComisionVentaCobro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingComisionVentaCobro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingComisionVentaCobro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaComisionVentaCobro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesComisionVentaCobro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasComisionVentaCobro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionVentaCobro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesComisionVentaCobro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualComisionVentaCobro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaComisionVentaCobro();
		
		this.inicializarActualizarBindingBotonesManualComisionVentaCobro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualComisionVentaCobro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesComisionVentaCobro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualComisionVentaCobro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualComisionVentaCobro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosComisionVentaCobro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosComisionVentaCobro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteComisionVentaCobro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormComisionVentaCobro.jCheckBoxPostAccionNuevoComisionVentaCobro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormComisionVentaCobro.jCheckBoxPostAccionSinCerrarComisionVentaCobro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormComisionVentaCobro.jCheckBoxPostAccionSinMensajeComisionVentaCobro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosComisionVentaCobro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosComisionVentaCobro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteComisionVentaCobro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jCheckBoxPostAccionNuevoComisionVentaCobro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormComisionVentaCobro.jCheckBoxPostAccionSinCerrarComisionVentaCobro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormComisionVentaCobro.jCheckBoxPostAccionSinMensajeComisionVentaCobro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionComisionVentaCobro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionComisionVentaCobro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesComisionVentaCobro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesComisionVentaCobro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesComisionVentaCobro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarComisionVentaCobro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesComisionVentaCobro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesComisionVentaCobro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralComisionVentaCobro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesComisionVentaCobro(Boolean esInicializar) throws Exception {
		try	{	
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualComisionVentaCobro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesComisionVentaCobro() throws Exception {
		try	{
			if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionVentaCobro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionVentaCobro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualComisionVentaCobro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesComisionVentaCobro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesComisionVentaCobro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesComisionVentaCobro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionComisionVentaCobro.addItem(reporte);
			}
			
			
			if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionComisionVentaCobro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionComisionVentaCobro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesComisionVentaCobro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesComisionVentaCobro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarComisionVentaCobro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarComisionVentaCobro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarComisionVentaCobro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionVentaCobro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualComisionVentaCobro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
				
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=ComisionVentaCobroConstantesFunciones.getTiposSeleccionarComisionVentaCobro(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=ComisionVentaCobroConstantesFunciones.getTiposSeleccionarComisionVentaCobro(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=ComisionVentaCobroConstantesFunciones.getTiposSeleccionarComisionVentaCobro(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoComisionVentaCobro.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualComisionVentaCobro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasComisionVentaCobro(Boolean esInicializar) throws Exception {				
		if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualComisionVentaCobro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaComisionVentaCobro() throws Exception {
		this.inicializarActualizarBindingTablaComisionVentaCobro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByComisionVentaCobro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosComisionVentaCobroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaComisionVentaCobro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=comisionventacobroLogic.getComisionVentaCobros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=comisionventacobros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosComisionVentaCobro.setModel(new ComisionVentaCobroModel(this.comisionventacobroLogic.getComisionVentaCobros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosComisionVentaCobro.setModel(new ComisionVentaCobroModel(this.comisionventacobros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByComisionVentaCobro!=null && this.jInternalFrameOrderByComisionVentaCobro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByComisionVentaCobro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO,comisionventacobroConstantesFunciones.resaltarSeleccionarComisionVentaCobro,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+ComisionVentaCobroConstantesFunciones.SCLASSWEBTITULO,comisionventacobroConstantesFunciones.resaltarSeleccionarComisionVentaCobro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_ID));

		if(this.comisionventacobroConstantesFunciones.mostraridComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionventacobroConstantesFunciones.resaltaridComisionVentaCobro,this.comisionventacobroConstantesFunciones.activaridComisionVentaCobro,iSizeTabla,this,true,"idComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltaridComisionVentaCobro,this.comisionventacobroConstantesFunciones.activaridComisionVentaCobro,this,true,"idComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA));

		if(this.comisionventacobroConstantesFunciones.mostrarid_empresaComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_empresaComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_empresaComisionVentaCobro,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_empresaComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_empresaComisionVentaCobro,false,"id_empresaComisionVentaCobro","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.comisionventacobroConstantesFunciones.mostrarid_ejercicioComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_ejercicioComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_ejercicioComisionVentaCobro,iSizeTabla));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_ejercicioComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_ejercicioComisionVentaCobro,true,"id_ejercicioComisionVentaCobro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO));

		if(this.comisionventacobroConstantesFunciones.mostrarid_periodoComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new PeriodoTableCell(this.periodosForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_periodoComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_periodoComisionVentaCobro,iSizeTabla));
			tableColumn.setCellEditor(new PeriodoTableCell(this.periodosForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_periodoComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_periodoComisionVentaCobro,true,"id_periodoComisionVentaCobro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR));

		if(this.comisionventacobroConstantesFunciones.mostrarid_vendedorComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new VendedorTableCell(this.vendedorsForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_vendedorComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_vendedorComisionVentaCobro,iSizeTabla));
			tableColumn.setCellEditor(new VendedorTableCell(this.vendedorsForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_vendedorComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_vendedorComisionVentaCobro,true,"id_vendedorComisionVentaCobro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA));

		if(this.comisionventacobroConstantesFunciones.mostrarid_facturaComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new FacturaTableCell(this.facturasForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_facturaComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_facturaComisionVentaCobro,iSizeTabla));
			tableColumn.setCellEditor(new FacturaTableCell(this.facturasForeignKey,this.comisionventacobroConstantesFunciones.resaltarid_facturaComisionVentaCobro,this,this.comisionventacobroConstantesFunciones.activarid_facturaComisionVentaCobro,true,"id_facturaComisionVentaCobro","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA));

		if(this.comisionventacobroConstantesFunciones.mostrarnumero_facturaComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionventacobroConstantesFunciones.resaltarnumero_facturaComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnumero_facturaComisionVentaCobro,iSizeTabla,this,true,"numero_facturaComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarnumero_facturaComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnumero_facturaComisionVentaCobro,this,true,"numero_facturaComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO));

		if(this.comisionventacobroConstantesFunciones.mostrarfecha_pagoComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.comisionventacobroConstantesFunciones.resaltarfecha_pagoComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarfecha_pagoComisionVentaCobro,iSizeTabla,this,true,"fecha_pagoComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarfecha_pagoComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarfecha_pagoComisionVentaCobro,this,true,"fecha_pagoComisionVentaCobro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE));

		if(this.comisionventacobroConstantesFunciones.mostrarnombre_clienteComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionventacobroConstantesFunciones.resaltarnombre_clienteComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnombre_clienteComisionVentaCobro,iSizeTabla,this,true,"nombre_clienteComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarnombre_clienteComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnombre_clienteComisionVentaCobro,this,true,"nombre_clienteComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE));

		if(this.comisionventacobroConstantesFunciones.mostrarnumero_comprobanteComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionventacobroConstantesFunciones.resaltarnumero_comprobanteComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnumero_comprobanteComisionVentaCobro,iSizeTabla,this,true,"numero_comprobanteComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarnumero_comprobanteComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnumero_comprobanteComisionVentaCobro,this,true,"numero_comprobanteComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_ESTADO));

		if(this.comisionventacobroConstantesFunciones.mostrarestadoComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_ESTADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.comisionventacobroConstantesFunciones.resaltarestadoComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarestadoComisionVentaCobro,iSizeTabla,this,true,"estadoComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarestadoComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarestadoComisionVentaCobro,this,true,"estadoComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA));

		if(this.comisionventacobroConstantesFunciones.mostrartotal_facturaComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionventacobroConstantesFunciones.resaltartotal_facturaComisionVentaCobro,this.comisionventacobroConstantesFunciones.activartotal_facturaComisionVentaCobro,iSizeTabla,this,true,"total_facturaComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltartotal_facturaComisionVentaCobro,this.comisionventacobroConstantesFunciones.activartotal_facturaComisionVentaCobro,this,true,"total_facturaComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO));

		if(this.comisionventacobroConstantesFunciones.mostrartotal_abonoComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionventacobroConstantesFunciones.resaltartotal_abonoComisionVentaCobro,this.comisionventacobroConstantesFunciones.activartotal_abonoComisionVentaCobro,iSizeTabla,this,true,"total_abonoComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltartotal_abonoComisionVentaCobro,this.comisionventacobroConstantesFunciones.activartotal_abonoComisionVentaCobro,this,true,"total_abonoComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION));

		if(this.comisionventacobroConstantesFunciones.mostrarporcentaje_comisionComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionventacobroConstantesFunciones.resaltarporcentaje_comisionComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarporcentaje_comisionComisionVentaCobro,iSizeTabla,this,true,"porcentaje_comisionComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarporcentaje_comisionComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarporcentaje_comisionComisionVentaCobro,this,true,"porcentaje_comisionComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO));

		if(this.comisionventacobroConstantesFunciones.mostrartotal_comision_cobroComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionventacobroConstantesFunciones.resaltartotal_comision_cobroComisionVentaCobro,this.comisionventacobroConstantesFunciones.activartotal_comision_cobroComisionVentaCobro,iSizeTabla,this,true,"total_comision_cobroComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltartotal_comision_cobroComisionVentaCobro,this.comisionventacobroConstantesFunciones.activartotal_comision_cobroComisionVentaCobro,this,true,"total_comision_cobroComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS));

		if(this.comisionventacobroConstantesFunciones.mostrarnumero_diasComisionVentaCobro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.comisionventacobroConstantesFunciones.resaltarnumero_diasComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnumero_diasComisionVentaCobro,iSizeTabla,this,true,"numero_diasComisionVentaCobro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.comisionventacobroConstantesFunciones.resaltarnumero_diasComisionVentaCobro,this.comisionventacobroConstantesFunciones.activarnumero_diasComisionVentaCobro,this,true,"numero_diasComisionVentaCobro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new ComisionVentaCobroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionVentaCobro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosComisionVentaCobro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.comisionventacobroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosComisionVentaCobro.addColumn(tableColumn);
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
			
			this.jTableDatosComisionVentaCobro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosComisionVentaCobro.moveColumn(this.jTableDatosComisionVentaCobro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosComisionVentaCobro.moveColumn(this.jTableDatosComisionVentaCobro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosComisionVentaCobro.moveColumn(this.jTableDatosComisionVentaCobro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosComisionVentaCobro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosComisionVentaCobro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosComisionVentaCobro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosComisionVentaCobro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosComisionVentaCobro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosComisionVentaCobro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosComisionVentaCobro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=comisionventacobroLogic.getComisionVentaCobros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=comisionventacobros.size()-1;
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
		//this.jTableDatosComisionVentaCobro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosComisionVentaCobro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosComisionVentaCobro();
			
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
				
				//this.isEsNuevoComisionVentaCobro=false;
					
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
				if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormComisionVentaCobro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionVentaCobro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionVentaCobro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.comisionventacobro.getsType().equals("DUPLICADO")
				   || this.comisionventacobro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoComisionVentaCobro=true;
				
				} else {
					this.isEsNuevoComisionVentaCobro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
					if(this.comisionventacobro.getId()>=0 && !this.comisionventacobro.getIsNew()) {						
						this.isEsNuevoComisionVentaCobro=false;
						
					} else {
						this.isEsNuevoComisionVentaCobro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoComisionVentaCobro(esRelaciones);						
				
				this.seleccionarComisionVentaCobro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.comisionventacobro.getId()<0) {
					this.isEsNuevoComisionVentaCobro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarComisionVentaCobro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarComisionVentaCobro(evt,rowIndex);
				}	
				
				if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion ComisionVentaCobro: " + this.dDif); 
					}
				}								
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarComisionVentaCobro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.comisionventacobro)) {
					if(this.comisionventacobro.getId()>0) {
						this.comisionventacobro.setIsDeleted(true);
						
						this.comisionventacobrosEliminados.add(this.comisionventacobro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.comisionventacobroLogic.getComisionVentaCobros().remove(this.comisionventacobro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.comisionventacobros.remove(this.comisionventacobro);				
					}
					
					
					((ComisionVentaCobroModel) this.jTableDatosComisionVentaCobro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaComisionVentaCobro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarComisionVentaCobro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoComisionVentaCobro) {
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosComisionVentaCobro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosComisionVentaCobro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobro);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.comisionventacobroConstantesFunciones.cargarid_empresaComisionVentaCobro || this.comisionventacobroConstantesFunciones.event_dependid_empresaComisionVentaCobro) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.comisionventacobro.getid_empresa());
									//this.inicializarActualizarBindingComisionVentaCobro(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(comisionventacobro.getEmpresa()!=null) {
							this.empresasForeignKey.add(comisionventacobro.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.comisionventacobro.getid_empresa(),false,"Formulario");

					//Ejercicio
					if(!this.comisionventacobroConstantesFunciones.cargarid_ejercicioComisionVentaCobro || this.comisionventacobroConstantesFunciones.event_dependid_ejercicioComisionVentaCobro) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.comisionventacobro.getid_ejercicio());
									//this.inicializarActualizarBindingComisionVentaCobro(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(comisionventacobro.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(comisionventacobro.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.comisionventacobro.getid_ejercicio(),false,"Formulario");

					//Periodo
					if(!this.comisionventacobroConstantesFunciones.cargarid_periodoComisionVentaCobro || this.comisionventacobroConstantesFunciones.event_dependid_periodoComisionVentaCobro) {
						//this.cargarCombosPeriodosForeignKeyLista(" where id="+this.comisionventacobro.getid_periodo());
									//this.inicializarActualizarBindingComisionVentaCobro(false,false);
						this.periodosForeignKey=new ArrayList<Periodo>();

						if(comisionventacobro.getPeriodo()!=null) {
							this.periodosForeignKey.add(comisionventacobro.getPeriodo());
						}

						this.addItemDefectoCombosForeignKeyPeriodo();
						this.cargarCombosFramePeriodosForeignKey("Todos");
					}
					this.setActualPeriodoForeignKey(this.comisionventacobro.getid_periodo(),false,"Formulario");

					//Vendedor
					if(!this.comisionventacobroConstantesFunciones.cargarid_vendedorComisionVentaCobro || this.comisionventacobroConstantesFunciones.event_dependid_vendedorComisionVentaCobro) {
						//this.cargarCombosVendedorsForeignKeyLista(" where id="+this.comisionventacobro.getid_vendedor());
									//this.inicializarActualizarBindingComisionVentaCobro(false,false);
						this.vendedorsForeignKey=new ArrayList<Vendedor>();

						if(comisionventacobro.getVendedor()!=null) {
							this.vendedorsForeignKey.add(comisionventacobro.getVendedor());
						}

						this.addItemDefectoCombosForeignKeyVendedor();
						this.cargarCombosFrameVendedorsForeignKey("Todos");
					}
					this.setActualVendedorForeignKey(this.comisionventacobro.getid_vendedor(),false,"Formulario");

					//Factura
					if(!this.comisionventacobroConstantesFunciones.cargarid_facturaComisionVentaCobro || this.comisionventacobroConstantesFunciones.event_dependid_facturaComisionVentaCobro) {
						//this.cargarCombosFacturasForeignKeyLista(" where id="+this.comisionventacobro.getid_factura());
									//this.inicializarActualizarBindingComisionVentaCobro(false,false);
						this.facturasForeignKey=new ArrayList<Factura>();

						if(comisionventacobro.getFactura()!=null) {
							this.facturasForeignKey.add(comisionventacobro.getFactura());
						}

						this.addItemDefectoCombosForeignKeyFactura();
						this.cargarCombosFrameFacturasForeignKey("Todos");
					}
					this.setActualFacturaForeignKey(this.comisionventacobro.getid_factura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesComisionVentaCobro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesComisionVentaCobro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualComisionVentaCobro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionVentaCobro(ComisionVentaCobro comisionventacobro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoComisionVentaCobro(comisionventacobro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoComisionVentaCobro(ComisionVentaCobro comisionventacobro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioComisionVentaCobro(comisionventacobro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyComisionVentaCobro(comisionventacobro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyComisionVentaCobro(comisionventacobro);
	}
	
	public void setVariablesObjetoActualToFormularioComisionVentaCobro(ComisionVentaCobro comisionventacobro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setText(comisionventacobro.getId().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setText(comisionventacobro.getnumero_factura());
			this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setDate(comisionventacobro.getfecha_pago());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setText(comisionventacobro.getnombre_cliente());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setText(comisionventacobro.getnumero_comprobante());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setText(comisionventacobro.getestado());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setText(comisionventacobro.gettotal_factura().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setText(comisionventacobro.gettotal_abono().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setText(comisionventacobro.getporcentaje_comision().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setText(comisionventacobro.gettotal_comision_cobro().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setText(comisionventacobro.getnumero_dias().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,ComisionVentaCobro comisionventacobroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,comisionventacobroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,ComisionVentaCobro comisionventacobroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				comisionventacobroLocal=this.comisionventacobro;
			} else {
				comisionventacobroLocal=this.comisionventacobroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(comisionventacobroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoComisionVentaCobro(comisionventacobroLocal,true);
					
					if(comisionventacobroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(comisionventacobroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(comisionventacobroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoComisionVentaCobro(ComisionVentaCobro comisionventacobro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionVentaCobro(comisionventacobro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(comisionventacobro);
	}
	
	public void setVariablesFormularioToObjetoActualComisionVentaCobro(ComisionVentaCobro comisionventacobro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualComisionVentaCobro(comisionventacobro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualComisionVentaCobro(ComisionVentaCobro comisionventacobro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.getText()==null || this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.getText()=="" || this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.getText()=="Id") {
				this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setText("0");
			}

			if(conColumnasBase) {comisionventacobro.setId(Long.parseLong(this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelIdComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setnumero_factura(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_facturaComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setfecha_pago(this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelfecha_pagoComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setnombre_cliente(this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnombre_clienteComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setnumero_comprobante(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_comprobanteComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setestado(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_ESTADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelestadoComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.settotal_factura(Double.parseDouble(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_facturaComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.settotal_abono(Double.parseDouble(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_abonoComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setporcentaje_comision(Double.parseDouble(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelporcentaje_comisionComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.settotal_comision_cobro(Double.parseDouble(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabeltotal_comision_cobroComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			comisionventacobro.setnumero_dias(Integer.parseInt(this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormComisionVentaCobro.jLabelnumero_diasComisionVentaCobro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualComisionVentaCobro(ComisionVentaCobro comisionventacobroBean,ComisionVentaCobro comisionventacobro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && comisionventacobroBean.getid_ejercicio()!=null && !comisionventacobroBean.getid_ejercicio().equals(-1L))) {comisionventacobro.setid_ejercicio(comisionventacobroBean.getid_ejercicio());}
			if(conDefault || (!conDefault && comisionventacobroBean.getid_periodo()!=null && !comisionventacobroBean.getid_periodo().equals(-1L))) {comisionventacobro.setid_periodo(comisionventacobroBean.getid_periodo());}
			if(conDefault || (!conDefault && comisionventacobroBean.getid_vendedor()!=null && !comisionventacobroBean.getid_vendedor().equals(-1L))) {comisionventacobro.setid_vendedor(comisionventacobroBean.getid_vendedor());}
			if(conDefault || (!conDefault && comisionventacobroBean.getid_factura()!=null && !comisionventacobroBean.getid_factura().equals(-1L))) {comisionventacobro.setid_factura(comisionventacobroBean.getid_factura());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosComisionVentaCobro(ComisionVentaCobro comisionventacobroOrigen,ComisionVentaCobro comisionventacobro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionventacobroOrigen.getId()!=null && !comisionventacobroOrigen.getId().equals(0L))) {comisionventacobro.setId(comisionventacobroOrigen.getId());}}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getid_ejercicio()!=null && !comisionventacobroOrigen.getid_ejercicio().equals(-1L))) {comisionventacobro.setid_ejercicio(comisionventacobroOrigen.getid_ejercicio());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getid_periodo()!=null && !comisionventacobroOrigen.getid_periodo().equals(-1L))) {comisionventacobro.setid_periodo(comisionventacobroOrigen.getid_periodo());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getid_vendedor()!=null && !comisionventacobroOrigen.getid_vendedor().equals(-1L))) {comisionventacobro.setid_vendedor(comisionventacobroOrigen.getid_vendedor());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getid_factura()!=null && !comisionventacobroOrigen.getid_factura().equals(-1L))) {comisionventacobro.setid_factura(comisionventacobroOrigen.getid_factura());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getnumero_factura()!=null && !comisionventacobroOrigen.getnumero_factura().equals(""))) {comisionventacobro.setnumero_factura(comisionventacobroOrigen.getnumero_factura());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getfecha_pago()!=null && !comisionventacobroOrigen.getfecha_pago().equals(new Date()))) {comisionventacobro.setfecha_pago(comisionventacobroOrigen.getfecha_pago());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getnombre_cliente()!=null && !comisionventacobroOrigen.getnombre_cliente().equals(""))) {comisionventacobro.setnombre_cliente(comisionventacobroOrigen.getnombre_cliente());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getnumero_comprobante()!=null && !comisionventacobroOrigen.getnumero_comprobante().equals(""))) {comisionventacobro.setnumero_comprobante(comisionventacobroOrigen.getnumero_comprobante());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getestado()!=null && !comisionventacobroOrigen.getestado().equals(""))) {comisionventacobro.setestado(comisionventacobroOrigen.getestado());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.gettotal_factura()!=null && !comisionventacobroOrigen.gettotal_factura().equals(0.0))) {comisionventacobro.settotal_factura(comisionventacobroOrigen.gettotal_factura());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.gettotal_abono()!=null && !comisionventacobroOrigen.gettotal_abono().equals(0.0))) {comisionventacobro.settotal_abono(comisionventacobroOrigen.gettotal_abono());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getporcentaje_comision()!=null && !comisionventacobroOrigen.getporcentaje_comision().equals(0.0))) {comisionventacobro.setporcentaje_comision(comisionventacobroOrigen.getporcentaje_comision());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.gettotal_comision_cobro()!=null && !comisionventacobroOrigen.gettotal_comision_cobro().equals(0.0))) {comisionventacobro.settotal_comision_cobro(comisionventacobroOrigen.gettotal_comision_cobro());}
			if(conDefault || (!conDefault && comisionventacobroOrigen.getnumero_dias()!=null && !comisionventacobroOrigen.getnumero_dias().equals(0))) {comisionventacobro.setnumero_dias(comisionventacobroOrigen.getnumero_dias());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionVentaCobro(ComisionVentaCobro comisionventacobro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setText(comisionventacobro.getId().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setText(comisionventacobro.getnumero_factura());
			this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setDate(comisionventacobro.getfecha_pago());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setText(comisionventacobro.getnombre_cliente());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setText(comisionventacobro.getnumero_comprobante());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setText(comisionventacobro.getestado());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setText(comisionventacobro.gettotal_factura().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setText(comisionventacobro.gettotal_abono().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setText(comisionventacobro.getporcentaje_comision().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setText(comisionventacobro.gettotal_comision_cobro().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setText(comisionventacobro.getnumero_dias().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioComisionVentaCobro(ComisionVentaCobroBean comisionventacobroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setText(comisionventacobroBean.getId().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setText(comisionventacobroBean.getnumero_factura());
			this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setDate(comisionventacobroBean.getfecha_pago());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setText(comisionventacobroBean.getnombre_cliente());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setText(comisionventacobroBean.getnumero_comprobante());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setText(comisionventacobroBean.getestado());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setText(comisionventacobroBean.gettotal_factura().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setText(comisionventacobroBean.gettotal_abono().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setText(comisionventacobroBean.getporcentaje_comision().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setText(comisionventacobroBean.gettotal_comision_cobro().toString());
			this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setText(comisionventacobroBean.getnumero_dias().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanComisionVentaCobro(ComisionVentaCobroParameterReturnGeneral comisionventacobroReturnGeneral,ComisionVentaCobroBean comisionventacobroBean,Boolean conDefault) throws Exception { 
		try {
			ComisionVentaCobro comisionventacobroLocal=new ComisionVentaCobro();
			
			comisionventacobroLocal=comisionventacobroReturnGeneral.getComisionVentaCobro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && comisionventacobroLocal.getId()!=null && !comisionventacobroLocal.getId().equals(0L))) {comisionventacobroBean.setId(comisionventacobroLocal.getId());}}
			if(conDefault || (!conDefault && comisionventacobroLocal.getid_ejercicio()!=null && !comisionventacobroLocal.getid_ejercicio().equals(-1L))) {comisionventacobroBean.setid_ejercicio(comisionventacobroLocal.getid_ejercicio());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getid_periodo()!=null && !comisionventacobroLocal.getid_periodo().equals(-1L))) {comisionventacobroBean.setid_periodo(comisionventacobroLocal.getid_periodo());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getid_vendedor()!=null && !comisionventacobroLocal.getid_vendedor().equals(-1L))) {comisionventacobroBean.setid_vendedor(comisionventacobroLocal.getid_vendedor());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getid_factura()!=null && !comisionventacobroLocal.getid_factura().equals(-1L))) {comisionventacobroBean.setid_factura(comisionventacobroLocal.getid_factura());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getnumero_factura()!=null && !comisionventacobroLocal.getnumero_factura().equals(""))) {comisionventacobroBean.setnumero_factura(comisionventacobroLocal.getnumero_factura());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getfecha_pago()!=null && !comisionventacobroLocal.getfecha_pago().equals(new Date()))) {comisionventacobroBean.setfecha_pago(comisionventacobroLocal.getfecha_pago());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getnombre_cliente()!=null && !comisionventacobroLocal.getnombre_cliente().equals(""))) {comisionventacobroBean.setnombre_cliente(comisionventacobroLocal.getnombre_cliente());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getnumero_comprobante()!=null && !comisionventacobroLocal.getnumero_comprobante().equals(""))) {comisionventacobroBean.setnumero_comprobante(comisionventacobroLocal.getnumero_comprobante());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getestado()!=null && !comisionventacobroLocal.getestado().equals(""))) {comisionventacobroBean.setestado(comisionventacobroLocal.getestado());}
			if(conDefault || (!conDefault && comisionventacobroLocal.gettotal_factura()!=null && !comisionventacobroLocal.gettotal_factura().equals(0.0))) {comisionventacobroBean.settotal_factura(comisionventacobroLocal.gettotal_factura());}
			if(conDefault || (!conDefault && comisionventacobroLocal.gettotal_abono()!=null && !comisionventacobroLocal.gettotal_abono().equals(0.0))) {comisionventacobroBean.settotal_abono(comisionventacobroLocal.gettotal_abono());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getporcentaje_comision()!=null && !comisionventacobroLocal.getporcentaje_comision().equals(0.0))) {comisionventacobroBean.setporcentaje_comision(comisionventacobroLocal.getporcentaje_comision());}
			if(conDefault || (!conDefault && comisionventacobroLocal.gettotal_comision_cobro()!=null && !comisionventacobroLocal.gettotal_comision_cobro().equals(0.0))) {comisionventacobroBean.settotal_comision_cobro(comisionventacobroLocal.gettotal_comision_cobro());}
			if(conDefault || (!conDefault && comisionventacobroLocal.getnumero_dias()!=null && !comisionventacobroLocal.getnumero_dias().equals(0))) {comisionventacobroBean.setnumero_dias(comisionventacobroLocal.getnumero_dias());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxComisionVentaCobroGenerico(Long idComisionVentaCobroSeleccionado,JComboBox jComboBoxComisionVentaCobro,List<ComisionVentaCobro> comisionventacobrosLocal)throws Exception {
		try {
			ComisionVentaCobro  comisionventacobroTemp=null;

			for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosLocal) {
				if(comisionventacobroAux.getId()!=null && comisionventacobroAux.getId().equals(idComisionVentaCobroSeleccionado)) {
					comisionventacobroTemp=comisionventacobroAux;
					break;
				}
			}

			jComboBoxComisionVentaCobro.setSelectedItem(comisionventacobroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxComisionVentaCobroGenerico(JComboBox jComboBoxComisionVentaCobro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionVentaCobro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxComisionVentaCobro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxComisionVentaCobro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxComisionVentaCobro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxComisionVentaCobro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxComisionVentaCobro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionventacobro=(ComisionVentaCobro) comisionventacobroLogic.getComisionVentaCobros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionventacobro =(ComisionVentaCobro) comisionventacobros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!comisionventacobro.getIsNew() && !comisionventacobro.getIsChanged() && !comisionventacobro.getIsDeleted()) {
				sDescripcion=comisionventacobro.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionventacobro.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!comisionventacobro.getIsNew() && !comisionventacobro.getIsChanged() && !comisionventacobro.getIsDeleted()) {
				sDescripcion=comisionventacobro.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=comisionventacobro.getejercicio_descripcion();
			}
		}

		if(sTipo.equals("Periodo")) {
			//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
			if(!comisionventacobro.getIsNew() && !comisionventacobro.getIsChanged() && !comisionventacobro.getIsDeleted()) {
				sDescripcion=comisionventacobro.getperiodo_descripcion();
			} else {
				//sDescripcion=this.getActualPeriodoForeignKeyDescripcion((Long)value);
				sDescripcion=comisionventacobro.getperiodo_descripcion();
			}
		}

		if(sTipo.equals("Vendedor")) {
			//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
			if(!comisionventacobro.getIsNew() && !comisionventacobro.getIsChanged() && !comisionventacobro.getIsDeleted()) {
				sDescripcion=comisionventacobro.getvendedor_descripcion();
			} else {
				//sDescripcion=this.getActualVendedorForeignKeyDescripcion((Long)value);
				sDescripcion=comisionventacobro.getvendedor_descripcion();
			}
		}

		if(sTipo.equals("Factura")) {
			//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
			if(!comisionventacobro.getIsNew() && !comisionventacobro.getIsChanged() && !comisionventacobro.getIsDeleted()) {
				sDescripcion=comisionventacobro.getfactura_descripcion();
			} else {
				//sDescripcion=this.getActualFacturaForeignKeyDescripcion((Long)value);
				sDescripcion=comisionventacobro.getfactura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		ComisionVentaCobro comisionventacobroRow=new ComisionVentaCobro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionventacobroRow=(ComisionVentaCobro) comisionventacobroLogic.getComisionVentaCobros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			comisionventacobroRow=(ComisionVentaCobro) comisionventacobros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualComisionVentaCobro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro));			
			this.jButtonDuplicarComisionVentaCobro.setVisible((this.isVisibilidadCeldaDuplicarComisionVentaCobro && this.isPermisoDuplicarComisionVentaCobro));			
			this.jButtonCopiarComisionVentaCobro.setVisible((this.isVisibilidadCeldaCopiarComisionVentaCobro && this.isPermisoCopiarComisionVentaCobro));
			this.jButtonVerFormComisionVentaCobro.setVisible((this.isVisibilidadCeldaVerFormComisionVentaCobro && this.isPermisoVerFormComisionVentaCobro));
			
			this.jButtonAbrirOrderByComisionVentaCobro.setVisible((this.isVisibilidadCeldaOrdenComisionVentaCobro && this.isPermisoOrdenComisionVentaCobro));			
			
			this.jButtonNuevoRelacionesComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro));			
			this.jButtonNuevoGuardarCambiosComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarComisionVentaCobro.setVisible((this.isVisibilidadCeldaModificarComisionVentaCobro && this.isPermisoActualizarComisionVentaCobro));	
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarComisionVentaCobro.setVisible((this.isVisibilidadCeldaActualizarComisionVentaCobro && this.isPermisoActualizarComisionVentaCobro));	
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarComisionVentaCobro.setVisible((this.isVisibilidadCeldaEliminarComisionVentaCobro && this.isPermisoEliminarComisionVentaCobro));
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarComisionVentaCobro.setVisible(this.isVisibilidadCeldaCancelarComisionVentaCobro);							
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));			
			
			}
						
			this.jButtonGuardarCambiosTablaComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro));						
			this.jButtonDuplicarToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaDuplicarComisionVentaCobro && this.isPermisoDuplicarComisionVentaCobro));						
			this.jButtonCopiarToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaCopiarComisionVentaCobro && this.isPermisoCopiarComisionVentaCobro));			
			this.jButtonVerFormToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaVerFormComisionVentaCobro && this.isPermisoVerFormComisionVentaCobro));			
			this.jButtonAbrirOrderByToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaOrdenComisionVentaCobro && this.isPermisoOrdenComisionVentaCobro));
			this.jButtonNuevoRelacionesToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro));			
			this.jButtonNuevoGuardarCambiosToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));			
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaModificarComisionVentaCobro && this.isPermisoActualizarComisionVentaCobro));	
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaActualizarComisionVentaCobro  && this.isPermisoActualizarComisionVentaCobro));	
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaEliminarComisionVentaCobro && this.isPermisoEliminarComisionVentaCobro));
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarToolBarComisionVentaCobro.setVisible(this.isVisibilidadCeldaCancelarComisionVentaCobro);				
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro));			
			this.jMenuItemDuplicarComisionVentaCobro.setVisible((this.isVisibilidadCeldaDuplicarComisionVentaCobro && this.isPermisoDuplicarComisionVentaCobro));			
			this.jMenuItemCopiarComisionVentaCobro.setVisible((this.isVisibilidadCeldaCopiarComisionVentaCobro && this.isPermisoCopiarComisionVentaCobro));			
			this.jMenuItemVerFormComisionVentaCobro.setVisible((this.isVisibilidadCeldaVerFormComisionVentaCobro && this.isPermisoVerFormComisionVentaCobro));			
			this.jMenuItemAbrirOrderByComisionVentaCobro.setVisible((this.isVisibilidadCeldaOrdenComisionVentaCobro && this.isPermisoOrdenComisionVentaCobro));			
			//this.jMenuItemMostrarOcultarComisionVentaCobro.setVisible((this.isVisibilidadCeldaOrdenComisionVentaCobro && this.isPermisoOrdenComisionVentaCobro));
			this.jMenuItemDetalleAbrirOrderByComisionVentaCobro.setVisible((this.isVisibilidadCeldaOrdenComisionVentaCobro && this.isPermisoOrdenComisionVentaCobro));			
			//this.jMenuItemDetalleMostrarOcultarComisionVentaCobro.setVisible((this.isVisibilidadCeldaOrdenComisionVentaCobro && this.isPermisoOrdenComisionVentaCobro));			
			this.jMenuItemNuevoRelacionesComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro));			
			this.jMenuItemNuevoGuardarCambiosComisionVentaCobro.setVisible((this.isVisibilidadCeldaNuevoComisionVentaCobro && this.isPermisoNuevoComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));									
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemModificarComisionVentaCobro.setVisible((this.isVisibilidadCeldaModificarComisionVentaCobro && this.isPermisoActualizarComisionVentaCobro));	
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemActualizarComisionVentaCobro.setVisible((this.isVisibilidadCeldaActualizarComisionVentaCobro && this.isPermisoActualizarComisionVentaCobro));	
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemEliminarComisionVentaCobro.setVisible((this.isVisibilidadCeldaEliminarComisionVentaCobro && this.isPermisoEliminarComisionVentaCobro));
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemCancelarComisionVentaCobro.setVisible(this.isVisibilidadCeldaCancelarComisionVentaCobro);				
			}
			
			this.jMenuItemGuardarCambiosComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));						
			this.jMenuItemGuardarCambiosTablaComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=this.jButtonNuevoComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaDuplicarComisionVentaCobro=this.jButtonDuplicarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaCopiarComisionVentaCobro=this.jButtonCopiarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaVerFormComisionVentaCobro=this.jButtonVerFormComisionVentaCobro.isVisible();
			
			this.isVisibilidadCeldaOrdenComisionVentaCobro=this.jButtonAbrirOrderByComisionVentaCobro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=this.jButtonNuevoRelacionesComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaModificarComisionVentaCobro=this.jButtonModificarComisionVentaCobro.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.isVisibilidadCeldaActualizarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaEliminarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaCancelarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaGuardarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=this.jButtonGuardarCambiosTablaComisionVentaCobro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoComisionVentaCobro=this.jButtonNuevoToolBarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=this.jButtonNuevoRelacionesToolBarComisionVentaCobro.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.isVisibilidadCeldaModificarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarToolBarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaActualizarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarToolBarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaEliminarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarToolBarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaCancelarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarToolBarComisionVentaCobro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionVentaCobro=this.jButtonGuardarCambiosToolBarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=this.jButtonGuardarCambiosTablaToolBarComisionVentaCobro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoComisionVentaCobro=this.jMenuItemNuevoComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=this.jMenuItemNuevoRelacionesComisionVentaCobro.isVisible();
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.isVisibilidadCeldaModificarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemModificarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaActualizarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemActualizarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaEliminarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemEliminarComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaCancelarComisionVentaCobro=this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemCancelarComisionVentaCobro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarComisionVentaCobro=this.jMenuItemGuardarCambiosComisionVentaCobro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=this.jMenuItemGuardarCambiosTablaComisionVentaCobro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesComisionVentaCobro(Boolean esInicializar) {
		if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
				//if(this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesComisionVentaCobro();
			}
			
			this.inicializarActualizarBindingBotonesManualComisionVentaCobro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualComisionVentaCobro() {
		this.jButtonNuevoComisionVentaCobro.setVisible(this.isPermisoNuevoComisionVentaCobro);			
		this.jButtonDuplicarComisionVentaCobro.setVisible(this.isPermisoDuplicarComisionVentaCobro);			
		this.jButtonCopiarComisionVentaCobro.setVisible(this.isPermisoCopiarComisionVentaCobro);			
		this.jButtonVerFormComisionVentaCobro.setVisible(this.isPermisoVerFormComisionVentaCobro);			
		
		this.jButtonAbrirOrderByComisionVentaCobro.setVisible(this.isPermisoOrdenComisionVentaCobro);					
		
		this.jButtonNuevoRelacionesComisionVentaCobro.setVisible(this.isPermisoNuevoComisionVentaCobro);			
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarComisionVentaCobro.setVisible(this.isPermisoActualizarComisionVentaCobro);	
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarComisionVentaCobro.setVisible(this.isPermisoActualizarComisionVentaCobro);	
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarComisionVentaCobro.setVisible(this.isPermisoEliminarComisionVentaCobro);
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarComisionVentaCobro.setVisible(this.isVisibilidadCeldaCancelarComisionVentaCobro);						
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.setVisible(this.isPermisoGuardarCambiosComisionVentaCobro);							
		}
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.setVisible(this.isPermisoActualizarComisionVentaCobro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionVentaCobro() {
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarComisionVentaCobro.setVisible(this.isPermisoActualizarComisionVentaCobro);	
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarComisionVentaCobro.setVisible(this.isPermisoActualizarComisionVentaCobro);	
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarComisionVentaCobro.setVisible(this.isPermisoEliminarComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarComisionVentaCobro.setVisible(this.isVisibilidadCeldaCancelarComisionVentaCobro);							
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.setVisible((this.isVisibilidadCeldaGuardarComisionVentaCobro && this.isPermisoGuardarCambiosComisionVentaCobro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosComisionVentaCobro() {
		if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualComisionVentaCobro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesComisionVentaCobro() {
	}
	
	public void jTableDatosComisionVentaCobroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarComisionVentaCobro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.comisionventacobro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaComisionVentaCobroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebComisionVentaCobro(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionVentaCobro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionVentaCobro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.comisionventacobroLogic.getConnexion());

				if(this.comisionventacobro.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.comisionventacobro.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.comisionventacobro.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioComisionVentaCobroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebComisionVentaCobro(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionVentaCobro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionVentaCobro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.comisionventacobroLogic.getConnexion());

				if(this.comisionventacobro.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.comisionventacobro.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.comisionventacobro.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_periodoComisionVentaCobroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoperiodo=true;

			idTienePermisoperiodo=this.tienePermisosUsuarioEnPaginaWebComisionVentaCobro(PeriodoConstantesFunciones.CLASSNAME);

			if(idTienePermisoperiodo) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionVentaCobro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionVentaCobro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);

				this.periodoBeanSwingJInternalFrame=new PeriodoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.periodoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.periodoBeanSwingJInternalFrame.getPeriodoLogic().setConnexion(this.comisionventacobroLogic.getConnexion());

				if(this.comisionventacobro.getid_periodo()!=null) {
					this.periodoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.periodoBeanSwingJInternalFrame.setIdActual(this.comisionventacobro.getid_periodo());
					this.periodoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.periodoBeanSwingJInternalFrame.inicializarActualizarBindingTablaPeriodo();
				}

				JInternalFrameBase jinternalFrame =this.periodoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
				TitledBorder titledBorderperiodo=(TitledBorder)this.periodoBeanSwingJInternalFrame.jScrollPanelDatosPeriodo.getBorder();

				titledBorderperiodo.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Periodo");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_periodoComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getid_periodo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_periodo = "+this.comisionventacobro.getid_periodo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_vendedorComisionVentaCobroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisovendedor=true;

			idTienePermisovendedor=this.tienePermisosUsuarioEnPaginaWebComisionVentaCobro(VendedorConstantesFunciones.CLASSNAME);

			if(idTienePermisovendedor) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionVentaCobro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionVentaCobro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);

				this.vendedorBeanSwingJInternalFrame=new VendedorBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.vendedorBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.vendedorBeanSwingJInternalFrame.getVendedorLogic().setConnexion(this.comisionventacobroLogic.getConnexion());

				if(this.comisionventacobro.getid_vendedor()!=null) {
					this.vendedorBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.vendedorBeanSwingJInternalFrame.setIdActual(this.comisionventacobro.getid_vendedor());
					this.vendedorBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.vendedorBeanSwingJInternalFrame.inicializarActualizarBindingTablaVendedor();
				}

				JInternalFrameBase jinternalFrame =this.vendedorBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
				TitledBorder titledBordervendedor=(TitledBorder)this.vendedorBeanSwingJInternalFrame.jScrollPanelDatosVendedor.getBorder();

				titledBordervendedor.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Vendedor");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_vendedorComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getid_vendedor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_vendedor = "+this.comisionventacobro.getid_vendedor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_facturaComisionVentaCobroActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.facturaBeanSwingJInternalFrame.sTipoBusqueda="Factura";

			if(!this.sFinalQueryGeneral_factura.equals("")) {
				this.facturaBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_factura);
				this.facturaBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.facturaBeanSwingJInternalFrame.procesarBusqueda(this.facturaBeanSwingJInternalFrame.sAccionBusqueda);
				this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingFactura(false);
			}

			if(!this.sFinalQueryComboFactura.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderComisionVentaCobro=null;
			TitledBorder titledBorderfactura=null;

			if(!this.jScrollPanelDatosComisionVentaCobro.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
				titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Factura");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_facturaComisionVentaCobroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisofactura=true;

			idTienePermisofactura=this.tienePermisosUsuarioEnPaginaWebComisionVentaCobro(FacturaConstantesFunciones.CLASSNAME);

			if(idTienePermisofactura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosComisionVentaCobro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosComisionVentaCobro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);

				this.facturaBeanSwingJInternalFrame=new FacturaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.facturaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.facturaBeanSwingJInternalFrame.getFacturaLogic().setConnexion(this.comisionventacobroLogic.getConnexion());

				if(this.comisionventacobro.getid_factura()!=null) {
					this.facturaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.facturaBeanSwingJInternalFrame.setIdActual(this.comisionventacobro.getid_factura());
					this.facturaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.facturaBeanSwingJInternalFrame.inicializarActualizarBindingTablaFactura();
				}

				JInternalFrameBase jinternalFrame =this.facturaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderComisionVentaCobro=(TitledBorder)this.jScrollPanelDatosComisionVentaCobro.getBorder();
				TitledBorder titledBorderfactura=(TitledBorder)this.facturaBeanSwingJInternalFrame.jScrollPanelDatosFactura.getBorder();

				titledBorderfactura.setTitle(titledBorderComisionVentaCobro.getTitle() + " -> Factura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_facturaComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getid_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_factura = "+this.comisionventacobro.getid_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_facturaComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getnumero_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_factura like '%"+this.comisionventacobro.getnumero_factura()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pagoComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getfecha_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago = '"+Funciones2.getStringPostgresDate(this.comisionventacobro.getfecha_pago())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombre_clienteComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getnombre_cliente()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre_cliente like '%"+this.comisionventacobro.getnombre_cliente()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_comprobanteComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getnumero_comprobante()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_comprobante like '%"+this.comisionventacobro.getnumero_comprobante()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonestadoComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getestado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where estado like '%"+this.comisionventacobro.getestado()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_facturaComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.gettotal_factura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_factura = "+this.comisionventacobro.gettotal_factura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_abonoComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.gettotal_abono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_abono = "+this.comisionventacobro.gettotal_abono().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcentaje_comisionComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getporcentaje_comision()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcentaje_comision = "+this.comisionventacobro.getporcentaje_comision().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontotal_comision_cobroComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.gettotal_comision_cobro()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where total_comision_cobro = "+this.comisionventacobro.gettotal_comision_cobro().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_diasComisionVentaCobroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.getcomisionventacobro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.comisionventacobro==null) {
						this.comisionventacobro = new ComisionVentaCobro();
					}

					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);
				}

				if(this.comisionventacobro.getnumero_dias()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_dias = "+this.comisionventacobro.getnumero_dias().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingComisionVentaCobro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionVentaCobro(false,false);

			this.getComisionVentaCobrosFK_IdEjercicio();

			this.inicializarActualizarBindingComisionVentaCobro(false);

			//if(ComisionVentaCobroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionVentaCobro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionVentaCobro(false,false);

			this.getComisionVentaCobrosFK_IdEmpresa();

			this.inicializarActualizarBindingComisionVentaCobro(false);

			//if(ComisionVentaCobroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionVentaCobro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdFacturaComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionVentaCobro(false,false);

			this.getComisionVentaCobrosFK_IdFactura();

			this.inicializarActualizarBindingComisionVentaCobro(false);

			//if(ComisionVentaCobroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionVentaCobro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdPeriodoComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionVentaCobro(false,false);

			this.getComisionVentaCobrosFK_IdPeriodo();

			this.inicializarActualizarBindingComisionVentaCobro(false);

			//if(ComisionVentaCobroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionVentaCobro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdVendedorComisionVentaCobroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingComisionVentaCobro(false,false);

			this.getComisionVentaCobrosFK_IdVendedor();

			this.inicializarActualizarBindingComisionVentaCobro(false);

			//if(ComisionVentaCobroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingComisionVentaCobro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.comisionventacobroLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameComisionVentaCobro() {
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
			this.jInternalFrameDetalleFormComisionVentaCobro.setVisible(false);	    			
			this.jInternalFrameDetalleFormComisionVentaCobro.dispose();
			this.jInternalFrameDetalleFormComisionVentaCobro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
			this.jInternalFrameReporteDinamicoComisionVentaCobro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoComisionVentaCobro.dispose();
			this.jInternalFrameReporteDinamicoComisionVentaCobro=null;
		}
		
		if(this.jInternalFrameImportacionComisionVentaCobro!=null) {
			this.jInternalFrameImportacionComisionVentaCobro.setVisible(false);	    			
			this.jInternalFrameImportacionComisionVentaCobro.dispose();
			this.jInternalFrameImportacionComisionVentaCobro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessComisionVentaCobro();
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			
			if(sTipo.equals("NuevoComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarComisionVentaCobro")) {
				jButtonDuplicarComisionVentaCobroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarComisionVentaCobro")) {
				jButtonCopiarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("VerFormComisionVentaCobro")) {
				jButtonVerFormComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarComisionVentaCobro")) {
				jButtonDuplicarComisionVentaCobroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarComisionVentaCobro")) {
				jButtonDuplicarComisionVentaCobroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarComisionVentaCobro")) {
				jButtonModificarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarComisionVentaCobro")) {
				jButtonModificarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarComisionVentaCobro")) {
				jButtonModificarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarComisionVentaCobro")) {
				jButtonActualizarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarComisionVentaCobro")) {
				jButtonActualizarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarComisionVentaCobro")) {
				jButtonActualizarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("EliminarComisionVentaCobro")) {
				jButtonEliminarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarComisionVentaCobro")) {
				jButtonEliminarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarComisionVentaCobro")) {
				jButtonEliminarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("CancelarComisionVentaCobro")) {
				jButtonCancelarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarComisionVentaCobro")) {
				jButtonCancelarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarComisionVentaCobro")) {
				jButtonCancelarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("CerrarComisionVentaCobro")) {
				jButtonCerrarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarComisionVentaCobro")) {
				jButtonCerrarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarComisionVentaCobro")) {
				jButtonCerrarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarComisionVentaCobro")) {
				jButtonMostrarOcultarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarComisionVentaCobro")) {
				jButtonCancelarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarComisionVentaCobro")) {
				jButtonCopiarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarComisionVentaCobro")) {
				jButtonVerFormComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarComisionVentaCobro")) {
				jButtonCopiarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormComisionVentaCobro")) {
				jButtonVerFormComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionComisionVentaCobro")) {
				jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarComisionVentaCobro")) {
				jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionComisionVentaCobro")) {
				jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresComisionVentaCobro")) {
				jButtonAnterioresComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarComisionVentaCobro")) {
				jButtonAnterioresComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreComisionVentaCobro")) {
				jButtonAnterioresComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesComisionVentaCobro")) {
				jButtonSiguientesComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarComisionVentaCobro")) {
				jButtonSiguientesComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesComisionVentaCobro")) {
				jButtonSiguientesComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByComisionVentaCobro") || sTipo.equals("MenuItemDetalleAbrirOrderByComisionVentaCobro")) {
				jButtonAbrirOrderByComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarComisionVentaCobro") || sTipo.equals("MenuItemDetalleMostrarOcultarComisionVentaCobro")) {
				jButtonMostrarOcultarComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosComisionVentaCobro")) {
				jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarComisionVentaCobro")) {
				jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosComisionVentaCobro")) {
				jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoComisionVentaCobro")) {
				jButtonCerrarReporteDinamicoComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoComisionVentaCobro")) {
				jButtonGenerarReporteDinamicoComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoComisionVentaCobro")) {
				
				jButtonGenerarExcelReporteDinamicoComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionComisionVentaCobro")) {
				jButtonCerrarImportacionComisionVentaCobroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionComisionVentaCobro")) {
				
				jButtonGenerarImportacionComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionComisionVentaCobro")) {
				
				jButtonAbrirImportacionComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesComisionVentaCobro")) {
				jComboBoxTiposAccionesComisionVentaCobroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesComisionVentaCobro")) {
				jComboBoxTiposRelacionesComisionVentaCobroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioComisionVentaCobro")) {
				jComboBoxTiposAccionesComisionVentaCobroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarComisionVentaCobro")) {
				
				jComboBoxTiposSeleccionarComisionVentaCobroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralComisionVentaCobro")) {
				jTextFieldValorCampoGeneralComisionVentaCobroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByComisionVentaCobro")) {
				jButtonAbrirOrderByComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarComisionVentaCobro")) {
				jButtonAbrirOrderByComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByComisionVentaCobro")) {
				jButtonCerrarOrderByComisionVentaCobroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionVentaCobroBusqueda")) {
				this.jButtonidComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionVentaCobroUpdate")) {
				this.jButtonid_empresaComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionVentaCobroBusqueda")) {
				this.jButtonid_empresaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioComisionVentaCobroUpdate")) {
				this.jButtonid_ejercicioComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioComisionVentaCobroBusqueda")) {
				this.jButtonid_ejercicioComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoComisionVentaCobroUpdate")) {
				this.jButtonid_periodoComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoComisionVentaCobroBusqueda")) {
				this.jButtonid_periodoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionVentaCobroUpdate")) {
				this.jButtonid_vendedorComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionVentaCobroBusqueda")) {
				this.jButtonid_vendedorComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaComisionVentaCobro")) {
				this.jButtonid_facturaComisionVentaCobroActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaComisionVentaCobroUpdate")) {
				this.jButtonid_facturaComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaComisionVentaCobroBusqueda")) {
				this.jButtonid_facturaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaComisionVentaCobroBusqueda")) {
				this.jButtonnumero_facturaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoComisionVentaCobroBusqueda")) {
				this.jButtonfecha_pagoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComisionVentaCobroBusqueda")) {
				this.jButtonnombre_clienteComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteComisionVentaCobroBusqueda")) {
				this.jButtonnumero_comprobanteComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoComisionVentaCobroBusqueda")) {
				this.jButtonestadoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturaComisionVentaCobroBusqueda")) {
				this.jButtontotal_facturaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_abonoComisionVentaCobroBusqueda")) {
				this.jButtontotal_abonoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_comisionComisionVentaCobroBusqueda")) {
				this.jButtonporcentaje_comisionComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_comision_cobroComisionVentaCobroBusqueda")) {
				this.jButtontotal_comision_cobroComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasComisionVentaCobroBusqueda")) {
				this.jButtonnumero_diasComisionVentaCobroBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessComisionVentaCobro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			ComisionVentaCobro comisionventacobroLocal=null;
			
			if(!this.getEsControlTabla()) {
				comisionventacobroLocal=this.comisionventacobro;
			} else {
				comisionventacobroLocal=this.comisionventacobroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
							
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
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
			
			


			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
								
						
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
								
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
							
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
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
			
			


			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
								
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosComisionVentaCobro")) {
					jCheckBoxSeleccionarTodosComisionVentaCobroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosComisionVentaCobro")) {
					jCheckBoxSeleccionadosComisionVentaCobroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarComisionVentaCobro")) {
					
				}
				
				


				
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
												
				
				


				
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
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
			
			


			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaComisionVentaCobroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.comisionventacobro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.comisionventacobro);
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
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
				
				


				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(ComisionVentaCobro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",ComisionVentaCobro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaComisionVentaCobroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.comisionventacobroAnterior =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarComisionVentaCobro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosComisionVentaCobroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosComisionVentaCobro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.comisionventacobro =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.comisionventacobro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarComisionVentaCobro")) {
				
				}
				
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarComisionVentaCobro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosComisionVentaCobro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarComisionVentaCobro")) {
			
			}
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessComisionVentaCobro();
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			if(sTipo.equals("NuevoComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarComisionVentaCobro")) {
				jButtonDuplicarComisionVentaCobroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarComisionVentaCobro")) {
				jButtonCopiarComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormComisionVentaCobro")) {
				jButtonVerFormComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesComisionVentaCobro")) {
				jButtonNuevoComisionVentaCobroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarComisionVentaCobro")) {
				jButtonModificarComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarComisionVentaCobro")) {
				jButtonActualizarComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarComisionVentaCobro")) {
				jButtonEliminarComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarComisionVentaCobro")) {
				jButtonCancelarComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarComisionVentaCobro")) {
				jButtonCerrarComisionVentaCobroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosComisionVentaCobro")) {
				jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosComisionVentaCobro")) {
				jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByComisionVentaCobro")) {
				jButtonAbrirOrderByComisionVentaCobroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionComisionVentaCobro")) {
				jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresComisionVentaCobro")) {
				jButtonAnterioresComisionVentaCobroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesComisionVentaCobro")) {
				jButtonSiguientesComisionVentaCobroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idComisionVentaCobroBusqueda")) {
				this.jButtonidComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaComisionVentaCobroUpdate")) {
				this.jButtonid_empresaComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaComisionVentaCobroBusqueda")) {
				this.jButtonid_empresaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioComisionVentaCobroUpdate")) {
				this.jButtonid_ejercicioComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioComisionVentaCobroBusqueda")) {
				this.jButtonid_ejercicioComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_periodoComisionVentaCobroUpdate")) {
				this.jButtonid_periodoComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_periodoComisionVentaCobroBusqueda")) {
				this.jButtonid_periodoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_vendedorComisionVentaCobroUpdate")) {
				this.jButtonid_vendedorComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_vendedorComisionVentaCobroBusqueda")) {
				this.jButtonid_vendedorComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_facturaComisionVentaCobro")) {
				this.jButtonid_facturaComisionVentaCobroActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_facturaComisionVentaCobroUpdate")) {
				this.jButtonid_facturaComisionVentaCobroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_facturaComisionVentaCobroBusqueda")) {
				this.jButtonid_facturaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_facturaComisionVentaCobroBusqueda")) {
				this.jButtonnumero_facturaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoComisionVentaCobroBusqueda")) {
				this.jButtonfecha_pagoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombre_clienteComisionVentaCobroBusqueda")) {
				this.jButtonnombre_clienteComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_comprobanteComisionVentaCobroBusqueda")) {
				this.jButtonnumero_comprobanteComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("estadoComisionVentaCobroBusqueda")) {
				this.jButtonestadoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_facturaComisionVentaCobroBusqueda")) {
				this.jButtontotal_facturaComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_abonoComisionVentaCobroBusqueda")) {
				this.jButtontotal_abonoComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcentaje_comisionComisionVentaCobroBusqueda")) {
				this.jButtonporcentaje_comisionComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("total_comision_cobroComisionVentaCobroBusqueda")) {
				this.jButtontotal_comision_cobroComisionVentaCobroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_diasComisionVentaCobroBusqueda")) {
				this.jButtonnumero_diasComisionVentaCobroBusquedaActionPerformed(evt);
			}
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessComisionVentaCobro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameComisionVentaCobro")) {
				closingInternalFrameComisionVentaCobro();
				
			} else if(sTipo.equals("jButtonCancelarComisionVentaCobro")) {
				JInternalFrameBase jInternalFrameDetalleFormComisionVentaCobro = (JInternalFrameBase)evt.getSource();
	            	
	            ComisionVentaCobroBeanSwingJInternalFrame jInternalFrameParent=(ComisionVentaCobroBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionVentaCobro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarComisionVentaCobroActionPerformed(null);
			}
			
			ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.comisionventacobro,new Object(),this.comisionventacobroParameterGeneral,this.comisionventacobroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormComisionVentaCobro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormComisionVentaCobro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormComisionVentaCobro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.comisionventacobro)) {
			if(!esControlTabla) {
				if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);			
				}
				
				if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualComisionVentaCobro(this.comisionventacobro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionventacobroReturnGeneral=comisionventacobroLogic.procesarEventosComisionVentaCobrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionventacobroLogic.getComisionVentaCobros(),this.comisionventacobro,this.comisionventacobroParameterGeneral,this.isEsNuevoComisionVentaCobro,classes);//this.comisionventacobroLogic.getComisionVentaCobro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanComisionVentaCobro(this.comisionventacobroReturnGeneral,this.comisionventacobroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanComisionVentaCobro(classes,this.comisionventacobroReturnGeneral,this.comisionventacobroBean,false);
					}
						
					if(this.comisionventacobroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro());	
					}
						
					if(this.comisionventacobroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro(),classes);//this.comisionventacobroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioComisionVentaCobro(this.comisionventacobro,classes);//this.comisionventacobroBean);									
				}
			
				if(ComisionVentaCobroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualComisionVentaCobro(this.comisionventacobro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysComisionVentaCobro(this.comisionventacobro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.comisionventacobroAnterior!=null) {
						this.comisionventacobro=this.comisionventacobroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.comisionventacobroReturnGeneral=comisionventacobroLogic.procesarEventosComisionVentaCobrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionventacobroLogic.getComisionVentaCobros(),this.comisionventacobro,this.comisionventacobroParameterGeneral,this.isEsNuevoComisionVentaCobro,classes);//this.comisionventacobroLogic.getComisionVentaCobro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.comisionventacobroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.comisionventacobroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.comisionventacobroReturnGeneral.getComisionVentaCobro(),comisionventacobroLogic.getComisionVentaCobros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.comisionventacobroReturnGeneral.getComisionVentaCobro(),this.comisionventacobros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosComisionVentaCobro.repaint();
				
				//((AbstractTableModel) this.jTableDatosComisionVentaCobro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosComisionVentaCobro();
			}
		}
	}
	
	public void actualizarVisualTableDatosComisionVentaCobro() throws Exception {
		
		ComisionVentaCobroModel comisionventacobroModel=(ComisionVentaCobroModel)this.jTableDatosComisionVentaCobro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			comisionventacobroModel.comisionventacobros=this.comisionventacobroLogic.getComisionVentaCobros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			comisionventacobroModel.comisionventacobros=this.comisionventacobros;
		}
		
		
		((ComisionVentaCobroModel) this.jTableDatosComisionVentaCobro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaComisionVentaCobro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getcomisionventacobroAnterior(),this.comisionventacobroLogic.getComisionVentaCobros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getcomisionventacobroAnterior(),this.comisionventacobros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosComisionVentaCobro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioComisionVentaCobro(ComisionVentaCobro comisionventacobro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
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
										
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionventacobro,new Object(),generalEntityParameterGeneral,this.comisionventacobroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.comisionventacobroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=ComisionVentaCobroConstantesFunciones.getClassesRelationshipsOfComisionVentaCobro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=ComisionVentaCobroConstantesFunciones.getClassesRelationshipsFromStringsOfComisionVentaCobro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormComisionVentaCobro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				ComisionVentaCobroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.comisionventacobro,new Object(),generalEntityParameterGeneral,this.comisionventacobroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioComisionVentaCobro(ComisionVentaCobroBean comisionventacobroBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanComisionVentaCobro(ArrayList<Classe> classes,ComisionVentaCobroReturnGeneral comisionventacobroReturnGeneral,ComisionVentaCobroBean comisionventacobroBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualComisionVentaCobro(ComisionVentaCobro comisionventacobro,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.comisionventacobro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormComisionVentaCobro = new ComisionVentaCobroDetalleFormJInternalFrame(jDesktopPane,this.comisionventacobroSessionBean.getConGuardarRelaciones(),this.comisionventacobroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.setVisible(false);
		this.jInternalFrameDetalleFormComisionVentaCobro.setSelected(false);						
		
		this.jInternalFrameDetalleFormComisionVentaCobro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormComisionVentaCobro.comisionventacobroLogic=this.comisionventacobroLogic;
		
		this.cargarCombosFrameForeignKeyComisionVentaCobro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleComisionVentaCobro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleComisionVentaCobro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyComisionVentaCobro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyComisionVentaCobro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormComisionVentaCobro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionVentaCobro"));
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"ModificarComisionVentaCobro"));

		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionVentaCobro"));
					
		this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemModificarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionVentaCobro"));		
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"ActualizarComisionVentaCobro"));
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionVentaCobro"));
						
		this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemActualizarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionVentaCobro"));		
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"EliminarComisionVentaCobro"));
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionVentaCobro"));
								
		this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemEliminarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionVentaCobro"));		
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CancelarComisionVentaCobro"));
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionVentaCobro"));
					
		this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemCancelarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionVentaCobro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemDetalleCerrarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionVentaCobro"));		
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionVentaCobro"));
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionVentaCobro"));
		
		
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionVentaCobro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonidComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"idComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_empresaComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_empresaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_ejercicioComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_ejercicioComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_periodoComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_periodoComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_periodoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_vendedorComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_vendedorComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionVentaCobroBusqueda"));
		//jButtonid_facturaComisionVentaCobro.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaComisionVentaCobroActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobro.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobro"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonfecha_pagoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnombre_clienteComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_comprobanteComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonestadoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"estadoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_abonoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_abonoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonporcentaje_comisionComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_comisionComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_comision_cobroComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_comision_cobroComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_diasComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasComisionVentaCobroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionVentaCobro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameComisionVentaCobro"));
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarComisionVentaCobro"));
		}
		
		this.jTableDatosComisionVentaCobro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarComisionVentaCobro"));
		
		this.jTableDatosComisionVentaCobro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarComisionVentaCobro"));
		
		this.jButtonNuevoComisionVentaCobro.addActionListener(new ButtonActionListener(this,"NuevoComisionVentaCobro"));
		
		this.jButtonDuplicarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"DuplicarComisionVentaCobro"));
		
		this.jButtonCopiarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"CopiarComisionVentaCobro"));
		
		this.jButtonVerFormComisionVentaCobro.addActionListener(new ButtonActionListener(this,"VerFormComisionVentaCobro"));
		
		
		this.jButtonNuevoToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"NuevoToolBarComisionVentaCobro"));
			
		this.jButtonDuplicarToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarComisionVentaCobro"));
			
		this.jMenuItemNuevoComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoComisionVentaCobro"));
			
		this.jMenuItemDuplicarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarComisionVentaCobro"));		
		
		
		this.jButtonNuevoRelacionesComisionVentaCobro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesComisionVentaCobro"));
		
		
		this.jButtonNuevoRelacionesToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarComisionVentaCobro"));
			
		this.jMenuItemNuevoRelacionesComisionVentaCobro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesComisionVentaCobro"));		
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"ModificarComisionVentaCobro"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonModificarToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"ModificarToolBarComisionVentaCobro"));
			
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemModificarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"MenuItemModificarComisionVentaCobro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"ActualizarComisionVentaCobro"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonActualizarToolBarComisionVentaCobro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarComisionVentaCobro"));
				
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemActualizarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarComisionVentaCobro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"EliminarComisionVentaCobro"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonEliminarToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"EliminarToolBarComisionVentaCobro"));
						
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemEliminarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarComisionVentaCobro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CancelarComisionVentaCobro"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonCancelarToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CancelarToolBarComisionVentaCobro"));
			
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemCancelarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarComisionVentaCobro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarComisionVentaCobro"));		
		
		
		this.jButtonCerrarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CerrarComisionVentaCobro"));
		
		
		this.jButtonCerrarToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CerrarToolBarComisionVentaCobro"));
			
		this.jMenuItemCerrarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarComisionVentaCobro"));
			
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jMenuItemDetalleCerrarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarComisionVentaCobro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosComisionVentaCobro"));
		}
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarComisionVentaCobro"));
		}
		
		this.jButtonCopiarToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CopiarToolBarComisionVentaCobro"));
			
		this.jButtonVerFormToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"VerFormToolBarComisionVentaCobro"));
		
		this.jMenuItemGuardarCambiosComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosComisionVentaCobro"));
			
		this.jMenuItemCopiarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarComisionVentaCobro"));		
		
		this.jMenuItemVerFormComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormComisionVentaCobro"));		
		
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionVentaCobro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarComisionVentaCobro"));
			
		this.jMenuItemGuardarCambiosTablaComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaComisionVentaCobro"));		
		
		
		
		this.jButtonRecargarInformacionComisionVentaCobro.addActionListener (new ButtonActionListener(this,"RecargarInformacionComisionVentaCobro"));
					
		this.jButtonRecargarInformacionToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarComisionVentaCobro"));
		
		this.jMenuItemRecargarInformacionComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionComisionVentaCobro"));		
		
		
		
		this.jButtonAnterioresComisionVentaCobro.addActionListener (new ButtonActionListener(this,"AnterioresComisionVentaCobro"));
		
		
		this.jButtonAnterioresToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarComisionVentaCobro"));
		
		this.jMenuItemAnterioresComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresComisionVentaCobro"));		
		
		
		this.jButtonSiguientesComisionVentaCobro.addActionListener (new ButtonActionListener(this,"SiguientesComisionVentaCobro"));
		
		
		this.jButtonSiguientesToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarComisionVentaCobro"));
			
		this.jMenuItemSiguientesComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesComisionVentaCobro"));
			
		this.jMenuItemAbrirOrderByComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByComisionVentaCobro"));
			
		this.jMenuItemMostrarOcultarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarComisionVentaCobro"));
			
		this.jMenuItemDetalleAbrirOrderByComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByComisionVentaCobro"));
			
		this.jMenuItemDetalleMostarOcultarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarComisionVentaCobro"));		
		
		
		this.jButtonNuevoGuardarCambiosComisionVentaCobro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosComisionVentaCobro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarComisionVentaCobro"));
			
		this.jMenuItemNuevoGuardarCambiosComisionVentaCobro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosComisionVentaCobro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosComisionVentaCobro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosComisionVentaCobro"));

		this.jCheckBoxSeleccionadosComisionVentaCobro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosComisionVentaCobro"));
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioComisionVentaCobro"));
		}
		
		
		this.jComboBoxTiposRelacionesComisionVentaCobro.addActionListener (new ButtonActionListener(this,"TiposRelacionesComisionVentaCobro"));
			
		this.jComboBoxTiposAccionesComisionVentaCobro.addActionListener (new ButtonActionListener(this,"TiposAccionesComisionVentaCobro"));
					
		this.jComboBoxTiposSeleccionarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarComisionVentaCobro"));
			
		this.jTextFieldValorCampoGeneralComisionVentaCobro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralComisionVentaCobro"));		
		
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonidComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"idComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_empresaComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_empresaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_ejercicioComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_ejercicioComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_periodoComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_periodoComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_periodoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_vendedorComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_vendedorComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionVentaCobroBusqueda"));
		//jButtonid_facturaComisionVentaCobro.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaComisionVentaCobroActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobro.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobro"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonfecha_pagoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnombre_clienteComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_comprobanteComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonestadoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"estadoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_abonoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_abonoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonporcentaje_comisionComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_comisionComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_comision_cobroComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_comision_cobroComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_diasComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasComisionVentaCobroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoComisionVentaCobro!=null) {
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionVentaCobro"));
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionVentaCobro"));
				this.jInternalFrameReporteDinamicoComisionVentaCobro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionVentaCobro"));
			}
			
			//this.jButtonCerrarReporteDinamicoComisionVentaCobro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoComisionVentaCobro"));				
			//this.jButtonGenerarReporteDinamicoComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoComisionVentaCobro"));
			//this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoComisionVentaCobro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionComisionVentaCobro!=null) {
				this.jInternalFrameImportacionComisionVentaCobro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionComisionVentaCobro"));
				this.jInternalFrameImportacionComisionVentaCobro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionComisionVentaCobro"));
				this.jInternalFrameImportacionComisionVentaCobro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionComisionVentaCobro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByComisionVentaCobro.addActionListener (new ButtonActionListener(this,"AbrirOrderByComisionVentaCobro"));
			
			this.jButtonAbrirOrderByToolBarComisionVentaCobro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarComisionVentaCobro"));			
			
			if(this.jInternalFrameOrderByComisionVentaCobro!=null) {
				this.jInternalFrameOrderByComisionVentaCobro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByComisionVentaCobro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormComisionVentaCobro.jTabbedPaneRelacionesComisionVentaCobro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesComisionVentaCobro"));
		
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
            		closingInternalFrameComisionVentaCobro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormComisionVentaCobro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormComisionVentaCobro = (JInternalFrameBase)event.getSource();
	            	
	            ComisionVentaCobroBeanSwingJInternalFrame jInternalFrameParent=(ComisionVentaCobroBeanSwingJInternalFrame)jInternalFrameDetalleFormComisionVentaCobro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarComisionVentaCobroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosComisionVentaCobro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosComisionVentaCobroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosComisionVentaCobro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosComisionVentaCobro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionVentaCobroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionVentaCobroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionVentaCobroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoComisionVentaCobro";
		inputMap = this.jButtonNuevoComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionVentaCobroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionVentaCobroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionVentaCobroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoComisionVentaCobroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesComisionVentaCobro";
		inputMap = this.jButtonNuevoRelacionesComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoComisionVentaCobroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarComisionVentaCobro";
		inputMap = this.jButtonModificarComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarComisionVentaCobroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarComisionVentaCobro";
		inputMap = this.jButtonActualizarComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarComisionVentaCobroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarComisionVentaCobro";
		inputMap = this.jButtonEliminarComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarComisionVentaCobroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarComisionVentaCobro";
		inputMap = this.jButtonCancelarComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarComisionVentaCobroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarComisionVentaCobro";
		inputMap = this.jButtonCerrarComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarComisionVentaCobroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosComisionVentaCobro";
		inputMap = this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonGuardarCambiosComisionVentaCobro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosComisionVentaCobroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosComisionVentaCobro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosComisionVentaCobroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesComisionVentaCobro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesComisionVentaCobroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarComisionVentaCobro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarComisionVentaCobroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralComisionVentaCobro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralComisionVentaCobroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonidComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"idComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_empresaComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_empresaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_ejercicioComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_ejercicioComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_ejercicioComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_periodoComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_periodoComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_periodoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_periodoComisionVentaCobroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_vendedorComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_vendedorComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_vendedorComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_vendedorComisionVentaCobroBusqueda"));
		//jButtonid_facturaComisionVentaCobro.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_facturaComisionVentaCobroActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobro.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobro"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobroUpdate.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"id_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonfecha_pagoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnombre_clienteComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"nombre_clienteComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_comprobanteComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_comprobanteComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonestadoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"estadoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_facturaComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_facturaComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_abonoComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_abonoComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonporcentaje_comisionComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"porcentaje_comisionComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtontotal_comision_cobroComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"total_comision_cobroComisionVentaCobroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormComisionVentaCobro.jButtonnumero_diasComisionVentaCobroBusqueda.addActionListener(new ButtonActionListener(this,"numero_diasComisionVentaCobroBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionComisionVentaCobro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionComisionVentaCobroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarComisionVentaCobroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarComisionVentaCobro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosComisionVentaCobro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
					comisionventacobroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionVentaCobro comisionventacobroAux:comisionventacobros) {
					comisionventacobroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosComisionVentaCobroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionVentaCobro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
						comisionventacobroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionVentaCobro comisionventacobroAux:comisionventacobros) {
						comisionventacobroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionVentaCobro comisionventacobroAux:comisionventacobros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionVentaCobro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionVentaCobro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosComisionVentaCobroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingComisionVentaCobro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosComisionVentaCobro.getSelectedRows();
			
			ComisionVentaCobro comisionventacobroLocal=new ComisionVentaCobro();
			
			//this.seleccionarTodosComisionVentaCobro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					comisionventacobroLocal =(ComisionVentaCobro) this.comisionventacobroLogic.getComisionVentaCobros().toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					comisionventacobroLocal =(ComisionVentaCobro) this.comisionventacobros.toArray()[this.jTableDatosComisionVentaCobro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				comisionventacobroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
						comisionventacobroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(ComisionVentaCobro comisionventacobroAux:comisionventacobros) {
						comisionventacobroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosComisionVentaCobro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosComisionVentaCobro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosComisionVentaCobro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualComisionVentaCobroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarComisionVentaCobroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralComisionVentaCobroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingComisionVentaCobro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralComisionVentaCobro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobroLogic.getComisionVentaCobros()) {
				
						if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							comisionventacobroAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							comisionventacobroAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comisionventacobroAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							comisionventacobroAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							comisionventacobroAux.setestado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA)) {
							existe=true;
							comisionventacobroAux.settotal_factura(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO)) {
							existe=true;
							comisionventacobroAux.settotal_abono(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION)) {
							existe=true;
							comisionventacobroAux.setporcentaje_comision(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO)) {
							existe=true;
							comisionventacobroAux.settotal_comision_cobro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							comisionventacobroAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionVentaCobro comisionventacobroAux:comisionventacobros) {
					
						if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA)) {
							existe=true;
							comisionventacobroAux.setnumero_factura(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							comisionventacobroAux.setfecha_pago(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE)) {
							existe=true;
							comisionventacobroAux.setnombre_cliente(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
							existe=true;
							comisionventacobroAux.setnumero_comprobante(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO)) {
							existe=true;
							comisionventacobroAux.setestado(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA)) {
							existe=true;
							comisionventacobroAux.settotal_factura(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO)) {
							existe=true;
							comisionventacobroAux.settotal_abono(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION)) {
							existe=true;
							comisionventacobroAux.setporcentaje_comision(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO)) {
							existe=true;
							comisionventacobroAux.settotal_comision_cobro(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS)) {
							existe=true;
							comisionventacobroAux.setnumero_dias(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesComisionVentaCobroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingComisionVentaCobro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioComisionVentaCobro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesComisionVentaCobro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteComisionVentaCobro) {				
					conSplash=true;//false;										
					
					//this.startProcessComisionVentaCobro(conSplash);
				
					this.generarReporteComisionVentaCobrosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoComisionVentaCobrosSeleccionados();
				//this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionVentaCobrosSeleccionados(false);
				//this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoComisionVentaCobrosSeleccionados(true);
				//this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionVentaCobro();
				
				this.exportarComisionVentaCobrosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionComisionVentaCobros();
				//this.importarComisionVentaCobros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessComisionVentaCobro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelComisionVentaCobrosSeleccionados();
				//this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Comision Venta Cobro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessComisionVentaCobro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoComisionVentaCobro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyComisionVentaCobro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
				}	
			} 			
			else if(ComisionVentaCobroBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteComisionVentaCobro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessComisionVentaCobro(conSplash);
					
						//this.actualizarParametrosGeneralComisionVentaCobro();
						
						this.generarReporteProcesoAccionComisionVentaCobrosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(ComisionVentaCobroBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Comision Venta CobroES SELECCIONADOS?", "MANTENIMIENTO DE Comision Venta Cobro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessComisionVentaCobro();
				
						this.actualizarParametrosGeneralComisionVentaCobro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.comisionventacobroReturnGeneral=comisionventacobroLogic.procesarAccionComisionVentaCobrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.comisionventacobroLogic.getComisionVentaCobros(),this.comisionventacobroParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarComisionVentaCobroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralComisionVentaCobro();
					
					ComisionVentaCobroBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarComisionVentaCobroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesComisionVentaCobro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxTiposAccionesFormularioComisionVentaCobro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessComisionVentaCobro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesComisionVentaCobroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessComisionVentaCobro();
			
			if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
			ComisionVentaCobro comisionventacobro=new ComisionVentaCobro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingComisionVentaCobro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesComisionVentaCobro.getSelectedItem();
			
			
			
			
			comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
			//this.sTipoAccion;
			
			if(comisionventacobrosSeleccionados.size()==1) {
				for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosSeleccionados) {
					comisionventacobro=comisionventacobroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessComisionVentaCobro();
			
      		//this.finishProcessComisionVentaCobro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarComisionVentaCobroReturnGeneral() throws Exception {
		if(this.comisionventacobroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.comisionventacobroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.comisionventacobroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.comisionventacobroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.comisionventacobroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.comisionventacobroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingComisionVentaCobro(false);
		}
		
		if(this.comisionventacobroReturnGeneral.getConRetornoLista() || this.comisionventacobroReturnGeneral.getConRetornoObjeto()) {
			if(this.comisionventacobroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionventacobroLogic.setComisionVentaCobros(this.comisionventacobroReturnGeneral.getComisionVentaCobros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.comisionventacobroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.comisionventacobroLogic.setComisionVentaCobro(this.comisionventacobroReturnGeneral.getComisionVentaCobro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingComisionVentaCobro(false);
		}
	}
	
	public void actualizarParametrosGeneralComisionVentaCobro() throws Exception {
		
		
	}
	
	public ArrayList<ComisionVentaCobro> getComisionVentaCobrosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioComisionVentaCobro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(ComisionVentaCobro comisionventacobroAux:comisionventacobroLogic.getComisionVentaCobros()) {
					if(comisionventacobroAux.getIsSelected()) {
						comisionventacobrosSeleccionados.add(comisionventacobroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(ComisionVentaCobro comisionventacobroAux:this.comisionventacobros) {
					if(comisionventacobroAux.getIsSelected()) {
						comisionventacobrosSeleccionados.add(comisionventacobroAux);				
					}
				}
			}
			
			if(comisionventacobrosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						comisionventacobrosSeleccionados.addAll(this.comisionventacobroLogic.getComisionVentaCobros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						comisionventacobrosSeleccionados.addAll(this.comisionventacobros);				
					}
				}
			}
		} else {
			comisionventacobrosSeleccionados.add(this.comisionventacobro);
		}
		
		return comisionventacobrosSeleccionados;
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
	
	public void generarReporteComisionVentaCobrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalComisionVentaCobrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoComisionVentaCobrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionVentaCobrosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoComisionVentaCobrosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Comision Venta Cobro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesComisionVentaCobrosSeleccionados() throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados);
		
	}	
	
	public void generarReporteNormalComisionVentaCobrosSeleccionados() throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionComisionVentaCobrosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoComisionVentaCobrosSeleccionados() throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoComisionVentaCobro();
		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoComisionVentaCobro();
		
		
		//this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados ,comisionventacobroImplementable,comisionventacobroImplementableHome);
	}
	
	public void mostrarImportacionComisionVentaCobros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionComisionVentaCobro();
		
		this.abrirFrameImportacionComisionVentaCobro();		
		
			
		//this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados ,comisionventacobroImplementable,comisionventacobroImplementableHome);
	}
	
	public void importarComisionVentaCobros() throws Exception {		
	
	}
	
	public void exportarComisionVentaCobrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelComisionVentaCobrosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoComisionVentaCobrosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlComisionVentaCobrosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Comision Venta Cobro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoComisionVentaCobrosSeleccionados() throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarComisionVentaCobro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarComisionVentaCobro(comisionventacobroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//comisionventacobroAux.setsDetalleGeneralEntityReporte(comisionventacobroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarComisionVentaCobro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_ESTADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarComisionVentaCobro(ComisionVentaCobro comisionventacobro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=comisionventacobro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getperiodo_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getvendedor_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getfactura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getnumero_factura();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getfecha_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getnombre_cliente();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getnumero_comprobante();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getestado();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.gettotal_factura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.gettotal_abono().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getporcentaje_comision().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.gettotal_comision_cobro().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=comisionventacobro.getnumero_dias().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelComisionVentaCobrosSeleccionados() throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("ComisionVentaCobros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelComisionVentaCobro(row);				
				iRow++;
			}				
			
			for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelComisionVentaCobro(comisionventacobroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlComisionVentaCobrosSeleccionados() throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();		
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"comisionventacobro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("comisionventacobros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("comisionventacobro");
			//elementRoot.appendChild(element);
		
			for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosSeleccionados) {
				element = document.createElement("comisionventacobro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlComisionVentaCobro(comisionventacobroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Comision Venta Cobro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelComisionVentaCobro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALFACTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALABONO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_PORCENTAJECOMISION);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_TOTALCOMISIONCOBRO);
		cell = row.createCell(iColumn++);cell.setCellValue(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelComisionVentaCobro(ComisionVentaCobro comisionventacobro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getperiodo_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getvendedor_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getfactura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getnumero_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getfecha_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getnombre_cliente());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getnumero_comprobante());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getestado());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.gettotal_factura());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.gettotal_abono());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getporcentaje_comision());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.gettotal_comision_cobro());
		cell = row.createCell(iColumn++);cell.setCellValue(comisionventacobro.getnumero_dias());				
	}
	
	public void setFilaDatosExportarXmlComisionVentaCobro(ComisionVentaCobro comisionventacobro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(ComisionVentaCobroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(comisionventacobro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(ComisionVentaCobroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(comisionventacobro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(ComisionVentaCobroConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(comisionventacobro.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementejercicio_descripcion = document.createElement(ComisionVentaCobroConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(comisionventacobro.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementperiodo_descripcion = document.createElement(ComisionVentaCobroConstantesFunciones.IDPERIODO);
		elementperiodo_descripcion.appendChild(document.createTextNode(comisionventacobro.getperiodo_descripcion()));
		element.appendChild(elementperiodo_descripcion);

		Element elementvendedor_descripcion = document.createElement(ComisionVentaCobroConstantesFunciones.IDVENDEDOR);
		elementvendedor_descripcion.appendChild(document.createTextNode(comisionventacobro.getvendedor_descripcion()));
		element.appendChild(elementvendedor_descripcion);

		Element elementfactura_descripcion = document.createElement(ComisionVentaCobroConstantesFunciones.IDFACTURA);
		elementfactura_descripcion.appendChild(document.createTextNode(comisionventacobro.getfactura_descripcion()));
		element.appendChild(elementfactura_descripcion);

		Element elementnumero_factura = document.createElement(ComisionVentaCobroConstantesFunciones.NUMEROFACTURA);
		elementnumero_factura.appendChild(document.createTextNode(comisionventacobro.getnumero_factura().trim()));
		element.appendChild(elementnumero_factura);

		Element elementfecha_pago = document.createElement(ComisionVentaCobroConstantesFunciones.FECHAPAGO);
		elementfecha_pago.appendChild(document.createTextNode(comisionventacobro.getfecha_pago().toString().trim()));
		element.appendChild(elementfecha_pago);

		Element elementnombre_cliente = document.createElement(ComisionVentaCobroConstantesFunciones.NOMBRECLIENTE);
		elementnombre_cliente.appendChild(document.createTextNode(comisionventacobro.getnombre_cliente().trim()));
		element.appendChild(elementnombre_cliente);

		Element elementnumero_comprobante = document.createElement(ComisionVentaCobroConstantesFunciones.NUMEROCOMPROBANTE);
		elementnumero_comprobante.appendChild(document.createTextNode(comisionventacobro.getnumero_comprobante().trim()));
		element.appendChild(elementnumero_comprobante);

		Element elementestado = document.createElement(ComisionVentaCobroConstantesFunciones.ESTADO);
		elementestado.appendChild(document.createTextNode(comisionventacobro.getestado().trim()));
		element.appendChild(elementestado);

		Element elementtotal_factura = document.createElement(ComisionVentaCobroConstantesFunciones.TOTALFACTURA);
		elementtotal_factura.appendChild(document.createTextNode(comisionventacobro.gettotal_factura().toString().trim()));
		element.appendChild(elementtotal_factura);

		Element elementtotal_abono = document.createElement(ComisionVentaCobroConstantesFunciones.TOTALABONO);
		elementtotal_abono.appendChild(document.createTextNode(comisionventacobro.gettotal_abono().toString().trim()));
		element.appendChild(elementtotal_abono);

		Element elementporcentaje_comision = document.createElement(ComisionVentaCobroConstantesFunciones.PORCENTAJECOMISION);
		elementporcentaje_comision.appendChild(document.createTextNode(comisionventacobro.getporcentaje_comision().toString().trim()));
		element.appendChild(elementporcentaje_comision);

		Element elementtotal_comision_cobro = document.createElement(ComisionVentaCobroConstantesFunciones.TOTALCOMISIONCOBRO);
		elementtotal_comision_cobro.appendChild(document.createTextNode(comisionventacobro.gettotal_comision_cobro().toString().trim()));
		element.appendChild(elementtotal_comision_cobro);

		Element elementnumero_dias = document.createElement(ComisionVentaCobroConstantesFunciones.NUMERODIAS);
		elementnumero_dias.appendChild(document.createTextNode(comisionventacobro.getnumero_dias().toString().trim()));
		element.appendChild(elementnumero_dias);
	}
	
	public void generarReporteGroupGenericoComisionVentaCobrosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados=new ArrayList<ComisionVentaCobro>();
		
		comisionventacobrosSeleccionados=this.getComisionVentaCobrosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoComisionVentaCobro(comisionventacobrosSeleccionados);
		
		this.generarReporteComisionVentaCobros("Todos",comisionventacobrosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoComisionVentaCobro(ArrayList<ComisionVentaCobro> comisionventacobrosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(ComisionVentaCobro comisionventacobroAux:comisionventacobrosSeleccionados) {
				comisionventacobroAux.setsDetalleGeneralEntityReporte(comisionventacobroAux.toString());
			
				if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_IDPERIODO)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getperiodo_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_IDVENDEDOR)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getvendedor_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_IDFACTURA)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getfactura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROFACTURA)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getnumero_factura());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_FECHAPAGO)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(comisionventacobroAux.getfecha_pago()));
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NOMBRECLIENTE)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getnombre_cliente());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMEROCOMPROBANTE)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getnumero_comprobante());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_ESTADO)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getestado());
				}
				 else if(sTipoSeleccionar.equals(ComisionVentaCobroConstantesFunciones.LABEL_NUMERODIAS)) {
					existe=true;
					comisionventacobroAux.setsDescripcionGeneralEntityReporte1(comisionventacobroAux.getnumero_dias().toString());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,ComisionVentaCobroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesComisionVentaCobro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoComisionVentaCobro=true;
				this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=true;
				this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=true;
			}
			
			this.isVisibilidadCeldaModificarComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=false;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
			this.isVisibilidadCeldaModificarComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=true;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
			this.isVisibilidadCeldaModificarComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=true;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=true;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
			this.isVisibilidadCeldaModificarComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=true;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=true;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=true;
			this.isVisibilidadCeldaModificarComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=false;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=true;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=false;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
			this.isVisibilidadCeldaModificarComisionVentaCobro=true;
			this.isVisibilidadCeldaActualizarComisionVentaCobro=false;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
			this.isVisibilidadCeldaCancelarComisionVentaCobro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				} else {
					this.isVisibilidadCeldaGuardarComisionVentaCobro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(ComisionVentaCobroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoComisionVentaCobro=true;
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=true;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=true;
		} else {
			this.actualizarEstadoPanelsComisionVentaCobro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarComisionVentaCobro=false;
			//this.isVisibilidadCeldaVerFormComisionVentaCobro=false;
			this.isVisibilidadCeldaDuplicarComisionVentaCobro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!comisionventacobroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
		} else {
			this.isVisibilidadCeldaNuevoComisionVentaCobro=false;
			this.isVisibilidadCeldaGuardarCambiosComisionVentaCobro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			if(!comisionventacobroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;												
			}
			
			this.jButtonCerrarComisionVentaCobro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesComisionVentaCobro=false;
		}
		
		if(!this.permiteMantenimiento(this.comisionventacobro)) {
			this.isVisibilidadCeldaActualizarComisionVentaCobro=false;
			this.isVisibilidadCeldaEliminarComisionVentaCobro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesComisionVentaCobro() {
	}
	
	public void actualizarEstadoPanelsComisionVentaCobro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(false);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionComisionVentaCobro!=null) {
				this.jScrollPanelDatosEdicionComisionVentaCobro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosComisionVentaCobro!=null) {
				this.jScrollPanelDatosComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelPaginacionComisionVentaCobro!=null) {
				this.jPanelPaginacionComisionVentaCobro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
					this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.comisionventacobroSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasComisionVentaCobro!=null) {
				this.jTabbedPaneBusquedasComisionVentaCobro.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesComisionVentaCobro!=null) {
				this.jPanelParametrosReportesComisionVentaCobro.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;
		}
		
	}

	public void setVisibilidadBusquedasParaPeriodo(Boolean isParaPeriodo){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaPeriodoNegation=!isParaPeriodo;
		}
		
	}

	public void setVisibilidadBusquedasParaVendedor(Boolean isParaVendedor){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaVendedorNegation=!isParaVendedor;
		}
		
	}

	public void setVisibilidadBusquedasParaFactura(Boolean isParaFactura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaFacturaNegation=!isParaFactura;
		}
		
	}
	
	
	
	

	public String registrarSesionComisionVentaCobroParaBusquedaFacturas() throws Exception {
		Boolean isPaginaPopupFactura=false;

		try {

			if(comisionventacobroSessionBean==null) {
				comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
			}

			if(facturaSessionBean==null) {
				facturaSessionBean=new FacturaSessionBean();
			}

			facturaSessionBean.setsPathNavegacionActual(comisionventacobroSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+FacturaConstantesFunciones.SCLASSWEBTITULO);
			facturaSessionBean.setisPermiteRecargarInformacion(false);
			facturaSessionBean.setisPaginaPopup(true);
			isPaginaPopupFactura=facturaSessionBean.getisPaginaPopup();
			facturaSessionBean.setisPaginaPopup(false);
			facturaSessionBean.setEstaModoBusqueda(true);
			facturaSessionBean.setsFuncionBusquedaRapida("window.opener.comisionventacobroFuncionGeneral.setCombosCodigoDesdeBusquedaid_factura(TO_REPLACE);");
			facturaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeFactura(true);
			facturaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeFactura(ComisionVentaCobroConstantesFunciones.SNOMBREOPCION);
			//facturaSessionBean.setisBusquedaDesdeForeignKeySesionComisionVentaCobro(true);
			//facturaSessionBean.setlidComisionVentaCobroActual(this.idComisionVentaCobroActual);

			comisionventacobroSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyComisionVentaCobro(true);
			comisionventacobroSessionBean.setlIdComisionVentaCobroActualForeignKey(this.idComisionVentaCobroActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//ComisionVentaCobroSessionBean comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		
		if(this.comisionventacobroSessionBean==null) {
			this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		}
		
		this.comisionventacobroSessionBean.setsUltimaBusquedaComisionVentaCobro(this.getsAccionBusqueda());
		this.comisionventacobroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.comisionventacobroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			comisionventacobroSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//ComisionVentaCobroSessionBean comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		
		if(this.comisionventacobroSessionBean==null) {
			this.comisionventacobroSessionBean=new ComisionVentaCobroSessionBean();
		}
		
		if(this.comisionventacobroSessionBean.getsUltimaBusquedaComisionVentaCobro()!=null&&!this.comisionventacobroSessionBean.getsUltimaBusquedaComisionVentaCobro().equals("")) {
			this.setsAccionBusqueda(comisionventacobroSessionBean.getsUltimaBusquedaComisionVentaCobro());
			this.setiNumeroPaginacion(comisionventacobroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(comisionventacobroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(comisionventacobroSessionBean.getid_empresa());
				comisionventacobroSessionBean.setid_empresa(-1L);
			}
		}
		
		this.comisionventacobroSessionBean.setsUltimaBusquedaComisionVentaCobro("");
		this.comisionventacobroSessionBean.setiNumeroPaginacion(ComisionVentaCobroConstantesFunciones.INUMEROPAGINACION);
		this.comisionventacobroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaComisionVentaCobro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioComisionVentaCobro() {
		this.updateBorderResaltarBusquedasFormularioComisionVentaCobro();
		this.updateVisibilidadBusquedasFormularioComisionVentaCobro();
		this.updateHabilitarBusquedasFormularioComisionVentaCobro();
	}
	
	public void updateBorderResaltarBusquedasFormularioComisionVentaCobro() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasComisionVentaCobro.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioComisionVentaCobro() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasComisionVentaCobro.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioComisionVentaCobro() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasComisionVentaCobro.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaComisionVentaCobro(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarComisionVentaCobro.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioComisionVentaCobro() throws Exception {

		if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioComisionVentaCobro();
		this.updateVisibilidadResaltarControlesFormularioComisionVentaCobro();
		this.updateHabilitarResaltarControlesFormularioComisionVentaCobro();
		
	}
	
	public void updateBorderResaltarControlesFormularioComisionVentaCobro() throws Exception {
		if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.comisionventacobroConstantesFunciones.resaltaridComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltaridComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarid_empresaComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarid_empresaComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarid_ejercicioComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarid_ejercicioComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarid_periodoComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarid_periodoComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarid_vendedorComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarid_vendedorComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarid_facturaComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarid_facturaComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarnumero_facturaComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarnumero_facturaComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarfecha_pagoComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarfecha_pagoComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarnombre_clienteComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarnombre_clienteComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarnumero_comprobanteComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarnumero_comprobanteComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarestadoComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarestadoComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltartotal_facturaComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltartotal_facturaComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltartotal_abonoComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltartotal_abonoComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarporcentaje_comisionComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarporcentaje_comisionComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltartotal_comision_cobroComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltartotal_comision_cobroComisionVentaCobro);}
		if(this.comisionventacobroConstantesFunciones.resaltarnumero_diasComisionVentaCobro!=null && this.jInternalFrameDetalleFormComisionVentaCobro!=null) {this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setBorder(this.comisionventacobroConstantesFunciones.resaltarnumero_diasComisionVentaCobro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioComisionVentaCobro() throws Exception {		
		if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
	
		//this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostraridComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelidComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostraridComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_empresaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelid_empresaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_empresaComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_ejercicioComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelid_ejercicioComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_ejercicioComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_periodoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelid_periodoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_periodoComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_vendedorComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelid_vendedorComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_vendedorComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelid_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_facturaComisionVentaCobro);
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarid_facturaComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnumero_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelnumero_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnumero_facturaComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarfecha_pagoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelfecha_pagoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarfecha_pagoComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnombre_clienteComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelnombre_clienteComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnombre_clienteComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnumero_comprobanteComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelnumero_comprobanteComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnumero_comprobanteComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarestadoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelestadoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarestadoComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrartotal_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPaneltotal_facturaComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrartotal_facturaComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrartotal_abonoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPaneltotal_abonoComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrartotal_abonoComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarporcentaje_comisionComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelporcentaje_comisionComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarporcentaje_comisionComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrartotal_comision_cobroComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPaneltotal_comision_cobroComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrartotal_comision_cobroComisionVentaCobro);
		//this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnumero_diasComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jPanelnumero_diasComisionVentaCobro.setVisible(this.comisionventacobroConstantesFunciones.mostrarnumero_diasComisionVentaCobro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioComisionVentaCobro() throws Exception {
		if(this.jInternalFrameDetalleFormComisionVentaCobro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormComisionVentaCobro!=null) {
	
		this.jInternalFrameDetalleFormComisionVentaCobro.jLabelidComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activaridComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_empresaComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarid_empresaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_ejercicioComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarid_ejercicioComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_periodoComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarid_periodoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_vendedorComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarid_vendedorComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jComboBoxid_facturaComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarid_facturaComisionVentaCobro);
			this.jInternalFrameDetalleFormComisionVentaCobro.jButtonid_facturaComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarid_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_facturaComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarnumero_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jDateChooserfecha_pagoComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarfecha_pagoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextAreanombre_clienteComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarnombre_clienteComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_comprobanteComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarnumero_comprobanteComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldestadoComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarestadoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_facturaComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activartotal_facturaComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_abonoComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activartotal_abonoComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldporcentaje_comisionComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarporcentaje_comisionComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldtotal_comision_cobroComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activartotal_comision_cobroComisionVentaCobro);
		this.jInternalFrameDetalleFormComisionVentaCobro.jTextFieldnumero_diasComisionVentaCobro.setEnabled(this.comisionventacobroConstantesFunciones.activarnumero_diasComisionVentaCobro);
		}
	}
	
		
}