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

import com.bydan.erp.facturacion.util.TerminoProformaConstantesFunciones;
import com.bydan.erp.facturacion.util.TerminoProformaParameterReturnGeneral;
//import com.bydan.erp.facturacion.util.TerminoProformaParameterGeneral;
//import com.bydan.erp.facturacion.presentation.report.source.TerminoProformaBean;
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

import com.bydan.erp.seguridad.presentation.swing.jinternalframes.auxiliar.*;
import com.bydan.erp.contabilidad.presentation.swing.jinternalframes.auxiliar.*;






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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class TerminoProformaBeanSwingJInternalFrame extends TerminoProformaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(TerminoProformaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<TerminoProforma> terminoproformaValidator = new ClassValidator<TerminoProforma>(TerminoProforma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public TerminoProforma terminoproforma;	
	public TerminoProforma terminoproformaAux;
	public TerminoProforma terminoproformaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public TerminoProforma terminoproformaTotales;
	public Long idTerminoProformaActual;
	public Long iIdNuevoTerminoProforma=0L;
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

	public String sFinalQueryComboMoneda="";

	public List<Moneda> monedasForeignKey;

	public List<Moneda> getmonedasForeignKey() {
		return monedasForeignKey;
	}

	public void setmonedasForeignKey(List<Moneda> monedasForeignKey) {
		this.monedasForeignKey = monedasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Moneda monedaForeignKey;

	public Moneda getmonedaForeignKey() {
		return monedaForeignKey;
	}

	public void setmonedaForeignKey(Moneda monedaForeignKey) {
		this.monedaForeignKey = monedaForeignKey;
	}

	public String sFinalQueryComboProforma="";

	public List<Proforma> proformasForeignKey;

	public List<Proforma> getproformasForeignKey() {
		return proformasForeignKey;
	}

	public void setproformasForeignKey(List<Proforma> proformasForeignKey) {
		this.proformasForeignKey = proformasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Proforma proformaForeignKey;

	public Proforma getproformaForeignKey() {
		return proformaForeignKey;
	}

	public void setproformaForeignKey(Proforma proformaForeignKey) {
		this.proformaForeignKey = proformaForeignKey;
	}

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleTerminoProforma=false;

	public Boolean getIsTienePermisosDetalleTerminoProforma() {
		return isTienePermisosDetalleTerminoProforma;
	}

	public void setIsTienePermisosDetalleTerminoProforma(Boolean isTienePermisosDetalleTerminoProforma) {
		this.isTienePermisosDetalleTerminoProforma= isTienePermisosDetalleTerminoProforma;
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
	
	public Boolean isPermisoTodoTerminoProforma;
	public Boolean isPermisoNuevoTerminoProforma;
	public Boolean isPermisoActualizarTerminoProforma;
	public Boolean isPermisoActualizarOriginalTerminoProforma;
	public Boolean isPermisoEliminarTerminoProforma;
	public Boolean isPermisoGuardarCambiosTerminoProforma;
	public Boolean isPermisoConsultaTerminoProforma;
	public Boolean isPermisoBusquedaTerminoProforma;
	public Boolean isPermisoReporteTerminoProforma;
	public Boolean isPermisoPaginacionMedioTerminoProforma;
	public Boolean isPermisoPaginacionAltoTerminoProforma;
	public Boolean isPermisoPaginacionTodoTerminoProforma;
	public Boolean isPermisoCopiarTerminoProforma;
	public Boolean isPermisoVerFormTerminoProforma;
	public Boolean isPermisoDuplicarTerminoProforma;
	public Boolean isPermisoOrdenTerminoProforma;
	
	
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
	
	public TerminoProformaParameterReturnGeneral terminoproformaReturnGeneral;
	public TerminoProformaParameterReturnGeneral terminoproformaParameterGeneral;
	
	

	public DetalleTerminoProformaLogic detalleterminoproformaLogic=null;

	public DetalleTerminoProformaLogic getDetalleTerminoProformaLogic() {
		return detalleterminoproformaLogic;
	}

	public void setDetalleTerminoProformaLogic(DetalleTerminoProformaLogic detalleterminoproformaLogic) {
		this.detalleterminoproformaLogic = detalleterminoproformaLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoTerminoProforma=false;
	public Boolean esParaAccionDesdeFormularioTerminoProforma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected TerminoProformaSessionBeanAdditional terminoproformaSessionBeanAdditional=null;
	
	public TerminoProformaSessionBeanAdditional getTerminoProformaSessionBeanAdditional() {
		return this.terminoproformaSessionBeanAdditional;
	}
	
	public void setTerminoProformaSessionBeanAdditional(TerminoProformaSessionBeanAdditional terminoproformaSessionBeanAdditional) {
		try {
			this.terminoproformaSessionBeanAdditional=terminoproformaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected TerminoProformaBeanSwingJInternalFrameAdditional terminoproformaBeanSwingJInternalFrameAdditional=null;
	//public class TerminoProformaBeanSwingJInternalFrame
	
	public TerminoProformaBeanSwingJInternalFrameAdditional getTerminoProformaBeanSwingJInternalFrameAdditional() {
		return this.terminoproformaBeanSwingJInternalFrameAdditional;
	}
	
	public void setTerminoProformaBeanSwingJInternalFrameAdditional(TerminoProformaBeanSwingJInternalFrameAdditional terminoproformaBeanSwingJInternalFrameAdditional) {
		try {
			this.terminoproformaBeanSwingJInternalFrameAdditional=terminoproformaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public TerminoProformaLogic terminoproformaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public TerminoProforma terminoproformaBean;
	public TerminoProformaConstantesFunciones terminoproformaConstantesFunciones;
	//public TerminoProformaParameterReturnGeneral terminoproformaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public SucursalLogic sucursalLogic;
	public MonedaLogic monedaLogic;
	public ProformaLogic proformaLogic;
	
	//PARAMETROS
	
	
	//public List<TerminoProforma> terminoproformas;	
	//public List<TerminoProforma> terminoproformasEliminados;
	//public List<TerminoProforma> terminoproformasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoTerminoProforma=false;
	public Boolean isVisibilidadCeldaDuplicarTerminoProforma=true;
	public Boolean isVisibilidadCeldaCopiarTerminoProforma=true;
	public Boolean isVisibilidadCeldaVerFormTerminoProforma=true;
	public Boolean isVisibilidadCeldaOrdenTerminoProforma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
	public Boolean isVisibilidadCeldaModificarTerminoProforma=false;
	public Boolean isVisibilidadCeldaActualizarTerminoProforma=false;
	public Boolean isVisibilidadCeldaEliminarTerminoProforma=false;
	public Boolean isVisibilidadCeldaCancelarTerminoProforma=false;
	public Boolean isVisibilidadCeldaGuardarTerminoProforma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosTerminoProforma=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMoneda=false;
	public Boolean isVisibilidadFK_IdProforma=false;
	public Boolean isVisibilidadFK_IdSucursal=false;
	
	public Long getiIdNuevoTerminoProforma() {
		return this.iIdNuevoTerminoProforma;
	}

	public void setiIdNuevoTerminoProforma(Long iIdNuevoTerminoProforma) {
		this.iIdNuevoTerminoProforma = iIdNuevoTerminoProforma;
	}
	
	public Long getidTerminoProformaActual() {
		return this.idTerminoProformaActual;
	}

	public void setidTerminoProformaActual(Long idTerminoProformaActual) {
		this.idTerminoProformaActual = idTerminoProformaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public TerminoProforma getterminoproforma() {
		return this.terminoproforma;
	}

	public void setterminoproforma(TerminoProforma terminoproforma) {
		this.terminoproforma = terminoproforma;
	}
	
	public TerminoProforma getterminoproformaAux() {
		return this.terminoproformaAux;
	}

	public void setterminoproformaAux(TerminoProforma terminoproformaAux) {
		this.terminoproformaAux = terminoproformaAux;
	}				
	
	public TerminoProforma getterminoproformaAnterior() {
		return this.terminoproformaAnterior;
	}

	public void setterminoproformaAnterior(TerminoProforma terminoproformaAnterior) {
		this.terminoproformaAnterior = terminoproformaAnterior;
	}	
	
	public TerminoProforma getterminoproformaTotales() {
		return this.terminoproformaTotales;
	}

	public void setterminoproformaTotales(TerminoProforma terminoproformaTotales) {
		this.terminoproformaTotales = terminoproformaTotales;
	}	
	
	public TerminoProforma getterminoproformaBean() {
		return this.terminoproformaBean;
	}

	public void setterminoproformaBean(TerminoProforma terminoproformaBean) {
		this.terminoproformaBean = terminoproformaBean;
	}	
	
	public TerminoProformaParameterReturnGeneral getterminoproformaReturnGeneral() {
		return this.terminoproformaReturnGeneral;
	}

	public void setterminoproformaReturnGeneral(TerminoProformaParameterReturnGeneral terminoproformaReturnGeneral) {
		this.terminoproformaReturnGeneral = terminoproformaReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_monedaFK_IdMoneda=-1L;

	public Long getid_monedaFK_IdMoneda() {
		return this.id_monedaFK_IdMoneda;
	}

	public void setid_monedaFK_IdMoneda(Long id_monedaFK_IdMoneda) {
		this.id_monedaFK_IdMoneda = id_monedaFK_IdMoneda;
	}

	public Long id_proformaFK_IdProforma=-1L;

	public Long getid_proformaFK_IdProforma() {
		return this.id_proformaFK_IdProforma;
	}

	public void setid_proformaFK_IdProforma(Long id_proformaFK_IdProforma) {
		this.id_proformaFK_IdProforma = id_proformaFK_IdProforma;
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
	
	
	public TerminoProformaLogic getTerminoProformaLogic()	{		
		return terminoproformaLogic;
	}

	public void setTerminoProformaLogic(TerminoProformaLogic terminoproformaLogic) {
		this.terminoproformaLogic = terminoproformaLogic;
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
	
	public Boolean getIsEsNuevoTerminoProforma() {
		return isEsNuevoTerminoProforma;
	}

	public void setIsEsNuevoTerminoProforma(Boolean isEsNuevoTerminoProforma) {
		this.isEsNuevoTerminoProforma = isEsNuevoTerminoProforma;
	}

	public Boolean getEsParaAccionDesdeFormularioTerminoProforma() {
		return esParaAccionDesdeFormularioTerminoProforma;
	}
	
	public void setEsParaAccionDesdeFormularioTerminoProforma(Boolean esParaAccionDesdeFormularioTerminoProforma) {
		this.esParaAccionDesdeFormularioTerminoProforma = esParaAccionDesdeFormularioTerminoProforma;
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

			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			}

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(terminoproformaSessionBean.getlidEmpresaActual());
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

			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			}

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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
					sucursalLogic.getEntityWithConnection(terminoproformaSessionBean.getlidSucursalActual());
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

	public void cargarCombosMonedasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.monedasForeignKey=new ArrayList<Moneda>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MonedaLogic monedaLogic=new MonedaLogic();

			//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			}

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//monedaLogic.getMonedaDataAccess().setIsForForeingKeyData(true);

					monedaLogic.getTodosMonedasWithConnection(sFinalQuery,new Pagination());

					this.monedasForeignKey=monedaLogic.getMonedas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMoneda(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					monedaLogic.getEntityWithConnection(terminoproformaSessionBean.getlidMonedaActual());
					this.monedasForeignKey.add(monedaLogic.getMoneda());
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

	public void cargarCombosProformasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.proformasForeignKey=new ArrayList<Proforma>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ProformaLogic proformaLogic=new ProformaLogic();

			//proformaLogic.getProformaDataAccess().setIsForForeingKeyData(true);

			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			}

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionProforma()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//proformaLogic.getProformaDataAccess().setIsForForeingKeyData(true);

					proformaLogic.getTodosProformasWithConnection(sFinalQuery,new Pagination());

					this.proformasForeignKey=proformaLogic.getProformas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaProforma(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					proformaLogic.getEntityWithConnection(terminoproformaSessionBean.getlidProformaActual());
					this.proformasForeignKey.add(proformaLogic.getProforma());
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

					if(this.terminoproforma!=null) {
						this.terminoproforma.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaTerminoProforma.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaTerminoProformaGenerico)throws Exception
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
				jComboBoxid_empresaTerminoProformaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaTerminoProformaGenerico!=null && jComboBoxid_empresaTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_empresaTerminoProformaGenerico.setSelectedIndex(0);
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

					if(this.terminoproforma!=null) {
						this.terminoproforma.setSucursal(sucursalTemp);
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setSelectedItem(sucursalTemp);
					}
				} else {
					//jComboBoxid_sucursalTerminoProforma.setSelectedItem(sucursalTemp);
					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setSelectedIndex(0);
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
	public void setActualSucursalForeignKeyGenerico(Long idSucursalSeleccionado,JComboBox jComboBoxid_sucursalTerminoProformaGenerico)throws Exception
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
				jComboBoxid_sucursalTerminoProformaGenerico.setSelectedItem(sucursalTemp);
			} else {
				if(jComboBoxid_sucursalTerminoProformaGenerico!=null && jComboBoxid_sucursalTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_sucursalTerminoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMonedaForeignKey(Long idMonedaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(monedaTemp!=null) {

					if(this.terminoproforma!=null) {
						this.terminoproforma.setMoneda(monedaTemp);
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setSelectedItem(monedaTemp);
					}
				} else {
					//jComboBoxid_monedaTerminoProforma.setSelectedItem(monedaTemp);
					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setSelectedIndex(0);
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

	public String getActualMonedaForeignKeyDescripcion(Long idMonedaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}


			sDescripcion=MonedaConstantesFunciones.getMonedaDescripcion(monedaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMonedaForeignKeyGenerico(Long idMonedaSeleccionado,JComboBox jComboBoxid_monedaTerminoProformaGenerico)throws Exception
	{
		try
		{
			Moneda  monedaTemp=null;

			for(Moneda monedaAux:monedasForeignKey) {
				if(monedaAux.getId()!=null && monedaAux.getId().equals(idMonedaSeleccionado)) {
					monedaTemp=monedaAux;
					break;
				}
			}

			if(monedaTemp!=null) {
				jComboBoxid_monedaTerminoProformaGenerico.setSelectedItem(monedaTemp);
			} else {
				if(jComboBoxid_monedaTerminoProformaGenerico!=null && jComboBoxid_monedaTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_monedaTerminoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualProformaForeignKey(Long idProformaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Proforma  proformaTemp=null;

			for(Proforma proformaAux:proformasForeignKey) {
				if(proformaAux.getId()!=null && proformaAux.getId().equals(idProformaSeleccionado)) {
					proformaTemp=proformaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(proformaTemp!=null) {

					if(this.terminoproforma!=null) {
						this.terminoproforma.setProforma(proformaTemp);
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setSelectedItem(proformaTemp);
					}
				} else {
					//jComboBoxid_proformaTerminoProforma.setSelectedItem(proformaTemp);
					if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
						if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.getItemCount()>0) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdProforma") || sFormularioTipoBusqueda.equals("Todos")){
					if(proformaTemp!=null && jComboBoxid_proformaFK_IdProformaTerminoProforma!=null) {
						jComboBoxid_proformaFK_IdProformaTerminoProforma.setSelectedItem(proformaTemp);
					} else {
						if(jComboBoxid_proformaFK_IdProformaTerminoProforma!=null) {
							//jComboBoxid_proformaFK_IdProformaTerminoProforma.setSelectedItem(proformaTemp);
							if(jComboBoxid_proformaFK_IdProformaTerminoProforma.getItemCount()>0) {
								jComboBoxid_proformaFK_IdProformaTerminoProforma.setSelectedIndex(0);
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

	public String getActualProformaForeignKeyDescripcion(Long idProformaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Proforma  proformaTemp=null;

			for(Proforma proformaAux:proformasForeignKey) {
				if(proformaAux.getId()!=null && proformaAux.getId().equals(idProformaSeleccionado)) {
					proformaTemp=proformaAux;
					break;
				}
			}


			sDescripcion=ProformaConstantesFunciones.getProformaDescripcion(proformaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualProformaForeignKeyGenerico(Long idProformaSeleccionado,JComboBox jComboBoxid_proformaTerminoProformaGenerico)throws Exception
	{
		try
		{
			Proforma  proformaTemp=null;

			for(Proforma proformaAux:proformasForeignKey) {
				if(proformaAux.getId()!=null && proformaAux.getId().equals(idProformaSeleccionado)) {
					proformaTemp=proformaAux;
					break;
				}
			}

			if(proformaTemp!=null) {
				jComboBoxid_proformaTerminoProformaGenerico.setSelectedItem(proformaTemp);
			} else {
				if(jComboBoxid_proformaTerminoProformaGenerico!=null && jComboBoxid_proformaTerminoProformaGenerico.getItemCount()>0) {
					jComboBoxid_proformaTerminoProformaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(TerminoProforma terminoproforma,JComboBox jComboBoxid_empresaTerminoProformaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaTerminoProformaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaTerminoProformaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				terminoproforma.setid_empresa(empresaAux.getId());
				terminoproforma.setempresa_descripcion(TerminoProformaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				terminoproforma.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarSucursalForeignKey(TerminoProforma terminoproforma,JComboBox jComboBoxid_sucursalTerminoProformaGenerico)throws Exception
	{
		try
		{
			Sucursal  sucursalAux=new Sucursal();

			if(jComboBoxid_sucursalTerminoProformaGenerico==null) {
				sucursalAux=(Sucursal)this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.getSelectedItem();
			} else {
				sucursalAux=(Sucursal)jComboBoxid_sucursalTerminoProformaGenerico.getSelectedItem();
			}

			if(sucursalAux!=null && sucursalAux.getId()!=null) {
				terminoproforma.setid_sucursal(sucursalAux.getId());
				terminoproforma.setsucursal_descripcion(TerminoProformaConstantesFunciones.getSucursalDescripcion(sucursalAux));
				terminoproforma.setSucursal(sucursalAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMonedaForeignKey(TerminoProforma terminoproforma,JComboBox jComboBoxid_monedaTerminoProformaGenerico)throws Exception
	{
		try
		{
			Moneda  monedaAux=new Moneda();

			if(jComboBoxid_monedaTerminoProformaGenerico==null) {
				monedaAux=(Moneda)this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.getSelectedItem();
			} else {
				monedaAux=(Moneda)jComboBoxid_monedaTerminoProformaGenerico.getSelectedItem();
			}

			if(monedaAux!=null && monedaAux.getId()!=null) {
				terminoproforma.setid_moneda(monedaAux.getId());
				terminoproforma.setmoneda_descripcion(TerminoProformaConstantesFunciones.getMonedaDescripcion(monedaAux));
				terminoproforma.setMoneda(monedaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarProformaForeignKey(TerminoProforma terminoproforma,JComboBox jComboBoxid_proformaTerminoProformaGenerico)throws Exception
	{
		try
		{
			Proforma  proformaAux=new Proforma();

			if(jComboBoxid_proformaTerminoProformaGenerico==null) {
				proformaAux=(Proforma)this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.getSelectedItem();
			} else {
				proformaAux=(Proforma)jComboBoxid_proformaTerminoProformaGenerico.getSelectedItem();
			}

			if(proformaAux!=null && proformaAux.getId()!=null) {
				terminoproforma.setid_proforma(proformaAux.getId());
				terminoproforma.setproforma_descripcion(TerminoProformaConstantesFunciones.getProformaDescripcion(proformaAux));
				terminoproforma.setProforma(proformaAux);			}
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

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
					}

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.removeAllItems();

							for(Sucursal sucursal:this.sucursalsForeignKey) {
								this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.addItem(sucursal);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
					}

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMonedasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMoneda=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.removeAllItems();

							for(Moneda moneda:this.monedasForeignKey) {
								this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.addItem(moneda);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
					}

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameProformasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingProforma=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.removeAllItems();

							for(Proforma proforma:this.proformasForeignKey) {
								this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.addItem(proforma);
							}
						}
					}

					if(this.jInternalFrameDetalleFormTerminoProforma!=null) { 
					}

					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdProforma") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_proformaFK_IdProformaTerminoProforma.removeAllItems();

							for(Proforma proforma:this.proformasForeignKey) {
								this.jComboBoxid_proformaFK_IdProformaTerminoProforma.addItem(proforma);
							}
						}

						if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setSelectedItem(sucursal);
						}
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameMonedaForeignKey(Moneda moneda,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setSelectedItem(moneda);
						}
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameProformaForeignKey(Proforma proforma,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setSelectedItem(proforma);
						}
					} else {
						if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_proformaFK_IdProformaTerminoProforma.setSelectedItem(proforma);
						} else {
							this.jComboBoxid_proformaFK_IdProformaTerminoProforma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesTerminoProforma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			TerminoProformaConstantesFunciones.refrescarForeignKeysDescripcionesTerminoProforma(this.terminoproformaLogic.getTerminoProformas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			TerminoProformaConstantesFunciones.refrescarForeignKeysDescripcionesTerminoProforma(this.terminoproformas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Sucursal.class));
		classes.add(new Classe(Moneda.class));
		classes.add(new Classe(Proforma.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//terminoproformaLogic.setTerminoProformas(this.terminoproformas);
			terminoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public TerminoProformaParameterReturnGeneral getTerminoProformaParameterGeneral() {
		return this.terminoproformaParameterGeneral;
	}
	
	public void setTerminoProformaParameterGeneral(TerminoProformaParameterReturnGeneral terminoproformaParameterGeneral) {
		this.terminoproformaParameterGeneral = terminoproformaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoTerminoProforma() {
		return isPermisoTodoTerminoProforma;
	}

	public void setIsPermisoTodoTerminoProforma(Boolean isPermisoTodoTerminoProforma) {
		this.isPermisoTodoTerminoProforma = isPermisoTodoTerminoProforma;
	}

	public Boolean getIsPermisoNuevoTerminoProforma() {
		return isPermisoNuevoTerminoProforma;
	}

	public void setIsPermisoNuevoTerminoProforma(Boolean isPermisoNuevoTerminoProforma) {
		this.isPermisoNuevoTerminoProforma = isPermisoNuevoTerminoProforma;
	}

	public Boolean getIsPermisoActualizarTerminoProforma() {
		return isPermisoActualizarTerminoProforma;
	}

	public void setIsPermisoActualizarTerminoProforma(Boolean isPermisoActualizarTerminoProforma) {
		this.isPermisoActualizarTerminoProforma = isPermisoActualizarTerminoProforma;
	}

	public Boolean getIsPermisoEliminarTerminoProforma() {
		return isPermisoEliminarTerminoProforma;
	}

	public void setIsPermisoEliminarTerminoProforma(Boolean isPermisoEliminarTerminoProforma) {
		this.isPermisoEliminarTerminoProforma = isPermisoEliminarTerminoProforma;
	}

	public Boolean getIsPermisoGuardarCambiosTerminoProforma() {
		return isPermisoGuardarCambiosTerminoProforma;
	}

	public void setIsPermisoGuardarCambiosTerminoProforma(Boolean isPermisoGuardarCambiosTerminoProforma) {
		this.isPermisoGuardarCambiosTerminoProforma = isPermisoGuardarCambiosTerminoProforma;
	}
	
	public Boolean getIsPermisoConsultaTerminoProforma() {
		return isPermisoConsultaTerminoProforma;
	}

	public void setIsPermisoConsultaTerminoProforma(Boolean isPermisoConsultaTerminoProforma) {
		this.isPermisoConsultaTerminoProforma = isPermisoConsultaTerminoProforma;
	}

	public Boolean getIsPermisoBusquedaTerminoProforma() {
		return isPermisoBusquedaTerminoProforma;
	}

	public void setIsPermisoBusquedaTerminoProforma(Boolean isPermisoBusquedaTerminoProforma) {
		this.isPermisoBusquedaTerminoProforma = isPermisoBusquedaTerminoProforma;
	}

	public Boolean getIsPermisoReporteTerminoProforma() {
		return isPermisoReporteTerminoProforma;
	}

	public void setIsPermisoReporteTerminoProforma(Boolean isPermisoReporteTerminoProforma) {
		this.isPermisoReporteTerminoProforma = isPermisoReporteTerminoProforma;
	}
	
	public Boolean getIsPermisoPaginacionMedioTerminoProforma() {
		return isPermisoPaginacionMedioTerminoProforma;
	}

	public void setIsPermisoPaginacionMedioTerminoProforma(Boolean isPermisoPaginacionMedioTerminoProforma) {
		this.isPermisoPaginacionMedioTerminoProforma = isPermisoPaginacionMedioTerminoProforma;
	}
	
	public Boolean getIsPermisoPaginacionTodoTerminoProforma() {
		return isPermisoPaginacionTodoTerminoProforma;
	}

	public void setIsPermisoPaginacionTodoTerminoProforma(Boolean isPermisoPaginacionTodoTerminoProforma) {
		this.isPermisoPaginacionTodoTerminoProforma = isPermisoPaginacionTodoTerminoProforma;
	}
	
	public Boolean getIsPermisoPaginacionAltoTerminoProforma() {
		return isPermisoPaginacionAltoTerminoProforma;
	}

	public void setIsPermisoPaginacionAltoTerminoProforma(Boolean isPermisoPaginacionAltoTerminoProforma) {
		this.isPermisoPaginacionAltoTerminoProforma = isPermisoPaginacionAltoTerminoProforma;
	}
	
	public Boolean getIsPermisoCopiarTerminoProforma() {
		return isPermisoCopiarTerminoProforma;
	}

	public void setIsPermisoCopiarTerminoProforma(Boolean isPermisoCopiarTerminoProforma) {
		this.isPermisoCopiarTerminoProforma = isPermisoCopiarTerminoProforma;
	}
	
	public Boolean getIsPermisoVerFormTerminoProforma() {
		return isPermisoVerFormTerminoProforma;
	}

	public void setIsPermisoVerFormTerminoProforma(Boolean isPermisoVerFormTerminoProforma) {
		this.isPermisoVerFormTerminoProforma = isPermisoVerFormTerminoProforma;
	}
	
	public Boolean getIsPermisoDuplicarTerminoProforma() {
		return isPermisoDuplicarTerminoProforma;
	}

	public void setIsPermisoDuplicarTerminoProforma(Boolean isPermisoDuplicarTerminoProforma) {
		this.isPermisoDuplicarTerminoProforma = isPermisoDuplicarTerminoProforma;
	}
	
	public Boolean getIsPermisoOrdenTerminoProforma() {
		return isPermisoOrdenTerminoProforma;
	}

	public void setIsPermisoOrdenTerminoProforma(Boolean isPermisoOrdenTerminoProforma) {
		this.isPermisoOrdenTerminoProforma = isPermisoOrdenTerminoProforma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoTerminoProforma() {
		return isVisibilidadCeldaNuevoTerminoProforma;
	}

	public void setIsVisibilidadCeldaNuevoTerminoProforma(Boolean isVisibilidadCeldaNuevoTerminoProforma) {
		this.isVisibilidadCeldaNuevoTerminoProforma = isVisibilidadCeldaNuevoTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarTerminoProforma() {
		return isVisibilidadCeldaDuplicarTerminoProforma;
	}

	public void setIsVisibilidadCeldaDuplicarTerminoProforma(Boolean isVisibilidadCeldaDuplicarTerminoProforma) {
		this.isVisibilidadCeldaDuplicarTerminoProforma = isVisibilidadCeldaDuplicarTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarTerminoProforma() {
		return isVisibilidadCeldaCopiarTerminoProforma;
	}

	public void setIsVisibilidadCeldaCopiarTerminoProforma(Boolean isVisibilidadCeldaCopiarTerminoProforma) {
		this.isVisibilidadCeldaCopiarTerminoProforma = isVisibilidadCeldaCopiarTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormTerminoProforma() {
		return isVisibilidadCeldaVerFormTerminoProforma;
	}

	public void setIsVisibilidadCeldaVerFormTerminoProforma(Boolean isVisibilidadCeldaVerFormTerminoProforma) {
		this.isVisibilidadCeldaVerFormTerminoProforma = isVisibilidadCeldaVerFormTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenTerminoProforma() {
		return isVisibilidadCeldaOrdenTerminoProforma;
	}

	public void setIsVisibilidadCeldaOrdenTerminoProforma(Boolean isVisibilidadCeldaOrdenTerminoProforma) {
		this.isVisibilidadCeldaOrdenTerminoProforma = isVisibilidadCeldaOrdenTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesTerminoProforma() {
		return isVisibilidadCeldaNuevoRelacionesTerminoProforma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesTerminoProforma(Boolean isVisibilidadCeldaNuevoRelacionesTerminoProforma) {
		this.isVisibilidadCeldaNuevoRelacionesTerminoProforma = isVisibilidadCeldaNuevoRelacionesTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarTerminoProforma() {
		return isVisibilidadCeldaModificarTerminoProforma;
	}

	public void setIsVisibilidadCeldaModificarTerminoProforma(Boolean isVisibilidadCeldaModificarTerminoProforma) {
		this.isVisibilidadCeldaModificarTerminoProforma = isVisibilidadCeldaModificarTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarTerminoProforma() {
		return isVisibilidadCeldaActualizarTerminoProforma;
	}

	public void setIsVisibilidadCeldaActualizarTerminoProforma(Boolean isVisibilidadCeldaActualizarTerminoProforma) {
		this.isVisibilidadCeldaActualizarTerminoProforma = isVisibilidadCeldaActualizarTerminoProforma;
	}

	public Boolean getIsVisibilidadCeldaEliminarTerminoProforma() {
		return isVisibilidadCeldaEliminarTerminoProforma;
	}

	public void setIsVisibilidadCeldaEliminarTerminoProforma(Boolean isVisibilidadCeldaEliminarTerminoProforma) {
		this.isVisibilidadCeldaEliminarTerminoProforma = isVisibilidadCeldaEliminarTerminoProforma;
	}

	public Boolean getIsVisibilidadCeldaCancelarTerminoProforma() {
		return isVisibilidadCeldaCancelarTerminoProforma;
	}

	public void setIsVisibilidadCeldaCancelarTerminoProforma(Boolean isVisibilidadCeldaCancelarTerminoProforma) {
		this.isVisibilidadCeldaCancelarTerminoProforma = isVisibilidadCeldaCancelarTerminoProforma;
	}

	public Boolean getIsVisibilidadCeldaGuardarTerminoProforma() {
		return isVisibilidadCeldaGuardarTerminoProforma;
	}

	public void setIsVisibilidadCeldaGuardarTerminoProforma(Boolean isVisibilidadCeldaGuardarTerminoProforma) {
		this.isVisibilidadCeldaGuardarTerminoProforma = isVisibilidadCeldaGuardarTerminoProforma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosTerminoProforma() {
		return isVisibilidadCeldaGuardarCambiosTerminoProforma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosTerminoProforma(Boolean isVisibilidadCeldaGuardarCambiosTerminoProforma) {
		this.isVisibilidadCeldaGuardarCambiosTerminoProforma = isVisibilidadCeldaGuardarCambiosTerminoProforma;
	}
		
	public TerminoProformaSessionBean getterminoproformaSessionBean() {
		return this.terminoproformaSessionBean;
	}
	
	public void setterminoproformaSessionBean(TerminoProformaSessionBean terminoproformaSessionBean) {
		this.terminoproformaSessionBean=terminoproformaSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdMoneda() {
		return this.isVisibilidadFK_IdMoneda;
	}

	public void setisVisibilidadFK_IdMoneda(Boolean isVisibilidadFK_IdMoneda) {
		this.isVisibilidadFK_IdMoneda=isVisibilidadFK_IdMoneda;
	}

	public Boolean getisVisibilidadFK_IdProforma() {
		return this.isVisibilidadFK_IdProforma;
	}

	public void setisVisibilidadFK_IdProforma(Boolean isVisibilidadFK_IdProforma) {
		this.isVisibilidadFK_IdProforma=isVisibilidadFK_IdProforma;
	}

	public Boolean getisVisibilidadFK_IdSucursal() {
		return this.isVisibilidadFK_IdSucursal;
	}

	public void setisVisibilidadFK_IdSucursal(Boolean isVisibilidadFK_IdSucursal) {
		this.isVisibilidadFK_IdSucursal=isVisibilidadFK_IdSucursal;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(TerminoProforma terminoproforma)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(terminoproforma,null);
				this.setActualParaGuardarSucursalForeignKey(terminoproforma,null);
				this.setActualParaGuardarMonedaForeignKey(terminoproforma,null);
				this.setActualParaGuardarProformaForeignKey(terminoproforma,null);
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
	
	public void bugActualizarReferenciaActual(TerminoProforma terminoproforma,TerminoProforma terminoproformaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalTerminoProforma(terminoproforma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		terminoproformaAux.setId(terminoproforma.getId());
		terminoproformaAux.setVersionRow(terminoproforma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessTerminoProforma();
		
			int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = terminoproformaValidator.getInvalidValues(this.terminoproforma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			terminoproformaLogic.setDatosCliente(datosCliente);
			terminoproformaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				terminoproformaAux=new  TerminoProforma();
				
				terminoproformaAux.setIsNew(true);
				terminoproformaAux.setIsChanged(true);
				
				terminoproformaAux.setTerminoProformaOriginal(this.terminoproforma);
				
				terminoproformaAux.setId(this.terminoproforma.getId());	
				terminoproformaAux.setVersionRow(this.terminoproforma.getVersionRow());	
				terminoproformaAux.setid_empresa(this.terminoproforma.getid_empresa());	
				terminoproformaAux.setid_sucursal(this.terminoproforma.getid_sucursal());	
				terminoproformaAux.setid_moneda(this.terminoproforma.getid_moneda());	
				terminoproformaAux.setid_proforma(this.terminoproforma.getid_proforma());	
				terminoproformaAux.setatencion(this.terminoproforma.getatencion());	
				terminoproformaAux.setregistro_sanitario(this.terminoproforma.getregistro_sanitario());	
				terminoproformaAux.setreferencia(this.terminoproforma.getreferencia());	
				terminoproformaAux.setdescripcion(this.terminoproforma.getdescripcion());	
				terminoproformaAux.setdescripcion2(this.terminoproforma.getdescripcion2());	
				terminoproformaAux.setmarca(this.terminoproforma.getmarca());	
				terminoproformaAux.setorigen(this.terminoproforma.getorigen());	
				terminoproformaAux.setgarantia_tecnica(this.terminoproforma.getgarantia_tecnica());	
				terminoproformaAux.setfecha_pago(this.terminoproforma.getfecha_pago());	
				terminoproformaAux.setfecha_entrega(this.terminoproforma.getfecha_entrega());	
				terminoproformaAux.setadjunto(this.terminoproforma.getadjunto());	
				terminoproformaAux.setresponsable(this.terminoproforma.getresponsable());	
				terminoproformaAux.setcargo(this.terminoproforma.getcargo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(terminoproformaAux,terminoproformaLogic.getTerminoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(terminoproformaAux,terminoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.saveTerminoProformas();//WithConnection
						//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.terminoproforma,terminoproformaAux);
					
					this.refrescarForeignKeysDescripcionesTerminoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas.addAll(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformasEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								terminoproformaLogic.saveTerminoProformaRelaciones(terminoproformaAux,this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());//WithConnection
								//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.terminoproforma,terminoproformaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas= new ArrayList<DetalleTerminoProforma>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							terminoproformaAux.setDetalleTerminoProformas(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(terminoproformaAux,terminoproformaLogic.getTerminoProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(terminoproformaAux,terminoproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.terminoproforma,terminoproformaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				terminoproformaAux=new  TerminoProforma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.terminoproformaSessionBean.getEsGuardarRelacionado() 
					|| (this.terminoproformaSessionBean.getEsGuardarRelacionado() && this.terminoproforma.getId()>=0)) {
						
					terminoproformaAux.setIsNew(false);
				}
				
				terminoproformaAux.setIsDeleted(false);
			
				terminoproformaAux.setId(this.terminoproforma.getId());	
				terminoproformaAux.setVersionRow(this.terminoproforma.getVersionRow());	
				terminoproformaAux.setid_empresa(this.terminoproforma.getid_empresa());	
				terminoproformaAux.setid_sucursal(this.terminoproforma.getid_sucursal());	
				terminoproformaAux.setid_moneda(this.terminoproforma.getid_moneda());	
				terminoproformaAux.setid_proforma(this.terminoproforma.getid_proforma());	
				terminoproformaAux.setatencion(this.terminoproforma.getatencion());	
				terminoproformaAux.setregistro_sanitario(this.terminoproforma.getregistro_sanitario());	
				terminoproformaAux.setreferencia(this.terminoproforma.getreferencia());	
				terminoproformaAux.setdescripcion(this.terminoproforma.getdescripcion());	
				terminoproformaAux.setdescripcion2(this.terminoproforma.getdescripcion2());	
				terminoproformaAux.setmarca(this.terminoproforma.getmarca());	
				terminoproformaAux.setorigen(this.terminoproforma.getorigen());	
				terminoproformaAux.setgarantia_tecnica(this.terminoproforma.getgarantia_tecnica());	
				terminoproformaAux.setfecha_pago(this.terminoproforma.getfecha_pago());	
				terminoproformaAux.setfecha_entrega(this.terminoproforma.getfecha_entrega());	
				terminoproformaAux.setadjunto(this.terminoproforma.getadjunto());	
				terminoproformaAux.setresponsable(this.terminoproforma.getresponsable());	
				terminoproformaAux.setcargo(this.terminoproforma.getcargo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(terminoproformaAux,terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(terminoproformaAux,terminoproformas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.saveTerminoProformas();//WithConnection
						//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.terminoproforma,terminoproformaAux);
					
					this.refrescarForeignKeysDescripcionesTerminoProforma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas.addAll(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformasEliminados);
						}
						//ARCHITECTURE
						
						if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								terminoproformaLogic.saveTerminoProformaRelaciones(terminoproformaAux,this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());//WithConnection
								//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.terminoproforma,terminoproformaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas= new ArrayList<DetalleTerminoProforma>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							terminoproformaAux.setDetalleTerminoProformas(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(terminoproformaAux,terminoproformaLogic.getTerminoProformas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(terminoproformaAux,terminoproformas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.terminoproforma,terminoproformaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				terminoproformaAux=new  TerminoProforma();
				
				terminoproformaAux.setIsNew(false);
				terminoproformaAux.setIsChanged(false);
				
				terminoproformaAux.setIsDeleted(true);
				
				terminoproformaAux.setId(this.terminoproforma.getId());	
				terminoproformaAux.setVersionRow(this.terminoproforma.getVersionRow());	
				terminoproformaAux.setid_empresa(this.terminoproforma.getid_empresa());	
				terminoproformaAux.setid_sucursal(this.terminoproforma.getid_sucursal());	
				terminoproformaAux.setid_moneda(this.terminoproforma.getid_moneda());	
				terminoproformaAux.setid_proforma(this.terminoproforma.getid_proforma());	
				terminoproformaAux.setatencion(this.terminoproforma.getatencion());	
				terminoproformaAux.setregistro_sanitario(this.terminoproforma.getregistro_sanitario());	
				terminoproformaAux.setreferencia(this.terminoproforma.getreferencia());	
				terminoproformaAux.setdescripcion(this.terminoproforma.getdescripcion());	
				terminoproformaAux.setdescripcion2(this.terminoproforma.getdescripcion2());	
				terminoproformaAux.setmarca(this.terminoproforma.getmarca());	
				terminoproformaAux.setorigen(this.terminoproforma.getorigen());	
				terminoproformaAux.setgarantia_tecnica(this.terminoproforma.getgarantia_tecnica());	
				terminoproformaAux.setfecha_pago(this.terminoproforma.getfecha_pago());	
				terminoproformaAux.setfecha_entrega(this.terminoproforma.getfecha_entrega());	
				terminoproformaAux.setadjunto(this.terminoproforma.getadjunto());	
				terminoproformaAux.setresponsable(this.terminoproforma.getresponsable());	
				terminoproformaAux.setcargo(this.terminoproforma.getcargo());	
				
				if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.terminoproformaAux.getId()>=0) {	
						this.terminoproformasEliminados.add(terminoproformaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(terminoproformaAux,terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(terminoproformaAux,terminoproformas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.saveTerminoProformas();//WithConnection
						//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas().addAll(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformasEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas.addAll(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformasEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								terminoproformaLogic.saveTerminoProformaRelaciones(terminoproformaAux,this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());//WithConnection
								//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.setDetalleTerminoProformas(new ArrayList<DetalleTerminoProforma>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas= new ArrayList<DetalleTerminoProforma>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.quitarFilaTotales();}
							terminoproformaAux.setDetalleTerminoProformas(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(terminoproformaAux,terminoproformaLogic.getTerminoProformas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(terminoproformaAux,terminoproformas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getTerminoProformas().addAll(this.terminoproformasEliminados);
					
					terminoproformaLogic.saveTerminoProformas();//WithConnection
					//terminoproformaLogic.getSetVersionRowTerminoProformas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesTerminoProforma();
				
				this.terminoproformasEliminados= new ArrayList<TerminoProforma>();		
			}
			
			if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Termino Proforma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.terminoproforma=terminoproformaAux;
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
      		//this.finishProcessTerminoProforma();
      	}
		
	}	
	
	public void actualizarRelaciones(TerminoProforma terminoproformaLocal) throws Exception {
		
		if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				terminoproformaLocal.setDetalleTerminoProformas(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());
			
			} else {
			
				terminoproformaLocal.setDetalleTerminoProformas(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformas);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(TerminoProforma terminoproformaLocal) throws Exception {	
		if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				terminoproformaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(SucursalDetalleFormJInternalFrame.class)) {
				SucursalBeanSwingJInternalFrame sucursalBeanSwingJInternalFrameLocal=(SucursalBeanSwingJInternalFrame) ((SucursalDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				sucursalBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoSucursal(sucursalBeanSwingJInternalFrameLocal.getsucursal(),true);
				sucursalBeanSwingJInternalFrameLocal.actualizarLista(sucursalBeanSwingJInternalFrameLocal.sucursal,this.sucursalsForeignKey);

				sucursalBeanSwingJInternalFrameLocal.actualizarRelaciones(sucursalBeanSwingJInternalFrameLocal.sucursal);

				terminoproformaLocal.setSucursal(sucursalBeanSwingJInternalFrameLocal.sucursal);

				this.addItemDefectoCombosForeignKeySucursal();
				this.cargarCombosFrameSucursalsForeignKey("Formulario");
				this.setActualSucursalForeignKey(sucursalBeanSwingJInternalFrameLocal.sucursal.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MonedaDetalleFormJInternalFrame.class)) {
				MonedaBeanSwingJInternalFrame monedaBeanSwingJInternalFrameLocal=(MonedaBeanSwingJInternalFrame) ((MonedaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				monedaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMoneda(monedaBeanSwingJInternalFrameLocal.getmoneda(),true);
				monedaBeanSwingJInternalFrameLocal.actualizarLista(monedaBeanSwingJInternalFrameLocal.moneda,this.monedasForeignKey);

				monedaBeanSwingJInternalFrameLocal.actualizarRelaciones(monedaBeanSwingJInternalFrameLocal.moneda);

				terminoproformaLocal.setMoneda(monedaBeanSwingJInternalFrameLocal.moneda);

				this.addItemDefectoCombosForeignKeyMoneda();
				this.cargarCombosFrameMonedasForeignKey("Formulario");
				this.setActualMonedaForeignKey(monedaBeanSwingJInternalFrameLocal.moneda.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ProformaDetalleFormJInternalFrame.class)) {
				ProformaBeanSwingJInternalFrame proformaBeanSwingJInternalFrameLocal=(ProformaBeanSwingJInternalFrame) ((ProformaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				proformaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoProforma(proformaBeanSwingJInternalFrameLocal.getproforma(),true);
				proformaBeanSwingJInternalFrameLocal.actualizarLista(proformaBeanSwingJInternalFrameLocal.proforma,this.proformasForeignKey);

				proformaBeanSwingJInternalFrameLocal.actualizarRelaciones(proformaBeanSwingJInternalFrameLocal.proforma);

				terminoproformaLocal.setProforma(proformaBeanSwingJInternalFrameLocal.proforma);

				this.addItemDefectoCombosForeignKeyProforma();
				this.cargarCombosFrameProformasForeignKey("Formulario");
				this.setActualProformaForeignKey(proformaBeanSwingJInternalFrameLocal.proforma.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarTerminoProformaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = terminoproformaValidator.getInvalidValues(this.terminoproforma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(TerminoProforma terminoproforma,List<TerminoProforma> terminoproformas) throws Exception {
		try	{		
			TerminoProformaConstantesFunciones.actualizarLista(terminoproforma,terminoproformas,this.terminoproformaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(TerminoProforma terminoproforma,List<TerminoProforma> terminoproformas) throws Exception {
		try	{			
			TerminoProformaConstantesFunciones.actualizarSelectedLista(terminoproforma,terminoproformas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<TerminoProforma> terminoproformasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				terminoproformasLocal=this.terminoproformaLogic.getTerminoProformas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				terminoproformasLocal=this.terminoproformas;
			}
			//ARCHITECTURE
		
			for(TerminoProforma terminoproformaLocal:terminoproformasLocal) {
				if(this.permiteMantenimiento(terminoproformaLocal) && terminoproformaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+TerminoProformaConstantesFunciones.getTerminoProformaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_empresaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.IDSUCURSAL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_sucursalTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.IDMONEDA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_monedaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.IDPROFORMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_proformaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.ATENCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelatencionTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.REGISTROSANITARIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelregistro_sanitarioTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.REFERENCIA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelreferenciaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabeldescripcionTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.DESCRIPCION2)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabeldescripcion2TerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.MARCA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelmarcaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.ORIGEN)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelorigenTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.GARANTIATECNICA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelgarantia_tecnicaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.FECHAPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelfecha_pagoTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelfecha_entregaTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.ADJUNTO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabeladjuntoTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.RESPONSABLE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelresponsableTerminoProforma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(TerminoProformaConstantesFunciones.CARGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelcargoTerminoProforma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_empresaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_sucursalTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_monedaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelid_proformaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelatencionTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelregistro_sanitarioTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelreferenciaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabeldescripcionTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabeldescripcion2TerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelmarcaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelorigenTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelgarantia_tecnicaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelfecha_pagoTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelfecha_entregaTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabeladjuntoTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelresponsableTerminoProforma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormTerminoProforma.jLabelcargoTerminoProforma,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleTerminoProforma")) {
			if(this.terminoproforma==null) {
				this.terminoproforma= new TerminoProforma();
			}

			if(this.terminoproformaSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoTerminoProforma
				this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);

				this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.getdetalleterminoproforma().setTerminoProforma(this.terminoproforma);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoTerminoProforma--;	
		
		
		this.terminoproformaAux=new TerminoProforma();
		
		this.terminoproformaAux.setId(this.iIdNuevoTerminoProforma);
		this.terminoproformaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.terminoproformaLogic.getTerminoProformas().add(this.terminoproformaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.terminoproformas.add(this.terminoproformaAux);
		}
		//ARCHITECTURE
		
		this.terminoproforma=this.terminoproformaAux;
		
		if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioTerminoProforma(this.terminoproforma);
			this.setVariablesObjetoActualToFormularioForeignKeyTerminoProforma(this.terminoproforma);
		}
				
		//this.setDefaultControlesTerminoProforma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyTerminoProforma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyTerminoProforma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyTerminoProforma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTerminoProforma(this.terminoproformaBean,this.terminoproforma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(TerminoProformaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
			classes=TerminoProformaConstantesFunciones.getClassesRelationshipsOfTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.terminoproformaReturnGeneral=terminoproformaLogic.procesarEventosTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.terminoproformaLogic.getTerminoProformas(),this.terminoproforma,this.terminoproformaParameterGeneral,this.isEsNuevoTerminoProforma,classes);//this.terminoproformaLogic.getTerminoProforma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanTerminoProforma(this.terminoproformaReturnGeneral,this.terminoproformaBean,false);
		
		if(this.terminoproformaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma());
		}
		
		if(this.terminoproformaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma(),classes);//this.terminoproformaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyTerminoProforma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyTerminoProforma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TerminoProformaBeanSwingJInternalFrameAdditional.RecargarFormTerminoProforma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingTerminoProforma(false);
						
			if(terminoproformaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.getEsGuardarRelacionado() && DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTerminoProformaActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTerminoProforma();
			}
			
			this.actualizarVisualTableDatosTerminoProforma();
			
			this.jTableDatosTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoTerminoProforma(), this.getIndiceNuevoTerminoProforma());
			
			this.seleccionarFilaTablaTerminoProformaActual();
						
			this.actualizarEstadoCeldasBotonesTerminoProforma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesTerminoProforma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activaratencionTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarregistro_sanitarioTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarreferenciaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activardescripcionTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activardescripcion2TerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarmarcaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarorigenTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activargarantia_tecnicaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarfecha_pagoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarfecha_entregaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activaradjuntoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarresponsableTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarcargoTerminoProforma);	
		//
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarid_empresaTerminoProforma);//
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarid_sucursalTerminoProforma);//
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarid_monedaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setEnabled(isHabilitar && this.terminoproformaConstantesFunciones.activarid_proformaTerminoProforma);
	};
	
	public void setDefaultControlesTerminoProforma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoTerminoProforma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.terminoproformaSessionBean.setConGuardarRelaciones(true);			
			this.terminoproformaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.terminoproformaSessionBean.setConGuardarRelaciones(false);			
			this.terminoproformaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoTerminoProforma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
				if(terminoproformaAux.getId().equals(this.iIdNuevoTerminoProforma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TerminoProforma terminoproformaAux:this.terminoproformas) {
				if(terminoproformaAux.getId().equals(this.iIdNuevoTerminoProforma)) {
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
	
	public int getIndiceActualTerminoProforma(TerminoProforma terminoproforma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
				if(terminoproformaAux.getId().equals(terminoproforma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TerminoProforma terminoproformaAux:this.terminoproformas) {
				if(terminoproformaAux.getId().equals(terminoproforma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalTerminoProforma(TerminoProforma terminoproformaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
				if(terminoproformaAux.getTerminoProformaOriginal().getId().equals(terminoproformaOriginal.getId())) {
					existe=true;
					terminoproformaOriginal.setId(terminoproformaAux.getId());
					terminoproformaOriginal.setVersionRow(terminoproformaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TerminoProforma terminoproformaAux:this.terminoproformas) {
				if(terminoproformaAux.getTerminoProformaOriginal().getId().equals(terminoproformaOriginal.getId())) {
					existe=true;
					terminoproformaOriginal.setId(terminoproformaAux.getId());
					terminoproformaOriginal.setVersionRow(terminoproformaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosTerminoProforma(Boolean esParaCancelar) throws Exception {
		terminoproformasAux=new ArrayList<TerminoProforma>();
		terminoproformaAux=new TerminoProforma();
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
					if(terminoproformaAux.getId()<0) {
						terminoproformasAux.add(terminoproformaAux);
					}		
				}
				this.iIdNuevoTerminoProforma=0L;
				this.terminoproformaLogic.getTerminoProformas().removeAll(terminoproformasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TerminoProforma terminoproformaAux:this.terminoproformas) {
					if(terminoproformaAux.getId()<0) {
						terminoproformasAux.add(terminoproformaAux);
					}		
				}
				this.iIdNuevoTerminoProforma=0L;
				this.terminoproformas.removeAll(terminoproformasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoTerminoProforma 
					&& this.terminoproformaLogic.getTerminoProformas().size()>0
					) {
					terminoproformaAux=this.terminoproformaLogic.getTerminoProformas().get(this.terminoproformaLogic.getTerminoProformas().size() - 1);
				
					if(terminoproformaAux.getId()<0) {
						this.terminoproformaLogic.getTerminoProformas().remove(terminoproformaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoTerminoProforma && this.terminoproformas.size()>0) {
					terminoproformaAux=this.terminoproformas.get(this.terminoproformas.size() - 1);
				
					if(terminoproformaAux.getId()<0) {
						this.terminoproformas.remove(terminoproformaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoTerminoProforma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(terminoproforma.getId()<0) {
				this.terminoproformaLogic.getTerminoProformas().remove(this.terminoproforma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(terminoproforma.getId()<0) {
				this.terminoproformas.remove(this.terminoproforma);
			}
		}			
	}
	
	public void setEstadosInicialesTerminoProforma(List<TerminoProforma> terminoproformasAux) throws Exception {
		TerminoProformaConstantesFunciones.setEstadosInicialesTerminoProforma(terminoproformasAux);
	}
	
	public void setEstadosInicialesTerminoProforma(TerminoProforma terminoproformaAux) throws Exception {
		TerminoProformaConstantesFunciones.setEstadosInicialesTerminoProforma(terminoproformaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarTerminoProformaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarTerminoProformaActual()) {
				if(!this.isEsNuevoTerminoProforma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoTerminoProforma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarTerminoProformaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Termino Proforma ?", "MANTENIMIENTO DE Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(TerminoProforma terminoproforma) throws Exception {
		TerminoProformaConstantesFunciones.seleccionarAsignar(this.terminoproforma,terminoproforma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarTerminoProforma=this.isPermisoActualizarOriginalTerminoProforma;
			
			
			this.seleccionarAsignar(terminoproforma);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			TerminoProformaConstantesFunciones.quitarEspaciosTerminoProforma(this.terminoproforma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesTerminoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.terminoproformaSessionBean.setsFuncionBusquedaRapida(this.terminoproformaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoTerminoProforma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosTerminoProforma(esParaCancelar);				
				this.cancelarNuevoTerminoProforma(esParaCancelar);								
			}
			
			this.terminoproforma=new TerminoProforma();
			
			this.inicializarTerminoProforma();
			
			this.actualizarEstadoCeldasBotonesTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarTerminoProforma() throws Exception {
		try {
			TerminoProformaConstantesFunciones.inicializarTerminoProforma(this.terminoproforma);
			
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
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.terminoproformaLogic.getTerminoProformas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteTerminoProformas(String sAccionBusqueda,List<TerminoProforma> terminoproformasParaReportes) throws Exception {
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
					sPathReporteFinal="TerminoProforma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="TerminoProformaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("TerminoProformaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="TerminoProforma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Termino Proformas");		
		parameters.put("busquedapor", TerminoProformaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleTerminoProforma.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					TerminoProformaLogic terminoproformaLogicAuxiliar=new TerminoProformaLogic();
					terminoproformaLogicAuxiliar.setDatosCliente(terminoproformaLogic.getDatosCliente());				
					terminoproformaLogicAuxiliar.setTerminoProformas(terminoproformasParaReportes);
					
					terminoproformaLogicAuxiliar.cargarRelacionesLoteForeignKeyTerminoProformaWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					terminoproformasParaReportes=terminoproformaLogicAuxiliar.getTerminoProformas();
					
					//terminoproformaLogic.getNewConnexionToDeep();
					
					//for (TerminoProforma terminoproforma:terminoproformasParaReportes) {
					//	terminoproformaLogic.deepLoad(terminoproforma, false, DeepLoadType.INCLUDE, classes);
					//}						
					//terminoproformaLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//terminoproformaLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleTerminoProforma = AuxiliarReportes.class.getResourceAsStream("DetalleTerminoProformaDetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleterminoproforma", reportFileDetalleTerminoProforma);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceTerminoProforma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			TerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			TerminoProformaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceTerminoProforma=new JRBeanArrayDataSource(TerminoProformaJInternalFrame.TraerTerminoProformaBeans(terminoproformasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceTerminoProforma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+TerminoProformaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+TerminoProformaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(TerminoProformaBean.TraerTerminoProformaBeans(terminoproformasParaReportes).toArray()));
							
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
				this.generarExcelReporteTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,terminoproformasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,terminoproformasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoTerminoProformaActionPerformed(null);
					//this.generarExcelReporteTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,terminoproformasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,terminoproformasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,terminoproformasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesTerminoProformas(sAccionBusqueda,sTipoArchivoReporte,terminoproformasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteTerminoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<TerminoProforma> terminoproformasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TerminoProformas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTerminoProforma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(TerminoProforma terminoproforma : terminoproformasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			TerminoProformaConstantesFunciones.generarExcelReporteDataTerminoProforma("NORMAL",row,workbook,terminoproforma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderTerminoProforma(String sTipo,Row row,Workbook workbook) {
		
		TerminoProformaConstantesFunciones.generarExcelReporteHeaderTerminoProforma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalTerminoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<TerminoProforma> terminoproformasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TerminoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(TerminoProforma terminoproforma : terminoproformasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(TerminoProformaConstantesFunciones.getTerminoProformaDescripcion(terminoproforma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getsucursal_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_IDMONEDA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDMONEDA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getmoneda_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_IDPROFORMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDPROFORMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getproforma_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_ATENCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ATENCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getatencion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getregistro_sanitario());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_REFERENCIA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_REFERENCIA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getreferencia());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getdescripcion2());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_MARCA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_MARCA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getmarca());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_ORIGEN))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ORIGEN);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getorigen());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getgarantia_tecnica());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getfecha_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_ADJUNTO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ADJUNTO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getadjunto());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getresponsable());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(TerminoProformaConstantesFunciones.LABEL_CARGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_CARGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(terminoproforma.getcargo());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesTerminoProformas(String sAccionBusqueda,String sTipoArchivoReporte,List<TerminoProforma> terminoproformasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<TerminoProforma> terminoproformasRespaldo=null;
		
		classes=TerminoProformaConstantesFunciones.getClassesRelationshipsOfTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.terminoproformaLogic.setDatosCliente(this.datosCliente);
		this.terminoproformaLogic.setDatosDeep(this.datosDeep);
		this.terminoproformaLogic.setIsConDeep(true);
		
		terminoproformasRespaldo=this.terminoproformaLogic.getTerminoProformas();
		
		this.terminoproformaLogic.setTerminoProformas(terminoproformasParaReportes);	
		this.terminoproformaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		terminoproformasParaReportes=this.terminoproformaLogic.getTerminoProformas();
		this.terminoproformaLogic.setTerminoProformas(terminoproformasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("TerminoProformas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderTerminoProforma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(TerminoProforma terminoproforma : terminoproformasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderTerminoProforma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			TerminoProformaConstantesFunciones.generarExcelReporteDataTerminoProforma("NORMAL",row,workbook,terminoproforma,cellStyleDataAux);
		
			
			


				//DetalleTerminoProforma
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO))) {

				if(terminoproforma.getDetalleTerminoProformas()!=null && terminoproforma.getDetalleTerminoProformas().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleTerminoProformaConstantesFunciones.generarExcelReporteHeaderDetalleTerminoProforma("RELACIONADO",row,workbook);
				}

				if(terminoproforma.getDetalleTerminoProformas()!=null) {
					i2=0;
					for(DetalleTerminoProforma detalleterminoproforma : terminoproforma.getDetalleTerminoProformas()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleTerminoProformaConstantesFunciones.generarExcelReporteDataDetalleTerminoProforma("RELACIONADO",row,workbook,detalleterminoproforma,cellStyleDataAuxHijo);
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
		cell.setCellValue(TerminoProformaConstantesFunciones.getTerminoProformaDescripcion(terminoproforma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoTerminoProforma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessTerminoProforma() throws Exception {		
		this.startProcessTerminoProforma(true);
	}
	
	public void startProcessTerminoProforma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasTerminoProforma ,this.jPanelParametrosReportesTerminoProforma, this.jScrollPanelDatosTerminoProforma,this.jPanelPaginacionTerminoProforma, this.jScrollPanelDatosEdicionTerminoProforma, this.jPanelAccionesTerminoProforma,this.jPanelAccionesFormularioTerminoProforma,this.jmenuBarTerminoProforma,this.jmenuBarDetalleTerminoProforma,this.jTtoolBarTerminoProforma,this.jTtoolBarDetalleTerminoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasTerminoProforma=this.jTabbedPaneBusquedasTerminoProforma; 
		
		final JPanel jPanelParametrosReportesTerminoProforma=this.jPanelParametrosReportesTerminoProforma;
		//final JScrollPane jScrollPanelDatosTerminoProforma=this.jScrollPanelDatosTerminoProforma;
		final JTable jTableDatosTerminoProforma=this.jTableDatosTerminoProforma;		
		final JPanel jPanelPaginacionTerminoProforma=this.jPanelPaginacionTerminoProforma;
		//final JScrollPane jScrollPanelDatosEdicionTerminoProforma=this.jScrollPanelDatosEdicionTerminoProforma;
		final JPanel jPanelAccionesTerminoProforma=this.jPanelAccionesTerminoProforma;
		
		JPanel jPanelCamposAuxiliarTerminoProforma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarTerminoProforma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			jPanelCamposAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jPanelCamposTerminoProforma;
			jPanelAccionesFormularioAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jPanelAccionesFormularioTerminoProforma;
		}
		
		final JPanel jPanelCamposTerminoProforma=jPanelCamposAuxiliarTerminoProforma;
		final JPanel jPanelAccionesFormularioTerminoProforma=jPanelAccionesFormularioAuxiliarTerminoProforma;
		
		
		final JMenuBar jmenuBarTerminoProforma=this.jmenuBarTerminoProforma;
		final JToolBar jTtoolBarTerminoProforma=this.jTtoolBarTerminoProforma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarTerminoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTerminoProforma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			jmenuBarDetalleAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jmenuBarDetalleTerminoProforma;
			jTtoolBarDetalleAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jTtoolBarDetalleTerminoProforma;
		}
		
		final JMenuBar jmenuBarDetalleTerminoProforma=jmenuBarDetalleAuxiliarTerminoProforma;
		final JToolBar jTtoolBarDetalleTerminoProforma=jTtoolBarDetalleAuxiliarTerminoProforma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTerminoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTerminoProforma;
			processRunnable.jTableDatos=jTableDatosTerminoProforma;
			processRunnable.jPanelCampos=jPanelCamposTerminoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionTerminoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesTerminoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTerminoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarTerminoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTerminoProforma;
			processRunnable.jTtoolBar=jTtoolBarTerminoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTerminoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTerminoProforma ,jPanelParametrosReportesTerminoProforma,jTableDatosTerminoProforma, /*jScrollPanelDatosTerminoProforma,*/jPanelCamposTerminoProforma,jPanelPaginacionTerminoProforma, /*jScrollPanelDatosEdicionTerminoProforma,*/ jPanelAccionesTerminoProforma,jPanelAccionesFormularioTerminoProforma,jmenuBarTerminoProforma,jmenuBarDetalleTerminoProforma,jTtoolBarTerminoProforma,jTtoolBarDetalleTerminoProforma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasTerminoProforma ,jPanelParametrosReportesTerminoProforma, jScrollPanelDatosTerminoProforma,jPanelPaginacionTerminoProforma, jScrollPanelDatosEdicionTerminoProforma, jPanelAccionesTerminoProforma,jPanelAccionesFormularioTerminoProforma,jmenuBarTerminoProforma,jmenuBarDetalleTerminoProforma,jTtoolBarTerminoProforma,jTtoolBarDetalleTerminoProforma);
						
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
	
	public void finishProcessTerminoProforma() {// throws Exception 
		this.finishProcessTerminoProforma(true);
	}
	
	public void finishProcessTerminoProforma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasTerminoProforma ,this.jPanelParametrosReportesTerminoProforma, this.jScrollPanelDatosTerminoProforma,this.jPanelPaginacionTerminoProforma, this.jScrollPanelDatosEdicionTerminoProforma, this.jPanelAccionesTerminoProforma,this.jPanelAccionesFormularioTerminoProforma,this.jmenuBarTerminoProforma,this.jmenuBarDetalleTerminoProforma,this.jTtoolBarTerminoProforma,this.jTtoolBarDetalleTerminoProforma);		
		
		final JTabbedPane jTabbedPaneBusquedasTerminoProforma=this.jTabbedPaneBusquedasTerminoProforma; 
		
		final JPanel jPanelParametrosReportesTerminoProforma=this.jPanelParametrosReportesTerminoProforma;
		//final JScrollPane jScrollPanelDatosTerminoProforma=this.jScrollPanelDatosTerminoProforma;
		final JTable jTableDatosTerminoProforma=this.jTableDatosTerminoProforma;		
		final JPanel jPanelPaginacionTerminoProforma=this.jPanelPaginacionTerminoProforma;
		//final JScrollPane jScrollPanelDatosEdicionTerminoProforma=this.jScrollPanelDatosEdicionTerminoProforma;
		final JPanel jPanelAccionesTerminoProforma=this.jPanelAccionesTerminoProforma;
		
		JPanel jPanelCamposAuxiliarTerminoProforma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarTerminoProforma=new JPanel();
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			jPanelCamposAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jPanelCamposTerminoProforma;
			jPanelAccionesFormularioAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jPanelAccionesFormularioTerminoProforma;
		}
		
		final JPanel jPanelCamposTerminoProforma=jPanelCamposAuxiliarTerminoProforma;
		final JPanel jPanelAccionesFormularioTerminoProforma=jPanelAccionesFormularioAuxiliarTerminoProforma;
		
		
		final JMenuBar jmenuBarTerminoProforma=this.jmenuBarTerminoProforma;		
		final JToolBar jTtoolBarTerminoProforma=this.jTtoolBarTerminoProforma;
				
		JMenuBar jmenuBarDetalleAuxiliarTerminoProforma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarTerminoProforma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			jmenuBarDetalleAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jmenuBarDetalleTerminoProforma;
			jTtoolBarDetalleAuxiliarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jTtoolBarDetalleTerminoProforma;		
		}
		
		final JMenuBar jmenuBarDetalleTerminoProforma=jmenuBarDetalleAuxiliarTerminoProforma;
		final JToolBar jTtoolBarDetalleTerminoProforma=jTtoolBarDetalleAuxiliarTerminoProforma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasTerminoProforma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesTerminoProforma;
			processRunnable.jTableDatos=jTableDatosTerminoProforma;
			processRunnable.jPanelCampos=jPanelCamposTerminoProforma;
			processRunnable.jPanelPaginacion=jPanelPaginacionTerminoProforma;
			processRunnable.jPanelAcciones=jPanelAccionesTerminoProforma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioTerminoProforma;
			
			
			processRunnable.jmenuBar=jmenuBarTerminoProforma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleTerminoProforma;
			processRunnable.jTtoolBar=jTtoolBarTerminoProforma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleTerminoProforma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasTerminoProforma ,jPanelParametrosReportesTerminoProforma, jTableDatosTerminoProforma,/*jScrollPanelDatosTerminoProforma,*/jPanelCamposTerminoProforma,jPanelPaginacionTerminoProforma, /*jScrollPanelDatosEdicionTerminoProforma,*/ jPanelAccionesTerminoProforma,jPanelAccionesFormularioTerminoProforma,jmenuBarTerminoProforma,jmenuBarDetalleTerminoProforma,jTtoolBarTerminoProforma,jTtoolBarDetalleTerminoProforma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesTerminoProforma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarTerminoProforma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuTerminoProforma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarTerminoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarTerminoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleTerminoProforma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuTerminoProforma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarTerminoProforma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleTerminoProforma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.terminoproformaConstantesFunciones.getsFinalQueryTerminoProforma();
		String  finalQueryPaginacionTodos=this.terminoproformaConstantesFunciones.getsFinalQueryTerminoProforma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=TerminoProformaConstantesFunciones.getArrayColumnasGlobalesNoTerminoProforma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=TerminoProformaConstantesFunciones.getArrayColumnasGlobalesTerminoProforma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,TerminoProformaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.terminoproformasEliminados= new ArrayList<TerminoProforma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessTerminoProforma();
		
				///*TerminoProformaSessionBean*/this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			
			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
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
					this.iNumeroPaginacion=TerminoProformaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=TerminoProformaConstantesFunciones.getClassesForeignKeysOfTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/terminoproforma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			terminoproformasAux= new ArrayList<TerminoProforma>();
			
				
			terminoproformaLogic.setDatosCliente(this.datosCliente);
			terminoproformaLogic.setDatosDeep(this.datosDeep);
			terminoproformaLogic.setIsConDeep(true);
			
			
			terminoproformaLogic.getTerminoProformaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					terminoproformaLogic.getTodosTerminoProformas(finalQueryGlobal,pagination);
					
					//terminoproformaLogic.getTodosTerminoProformasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(terminoproformaLogic.getTerminoProformas()==null|| terminoproformaLogic.getTerminoProformas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							terminoproformasAux= new ArrayList<TerminoProforma>();
							terminoproformasAux.addAll(terminoproformaLogic.getTerminoProformas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformasAux= new ArrayList<TerminoProforma>();
							terminoproformasAux.addAll(terminoproformas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							terminoproformaLogic.getTodosTerminoProformas(finalQueryGlobal+"",this.pagination);												
							
							//terminoproformaLogic.getTodosTerminoProformasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteTerminoProformas("Todos",terminoproformaLogic.getTerminoProformas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							terminoproformaLogic.setTerminoProformas(new ArrayList<TerminoProforma>());					
							terminoproformaLogic.getTerminoProformas().addAll(terminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformas=new ArrayList<TerminoProforma>();
							terminoproformas.addAll(terminoproformasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idTerminoProforma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idTerminoProforma=this.idActual;
				
				} else if(this.idTerminoProformaActual!=null && this.idTerminoProformaActual!=0L) {
					idTerminoProforma=idTerminoProformaActual;
				}
				
					
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndicePorId(idTerminoProforma);
				
				this.terminoproformas=new ArrayList<TerminoProforma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					terminoproformaLogic.getEntity(idTerminoProforma);
					
					//terminoproformaLogic.getEntityWithConnection(idTerminoProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLogic.setTerminoProformas(new ArrayList<TerminoProforma>());
					terminoproformaLogic.getTerminoProformas().add(terminoproformaLogic.getTerminoProforma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.terminoproformas=new ArrayList<TerminoProforma>();
					this.terminoproformas.add(terminoproforma);
				}
				
				if(terminoproformaLogic.getTerminoProforma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					terminoproformaLogic.getTerminoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=terminoproformaLogic.getTerminoProformas()==null||terminoproformaLogic.getTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=terminoproformas==null|| terminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformasAux=new ArrayList<TerminoProforma>();
						terminoproformasAux.addAll(terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformasAux=new ArrayList<TerminoProforma>();
							terminoproformasAux.addAll(terminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							terminoproformaLogic.getTerminoProformasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTerminoProformas("FK_IdEmpresa",terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTerminoProformas("FK_IdEmpresa",terminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.setTerminoProformas(new ArrayList<TerminoProforma>());
						terminoproformaLogic.getTerminoProformas().addAll(terminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformas=new ArrayList<TerminoProforma>();
							terminoproformas.addAll(terminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMoneda")) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					terminoproformaLogic.getTerminoProformasFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=terminoproformaLogic.getTerminoProformas()==null||terminoproformaLogic.getTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=terminoproformas==null|| terminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformasAux=new ArrayList<TerminoProforma>();
						terminoproformasAux.addAll(terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformasAux=new ArrayList<TerminoProforma>();
							terminoproformasAux.addAll(terminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							terminoproformaLogic.getTerminoProformasFK_IdMoneda(finalQueryGlobal,pagination,id_monedaFK_IdMoneda);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdMoneda(id_monedaFK_IdMoneda);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTerminoProformas("FK_IdMoneda",terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTerminoProformas("FK_IdMoneda",terminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.setTerminoProformas(new ArrayList<TerminoProforma>());
						terminoproformaLogic.getTerminoProformas().addAll(terminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformas=new ArrayList<TerminoProforma>();
							terminoproformas.addAll(terminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdProforma")) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdProforma(id_proformaFK_IdProforma);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					terminoproformaLogic.getTerminoProformasFK_IdProforma(finalQueryGlobal,pagination,id_proformaFK_IdProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdProforma(id_proformaFK_IdProforma);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdProforma(id_proformaFK_IdProforma);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=terminoproformaLogic.getTerminoProformas()==null||terminoproformaLogic.getTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=terminoproformas==null|| terminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformasAux=new ArrayList<TerminoProforma>();
						terminoproformasAux.addAll(terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformasAux=new ArrayList<TerminoProforma>();
							terminoproformasAux.addAll(terminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							terminoproformaLogic.getTerminoProformasFK_IdProforma(finalQueryGlobal,pagination,id_proformaFK_IdProforma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdProforma(id_proformaFK_IdProforma);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdProforma(id_proformaFK_IdProforma);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTerminoProformas("FK_IdProforma",terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTerminoProformas("FK_IdProforma",terminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.setTerminoProformas(new ArrayList<TerminoProforma>());
						terminoproformaLogic.getTerminoProformas().addAll(terminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformas=new ArrayList<TerminoProforma>();
							terminoproformas.addAll(terminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdSucursal")) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					terminoproformaLogic.getTerminoProformasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=terminoproformaLogic.getTerminoProformas()==null||terminoproformaLogic.getTerminoProformas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=terminoproformas==null|| terminoproformas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformasAux=new ArrayList<TerminoProforma>();
						terminoproformasAux.addAll(terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformasAux=new ArrayList<TerminoProforma>();
							terminoproformasAux.addAll(terminoproformas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							terminoproformaLogic.getTerminoProformasFK_IdSucursal(finalQueryGlobal,pagination,id_sucursalFK_IdSucursal);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=TerminoProformaConstantesFunciones.getDetalleIndiceFK_IdSucursal(id_sucursalFK_IdSucursal);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteTerminoProformas("FK_IdSucursal",terminoproformaLogic.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteTerminoProformas("FK_IdSucursal",terminoproformas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaLogic.setTerminoProformas(new ArrayList<TerminoProforma>());
						terminoproformaLogic.getTerminoProformas().addAll(terminoproformasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformas=new ArrayList<TerminoProforma>();
							terminoproformas.addAll(terminoproformasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesTerminoProforma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessTerminoProforma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=terminoproformaLogic.getTerminoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=terminoproformas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=terminoproformaLogic.getTerminoProformas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=terminoproformas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(TerminoProforma terminoproforma) {
		Boolean permite=true;
		
		if(this.terminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=TerminoProformaConstantesFunciones.getOrderByListaTerminoProforma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=TerminoProformaConstantesFunciones.getOrderByListaTerminoProforma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TerminoProforma terminoproforma:terminoproformaLogic.getTerminoProformas()) {
				if(terminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					terminoproformaTotales=terminoproforma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TerminoProforma terminoproforma:this.terminoproformas) {
				if(terminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					terminoproformaTotales=terminoproforma;
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
			this.terminoproformaAux=new TerminoProforma();
			this.terminoproformaAux.setsType(Constantes2.S_TOTALES);
			this.terminoproformaAux.setIsNew(false);
			this.terminoproformaAux.setIsChanged(false);
			this.terminoproformaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				TerminoProformaConstantesFunciones.TotalizarValoresFilaTerminoProforma(this.terminoproformaLogic.getTerminoProformas(),this.terminoproformaAux);
				
				this.terminoproformaLogic.getTerminoProformas().add(this.terminoproformaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				TerminoProformaConstantesFunciones.TotalizarValoresFilaTerminoProforma(this.terminoproformas,this.terminoproformaAux);
				
				this.terminoproformas.add(this.terminoproformaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		terminoproformaTotales=new TerminoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.terminoproformaLogic.getTerminoProformas().remove(terminoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.terminoproformas.remove(terminoproformaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		terminoproformaTotales=new TerminoProforma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(TerminoProforma terminoproforma:terminoproformaLogic.getTerminoProformas()) {
				if(terminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					terminoproformaTotales=terminoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TerminoProformaConstantesFunciones.TotalizarValoresFilaTerminoProforma(this.terminoproformaLogic.getTerminoProformas(),terminoproformaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(TerminoProforma terminoproforma:this.terminoproformas) {
				if(terminoproforma.getsType().equals(Constantes2.S_TOTALES)) {
					terminoproformaTotales=terminoproforma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				TerminoProformaConstantesFunciones.TotalizarValoresFilaTerminoProforma(this.terminoproformas,terminoproformaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getTerminoProformasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTerminoProformasFK_IdMoneda()throws Exception {
		try {
			sAccionBusqueda="FK_IdMoneda";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTerminoProformasFK_IdProforma()throws Exception {
		try {
			sAccionBusqueda="FK_IdProforma";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getTerminoProformasFK_IdSucursal()throws Exception {
		try {
			sAccionBusqueda="FK_IdSucursal";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getTerminoProformasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLogic.getTerminoProformasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTerminoProformasFK_IdMoneda(String sFinalQuery,Long id_moneda)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLogic.getTerminoProformasFK_IdMoneda(sFinalQuery,this.pagination,id_moneda);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTerminoProformasFK_IdProforma(String sFinalQuery,Long id_proforma)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLogic.getTerminoProformasFK_IdProforma(sFinalQuery,this.pagination,id_proforma);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getTerminoProformasFK_IdSucursal(String sFinalQuery,Long id_sucursal)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLogic.getTerminoProformasFK_IdSucursal(sFinalQuery,this.pagination,id_sucursal);
				
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
	
	public void inicializarPermisosTerminoProforma() {
		this.isPermisoTodoTerminoProforma=false;
		this.isPermisoNuevoTerminoProforma=false;
		this.isPermisoActualizarTerminoProforma=false;
		this.isPermisoActualizarOriginalTerminoProforma=false;
		this.isPermisoEliminarTerminoProforma=false;
		this.isPermisoGuardarCambiosTerminoProforma=false;
		this.isPermisoConsultaTerminoProforma=false;
		this.isPermisoBusquedaTerminoProforma=false;
		this.isPermisoReporteTerminoProforma=false;		
		this.isPermisoOrdenTerminoProforma=false;		
		this.isPermisoPaginacionMedioTerminoProforma=false;		
		this.isPermisoPaginacionAltoTerminoProforma=false;
		this.isPermisoPaginacionTodoTerminoProforma=false;
		this.isPermisoCopiarTerminoProforma=false;		
		this.isPermisoVerFormTerminoProforma=false;		
		this.isPermisoDuplicarTerminoProforma=false;		
		this.isPermisoOrdenTerminoProforma=false;		
	}
	
	public void setPermisosUsuarioTerminoProforma(Boolean isPermiso) {
		this.isPermisoTodoTerminoProforma=isPermiso;
		this.isPermisoNuevoTerminoProforma=isPermiso;
		this.isPermisoActualizarTerminoProforma=isPermiso;
		this.isPermisoActualizarOriginalTerminoProforma=isPermiso;
		this.isPermisoEliminarTerminoProforma=isPermiso;
		this.isPermisoGuardarCambiosTerminoProforma=isPermiso;
		this.isPermisoConsultaTerminoProforma=isPermiso;
		this.isPermisoBusquedaTerminoProforma=isPermiso;
		this.isPermisoReporteTerminoProforma=isPermiso;
		this.isPermisoOrdenTerminoProforma=isPermiso;		
		this.isPermisoPaginacionMedioTerminoProforma=isPermiso;		
		this.isPermisoPaginacionAltoTerminoProforma=isPermiso;		
		this.isPermisoPaginacionTodoTerminoProforma=isPermiso;		
		this.isPermisoCopiarTerminoProforma=isPermiso;		
		this.isPermisoVerFormTerminoProforma=isPermiso;		
		this.isPermisoDuplicarTerminoProforma=isPermiso;
		this.isPermisoOrdenTerminoProforma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioTerminoProforma(Boolean isPermiso) {
		//this.isPermisoTodoTerminoProforma=isPermiso;
		this.isPermisoNuevoTerminoProforma=isPermiso;
		this.isPermisoActualizarTerminoProforma=isPermiso;
		this.isPermisoActualizarOriginalTerminoProforma=isPermiso;
		this.isPermisoEliminarTerminoProforma=isPermiso;
		this.isPermisoGuardarCambiosTerminoProforma=isPermiso;
		//this.isPermisoConsultaTerminoProforma=isPermiso;
		//this.isPermisoBusquedaTerminoProforma=isPermiso;
		//this.isPermisoReporteTerminoProforma=isPermiso;
		//this.isPermisoOrdenTerminoProforma=isPermiso;		
		//this.isPermisoPaginacionMedioTerminoProforma=isPermiso;		
		//this.isPermisoPaginacionAltoTerminoProforma=isPermiso;		
		//this.isPermisoPaginacionTodoTerminoProforma=isPermiso;		
		//this.isPermisoCopiarTerminoProforma=isPermiso;		
		//this.isPermisoDuplicarTerminoProforma=isPermiso;
		//this.isPermisoOrdenTerminoProforma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioTerminoProformaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleTerminoProformaConstantesFunciones.SNOMBREOPCION);
		
		if(TerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleTerminoProforma=false;
		this.isTienePermisosDetalleTerminoProforma=this.verificarGetPermisosUsuarioOpcionTerminoProformaClaseRelacionada(this.opcionsRelacionadas,DetalleTerminoProformaConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebTerminoProforma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioTerminoProformaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleTerminoProforma=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioTerminoProformaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionTerminoProformaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioTerminoProformaClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleTerminoProforma && this.jInternalFrameDetalleFormTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.remove(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioTerminoProforma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(TerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, TerminoProformaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoTerminoProforma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarTerminoProforma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalTerminoProforma=this.isPermisoActualizarTerminoProforma;
			this.isPermisoEliminarTerminoProforma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosTerminoProforma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaTerminoProforma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaTerminoProforma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoTerminoProforma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteTerminoProforma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTerminoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioTerminoProforma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoTerminoProforma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoTerminoProforma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarTerminoProforma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormTerminoProforma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarTerminoProforma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenTerminoProforma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosTerminoProforma.setToolTipText(this.jTableDatosTerminoProforma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioTerminoProforma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioTerminoProforma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(TerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(TerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioTerminoProforma() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleTerminoProforma && this.terminoproformaConstantesFunciones.mostrarDetalleTerminoProformaTerminoProforma && !TerminoProformaConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Termino Proforma");
			reporte.setsDescripcion("Detalle Termino Proforma");
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
	public void inicializarCombosForeignKeyTerminoProformaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.sucursalsForeignKey=new ArrayList();
				this.monedasForeignKey=new ArrayList();
				this.proformasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyTerminoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(TerminoProformaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyTerminoProformaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeySucursalListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMonedaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyProformaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyMonedaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MonedaConstantesFunciones.SFINALQUERY;

				this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyProformaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.proformasForeignKey==null||this.proformasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ProformaConstantesFunciones.getArrayColumnasGlobalesProforma(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProformaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ProformaConstantesFunciones.SFINALQUERY;

				this.cargarCombosProformasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyTerminoProformaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			TerminoProformaParameterReturnGeneral terminoproformaReturnGeneral=new TerminoProformaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.terminoproformaConstantesFunciones.cargarid_empresaTerminoProforma)
					 || (this.esRecargarFks && this.terminoproformaConstantesFunciones.cargarid_empresaTerminoProforma)) {

					if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+terminoproformaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalSucursal="";

				if(((this.sucursalsForeignKey==null||this.sucursalsForeignKey.size()<=0) && this.terminoproformaConstantesFunciones.cargarid_sucursalTerminoProforma)
					 || (this.esRecargarFks && this.terminoproformaConstantesFunciones.cargarid_sucursalTerminoProforma)) {

					if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=SucursalConstantesFunciones.getArrayColumnasGlobalesSucursal(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalSucursal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,SucursalConstantesFunciones.TABLENAME);

						finalQueryGlobalSucursal=Funciones.GetFinalQueryAppend(finalQueryGlobalSucursal, "");
						finalQueryGlobalSucursal+=SucursalConstantesFunciones.SFINALQUERY;

						//this.cargarCombosSucursalsForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalSucursal=" WHERE " + ConstantesSql.ID + "="+terminoproformaSessionBean.getlidSucursalActual();
					}
				} else {
					finalQueryGlobalSucursal="NONE";
				}


				String finalQueryGlobalMoneda="";

				if(((this.monedasForeignKey==null||this.monedasForeignKey.size()<=0) && this.terminoproformaConstantesFunciones.cargarid_monedaTerminoProforma)
					 || (this.esRecargarFks && this.terminoproformaConstantesFunciones.cargarid_monedaTerminoProforma)) {

					if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MonedaConstantesFunciones.getArrayColumnasGlobalesMoneda(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMoneda=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MonedaConstantesFunciones.TABLENAME);

						finalQueryGlobalMoneda=Funciones.GetFinalQueryAppend(finalQueryGlobalMoneda, "");
						finalQueryGlobalMoneda+=MonedaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMonedasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMoneda=" WHERE " + ConstantesSql.ID + "="+terminoproformaSessionBean.getlidMonedaActual();
					}
				} else {
					finalQueryGlobalMoneda="NONE";
				}


				String finalQueryGlobalProforma="";

				if(((this.proformasForeignKey==null||this.proformasForeignKey.size()<=0) && this.terminoproformaConstantesFunciones.cargarid_proformaTerminoProforma)
					 || (this.esRecargarFks && this.terminoproformaConstantesFunciones.cargarid_proformaTerminoProforma)) {

					if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionProforma()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ProformaConstantesFunciones.getArrayColumnasGlobalesProforma(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalProforma=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ProformaConstantesFunciones.TABLENAME);

						finalQueryGlobalProforma=Funciones.GetFinalQueryAppend(finalQueryGlobalProforma, "");
						finalQueryGlobalProforma+=ProformaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosProformasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalProforma=" WHERE " + ConstantesSql.ID + "="+terminoproformaSessionBean.getlidProformaActual();
					}
				} else {
					finalQueryGlobalProforma="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				terminoproformaReturnGeneral=terminoproformaLogic.cargarCombosLoteForeignKeyTerminoProforma(finalQueryGlobalEmpresa,finalQueryGlobalSucursal,finalQueryGlobalMoneda,finalQueryGlobalProforma);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=terminoproformaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalSucursal.equals("NONE")) {
				this.sucursalsForeignKey=terminoproformaReturnGeneral.getsucursalsForeignKey();
			}

			if(!finalQueryGlobalMoneda.equals("NONE")) {
				this.monedasForeignKey=terminoproformaReturnGeneral.getmonedasForeignKey();
			}

			if(!finalQueryGlobalProforma.equals("NONE")) {
				this.proformasForeignKey=terminoproformaReturnGeneral.getproformasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyTerminoProforma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeySucursal();
			this.addItemDefectoCombosForeignKeyMoneda();
			this.addItemDefectoCombosForeignKeyProforma();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			}

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionSucursal()) {
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

	public void addItemDefectoCombosForeignKeyMoneda()throws Exception {
		try {

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionMoneda()) {
				Moneda moneda=new Moneda();
				MonedaConstantesFunciones.setMonedaDescripcion(moneda,Constantes.SMENSAJE_ESCOJA_OPCION);
				moneda.setId(null);

				if(!MonedaConstantesFunciones.ExisteEnLista(this.monedasForeignKey,moneda,true)) {

					this.monedasForeignKey.add(0,moneda);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyProforma()throws Exception {
		try {

			if(!this.terminoproformaSessionBean.getisBusquedaDesdeForeignKeySesionProforma()) {
				Proforma proforma=new Proforma();
				ProformaConstantesFunciones.setProformaDescripcion(proforma,Constantes.SMENSAJE_ESCOJA_OPCION);
				proforma.setId(null);

				if(!ProformaConstantesFunciones.ExisteEnLista(this.proformasForeignKey,proforma,true)) {

					this.proformasForeignKey.add(0,proforma);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyTerminoProforma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyTerminoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyTerminoProforma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualSucursalForeignKey(this.parametroGeneralUsuario.getid_sucursal(),false,"Formulario");
				this.setActualMonedaForeignKey(this.parametroGeneralUsuario.getid_moneda(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyTerminoProforma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyTerminoProforma(TerminoProforma terminoproforma)throws Exception {	
		try {
			
			this.setActualProformaForeignKey(terminoproforma.getid_proforma(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyTerminoProforma(TerminoProforma terminoproforma,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyTerminoProforma()throws Exception {	
		try {
			
			this.setActualProformaForeignKey(this.terminoproformaConstantesFunciones.getid_proforma(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyTerminoProforma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyTerminoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyTerminoProforma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroTerminoProforma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyTerminoProforma()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameSucursalsForeignKey("Todos");
			this.cargarCombosFrameMonedasForeignKey("Todos");
			this.cargarCombosFrameProformasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyTerminoProforma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameSucursalsForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMonedasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameProformasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyTerminoProforma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.getItemCount()>0) {
				this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	








	
	

	public TerminoProformaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public TerminoProformaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public TerminoProformaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.terminoproformaSessionBean=new TerminoProformaSessionBean(); 
		this.terminoproformaConstantesFunciones=new TerminoProformaConstantesFunciones(); 
		this.terminoproformaBean=new TerminoProforma();//(this.terminoproformaConstantesFunciones); 		
		this.terminoproformaReturnGeneral=new TerminoProformaParameterReturnGeneral(); 
		
		this.terminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.terminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public TerminoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public TerminoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public TerminoProformaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessTerminoProforma(true);
			
			Boolean esParaBusquedaForeignKey=false;//ANTES USADO COMO PARAMETRO DEL CONSTRUCTOR
			
			if(paginaTipo.equals(PaginaTipo.BUSQUEDA)) {
				esParaBusquedaForeignKey=true;
			}
			
			//OBLIGA VALIDA CON GUARDAR RELACIONES, TAMBIEN EN SWING
			conGuardarRelaciones=true;
			
			
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
			
			this.terminoproformaConstantesFunciones=new TerminoProformaConstantesFunciones(); 
			this.terminoproformaBean=new TerminoProforma();//this.terminoproformaConstantesFunciones); 			
			this.terminoproformaReturnGeneral=new TerminoProformaParameterReturnGeneral(); 
		
			TerminoProformaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Termino Proforma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.terminoproforma=new TerminoProforma();
			this.terminoproformas = new ArrayList<TerminoProforma>();
			this.terminoproformasAux = new ArrayList<TerminoProforma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic=new TerminoProformaLogic();
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.terminoproformaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.terminoproformaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormTerminoProforma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTerminoProforma);	
					}
					
					if(this.jInternalFrameImportacionTerminoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTerminoProforma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByTerminoProforma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByTerminoProforma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormTerminoProforma);
				this.jInternalFrameDetalleFormTerminoProforma.setVisible(false);
				this.jInternalFrameDetalleFormTerminoProforma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTerminoProforma);
					this.jInternalFrameReporteDinamicoTerminoProforma.setVisible(false);
					this.jInternalFrameReporteDinamicoTerminoProforma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionTerminoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionTerminoProforma);
					this.jInternalFrameImportacionTerminoProforma.setVisible(false);
					this.jInternalFrameImportacionTerminoProforma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByTerminoProforma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByTerminoProforma);
					this.jInternalFrameOrderByTerminoProforma.setVisible(false);
					this.jInternalFrameOrderByTerminoProforma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idTerminoProformaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=TerminoProformaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.terminoproformaReturnGeneral=new TerminoProformaParameterReturnGeneral();
			
			this.terminoproformaParameterGeneral=new TerminoProformaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.terminoproformaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(TerminoProformaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleTerminoProformaConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TerminoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.terminoproformaSessionBean.getEsGuardarRelacionado(),this.terminoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,TerminoProformaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.terminoproformaSessionBean.getEsGuardarRelacionado(),this.terminoproformaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaDuplicarTerminoProforma=true;
			this.isVisibilidadCeldaCopiarTerminoProforma=true;
			this.isVisibilidadCeldaVerFormTerminoProforma=true;
			this.isVisibilidadCeldaOrdenTerminoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
			this.isVisibilidadCeldaModificarTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=false;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=false;
			this.isVisibilidadCeldaGuardarTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMoneda=true;
			this.isVisibilidadFK_IdProforma=true;
			this.isVisibilidadFK_IdSucursal=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosTerminoProforma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioTerminoProforma(false);
			
			this.setPermisosUsuarioTerminoProforma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.terminoproformaSessionBean.getEsGuardarRelacionado() 
				|| (this.terminoproformaSessionBean.getEsGuardarRelacionado() && this.terminoproformaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioTerminoProformaClasesRelacionadas();
			}
			
			if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioTerminoProformaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosTerminoProforma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualTerminoProforma();
			}
			
			if(!this.isPermisoBusquedaTerminoProforma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioTerminoProforma,this.isPermisoPaginacionMedioTerminoProforma,this.isPermisoPaginacionTodoTerminoProforma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(TerminoProformaConstantesFunciones.getTiposSeleccionarTerminoProforma());
				
				this.tiposColumnasSelect=TerminoProformaConstantesFunciones.getTiposSeleccionarTerminoProforma(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectTerminoProforma();				
				//this.tiposRelacionesSelect=TerminoProformaConstantesFunciones.getTiposRelacionesTerminoProforma(true);
				
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
			//if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioTerminoProforma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioTerminoProforma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioTerminoProforma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesTerminoProforma() ;
			
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
			
			
			this.detalleterminoproformaLogic=new DetalleTerminoProformaLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.sucursalLogic=new SucursalLogic();
			this.monedaLogic=new MonedaLogic();
			this.proformaLogic=new ProformaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				terminoproformaImplementable= (TerminoProformaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TerminoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				terminoproformaImplementableHome= (TerminoProformaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+TerminoProformaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.terminoproformas= new ArrayList<TerminoProforma>();
			this.terminoproformasEliminados= new ArrayList<TerminoProforma>();
						
			this.isEsNuevoTerminoProforma=false;
			this.esParaAccionDesdeFormularioTerminoProforma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.sucursalsForeignKey=new ArrayList<Sucursal>() ;
			this.monedasForeignKey=new ArrayList<Moneda>() ;
			this.proformasForeignKey=new ArrayList<Proforma>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyTerminoProforma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroTerminoProforma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			TerminoProformaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=TerminoProformaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesTerminoProforma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingTerminoProforma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioTerminoProforma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioTerminoProforma();
			}
			
			TerminoProformaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasTerminoProforma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasTerminoProforma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasTerminoProforma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessTerminoProforma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga TerminoProforma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectTerminoProforma() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesTerminoProforma")) {
				iIndex=this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Termino Proformas")) {
					if(!DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessTerminoProforma();

						this.cargarParteTabPanelRelacionadaDetalleTerminoProforma(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessTerminoProforma();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleTerminoProforma(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormTerminoProforma.cargarSessionConBeanSwingJInternalFrameDetalleTerminoProforma(false,true,iIndex);
		this.jButtonDetalleTerminoProformaActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleTerminoProforma();

		//this.jTabbedPaneRelacionesTerminoProforma.updateUI();
		//this.jTabbedPaneRelacionesTerminoProforma.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesTerminoProforma.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleTerminoProforma")) {
				int row=this.jTableDatosTerminoProforma.getSelectedRow();
				jButtonDetalleTerminoProformaActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Termino Proforma")) {

					if(this.isTienePermisosDetalleTerminoProforma && this.terminoproformaConstantesFunciones.mostrarDetalleTerminoProformaTerminoProforma && !TerminoProformaConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Termino Proformas"+"("+DetalleTerminoProformaConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Termino Proformas");

						if(terminoproformaConstantesFunciones.resaltarDetalleTerminoProformaTerminoProforma!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(terminoproformaConstantesFunciones.resaltarDetalleTerminoProformaTerminoProforma);
						}

						jmenuItem.setEnabled(this.terminoproformaConstantesFunciones.activarDetalleTerminoProformaTerminoProforma);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleTerminoProforma"));

						

						this.jInternalFrameDetalleFormTerminoProforma.jmenuDetalleTerminoProforma.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyTerminoProforma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyTerminoProforma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyTerminoProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyTerminoProformaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyTerminoProforma();
		
		this.cargarCombosFrameForeignKeyTerminoProforma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyTerminoProforma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyTerminoProforma();
		}
	}
	
	

	public void cargarCombosForeignKeyProforma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyProformaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyProforma();
				this.cargarCombosFrameProformasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaProforma(this.proformasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoTerminoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			
			if(jTableDatosTerminoProforma.getRowCount()>=1) {
				jTableDatosTerminoProforma.removeRowSelectionInterval(0, jTableDatosTerminoProforma.getRowCount()-1);						
			}
			
			this.isEsNuevoTerminoProforma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoTerminoProforma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesTerminoProforma(true);			
			//this.terminoproforma=new TerminoProforma();
			//this.terminoproforma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTerminoProforma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTerminoProforma() ;
			
			if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTerminoProforma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.terminoproforma);	
			this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);				
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar TerminoProforma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarTerminoProformaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosTerminoProforma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosTerminoProforma.getSelectedRows().length;			
			}
			
			terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoTerminoProforma--;			
				//TerminoProforma terminoproformaAux= new TerminoProforma();			
				//terminoproformaAux.setId(this.iIdNuevoTerminoProforma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//TerminoProforma terminoproformaOrigen=new TerminoProforma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(TerminoProforma terminoproformaOrigen : terminoproformasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							terminoproformaOrigen =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							terminoproformaOrigen =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaTerminoProforma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.terminoproforma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosTerminoProforma(terminoproformaOrigen,this.terminoproforma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.terminoproformaLogic.getTerminoProformas().add(this.terminoproformaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.terminoproformas.add(this.terminoproformaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaTerminoProforma(false);
				
				this.jTableDatosTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoTerminoProforma(), this.getIndiceNuevoTerminoProforma());
				
				int iLastRow =  this.jTableDatosTerminoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTerminoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTerminoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTerminoProforma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();									
		
			TerminoProforma terminoproformaOrigen=new TerminoProforma();
			TerminoProforma terminoproformaDestino=new TerminoProforma();
				
			terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosTerminoProforma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || terminoproformasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosTerminoProforma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaOrigen =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						terminoproformaOrigen =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						terminoproformaDestino =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						terminoproformaDestino =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				terminoproformaOrigen =terminoproformasSeleccionados.get(0);
				terminoproformaDestino =terminoproformasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosTerminoProforma(terminoproformaOrigen,terminoproformaDestino,true,false);
				
				terminoproformaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(terminoproformaDestino,terminoproformaLogic.getTerminoProformas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(terminoproformaDestino,terminoproformas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaTerminoProforma(false);
				
				//this.jTableDatosTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoTerminoProforma(), this.getIndiceNuevoTerminoProforma());
				
				int iLastRow =  this.jTableDatosTerminoProforma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosTerminoProforma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosTerminoProforma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaTerminoProforma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormTerminoProforma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesTerminoProforma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasTerminoProforma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesTerminoProforma.setVisible(!isVisible);
			this.jPanelPaginacionTerminoProforma.setVisible(!isVisible);
			this.jPanelAccionesTerminoProforma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameTerminoProforma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoTerminoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionTerminoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByTerminoProforma();
			
			this.abrirFrameOrderByTerminoProforma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByTerminoProforma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleTerminoProforma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormTerminoProforma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormTerminoProforma.isMaximum()) {
					this.jInternalFrameDetalleFormTerminoProforma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormTerminoProforma.setSize(this.jInternalFrameDetalleFormTerminoProforma.iWidthFormulario,this.jInternalFrameDetalleFormTerminoProforma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormTerminoProforma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormTerminoProforma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormTerminoProforma.isMaximum()) {
						this.jInternalFrameDetalleFormTerminoProforma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormTerminoProforma.jContentPaneDetalleTerminoProforma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormTerminoProforma.jContentPaneDetalleTerminoProforma.getWidth(),TerminoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormTerminoProforma.jContentPaneDetalleTerminoProforma.getWidth(),TerminoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormTerminoProforma.jContentPaneDetalleTerminoProforma.getWidth(),TerminoProformaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleTerminoProforma();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormTerminoProforma.setVisible(true);
	        this.jInternalFrameDetalleFormTerminoProforma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByTerminoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByTerminoProforma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTerminoProforma,false,this);
				} else {
					this.jInternalFrameOrderByTerminoProforma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByTerminoProforma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByTerminoProforma);
				this.jInternalFrameOrderByTerminoProforma.setVisible(false);
				this.jInternalFrameOrderByTerminoProforma.setSelected(false);
				
				this.jInternalFrameOrderByTerminoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTerminoProforma"));
				
				this.inicializarActualizarBindingTablaOrderByTerminoProforma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionTerminoProforma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionTerminoProforma==null) {
				
				this.jInternalFrameImportacionTerminoProforma=new ImportacionJInternalFrame(TerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionTerminoProforma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionTerminoProforma);
				this.jInternalFrameImportacionTerminoProforma.setVisible(false);
				this.jInternalFrameImportacionTerminoProforma.setSelected(false);


				this.jInternalFrameImportacionTerminoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTerminoProforma"));
				this.jInternalFrameImportacionTerminoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTerminoProforma"));
				this.jInternalFrameImportacionTerminoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTerminoProforma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoTerminoProforma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoTerminoProforma==null) {
				this.jInternalFrameReporteDinamicoTerminoProforma=new ReporteDinamicoJInternalFrame(TerminoProformaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoTerminoProforma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoTerminoProforma);
				this.jInternalFrameReporteDinamicoTerminoProforma.setVisible(false);
				this.jInternalFrameReporteDinamicoTerminoProforma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoTerminoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTerminoProforma"));
				this.jInternalFrameReporteDinamicoTerminoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTerminoProforma"));
				this.jInternalFrameReporteDinamicoTerminoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTerminoProforma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTerminoProforma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleTerminoProforma() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTerminoProforma.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormTerminoProforma.jContentPaneDetalleTerminoProforma.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTerminoProforma.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTerminoProforma.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTerminoProforma.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleTerminoProforma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormTerminoProforma);
			
	       	this.jInternalFrameDetalleFormTerminoProforma.setVisible(false);
	        this.jInternalFrameDetalleFormTerminoProforma.setSelected(false);
			
			//this.jInternalFrameDetalleFormTerminoProforma.dispose();
			//this.jInternalFrameDetalleFormTerminoProforma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoTerminoProforma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoTerminoProforma.setVisible(true);
	        this.jInternalFrameReporteDinamicoTerminoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionTerminoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionTerminoProforma.setVisible(true);
	        this.jInternalFrameImportacionTerminoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByTerminoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByTerminoProforma.setVisible(true);
	        this.jInternalFrameOrderByTerminoProforma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByTerminoProforma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByTerminoProforma.setVisible(false);
	        this.jInternalFrameOrderByTerminoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoTerminoProforma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoTerminoProforma.setVisible(false);
	        this.jInternalFrameReporteDinamicoTerminoProforma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionTerminoProforma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionTerminoProforma.setVisible(false);
	        this.jInternalFrameImportacionTerminoProforma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarTerminoProforma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarTerminoProforma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesTerminoProforma(true);
			//this.isEsNuevoTerminoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesTerminoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTerminoProforma(false) ;
			
			if(terminoproformaSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.getEsGuardarRelacionado() && DetalleTerminoProformaJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleTerminoProformaActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTerminoProforma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTerminoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaTerminoProformaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarTerminoProforma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesTerminoProforma(true);
			//this.isEsNuevoTerminoProforma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.terminoproforma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesTerminoProforma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesTerminoProforma(false) ;
			
			if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleTerminoProforma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTerminoProforma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
				
	
	public void recargarComboTablaProforma(List<Proforma> proformasForeignKey)throws Exception{
		TableColumn tableColumnProforma=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_IDPROFORMA));
		TableCellEditor tableCellEditorProforma =tableColumnProforma.getCellEditor();

		ProformaTableCell proformaTableCellFk=(ProformaTableCell)tableCellEditorProforma;

		if(proformaTableCellFk!=null) {
			proformaTableCellFk.setproformasForeignKey(proformasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosTerminoProforma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//proformaTableCellFk.setRowActual(intSelectedRow);
			//proformaTableCellFk.setproformasForeignKeyActual(proformasForeignKey);
		//}


		if(proformaTableCellFk!=null) {
			proformaTableCellFk.RecargarProformasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesTerminoProforma(false);
			
			//if(!this.isEsNuevoTerminoProforma) {								
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				
			}
			
			if(this.permiteMantenimiento(this.terminoproforma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoTerminoProforma=true;
					this.inicializarActualizarBindingTablaTerminoProforma(false);
					this.isEsNuevoTerminoProforma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoTerminoProforma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoTerminoProforma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTerminoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTerminoProforma(false);
				
				this.habilitarDeshabilitarControlesTerminoProforma(false);
			
												
				
				if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleTerminoProforma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoTerminoProformaActionPerformed(evt,terminoproformaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualTerminoProforma(this.terminoproforma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosTerminoProforma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,terminoproformaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.terminoproforma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				this.terminoproforma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				this.terminoproforma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.terminoproforma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((TerminoProformaModel) this.jTableDatosTerminoProforma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoTerminoProforma=true;
				this.inicializarActualizarBindingTablaTerminoProforma(false);
				this.isEsNuevoTerminoProforma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesTerminoProforma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTerminoProforma(false);
				
				this.habilitarDeshabilitarControlesTerminoProforma(false);
				
				
				
				if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleTerminoProforma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarTerminoProformaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosTerminoProforma.getRowCount()>=1) {
				jTableDatosTerminoProforma.removeRowSelectionInterval(0, jTableDatosTerminoProforma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesTerminoProforma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaTerminoProforma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesTerminoProforma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualTerminoProforma(false) ;
			
			this.isEsNuevoTerminoProforma=false;
			
			if(TerminoProformaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleTerminoProforma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingTerminoProforma(false);
				
				//SI ES MANUAL
				if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualTerminoProforma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoTerminoProforma--;			
			//TerminoProforma terminoproformaAux= new TerminoProforma();			
			//terminoproformaAux.setId(this.iIdNuevoTerminoProforma);
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaTerminoProforma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
			
			this.terminoproforma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.terminoproformaLogic.getTerminoProformas().add(this.terminoproformaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.terminoproformas.add(this.terminoproformaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaTerminoProforma(false);
			
			this.jTableDatosTerminoProforma.setRowSelectionInterval(this.getIndiceNuevoTerminoProforma(), this.getIndiceNuevoTerminoProforma());
			
			int iLastRow =  this.jTableDatosTerminoProforma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosTerminoProforma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosTerminoProforma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaTerminoProforma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingTerminoProforma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTerminoProforma(false);
			
			//SI ES MANUAL
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTerminoProforma();
			}
			
			//this.abrirFrameTreeTerminoProforma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Termino ProformaS ?", "MANTENIMIENTO DE Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionTerminoProforma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralTerminoProforma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.terminoproformaReturnGeneral=terminoproformaLogic.procesarImportacionTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.terminoproformaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarTerminoProformaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionTerminoProforma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionTerminoProforma.setFileImportacion(this.jInternalFrameImportacionTerminoProforma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionTerminoProforma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionTerminoProforma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionTerminoProforma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionTerminoProforma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		

		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("TerminoProformaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"TerminoProformaBaseDesign.jrxml";
			
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
			
			this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Sucursal_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Sucursal_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Sucursal_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Sucursal_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_IDMONEDA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Moneda_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Moneda_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Moneda_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Moneda_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_IDPROFORMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Proforma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Proforma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Proforma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Proforma_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_ATENCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_encion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_encion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_encion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_encion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gistroSanitario_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gistroSanitario_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gistroSanitario_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gistroSanitario_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_REFERENCIA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ferencia_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ferencia_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ferencia_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ferencia_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion2_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion2_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion2_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion2_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_MARCA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rca_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rca_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rca_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rca_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_ORIGEN:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_igen_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_igen_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_igen_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_igen_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rantiaTecnica_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rantiaTecnica_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rantiaTecnica_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rantiaTecnica_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAPAGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_ADJUNTO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_junto_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_junto_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_junto_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_junto_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_RESPONSABLE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_sponsable_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_sponsable_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_sponsable_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_sponsable_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case TerminoProformaConstantesFunciones.LABEL_CARGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rgo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rgo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rgo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rgo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoTerminoProforma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case TerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoria="id_sucursal";
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoria="id_moneda";
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDPROFORMA:
					sNombreCampoCategoria="id_proforma";
					break;

				case TerminoProformaConstantesFunciones.LABEL_ATENCION:
					sNombreCampoCategoria="atencion";
					break;

				case TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO:
					sNombreCampoCategoria="registro_sanitario";
					break;

				case TerminoProformaConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoria="referencia";
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoria="descripcion2";
					break;

				case TerminoProformaConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoria="marca";
					break;

				case TerminoProformaConstantesFunciones.LABEL_ORIGEN:
					sNombreCampoCategoria="origen";
					break;

				case TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA:
					sNombreCampoCategoria="garantia_tecnica";
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoria="fecha_pago";
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case TerminoProformaConstantesFunciones.LABEL_ADJUNTO:
					sNombreCampoCategoria="adjunto";
					break;

				case TerminoProformaConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoria="responsable";
					break;

				case TerminoProformaConstantesFunciones.LABEL_CARGO:
					sNombreCampoCategoria="cargo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case TerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					sNombreCampoCategoriaValor="id_sucursal";
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDMONEDA:
					sNombreCampoCategoriaValor="id_moneda";
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDPROFORMA:
					sNombreCampoCategoriaValor="id_proforma";
					break;

				case TerminoProformaConstantesFunciones.LABEL_ATENCION:
					sNombreCampoCategoriaValor="atencion";
					break;

				case TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO:
					sNombreCampoCategoriaValor="registro_sanitario";
					break;

				case TerminoProformaConstantesFunciones.LABEL_REFERENCIA:
					sNombreCampoCategoriaValor="referencia";
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2:
					sNombreCampoCategoriaValor="descripcion2";
					break;

				case TerminoProformaConstantesFunciones.LABEL_MARCA:
					sNombreCampoCategoriaValor="marca";
					break;

				case TerminoProformaConstantesFunciones.LABEL_ORIGEN:
					sNombreCampoCategoriaValor="origen";
					break;

				case TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA:
					sNombreCampoCategoriaValor="garantia_tecnica";
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAPAGO:
					sNombreCampoCategoriaValor="fecha_pago";
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case TerminoProformaConstantesFunciones.LABEL_ADJUNTO:
					sNombreCampoCategoriaValor="adjunto";
					break;

				case TerminoProformaConstantesFunciones.LABEL_RESPONSABLE:
					sNombreCampoCategoriaValor="responsable";
					break;

				case TerminoProformaConstantesFunciones.LABEL_CARGO:
					sNombreCampoCategoriaValor="cargo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case TerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Sucursal",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_sucursal");
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDMONEDA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Moneda",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_moneda");
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDPROFORMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Proforma",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_proforma");
					break;

				case TerminoProformaConstantesFunciones.LABEL_ATENCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Atencion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"atencion");
					break;

				case TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Registro Sanitario",sNombreCampoCategoria,sNombreCampoCategoriaValor,"registro_sanitario");
					break;

				case TerminoProformaConstantesFunciones.LABEL_REFERENCIA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Referencia",sNombreCampoCategoria,sNombreCampoCategoriaValor,"referencia");
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion2",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion2");
					break;

				case TerminoProformaConstantesFunciones.LABEL_MARCA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Marca",sNombreCampoCategoria,sNombreCampoCategoriaValor,"marca");
					break;

				case TerminoProformaConstantesFunciones.LABEL_ORIGEN:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Origen",sNombreCampoCategoria,sNombreCampoCategoriaValor,"origen");
					break;

				case TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Garantia Tecnica",sNombreCampoCategoria,sNombreCampoCategoriaValor,"garantia_tecnica");
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_pago");
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case TerminoProformaConstantesFunciones.LABEL_ADJUNTO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Adjunto",sNombreCampoCategoria,sNombreCampoCategoriaValor,"adjunto");
					break;

				case TerminoProformaConstantesFunciones.LABEL_RESPONSABLE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Responsable",sNombreCampoCategoria,sNombreCampoCategoriaValor,"responsable");
					break;

				case TerminoProformaConstantesFunciones.LABEL_CARGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cargo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cargo");
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
	
	public void jButtonGenerarExcelReporteDinamicoTerminoProformaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("TerminoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case TerminoProformaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getsucursal_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDMONEDA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDMONEDA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getmoneda_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_IDPROFORMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDPROFORMA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getproforma_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_ATENCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ATENCION);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getatencion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getregistro_sanitario());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_REFERENCIA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_REFERENCIA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getreferencia());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getdescripcion2());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_MARCA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_MARCA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getmarca());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_ORIGEN:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ORIGEN);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getorigen());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getgarantia_tecnica());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getfecha_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_ADJUNTO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ADJUNTO);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getadjunto());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_RESPONSABLE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getresponsable());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case TerminoProformaConstantesFunciones.LABEL_CARGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_CARGO);
					iRow++;

					for(TerminoProforma terminoproforma:terminoproformasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(terminoproforma.getcargo());
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
			//	this.getFilaCabeceraExportarExcelTerminoProforma(row);				
			//	iRow++;
			//}				
			
			//for(TerminoProforma terminoproformaAux:terminoproformasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelTerminoProforma(terminoproformaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
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
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTerminoProforma(false);
			
			//SI ES MANUAL
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualTerminoProforma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTerminoProforma(false);
			
			//SI ES MANUAL
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTerminoProforma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesTerminoProformaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingTerminoProforma(false);
			
			//SI ES MANUAL
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualTerminoProforma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaTerminoProforma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosTerminoProforma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosTerminoProforma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosTerminoProforma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosTerminoProforma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosTerminoProforma.setMinimumSize(dimensionMinimum);
		this.jTableDatosTerminoProforma.setMaximumSize(dimensionMaximum);
		this.jTableDatosTerminoProforma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingTerminoProforma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingTerminoProforma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingTerminoProforma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaTerminoProforma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesTerminoProforma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasTerminoProforma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTerminoProforma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesTerminoProforma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualTerminoProforma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaTerminoProforma();
		
		this.inicializarActualizarBindingBotonesManualTerminoProforma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualTerminoProforma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesTerminoProforma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualTerminoProforma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualTerminoProforma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosTerminoProforma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosTerminoProforma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteTerminoProforma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormTerminoProforma.jCheckBoxPostAccionNuevoTerminoProforma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormTerminoProforma.jCheckBoxPostAccionSinCerrarTerminoProforma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormTerminoProforma.jCheckBoxPostAccionSinMensajeTerminoProforma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosTerminoProforma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosTerminoProforma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteTerminoProforma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
				this.jInternalFrameDetalleFormTerminoProforma.jCheckBoxPostAccionNuevoTerminoProforma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormTerminoProforma.jCheckBoxPostAccionSinCerrarTerminoProforma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormTerminoProforma.jCheckBoxPostAccionSinMensajeTerminoProforma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionTerminoProforma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionTerminoProforma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesTerminoProforma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesTerminoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesTerminoProforma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarTerminoProforma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesTerminoProforma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesTerminoProforma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralTerminoProforma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesTerminoProforma(Boolean esInicializar) throws Exception {
		try	{	
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualTerminoProforma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesTerminoProforma() throws Exception {
		try	{
			if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualTerminoProforma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTerminoProforma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualTerminoProforma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesTerminoProforma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesTerminoProforma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesTerminoProforma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionTerminoProforma.addItem(reporte);
			}
			
			
			if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionTerminoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionTerminoProforma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesTerminoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesTerminoProforma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarTerminoProforma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarTerminoProforma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarTerminoProforma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTerminoProforma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualTerminoProforma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
				this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
				this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoTerminoProforma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
				
				if(this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTerminoProforma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoTerminoProforma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoTerminoProforma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoTerminoProforma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualTerminoProforma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_proformaFK_IdProformaTerminoProforma.getSelectedItem()!=null){this.id_proformaFK_IdProforma=((Proforma)this.jComboBoxid_proformaFK_IdProformaTerminoProforma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasTerminoProforma(Boolean esInicializar) throws Exception {				
		if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualTerminoProforma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaTerminoProforma() throws Exception {
		this.inicializarActualizarBindingTablaTerminoProforma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByTerminoProforma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosTerminoProformaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProformaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaTerminoProforma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=terminoproformaLogic.getTerminoProformas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=terminoproformas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosTerminoProforma.setModel(new TerminoProformaModel(this.terminoproformaLogic.getTerminoProformas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosTerminoProforma.setModel(new TerminoProformaModel(this.terminoproformas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByTerminoProforma!=null && this.jInternalFrameOrderByTerminoProforma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByTerminoProforma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO,terminoproformaConstantesFunciones.resaltarSeleccionarTerminoProforma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+TerminoProformaConstantesFunciones.SCLASSWEBTITULO,terminoproformaConstantesFunciones.resaltarSeleccionarTerminoProforma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_ID));

		if(this.terminoproformaConstantesFunciones.mostraridTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.terminoproformaConstantesFunciones.resaltaridTerminoProforma,this.terminoproformaConstantesFunciones.activaridTerminoProforma,this,true,"idTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltaridTerminoProforma,this.terminoproformaConstantesFunciones.activaridTerminoProforma,this,true,"idTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.terminoproformaConstantesFunciones.mostrarid_empresaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.terminoproformaConstantesFunciones.resaltarid_empresaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_empresaTerminoProforma));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.terminoproformaConstantesFunciones.resaltarid_empresaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_empresaTerminoProforma,false,"id_empresaTerminoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL));

		if(this.terminoproformaConstantesFunciones.mostrarid_sucursalTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new SucursalTableCell(this.sucursalsForeignKey,this.terminoproformaConstantesFunciones.resaltarid_sucursalTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_sucursalTerminoProforma));
			tableColumn.setCellEditor(new SucursalTableCell(this.sucursalsForeignKey,this.terminoproformaConstantesFunciones.resaltarid_sucursalTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_sucursalTerminoProforma,false,"id_sucursalTerminoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_IDMONEDA));

		if(this.terminoproformaConstantesFunciones.mostrarid_monedaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_IDMONEDA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MonedaTableCell(this.monedasForeignKey,this.terminoproformaConstantesFunciones.resaltarid_monedaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_monedaTerminoProforma));
			tableColumn.setCellEditor(new MonedaTableCell(this.monedasForeignKey,this.terminoproformaConstantesFunciones.resaltarid_monedaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_monedaTerminoProforma,false,"id_monedaTerminoProforma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_IDPROFORMA));

		if(this.terminoproformaConstantesFunciones.mostrarid_proformaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_IDPROFORMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ProformaTableCell(this.proformasForeignKey,this.terminoproformaConstantesFunciones.resaltarid_proformaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_proformaTerminoProforma));
			tableColumn.setCellEditor(new ProformaTableCell(this.proformasForeignKey,this.terminoproformaConstantesFunciones.resaltarid_proformaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarid_proformaTerminoProforma,true,"id_proformaTerminoProforma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_ATENCION));

		if(this.terminoproformaConstantesFunciones.mostraratencionTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_ATENCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltaratencionTerminoProforma,this.terminoproformaConstantesFunciones.activaratencionTerminoProforma,this,true,"atencionTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltaratencionTerminoProforma,this.terminoproformaConstantesFunciones.activaratencionTerminoProforma,this,true,"atencionTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO));

		if(this.terminoproformaConstantesFunciones.mostrarregistro_sanitarioTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarregistro_sanitarioTerminoProforma,this.terminoproformaConstantesFunciones.activarregistro_sanitarioTerminoProforma,this,true,"registro_sanitarioTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarregistro_sanitarioTerminoProforma,this.terminoproformaConstantesFunciones.activarregistro_sanitarioTerminoProforma,this,true,"registro_sanitarioTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_REFERENCIA));

		if(this.terminoproformaConstantesFunciones.mostrarreferenciaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_REFERENCIA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarreferenciaTerminoProforma,this.terminoproformaConstantesFunciones.activarreferenciaTerminoProforma,this,true,"referenciaTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarreferenciaTerminoProforma,this.terminoproformaConstantesFunciones.activarreferenciaTerminoProforma,this,true,"referenciaTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.terminoproformaConstantesFunciones.mostrardescripcionTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltardescripcionTerminoProforma,this.terminoproformaConstantesFunciones.activardescripcionTerminoProforma,this,true,"descripcionTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltardescripcionTerminoProforma,this.terminoproformaConstantesFunciones.activardescripcionTerminoProforma,this,true,"descripcionTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2));

		if(this.terminoproformaConstantesFunciones.mostrardescripcion2TerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltardescripcion2TerminoProforma,this.terminoproformaConstantesFunciones.activardescripcion2TerminoProforma,this,true,"descripcion2TerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltardescripcion2TerminoProforma,this.terminoproformaConstantesFunciones.activardescripcion2TerminoProforma,this,true,"descripcion2TerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_MARCA));

		if(this.terminoproformaConstantesFunciones.mostrarmarcaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_MARCA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarmarcaTerminoProforma,this.terminoproformaConstantesFunciones.activarmarcaTerminoProforma,this,true,"marcaTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarmarcaTerminoProforma,this.terminoproformaConstantesFunciones.activarmarcaTerminoProforma,this,true,"marcaTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_ORIGEN));

		if(this.terminoproformaConstantesFunciones.mostrarorigenTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_ORIGEN,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarorigenTerminoProforma,this.terminoproformaConstantesFunciones.activarorigenTerminoProforma,this,true,"origenTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarorigenTerminoProforma,this.terminoproformaConstantesFunciones.activarorigenTerminoProforma,this,true,"origenTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA));

		if(this.terminoproformaConstantesFunciones.mostrargarantia_tecnicaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltargarantia_tecnicaTerminoProforma,this.terminoproformaConstantesFunciones.activargarantia_tecnicaTerminoProforma,this,true,"garantia_tecnicaTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltargarantia_tecnicaTerminoProforma,this.terminoproformaConstantesFunciones.activargarantia_tecnicaTerminoProforma,this,true,"garantia_tecnicaTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_FECHAPAGO));

		if(this.terminoproformaConstantesFunciones.mostrarfecha_pagoTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_FECHAPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarfecha_pagoTerminoProforma,this.terminoproformaConstantesFunciones.activarfecha_pagoTerminoProforma,this,true,"fecha_pagoTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarfecha_pagoTerminoProforma,this.terminoproformaConstantesFunciones.activarfecha_pagoTerminoProforma,this,true,"fecha_pagoTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.terminoproformaConstantesFunciones.mostrarfecha_entregaTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarfecha_entregaTerminoProforma,this.terminoproformaConstantesFunciones.activarfecha_entregaTerminoProforma,this,true,"fecha_entregaTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarfecha_entregaTerminoProforma,this.terminoproformaConstantesFunciones.activarfecha_entregaTerminoProforma,this,true,"fecha_entregaTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_ADJUNTO));

		if(this.terminoproformaConstantesFunciones.mostraradjuntoTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_ADJUNTO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltaradjuntoTerminoProforma,this.terminoproformaConstantesFunciones.activaradjuntoTerminoProforma,this,true,"adjuntoTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltaradjuntoTerminoProforma,this.terminoproformaConstantesFunciones.activaradjuntoTerminoProforma,this,true,"adjuntoTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_RESPONSABLE));

		if(this.terminoproformaConstantesFunciones.mostrarresponsableTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_RESPONSABLE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarresponsableTerminoProforma,this.terminoproformaConstantesFunciones.activarresponsableTerminoProforma,this,true,"responsableTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarresponsableTerminoProforma,this.terminoproformaConstantesFunciones.activarresponsableTerminoProforma,this,true,"responsableTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,TerminoProformaConstantesFunciones.LABEL_CARGO));

		if(this.terminoproformaConstantesFunciones.mostrarcargoTerminoProforma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,TerminoProformaConstantesFunciones.LABEL_CARGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.terminoproformaConstantesFunciones.resaltarcargoTerminoProforma,this.terminoproformaConstantesFunciones.activarcargoTerminoProforma,this,true,"cargoTerminoProforma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.terminoproformaConstantesFunciones.resaltarcargoTerminoProforma,this.terminoproformaConstantesFunciones.activarcargoTerminoProforma,this,true,"cargoTerminoProforma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new TerminoProformaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleTerminoProforma && this.terminoproformaConstantesFunciones.mostrarDetalleTerminoProformaTerminoProforma && !TerminoProformaConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Termino Proformas");
				tableColumn.setHeaderValue("Detalle Termino Proformas");
				tableColumn.setCellRenderer(new DetalleTerminoProformaTableCell(terminoproformaConstantesFunciones.resaltarDetalleTerminoProformaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarDetalleTerminoProformaTerminoProforma));
				tableColumn.setCellEditor(new DetalleTerminoProformaTableCell(terminoproformaConstantesFunciones.resaltarDetalleTerminoProformaTerminoProforma,this,this.terminoproformaConstantesFunciones.activarDetalleTerminoProformaTerminoProforma));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosTerminoProforma.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.terminoproformaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.terminoproformaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosTerminoProforma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				//tableColumn= new TableColumn();
				//tableColumn.setIdentifier(sLabelColumnAccion);
				//tableColumn.setHeaderValue(sLabelColumnAccion);
				//tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.terminoproformaSessionBean.getEsGuardarRelacionado()));
				//tableColumn.setCellEditor(new IdTableCell(this,false,false,this.terminoproformaSessionBean.getEsGuardarRelacionado()));
		
				//tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				//tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				//tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				//this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				//this.jTableDatosTerminoProforma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma) {
					//tableColumn= new TableColumn();
					//tableColumn.setIdentifier(Constantes2.S_ELI);
					//tableColumn.setHeaderValue(sLabelColumnAccionEli);
					//tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.terminoproformaSessionBean.getEsGuardarRelacionado()));
					//tableColumn.setCellEditor(new IdTableCell(this,false,true,this.terminoproformaSessionBean.getEsGuardarRelacionado()));
			
					//tableColumn.setPreferredWidth(65); 	 
					//tableColumn.setWidth(65); 	 
					//tableColumn.setMinWidth(65); 
					//tableColumn.setMaxWidth(65);
					
					//this.iWidthTableDefinicion+=65;
						
					//this.jTableDatosTerminoProforma.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.terminoproformaSessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosTerminoProforma.addColumn(tableColumn);
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
			
			this.jTableDatosTerminoProforma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma) {
				//iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		//iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.terminoproformaSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma) {
				////REUBICA ELIMINAR SIMPLE
				//jTableDatosTerminoProforma.moveColumn(this.jTableDatosTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				//iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		//jTableDatosTerminoProforma.moveColumn(this.jTableDatosTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.terminoproformaSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosTerminoProforma.moveColumn(this.jTableDatosTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosTerminoProforma.moveColumn(this.jTableDatosTerminoProforma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosTerminoProforma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosTerminoProforma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosTerminoProforma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosTerminoProforma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosTerminoProforma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosTerminoProforma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosTerminoProforma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosTerminoProforma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=terminoproformaLogic.getTerminoProformas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=terminoproformas.size()-1;
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
		//this.jTableDatosTerminoProforma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosTerminoProforma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosTerminoProforma();
			
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
				
				//this.isEsNuevoTerminoProforma=false;
					
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
				if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormTerminoProforma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTerminoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTerminoProforma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.terminoproforma.getsType().equals("DUPLICADO")
				   || this.terminoproforma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoTerminoProforma=true;
				
				} else {
					this.isEsNuevoTerminoProforma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
					if(this.terminoproforma.getId()>=0 && !this.terminoproforma.getIsNew()) {						
						this.isEsNuevoTerminoProforma=false;
						
					} else {
						this.isEsNuevoTerminoProforma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoTerminoProforma(esRelaciones);						
				
				this.seleccionarTerminoProforma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.terminoproforma.getId()<0) {
					this.isEsNuevoTerminoProforma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarTerminoProforma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarTerminoProforma(evt,rowIndex);
				}	
				
				if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion TerminoProforma: " + this.dDif); 
					}
				}								
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarTerminoProforma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.terminoproforma)) {
					if(this.terminoproforma.getId()>0) {
						this.terminoproforma.setIsDeleted(true);
						
						this.terminoproformasEliminados.add(this.terminoproforma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.terminoproformaLogic.getTerminoProformas().remove(this.terminoproforma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.terminoproformas.remove(this.terminoproforma);				
					}
					
					
					((TerminoProformaModel) this.jTableDatosTerminoProforma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaTerminoProforma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarTerminoProforma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoTerminoProforma) {
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosTerminoProforma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosTerminoProforma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioTerminoProforma(this.terminoproforma);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.terminoproformaConstantesFunciones.cargarid_empresaTerminoProforma || this.terminoproformaConstantesFunciones.event_dependid_empresaTerminoProforma) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.terminoproforma.getid_empresa());
									//this.inicializarActualizarBindingTerminoProforma(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(terminoproforma.getEmpresa()!=null) {
							this.empresasForeignKey.add(terminoproforma.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.terminoproforma.getid_empresa(),false,"Formulario");

					//Sucursal
					if(!this.terminoproformaConstantesFunciones.cargarid_sucursalTerminoProforma || this.terminoproformaConstantesFunciones.event_dependid_sucursalTerminoProforma) {
						//this.cargarCombosSucursalsForeignKeyLista(" where id="+this.terminoproforma.getid_sucursal());
									//this.inicializarActualizarBindingTerminoProforma(false,false);
						this.sucursalsForeignKey=new ArrayList<Sucursal>();

						if(terminoproforma.getSucursal()!=null) {
							this.sucursalsForeignKey.add(terminoproforma.getSucursal());
						}

						this.addItemDefectoCombosForeignKeySucursal();
						this.cargarCombosFrameSucursalsForeignKey("Todos");
					}
					this.setActualSucursalForeignKey(this.terminoproforma.getid_sucursal(),false,"Formulario");

					//Moneda
					if(!this.terminoproformaConstantesFunciones.cargarid_monedaTerminoProforma || this.terminoproformaConstantesFunciones.event_dependid_monedaTerminoProforma) {
						//this.cargarCombosMonedasForeignKeyLista(" where id="+this.terminoproforma.getid_moneda());
									//this.inicializarActualizarBindingTerminoProforma(false,false);
						this.monedasForeignKey=new ArrayList<Moneda>();

						if(terminoproforma.getMoneda()!=null) {
							this.monedasForeignKey.add(terminoproforma.getMoneda());
						}

						this.addItemDefectoCombosForeignKeyMoneda();
						this.cargarCombosFrameMonedasForeignKey("Todos");
					}
					this.setActualMonedaForeignKey(this.terminoproforma.getid_moneda(),false,"Formulario");

					//Proforma
					if(!this.terminoproformaConstantesFunciones.cargarid_proformaTerminoProforma || this.terminoproformaConstantesFunciones.event_dependid_proformaTerminoProforma) {
						//this.cargarCombosProformasForeignKeyLista(" where id="+this.terminoproforma.getid_proforma());
									//this.inicializarActualizarBindingTerminoProforma(false,false);
						this.proformasForeignKey=new ArrayList<Proforma>();

						if(terminoproforma.getProforma()!=null) {
							this.proformasForeignKey.add(terminoproforma.getProforma());
						}

						this.addItemDefectoCombosForeignKeyProforma();
						this.cargarCombosFrameProformasForeignKey("Todos");
					}
					this.setActualProformaForeignKey(this.terminoproforma.getid_proforma(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesTerminoProforma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesTerminoProforma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualTerminoProforma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoTerminoProforma(TerminoProforma terminoproforma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoTerminoProforma(terminoproforma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoTerminoProforma(TerminoProforma terminoproforma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioTerminoProforma(terminoproforma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyTerminoProforma(terminoproforma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyTerminoProforma(terminoproforma);
	}
	
	public void setVariablesObjetoActualToFormularioTerminoProforma(TerminoProforma terminoproforma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setText(terminoproforma.getId().toString());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setText(terminoproforma.getatencion());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setText(terminoproforma.getregistro_sanitario());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setText(terminoproforma.getreferencia());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setText(terminoproforma.getdescripcion());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setText(terminoproforma.getdescripcion2());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setText(terminoproforma.getmarca());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setText(terminoproforma.getorigen());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setText(terminoproforma.getgarantia_tecnica());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setText(terminoproforma.getfecha_pago());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setText(terminoproforma.getfecha_entrega());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setText(terminoproforma.getadjunto());
			this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setText(terminoproforma.getresponsable());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setText(terminoproforma.getcargo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,TerminoProforma terminoproformaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,terminoproformaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,TerminoProforma terminoproformaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				terminoproformaLocal=this.terminoproforma;
			} else {
				terminoproformaLocal=this.terminoproformaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(terminoproformaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoTerminoProforma(terminoproformaLocal,true);
					
					if(terminoproformaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(terminoproformaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(terminoproformaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoTerminoProforma(TerminoProforma terminoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTerminoProforma(terminoproforma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(terminoproforma);
	}
	
	public void setVariablesFormularioToObjetoActualTerminoProforma(TerminoProforma terminoproforma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualTerminoProforma(terminoproforma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualTerminoProforma(TerminoProforma terminoproforma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.getText()==null || this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.getText()=="" || this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.getText()=="Id") {
				this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setText("0");
			}

			if(conColumnasBase) {terminoproforma.setId(Long.parseLong(this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelIdTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setatencion(this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_ATENCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelatencionTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setregistro_sanitario(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelregistro_sanitarioTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setreferencia(this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_REFERENCIA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelreferenciaTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setdescripcion(this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabeldescripcionTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setdescripcion2(this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabeldescripcion2TerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setmarca(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_MARCA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelmarcaTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setorigen(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_ORIGEN+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelorigenTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setgarantia_tecnica(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelgarantia_tecnicaTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setfecha_pago(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_FECHAPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelfecha_pagoTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setfecha_entrega(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelfecha_entregaTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setadjunto(this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_ADJUNTO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabeladjuntoTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setresponsable(this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_RESPONSABLE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelresponsableTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			terminoproforma.setcargo(this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+TerminoProformaConstantesFunciones.LABEL_CARGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormTerminoProforma.jLabelcargoTerminoProforma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualTerminoProforma(TerminoProforma terminoproformaBean,TerminoProforma terminoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && terminoproformaBean.getid_proforma()!=null && !terminoproformaBean.getid_proforma().equals(-1L))) {terminoproforma.setid_proforma(terminoproformaBean.getid_proforma());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosTerminoProforma(TerminoProforma terminoproformaOrigen,TerminoProforma terminoproforma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && terminoproformaOrigen.getId()!=null && !terminoproformaOrigen.getId().equals(0L))) {terminoproforma.setId(terminoproformaOrigen.getId());}}
			if(conDefault || (!conDefault && terminoproformaOrigen.getid_proforma()!=null && !terminoproformaOrigen.getid_proforma().equals(-1L))) {terminoproforma.setid_proforma(terminoproformaOrigen.getid_proforma());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getatencion()!=null && !terminoproformaOrigen.getatencion().equals(""))) {terminoproforma.setatencion(terminoproformaOrigen.getatencion());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getregistro_sanitario()!=null && !terminoproformaOrigen.getregistro_sanitario().equals(""))) {terminoproforma.setregistro_sanitario(terminoproformaOrigen.getregistro_sanitario());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getreferencia()!=null && !terminoproformaOrigen.getreferencia().equals(""))) {terminoproforma.setreferencia(terminoproformaOrigen.getreferencia());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getdescripcion()!=null && !terminoproformaOrigen.getdescripcion().equals(""))) {terminoproforma.setdescripcion(terminoproformaOrigen.getdescripcion());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getdescripcion2()!=null && !terminoproformaOrigen.getdescripcion2().equals(""))) {terminoproforma.setdescripcion2(terminoproformaOrigen.getdescripcion2());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getmarca()!=null && !terminoproformaOrigen.getmarca().equals(""))) {terminoproforma.setmarca(terminoproformaOrigen.getmarca());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getorigen()!=null && !terminoproformaOrigen.getorigen().equals(""))) {terminoproforma.setorigen(terminoproformaOrigen.getorigen());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getgarantia_tecnica()!=null && !terminoproformaOrigen.getgarantia_tecnica().equals(""))) {terminoproforma.setgarantia_tecnica(terminoproformaOrigen.getgarantia_tecnica());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getfecha_pago()!=null && !terminoproformaOrigen.getfecha_pago().equals(""))) {terminoproforma.setfecha_pago(terminoproformaOrigen.getfecha_pago());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getfecha_entrega()!=null && !terminoproformaOrigen.getfecha_entrega().equals(""))) {terminoproforma.setfecha_entrega(terminoproformaOrigen.getfecha_entrega());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getadjunto()!=null && !terminoproformaOrigen.getadjunto().equals(""))) {terminoproforma.setadjunto(terminoproformaOrigen.getadjunto());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getresponsable()!=null && !terminoproformaOrigen.getresponsable().equals(""))) {terminoproforma.setresponsable(terminoproformaOrigen.getresponsable());}
			if(conDefault || (!conDefault && terminoproformaOrigen.getcargo()!=null && !terminoproformaOrigen.getcargo().equals(""))) {terminoproforma.setcargo(terminoproformaOrigen.getcargo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTerminoProforma(TerminoProforma terminoproforma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setText(terminoproforma.getId().toString());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setText(terminoproforma.getatencion());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setText(terminoproforma.getregistro_sanitario());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setText(terminoproforma.getreferencia());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setText(terminoproforma.getdescripcion());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setText(terminoproforma.getdescripcion2());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setText(terminoproforma.getmarca());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setText(terminoproforma.getorigen());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setText(terminoproforma.getgarantia_tecnica());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setText(terminoproforma.getfecha_pago());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setText(terminoproforma.getfecha_entrega());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setText(terminoproforma.getadjunto());
			this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setText(terminoproforma.getresponsable());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setText(terminoproforma.getcargo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioTerminoProforma(TerminoProformaBean terminoproformaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setText(terminoproformaBean.getId().toString());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setText(terminoproformaBean.getatencion());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setText(terminoproformaBean.getregistro_sanitario());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setText(terminoproformaBean.getreferencia());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setText(terminoproformaBean.getdescripcion());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setText(terminoproformaBean.getdescripcion2());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setText(terminoproformaBean.getmarca());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setText(terminoproformaBean.getorigen());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setText(terminoproformaBean.getgarantia_tecnica());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setText(terminoproformaBean.getfecha_pago());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setText(terminoproformaBean.getfecha_entrega());
			this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setText(terminoproformaBean.getadjunto());
			this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setText(terminoproformaBean.getresponsable());
			this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setText(terminoproformaBean.getcargo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanTerminoProforma(TerminoProformaParameterReturnGeneral terminoproformaReturnGeneral,TerminoProformaBean terminoproformaBean,Boolean conDefault) throws Exception { 
		try {
			TerminoProforma terminoproformaLocal=new TerminoProforma();
			
			terminoproformaLocal=terminoproformaReturnGeneral.getTerminoProforma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && terminoproformaLocal.getId()!=null && !terminoproformaLocal.getId().equals(0L))) {terminoproformaBean.setId(terminoproformaLocal.getId());}}
			if(conDefault || (!conDefault && terminoproformaLocal.getid_proforma()!=null && !terminoproformaLocal.getid_proforma().equals(-1L))) {terminoproformaBean.setid_proforma(terminoproformaLocal.getid_proforma());}
			if(conDefault || (!conDefault && terminoproformaLocal.getatencion()!=null && !terminoproformaLocal.getatencion().equals(""))) {terminoproformaBean.setatencion(terminoproformaLocal.getatencion());}
			if(conDefault || (!conDefault && terminoproformaLocal.getregistro_sanitario()!=null && !terminoproformaLocal.getregistro_sanitario().equals(""))) {terminoproformaBean.setregistro_sanitario(terminoproformaLocal.getregistro_sanitario());}
			if(conDefault || (!conDefault && terminoproformaLocal.getreferencia()!=null && !terminoproformaLocal.getreferencia().equals(""))) {terminoproformaBean.setreferencia(terminoproformaLocal.getreferencia());}
			if(conDefault || (!conDefault && terminoproformaLocal.getdescripcion()!=null && !terminoproformaLocal.getdescripcion().equals(""))) {terminoproformaBean.setdescripcion(terminoproformaLocal.getdescripcion());}
			if(conDefault || (!conDefault && terminoproformaLocal.getdescripcion2()!=null && !terminoproformaLocal.getdescripcion2().equals(""))) {terminoproformaBean.setdescripcion2(terminoproformaLocal.getdescripcion2());}
			if(conDefault || (!conDefault && terminoproformaLocal.getmarca()!=null && !terminoproformaLocal.getmarca().equals(""))) {terminoproformaBean.setmarca(terminoproformaLocal.getmarca());}
			if(conDefault || (!conDefault && terminoproformaLocal.getorigen()!=null && !terminoproformaLocal.getorigen().equals(""))) {terminoproformaBean.setorigen(terminoproformaLocal.getorigen());}
			if(conDefault || (!conDefault && terminoproformaLocal.getgarantia_tecnica()!=null && !terminoproformaLocal.getgarantia_tecnica().equals(""))) {terminoproformaBean.setgarantia_tecnica(terminoproformaLocal.getgarantia_tecnica());}
			if(conDefault || (!conDefault && terminoproformaLocal.getfecha_pago()!=null && !terminoproformaLocal.getfecha_pago().equals(""))) {terminoproformaBean.setfecha_pago(terminoproformaLocal.getfecha_pago());}
			if(conDefault || (!conDefault && terminoproformaLocal.getfecha_entrega()!=null && !terminoproformaLocal.getfecha_entrega().equals(""))) {terminoproformaBean.setfecha_entrega(terminoproformaLocal.getfecha_entrega());}
			if(conDefault || (!conDefault && terminoproformaLocal.getadjunto()!=null && !terminoproformaLocal.getadjunto().equals(""))) {terminoproformaBean.setadjunto(terminoproformaLocal.getadjunto());}
			if(conDefault || (!conDefault && terminoproformaLocal.getresponsable()!=null && !terminoproformaLocal.getresponsable().equals(""))) {terminoproformaBean.setresponsable(terminoproformaLocal.getresponsable());}
			if(conDefault || (!conDefault && terminoproformaLocal.getcargo()!=null && !terminoproformaLocal.getcargo().equals(""))) {terminoproformaBean.setcargo(terminoproformaLocal.getcargo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxTerminoProformaGenerico(Long idTerminoProformaSeleccionado,JComboBox jComboBoxTerminoProforma,List<TerminoProforma> terminoproformasLocal)throws Exception {
		try {
			TerminoProforma  terminoproformaTemp=null;

			for(TerminoProforma terminoproformaAux:terminoproformasLocal) {
				if(terminoproformaAux.getId()!=null && terminoproformaAux.getId().equals(idTerminoProformaSeleccionado)) {
					terminoproformaTemp=terminoproformaAux;
					break;
				}
			}

			jComboBoxTerminoProforma.setSelectedItem(terminoproformaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxTerminoProformaGenerico(JComboBox jComboBoxTerminoProforma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTerminoProforma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxTerminoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxTerminoProforma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxTerminoProforma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxTerminoProforma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxTerminoProforma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleTerminoProforma")) {
			jButtonDetalleTerminoProformaActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			terminoproforma=(TerminoProforma) terminoproformaLogic.getTerminoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			terminoproforma =(TerminoProforma) terminoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!terminoproforma.getIsNew() && !terminoproforma.getIsChanged() && !terminoproforma.getIsDeleted()) {
				sDescripcion=terminoproforma.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=terminoproforma.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Sucursal")) {
			//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
			if(!terminoproforma.getIsNew() && !terminoproforma.getIsChanged() && !terminoproforma.getIsDeleted()) {
				sDescripcion=terminoproforma.getsucursal_descripcion();
			} else {
				//sDescripcion=this.getActualSucursalForeignKeyDescripcion((Long)value);
				sDescripcion=terminoproforma.getsucursal_descripcion();
			}
		}

		if(sTipo.equals("Moneda")) {
			//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
			if(!terminoproforma.getIsNew() && !terminoproforma.getIsChanged() && !terminoproforma.getIsDeleted()) {
				sDescripcion=terminoproforma.getmoneda_descripcion();
			} else {
				//sDescripcion=this.getActualMonedaForeignKeyDescripcion((Long)value);
				sDescripcion=terminoproforma.getmoneda_descripcion();
			}
		}

		if(sTipo.equals("Proforma")) {
			//sDescripcion=this.getActualProformaForeignKeyDescripcion((Long)value);
			if(!terminoproforma.getIsNew() && !terminoproforma.getIsChanged() && !terminoproforma.getIsDeleted()) {
				sDescripcion=terminoproforma.getproforma_descripcion();
			} else {
				//sDescripcion=this.getActualProformaForeignKeyDescripcion((Long)value);
				sDescripcion=terminoproforma.getproforma_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		TerminoProforma terminoproformaRow=new TerminoProforma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			terminoproformaRow=(TerminoProforma) terminoproformaLogic.getTerminoProformas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			terminoproformaRow=(TerminoProforma) terminoproformas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleTerminoProformaActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,TerminoProforma terminoproforma) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormTerminoProforma==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma = (TerminoProforma)this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.terminoproforma = (TerminoProforma)this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(terminoproforma!=null) {
						this.terminoproforma = terminoproforma;
					} else {
						this.terminoproforma = new TerminoProforma();
					}
				}

				if(this.isTienePermisosDetalleTerminoProforma && this.permiteMantenimiento(this.terminoproforma)) {
					DetalleTerminoProformaBeanSwingJInternalFrame detalleterminoproformaBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup=new DetalleTerminoProformaBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleterminoproformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup;
					} else {
						detalleterminoproformaBeanSwingJInternalFrame=this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame;
					}

					List<TerminoProforma> terminoproformas=new ArrayList<TerminoProforma>();
					terminoproformas.add(this.terminoproforma);
					if(!esRelacionado) {
						//detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.setConGuardarRelaciones(false);
						//detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleterminoproformaBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormTerminoProforma.cargarDetalleTerminoProformaBeanSwingJInternalFrame(terminoproformas,this.terminoproforma,detalleterminoproformaBeanSwingJInternalFrame,/*conInicializar,*/detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.getConGuardarRelaciones(),detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaSessionBean.getEsGuardarRelacionado());
					detalleterminoproformaBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleterminoproformaBeanSwingJInternalFrame.actualizarEstadoPanelsDetalleTerminoProforma("no_relacionado");

						detalleterminoproformaBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleTerminoProformaConstantesFunciones.ITAMANIOFILATABLA + (DetalleTerminoProformaConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleterminoproformaBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderTerminoProforma=(TitledBorder)this.jScrollPanelDatosTerminoProforma.getBorder();
						TitledBorder titledBorderDetalleTerminoProforma=(TitledBorder)detalleterminoproformaBeanSwingJInternalFrame.jScrollPanelDatosDetalleTerminoProforma.getBorder();

						titledBorderDetalleTerminoProforma.setTitle(titledBorderTerminoProforma.getTitle() + " -> Detalle Termino Proforma");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleterminoproformaBeanSwingJInternalFrame);
						}

						detalleterminoproformaBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleterminoproformaBeanSwingJInternalFrame);

						detalleterminoproformaBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.terminoproformaSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Termino Proforma",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualTerminoProforma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoTerminoProforma && this.isPermisoNuevoTerminoProforma));			
			this.jButtonDuplicarTerminoProforma.setVisible((this.isVisibilidadCeldaDuplicarTerminoProforma && this.isPermisoDuplicarTerminoProforma));			
			this.jButtonCopiarTerminoProforma.setVisible((this.isVisibilidadCeldaCopiarTerminoProforma && this.isPermisoCopiarTerminoProforma));
			this.jButtonVerFormTerminoProforma.setVisible((this.isVisibilidadCeldaVerFormTerminoProforma && this.isPermisoVerFormTerminoProforma));
			
			this.jButtonAbrirOrderByTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenTerminoProforma && this.isPermisoOrdenTerminoProforma));			
			
			this.jButtonNuevoRelacionesTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTerminoProforma && this.isPermisoNuevoTerminoProforma));			
			this.jButtonNuevoGuardarCambiosTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoTerminoProforma && this.isPermisoNuevoTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarTerminoProforma.setVisible((this.isVisibilidadCeldaModificarTerminoProforma && this.isPermisoActualizarTerminoProforma));	
			this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarTerminoProforma.setVisible((this.isVisibilidadCeldaActualizarTerminoProforma && this.isPermisoActualizarTerminoProforma));	
			this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarTerminoProforma.setVisible((this.isVisibilidadCeldaEliminarTerminoProforma && this.isPermisoEliminarTerminoProforma));
			this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarTerminoProforma);							
			this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));			
			
			}
						
			this.jButtonGuardarCambiosTablaTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoTerminoProforma && this.isPermisoNuevoTerminoProforma));						
			this.jButtonDuplicarToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaDuplicarTerminoProforma && this.isPermisoDuplicarTerminoProforma));						
			this.jButtonCopiarToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaCopiarTerminoProforma && this.isPermisoCopiarTerminoProforma));			
			this.jButtonVerFormToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaVerFormTerminoProforma && this.isPermisoVerFormTerminoProforma));			
			this.jButtonAbrirOrderByToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenTerminoProforma && this.isPermisoOrdenTerminoProforma));
			this.jButtonNuevoRelacionesToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTerminoProforma && this.isPermisoNuevoTerminoProforma));			
			this.jButtonNuevoGuardarCambiosToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoTerminoProforma && this.isPermisoNuevoTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));			
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaModificarTerminoProforma && this.isPermisoActualizarTerminoProforma));	
			this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaActualizarTerminoProforma  && this.isPermisoActualizarTerminoProforma));	
			this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaEliminarTerminoProforma && this.isPermisoEliminarTerminoProforma));
			this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarToolBarTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarTerminoProforma);				
			this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoTerminoProforma && this.isPermisoNuevoTerminoProforma));			
			this.jMenuItemDuplicarTerminoProforma.setVisible((this.isVisibilidadCeldaDuplicarTerminoProforma && this.isPermisoDuplicarTerminoProforma));			
			this.jMenuItemCopiarTerminoProforma.setVisible((this.isVisibilidadCeldaCopiarTerminoProforma && this.isPermisoCopiarTerminoProforma));			
			this.jMenuItemVerFormTerminoProforma.setVisible((this.isVisibilidadCeldaVerFormTerminoProforma && this.isPermisoVerFormTerminoProforma));			
			this.jMenuItemAbrirOrderByTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenTerminoProforma && this.isPermisoOrdenTerminoProforma));			
			//this.jMenuItemMostrarOcultarTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenTerminoProforma && this.isPermisoOrdenTerminoProforma));
			this.jMenuItemDetalleAbrirOrderByTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenTerminoProforma && this.isPermisoOrdenTerminoProforma));			
			//this.jMenuItemDetalleMostrarOcultarTerminoProforma.setVisible((this.isVisibilidadCeldaOrdenTerminoProforma && this.isPermisoOrdenTerminoProforma));			
			this.jMenuItemNuevoRelacionesTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoRelacionesTerminoProforma && this.isPermisoNuevoTerminoProforma));			
			this.jMenuItemNuevoGuardarCambiosTerminoProforma.setVisible((this.isVisibilidadCeldaNuevoTerminoProforma && this.isPermisoNuevoTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));									
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemModificarTerminoProforma.setVisible((this.isVisibilidadCeldaModificarTerminoProforma && this.isPermisoActualizarTerminoProforma));	
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemActualizarTerminoProforma.setVisible((this.isVisibilidadCeldaActualizarTerminoProforma && this.isPermisoActualizarTerminoProforma));	
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemEliminarTerminoProforma.setVisible((this.isVisibilidadCeldaEliminarTerminoProforma && this.isPermisoEliminarTerminoProforma));
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemCancelarTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarTerminoProforma);				
			}
			
			this.jMenuItemGuardarCambiosTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));						
			this.jMenuItemGuardarCambiosTablaTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarCambiosTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoTerminoProforma=this.jButtonNuevoTerminoProforma.isVisible();
			this.isVisibilidadCeldaDuplicarTerminoProforma=this.jButtonDuplicarTerminoProforma.isVisible();
			this.isVisibilidadCeldaCopiarTerminoProforma=this.jButtonCopiarTerminoProforma.isVisible();
			this.isVisibilidadCeldaVerFormTerminoProforma=this.jButtonVerFormTerminoProforma.isVisible();
			
			this.isVisibilidadCeldaOrdenTerminoProforma=this.jButtonAbrirOrderByTerminoProforma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=this.jButtonNuevoRelacionesTerminoProforma.isVisible();
			this.isVisibilidadCeldaModificarTerminoProforma=this.jButtonModificarTerminoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.isVisibilidadCeldaActualizarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarTerminoProforma.isVisible();
			this.isVisibilidadCeldaEliminarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarTerminoProforma.isVisible();
			this.isVisibilidadCeldaCancelarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarTerminoProforma.isVisible();
			this.isVisibilidadCeldaGuardarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=this.jButtonGuardarCambiosTablaTerminoProforma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoTerminoProforma=this.jButtonNuevoToolBarTerminoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=this.jButtonNuevoRelacionesToolBarTerminoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.isVisibilidadCeldaModificarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarToolBarTerminoProforma.isVisible();
			this.isVisibilidadCeldaActualizarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarToolBarTerminoProforma.isVisible();
			this.isVisibilidadCeldaEliminarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarToolBarTerminoProforma.isVisible();
			this.isVisibilidadCeldaCancelarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarToolBarTerminoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTerminoProforma=this.jButtonGuardarCambiosToolBarTerminoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=this.jButtonGuardarCambiosTablaToolBarTerminoProforma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoTerminoProforma=this.jMenuItemNuevoTerminoProforma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=this.jMenuItemNuevoRelacionesTerminoProforma.isVisible();
			
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.isVisibilidadCeldaModificarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jMenuItemModificarTerminoProforma.isVisible();
			this.isVisibilidadCeldaActualizarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jMenuItemActualizarTerminoProforma.isVisible();
			this.isVisibilidadCeldaEliminarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jMenuItemEliminarTerminoProforma.isVisible();
			this.isVisibilidadCeldaCancelarTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.jMenuItemCancelarTerminoProforma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarTerminoProforma=this.jMenuItemGuardarCambiosTerminoProforma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=this.jMenuItemGuardarCambiosTablaTerminoProforma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesTerminoProforma(Boolean esInicializar) {
		if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
				//if(this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesTerminoProforma();
			}
			
			this.inicializarActualizarBindingBotonesManualTerminoProforma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualTerminoProforma() {
		this.jButtonNuevoTerminoProforma.setVisible(this.isPermisoNuevoTerminoProforma);			
		this.jButtonDuplicarTerminoProforma.setVisible(this.isPermisoDuplicarTerminoProforma);			
		this.jButtonCopiarTerminoProforma.setVisible(this.isPermisoCopiarTerminoProforma);			
		this.jButtonVerFormTerminoProforma.setVisible(this.isPermisoVerFormTerminoProforma);			
		
		this.jButtonAbrirOrderByTerminoProforma.setVisible(this.isPermisoOrdenTerminoProforma);					
		
		this.jButtonNuevoRelacionesTerminoProforma.setVisible(this.isPermisoNuevoTerminoProforma);			
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarTerminoProforma.setVisible(this.isPermisoActualizarTerminoProforma);	
			this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarTerminoProforma.setVisible(this.isPermisoActualizarTerminoProforma);	
			this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarTerminoProforma.setVisible(this.isPermisoEliminarTerminoProforma);
			this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarTerminoProforma);						
			this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.setVisible(this.isPermisoGuardarCambiosTerminoProforma);							
		}
		
		this.jButtonGuardarCambiosTablaTerminoProforma.setVisible(this.isPermisoActualizarTerminoProforma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleTerminoProforma() {
		this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarTerminoProforma.setVisible(this.isPermisoActualizarTerminoProforma);	
		this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarTerminoProforma.setVisible(this.isPermisoActualizarTerminoProforma);	
		this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarTerminoProforma.setVisible(this.isPermisoEliminarTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarTerminoProforma.setVisible(this.isVisibilidadCeldaCancelarTerminoProforma);							
		this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.setVisible((this.isVisibilidadCeldaGuardarTerminoProforma && this.isPermisoGuardarCambiosTerminoProforma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosTerminoProforma() {
		if(TerminoProformaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualTerminoProforma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesTerminoProforma() {
	}
	
	public void jTableDatosTerminoProformaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarTerminoProforma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.terminoproforma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebTerminoProforma(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.terminoproformaLogic.getConnexion());

				if(this.terminoproforma.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.terminoproforma.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTerminoProforma=(TitledBorder)this.jScrollPanelDatosTerminoProforma.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderTerminoProforma.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.terminoproforma.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_sucursalTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisosucursal=true;

			idTienePermisosucursal=this.tienePermisosUsuarioEnPaginaWebTerminoProforma(SucursalConstantesFunciones.CLASSNAME);

			if(idTienePermisosucursal) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);

				this.sucursalBeanSwingJInternalFrame=new SucursalBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.sucursalBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.sucursalBeanSwingJInternalFrame.getSucursalLogic().setConnexion(this.terminoproformaLogic.getConnexion());

				if(this.terminoproforma.getid_sucursal()!=null) {
					this.sucursalBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.sucursalBeanSwingJInternalFrame.setIdActual(this.terminoproforma.getid_sucursal());
					this.sucursalBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.sucursalBeanSwingJInternalFrame.inicializarActualizarBindingTablaSucursal();
				}

				JInternalFrameBase jinternalFrame =this.sucursalBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTerminoProforma=(TitledBorder)this.jScrollPanelDatosTerminoProforma.getBorder();
				TitledBorder titledBordersucursal=(TitledBorder)this.sucursalBeanSwingJInternalFrame.jScrollPanelDatosSucursal.getBorder();

				titledBordersucursal.setTitle(titledBorderTerminoProforma.getTitle() + " -> Sucursal");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_sucursalTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getid_sucursal()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_sucursal = "+this.terminoproforma.getid_sucursal().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_monedaTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomoneda=true;

			idTienePermisomoneda=this.tienePermisosUsuarioEnPaginaWebTerminoProforma(MonedaConstantesFunciones.CLASSNAME);

			if(idTienePermisomoneda) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);

				this.monedaBeanSwingJInternalFrame=new MonedaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.monedaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.monedaBeanSwingJInternalFrame.getMonedaLogic().setConnexion(this.terminoproformaLogic.getConnexion());

				if(this.terminoproforma.getid_moneda()!=null) {
					this.monedaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.monedaBeanSwingJInternalFrame.setIdActual(this.terminoproforma.getid_moneda());
					this.monedaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.monedaBeanSwingJInternalFrame.inicializarActualizarBindingTablaMoneda();
				}

				JInternalFrameBase jinternalFrame =this.monedaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTerminoProforma=(TitledBorder)this.jScrollPanelDatosTerminoProforma.getBorder();
				TitledBorder titledBordermoneda=(TitledBorder)this.monedaBeanSwingJInternalFrame.jScrollPanelDatosMoneda.getBorder();

				titledBordermoneda.setTitle(titledBorderTerminoProforma.getTitle() + " -> Moneda");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_monedaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getid_moneda()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_moneda = "+this.terminoproforma.getid_moneda().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_proformaTerminoProformaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoproforma=true;

			idTienePermisoproforma=this.tienePermisosUsuarioEnPaginaWebTerminoProforma(ProformaConstantesFunciones.CLASSNAME);

			if(idTienePermisoproforma) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosTerminoProforma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosTerminoProforma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);

				this.proformaBeanSwingJInternalFrame=new ProformaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.proformaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.proformaBeanSwingJInternalFrame.getProformaLogic().setConnexion(this.terminoproformaLogic.getConnexion());

				if(this.terminoproforma.getid_proforma()!=null) {
					this.proformaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.proformaBeanSwingJInternalFrame.setIdActual(this.terminoproforma.getid_proforma());
					this.proformaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.proformaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.proformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaProforma();
				}

				JInternalFrameBase jinternalFrame =this.proformaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderTerminoProforma=(TitledBorder)this.jScrollPanelDatosTerminoProforma.getBorder();
				TitledBorder titledBorderproforma=(TitledBorder)this.proformaBeanSwingJInternalFrame.jScrollPanelDatosProforma.getBorder();

				titledBorderproforma.setTitle(titledBorderTerminoProforma.getTitle() + " -> Proforma");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_proformaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getid_proforma()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_proforma = "+this.terminoproforma.getid_proforma().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonatencionTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getatencion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where atencion like '%"+this.terminoproforma.getatencion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonregistro_sanitarioTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getregistro_sanitario()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where registro_sanitario like '%"+this.terminoproforma.getregistro_sanitario()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonreferenciaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getreferencia()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where referencia like '%"+this.terminoproforma.getreferencia()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.terminoproforma.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcion2TerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getdescripcion2()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion2 like '%"+this.terminoproforma.getdescripcion2()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonmarcaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getmarca()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where marca like '%"+this.terminoproforma.getmarca()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonorigenTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getorigen()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where origen like '%"+this.terminoproforma.getorigen()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtongarantia_tecnicaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getgarantia_tecnica()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where garantia_tecnica like '%"+this.terminoproforma.getgarantia_tecnica()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_pagoTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getfecha_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_pago like '%"+this.terminoproforma.getfecha_pago()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega like '%"+this.terminoproforma.getfecha_entrega()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonadjuntoTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getadjunto()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where adjunto like '%"+this.terminoproforma.getadjunto()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonresponsableTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getresponsable()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where responsable like '%"+this.terminoproforma.getresponsable()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncargoTerminoProformaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.getterminoproforma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.terminoproforma==null) {
						this.terminoproforma = new TerminoProforma();
					}

					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);
				}

				if(this.terminoproforma.getcargo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cargo like '%"+this.terminoproforma.getcargo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingTerminoProforma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTerminoProforma(false,false);

			this.getTerminoProformasFK_IdEmpresa();

			this.inicializarActualizarBindingTerminoProforma(false);

			//if(TerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMonedaTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTerminoProforma(false,false);

			this.getTerminoProformasFK_IdMoneda();

			this.inicializarActualizarBindingTerminoProforma(false);

			//if(TerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdProformaTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTerminoProforma(false,false);

			this.getTerminoProformasFK_IdProforma();

			this.inicializarActualizarBindingTerminoProforma(false);

			//if(TerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdSucursalTerminoProformaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingTerminoProforma(false,false);

			this.getTerminoProformasFK_IdSucursal();

			this.inicializarActualizarBindingTerminoProforma(false);

			//if(TerminoProformaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingTerminoProforma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.terminoproformaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameTerminoProforma() {
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
		

		if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
			this.jInternalFrameDetalleFormTerminoProforma.setVisible(false);	    			
			this.jInternalFrameDetalleFormTerminoProforma.dispose();
			this.jInternalFrameDetalleFormTerminoProforma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
			this.jInternalFrameReporteDinamicoTerminoProforma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoTerminoProforma.dispose();
			this.jInternalFrameReporteDinamicoTerminoProforma=null;
		}
		
		if(this.jInternalFrameImportacionTerminoProforma!=null) {
			this.jInternalFrameImportacionTerminoProforma.setVisible(false);	    			
			this.jInternalFrameImportacionTerminoProforma.dispose();
			this.jInternalFrameImportacionTerminoProforma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessTerminoProforma();
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			
			if(sTipo.equals("NuevoTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarTerminoProforma")) {
				jButtonDuplicarTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarTerminoProforma")) {
				jButtonCopiarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormTerminoProforma")) {
				jButtonVerFormTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarTerminoProforma")) {
				jButtonDuplicarTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarTerminoProforma")) {
				jButtonDuplicarTerminoProformaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarTerminoProforma")) {
				jButtonModificarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarTerminoProforma")) {
				jButtonModificarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarTerminoProforma")) {
				jButtonModificarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarTerminoProforma")) {
				jButtonActualizarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarTerminoProforma")) {
				jButtonActualizarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarTerminoProforma")) {
				jButtonActualizarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarTerminoProforma")) {
				jButtonEliminarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarTerminoProforma")) {
				jButtonEliminarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarTerminoProforma")) {
				jButtonEliminarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarTerminoProforma")) {
				jButtonCancelarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarTerminoProforma")) {
				jButtonCancelarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarTerminoProforma")) {
				jButtonCancelarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarTerminoProforma")) {
				jButtonCerrarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarTerminoProforma")) {
				jButtonCerrarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarTerminoProforma")) {
				jButtonCerrarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarTerminoProforma")) {
				jButtonMostrarOcultarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarTerminoProforma")) {
				jButtonCancelarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarTerminoProforma")) {
				jButtonCopiarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarTerminoProforma")) {
				jButtonVerFormTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarTerminoProforma")) {
				jButtonCopiarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormTerminoProforma")) {
				jButtonVerFormTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionTerminoProforma")) {
				jButtonRecargarInformacionTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarTerminoProforma")) {
				jButtonRecargarInformacionTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionTerminoProforma")) {
				jButtonRecargarInformacionTerminoProformaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresTerminoProforma")) {
				jButtonAnterioresTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarTerminoProforma")) {
				jButtonAnterioresTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreTerminoProforma")) {
				jButtonAnterioresTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesTerminoProforma")) {
				jButtonSiguientesTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarTerminoProforma")) {
				jButtonSiguientesTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesTerminoProforma")) {
				jButtonSiguientesTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByTerminoProforma") || sTipo.equals("MenuItemDetalleAbrirOrderByTerminoProforma")) {
				jButtonAbrirOrderByTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarTerminoProforma") || sTipo.equals("MenuItemDetalleMostrarOcultarTerminoProforma")) {
				jButtonMostrarOcultarTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosTerminoProforma")) {
				jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarTerminoProforma")) {
				jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosTerminoProforma")) {
				jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoTerminoProforma")) {
				jButtonCerrarReporteDinamicoTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoTerminoProforma")) {
				jButtonGenerarReporteDinamicoTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoTerminoProforma")) {
				
				jButtonGenerarExcelReporteDinamicoTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionTerminoProforma")) {
				jButtonCerrarImportacionTerminoProformaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionTerminoProforma")) {
				
				jButtonGenerarImportacionTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionTerminoProforma")) {
				
				jButtonAbrirImportacionTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesTerminoProforma")) {
				jComboBoxTiposAccionesTerminoProformaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesTerminoProforma")) {
				jComboBoxTiposRelacionesTerminoProformaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioTerminoProforma")) {
				jComboBoxTiposAccionesTerminoProformaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarTerminoProforma")) {
				
				jComboBoxTiposSeleccionarTerminoProformaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralTerminoProforma")) {
				jTextFieldValorCampoGeneralTerminoProformaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByTerminoProforma")) {
				jButtonAbrirOrderByTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarTerminoProforma")) {
				jButtonAbrirOrderByTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByTerminoProforma")) {
				jButtonCerrarOrderByTerminoProformaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTerminoProformaBusqueda")) {
				this.jButtonidTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTerminoProformaUpdate")) {
				this.jButtonid_empresaTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTerminoProformaBusqueda")) {
				this.jButtonid_empresaTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTerminoProformaUpdate")) {
				this.jButtonid_sucursalTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTerminoProformaBusqueda")) {
				this.jButtonid_sucursalTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaTerminoProformaUpdate")) {
				this.jButtonid_monedaTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaTerminoProformaBusqueda")) {
				this.jButtonid_monedaTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_proformaTerminoProformaUpdate")) {
				this.jButtonid_proformaTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_proformaTerminoProformaBusqueda")) {
				this.jButtonid_proformaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("atencionTerminoProformaBusqueda")) {
				this.jButtonatencionTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("registro_sanitarioTerminoProformaBusqueda")) {
				this.jButtonregistro_sanitarioTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaTerminoProformaBusqueda")) {
				this.jButtonreferenciaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTerminoProformaBusqueda")) {
				this.jButtondescripcionTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2TerminoProformaBusqueda")) {
				this.jButtondescripcion2TerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaTerminoProformaBusqueda")) {
				this.jButtonmarcaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenTerminoProformaBusqueda")) {
				this.jButtonorigenTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("garantia_tecnicaTerminoProformaBusqueda")) {
				this.jButtongarantia_tecnicaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoTerminoProformaBusqueda")) {
				this.jButtonfecha_pagoTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaTerminoProformaBusqueda")) {
				this.jButtonfecha_entregaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("adjuntoTerminoProformaBusqueda")) {
				this.jButtonadjuntoTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableTerminoProformaBusqueda")) {
				this.jButtonresponsableTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cargoTerminoProformaBusqueda")) {
				this.jButtoncargoTerminoProformaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdProformaTerminoProforma")) {
				this.jButtonFK_IdProformaTerminoProformaActionPerformed(evt);
			}
			
			;
			
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessTerminoProforma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			TerminoProforma terminoproformaLocal=null;
			
			if(!this.getEsControlTabla()) {
				terminoproformaLocal=this.terminoproforma;
			} else {
				terminoproformaLocal=this.terminoproformaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
							
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
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
			
			


			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
								
						
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
								
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
							
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
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
			
			


			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
								
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosTerminoProforma")) {
					jCheckBoxSeleccionarTodosTerminoProformaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosTerminoProforma")) {
					jCheckBoxSeleccionadosTerminoProformaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarTerminoProforma")) {
					
				}
				
				


				
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
												
				
				


				
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
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
			
			


			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaTerminoProformaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.terminoproforma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.terminoproforma);
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
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
				
				


				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(TerminoProforma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",TerminoProforma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaTerminoProformaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.terminoproformaAnterior =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarTerminoProforma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosTerminoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosTerminoProforma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.terminoproforma =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.terminoproforma =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.terminoproforma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarTerminoProforma")) {
				
				}
				
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarTerminoProforma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosTerminoProforma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarTerminoProforma")) {
			
			}
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessTerminoProforma();
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			if(sTipo.equals("NuevoTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarTerminoProforma")) {
				jButtonDuplicarTerminoProformaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarTerminoProforma")) {
				jButtonCopiarTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormTerminoProforma")) {
				jButtonVerFormTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesTerminoProforma")) {
				jButtonNuevoTerminoProformaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarTerminoProforma")) {
				jButtonModificarTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarTerminoProforma")) {
				jButtonActualizarTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarTerminoProforma")) {
				jButtonEliminarTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarTerminoProforma")) {
				jButtonCancelarTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarTerminoProforma")) {
				jButtonCerrarTerminoProformaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTerminoProforma")) {
				jButtonGuardarCambiosTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosTerminoProforma")) {
				jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByTerminoProforma")) {
				jButtonAbrirOrderByTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionTerminoProforma")) {
				jButtonRecargarInformacionTerminoProformaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresTerminoProforma")) {
				jButtonAnterioresTerminoProformaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesTerminoProforma")) {
				jButtonSiguientesTerminoProformaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idTerminoProformaBusqueda")) {
				this.jButtonidTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaTerminoProformaUpdate")) {
				this.jButtonid_empresaTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaTerminoProformaBusqueda")) {
				this.jButtonid_empresaTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_sucursalTerminoProformaUpdate")) {
				this.jButtonid_sucursalTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_sucursalTerminoProformaBusqueda")) {
				this.jButtonid_sucursalTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_monedaTerminoProformaUpdate")) {
				this.jButtonid_monedaTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_monedaTerminoProformaBusqueda")) {
				this.jButtonid_monedaTerminoProformaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_proformaTerminoProformaUpdate")) {
				this.jButtonid_proformaTerminoProformaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_proformaTerminoProformaBusqueda")) {
				this.jButtonid_proformaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("atencionTerminoProformaBusqueda")) {
				this.jButtonatencionTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("registro_sanitarioTerminoProformaBusqueda")) {
				this.jButtonregistro_sanitarioTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("referenciaTerminoProformaBusqueda")) {
				this.jButtonreferenciaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionTerminoProformaBusqueda")) {
				this.jButtondescripcionTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcion2TerminoProformaBusqueda")) {
				this.jButtondescripcion2TerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("marcaTerminoProformaBusqueda")) {
				this.jButtonmarcaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("origenTerminoProformaBusqueda")) {
				this.jButtonorigenTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("garantia_tecnicaTerminoProformaBusqueda")) {
				this.jButtongarantia_tecnicaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_pagoTerminoProformaBusqueda")) {
				this.jButtonfecha_pagoTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaTerminoProformaBusqueda")) {
				this.jButtonfecha_entregaTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("adjuntoTerminoProformaBusqueda")) {
				this.jButtonadjuntoTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("responsableTerminoProformaBusqueda")) {
				this.jButtonresponsableTerminoProformaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cargoTerminoProformaBusqueda")) {
				this.jButtoncargoTerminoProformaBusquedaActionPerformed(evt);
			}
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessTerminoProforma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameTerminoProforma")) {
				closingInternalFrameTerminoProforma();
				
			} else if(sTipo.equals("jButtonCancelarTerminoProforma")) {
				JInternalFrameBase jInternalFrameDetalleFormTerminoProforma = (JInternalFrameBase)evt.getSource();
	            	
	            TerminoProformaBeanSwingJInternalFrame jInternalFrameParent=(TerminoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormTerminoProforma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarTerminoProformaActionPerformed(null);
			}
			
			TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.terminoproforma,new Object(),this.terminoproformaParameterGeneral,this.terminoproformaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormTerminoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormTerminoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormTerminoProforma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.terminoproforma)) {
			if(!esControlTabla) {
				if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);			
				}
				
				if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualTerminoProforma(this.terminoproforma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.terminoproformaReturnGeneral=terminoproformaLogic.procesarEventosTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.terminoproformaLogic.getTerminoProformas(),this.terminoproforma,this.terminoproformaParameterGeneral,this.isEsNuevoTerminoProforma,classes);//this.terminoproformaLogic.getTerminoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanTerminoProforma(this.terminoproformaReturnGeneral,this.terminoproformaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanTerminoProforma(classes,this.terminoproformaReturnGeneral,this.terminoproformaBean,false);
					}
						
					if(this.terminoproformaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma());	
					}
						
					if(this.terminoproformaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma(),classes);//this.terminoproformaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioTerminoProforma(this.terminoproforma,classes);//this.terminoproformaBean);									
				}
			
				if(TerminoProformaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualTerminoProforma(this.terminoproforma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysTerminoProforma(this.terminoproforma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.terminoproformaAnterior!=null) {
						this.terminoproforma=this.terminoproformaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.terminoproformaReturnGeneral=terminoproformaLogic.procesarEventosTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.terminoproformaLogic.getTerminoProformas(),this.terminoproforma,this.terminoproformaParameterGeneral,this.isEsNuevoTerminoProforma,classes);//this.terminoproformaLogic.getTerminoProforma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.terminoproformaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.terminoproformaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.terminoproformaReturnGeneral.getTerminoProforma(),terminoproformaLogic.getTerminoProformas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.terminoproformaReturnGeneral.getTerminoProforma(),this.terminoproformas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosTerminoProforma.repaint();
				
				//((AbstractTableModel) this.jTableDatosTerminoProforma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosTerminoProforma();
			}
		}
	}
	
	public void actualizarVisualTableDatosTerminoProforma() throws Exception {
		
		TerminoProformaModel terminoproformaModel=(TerminoProformaModel)this.jTableDatosTerminoProforma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			terminoproformaModel.terminoproformas=this.terminoproformaLogic.getTerminoProformas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			terminoproformaModel.terminoproformas=this.terminoproformas;
		}
		
		
		((TerminoProformaModel) this.jTableDatosTerminoProforma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaTerminoProforma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getterminoproformaAnterior(),this.terminoproformaLogic.getTerminoProformas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getterminoproformaAnterior(),this.terminoproformas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosTerminoProforma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioTerminoProforma(TerminoProforma terminoproforma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTerminoProforma.class)) {
					this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.setDetalleTerminoProformas(terminoproforma.getDetalleTerminoProformas());
					this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
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
										
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.terminoproforma,new Object(),generalEntityParameterGeneral,this.terminoproformaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.terminoproformaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=TerminoProformaConstantesFunciones.getClassesRelationshipsOfTerminoProforma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=TerminoProformaConstantesFunciones.getClassesRelationshipsFromStringsOfTerminoProforma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormTerminoProforma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				TerminoProformaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.terminoproforma,new Object(),generalEntityParameterGeneral,this.terminoproformaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioTerminoProforma(TerminoProformaBean terminoproformaBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTerminoProforma.class)) {
					this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.setDetalleTerminoProformas(terminoproforma.getDetalleTerminoProformas());
					this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleTerminoProforma(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanTerminoProforma(ArrayList<Classe> classes,TerminoProformaReturnGeneral terminoproformaReturnGeneral,TerminoProformaBean terminoproformaBean,Boolean conDefault) throws Exception {
		
			this.terminoproformaBean.setDetalleTerminoProformas(terminoproformaReturnGeneral.getTerminoProforma().getDetalleTerminoProformas());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualTerminoProforma(TerminoProforma terminoproforma,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleTerminoProforma.class)) {
					terminoproforma.setDetalleTerminoProformas(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaBeanSwingJInternalFrame.detalleterminoproformaLogic.getDetalleTerminoProformas());
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
		if(!paraTabla && !this.permiteMantenimiento(this.terminoproforma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormTerminoProforma = new TerminoProformaDetalleFormJInternalFrame(jDesktopPane,this.terminoproformaSessionBean.getConGuardarRelaciones(),this.terminoproformaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.setVisible(false);
		this.jInternalFrameDetalleFormTerminoProforma.setSelected(false);						
		
		this.jInternalFrameDetalleFormTerminoProforma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormTerminoProforma.terminoproformaLogic=this.terminoproformaLogic;
		
		this.cargarCombosFrameForeignKeyTerminoProforma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleTerminoProforma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleTerminoProforma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyTerminoProforma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyTerminoProforma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormTerminoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTerminoProforma"));
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarTerminoProforma"));

		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarTerminoProforma"));
					
		this.jInternalFrameDetalleFormTerminoProforma.jMenuItemModificarTerminoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarTerminoProforma.addActionListener (new ButtonActionListener(this,"ActualizarTerminoProforma"));
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTerminoProforma"));
						
		this.jInternalFrameDetalleFormTerminoProforma.jMenuItemActualizarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarTerminoProforma"));
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarTerminoProforma"));
								
		this.jInternalFrameDetalleFormTerminoProforma.jMenuItemEliminarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarTerminoProforma"));
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarTerminoProforma"));
					
		this.jInternalFrameDetalleFormTerminoProforma.jMenuItemCancelarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTerminoProforma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jMenuItemDetalleCerrarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTerminoProforma"));		
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTerminoProforma"));
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTerminoProforma"));
		
		
		
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTerminoProforma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonidTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_empresaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_empresaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_sucursalTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_sucursalTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_monedaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_monedaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_monedaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_proformaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_proformaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_proformaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_proformaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonatencionTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"atencionTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonregistro_sanitarioTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"registro_sanitarioTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonreferenciaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"referenciaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtondescripcionTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtondescripcion2TerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2TerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonmarcaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"marcaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonorigenTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"origenTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtongarantia_tecnicaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"garantia_tecnicaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonfecha_pagoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonfecha_entregaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonadjuntoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"adjuntoTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonresponsableTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"responsableTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtoncargoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"cargoTerminoProformaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTerminoProforma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameTerminoProforma"));
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarTerminoProforma"));
		}
		
		this.jTableDatosTerminoProforma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarTerminoProforma"));
		
		this.jTableDatosTerminoProforma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarTerminoProforma"));
		
		this.jButtonNuevoTerminoProforma.addActionListener(new ButtonActionListener(this,"NuevoTerminoProforma"));
		
		this.jButtonDuplicarTerminoProforma.addActionListener(new ButtonActionListener(this,"DuplicarTerminoProforma"));
		
		this.jButtonCopiarTerminoProforma.addActionListener(new ButtonActionListener(this,"CopiarTerminoProforma"));
		
		this.jButtonVerFormTerminoProforma.addActionListener(new ButtonActionListener(this,"VerFormTerminoProforma"));
		
		
		this.jButtonNuevoToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"NuevoToolBarTerminoProforma"));
			
		this.jButtonDuplicarToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarTerminoProforma"));
			
		this.jMenuItemNuevoTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoTerminoProforma"));
			
		this.jMenuItemDuplicarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarTerminoProforma"));		
		
		
		this.jButtonNuevoRelacionesTerminoProforma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesTerminoProforma"));
		
		
		this.jButtonNuevoRelacionesToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarTerminoProforma"));
			
		this.jMenuItemNuevoRelacionesTerminoProforma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesTerminoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonModificarToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"ModificarToolBarTerminoProforma"));
			
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemModificarTerminoProforma.addActionListener(new ButtonActionListener(this,"MenuItemModificarTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarTerminoProforma.addActionListener (new ButtonActionListener(this,"ActualizarTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonActualizarToolBarTerminoProforma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarTerminoProforma"));
				
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemActualizarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonEliminarToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"EliminarToolBarTerminoProforma"));
						
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemEliminarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonCancelarToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"CancelarToolBarTerminoProforma"));
			
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemCancelarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarTerminoProforma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarTerminoProforma"));		
		
		
		this.jButtonCerrarTerminoProforma.addActionListener (new ButtonActionListener(this,"CerrarTerminoProforma"));
		
		
		this.jButtonCerrarToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"CerrarToolBarTerminoProforma"));
			
		this.jMenuItemCerrarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarTerminoProforma"));
			
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jMenuItemDetalleCerrarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarTerminoProforma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTerminoProforma"));
		}
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarTerminoProforma"));
		}
		
		this.jButtonCopiarToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"CopiarToolBarTerminoProforma"));
			
		this.jButtonVerFormToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"VerFormToolBarTerminoProforma"));
		
		this.jMenuItemGuardarCambiosTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosTerminoProforma"));
			
		this.jMenuItemCopiarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarTerminoProforma"));		
		
		this.jMenuItemVerFormTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormTerminoProforma"));		
		
		
		this.jButtonGuardarCambiosTablaTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTerminoProforma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarTerminoProforma"));
			
		this.jMenuItemGuardarCambiosTablaTerminoProforma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaTerminoProforma"));		
		
		
		
		this.jButtonRecargarInformacionTerminoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionTerminoProforma"));
					
		this.jButtonRecargarInformacionToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarTerminoProforma"));
		
		this.jMenuItemRecargarInformacionTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionTerminoProforma"));		
		
		
		
		this.jButtonAnterioresTerminoProforma.addActionListener (new ButtonActionListener(this,"AnterioresTerminoProforma"));
		
		
		this.jButtonAnterioresToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarTerminoProforma"));
		
		this.jMenuItemAnterioresTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresTerminoProforma"));		
		
		
		this.jButtonSiguientesTerminoProforma.addActionListener (new ButtonActionListener(this,"SiguientesTerminoProforma"));
		
		
		this.jButtonSiguientesToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarTerminoProforma"));
			
		this.jMenuItemSiguientesTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesTerminoProforma"));
			
		this.jMenuItemAbrirOrderByTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByTerminoProforma"));
			
		this.jMenuItemMostrarOcultarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarTerminoProforma"));
			
		this.jMenuItemDetalleAbrirOrderByTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByTerminoProforma"));
			
		this.jMenuItemDetalleMostarOcultarTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarTerminoProforma"));		
		
		
		this.jButtonNuevoGuardarCambiosTerminoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosTerminoProforma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarTerminoProforma"));
			
		this.jMenuItemNuevoGuardarCambiosTerminoProforma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosTerminoProforma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosTerminoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosTerminoProforma"));

		this.jCheckBoxSeleccionadosTerminoProforma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosTerminoProforma"));
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioTerminoProforma"));
		}
		
		
		this.jComboBoxTiposRelacionesTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposRelacionesTerminoProforma"));
			
		this.jComboBoxTiposAccionesTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposAccionesTerminoProforma"));
					
		this.jComboBoxTiposSeleccionarTerminoProforma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarTerminoProforma"));
			
		this.jTextFieldValorCampoGeneralTerminoProforma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralTerminoProforma"));		
		
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonidTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_empresaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_empresaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_sucursalTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_sucursalTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_monedaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_monedaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_monedaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_proformaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_proformaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_proformaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_proformaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonatencionTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"atencionTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonregistro_sanitarioTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"registro_sanitarioTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonreferenciaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"referenciaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtondescripcionTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtondescripcion2TerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2TerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonmarcaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"marcaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonorigenTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"origenTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtongarantia_tecnicaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"garantia_tecnicaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonfecha_pagoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonfecha_entregaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonadjuntoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"adjuntoTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonresponsableTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"responsableTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtoncargoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"cargoTerminoProformaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdProformaTerminoProforma.addActionListener(new ButtonActionListener(this,"FK_IdProformaTerminoProforma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoTerminoProforma!=null) {
				this.jInternalFrameReporteDinamicoTerminoProforma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTerminoProforma"));
				this.jInternalFrameReporteDinamicoTerminoProforma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTerminoProforma"));
				this.jInternalFrameReporteDinamicoTerminoProforma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTerminoProforma"));
			}
			
			//this.jButtonCerrarReporteDinamicoTerminoProforma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoTerminoProforma"));				
			//this.jButtonGenerarReporteDinamicoTerminoProforma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoTerminoProforma"));
			//this.jButtonGenerarExcelReporteDinamicoTerminoProforma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoTerminoProforma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionTerminoProforma!=null) {
				this.jInternalFrameImportacionTerminoProforma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionTerminoProforma"));
				this.jInternalFrameImportacionTerminoProforma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionTerminoProforma"));
				this.jInternalFrameImportacionTerminoProforma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionTerminoProforma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByTerminoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByTerminoProforma"));
			
			this.jButtonAbrirOrderByToolBarTerminoProforma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarTerminoProforma"));			
			
			if(this.jInternalFrameOrderByTerminoProforma!=null) {
				this.jInternalFrameOrderByTerminoProforma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByTerminoProforma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormTerminoProforma.jTabbedPaneRelacionesTerminoProforma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesTerminoProforma"));
		
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
            		closingInternalFrameTerminoProforma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormTerminoProforma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormTerminoProforma = (JInternalFrameBase)event.getSource();
	            	
	            TerminoProformaBeanSwingJInternalFrame jInternalFrameParent=(TerminoProformaBeanSwingJInternalFrame)jInternalFrameDetalleFormTerminoProforma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarTerminoProformaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosTerminoProforma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosTerminoProformaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosTerminoProforma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosTerminoProforma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTerminoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTerminoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTerminoProformaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoTerminoProforma";
		inputMap = this.jButtonNuevoTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTerminoProformaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTerminoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTerminoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoTerminoProformaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesTerminoProforma";
		inputMap = this.jButtonNuevoRelacionesTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoTerminoProformaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarTerminoProforma";
		inputMap = this.jButtonModificarTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarTerminoProforma";
		inputMap = this.jButtonActualizarTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarTerminoProforma";
		inputMap = this.jButtonEliminarTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarTerminoProforma";
		inputMap = this.jButtonCancelarTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarTerminoProforma";
		inputMap = this.jButtonCerrarTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosTerminoProforma";
		inputMap = this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormTerminoProforma.jButtonGuardarCambiosTerminoProforma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosTerminoProformaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosTerminoProforma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosTerminoProformaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesTerminoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesTerminoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarTerminoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarTerminoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralTerminoProforma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralTerminoProformaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonidTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"idTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_empresaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_empresaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_sucursalTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_sucursalTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_sucursalTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_sucursalTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_monedaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_monedaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_monedaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_monedaTerminoProformaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_proformaTerminoProformaUpdate.addActionListener(new ButtonActionListener(this,"id_proformaTerminoProformaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonid_proformaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"id_proformaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonatencionTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"atencionTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonregistro_sanitarioTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"registro_sanitarioTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonreferenciaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"referenciaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtondescripcionTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtondescripcion2TerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"descripcion2TerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonmarcaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"marcaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonorigenTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"origenTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtongarantia_tecnicaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"garantia_tecnicaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonfecha_pagoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_pagoTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonfecha_entregaTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonadjuntoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"adjuntoTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtonresponsableTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"responsableTerminoProformaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormTerminoProforma.jButtoncargoTerminoProformaBusqueda.addActionListener(new ButtonActionListener(this,"cargoTerminoProformaBusqueda"));
		
		
		this.jButtonFK_IdProformaTerminoProforma.addActionListener(new ButtonActionListener(this,"FK_IdProformaTerminoProforma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionTerminoProforma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionTerminoProformaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarTerminoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarTerminoProforma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosTerminoProforma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
					terminoproformaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TerminoProforma terminoproformaAux:terminoproformas) {
					terminoproformaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosTerminoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTerminoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
						terminoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TerminoProforma terminoproformaAux:terminoproformas) {
						terminoproformaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TerminoProforma terminoproformaAux:terminoproformas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaTerminoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTerminoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTerminoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosTerminoProformaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingTerminoProforma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosTerminoProforma.getSelectedRows();
			
			TerminoProforma terminoproformaLocal=new TerminoProforma();
			
			//this.seleccionarTodosTerminoProforma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					terminoproformaLocal =(TerminoProforma) this.terminoproformaLogic.getTerminoProformas().toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					terminoproformaLocal =(TerminoProforma) this.terminoproformas.toArray()[this.jTableDatosTerminoProforma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				terminoproformaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
						terminoproformaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(TerminoProforma terminoproformaAux:terminoproformas) {
						terminoproformaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaTerminoProforma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosTerminoProforma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosTerminoProforma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosTerminoProforma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualTerminoProformaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarTerminoProformaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralTerminoProformaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingTerminoProforma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralTerminoProforma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(TerminoProforma terminoproformaAux:this.terminoproformaLogic.getTerminoProformas()) {
				
						if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ATENCION)) {
							existe=true;
							terminoproformaAux.setatencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO)) {
							existe=true;
							terminoproformaAux.setregistro_sanitario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							terminoproformaAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							terminoproformaAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							terminoproformaAux.setdescripcion2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							terminoproformaAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ORIGEN)) {
							existe=true;
							terminoproformaAux.setorigen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA)) {
							existe=true;
							terminoproformaAux.setgarantia_tecnica(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							terminoproformaAux.setfecha_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							terminoproformaAux.setfecha_entrega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ADJUNTO)) {
							existe=true;
							terminoproformaAux.setadjunto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							terminoproformaAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_CARGO)) {
							existe=true;
							terminoproformaAux.setcargo(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TerminoProforma terminoproformaAux:terminoproformas) {
					
						if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ATENCION)) {
							existe=true;
							terminoproformaAux.setatencion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO)) {
							existe=true;
							terminoproformaAux.setregistro_sanitario(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_REFERENCIA)) {
							existe=true;
							terminoproformaAux.setreferencia(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							terminoproformaAux.setdescripcion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2)) {
							existe=true;
							terminoproformaAux.setdescripcion2(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_MARCA)) {
							existe=true;
							terminoproformaAux.setmarca(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ORIGEN)) {
							existe=true;
							terminoproformaAux.setorigen(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA)) {
							existe=true;
							terminoproformaAux.setgarantia_tecnica(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO)) {
							existe=true;
							terminoproformaAux.setfecha_pago(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							terminoproformaAux.setfecha_entrega(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ADJUNTO)) {
							existe=true;
							terminoproformaAux.setadjunto(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE)) {
							existe=true;
							terminoproformaAux.setresponsable(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_CARGO)) {
							existe=true;
							terminoproformaAux.setcargo(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaTerminoProforma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesTerminoProformaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingTerminoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioTerminoProforma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesTerminoProforma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteTerminoProforma) {				
					conSplash=true;//false;										
					
					//this.startProcessTerminoProforma(conSplash);
				
					this.generarReporteTerminoProformasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoTerminoProformasSeleccionados();
				//this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTerminoProformasSeleccionados(false);
				//this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoTerminoProformasSeleccionados(true);
				//this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTerminoProforma();
				
				this.exportarTerminoProformasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionTerminoProformas();
				//this.importarTerminoProformas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessTerminoProforma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelTerminoProformasSeleccionados();
				//this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessTerminoProforma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoTerminoProforma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyTerminoProforma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
				}	
			} 			
			else if(TerminoProformaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteTerminoProforma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessTerminoProforma(conSplash);
					
						//this.actualizarParametrosGeneralTerminoProforma();
						
						this.generarReporteProcesoAccionTerminoProformasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(TerminoProformaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Termino ProformaS SELECCIONADOS?", "MANTENIMIENTO DE Termino Proforma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessTerminoProforma();
				
						this.actualizarParametrosGeneralTerminoProforma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.terminoproformaReturnGeneral=terminoproformaLogic.procesarAccionTerminoProformasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.terminoproformaLogic.getTerminoProformas(),this.terminoproformaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarTerminoProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralTerminoProforma();
					
					TerminoProformaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarTerminoProformaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesTerminoProforma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormTerminoProforma.jComboBoxTiposAccionesFormularioTerminoProforma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessTerminoProforma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesTerminoProformaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessTerminoProforma();
			
			if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
			TerminoProforma terminoproforma=new TerminoProforma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingTerminoProforma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesTerminoProforma.getSelectedItem();
			
			
			
			
			terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
			//this.sTipoAccion;
			
			if(terminoproformasSeleccionados.size()==1) {
				for(TerminoProforma terminoproformaAux:terminoproformasSeleccionados) {
					terminoproforma=terminoproformaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Termino Proforma")) {
					jButtonDetalleTerminoProformaActionPerformed(null,rowIndex,true,false,terminoproforma);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessTerminoProforma();
			
      		//this.finishProcessTerminoProforma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarTerminoProformaReturnGeneral() throws Exception {
		if(this.terminoproformaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.terminoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.terminoproformaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.terminoproformaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.terminoproformaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.terminoproformaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingTerminoProforma(false);
		}
		
		if(this.terminoproformaReturnGeneral.getConRetornoLista() || this.terminoproformaReturnGeneral.getConRetornoObjeto()) {
			if(this.terminoproformaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.terminoproformaLogic.setTerminoProformas(this.terminoproformaReturnGeneral.getTerminoProformas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.terminoproformaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.terminoproformaLogic.setTerminoProforma(this.terminoproformaReturnGeneral.getTerminoProforma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingTerminoProforma(false);
		}
	}
	
	public void actualizarParametrosGeneralTerminoProforma() throws Exception {
		
		
	}
	
	public ArrayList<TerminoProforma> getTerminoProformasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioTerminoProforma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(TerminoProforma terminoproformaAux:terminoproformaLogic.getTerminoProformas()) {
					if(terminoproformaAux.getIsSelected()) {
						terminoproformasSeleccionados.add(terminoproformaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(TerminoProforma terminoproformaAux:this.terminoproformas) {
					if(terminoproformaAux.getIsSelected()) {
						terminoproformasSeleccionados.add(terminoproformaAux);				
					}
				}
			}
			
			if(terminoproformasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						terminoproformasSeleccionados.addAll(this.terminoproformaLogic.getTerminoProformas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						terminoproformasSeleccionados.addAll(this.terminoproformas);				
					}
				}
			}
		} else {
			terminoproformasSeleccionados.add(this.terminoproforma);
		}
		
		return terminoproformasSeleccionados;
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
	
	public void generarReporteTerminoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalTerminoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoTerminoProformasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTerminoProformasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoTerminoProformasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesTerminoProformasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Termino Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesTerminoProformasSeleccionados() throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados);
		
	}	
	
	public void generarReporteNormalTerminoProformasSeleccionados() throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionTerminoProformasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoTerminoProformasSeleccionados() throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoTerminoProforma();
		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoTerminoProforma();
		
		
		//this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados ,terminoproformaImplementable,terminoproformaImplementableHome);
	}
	
	public void mostrarImportacionTerminoProformas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionTerminoProforma();
		
		this.abrirFrameImportacionTerminoProforma();		
		
			
		//this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados ,terminoproformaImplementable,terminoproformaImplementableHome);
	}
	
	public void importarTerminoProformas() throws Exception {		
	
	}
	
	public void exportarTerminoProformasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelTerminoProformasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoTerminoProformasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlTerminoProformasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Termino Proforma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoTerminoProformasSeleccionados() throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarTerminoProforma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(TerminoProforma terminoproformaAux:terminoproformasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarTerminoProforma(terminoproformaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//terminoproformaAux.setsDetalleGeneralEntityReporte(terminoproformaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarTerminoProforma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_IDMONEDA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_IDPROFORMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_ATENCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_REFERENCIA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_MARCA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_ORIGEN;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_FECHAPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_ADJUNTO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_RESPONSABLE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=TerminoProformaConstantesFunciones.LABEL_CARGO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarTerminoProforma(TerminoProforma terminoproforma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=terminoproforma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getsucursal_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getmoneda_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getproforma_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getatencion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getregistro_sanitario();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getreferencia();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getdescripcion2();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getmarca();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getorigen();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getgarantia_tecnica();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getfecha_pago();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getfecha_entrega();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getadjunto();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getresponsable();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=terminoproforma.getcargo();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelTerminoProformasSeleccionados() throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("TerminoProformas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelTerminoProforma(row);				
				iRow++;
			}				
			
			for(TerminoProforma terminoproformaAux:terminoproformasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelTerminoProforma(terminoproformaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlTerminoProformasSeleccionados() throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();		
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"terminoproforma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("terminoproformas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("terminoproforma");
			//elementRoot.appendChild(element);
		
			for(TerminoProforma terminoproformaAux:terminoproformasSeleccionados) {
				element = document.createElement("terminoproforma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlTerminoProforma(terminoproformaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Termino Proforma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelTerminoProforma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDMONEDA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_IDPROFORMA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ATENCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_REFERENCIA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_MARCA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ORIGEN);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_ADJUNTO);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE);
		cell = row.createCell(iColumn++);cell.setCellValue(TerminoProformaConstantesFunciones.LABEL_CARGO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelTerminoProforma(TerminoProforma terminoproforma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getsucursal_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getmoneda_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getproforma_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getatencion());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getregistro_sanitario());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getreferencia());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getdescripcion2());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getmarca());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getorigen());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getgarantia_tecnica());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getfecha_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getadjunto());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getresponsable());
		cell = row.createCell(iColumn++);cell.setCellValue(terminoproforma.getcargo());				
	}
	
	public void setFilaDatosExportarXmlTerminoProforma(TerminoProforma terminoproforma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(TerminoProformaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(terminoproforma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(TerminoProformaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(terminoproforma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(TerminoProformaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(terminoproforma.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementsucursal_descripcion = document.createElement(TerminoProformaConstantesFunciones.IDSUCURSAL);
		elementsucursal_descripcion.appendChild(document.createTextNode(terminoproforma.getsucursal_descripcion()));
		element.appendChild(elementsucursal_descripcion);

		Element elementmoneda_descripcion = document.createElement(TerminoProformaConstantesFunciones.IDMONEDA);
		elementmoneda_descripcion.appendChild(document.createTextNode(terminoproforma.getmoneda_descripcion()));
		element.appendChild(elementmoneda_descripcion);

		Element elementproforma_descripcion = document.createElement(TerminoProformaConstantesFunciones.IDPROFORMA);
		elementproforma_descripcion.appendChild(document.createTextNode(terminoproforma.getproforma_descripcion()));
		element.appendChild(elementproforma_descripcion);

		Element elementatencion = document.createElement(TerminoProformaConstantesFunciones.ATENCION);
		elementatencion.appendChild(document.createTextNode(terminoproforma.getatencion().trim()));
		element.appendChild(elementatencion);

		Element elementregistro_sanitario = document.createElement(TerminoProformaConstantesFunciones.REGISTROSANITARIO);
		elementregistro_sanitario.appendChild(document.createTextNode(terminoproforma.getregistro_sanitario().trim()));
		element.appendChild(elementregistro_sanitario);

		Element elementreferencia = document.createElement(TerminoProformaConstantesFunciones.REFERENCIA);
		elementreferencia.appendChild(document.createTextNode(terminoproforma.getreferencia().trim()));
		element.appendChild(elementreferencia);

		Element elementdescripcion = document.createElement(TerminoProformaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(terminoproforma.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementdescripcion2 = document.createElement(TerminoProformaConstantesFunciones.DESCRIPCION2);
		elementdescripcion2.appendChild(document.createTextNode(terminoproforma.getdescripcion2().trim()));
		element.appendChild(elementdescripcion2);

		Element elementmarca = document.createElement(TerminoProformaConstantesFunciones.MARCA);
		elementmarca.appendChild(document.createTextNode(terminoproforma.getmarca().trim()));
		element.appendChild(elementmarca);

		Element elementorigen = document.createElement(TerminoProformaConstantesFunciones.ORIGEN);
		elementorigen.appendChild(document.createTextNode(terminoproforma.getorigen().trim()));
		element.appendChild(elementorigen);

		Element elementgarantia_tecnica = document.createElement(TerminoProformaConstantesFunciones.GARANTIATECNICA);
		elementgarantia_tecnica.appendChild(document.createTextNode(terminoproforma.getgarantia_tecnica().trim()));
		element.appendChild(elementgarantia_tecnica);

		Element elementfecha_pago = document.createElement(TerminoProformaConstantesFunciones.FECHAPAGO);
		elementfecha_pago.appendChild(document.createTextNode(terminoproforma.getfecha_pago().trim()));
		element.appendChild(elementfecha_pago);

		Element elementfecha_entrega = document.createElement(TerminoProformaConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(terminoproforma.getfecha_entrega().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementadjunto = document.createElement(TerminoProformaConstantesFunciones.ADJUNTO);
		elementadjunto.appendChild(document.createTextNode(terminoproforma.getadjunto().trim()));
		element.appendChild(elementadjunto);

		Element elementresponsable = document.createElement(TerminoProformaConstantesFunciones.RESPONSABLE);
		elementresponsable.appendChild(document.createTextNode(terminoproforma.getresponsable().trim()));
		element.appendChild(elementresponsable);

		Element elementcargo = document.createElement(TerminoProformaConstantesFunciones.CARGO);
		elementcargo.appendChild(document.createTextNode(terminoproforma.getcargo().trim()));
		element.appendChild(elementcargo);
	}
	
	public void generarReporteGroupGenericoTerminoProformasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<TerminoProforma> terminoproformasSeleccionados=new ArrayList<TerminoProforma>();
		
		terminoproformasSeleccionados=this.getTerminoProformasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoTerminoProforma(terminoproformasSeleccionados);
		
		this.generarReporteTerminoProformas("Todos",terminoproformasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoTerminoProforma(ArrayList<TerminoProforma> terminoproformasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(TerminoProforma terminoproformaAux:terminoproformasSeleccionados) {
				terminoproformaAux.setsDetalleGeneralEntityReporte(terminoproformaAux.toString());
			
				if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_IDSUCURSAL)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getsucursal_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_IDMONEDA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getmoneda_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_IDPROFORMA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getproforma_descripcion());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ATENCION)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getatencion());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_REGISTROSANITARIO)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getregistro_sanitario());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_REFERENCIA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getreferencia());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_DESCRIPCION2)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getdescripcion2());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_MARCA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getmarca());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ORIGEN)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getorigen());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_GARANTIATECNICA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getgarantia_tecnica());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_FECHAPAGO)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getfecha_pago());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getfecha_entrega());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_ADJUNTO)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getadjunto());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_RESPONSABLE)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getresponsable());
				}
				 else if(sTipoSeleccionar.equals(TerminoProformaConstantesFunciones.LABEL_CARGO)) {
					existe=true;
					terminoproformaAux.setsDescripcionGeneralEntityReporte1(terminoproformaAux.getcargo());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,TerminoProformaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesTerminoProforma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoTerminoProforma=true;
				this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=true;
				this.isVisibilidadCeldaGuardarCambiosTerminoProforma=true;
			}
			
			this.isVisibilidadCeldaModificarTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=false;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
			this.isVisibilidadCeldaModificarTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=true;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
			this.isVisibilidadCeldaModificarTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=true;
			this.isVisibilidadCeldaEliminarTerminoProforma=true;
			this.isVisibilidadCeldaCancelarTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
			this.isVisibilidadCeldaModificarTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=true;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoTerminoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=true;
			this.isVisibilidadCeldaModificarTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=false;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=true;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
			this.isVisibilidadCeldaActualizarTerminoProforma=false;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
			this.isVisibilidadCeldaModificarTerminoProforma=true;
			this.isVisibilidadCeldaActualizarTerminoProforma=false;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
			this.isVisibilidadCeldaCancelarTerminoProforma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				} else {
					this.isVisibilidadCeldaGuardarTerminoProforma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(TerminoProformaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoTerminoProforma=true;
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=true;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=true;
		} else {
			this.actualizarEstadoPanelsTerminoProforma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarTerminoProforma=false;
			//this.isVisibilidadCeldaVerFormTerminoProforma=false;
			this.isVisibilidadCeldaDuplicarTerminoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!terminoproformaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
		} else {
			this.isVisibilidadCeldaNuevoTerminoProforma=false;
			this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(terminoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!terminoproformaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;												
			}
			
			this.jButtonCerrarTerminoProforma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesTerminoProforma=false;
		}
		
		if(!this.permiteMantenimiento(this.terminoproforma)) {
			this.isVisibilidadCeldaActualizarTerminoProforma=false;
			this.isVisibilidadCeldaEliminarTerminoProforma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesTerminoProforma() {
		this.isVisibilidadCeldaNuevoTerminoProforma=false;
		this.isVisibilidadCeldaGuardarCambiosTerminoProforma=false;
	}
	
	public void actualizarEstadoPanelsTerminoProforma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionTerminoProforma!=null) {
				this.jScrollPanelDatosEdicionTerminoProforma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosTerminoProforma!=null) {
				this.jScrollPanelDatosTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelPaginacionTerminoProforma!=null) {
				this.jPanelPaginacionTerminoProforma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
					this.jTabbedPaneBusquedasTerminoProforma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.terminoproformaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasTerminoProforma!=null) {
				this.jTabbedPaneBusquedasTerminoProforma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesTerminoProforma!=null) {
				this.jPanelParametrosReportesTerminoProforma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdProforma=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdProforma) {this.jTabbedPaneBusquedasTerminoProforma.remove(jPanelFK_IdProformaTerminoProforma);}
		}
		
	}

	public void setVisibilidadBusquedasParaSucursal(Boolean isParaSucursal){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaSucursalNegation=!isParaSucursal;

			this.isVisibilidadFK_IdProforma=isParaSucursalNegation;
			if(!this.isVisibilidadFK_IdProforma) {this.jTabbedPaneBusquedasTerminoProforma.remove(jPanelFK_IdProformaTerminoProforma);}
		}
		
	}

	public void setVisibilidadBusquedasParaMoneda(Boolean isParaMoneda){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMonedaNegation=!isParaMoneda;

			this.isVisibilidadFK_IdProforma=isParaMonedaNegation;
			if(!this.isVisibilidadFK_IdProforma) {this.jTabbedPaneBusquedasTerminoProforma.remove(jPanelFK_IdProformaTerminoProforma);}
		}
		
	}

	public void setVisibilidadBusquedasParaProforma(Boolean isParaProforma){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaProformaNegation=!isParaProforma;

			this.isVisibilidadFK_IdProforma=isParaProforma;
			if(!this.isVisibilidadFK_IdProforma) {this.jTabbedPaneBusquedasTerminoProforma.remove(jPanelFK_IdProformaTerminoProforma);}
		}
		
	}
	
	

	public String registrarSesionTerminoProformaParaDetalleTerminoProformas() throws Exception {
		Boolean isPaginaPopupDetalleTerminoProforma=false;

		try {

			if(this.terminoproformaSessionBean==null) {
				this.terminoproformaSessionBean=new TerminoProformaSessionBean();
			}

			if(this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean==null) {
				this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean=new DetalleTerminoProformaSessionBean();
			}

			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setsPathNavegacionActual(terminoproformaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleTerminoProformaConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleTerminoProforma=this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma(true);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleTerminoProforma(TerminoProformaConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setisBusquedaDesdeForeignKeySesionTerminoProforma(true);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setlidTerminoProformaActual(this.idTerminoProformaActual);
			this.jInternalFrameDetalleFormTerminoProforma.detalleterminoproformaSessionBean.setNoMantenimiento(true);

			terminoproformaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyTerminoProforma(true);
			terminoproformaSessionBean.setlIdTerminoProformaActualForeignKey(this.idTerminoProformaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//TerminoProformaSessionBean terminoproformaSessionBean=new TerminoProformaSessionBean();
		
		if(this.terminoproformaSessionBean==null) {
			this.terminoproformaSessionBean=new TerminoProformaSessionBean();
		}
		
		this.terminoproformaSessionBean.setsUltimaBusquedaTerminoProforma(this.getsAccionBusqueda());
		this.terminoproformaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.terminoproformaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			terminoproformaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
			terminoproformaSessionBean.setid_moneda(this.getid_monedaFK_IdMoneda());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdProforma")) {
			terminoproformaSessionBean.setid_proforma(this.getid_proformaFK_IdProforma());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
			terminoproformaSessionBean.setid_sucursal(this.getid_sucursalFK_IdSucursal());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//TerminoProformaSessionBean terminoproformaSessionBean=new TerminoProformaSessionBean();
		
		if(this.terminoproformaSessionBean==null) {
			this.terminoproformaSessionBean=new TerminoProformaSessionBean();
		}
		
		if(this.terminoproformaSessionBean.getsUltimaBusquedaTerminoProforma()!=null&&!this.terminoproformaSessionBean.getsUltimaBusquedaTerminoProforma().equals("")) {
			this.setsAccionBusqueda(terminoproformaSessionBean.getsUltimaBusquedaTerminoProforma());
			this.setiNumeroPaginacion(terminoproformaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(terminoproformaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(terminoproformaSessionBean.getid_empresa());
				terminoproformaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMoneda")) {
				this.setid_monedaFK_IdMoneda(terminoproformaSessionBean.getid_moneda());
				terminoproformaSessionBean.setid_moneda(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdProforma")) {
				this.setid_proformaFK_IdProforma(terminoproformaSessionBean.getid_proforma());
				terminoproformaSessionBean.setid_proforma(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdSucursal")) {
				this.setid_sucursalFK_IdSucursal(terminoproformaSessionBean.getid_sucursal());
				terminoproformaSessionBean.setid_sucursal(-1L);
			}
		}
		
		this.terminoproformaSessionBean.setsUltimaBusquedaTerminoProforma("");
		this.terminoproformaSessionBean.setiNumeroPaginacion(TerminoProformaConstantesFunciones.INUMEROPAGINACION);
		this.terminoproformaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaTerminoProforma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioTerminoProforma() {
		this.updateBorderResaltarBusquedasFormularioTerminoProforma();
		this.updateVisibilidadBusquedasFormularioTerminoProforma();
		this.updateHabilitarBusquedasFormularioTerminoProforma();
	}
	
	public void updateBorderResaltarBusquedasFormularioTerminoProforma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasTerminoProforma.getComponents().length>0) {
	

		if(this.terminoproformaConstantesFunciones.resaltarFK_IdProformaTerminoProforma!=null) {
			index= this.jTabbedPaneBusquedasTerminoProforma.indexOfComponent(this.jPanelFK_IdProformaTerminoProforma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTerminoProforma.getComponent(index);
				jPanel.setBorder(this.terminoproformaConstantesFunciones.resaltarFK_IdProformaTerminoProforma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioTerminoProforma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasTerminoProforma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTerminoProforma.indexOfComponent(this.jPanelFK_IdProformaTerminoProforma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasTerminoProforma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.terminoproformaConstantesFunciones.mostrarFK_IdProformaTerminoProforma);
			if(!this.terminoproformaConstantesFunciones.mostrarFK_IdProformaTerminoProforma && index>-1) {
				this.jTabbedPaneBusquedasTerminoProforma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioTerminoProforma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasTerminoProforma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasTerminoProforma.indexOfComponent(this.jPanelFK_IdProformaTerminoProforma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasTerminoProforma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.terminoproformaConstantesFunciones.activarFK_IdProformaTerminoProforma);
				this.jTabbedPaneBusquedasTerminoProforma.setEnabledAt(index,this.terminoproformaConstantesFunciones.activarFK_IdProformaTerminoProforma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaTerminoProforma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdProforma")) {
			index= this.jTabbedPaneBusquedasTerminoProforma.indexOfComponent(this.jPanelFK_IdProformaTerminoProforma);

			this.jTabbedPaneBusquedasTerminoProforma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasTerminoProforma.getComponent(index);

			this.terminoproformaConstantesFunciones.setResaltarFK_IdProformaTerminoProforma(resaltar);

			jPanel.setBorder(this.terminoproformaConstantesFunciones.resaltarFK_IdProformaTerminoProforma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarTerminoProforma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioTerminoProforma() throws Exception {

		if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioTerminoProforma();
		this.updateVisibilidadResaltarControlesFormularioTerminoProforma();
		this.updateHabilitarResaltarControlesFormularioTerminoProforma();
		
	}
	
	public void updateBorderResaltarControlesFormularioTerminoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.terminoproformaConstantesFunciones.resaltaridTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltaridTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarid_empresaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarid_empresaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarid_sucursalTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarid_sucursalTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarid_monedaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarid_monedaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarid_proformaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarid_proformaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltaratencionTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltaratencionTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarregistro_sanitarioTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarregistro_sanitarioTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarreferenciaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarreferenciaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltardescripcionTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltardescripcionTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltardescripcion2TerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltardescripcion2TerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarmarcaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarmarcaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarorigenTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarorigenTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltargarantia_tecnicaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltargarantia_tecnicaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarfecha_pagoTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarfecha_pagoTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarfecha_entregaTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarfecha_entregaTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltaradjuntoTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltaradjuntoTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarresponsableTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarresponsableTerminoProforma);}
		if(this.terminoproformaConstantesFunciones.resaltarcargoTerminoProforma!=null && this.jInternalFrameDetalleFormTerminoProforma!=null) {this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setBorder(this.terminoproformaConstantesFunciones.resaltarcargoTerminoProforma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioTerminoProforma() throws Exception {		
		if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
	
		//this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostraridTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelidTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostraridTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_empresaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelid_empresaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_empresaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_sucursalTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelid_sucursalTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_sucursalTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_monedaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelid_monedaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_monedaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_proformaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelid_proformaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarid_proformaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostraratencionTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelatencionTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostraratencionTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarregistro_sanitarioTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelregistro_sanitarioTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarregistro_sanitarioTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarreferenciaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelreferenciaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarreferenciaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrardescripcionTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPaneldescripcionTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrardescripcionTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrardescripcion2TerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPaneldescripcion2TerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrardescripcion2TerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarmarcaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelmarcaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarmarcaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarorigenTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelorigenTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarorigenTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrargarantia_tecnicaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelgarantia_tecnicaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrargarantia_tecnicaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarfecha_pagoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelfecha_pagoTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarfecha_pagoTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarfecha_entregaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelfecha_entregaTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarfecha_entregaTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostraradjuntoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPaneladjuntoTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostraradjuntoTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarresponsableTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelresponsableTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarresponsableTerminoProforma);
		//this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarcargoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jPanelcargoTerminoProforma.setVisible(this.terminoproformaConstantesFunciones.mostrarcargoTerminoProforma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioTerminoProforma() throws Exception {
		if(this.jInternalFrameDetalleFormTerminoProforma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormTerminoProforma!=null) {
	
		this.jInternalFrameDetalleFormTerminoProforma.jLabelidTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activaridTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_empresaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarid_empresaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_sucursalTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarid_sucursalTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_monedaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarid_monedaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jComboBoxid_proformaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarid_proformaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreaatencionTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activaratencionTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldregistro_sanitarioTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarregistro_sanitarioTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreareferenciaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarreferenciaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcionTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activardescripcionTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreadescripcion2TerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activardescripcion2TerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldmarcaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarmarcaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldorigenTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarorigenTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldgarantia_tecnicaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activargarantia_tecnicaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_pagoTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarfecha_pagoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldfecha_entregaTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarfecha_entregaTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextAreaadjuntoTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activaradjuntoTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextArearesponsableTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarresponsableTerminoProforma);
		this.jInternalFrameDetalleFormTerminoProforma.jTextFieldcargoTerminoProforma.setEnabled(this.terminoproformaConstantesFunciones.activarcargoTerminoProforma);
		}
	}
	
		
}