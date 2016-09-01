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

import com.bydan.erp.activosfijos.util.AseguradoraConstantesFunciones;
import com.bydan.erp.activosfijos.util.AseguradoraParameterReturnGeneral;
//import com.bydan.erp.activosfijos.util.AseguradoraParameterGeneral;
//import com.bydan.erp.activosfijos.presentation.report.source.AseguradoraBean;
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
public class AseguradoraBeanSwingJInternalFrame extends AseguradoraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(AseguradoraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<Aseguradora> aseguradoraValidator = new ClassValidator<Aseguradora>(Aseguradora.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public Aseguradora aseguradora;	
	public Aseguradora aseguradoraAux;
	public Aseguradora aseguradoraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public Aseguradora aseguradoraTotales;
	public Long idAseguradoraActual;
	public Long iIdNuevoAseguradora=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosVehiculo=false;

	public Boolean getIsTienePermisosVehiculo() {
		return isTienePermisosVehiculo;
	}

	public void setIsTienePermisosVehiculo(Boolean isTienePermisosVehiculo) {
		this.isTienePermisosVehiculo= isTienePermisosVehiculo;
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
	
	public Boolean isPermisoTodoAseguradora;
	public Boolean isPermisoNuevoAseguradora;
	public Boolean isPermisoActualizarAseguradora;
	public Boolean isPermisoActualizarOriginalAseguradora;
	public Boolean isPermisoEliminarAseguradora;
	public Boolean isPermisoGuardarCambiosAseguradora;
	public Boolean isPermisoConsultaAseguradora;
	public Boolean isPermisoBusquedaAseguradora;
	public Boolean isPermisoReporteAseguradora;
	public Boolean isPermisoPaginacionMedioAseguradora;
	public Boolean isPermisoPaginacionAltoAseguradora;
	public Boolean isPermisoPaginacionTodoAseguradora;
	public Boolean isPermisoCopiarAseguradora;
	public Boolean isPermisoVerFormAseguradora;
	public Boolean isPermisoDuplicarAseguradora;
	public Boolean isPermisoOrdenAseguradora;
	
	
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
	
	public AseguradoraParameterReturnGeneral aseguradoraReturnGeneral;
	public AseguradoraParameterReturnGeneral aseguradoraParameterGeneral;
	
	

	public VehiculoLogic vehiculoLogic=null;

	public VehiculoLogic getVehiculoLogic() {
		return vehiculoLogic;
	}

	public void setVehiculoLogic(VehiculoLogic vehiculoLogic) {
		this.vehiculoLogic = vehiculoLogic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoAseguradora=false;
	public Boolean esParaAccionDesdeFormularioAseguradora=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected AseguradoraSessionBeanAdditional aseguradoraSessionBeanAdditional=null;
	
	public AseguradoraSessionBeanAdditional getAseguradoraSessionBeanAdditional() {
		return this.aseguradoraSessionBeanAdditional;
	}
	
	public void setAseguradoraSessionBeanAdditional(AseguradoraSessionBeanAdditional aseguradoraSessionBeanAdditional) {
		try {
			this.aseguradoraSessionBeanAdditional=aseguradoraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected AseguradoraBeanSwingJInternalFrameAdditional aseguradoraBeanSwingJInternalFrameAdditional=null;
	//public class AseguradoraBeanSwingJInternalFrame
	
	public AseguradoraBeanSwingJInternalFrameAdditional getAseguradoraBeanSwingJInternalFrameAdditional() {
		return this.aseguradoraBeanSwingJInternalFrameAdditional;
	}
	
	public void setAseguradoraBeanSwingJInternalFrameAdditional(AseguradoraBeanSwingJInternalFrameAdditional aseguradoraBeanSwingJInternalFrameAdditional) {
		try {
			this.aseguradoraBeanSwingJInternalFrameAdditional=aseguradoraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public AseguradoraLogic aseguradoraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public Aseguradora aseguradoraBean;
	public AseguradoraConstantesFunciones aseguradoraConstantesFunciones;
	//public AseguradoraParameterReturnGeneral aseguradoraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	
	//PARAMETROS
	
	
	//public List<Aseguradora> aseguradoras;	
	//public List<Aseguradora> aseguradorasEliminados;
	//public List<Aseguradora> aseguradorasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoAseguradora=false;
	public Boolean isVisibilidadCeldaDuplicarAseguradora=true;
	public Boolean isVisibilidadCeldaCopiarAseguradora=true;
	public Boolean isVisibilidadCeldaVerFormAseguradora=true;
	public Boolean isVisibilidadCeldaOrdenAseguradora=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesAseguradora=false;
	public Boolean isVisibilidadCeldaModificarAseguradora=false;
	public Boolean isVisibilidadCeldaActualizarAseguradora=false;
	public Boolean isVisibilidadCeldaEliminarAseguradora=false;
	public Boolean isVisibilidadCeldaCancelarAseguradora=false;
	public Boolean isVisibilidadCeldaGuardarAseguradora=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosAseguradora=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoAseguradora() {
		return this.iIdNuevoAseguradora;
	}

	public void setiIdNuevoAseguradora(Long iIdNuevoAseguradora) {
		this.iIdNuevoAseguradora = iIdNuevoAseguradora;
	}
	
	public Long getidAseguradoraActual() {
		return this.idAseguradoraActual;
	}

	public void setidAseguradoraActual(Long idAseguradoraActual) {
		this.idAseguradoraActual = idAseguradoraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public Aseguradora getaseguradora() {
		return this.aseguradora;
	}

	public void setaseguradora(Aseguradora aseguradora) {
		this.aseguradora = aseguradora;
	}
	
	public Aseguradora getaseguradoraAux() {
		return this.aseguradoraAux;
	}

	public void setaseguradoraAux(Aseguradora aseguradoraAux) {
		this.aseguradoraAux = aseguradoraAux;
	}				
	
	public Aseguradora getaseguradoraAnterior() {
		return this.aseguradoraAnterior;
	}

	public void setaseguradoraAnterior(Aseguradora aseguradoraAnterior) {
		this.aseguradoraAnterior = aseguradoraAnterior;
	}	
	
	public Aseguradora getaseguradoraTotales() {
		return this.aseguradoraTotales;
	}

	public void setaseguradoraTotales(Aseguradora aseguradoraTotales) {
		this.aseguradoraTotales = aseguradoraTotales;
	}	
	
	public Aseguradora getaseguradoraBean() {
		return this.aseguradoraBean;
	}

	public void setaseguradoraBean(Aseguradora aseguradoraBean) {
		this.aseguradoraBean = aseguradoraBean;
	}	
	
	public AseguradoraParameterReturnGeneral getaseguradoraReturnGeneral() {
		return this.aseguradoraReturnGeneral;
	}

	public void setaseguradoraReturnGeneral(AseguradoraParameterReturnGeneral aseguradoraReturnGeneral) {
		this.aseguradoraReturnGeneral = aseguradoraReturnGeneral;
	}	
	
	
	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public AseguradoraLogic getAseguradoraLogic()	{		
		return aseguradoraLogic;
	}

	public void setAseguradoraLogic(AseguradoraLogic aseguradoraLogic) {
		this.aseguradoraLogic = aseguradoraLogic;
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
	
	public Boolean getIsEsNuevoAseguradora() {
		return isEsNuevoAseguradora;
	}

	public void setIsEsNuevoAseguradora(Boolean isEsNuevoAseguradora) {
		this.isEsNuevoAseguradora = isEsNuevoAseguradora;
	}

	public Boolean getEsParaAccionDesdeFormularioAseguradora() {
		return esParaAccionDesdeFormularioAseguradora;
	}
	
	public void setEsParaAccionDesdeFormularioAseguradora(Boolean esParaAccionDesdeFormularioAseguradora) {
		this.esParaAccionDesdeFormularioAseguradora = esParaAccionDesdeFormularioAseguradora;
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

			if(this.aseguradoraSessionBean==null) {
				this.aseguradoraSessionBean=new AseguradoraSessionBean();
			}

			if(!this.aseguradoraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(aseguradoraSessionBean.getlidEmpresaActual());
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

					if(this.aseguradora!=null) {
						this.aseguradora.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormAseguradora!=null) {
						this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaAseguradora.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormAseguradora!=null) {
						if(this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.getItemCount()>0) {
							this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaAseguradoraGenerico)throws Exception
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
				jComboBoxid_empresaAseguradoraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaAseguradoraGenerico!=null && jComboBoxid_empresaAseguradoraGenerico.getItemCount()>0) {
					jComboBoxid_empresaAseguradoraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(Aseguradora aseguradora,JComboBox jComboBoxid_empresaAseguradoraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaAseguradoraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaAseguradoraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				aseguradora.setid_empresa(empresaAux.getId());
				aseguradora.setempresa_descripcion(AseguradoraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				aseguradora.setEmpresa(empresaAux);			}
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

					if(!AseguradoraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormAseguradora!=null) { 
							this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormAseguradora!=null) { 
					}

					if(!AseguradoraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormAseguradora!=null) {
							this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormAseguradora!=null) {
							this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesAseguradora() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			AseguradoraConstantesFunciones.refrescarForeignKeysDescripcionesAseguradora(this.aseguradoraLogic.getAseguradoras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			AseguradoraConstantesFunciones.refrescarForeignKeysDescripcionesAseguradora(this.aseguradoras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//aseguradoraLogic.setAseguradoras(this.aseguradoras);
			aseguradoraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public AseguradoraParameterReturnGeneral getAseguradoraParameterGeneral() {
		return this.aseguradoraParameterGeneral;
	}
	
	public void setAseguradoraParameterGeneral(AseguradoraParameterReturnGeneral aseguradoraParameterGeneral) {
		this.aseguradoraParameterGeneral = aseguradoraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoAseguradora() {
		return isPermisoTodoAseguradora;
	}

	public void setIsPermisoTodoAseguradora(Boolean isPermisoTodoAseguradora) {
		this.isPermisoTodoAseguradora = isPermisoTodoAseguradora;
	}

	public Boolean getIsPermisoNuevoAseguradora() {
		return isPermisoNuevoAseguradora;
	}

	public void setIsPermisoNuevoAseguradora(Boolean isPermisoNuevoAseguradora) {
		this.isPermisoNuevoAseguradora = isPermisoNuevoAseguradora;
	}

	public Boolean getIsPermisoActualizarAseguradora() {
		return isPermisoActualizarAseguradora;
	}

	public void setIsPermisoActualizarAseguradora(Boolean isPermisoActualizarAseguradora) {
		this.isPermisoActualizarAseguradora = isPermisoActualizarAseguradora;
	}

	public Boolean getIsPermisoEliminarAseguradora() {
		return isPermisoEliminarAseguradora;
	}

	public void setIsPermisoEliminarAseguradora(Boolean isPermisoEliminarAseguradora) {
		this.isPermisoEliminarAseguradora = isPermisoEliminarAseguradora;
	}

	public Boolean getIsPermisoGuardarCambiosAseguradora() {
		return isPermisoGuardarCambiosAseguradora;
	}

	public void setIsPermisoGuardarCambiosAseguradora(Boolean isPermisoGuardarCambiosAseguradora) {
		this.isPermisoGuardarCambiosAseguradora = isPermisoGuardarCambiosAseguradora;
	}
	
	public Boolean getIsPermisoConsultaAseguradora() {
		return isPermisoConsultaAseguradora;
	}

	public void setIsPermisoConsultaAseguradora(Boolean isPermisoConsultaAseguradora) {
		this.isPermisoConsultaAseguradora = isPermisoConsultaAseguradora;
	}

	public Boolean getIsPermisoBusquedaAseguradora() {
		return isPermisoBusquedaAseguradora;
	}

	public void setIsPermisoBusquedaAseguradora(Boolean isPermisoBusquedaAseguradora) {
		this.isPermisoBusquedaAseguradora = isPermisoBusquedaAseguradora;
	}

	public Boolean getIsPermisoReporteAseguradora() {
		return isPermisoReporteAseguradora;
	}

	public void setIsPermisoReporteAseguradora(Boolean isPermisoReporteAseguradora) {
		this.isPermisoReporteAseguradora = isPermisoReporteAseguradora;
	}
	
	public Boolean getIsPermisoPaginacionMedioAseguradora() {
		return isPermisoPaginacionMedioAseguradora;
	}

	public void setIsPermisoPaginacionMedioAseguradora(Boolean isPermisoPaginacionMedioAseguradora) {
		this.isPermisoPaginacionMedioAseguradora = isPermisoPaginacionMedioAseguradora;
	}
	
	public Boolean getIsPermisoPaginacionTodoAseguradora() {
		return isPermisoPaginacionTodoAseguradora;
	}

	public void setIsPermisoPaginacionTodoAseguradora(Boolean isPermisoPaginacionTodoAseguradora) {
		this.isPermisoPaginacionTodoAseguradora = isPermisoPaginacionTodoAseguradora;
	}
	
	public Boolean getIsPermisoPaginacionAltoAseguradora() {
		return isPermisoPaginacionAltoAseguradora;
	}

	public void setIsPermisoPaginacionAltoAseguradora(Boolean isPermisoPaginacionAltoAseguradora) {
		this.isPermisoPaginacionAltoAseguradora = isPermisoPaginacionAltoAseguradora;
	}
	
	public Boolean getIsPermisoCopiarAseguradora() {
		return isPermisoCopiarAseguradora;
	}

	public void setIsPermisoCopiarAseguradora(Boolean isPermisoCopiarAseguradora) {
		this.isPermisoCopiarAseguradora = isPermisoCopiarAseguradora;
	}
	
	public Boolean getIsPermisoVerFormAseguradora() {
		return isPermisoVerFormAseguradora;
	}

	public void setIsPermisoVerFormAseguradora(Boolean isPermisoVerFormAseguradora) {
		this.isPermisoVerFormAseguradora = isPermisoVerFormAseguradora;
	}
	
	public Boolean getIsPermisoDuplicarAseguradora() {
		return isPermisoDuplicarAseguradora;
	}

	public void setIsPermisoDuplicarAseguradora(Boolean isPermisoDuplicarAseguradora) {
		this.isPermisoDuplicarAseguradora = isPermisoDuplicarAseguradora;
	}
	
	public Boolean getIsPermisoOrdenAseguradora() {
		return isPermisoOrdenAseguradora;
	}

	public void setIsPermisoOrdenAseguradora(Boolean isPermisoOrdenAseguradora) {
		this.isPermisoOrdenAseguradora = isPermisoOrdenAseguradora;
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
	
	public Boolean getIsVisibilidadCeldaNuevoAseguradora() {
		return isVisibilidadCeldaNuevoAseguradora;
	}

	public void setIsVisibilidadCeldaNuevoAseguradora(Boolean isVisibilidadCeldaNuevoAseguradora) {
		this.isVisibilidadCeldaNuevoAseguradora = isVisibilidadCeldaNuevoAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarAseguradora() {
		return isVisibilidadCeldaDuplicarAseguradora;
	}

	public void setIsVisibilidadCeldaDuplicarAseguradora(Boolean isVisibilidadCeldaDuplicarAseguradora) {
		this.isVisibilidadCeldaDuplicarAseguradora = isVisibilidadCeldaDuplicarAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarAseguradora() {
		return isVisibilidadCeldaCopiarAseguradora;
	}

	public void setIsVisibilidadCeldaCopiarAseguradora(Boolean isVisibilidadCeldaCopiarAseguradora) {
		this.isVisibilidadCeldaCopiarAseguradora = isVisibilidadCeldaCopiarAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormAseguradora() {
		return isVisibilidadCeldaVerFormAseguradora;
	}

	public void setIsVisibilidadCeldaVerFormAseguradora(Boolean isVisibilidadCeldaVerFormAseguradora) {
		this.isVisibilidadCeldaVerFormAseguradora = isVisibilidadCeldaVerFormAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenAseguradora() {
		return isVisibilidadCeldaOrdenAseguradora;
	}

	public void setIsVisibilidadCeldaOrdenAseguradora(Boolean isVisibilidadCeldaOrdenAseguradora) {
		this.isVisibilidadCeldaOrdenAseguradora = isVisibilidadCeldaOrdenAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesAseguradora() {
		return isVisibilidadCeldaNuevoRelacionesAseguradora;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesAseguradora(Boolean isVisibilidadCeldaNuevoRelacionesAseguradora) {
		this.isVisibilidadCeldaNuevoRelacionesAseguradora = isVisibilidadCeldaNuevoRelacionesAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaModificarAseguradora() {
		return isVisibilidadCeldaModificarAseguradora;
	}

	public void setIsVisibilidadCeldaModificarAseguradora(Boolean isVisibilidadCeldaModificarAseguradora) {
		this.isVisibilidadCeldaModificarAseguradora = isVisibilidadCeldaModificarAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarAseguradora() {
		return isVisibilidadCeldaActualizarAseguradora;
	}

	public void setIsVisibilidadCeldaActualizarAseguradora(Boolean isVisibilidadCeldaActualizarAseguradora) {
		this.isVisibilidadCeldaActualizarAseguradora = isVisibilidadCeldaActualizarAseguradora;
	}

	public Boolean getIsVisibilidadCeldaEliminarAseguradora() {
		return isVisibilidadCeldaEliminarAseguradora;
	}

	public void setIsVisibilidadCeldaEliminarAseguradora(Boolean isVisibilidadCeldaEliminarAseguradora) {
		this.isVisibilidadCeldaEliminarAseguradora = isVisibilidadCeldaEliminarAseguradora;
	}

	public Boolean getIsVisibilidadCeldaCancelarAseguradora() {
		return isVisibilidadCeldaCancelarAseguradora;
	}

	public void setIsVisibilidadCeldaCancelarAseguradora(Boolean isVisibilidadCeldaCancelarAseguradora) {
		this.isVisibilidadCeldaCancelarAseguradora = isVisibilidadCeldaCancelarAseguradora;
	}

	public Boolean getIsVisibilidadCeldaGuardarAseguradora() {
		return isVisibilidadCeldaGuardarAseguradora;
	}

	public void setIsVisibilidadCeldaGuardarAseguradora(Boolean isVisibilidadCeldaGuardarAseguradora) {
		this.isVisibilidadCeldaGuardarAseguradora = isVisibilidadCeldaGuardarAseguradora;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosAseguradora() {
		return isVisibilidadCeldaGuardarCambiosAseguradora;
	}

	public void setIsVisibilidadCeldaGuardarCambiosAseguradora(Boolean isVisibilidadCeldaGuardarCambiosAseguradora) {
		this.isVisibilidadCeldaGuardarCambiosAseguradora = isVisibilidadCeldaGuardarCambiosAseguradora;
	}
		
	public AseguradoraSessionBean getaseguradoraSessionBean() {
		return this.aseguradoraSessionBean;
	}
	
	public void setaseguradoraSessionBean(AseguradoraSessionBean aseguradoraSessionBean) {
		this.aseguradoraSessionBean=aseguradoraSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysAseguradora(Aseguradora aseguradora)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(aseguradora,null);
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
	
	public void bugActualizarReferenciaActual(Aseguradora aseguradora,Aseguradora aseguradoraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalAseguradora(aseguradora);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		aseguradoraAux.setId(aseguradora.getId());
		aseguradoraAux.setVersionRow(aseguradora.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessAseguradora();
		
			int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = aseguradoraValidator.getInvalidValues(this.aseguradora);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			aseguradoraLogic.setDatosCliente(datosCliente);
			aseguradoraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				aseguradoraAux=new  Aseguradora();
				
				aseguradoraAux.setIsNew(true);
				aseguradoraAux.setIsChanged(true);
				
				aseguradoraAux.setAseguradoraOriginal(this.aseguradora);
				
				aseguradoraAux.setId(this.aseguradora.getId());	
				aseguradoraAux.setVersionRow(this.aseguradora.getVersionRow());	
				aseguradoraAux.setid_empresa(this.aseguradora.getid_empresa());	
				aseguradoraAux.setcodigo(this.aseguradora.getcodigo());	
				aseguradoraAux.setnombre(this.aseguradora.getnombre());	
				aseguradoraAux.setdireccion(this.aseguradora.getdireccion());	
				aseguradoraAux.settelefono(this.aseguradora.gettelefono());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(aseguradoraAux,aseguradoraLogic.getAseguradoras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(aseguradoraAux,aseguradoras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradoraLogic.saveAseguradoras();//WithConnection
						//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.aseguradora,aseguradoraAux);
					
					this.refrescarForeignKeysDescripcionesAseguradora();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos().addAll(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos.addAll(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculosEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								aseguradoraLogic.saveAseguradoraRelaciones(aseguradoraAux,this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());//WithConnection
								//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.aseguradora,aseguradoraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos= new ArrayList<Vehiculo>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();}
							aseguradoraAux.setVehiculos(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(aseguradoraAux,aseguradoraLogic.getAseguradoras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(aseguradoraAux,aseguradoras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.aseguradora,aseguradoraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				aseguradoraAux=new  Aseguradora();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.aseguradoraSessionBean.getEsGuardarRelacionado() 
					|| (this.aseguradoraSessionBean.getEsGuardarRelacionado() && this.aseguradora.getId()>=0)) {
						
					aseguradoraAux.setIsNew(false);
				}
				
				aseguradoraAux.setIsDeleted(false);
			
				aseguradoraAux.setId(this.aseguradora.getId());	
				aseguradoraAux.setVersionRow(this.aseguradora.getVersionRow());	
				aseguradoraAux.setid_empresa(this.aseguradora.getid_empresa());	
				aseguradoraAux.setcodigo(this.aseguradora.getcodigo());	
				aseguradoraAux.setnombre(this.aseguradora.getnombre());	
				aseguradoraAux.setdireccion(this.aseguradora.getdireccion());	
				aseguradoraAux.settelefono(this.aseguradora.gettelefono());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(aseguradoraAux,aseguradoraLogic.getAseguradoras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(aseguradoraAux,aseguradoras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradoraLogic.saveAseguradoras();//WithConnection
						//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.aseguradora,aseguradoraAux);
					
					this.refrescarForeignKeysDescripcionesAseguradora();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos().addAll(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos.addAll(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculosEliminados);
						}
						//ARCHITECTURE
						
						if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								aseguradoraLogic.saveAseguradoraRelaciones(aseguradoraAux,this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());//WithConnection
								//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.aseguradora,aseguradoraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos= new ArrayList<Vehiculo>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();}
							aseguradoraAux.setVehiculos(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(aseguradoraAux,aseguradoraLogic.getAseguradoras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(aseguradoraAux,aseguradoras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.aseguradora,aseguradoraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				aseguradoraAux=new  Aseguradora();
				
				aseguradoraAux.setIsNew(false);
				aseguradoraAux.setIsChanged(false);
				
				aseguradoraAux.setIsDeleted(true);
				
				aseguradoraAux.setId(this.aseguradora.getId());	
				aseguradoraAux.setVersionRow(this.aseguradora.getVersionRow());	
				aseguradoraAux.setid_empresa(this.aseguradora.getid_empresa());	
				aseguradoraAux.setcodigo(this.aseguradora.getcodigo());	
				aseguradoraAux.setnombre(this.aseguradora.getnombre());	
				aseguradoraAux.setdireccion(this.aseguradora.getdireccion());	
				aseguradoraAux.settelefono(this.aseguradora.gettelefono());	
				
				if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.aseguradoraAux.getId()>=0) {	
						this.aseguradorasEliminados.add(aseguradoraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(aseguradoraAux,aseguradoraLogic.getAseguradoras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(aseguradoraAux,aseguradoras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradoraLogic.saveAseguradoras();//WithConnection
						//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos().addAll(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculosEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos.addAll(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculosEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}
									if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jInternalFrameDetalleFormVehiculo.serviciotransporteBeanSwingJInternalFrame.jInternalFrameDetalleFormServicioTransporte.detalleserviciotransporteBeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								aseguradoraLogic.saveAseguradoraRelaciones(aseguradoraAux,this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());//WithConnection
								//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.setVehiculos(new ArrayList<Vehiculo>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos= new ArrayList<Vehiculo>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.quitarFilaTotales();}
							aseguradoraAux.setVehiculos(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(aseguradoraAux,aseguradoraLogic.getAseguradoras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(aseguradoraAux,aseguradoras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getAseguradoras().addAll(this.aseguradorasEliminados);
					
					aseguradoraLogic.saveAseguradoras();//WithConnection
					//aseguradoraLogic.getSetVersionRowAseguradoras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesAseguradora();
				
				this.aseguradorasEliminados= new ArrayList<Aseguradora>();		
			}
			
			if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Aseguradora GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.aseguradora=aseguradoraAux;
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
      		//this.finishProcessAseguradora();
      	}
		
	}	
	
	public void actualizarRelaciones(Aseguradora aseguradoraLocal) throws Exception {
		
		if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				aseguradoraLocal.setVehiculos(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());
			
			} else {
			
				aseguradoraLocal.setVehiculos(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculos);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(Aseguradora aseguradoraLocal) throws Exception {	
		if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				aseguradoraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarAseguradoraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = aseguradoraValidator.getInvalidValues(this.aseguradora);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(Aseguradora aseguradora,List<Aseguradora> aseguradoras) throws Exception {
		try	{		
			AseguradoraConstantesFunciones.actualizarLista(aseguradora,aseguradoras,this.aseguradoraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(Aseguradora aseguradora,List<Aseguradora> aseguradoras) throws Exception {
		try	{			
			AseguradoraConstantesFunciones.actualizarSelectedLista(aseguradora,aseguradoras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<Aseguradora> aseguradorasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				aseguradorasLocal=this.aseguradoraLogic.getAseguradoras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				aseguradorasLocal=this.aseguradoras;
			}
			//ARCHITECTURE
		
			for(Aseguradora aseguradoraLocal:aseguradorasLocal) {
				if(this.permiteMantenimiento(aseguradoraLocal) && aseguradoraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+AseguradoraConstantesFunciones.getAseguradoraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(AseguradoraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabelid_empresaAseguradora,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AseguradoraConstantesFunciones.CODIGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabelcodigoAseguradora,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AseguradoraConstantesFunciones.NOMBRE)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabelnombreAseguradora,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AseguradoraConstantesFunciones.DIRECCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabeldireccionAseguradora,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(AseguradoraConstantesFunciones.TELEFONO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabeltelefonoAseguradora,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAseguradora.jLabelid_empresaAseguradora,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAseguradora.jLabelcodigoAseguradora,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAseguradora.jLabelnombreAseguradora,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAseguradora.jLabeldireccionAseguradora,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormAseguradora.jLabeltelefonoAseguradora,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("Vehiculo")) {
			if(this.aseguradora==null) {
				this.aseguradora= new Aseguradora();
			}

			if(this.aseguradoraSessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoAseguradora
				this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);

				this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.getvehiculo().setAseguradora(this.aseguradora);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoAseguradora--;	
		
		
		this.aseguradoraAux=new Aseguradora();
		
		this.aseguradoraAux.setId(this.iIdNuevoAseguradora);
		this.aseguradoraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.aseguradoraLogic.getAseguradoras().add(this.aseguradoraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.aseguradoras.add(this.aseguradoraAux);
		}
		//ARCHITECTURE
		
		this.aseguradora=this.aseguradoraAux;
		
		if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioAseguradora(this.aseguradora);
			this.setVariablesObjetoActualToFormularioForeignKeyAseguradora(this.aseguradora);
		}
				
		//this.setDefaultControlesAseguradora();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyAseguradora();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyAseguradora();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyAseguradora();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAseguradora(this.aseguradoraBean,this.aseguradora,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(AseguradoraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
			classes=AseguradoraConstantesFunciones.getClassesRelationshipsOfAseguradora(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.aseguradoraReturnGeneral=aseguradoraLogic.procesarEventosAseguradorasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.aseguradoraLogic.getAseguradoras(),this.aseguradora,this.aseguradoraParameterGeneral,this.isEsNuevoAseguradora,classes);//this.aseguradoraLogic.getAseguradora()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanAseguradora(this.aseguradoraReturnGeneral,this.aseguradoraBean,false);
		
		if(this.aseguradoraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyAseguradora(this.aseguradoraReturnGeneral.getAseguradora());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioAseguradora(this.aseguradoraReturnGeneral.getAseguradora());
		}
		
		if(this.aseguradoraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioAseguradora(this.aseguradoraReturnGeneral.getAseguradora(),classes);//this.aseguradoraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyAseguradora();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyAseguradora();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AseguradoraBeanSwingJInternalFrameAdditional.RecargarFormAseguradora(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingAseguradora(false);
						
			if(aseguradoraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.getEsGuardarRelacionado() && VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVehiculoActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAseguradora();
			}
			
			this.actualizarVisualTableDatosAseguradora();
			
			this.jTableDatosAseguradora.setRowSelectionInterval(this.getIndiceNuevoAseguradora(), this.getIndiceNuevoAseguradora());
			
			this.seleccionarFilaTablaAseguradoraActual();
						
			this.actualizarEstadoCeldasBotonesAseguradora("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesAseguradora(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setEnabled(isHabilitar && this.aseguradoraConstantesFunciones.activarcodigoAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setEnabled(isHabilitar && this.aseguradoraConstantesFunciones.activarnombreAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setEnabled(isHabilitar && this.aseguradoraConstantesFunciones.activardireccionAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setEnabled(isHabilitar && this.aseguradoraConstantesFunciones.activartelefonoAseguradora);	
		//
		this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setEnabled(isHabilitar && this.aseguradoraConstantesFunciones.activarid_empresaAseguradora);
	};
	
	public void setDefaultControlesAseguradora() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoAseguradora(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.aseguradoraSessionBean.setConGuardarRelaciones(true);			
			this.aseguradoraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.aseguradoraSessionBean.setConGuardarRelaciones(false);			
			this.aseguradoraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoAseguradora() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
				if(aseguradoraAux.getId().equals(this.iIdNuevoAseguradora)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Aseguradora aseguradoraAux:this.aseguradoras) {
				if(aseguradoraAux.getId().equals(this.iIdNuevoAseguradora)) {
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
	
	public int getIndiceActualAseguradora(Aseguradora aseguradora,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
				if(aseguradoraAux.getId().equals(aseguradora.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Aseguradora aseguradoraAux:this.aseguradoras) {
				if(aseguradoraAux.getId().equals(aseguradora.getId())) {
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
	
	public void setCamposBaseDesdeOriginalAseguradora(Aseguradora aseguradoraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
				if(aseguradoraAux.getAseguradoraOriginal().getId().equals(aseguradoraOriginal.getId())) {
					existe=true;
					aseguradoraOriginal.setId(aseguradoraAux.getId());
					aseguradoraOriginal.setVersionRow(aseguradoraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Aseguradora aseguradoraAux:this.aseguradoras) {
				if(aseguradoraAux.getAseguradoraOriginal().getId().equals(aseguradoraOriginal.getId())) {
					existe=true;
					aseguradoraOriginal.setId(aseguradoraAux.getId());
					aseguradoraOriginal.setVersionRow(aseguradoraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosAseguradora(Boolean esParaCancelar) throws Exception {
		aseguradorasAux=new ArrayList<Aseguradora>();
		aseguradoraAux=new Aseguradora();
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
					if(aseguradoraAux.getId()<0) {
						aseguradorasAux.add(aseguradoraAux);
					}		
				}
				this.iIdNuevoAseguradora=0L;
				this.aseguradoraLogic.getAseguradoras().removeAll(aseguradorasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Aseguradora aseguradoraAux:this.aseguradoras) {
					if(aseguradoraAux.getId()<0) {
						aseguradorasAux.add(aseguradoraAux);
					}		
				}
				this.iIdNuevoAseguradora=0L;
				this.aseguradoras.removeAll(aseguradorasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoAseguradora 
					&& this.aseguradoraLogic.getAseguradoras().size()>0
					) {
					aseguradoraAux=this.aseguradoraLogic.getAseguradoras().get(this.aseguradoraLogic.getAseguradoras().size() - 1);
				
					if(aseguradoraAux.getId()<0) {
						this.aseguradoraLogic.getAseguradoras().remove(aseguradoraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoAseguradora && this.aseguradoras.size()>0) {
					aseguradoraAux=this.aseguradoras.get(this.aseguradoras.size() - 1);
				
					if(aseguradoraAux.getId()<0) {
						this.aseguradoras.remove(aseguradoraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoAseguradora(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(aseguradora.getId()<0) {
				this.aseguradoraLogic.getAseguradoras().remove(this.aseguradora);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(aseguradora.getId()<0) {
				this.aseguradoras.remove(this.aseguradora);
			}
		}			
	}
	
	public void setEstadosInicialesAseguradora(List<Aseguradora> aseguradorasAux) throws Exception {
		AseguradoraConstantesFunciones.setEstadosInicialesAseguradora(aseguradorasAux);
	}
	
	public void setEstadosInicialesAseguradora(Aseguradora aseguradoraAux) throws Exception {
		AseguradoraConstantesFunciones.setEstadosInicialesAseguradora(aseguradoraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarAseguradoraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesAseguradora("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarAseguradoraActual()) {
				if(!this.isEsNuevoAseguradora) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesAseguradora("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoAseguradora=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarAseguradoraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Aseguradora ?", "MANTENIMIENTO DE Aseguradora", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesAseguradora("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(Aseguradora aseguradora) throws Exception {
		AseguradoraConstantesFunciones.seleccionarAsignar(this.aseguradora,aseguradora);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarAseguradora=this.isPermisoActualizarOriginalAseguradora;
			
			
			this.seleccionarAsignar(aseguradora);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			AseguradoraConstantesFunciones.quitarEspaciosAseguradora(this.aseguradora,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesAseguradora("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.aseguradoraSessionBean.setsFuncionBusquedaRapida(this.aseguradoraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoAseguradora) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosAseguradora(esParaCancelar);				
				this.cancelarNuevoAseguradora(esParaCancelar);								
			}
			
			this.aseguradora=new Aseguradora();
			
			this.inicializarAseguradora();
			
			this.actualizarEstadoCeldasBotonesAseguradora("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarAseguradora() throws Exception {
		try {
			AseguradoraConstantesFunciones.inicializarAseguradora(this.aseguradora);
			
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
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.aseguradoraLogic.getAseguradoras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteAseguradoras(String sAccionBusqueda,List<Aseguradora> aseguradorasParaReportes) throws Exception {
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
					sPathReporteFinal="Aseguradora"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="AseguradoraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("AseguradoraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="Aseguradora"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Aseguradoras");		
		parameters.put("busquedapor", AseguradoraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(Vehiculo.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					AseguradoraLogic aseguradoraLogicAuxiliar=new AseguradoraLogic();
					aseguradoraLogicAuxiliar.setDatosCliente(aseguradoraLogic.getDatosCliente());				
					aseguradoraLogicAuxiliar.setAseguradoras(aseguradorasParaReportes);
					
					aseguradoraLogicAuxiliar.cargarRelacionesLoteForeignKeyAseguradoraWithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					aseguradorasParaReportes=aseguradoraLogicAuxiliar.getAseguradoras();
					
					//aseguradoraLogic.getNewConnexionToDeep();
					
					//for (Aseguradora aseguradora:aseguradorasParaReportes) {
					//	aseguradoraLogic.deepLoad(aseguradora, false, DeepLoadType.INCLUDE, classes);
					//}						
					//aseguradoraLogic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//aseguradoraLogic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileVehiculo = AuxiliarReportes.class.getResourceAsStream("VehiculoDetalleRelacionesDesign.jasper");
			parameters.put("subreport_vehiculo", reportFileVehiculo);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceAseguradora=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			AseguradoraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			AseguradoraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceAseguradora=new JRBeanArrayDataSource(AseguradoraJInternalFrame.TraerAseguradoraBeans(aseguradorasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceAseguradora);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+AseguradoraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+AseguradoraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(AseguradoraBean.TraerAseguradoraBeans(aseguradorasParaReportes).toArray()));
							
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
				this.generarExcelReporteAseguradoras(sAccionBusqueda,sTipoArchivoReporte,aseguradorasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalAseguradoras(sAccionBusqueda,sTipoArchivoReporte,aseguradorasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoAseguradoraActionPerformed(null);
					//this.generarExcelReporteAseguradoras(sAccionBusqueda,sTipoArchivoReporte,aseguradorasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalAseguradoras(sAccionBusqueda,sTipoArchivoReporte,aseguradorasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesAseguradoras(sAccionBusqueda,sTipoArchivoReporte,aseguradorasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesAseguradoras(sAccionBusqueda,sTipoArchivoReporte,aseguradorasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteAseguradoras(String sAccionBusqueda,String sTipoArchivoReporte,List<Aseguradora> aseguradorasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Aseguradoras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAseguradora("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(Aseguradora aseguradora : aseguradorasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			AseguradoraConstantesFunciones.generarExcelReporteDataAseguradora("NORMAL",row,workbook,aseguradora,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderAseguradora(String sTipo,Row row,Workbook workbook) {
		
		AseguradoraConstantesFunciones.generarExcelReporteHeaderAseguradora(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalAseguradoras(String sAccionBusqueda,String sTipoArchivoReporte,List<Aseguradora> aseguradorasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Aseguradoras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(Aseguradora aseguradora : aseguradorasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(AseguradoraConstantesFunciones.getAseguradoraDescripcion(aseguradora));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AseguradoraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AseguradoraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(aseguradora.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AseguradoraConstantesFunciones.LABEL_CODIGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AseguradoraConstantesFunciones.LABEL_CODIGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(aseguradora.getcodigo());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AseguradoraConstantesFunciones.LABEL_NOMBRE))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AseguradoraConstantesFunciones.LABEL_NOMBRE);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(aseguradora.getnombre());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AseguradoraConstantesFunciones.LABEL_DIRECCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AseguradoraConstantesFunciones.LABEL_DIRECCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(aseguradora.getdireccion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(AseguradoraConstantesFunciones.LABEL_TELEFONO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(AseguradoraConstantesFunciones.LABEL_TELEFONO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(aseguradora.gettelefono());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesAseguradoras(String sAccionBusqueda,String sTipoArchivoReporte,List<Aseguradora> aseguradorasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<Aseguradora> aseguradorasRespaldo=null;
		
		classes=AseguradoraConstantesFunciones.getClassesRelationshipsOfAseguradora(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.aseguradoraLogic.setDatosCliente(this.datosCliente);
		this.aseguradoraLogic.setDatosDeep(this.datosDeep);
		this.aseguradoraLogic.setIsConDeep(true);
		
		aseguradorasRespaldo=this.aseguradoraLogic.getAseguradoras();
		
		this.aseguradoraLogic.setAseguradoras(aseguradorasParaReportes);	
		this.aseguradoraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		aseguradorasParaReportes=this.aseguradoraLogic.getAseguradoras();
		this.aseguradoraLogic.setAseguradoras(aseguradorasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("Aseguradoras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderAseguradora("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(Aseguradora aseguradora : aseguradorasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderAseguradora("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			AseguradoraConstantesFunciones.generarExcelReporteDataAseguradora("NORMAL",row,workbook,aseguradora,cellStyleDataAux);
		
			
			


				//Vehiculo
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(VehiculoConstantesFunciones.SCLASSWEBTITULO))) {

				if(aseguradora.getVehiculos()!=null && aseguradora.getVehiculos().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(VehiculoConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					VehiculoConstantesFunciones.generarExcelReporteHeaderVehiculo("RELACIONADO",row,workbook);
				}

				if(aseguradora.getVehiculos()!=null) {
					i2=0;
					for(Vehiculo vehiculo : aseguradora.getVehiculos()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						VehiculoConstantesFunciones.generarExcelReporteDataVehiculo("RELACIONADO",row,workbook,vehiculo,cellStyleDataAuxHijo);
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
		cell.setCellValue(AseguradoraConstantesFunciones.getAseguradoraDescripcion(aseguradora));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoAseguradora.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessAseguradora() throws Exception {		
		this.startProcessAseguradora(true);
	}
	
	public void startProcessAseguradora(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasAseguradora ,this.jPanelParametrosReportesAseguradora, this.jScrollPanelDatosAseguradora,this.jPanelPaginacionAseguradora, this.jScrollPanelDatosEdicionAseguradora, this.jPanelAccionesAseguradora,this.jPanelAccionesFormularioAseguradora,this.jmenuBarAseguradora,this.jmenuBarDetalleAseguradora,this.jTtoolBarAseguradora,this.jTtoolBarDetalleAseguradora);		
		
		final JTabbedPane jTabbedPaneBusquedasAseguradora=this.jTabbedPaneBusquedasAseguradora; 
		
		final JPanel jPanelParametrosReportesAseguradora=this.jPanelParametrosReportesAseguradora;
		//final JScrollPane jScrollPanelDatosAseguradora=this.jScrollPanelDatosAseguradora;
		final JTable jTableDatosAseguradora=this.jTableDatosAseguradora;		
		final JPanel jPanelPaginacionAseguradora=this.jPanelPaginacionAseguradora;
		//final JScrollPane jScrollPanelDatosEdicionAseguradora=this.jScrollPanelDatosEdicionAseguradora;
		final JPanel jPanelAccionesAseguradora=this.jPanelAccionesAseguradora;
		
		JPanel jPanelCamposAuxiliarAseguradora=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarAseguradora=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
			jPanelCamposAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jPanelCamposAseguradora;
			jPanelAccionesFormularioAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jPanelAccionesFormularioAseguradora;
		}
		
		final JPanel jPanelCamposAseguradora=jPanelCamposAuxiliarAseguradora;
		final JPanel jPanelAccionesFormularioAseguradora=jPanelAccionesFormularioAuxiliarAseguradora;
		
		
		final JMenuBar jmenuBarAseguradora=this.jmenuBarAseguradora;
		final JToolBar jTtoolBarAseguradora=this.jTtoolBarAseguradora;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarAseguradora=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAseguradora=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
			jmenuBarDetalleAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jmenuBarDetalleAseguradora;
			jTtoolBarDetalleAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jTtoolBarDetalleAseguradora;
		}
		
		final JMenuBar jmenuBarDetalleAseguradora=jmenuBarDetalleAuxiliarAseguradora;
		final JToolBar jTtoolBarDetalleAseguradora=jTtoolBarDetalleAuxiliarAseguradora;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAseguradora;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAseguradora;
			processRunnable.jTableDatos=jTableDatosAseguradora;
			processRunnable.jPanelCampos=jPanelCamposAseguradora;
			processRunnable.jPanelPaginacion=jPanelPaginacionAseguradora;
			processRunnable.jPanelAcciones=jPanelAccionesAseguradora;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAseguradora;
			
			
			processRunnable.jmenuBar=jmenuBarAseguradora;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAseguradora;
			processRunnable.jTtoolBar=jTtoolBarAseguradora;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAseguradora;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAseguradora ,jPanelParametrosReportesAseguradora,jTableDatosAseguradora, /*jScrollPanelDatosAseguradora,*/jPanelCamposAseguradora,jPanelPaginacionAseguradora, /*jScrollPanelDatosEdicionAseguradora,*/ jPanelAccionesAseguradora,jPanelAccionesFormularioAseguradora,jmenuBarAseguradora,jmenuBarDetalleAseguradora,jTtoolBarAseguradora,jTtoolBarDetalleAseguradora);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasAseguradora ,jPanelParametrosReportesAseguradora, jScrollPanelDatosAseguradora,jPanelPaginacionAseguradora, jScrollPanelDatosEdicionAseguradora, jPanelAccionesAseguradora,jPanelAccionesFormularioAseguradora,jmenuBarAseguradora,jmenuBarDetalleAseguradora,jTtoolBarAseguradora,jTtoolBarDetalleAseguradora);
						
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
	
	public void finishProcessAseguradora() {// throws Exception 
		this.finishProcessAseguradora(true);
	}
	
	public void finishProcessAseguradora(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasAseguradora ,this.jPanelParametrosReportesAseguradora, this.jScrollPanelDatosAseguradora,this.jPanelPaginacionAseguradora, this.jScrollPanelDatosEdicionAseguradora, this.jPanelAccionesAseguradora,this.jPanelAccionesFormularioAseguradora,this.jmenuBarAseguradora,this.jmenuBarDetalleAseguradora,this.jTtoolBarAseguradora,this.jTtoolBarDetalleAseguradora);		
		
		final JTabbedPane jTabbedPaneBusquedasAseguradora=this.jTabbedPaneBusquedasAseguradora; 
		
		final JPanel jPanelParametrosReportesAseguradora=this.jPanelParametrosReportesAseguradora;
		//final JScrollPane jScrollPanelDatosAseguradora=this.jScrollPanelDatosAseguradora;
		final JTable jTableDatosAseguradora=this.jTableDatosAseguradora;		
		final JPanel jPanelPaginacionAseguradora=this.jPanelPaginacionAseguradora;
		//final JScrollPane jScrollPanelDatosEdicionAseguradora=this.jScrollPanelDatosEdicionAseguradora;
		final JPanel jPanelAccionesAseguradora=this.jPanelAccionesAseguradora;
		
		JPanel jPanelCamposAuxiliarAseguradora=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarAseguradora=new JPanel();
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
			jPanelCamposAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jPanelCamposAseguradora;
			jPanelAccionesFormularioAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jPanelAccionesFormularioAseguradora;
		}
		
		final JPanel jPanelCamposAseguradora=jPanelCamposAuxiliarAseguradora;
		final JPanel jPanelAccionesFormularioAseguradora=jPanelAccionesFormularioAuxiliarAseguradora;
		
		
		final JMenuBar jmenuBarAseguradora=this.jmenuBarAseguradora;		
		final JToolBar jTtoolBarAseguradora=this.jTtoolBarAseguradora;
				
		JMenuBar jmenuBarDetalleAuxiliarAseguradora=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarAseguradora=new JToolBar();
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
			jmenuBarDetalleAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jmenuBarDetalleAseguradora;
			jTtoolBarDetalleAuxiliarAseguradora=this.jInternalFrameDetalleFormAseguradora.jTtoolBarDetalleAseguradora;		
		}
		
		final JMenuBar jmenuBarDetalleAseguradora=jmenuBarDetalleAuxiliarAseguradora;
		final JToolBar jTtoolBarDetalleAseguradora=jTtoolBarDetalleAuxiliarAseguradora;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasAseguradora;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesAseguradora;
			processRunnable.jTableDatos=jTableDatosAseguradora;
			processRunnable.jPanelCampos=jPanelCamposAseguradora;
			processRunnable.jPanelPaginacion=jPanelPaginacionAseguradora;
			processRunnable.jPanelAcciones=jPanelAccionesAseguradora;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioAseguradora;
			
			
			processRunnable.jmenuBar=jmenuBarAseguradora;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleAseguradora;
			processRunnable.jTtoolBar=jTtoolBarAseguradora;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleAseguradora;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasAseguradora ,jPanelParametrosReportesAseguradora, jTableDatosAseguradora,/*jScrollPanelDatosAseguradora,*/jPanelCamposAseguradora,jPanelPaginacionAseguradora, /*jScrollPanelDatosEdicionAseguradora,*/ jPanelAccionesAseguradora,jPanelAccionesFormularioAseguradora,jmenuBarAseguradora,jmenuBarDetalleAseguradora,jTtoolBarAseguradora,jTtoolBarDetalleAseguradora));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesAseguradora(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarAseguradora(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuAseguradora(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarAseguradora(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarAseguradora,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleAseguradora,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuAseguradora(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarAseguradora,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleAseguradora,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.aseguradoraConstantesFunciones.getsFinalQueryAseguradora();
		String  finalQueryPaginacionTodos=this.aseguradoraConstantesFunciones.getsFinalQueryAseguradora();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=AseguradoraConstantesFunciones.getArrayColumnasGlobalesNoAseguradora(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=AseguradoraConstantesFunciones.getArrayColumnasGlobalesAseguradora(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,AseguradoraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.aseguradorasEliminados= new ArrayList<Aseguradora>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessAseguradora();
		
				///*AseguradoraSessionBean*/this.aseguradoraSessionBean=new AseguradoraSessionBean();
			
			if(this.aseguradoraSessionBean==null) {
				this.aseguradoraSessionBean=new AseguradoraSessionBean();
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
					this.iNumeroPaginacion=AseguradoraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=AseguradoraConstantesFunciones.getClassesForeignKeysOfAseguradora(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/aseguradora."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			aseguradorasAux= new ArrayList<Aseguradora>();
			
				
			aseguradoraLogic.setDatosCliente(this.datosCliente);
			aseguradoraLogic.setDatosDeep(this.datosDeep);
			aseguradoraLogic.setIsConDeep(true);
			
			
			aseguradoraLogic.getAseguradoraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					aseguradoraLogic.getTodosAseguradoras(finalQueryGlobal,pagination);
					
					//aseguradoraLogic.getTodosAseguradorasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(aseguradoraLogic.getAseguradoras()==null|| aseguradoraLogic.getAseguradoras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							aseguradorasAux= new ArrayList<Aseguradora>();
							aseguradorasAux.addAll(aseguradoraLogic.getAseguradoras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							aseguradorasAux= new ArrayList<Aseguradora>();
							aseguradorasAux.addAll(aseguradoras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							aseguradoraLogic.getTodosAseguradoras(finalQueryGlobal+"",this.pagination);												
							
							//aseguradoraLogic.getTodosAseguradorasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteAseguradoras("Todos",aseguradoraLogic.getAseguradoras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							aseguradoraLogic.setAseguradoras(new ArrayList<Aseguradora>());					
							aseguradoraLogic.getAseguradoras().addAll(aseguradorasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							aseguradoras=new ArrayList<Aseguradora>();
							aseguradoras.addAll(aseguradorasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idAseguradora=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idAseguradora=this.idActual;
				
				} else if(this.idAseguradoraActual!=null && this.idAseguradoraActual!=0L) {
					idAseguradora=idAseguradoraActual;
				}
				
					
				this.sDetalleReporte=AseguradoraConstantesFunciones.getDetalleIndicePorId(idAseguradora);
				
				this.aseguradoras=new ArrayList<Aseguradora>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					aseguradoraLogic.getEntity(idAseguradora);
					
					//aseguradoraLogic.getEntityWithConnection(idAseguradora);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					aseguradoraLogic.setAseguradoras(new ArrayList<Aseguradora>());
					aseguradoraLogic.getAseguradoras().add(aseguradoraLogic.getAseguradora());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.aseguradoras=new ArrayList<Aseguradora>();
					this.aseguradoras.add(aseguradora);
				}
				
				if(aseguradoraLogic.getAseguradora()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=AseguradoraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					aseguradoraLogic.getAseguradorasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AseguradoraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AseguradoraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=aseguradoraLogic.getAseguradoras()==null||aseguradoraLogic.getAseguradoras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=aseguradoras==null|| aseguradoras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradorasAux=new ArrayList<Aseguradora>();
						aseguradorasAux.addAll(aseguradoraLogic.getAseguradoras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							aseguradorasAux=new ArrayList<Aseguradora>();
							aseguradorasAux.addAll(aseguradoras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							aseguradoraLogic.getAseguradorasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=AseguradoraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=AseguradoraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteAseguradoras("FK_IdEmpresa",aseguradoraLogic.getAseguradoras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteAseguradoras("FK_IdEmpresa",aseguradoras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradoraLogic.setAseguradoras(new ArrayList<Aseguradora>());
						aseguradoraLogic.getAseguradoras().addAll(aseguradorasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							aseguradoras=new ArrayList<Aseguradora>();
							aseguradoras.addAll(aseguradorasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesAseguradora();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessAseguradora();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=aseguradoraLogic.getAseguradoras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=aseguradoras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=aseguradoraLogic.getAseguradoras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=aseguradoras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(Aseguradora aseguradora) {
		Boolean permite=true;
		
		if(this.aseguradora.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=AseguradoraConstantesFunciones.getOrderByListaAseguradora();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=AseguradoraConstantesFunciones.getOrderByListaAseguradora();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Aseguradora aseguradora:aseguradoraLogic.getAseguradoras()) {
				if(aseguradora.getsType().equals(Constantes2.S_TOTALES)) {
					aseguradoraTotales=aseguradora;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Aseguradora aseguradora:this.aseguradoras) {
				if(aseguradora.getsType().equals(Constantes2.S_TOTALES)) {
					aseguradoraTotales=aseguradora;
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
			this.aseguradoraAux=new Aseguradora();
			this.aseguradoraAux.setsType(Constantes2.S_TOTALES);
			this.aseguradoraAux.setIsNew(false);
			this.aseguradoraAux.setIsChanged(false);
			this.aseguradoraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				AseguradoraConstantesFunciones.TotalizarValoresFilaAseguradora(this.aseguradoraLogic.getAseguradoras(),this.aseguradoraAux);
				
				this.aseguradoraLogic.getAseguradoras().add(this.aseguradoraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				AseguradoraConstantesFunciones.TotalizarValoresFilaAseguradora(this.aseguradoras,this.aseguradoraAux);
				
				this.aseguradoras.add(this.aseguradoraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		aseguradoraTotales=new Aseguradora();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.aseguradoraLogic.getAseguradoras().remove(aseguradoraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.aseguradoras.remove(aseguradoraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		aseguradoraTotales=new Aseguradora();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(Aseguradora aseguradora:aseguradoraLogic.getAseguradoras()) {
				if(aseguradora.getsType().equals(Constantes2.S_TOTALES)) {
					aseguradoraTotales=aseguradora;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AseguradoraConstantesFunciones.TotalizarValoresFilaAseguradora(this.aseguradoraLogic.getAseguradoras(),aseguradoraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(Aseguradora aseguradora:this.aseguradoras) {
				if(aseguradora.getsType().equals(Constantes2.S_TOTALES)) {
					aseguradoraTotales=aseguradora;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				AseguradoraConstantesFunciones.TotalizarValoresFilaAseguradora(this.aseguradoras,aseguradoraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getAseguradorasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getAseguradorasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					aseguradoraLogic.getAseguradorasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosAseguradora() {
		this.isPermisoTodoAseguradora=false;
		this.isPermisoNuevoAseguradora=false;
		this.isPermisoActualizarAseguradora=false;
		this.isPermisoActualizarOriginalAseguradora=false;
		this.isPermisoEliminarAseguradora=false;
		this.isPermisoGuardarCambiosAseguradora=false;
		this.isPermisoConsultaAseguradora=false;
		this.isPermisoBusquedaAseguradora=false;
		this.isPermisoReporteAseguradora=false;		
		this.isPermisoOrdenAseguradora=false;		
		this.isPermisoPaginacionMedioAseguradora=false;		
		this.isPermisoPaginacionAltoAseguradora=false;
		this.isPermisoPaginacionTodoAseguradora=false;
		this.isPermisoCopiarAseguradora=false;		
		this.isPermisoVerFormAseguradora=false;		
		this.isPermisoDuplicarAseguradora=false;		
		this.isPermisoOrdenAseguradora=false;		
	}
	
	public void setPermisosUsuarioAseguradora(Boolean isPermiso) {
		this.isPermisoTodoAseguradora=isPermiso;
		this.isPermisoNuevoAseguradora=isPermiso;
		this.isPermisoActualizarAseguradora=isPermiso;
		this.isPermisoActualizarOriginalAseguradora=isPermiso;
		this.isPermisoEliminarAseguradora=isPermiso;
		this.isPermisoGuardarCambiosAseguradora=isPermiso;
		this.isPermisoConsultaAseguradora=isPermiso;
		this.isPermisoBusquedaAseguradora=isPermiso;
		this.isPermisoReporteAseguradora=isPermiso;
		this.isPermisoOrdenAseguradora=isPermiso;		
		this.isPermisoPaginacionMedioAseguradora=isPermiso;		
		this.isPermisoPaginacionAltoAseguradora=isPermiso;		
		this.isPermisoPaginacionTodoAseguradora=isPermiso;		
		this.isPermisoCopiarAseguradora=isPermiso;		
		this.isPermisoVerFormAseguradora=isPermiso;		
		this.isPermisoDuplicarAseguradora=isPermiso;
		this.isPermisoOrdenAseguradora=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioAseguradora(Boolean isPermiso) {
		//this.isPermisoTodoAseguradora=isPermiso;
		this.isPermisoNuevoAseguradora=isPermiso;
		this.isPermisoActualizarAseguradora=isPermiso;
		this.isPermisoActualizarOriginalAseguradora=isPermiso;
		this.isPermisoEliminarAseguradora=isPermiso;
		this.isPermisoGuardarCambiosAseguradora=isPermiso;
		//this.isPermisoConsultaAseguradora=isPermiso;
		//this.isPermisoBusquedaAseguradora=isPermiso;
		//this.isPermisoReporteAseguradora=isPermiso;
		//this.isPermisoOrdenAseguradora=isPermiso;		
		//this.isPermisoPaginacionMedioAseguradora=isPermiso;		
		//this.isPermisoPaginacionAltoAseguradora=isPermiso;		
		//this.isPermisoPaginacionTodoAseguradora=isPermiso;		
		//this.isPermisoCopiarAseguradora=isPermiso;		
		//this.isPermisoDuplicarAseguradora=isPermiso;
		//this.isPermisoOrdenAseguradora=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioAseguradoraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(VehiculoConstantesFunciones.SNOMBREOPCION);
		
		if(AseguradoraJInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosVehiculo=false;
		this.isTienePermisosVehiculo=this.verificarGetPermisosUsuarioOpcionAseguradoraClaseRelacionada(this.opcionsRelacionadas,VehiculoConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebAseguradora(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioAseguradoraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosVehiculo=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioAseguradoraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionAseguradoraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioAseguradoraClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosVehiculo && this.jInternalFrameDetalleFormAseguradora!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.remove(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioAseguradora() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(AseguradoraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, AseguradoraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoAseguradora=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarAseguradora=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalAseguradora=this.isPermisoActualizarAseguradora;
			this.isPermisoEliminarAseguradora=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosAseguradora=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaAseguradora=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaAseguradora=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoAseguradora=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteAseguradora=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAseguradora=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioAseguradora=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoAseguradora=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoAseguradora=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarAseguradora=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormAseguradora=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarAseguradora=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenAseguradora=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosAseguradora.setToolTipText(this.jTableDatosAseguradora.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioAseguradora(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioAseguradora(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(AseguradoraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(AseguradoraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioAseguradora() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosVehiculo && this.aseguradoraConstantesFunciones.mostrarVehiculoAseguradora && !AseguradoraConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Vehiculo");
			reporte.setsDescripcion("Vehiculo");
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
	public void inicializarCombosForeignKeyAseguradoraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyAseguradoraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(AseguradoraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyAseguradoraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyAseguradoraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			AseguradoraParameterReturnGeneral aseguradoraReturnGeneral=new AseguradoraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.aseguradoraConstantesFunciones.cargarid_empresaAseguradora)
					 || (this.esRecargarFks && this.aseguradoraConstantesFunciones.cargarid_empresaAseguradora)) {

					if(!this.aseguradoraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+aseguradoraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				aseguradoraReturnGeneral=aseguradoraLogic.cargarCombosLoteForeignKeyAseguradora(finalQueryGlobalEmpresa);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=aseguradoraReturnGeneral.getempresasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyAseguradora()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.aseguradoraSessionBean==null) {
				this.aseguradoraSessionBean=new AseguradoraSessionBean();
			}

			if(!this.aseguradoraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
	
	public void initActionsCombosTodosForeignKeyAseguradora()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyAseguradora(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyAseguradora()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyAseguradora();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyAseguradora(Aseguradora aseguradora)throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyAseguradora(Aseguradora aseguradora,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyAseguradora()throws Exception {	
		try {
						
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyAseguradora()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyAseguradora()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyAseguradora()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroAseguradora()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyAseguradora()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyAseguradora(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyAseguradora()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora!=null && this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.getItemCount()>0) {
				this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	


	
	

	public AseguradoraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public AseguradoraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public AseguradoraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.aseguradoraSessionBean=new AseguradoraSessionBean(); 
		this.aseguradoraConstantesFunciones=new AseguradoraConstantesFunciones(); 
		this.aseguradoraBean=new Aseguradora();//(this.aseguradoraConstantesFunciones); 		
		this.aseguradoraReturnGeneral=new AseguradoraParameterReturnGeneral(); 
		
		this.aseguradoraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.aseguradoraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public AseguradoraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public AseguradoraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public AseguradoraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessAseguradora(true);
			
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
			
			this.aseguradoraConstantesFunciones=new AseguradoraConstantesFunciones(); 
			this.aseguradoraBean=new Aseguradora();//this.aseguradoraConstantesFunciones); 			
			this.aseguradoraReturnGeneral=new AseguradoraParameterReturnGeneral(); 
		
			AseguradoraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Aseguradora Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.aseguradora=new Aseguradora();
			this.aseguradoras = new ArrayList<Aseguradora>();
			this.aseguradorasAux = new ArrayList<Aseguradora>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic=new AseguradoraLogic();
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			//this.aseguradoraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.aseguradoraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormAseguradora);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAseguradora);	
					}
					
					if(this.jInternalFrameImportacionAseguradora!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAseguradora);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByAseguradora!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByAseguradora);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormAseguradora!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormAseguradora);
				this.jInternalFrameDetalleFormAseguradora.setVisible(false);
				this.jInternalFrameDetalleFormAseguradora.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAseguradora);
					this.jInternalFrameReporteDinamicoAseguradora.setVisible(false);
					this.jInternalFrameReporteDinamicoAseguradora.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionAseguradora!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionAseguradora);
					this.jInternalFrameImportacionAseguradora.setVisible(false);
					this.jInternalFrameImportacionAseguradora.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByAseguradora!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByAseguradora);
					this.jInternalFrameOrderByAseguradora.setVisible(false);
					this.jInternalFrameOrderByAseguradora.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idAseguradoraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=AseguradoraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.aseguradoraReturnGeneral=new AseguradoraParameterReturnGeneral();
			
			this.aseguradoraParameterGeneral=new AseguradoraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.aseguradoraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(AseguradoraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(VehiculoConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AseguradoraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.aseguradoraSessionBean.getEsGuardarRelacionado(),this.aseguradoraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,AseguradoraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.aseguradoraSessionBean.getEsGuardarRelacionado(),this.aseguradoraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaDuplicarAseguradora=true;
			this.isVisibilidadCeldaCopiarAseguradora=true;
			this.isVisibilidadCeldaVerFormAseguradora=true;
			this.isVisibilidadCeldaOrdenAseguradora=true;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
			this.isVisibilidadCeldaModificarAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=false;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=false;
			this.isVisibilidadCeldaGuardarAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
			
			
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesAseguradora("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosAseguradora();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioAseguradora(false);
			
			this.setPermisosUsuarioAseguradora();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.aseguradoraSessionBean.getEsGuardarRelacionado() 
				|| (this.aseguradoraSessionBean.getEsGuardarRelacionado() && this.aseguradoraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioAseguradoraClasesRelacionadas();
			}
			
			if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioAseguradoraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!AseguradoraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosAseguradora();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualAseguradora();
			}
			
			if(!this.isPermisoBusquedaAseguradora) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasAseguradora.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioAseguradora,this.isPermisoPaginacionMedioAseguradora,this.isPermisoPaginacionTodoAseguradora);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(AseguradoraConstantesFunciones.getTiposSeleccionarAseguradora());
				
				this.tiposColumnasSelect=AseguradoraConstantesFunciones.getTiposSeleccionarAseguradora(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectAseguradora();				
				//this.tiposRelacionesSelect=AseguradoraConstantesFunciones.getTiposRelacionesAseguradora(true);
				
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
			//if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioAseguradora();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioAseguradora(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioAseguradora(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesAseguradora() ;
			
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
			
			
			this.vehiculoLogic=new VehiculoLogic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				aseguradoraImplementable= (AseguradoraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AseguradoraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				aseguradoraImplementableHome= (AseguradoraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+AseguradoraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.aseguradoras= new ArrayList<Aseguradora>();
			this.aseguradorasEliminados= new ArrayList<Aseguradora>();
						
			this.isEsNuevoAseguradora=false;
			this.esParaAccionDesdeFormularioAseguradora=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyAseguradora(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroAseguradora();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			AseguradoraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=AseguradoraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesAseguradora("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingAseguradora(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormAseguradora!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioAseguradora();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioAseguradora();
			}
			
			AseguradoraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasAseguradora.getTabCount(); i++) {
					this.jTabbedPaneBusquedasAseguradora.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasAseguradora.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessAseguradora(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga Aseguradora: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectAseguradora() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(VehiculoConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(VehiculoConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesAseguradora")) {
				iIndex=this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();	
				
				

				if(sTitle.equals("Vehiculos")) {
					if(!VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessAseguradora();

						this.cargarParteTabPanelRelacionadaVehiculo(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessAseguradora();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaVehiculo(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormAseguradora.cargarSessionConBeanSwingJInternalFrameVehiculo(false,true,iIndex);
		this.jButtonVehiculoActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaVehiculo();

		//this.jTabbedPaneRelacionesAseguradora.updateUI();
		//this.jTabbedPaneRelacionesAseguradora.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesAseguradora.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("Vehiculo")) {
				int row=this.jTableDatosAseguradora.getSelectedRow();
				jButtonVehiculoActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Vehiculo")) {

					if(this.isTienePermisosVehiculo && this.aseguradoraConstantesFunciones.mostrarVehiculoAseguradora && !AseguradoraConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Vehiculos"+"("+VehiculoConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Vehiculos");

						if(aseguradoraConstantesFunciones.resaltarVehiculoAseguradora!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(aseguradoraConstantesFunciones.resaltarVehiculoAseguradora);
						}

						jmenuItem.setEnabled(this.aseguradoraConstantesFunciones.activarVehiculoAseguradora);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"Vehiculo"));

						

						this.jInternalFrameDetalleFormAseguradora.jmenuDetalleAseguradora.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyAseguradora(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyAseguradora(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyAseguradora(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyAseguradoraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyAseguradora();
		
		this.cargarCombosFrameForeignKeyAseguradora();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyAseguradora();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyAseguradora();
		}
	}
	
	
	
	public void jButtonNuevoAseguradoraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			
			if(jTableDatosAseguradora.getRowCount()>=1) {
				jTableDatosAseguradora.removeRowSelectionInterval(0, jTableDatosAseguradora.getRowCount()-1);						
			}
			
			this.isEsNuevoAseguradora=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoAseguradora(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesAseguradora(true);			
			//this.aseguradora=new Aseguradora();
			//this.aseguradora.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAseguradora(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAseguradora() ;
			
			if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAseguradora(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.aseguradora);	
			this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);				
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar Aseguradora: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarAseguradoraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosAseguradora.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosAseguradora.getSelectedRows().length;			
			}
			
			aseguradorasSeleccionados=this.getAseguradorasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoAseguradora--;			
				//Aseguradora aseguradoraAux= new Aseguradora();			
				//aseguradoraAux.setId(this.iIdNuevoAseguradora);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//Aseguradora aseguradoraOrigen=new Aseguradora();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(Aseguradora aseguradoraOrigen : aseguradorasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							aseguradoraOrigen =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							aseguradoraOrigen =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaAseguradora();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.aseguradora.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosAseguradora(aseguradoraOrigen,this.aseguradora,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.aseguradoraLogic.getAseguradoras().add(this.aseguradoraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.aseguradoras.add(this.aseguradoraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaAseguradora(false);
				
				this.jTableDatosAseguradora.setRowSelectionInterval(this.getIndiceNuevoAseguradora(), this.getIndiceNuevoAseguradora());
				
				int iLastRow =  this.jTableDatosAseguradora.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAseguradora.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAseguradora.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAseguradora(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();									
		
			Aseguradora aseguradoraOrigen=new Aseguradora();
			Aseguradora aseguradoraDestino=new Aseguradora();
				
			aseguradorasSeleccionados=this.getAseguradorasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosAseguradora.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || aseguradorasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosAseguradora.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradoraOrigen =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						aseguradoraOrigen =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						aseguradoraDestino =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						aseguradoraDestino =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				aseguradoraOrigen =aseguradorasSeleccionados.get(0);
				aseguradoraDestino =aseguradorasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosAseguradora(aseguradoraOrigen,aseguradoraDestino,true,false);
				
				aseguradoraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(aseguradoraDestino,aseguradoraLogic.getAseguradoras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(aseguradoraDestino,aseguradoras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaAseguradora(false);
				
				//this.jTableDatosAseguradora.setRowSelectionInterval(this.getIndiceNuevoAseguradora(), this.getIndiceNuevoAseguradora());
				
				int iLastRow =  this.jTableDatosAseguradora.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosAseguradora.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosAseguradora.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaAseguradora(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormAseguradora.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesAseguradora.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasAseguradora.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesAseguradora.setVisible(!isVisible);
			this.jPanelPaginacionAseguradora.setVisible(!isVisible);
			this.jPanelAccionesAseguradora.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameAseguradora();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoAseguradora();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionAseguradora();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByAseguradora();
			
			this.abrirFrameOrderByAseguradora();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByAseguradora();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleAseguradora(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormAseguradora);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormAseguradora.isMaximum()) {
					this.jInternalFrameDetalleFormAseguradora.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormAseguradora.setSize(this.jInternalFrameDetalleFormAseguradora.iWidthFormulario,this.jInternalFrameDetalleFormAseguradora.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormAseguradora.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormAseguradora.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormAseguradora.isMaximum()) {
						this.jInternalFrameDetalleFormAseguradora.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormAseguradora.jContentPaneDetalleAseguradora.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormAseguradora.jContentPaneDetalleAseguradora.getWidth(),AseguradoraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormAseguradora.jContentPaneDetalleAseguradora.getWidth(),AseguradoraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormAseguradora.jContentPaneDetalleAseguradora.getWidth(),AseguradoraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaVehiculo();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormAseguradora.setVisible(true);
	        this.jInternalFrameDetalleFormAseguradora.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByAseguradora() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByAseguradora==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByAseguradora=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAseguradora,false,this);
				} else {
					this.jInternalFrameOrderByAseguradora=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByAseguradora,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByAseguradora);
				this.jInternalFrameOrderByAseguradora.setVisible(false);
				this.jInternalFrameOrderByAseguradora.setSelected(false);
				
				this.jInternalFrameOrderByAseguradora.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAseguradora"));
				
				this.inicializarActualizarBindingTablaOrderByAseguradora();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionAseguradora() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionAseguradora==null) {
				
				this.jInternalFrameImportacionAseguradora=new ImportacionJInternalFrame(AseguradoraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionAseguradora);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionAseguradora);
				this.jInternalFrameImportacionAseguradora.setVisible(false);
				this.jInternalFrameImportacionAseguradora.setSelected(false);


				this.jInternalFrameImportacionAseguradora.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAseguradora"));
				this.jInternalFrameImportacionAseguradora.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAseguradora"));
				this.jInternalFrameImportacionAseguradora.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAseguradora"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoAseguradora() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoAseguradora==null) {
				this.jInternalFrameReporteDinamicoAseguradora=new ReporteDinamicoJInternalFrame(AseguradoraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoAseguradora);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoAseguradora);
				this.jInternalFrameReporteDinamicoAseguradora.setVisible(false);
				this.jInternalFrameReporteDinamicoAseguradora.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoAseguradora.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAseguradora"));
				this.jInternalFrameReporteDinamicoAseguradora.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAseguradora"));
				this.jInternalFrameReporteDinamicoAseguradora.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAseguradora"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAseguradora();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaVehiculo() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jScrollPanelDatosVehiculo.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormAseguradora.jContentPaneDetalleAseguradora.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jScrollPanelDatosVehiculo.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jScrollPanelDatosVehiculo.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.jScrollPanelDatosVehiculo.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleAseguradora() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormAseguradora);
			
	       	this.jInternalFrameDetalleFormAseguradora.setVisible(false);
	        this.jInternalFrameDetalleFormAseguradora.setSelected(false);
			
			//this.jInternalFrameDetalleFormAseguradora.dispose();
			//this.jInternalFrameDetalleFormAseguradora=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoAseguradora() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoAseguradora.setVisible(true);
	        this.jInternalFrameReporteDinamicoAseguradora.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionAseguradora() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionAseguradora.setVisible(true);
	        this.jInternalFrameImportacionAseguradora.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByAseguradora() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByAseguradora.setVisible(true);
	        this.jInternalFrameOrderByAseguradora.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByAseguradora() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByAseguradora.setVisible(false);
	        this.jInternalFrameOrderByAseguradora.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoAseguradora() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoAseguradora.setVisible(false);
	        this.jInternalFrameReporteDinamicoAseguradora.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionAseguradora() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionAseguradora.setVisible(false);
	        this.jInternalFrameImportacionAseguradora.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarAseguradora(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarAseguradora(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesAseguradora(true);
			//this.isEsNuevoAseguradora=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesAseguradora("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAseguradora(false) ;
			
			if(aseguradoraSessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.getEsGuardarRelacionado() && VehiculoJInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonVehiculoActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAseguradora(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAseguradora(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaAseguradoraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarAseguradora(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesAseguradora(true);
			//this.isEsNuevoAseguradora=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.aseguradora.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesAseguradora("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesAseguradora(false) ;
			
			if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleAseguradora(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAseguradora(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	
	public void jButtonActualizarAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesAseguradora(false);
			
			//if(!this.isEsNuevoAseguradora) {								
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
				this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				
			}
			
			if(this.permiteMantenimiento(this.aseguradora)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoAseguradora=true;
					this.inicializarActualizarBindingTablaAseguradora(false);
					this.isEsNuevoAseguradora=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoAseguradora=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoAseguradora=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAseguradora(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAseguradora(false);
				
				this.habilitarDeshabilitarControlesAseguradora(false);
			
												
				
				if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleAseguradora();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoAseguradoraActionPerformed(evt,aseguradoraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualAseguradora(this.aseguradora,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosAseguradora.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,aseguradoraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.aseguradora.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarAseguradoraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				this.aseguradora.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				this.aseguradora.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.aseguradora)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((AseguradoraModel) this.jTableDatosAseguradora.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoAseguradora=true;
				this.inicializarActualizarBindingTablaAseguradora(false);
				this.isEsNuevoAseguradora=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesAseguradora(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAseguradora(false);
				
				this.habilitarDeshabilitarControlesAseguradora(false);
				
				
				
				if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleAseguradora();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarAseguradoraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosAseguradora.getRowCount()>=1) {
				jTableDatosAseguradora.removeRowSelectionInterval(0, jTableDatosAseguradora.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesAseguradora(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaAseguradora(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesAseguradora(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualAseguradora(false) ;
			
			this.isEsNuevoAseguradora=false;
			
			if(AseguradoraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleAseguradora();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosAseguradoraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingAseguradora(false);
				
				//SI ES MANUAL
				if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualAseguradora();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosAseguradoraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoAseguradora--;			
			//Aseguradora aseguradoraAux= new Aseguradora();			
			//aseguradoraAux.setId(this.iIdNuevoAseguradora);
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaAseguradora();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
			
			this.aseguradora.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.aseguradoraLogic.getAseguradoras().add(this.aseguradoraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.aseguradoras.add(this.aseguradoraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaAseguradora(false);
			
			this.jTableDatosAseguradora.setRowSelectionInterval(this.getIndiceNuevoAseguradora(), this.getIndiceNuevoAseguradora());
			
			int iLastRow =  this.jTableDatosAseguradora.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosAseguradora.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosAseguradora.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaAseguradora(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionAseguradoraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingAseguradora(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAseguradora(false);
			
			//SI ES MANUAL
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAseguradora();
			}
			
			//this.abrirFrameTreeAseguradora();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionAseguradoraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE AseguradoraS ?", "MANTENIMIENTO DE Aseguradora", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionAseguradora.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralAseguradora();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.aseguradoraReturnGeneral=aseguradoraLogic.procesarImportacionAseguradorasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.aseguradoraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarAseguradoraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionAseguradoraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionAseguradora.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionAseguradora.setFileImportacion(this.jInternalFrameImportacionAseguradora.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionAseguradora.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionAseguradora.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionAseguradora.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionAseguradora.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoAseguradoraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		

		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("AseguradoraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"AseguradoraBaseDesign.jrxml";
			
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
			
			this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AseguradoraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AseguradoraConstantesFunciones.LABEL_CODIGO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_digo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_digo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_digo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_digo_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AseguradoraConstantesFunciones.LABEL_NOMBRE:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_mbre_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_mbre_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_mbre_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_mbre_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AseguradoraConstantesFunciones.LABEL_DIRECCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_reccion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_reccion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_reccion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_reccion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case AseguradoraConstantesFunciones.LABEL_TELEFONO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lefono_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lefono_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lefono_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lefono_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoAseguradora.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case AseguradoraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case AseguradoraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoria="codigo";
					break;

				case AseguradoraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoria="nombre";
					break;

				case AseguradoraConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoria="direccion";
					break;

				case AseguradoraConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoria="telefono";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case AseguradoraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case AseguradoraConstantesFunciones.LABEL_CODIGO:
					sNombreCampoCategoriaValor="codigo";
					break;

				case AseguradoraConstantesFunciones.LABEL_NOMBRE:
					sNombreCampoCategoriaValor="nombre";
					break;

				case AseguradoraConstantesFunciones.LABEL_DIRECCION:
					sNombreCampoCategoriaValor="direccion";
					break;

				case AseguradoraConstantesFunciones.LABEL_TELEFONO:
					sNombreCampoCategoriaValor="telefono";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case AseguradoraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case AseguradoraConstantesFunciones.LABEL_CODIGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Codigo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"codigo");
					break;

				case AseguradoraConstantesFunciones.LABEL_NOMBRE:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Nombre",sNombreCampoCategoria,sNombreCampoCategoriaValor,"nombre");
					break;

				case AseguradoraConstantesFunciones.LABEL_DIRECCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Direccion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"direccion");
					break;

				case AseguradoraConstantesFunciones.LABEL_TELEFONO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Telefono",sNombreCampoCategoria,sNombreCampoCategoriaValor,"telefono");
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
	
	public void jButtonGenerarExcelReporteDinamicoAseguradoraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("Aseguradoras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case AseguradoraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AseguradoraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(Aseguradora aseguradora:aseguradorasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(aseguradora.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AseguradoraConstantesFunciones.LABEL_CODIGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AseguradoraConstantesFunciones.LABEL_CODIGO);
					iRow++;

					for(Aseguradora aseguradora:aseguradorasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(aseguradora.getcodigo());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AseguradoraConstantesFunciones.LABEL_NOMBRE:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AseguradoraConstantesFunciones.LABEL_NOMBRE);
					iRow++;

					for(Aseguradora aseguradora:aseguradorasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(aseguradora.getnombre());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AseguradoraConstantesFunciones.LABEL_DIRECCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AseguradoraConstantesFunciones.LABEL_DIRECCION);
					iRow++;

					for(Aseguradora aseguradora:aseguradorasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(aseguradora.getdireccion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case AseguradoraConstantesFunciones.LABEL_TELEFONO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(AseguradoraConstantesFunciones.LABEL_TELEFONO);
					iRow++;

					for(Aseguradora aseguradora:aseguradorasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(aseguradora.gettelefono());
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
			//	this.getFilaCabeceraExportarExcelAseguradora(row);				
			//	iRow++;
			//}				
			
			//for(Aseguradora aseguradoraAux:aseguradorasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelAseguradora(aseguradoraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
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
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAseguradora(false);
			
			//SI ES MANUAL
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualAseguradora();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresAseguradoraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAseguradora(false);
			
			//SI ES MANUAL
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAseguradora();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesAseguradoraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingAseguradora(false);
			
			//SI ES MANUAL
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualAseguradora();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaAseguradora() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosAseguradora.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosAseguradora.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosAseguradora.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosAseguradora.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosAseguradora.setMinimumSize(dimensionMinimum);
		this.jTableDatosAseguradora.setMaximumSize(dimensionMaximum);
		this.jTableDatosAseguradora.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingAseguradora(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingAseguradora(esInicializar,true);
	}
	
	public void inicializarActualizarBindingAseguradora(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaAseguradora(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesAseguradora(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasAseguradora(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAseguradora(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesAseguradora(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!AseguradoraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualAseguradora() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaAseguradora();
		
		this.inicializarActualizarBindingBotonesManualAseguradora(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualAseguradora();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesAseguradora() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualAseguradora(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualAseguradora(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosAseguradora.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosAseguradora.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteAseguradora.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormAseguradora!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormAseguradora.jCheckBoxPostAccionNuevoAseguradora.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormAseguradora.jCheckBoxPostAccionSinCerrarAseguradora.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormAseguradora.jCheckBoxPostAccionSinMensajeAseguradora.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosAseguradora.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosAseguradora.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteAseguradora.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormAseguradora!=null) {
				this.jInternalFrameDetalleFormAseguradora.jCheckBoxPostAccionNuevoAseguradora.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormAseguradora.jCheckBoxPostAccionSinCerrarAseguradora.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormAseguradora.jCheckBoxPostAccionSinMensajeAseguradora.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionAseguradora.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionAseguradora.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesAseguradora.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesAseguradora.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesAseguradora.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarAseguradora.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesAseguradora.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesAseguradora.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralAseguradora.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesAseguradora(Boolean esInicializar) throws Exception {
		try	{	
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualAseguradora(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesAseguradora() throws Exception {
		try	{
			if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualAseguradora();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAseguradora() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualAseguradora() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesAseguradora.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesAseguradora.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesAseguradora.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionAseguradora.addItem(reporte);
			}
			
			
			if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionAseguradora.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionAseguradora.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesAseguradora.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesAseguradora.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarAseguradora.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarAseguradora.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarAseguradora.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAseguradora();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualAseguradora() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
				this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
				this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoAseguradora.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
				
				if(this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAseguradora.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoAseguradora.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoAseguradora.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoAseguradora.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualAseguradora()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasAseguradora(Boolean esInicializar) throws Exception {				
		if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualAseguradora();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaAseguradora() throws Exception {
		this.inicializarActualizarBindingTablaAseguradora(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByAseguradora() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosAseguradoraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradoraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaAseguradora(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=aseguradoraLogic.getAseguradoras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=aseguradoras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosAseguradora.setModel(new AseguradoraModel(this.aseguradoraLogic.getAseguradoras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosAseguradora.setModel(new AseguradoraModel(this.aseguradoras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByAseguradora!=null && this.jInternalFrameOrderByAseguradora.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByAseguradora();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+AseguradoraConstantesFunciones.SCLASSWEBTITULO,aseguradoraConstantesFunciones.resaltarSeleccionarAseguradora,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+AseguradoraConstantesFunciones.SCLASSWEBTITULO,aseguradoraConstantesFunciones.resaltarSeleccionarAseguradora,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,AseguradoraConstantesFunciones.LABEL_ID));

		if(this.aseguradoraConstantesFunciones.mostraridAseguradora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AseguradoraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.aseguradoraConstantesFunciones.resaltaridAseguradora,this.aseguradoraConstantesFunciones.activaridAseguradora,this,true,"idAseguradora","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.aseguradoraConstantesFunciones.resaltaridAseguradora,this.aseguradoraConstantesFunciones.activaridAseguradora,this,true,"idAseguradora","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,AseguradoraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.aseguradoraConstantesFunciones.mostrarid_empresaAseguradora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AseguradoraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.aseguradoraConstantesFunciones.resaltarid_empresaAseguradora,this,this.aseguradoraConstantesFunciones.activarid_empresaAseguradora));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.aseguradoraConstantesFunciones.resaltarid_empresaAseguradora,this,this.aseguradoraConstantesFunciones.activarid_empresaAseguradora,false,"id_empresaAseguradora","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,AseguradoraConstantesFunciones.LABEL_CODIGO));

		if(this.aseguradoraConstantesFunciones.mostrarcodigoAseguradora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AseguradoraConstantesFunciones.LABEL_CODIGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.aseguradoraConstantesFunciones.resaltarcodigoAseguradora,this.aseguradoraConstantesFunciones.activarcodigoAseguradora,this,true,"codigoAseguradora","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.aseguradoraConstantesFunciones.resaltarcodigoAseguradora,this.aseguradoraConstantesFunciones.activarcodigoAseguradora,this,true,"codigoAseguradora","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,AseguradoraConstantesFunciones.LABEL_NOMBRE));

		if(this.aseguradoraConstantesFunciones.mostrarnombreAseguradora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AseguradoraConstantesFunciones.LABEL_NOMBRE,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.aseguradoraConstantesFunciones.resaltarnombreAseguradora,this.aseguradoraConstantesFunciones.activarnombreAseguradora,this,true,"nombreAseguradora","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.aseguradoraConstantesFunciones.resaltarnombreAseguradora,this.aseguradoraConstantesFunciones.activarnombreAseguradora,this,true,"nombreAseguradora","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,AseguradoraConstantesFunciones.LABEL_DIRECCION));

		if(this.aseguradoraConstantesFunciones.mostrardireccionAseguradora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AseguradoraConstantesFunciones.LABEL_DIRECCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.aseguradoraConstantesFunciones.resaltardireccionAseguradora,this.aseguradoraConstantesFunciones.activardireccionAseguradora,this,true,"direccionAseguradora","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.aseguradoraConstantesFunciones.resaltardireccionAseguradora,this.aseguradoraConstantesFunciones.activardireccionAseguradora,this,true,"direccionAseguradora","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,AseguradoraConstantesFunciones.LABEL_TELEFONO));

		if(this.aseguradoraConstantesFunciones.mostrartelefonoAseguradora && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,AseguradoraConstantesFunciones.LABEL_TELEFONO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.aseguradoraConstantesFunciones.resaltartelefonoAseguradora,this.aseguradoraConstantesFunciones.activartelefonoAseguradora,this,true,"telefonoAseguradora","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.aseguradoraConstantesFunciones.resaltartelefonoAseguradora,this.aseguradoraConstantesFunciones.activartelefonoAseguradora,this,true,"telefonoAseguradora","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new AseguradoraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosVehiculo && this.aseguradoraConstantesFunciones.mostrarVehiculoAseguradora && !AseguradoraConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Vehiculos");
				tableColumn.setHeaderValue("Vehiculos");
				tableColumn.setCellRenderer(new VehiculoTableCell(aseguradoraConstantesFunciones.resaltarVehiculoAseguradora,this,this.aseguradoraConstantesFunciones.activarVehiculoAseguradora));
				tableColumn.setCellEditor(new VehiculoTableCell(aseguradoraConstantesFunciones.resaltarVehiculoAseguradora,this,this.aseguradoraConstantesFunciones.activarVehiculoAseguradora));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosAseguradora.addColumn(tableColumn);
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.aseguradoraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.aseguradoraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAseguradora.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.aseguradoraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.aseguradoraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosAseguradora.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarAseguradora && this.isPermisoGuardarCambiosAseguradora) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.aseguradoraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.aseguradoraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosAseguradora.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.aseguradoraSessionBean.getConGuardarRelaciones()) {
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
				
					this.jTableDatosAseguradora.addColumn(tableColumn);
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
			
			this.jTableDatosAseguradora.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAseguradora && this.isPermisoGuardarCambiosAseguradora) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.aseguradoraSessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarAseguradora && this.isPermisoGuardarCambiosAseguradora) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosAseguradora.moveColumn(this.jTableDatosAseguradora.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosAseguradora.moveColumn(this.jTableDatosAseguradora.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.aseguradoraSessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosAseguradora.moveColumn(this.jTableDatosAseguradora.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosAseguradora.moveColumn(this.jTableDatosAseguradora.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosAseguradora.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosAseguradora.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosAseguradora,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosAseguradora.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosAseguradora.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosAseguradora.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosAseguradora.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosAseguradora.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=aseguradoraLogic.getAseguradoras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=aseguradoras.size()-1;
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
		//this.jTableDatosAseguradora.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosAseguradora.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosAseguradora();
			
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
				
				//this.isEsNuevoAseguradora=false;
					
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
				if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormAseguradora==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAseguradora.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAseguradora.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.aseguradora.getsType().equals("DUPLICADO")
				   || this.aseguradora.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoAseguradora=true;
				
				} else {
					this.isEsNuevoAseguradora=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
					if(this.aseguradora.getId()>=0 && !this.aseguradora.getIsNew()) {						
						this.isEsNuevoAseguradora=false;
						
					} else {
						this.isEsNuevoAseguradora=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoAseguradora(esRelaciones);						
				
				this.seleccionarAseguradora(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.aseguradora.getId()<0) {
					this.isEsNuevoAseguradora=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarAseguradora(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarAseguradora(evt,rowIndex);
				}	
				
				if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion Aseguradora: " + this.dDif); 
					}
				}								
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarAseguradora(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.aseguradora)) {
					if(this.aseguradora.getId()>0) {
						this.aseguradora.setIsDeleted(true);
						
						this.aseguradorasEliminados.add(this.aseguradora);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.aseguradoraLogic.getAseguradoras().remove(this.aseguradora);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.aseguradoras.remove(this.aseguradora);				
					}
					
					
					((AseguradoraModel) this.jTableDatosAseguradora.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaAseguradora(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarAseguradora(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoAseguradora) {
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosAseguradora.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosAseguradora.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioAseguradora(this.aseguradora);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.aseguradoraConstantesFunciones.cargarid_empresaAseguradora || this.aseguradoraConstantesFunciones.event_dependid_empresaAseguradora) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.aseguradora.getid_empresa());
									//this.inicializarActualizarBindingAseguradora(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(aseguradora.getEmpresa()!=null) {
							this.empresasForeignKey.add(aseguradora.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.aseguradora.getid_empresa(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesAseguradora("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesAseguradora(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualAseguradora() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoAseguradora(Aseguradora aseguradora) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoAseguradora(aseguradora,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoAseguradora(Aseguradora aseguradora,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioAseguradora(aseguradora);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyAseguradora(aseguradora,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyAseguradora(aseguradora);
	}
	
	public void setVariablesObjetoActualToFormularioAseguradora(Aseguradora aseguradora) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setText(aseguradora.getId().toString());
			this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setText(aseguradora.getcodigo());
			this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setText(aseguradora.getnombre());
			this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setText(aseguradora.getdireccion());
			this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setText(aseguradora.gettelefono());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,Aseguradora aseguradoraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,aseguradoraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,Aseguradora aseguradoraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				aseguradoraLocal=this.aseguradora;
			} else {
				aseguradoraLocal=this.aseguradoraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(aseguradoraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoAseguradora(aseguradoraLocal,true);
					
					if(aseguradoraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(aseguradoraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(aseguradoraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoAseguradora(Aseguradora aseguradora,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAseguradora(aseguradora,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(aseguradora);
	}
	
	public void setVariablesFormularioToObjetoActualAseguradora(Aseguradora aseguradora,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualAseguradora(aseguradora,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualAseguradora(Aseguradora aseguradora,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.getText()==null || this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.getText()=="" || this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.getText()=="Id") {
				this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setText("0");
			}

			if(conColumnasBase) {aseguradora.setId(Long.parseLong(this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AseguradoraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabelIdAseguradora,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			aseguradora.setcodigo(this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AseguradoraConstantesFunciones.LABEL_CODIGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabelcodigoAseguradora,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			aseguradora.setnombre(this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AseguradoraConstantesFunciones.LABEL_NOMBRE+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabelnombreAseguradora,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			aseguradora.setdireccion(this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AseguradoraConstantesFunciones.LABEL_DIRECCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabeldireccionAseguradora,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			aseguradora.settelefono(this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+AseguradoraConstantesFunciones.LABEL_TELEFONO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormAseguradora.jLabeltelefonoAseguradora,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualAseguradora(Aseguradora aseguradoraBean,Aseguradora aseguradora,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosAseguradora(Aseguradora aseguradoraOrigen,Aseguradora aseguradora,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && aseguradoraOrigen.getId()!=null && !aseguradoraOrigen.getId().equals(0L))) {aseguradora.setId(aseguradoraOrigen.getId());}}
			if(conDefault || (!conDefault && aseguradoraOrigen.getcodigo()!=null && !aseguradoraOrigen.getcodigo().equals(""))) {aseguradora.setcodigo(aseguradoraOrigen.getcodigo());}
			if(conDefault || (!conDefault && aseguradoraOrigen.getnombre()!=null && !aseguradoraOrigen.getnombre().equals(""))) {aseguradora.setnombre(aseguradoraOrigen.getnombre());}
			if(conDefault || (!conDefault && aseguradoraOrigen.getdireccion()!=null && !aseguradoraOrigen.getdireccion().equals(""))) {aseguradora.setdireccion(aseguradoraOrigen.getdireccion());}
			if(conDefault || (!conDefault && aseguradoraOrigen.gettelefono()!=null && !aseguradoraOrigen.gettelefono().equals(""))) {aseguradora.settelefono(aseguradoraOrigen.gettelefono());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAseguradora(Aseguradora aseguradora) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setText(aseguradora.getId().toString());
			this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setText(aseguradora.getcodigo());
			this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setText(aseguradora.getnombre());
			this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setText(aseguradora.getdireccion());
			this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setText(aseguradora.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioAseguradora(AseguradoraBean aseguradoraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setText(aseguradoraBean.getId().toString());
			this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setText(aseguradoraBean.getcodigo());
			this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setText(aseguradoraBean.getnombre());
			this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setText(aseguradoraBean.getdireccion());
			this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setText(aseguradoraBean.gettelefono());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanAseguradora(AseguradoraParameterReturnGeneral aseguradoraReturnGeneral,AseguradoraBean aseguradoraBean,Boolean conDefault) throws Exception { 
		try {
			Aseguradora aseguradoraLocal=new Aseguradora();
			
			aseguradoraLocal=aseguradoraReturnGeneral.getAseguradora();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && aseguradoraLocal.getId()!=null && !aseguradoraLocal.getId().equals(0L))) {aseguradoraBean.setId(aseguradoraLocal.getId());}}
			if(conDefault || (!conDefault && aseguradoraLocal.getcodigo()!=null && !aseguradoraLocal.getcodigo().equals(""))) {aseguradoraBean.setcodigo(aseguradoraLocal.getcodigo());}
			if(conDefault || (!conDefault && aseguradoraLocal.getnombre()!=null && !aseguradoraLocal.getnombre().equals(""))) {aseguradoraBean.setnombre(aseguradoraLocal.getnombre());}
			if(conDefault || (!conDefault && aseguradoraLocal.getdireccion()!=null && !aseguradoraLocal.getdireccion().equals(""))) {aseguradoraBean.setdireccion(aseguradoraLocal.getdireccion());}
			if(conDefault || (!conDefault && aseguradoraLocal.gettelefono()!=null && !aseguradoraLocal.gettelefono().equals(""))) {aseguradoraBean.settelefono(aseguradoraLocal.gettelefono());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxAseguradoraGenerico(Long idAseguradoraSeleccionado,JComboBox jComboBoxAseguradora,List<Aseguradora> aseguradorasLocal)throws Exception {
		try {
			Aseguradora  aseguradoraTemp=null;

			for(Aseguradora aseguradoraAux:aseguradorasLocal) {
				if(aseguradoraAux.getId()!=null && aseguradoraAux.getId().equals(idAseguradoraSeleccionado)) {
					aseguradoraTemp=aseguradoraAux;
					break;
				}
			}

			jComboBoxAseguradora.setSelectedItem(aseguradoraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxAseguradoraGenerico(JComboBox jComboBoxAseguradora,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAseguradora.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxAseguradora.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxAseguradora.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxAseguradora.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxAseguradora.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxAseguradora.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("Vehiculo")) {
			jButtonVehiculoActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			aseguradora=(Aseguradora) aseguradoraLogic.getAseguradoras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			aseguradora =(Aseguradora) aseguradoras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!aseguradora.getIsNew() && !aseguradora.getIsChanged() && !aseguradora.getIsDeleted()) {
				sDescripcion=aseguradora.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=aseguradora.getempresa_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		Aseguradora aseguradoraRow=new Aseguradora();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			aseguradoraRow=(Aseguradora) aseguradoraLogic.getAseguradoras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			aseguradoraRow=(Aseguradora) aseguradoras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonVehiculoActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,Aseguradora aseguradora) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormAseguradora==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora = (Aseguradora)this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.aseguradora = (Aseguradora)this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(aseguradora!=null) {
						this.aseguradora = aseguradora;
					} else {
						this.aseguradora = new Aseguradora();
					}
				}

				if(this.isTienePermisosVehiculo && this.permiteMantenimiento(this.aseguradora)) {
					VehiculoBeanSwingJInternalFrame vehiculoBeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup=new VehiculoBeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						vehiculoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup;
					} else {
						vehiculoBeanSwingJInternalFrame=this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame;
					}

					List<Aseguradora> aseguradoras=new ArrayList<Aseguradora>();
					aseguradoras.add(this.aseguradora);
					if(!esRelacionado) {
						//vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setConGuardarRelaciones(false);
						//vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					vehiculoBeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormAseguradora.cargarVehiculoBeanSwingJInternalFrame(aseguradoras,this.aseguradora,vehiculoBeanSwingJInternalFrame,/*conInicializar,*/vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.getConGuardarRelaciones(),vehiculoBeanSwingJInternalFrame.vehiculoSessionBean.getEsGuardarRelacionado());
					vehiculoBeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						vehiculoBeanSwingJInternalFrame.actualizarEstadoPanelsVehiculo("no_relacionado");

						vehiculoBeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(VehiculoConstantesFunciones.ITAMANIOFILATABLA + (VehiculoConstantesFunciones.ITAMANIOFILATABLA/2));

						vehiculoBeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderAseguradora=(TitledBorder)this.jScrollPanelDatosAseguradora.getBorder();
						TitledBorder titledBorderVehiculo=(TitledBorder)vehiculoBeanSwingJInternalFrame.jScrollPanelDatosVehiculo.getBorder();

						titledBorderVehiculo.setTitle(titledBorderAseguradora.getTitle() + " -> Vehiculo");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,vehiculoBeanSwingJInternalFrame);
						}

						vehiculoBeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(vehiculoBeanSwingJInternalFrame);

						vehiculoBeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.aseguradoraSessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Vehiculo",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualAseguradora(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoAseguradora.setVisible((this.isVisibilidadCeldaNuevoAseguradora && this.isPermisoNuevoAseguradora));			
			this.jButtonDuplicarAseguradora.setVisible((this.isVisibilidadCeldaDuplicarAseguradora && this.isPermisoDuplicarAseguradora));			
			this.jButtonCopiarAseguradora.setVisible((this.isVisibilidadCeldaCopiarAseguradora && this.isPermisoCopiarAseguradora));
			this.jButtonVerFormAseguradora.setVisible((this.isVisibilidadCeldaVerFormAseguradora && this.isPermisoVerFormAseguradora));
			
			this.jButtonAbrirOrderByAseguradora.setVisible((this.isVisibilidadCeldaOrdenAseguradora && this.isPermisoOrdenAseguradora));			
			
			this.jButtonNuevoRelacionesAseguradora.setVisible((this.isVisibilidadCeldaNuevoRelacionesAseguradora && this.isPermisoNuevoAseguradora));			
			this.jButtonNuevoGuardarCambiosAseguradora.setVisible((this.isVisibilidadCeldaNuevoAseguradora && this.isPermisoNuevoAseguradora && this.isPermisoGuardarCambiosAseguradora));
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.jInternalFrameDetalleFormAseguradora.jButtonModificarAseguradora.setVisible((this.isVisibilidadCeldaModificarAseguradora && this.isPermisoActualizarAseguradora));	
			this.jInternalFrameDetalleFormAseguradora.jButtonActualizarAseguradora.setVisible((this.isVisibilidadCeldaActualizarAseguradora && this.isPermisoActualizarAseguradora));	
			this.jInternalFrameDetalleFormAseguradora.jButtonEliminarAseguradora.setVisible((this.isVisibilidadCeldaEliminarAseguradora && this.isPermisoEliminarAseguradora));
			this.jInternalFrameDetalleFormAseguradora.jButtonCancelarAseguradora.setVisible(this.isVisibilidadCeldaCancelarAseguradora);							
			this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.setVisible((this.isVisibilidadCeldaGuardarAseguradora && this.isPermisoGuardarCambiosAseguradora));			
			
			}
						
			this.jButtonGuardarCambiosTablaAseguradora.setVisible((this.isVisibilidadCeldaGuardarCambiosAseguradora && this.isPermisoGuardarCambiosAseguradora));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarAseguradora.setVisible((this.isVisibilidadCeldaNuevoAseguradora && this.isPermisoNuevoAseguradora));						
			this.jButtonDuplicarToolBarAseguradora.setVisible((this.isVisibilidadCeldaDuplicarAseguradora && this.isPermisoDuplicarAseguradora));						
			this.jButtonCopiarToolBarAseguradora.setVisible((this.isVisibilidadCeldaCopiarAseguradora && this.isPermisoCopiarAseguradora));			
			this.jButtonVerFormToolBarAseguradora.setVisible((this.isVisibilidadCeldaVerFormAseguradora && this.isPermisoVerFormAseguradora));			
			this.jButtonAbrirOrderByToolBarAseguradora.setVisible((this.isVisibilidadCeldaOrdenAseguradora && this.isPermisoOrdenAseguradora));
			this.jButtonNuevoRelacionesToolBarAseguradora.setVisible((this.isVisibilidadCeldaNuevoRelacionesAseguradora && this.isPermisoNuevoAseguradora));			
			this.jButtonNuevoGuardarCambiosToolBarAseguradora.setVisible((this.isVisibilidadCeldaNuevoAseguradora && this.isPermisoNuevoAseguradora && this.isPermisoGuardarCambiosAseguradora));			
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.jInternalFrameDetalleFormAseguradora.jButtonModificarToolBarAseguradora.setVisible((this.isVisibilidadCeldaModificarAseguradora && this.isPermisoActualizarAseguradora));	
			this.jInternalFrameDetalleFormAseguradora.jButtonActualizarToolBarAseguradora.setVisible((this.isVisibilidadCeldaActualizarAseguradora  && this.isPermisoActualizarAseguradora));	
			this.jInternalFrameDetalleFormAseguradora.jButtonEliminarToolBarAseguradora.setVisible((this.isVisibilidadCeldaEliminarAseguradora && this.isPermisoEliminarAseguradora));
			this.jInternalFrameDetalleFormAseguradora.jButtonCancelarToolBarAseguradora.setVisible(this.isVisibilidadCeldaCancelarAseguradora);				
			this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosToolBarAseguradora.setVisible((this.isVisibilidadCeldaGuardarAseguradora && this.isPermisoGuardarCambiosAseguradora));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarAseguradora.setVisible((this.isVisibilidadCeldaGuardarCambiosAseguradora && this.isPermisoGuardarCambiosAseguradora));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoAseguradora.setVisible((this.isVisibilidadCeldaNuevoAseguradora && this.isPermisoNuevoAseguradora));			
			this.jMenuItemDuplicarAseguradora.setVisible((this.isVisibilidadCeldaDuplicarAseguradora && this.isPermisoDuplicarAseguradora));			
			this.jMenuItemCopiarAseguradora.setVisible((this.isVisibilidadCeldaCopiarAseguradora && this.isPermisoCopiarAseguradora));			
			this.jMenuItemVerFormAseguradora.setVisible((this.isVisibilidadCeldaVerFormAseguradora && this.isPermisoVerFormAseguradora));			
			this.jMenuItemAbrirOrderByAseguradora.setVisible((this.isVisibilidadCeldaOrdenAseguradora && this.isPermisoOrdenAseguradora));			
			//this.jMenuItemMostrarOcultarAseguradora.setVisible((this.isVisibilidadCeldaOrdenAseguradora && this.isPermisoOrdenAseguradora));
			this.jMenuItemDetalleAbrirOrderByAseguradora.setVisible((this.isVisibilidadCeldaOrdenAseguradora && this.isPermisoOrdenAseguradora));			
			//this.jMenuItemDetalleMostrarOcultarAseguradora.setVisible((this.isVisibilidadCeldaOrdenAseguradora && this.isPermisoOrdenAseguradora));			
			this.jMenuItemNuevoRelacionesAseguradora.setVisible((this.isVisibilidadCeldaNuevoRelacionesAseguradora && this.isPermisoNuevoAseguradora));			
			this.jMenuItemNuevoGuardarCambiosAseguradora.setVisible((this.isVisibilidadCeldaNuevoAseguradora && this.isPermisoNuevoAseguradora && this.isPermisoGuardarCambiosAseguradora));									
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.jInternalFrameDetalleFormAseguradora.jMenuItemModificarAseguradora.setVisible((this.isVisibilidadCeldaModificarAseguradora && this.isPermisoActualizarAseguradora));	
			this.jInternalFrameDetalleFormAseguradora.jMenuItemActualizarAseguradora.setVisible((this.isVisibilidadCeldaActualizarAseguradora && this.isPermisoActualizarAseguradora));	
			this.jInternalFrameDetalleFormAseguradora.jMenuItemEliminarAseguradora.setVisible((this.isVisibilidadCeldaEliminarAseguradora && this.isPermisoEliminarAseguradora));
			this.jInternalFrameDetalleFormAseguradora.jMenuItemCancelarAseguradora.setVisible(this.isVisibilidadCeldaCancelarAseguradora);				
			}
			
			this.jMenuItemGuardarCambiosAseguradora.setVisible((this.isVisibilidadCeldaGuardarAseguradora && this.isPermisoGuardarCambiosAseguradora));						
			this.jMenuItemGuardarCambiosTablaAseguradora.setVisible((this.isVisibilidadCeldaGuardarCambiosAseguradora && this.isPermisoGuardarCambiosAseguradora));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoAseguradora=this.jButtonNuevoAseguradora.isVisible();
			this.isVisibilidadCeldaDuplicarAseguradora=this.jButtonDuplicarAseguradora.isVisible();
			this.isVisibilidadCeldaCopiarAseguradora=this.jButtonCopiarAseguradora.isVisible();
			this.isVisibilidadCeldaVerFormAseguradora=this.jButtonVerFormAseguradora.isVisible();
			
			this.isVisibilidadCeldaOrdenAseguradora=this.jButtonAbrirOrderByAseguradora.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=this.jButtonNuevoRelacionesAseguradora.isVisible();
			this.isVisibilidadCeldaModificarAseguradora=this.jButtonModificarAseguradora.isVisible();
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.isVisibilidadCeldaActualizarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonActualizarAseguradora.isVisible();
			this.isVisibilidadCeldaEliminarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonEliminarAseguradora.isVisible();
			this.isVisibilidadCeldaCancelarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonCancelarAseguradora.isVisible();
			this.isVisibilidadCeldaGuardarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosAseguradora=this.jButtonGuardarCambiosTablaAseguradora.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoAseguradora=this.jButtonNuevoToolBarAseguradora.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=this.jButtonNuevoRelacionesToolBarAseguradora.isVisible();
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.isVisibilidadCeldaModificarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonModificarToolBarAseguradora.isVisible();
			this.isVisibilidadCeldaActualizarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonActualizarToolBarAseguradora.isVisible();
			this.isVisibilidadCeldaEliminarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonEliminarToolBarAseguradora.isVisible();
			this.isVisibilidadCeldaCancelarAseguradora=this.jInternalFrameDetalleFormAseguradora.jButtonCancelarToolBarAseguradora.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAseguradora=this.jButtonGuardarCambiosToolBarAseguradora.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAseguradora=this.jButtonGuardarCambiosTablaToolBarAseguradora.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoAseguradora=this.jMenuItemNuevoAseguradora.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=this.jMenuItemNuevoRelacionesAseguradora.isVisible();
			
			if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.isVisibilidadCeldaModificarAseguradora=this.jInternalFrameDetalleFormAseguradora.jMenuItemModificarAseguradora.isVisible();
			this.isVisibilidadCeldaActualizarAseguradora=this.jInternalFrameDetalleFormAseguradora.jMenuItemActualizarAseguradora.isVisible();
			this.isVisibilidadCeldaEliminarAseguradora=this.jInternalFrameDetalleFormAseguradora.jMenuItemEliminarAseguradora.isVisible();
			this.isVisibilidadCeldaCancelarAseguradora=this.jInternalFrameDetalleFormAseguradora.jMenuItemCancelarAseguradora.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarAseguradora=this.jMenuItemGuardarCambiosAseguradora.isVisible();
			this.isVisibilidadCeldaGuardarCambiosAseguradora=this.jMenuItemGuardarCambiosTablaAseguradora.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesAseguradora(Boolean esInicializar) {
		if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
				//if(this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesAseguradora();
			}
			
			this.inicializarActualizarBindingBotonesManualAseguradora(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualAseguradora() {
		this.jButtonNuevoAseguradora.setVisible(this.isPermisoNuevoAseguradora);			
		this.jButtonDuplicarAseguradora.setVisible(this.isPermisoDuplicarAseguradora);			
		this.jButtonCopiarAseguradora.setVisible(this.isPermisoCopiarAseguradora);			
		this.jButtonVerFormAseguradora.setVisible(this.isPermisoVerFormAseguradora);			
		
		this.jButtonAbrirOrderByAseguradora.setVisible(this.isPermisoOrdenAseguradora);					
		
		this.jButtonNuevoRelacionesAseguradora.setVisible(this.isPermisoNuevoAseguradora);			
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonModificarAseguradora.setVisible(this.isPermisoActualizarAseguradora);	
			this.jInternalFrameDetalleFormAseguradora.jButtonActualizarAseguradora.setVisible(this.isPermisoActualizarAseguradora);	
			this.jInternalFrameDetalleFormAseguradora.jButtonEliminarAseguradora.setVisible(this.isPermisoEliminarAseguradora);
			this.jInternalFrameDetalleFormAseguradora.jButtonCancelarAseguradora.setVisible(this.isVisibilidadCeldaCancelarAseguradora);						
			this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.setVisible(this.isPermisoGuardarCambiosAseguradora);							
		}
		
		this.jButtonGuardarCambiosTablaAseguradora.setVisible(this.isPermisoActualizarAseguradora);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleAseguradora() {
		this.jInternalFrameDetalleFormAseguradora.jButtonModificarAseguradora.setVisible(this.isPermisoActualizarAseguradora);	
		this.jInternalFrameDetalleFormAseguradora.jButtonActualizarAseguradora.setVisible(this.isPermisoActualizarAseguradora);	
		this.jInternalFrameDetalleFormAseguradora.jButtonEliminarAseguradora.setVisible(this.isPermisoEliminarAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jButtonCancelarAseguradora.setVisible(this.isVisibilidadCeldaCancelarAseguradora);							
		this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.setVisible((this.isVisibilidadCeldaGuardarAseguradora && this.isPermisoGuardarCambiosAseguradora));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosAseguradora() {
		if(AseguradoraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualAseguradora();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesAseguradora() {
	}
	
	public void jTableDatosAseguradoraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarAseguradora(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidAseguradoraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.aseguradora==null) {
						this.aseguradora = new Aseguradora();
					}

					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				}

				if(this.aseguradora.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.aseguradora.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAseguradora(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaAseguradoraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebAseguradora(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosAseguradora.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosAseguradora.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.aseguradoraLogic.getConnexion());

				if(this.aseguradora.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.aseguradora.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderAseguradora=(TitledBorder)this.jScrollPanelDatosAseguradora.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderAseguradora.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaAseguradoraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.aseguradora==null) {
						this.aseguradora = new Aseguradora();
					}

					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				}

				if(this.aseguradora.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.aseguradora.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAseguradora(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncodigoAseguradoraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.aseguradora==null) {
						this.aseguradora = new Aseguradora();
					}

					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				}

				if(this.aseguradora.getcodigo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where codigo like '%"+this.aseguradora.getcodigo()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAseguradora(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnombreAseguradoraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.aseguradora==null) {
						this.aseguradora = new Aseguradora();
					}

					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				}

				if(this.aseguradora.getnombre()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where nombre like '%"+this.aseguradora.getnombre()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAseguradora(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondireccionAseguradoraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.aseguradora==null) {
						this.aseguradora = new Aseguradora();
					}

					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				}

				if(this.aseguradora.getdireccion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where direccion like '%"+this.aseguradora.getdireccion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAseguradora(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtontelefonoAseguradoraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.getaseguradora(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.aseguradora==null) {
						this.aseguradora = new Aseguradora();
					}

					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);
				}

				if(this.aseguradora.gettelefono()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where telefono like '%"+this.aseguradora.gettelefono()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingAseguradora(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpresaAseguradoraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingAseguradora(false,false);

			this.getAseguradorasFK_IdEmpresa();

			this.inicializarActualizarBindingAseguradora(false);

			//if(AseguradoraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingAseguradora(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.aseguradoraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameAseguradora() {
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
		

		if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
			this.jInternalFrameDetalleFormAseguradora.setVisible(false);	    			
			this.jInternalFrameDetalleFormAseguradora.dispose();
			this.jInternalFrameDetalleFormAseguradora=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
			this.jInternalFrameReporteDinamicoAseguradora.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoAseguradora.dispose();
			this.jInternalFrameReporteDinamicoAseguradora=null;
		}
		
		if(this.jInternalFrameImportacionAseguradora!=null) {
			this.jInternalFrameImportacionAseguradora.setVisible(false);	    			
			this.jInternalFrameImportacionAseguradora.dispose();
			this.jInternalFrameImportacionAseguradora=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessAseguradora();
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			
			if(sTipo.equals("NuevoAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarAseguradora")) {
				jButtonDuplicarAseguradoraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarAseguradora")) {
				jButtonCopiarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("VerFormAseguradora")) {
				jButtonVerFormAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarAseguradora")) {
				jButtonDuplicarAseguradoraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarAseguradora")) {
				jButtonDuplicarAseguradoraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarAseguradora")) {
				jButtonModificarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarAseguradora")) {
				jButtonModificarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarAseguradora")) {
				jButtonModificarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarAseguradora")) {
				jButtonActualizarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarAseguradora")) {
				jButtonActualizarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarAseguradora")) {
				jButtonActualizarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("EliminarAseguradora")) {
				jButtonEliminarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarAseguradora")) {
				jButtonEliminarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarAseguradora")) {
				jButtonEliminarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("CancelarAseguradora")) {
				jButtonCancelarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarAseguradora")) {
				jButtonCancelarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarAseguradora")) {
				jButtonCancelarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("CerrarAseguradora")) {
				jButtonCerrarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarAseguradora")) {
				jButtonCerrarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarAseguradora")) {
				jButtonCerrarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarAseguradora")) {
				jButtonMostrarOcultarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarAseguradora")) {
				jButtonCancelarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarAseguradora")) {
				jButtonCopiarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarAseguradora")) {
				jButtonVerFormAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarAseguradora")) {
				jButtonCopiarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormAseguradora")) {
				jButtonVerFormAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionAseguradora")) {
				jButtonRecargarInformacionAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarAseguradora")) {
				jButtonRecargarInformacionAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionAseguradora")) {
				jButtonRecargarInformacionAseguradoraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresAseguradora")) {
				jButtonAnterioresAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarAseguradora")) {
				jButtonAnterioresAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreAseguradora")) {
				jButtonAnterioresAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesAseguradora")) {
				jButtonSiguientesAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarAseguradora")) {
				jButtonSiguientesAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesAseguradora")) {
				jButtonSiguientesAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByAseguradora") || sTipo.equals("MenuItemDetalleAbrirOrderByAseguradora")) {
				jButtonAbrirOrderByAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarAseguradora") || sTipo.equals("MenuItemDetalleMostrarOcultarAseguradora")) {
				jButtonMostrarOcultarAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosAseguradora")) {
				jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarAseguradora")) {
				jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosAseguradora")) {
				jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoAseguradora")) {
				jButtonCerrarReporteDinamicoAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoAseguradora")) {
				jButtonGenerarReporteDinamicoAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoAseguradora")) {
				
				jButtonGenerarExcelReporteDinamicoAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionAseguradora")) {
				jButtonCerrarImportacionAseguradoraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionAseguradora")) {
				
				jButtonGenerarImportacionAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionAseguradora")) {
				
				jButtonAbrirImportacionAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesAseguradora")) {
				jComboBoxTiposAccionesAseguradoraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesAseguradora")) {
				jComboBoxTiposRelacionesAseguradoraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioAseguradora")) {
				jComboBoxTiposAccionesAseguradoraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarAseguradora")) {
				
				jComboBoxTiposSeleccionarAseguradoraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralAseguradora")) {
				jTextFieldValorCampoGeneralAseguradoraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByAseguradora")) {
				jButtonAbrirOrderByAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarAseguradora")) {
				jButtonAbrirOrderByAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByAseguradora")) {
				jButtonCerrarOrderByAseguradoraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAseguradoraBusqueda")) {
				this.jButtonidAseguradoraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAseguradoraUpdate")) {
				this.jButtonid_empresaAseguradoraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAseguradoraBusqueda")) {
				this.jButtonid_empresaAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAseguradoraBusqueda")) {
				this.jButtoncodigoAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAseguradoraBusqueda")) {
				this.jButtonnombreAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionAseguradoraBusqueda")) {
				this.jButtondireccionAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoAseguradoraBusqueda")) {
				this.jButtontelefonoAseguradoraBusquedaActionPerformed(evt);
			}
			
			
			
			
			
			;
			
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessAseguradora();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			Aseguradora aseguradoraLocal=null;
			
			if(!this.getEsControlTabla()) {
				aseguradoraLocal=this.aseguradora;
			} else {
				aseguradoraLocal=this.aseguradoraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
							
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
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
			
			


			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
								
						
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
								
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
			
			this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
							
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
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
			
			


			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
			
			this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
								
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
			
			this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosAseguradora")) {
					jCheckBoxSeleccionarTodosAseguradoraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosAseguradora")) {
					jCheckBoxSeleccionadosAseguradoraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarAseguradora")) {
					
				}
				
				


				
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
												
				
				


				
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
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
			
			


			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaAseguradoraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.aseguradora);
				
				this.actualizarInformacion("INFO_PADRE",false,this.aseguradora);
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
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
				
				


				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(Aseguradora.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",Aseguradora.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaAseguradoraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.aseguradoraAnterior =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarAseguradora")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosAseguradoraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosAseguradora.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.aseguradora =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.aseguradora =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.aseguradora);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarAseguradora")) {
				
				}
				
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarAseguradora")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosAseguradora.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarAseguradora")) {
			
			}
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessAseguradora();
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			if(sTipo.equals("NuevoAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarAseguradora")) {
				jButtonDuplicarAseguradoraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarAseguradora")) {
				jButtonCopiarAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormAseguradora")) {
				jButtonVerFormAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesAseguradora")) {
				jButtonNuevoAseguradoraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarAseguradora")) {
				jButtonModificarAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarAseguradora")) {
				jButtonActualizarAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarAseguradora")) {
				jButtonEliminarAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarAseguradora")) {
				jButtonCancelarAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarAseguradora")) {
				jButtonCerrarAseguradoraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosAseguradora")) {
				jButtonGuardarCambiosAseguradoraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosAseguradora")) {
				jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByAseguradora")) {
				jButtonAbrirOrderByAseguradoraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionAseguradora")) {
				jButtonRecargarInformacionAseguradoraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresAseguradora")) {
				jButtonAnterioresAseguradoraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesAseguradora")) {
				jButtonSiguientesAseguradoraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idAseguradoraBusqueda")) {
				this.jButtonidAseguradoraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaAseguradoraUpdate")) {
				this.jButtonid_empresaAseguradoraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaAseguradoraBusqueda")) {
				this.jButtonid_empresaAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("codigoAseguradoraBusqueda")) {
				this.jButtoncodigoAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("nombreAseguradoraBusqueda")) {
				this.jButtonnombreAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("direccionAseguradoraBusqueda")) {
				this.jButtondireccionAseguradoraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("telefonoAseguradoraBusqueda")) {
				this.jButtontelefonoAseguradoraBusquedaActionPerformed(evt);
			}
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessAseguradora();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameAseguradora")) {
				closingInternalFrameAseguradora();
				
			} else if(sTipo.equals("jButtonCancelarAseguradora")) {
				JInternalFrameBase jInternalFrameDetalleFormAseguradora = (JInternalFrameBase)evt.getSource();
	            	
	            AseguradoraBeanSwingJInternalFrame jInternalFrameParent=(AseguradoraBeanSwingJInternalFrame)jInternalFrameDetalleFormAseguradora.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarAseguradoraActionPerformed(null);
			}
			
			AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.aseguradora,new Object(),this.aseguradoraParameterGeneral,this.aseguradoraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormAseguradora(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormAseguradora(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormAseguradora(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.aseguradora)) {
			if(!esControlTabla) {
				if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);			
				}
				
				if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualAseguradora(this.aseguradora,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.aseguradoraReturnGeneral=aseguradoraLogic.procesarEventosAseguradorasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.aseguradoraLogic.getAseguradoras(),this.aseguradora,this.aseguradoraParameterGeneral,this.isEsNuevoAseguradora,classes);//this.aseguradoraLogic.getAseguradora()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanAseguradora(this.aseguradoraReturnGeneral,this.aseguradoraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanAseguradora(classes,this.aseguradoraReturnGeneral,this.aseguradoraBean,false);
					}
						
					if(this.aseguradoraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyAseguradora(this.aseguradoraReturnGeneral.getAseguradora());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioAseguradora(this.aseguradoraReturnGeneral.getAseguradora());	
					}
						
					if(this.aseguradoraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioAseguradora(this.aseguradoraReturnGeneral.getAseguradora(),classes);//this.aseguradoraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioAseguradora(this.aseguradora,classes);//this.aseguradoraBean);									
				}
			
				if(AseguradoraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualAseguradora(this.aseguradora,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysAseguradora(this.aseguradora);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.aseguradoraAnterior!=null) {
						this.aseguradora=this.aseguradoraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.aseguradoraReturnGeneral=aseguradoraLogic.procesarEventosAseguradorasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.aseguradoraLogic.getAseguradoras(),this.aseguradora,this.aseguradoraParameterGeneral,this.isEsNuevoAseguradora,classes);//this.aseguradoraLogic.getAseguradora()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.aseguradoraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.aseguradoraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.aseguradoraReturnGeneral.getAseguradora(),aseguradoraLogic.getAseguradoras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.aseguradoraReturnGeneral.getAseguradora(),this.aseguradoras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosAseguradora.repaint();
				
				//((AbstractTableModel) this.jTableDatosAseguradora.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosAseguradora();
			}
		}
	}
	
	public void actualizarVisualTableDatosAseguradora() throws Exception {
		
		AseguradoraModel aseguradoraModel=(AseguradoraModel)this.jTableDatosAseguradora.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			aseguradoraModel.aseguradoras=this.aseguradoraLogic.getAseguradoras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			aseguradoraModel.aseguradoras=this.aseguradoras;
		}
		
		
		((AseguradoraModel) this.jTableDatosAseguradora.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaAseguradora() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getaseguradoraAnterior(),this.aseguradoraLogic.getAseguradoras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getaseguradoraAnterior(),this.aseguradoras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosAseguradora();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioAseguradora(Aseguradora aseguradora,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Vehiculo.class)) {
					this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.setVehiculos(aseguradora.getVehiculos());
					this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.inicializarActualizarBindingTablaVehiculo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
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
										
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.aseguradora,new Object(),generalEntityParameterGeneral,this.aseguradoraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.aseguradoraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=AseguradoraConstantesFunciones.getClassesRelationshipsOfAseguradora(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=AseguradoraConstantesFunciones.getClassesRelationshipsFromStringsOfAseguradora(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormAseguradora(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				AseguradoraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.aseguradora,new Object(),generalEntityParameterGeneral,this.aseguradoraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioAseguradora(AseguradoraBean aseguradoraBean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(Vehiculo.class)) {
					this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.setVehiculos(aseguradora.getVehiculos());
					this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.inicializarActualizarBindingTablaVehiculo(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanAseguradora(ArrayList<Classe> classes,AseguradoraReturnGeneral aseguradoraReturnGeneral,AseguradoraBean aseguradoraBean,Boolean conDefault) throws Exception {
		
			this.aseguradoraBean.setVehiculos(aseguradoraReturnGeneral.getAseguradora().getVehiculos());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualAseguradora(Aseguradora aseguradora,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(Vehiculo.class)) {
					aseguradora.setVehiculos(this.jInternalFrameDetalleFormAseguradora.vehiculoBeanSwingJInternalFrame.vehiculoLogic.getVehiculos());
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
		if(!paraTabla && !this.permiteMantenimiento(this.aseguradora)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormAseguradora = new AseguradoraDetalleFormJInternalFrame(jDesktopPane,this.aseguradoraSessionBean.getConGuardarRelaciones(),this.aseguradoraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormAseguradora);
		this.jInternalFrameDetalleFormAseguradora.setVisible(false);
		this.jInternalFrameDetalleFormAseguradora.setSelected(false);						
		
		this.jInternalFrameDetalleFormAseguradora.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormAseguradora.aseguradoraLogic=this.aseguradoraLogic;
		
		this.cargarCombosFrameForeignKeyAseguradora("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleAseguradora();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleAseguradora();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyAseguradora("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyAseguradora();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormAseguradora.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAseguradora"));
		
		this.jInternalFrameDetalleFormAseguradora.jButtonModificarAseguradora.addActionListener(new ButtonActionListener(this,"ModificarAseguradora"));

		
		this.jInternalFrameDetalleFormAseguradora.jButtonModificarToolBarAseguradora.addActionListener(new ButtonActionListener(this,"ModificarToolBarAseguradora"));
					
		this.jInternalFrameDetalleFormAseguradora.jMenuItemModificarAseguradora.addActionListener(new ButtonActionListener(this,"MenuItemModificarAseguradora"));		
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonActualizarAseguradora.addActionListener (new ButtonActionListener(this,"ActualizarAseguradora"));
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonActualizarToolBarAseguradora.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAseguradora"));
						
		this.jInternalFrameDetalleFormAseguradora.jMenuItemActualizarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAseguradora"));		
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonEliminarAseguradora.addActionListener (new ButtonActionListener(this,"EliminarAseguradora"));
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonEliminarToolBarAseguradora.addActionListener (new ButtonActionListener(this,"EliminarToolBarAseguradora"));
								
		this.jInternalFrameDetalleFormAseguradora.jMenuItemEliminarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAseguradora"));		
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonCancelarAseguradora.addActionListener (new ButtonActionListener(this,"CancelarAseguradora"));
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonCancelarToolBarAseguradora.addActionListener (new ButtonActionListener(this,"CancelarToolBarAseguradora"));
					
		this.jInternalFrameDetalleFormAseguradora.jMenuItemCancelarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAseguradora"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jMenuItemDetalleCerrarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAseguradora"));		
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosToolBarAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAseguradora"));
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosToolBarAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAseguradora"));
		
		
		
		this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAseguradora"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonidAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"idAseguradoraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAseguradora.jButtonid_empresaAseguradoraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAseguradoraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonid_empresaAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtoncodigoAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"codigoAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonnombreAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"nombreAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtondireccionAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"direccionAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtontelefonoAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"telefonoAseguradoraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAseguradora"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameAseguradora"));
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarAseguradora"));
		}
		
		this.jTableDatosAseguradora.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarAseguradora"));
		
		this.jTableDatosAseguradora.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarAseguradora"));
		
		this.jButtonNuevoAseguradora.addActionListener(new ButtonActionListener(this,"NuevoAseguradora"));
		
		this.jButtonDuplicarAseguradora.addActionListener(new ButtonActionListener(this,"DuplicarAseguradora"));
		
		this.jButtonCopiarAseguradora.addActionListener(new ButtonActionListener(this,"CopiarAseguradora"));
		
		this.jButtonVerFormAseguradora.addActionListener(new ButtonActionListener(this,"VerFormAseguradora"));
		
		
		this.jButtonNuevoToolBarAseguradora.addActionListener(new ButtonActionListener(this,"NuevoToolBarAseguradora"));
			
		this.jButtonDuplicarToolBarAseguradora.addActionListener(new ButtonActionListener(this,"DuplicarToolBarAseguradora"));
			
		this.jMenuItemNuevoAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemNuevoAseguradora"));
			
		this.jMenuItemDuplicarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarAseguradora"));		
		
		
		this.jButtonNuevoRelacionesAseguradora.addActionListener (new ButtonActionListener(this,"NuevoRelacionesAseguradora"));
		
		
		this.jButtonNuevoRelacionesToolBarAseguradora.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarAseguradora"));
			
		this.jMenuItemNuevoRelacionesAseguradora.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesAseguradora"));		
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonModificarAseguradora.addActionListener(new ButtonActionListener(this,"ModificarAseguradora"));
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonModificarToolBarAseguradora.addActionListener(new ButtonActionListener(this,"ModificarToolBarAseguradora"));
			
			this.jInternalFrameDetalleFormAseguradora.jMenuItemModificarAseguradora.addActionListener(new ButtonActionListener(this,"MenuItemModificarAseguradora"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormAseguradora.jButtonActualizarAseguradora.addActionListener (new ButtonActionListener(this,"ActualizarAseguradora"));
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonActualizarToolBarAseguradora.addActionListener(new ButtonActionListener(this,"ActualizarToolBarAseguradora"));
				
			this.jInternalFrameDetalleFormAseguradora.jMenuItemActualizarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemActualizarAseguradora"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonEliminarAseguradora.addActionListener (new ButtonActionListener(this,"EliminarAseguradora"));
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonEliminarToolBarAseguradora.addActionListener (new ButtonActionListener(this,"EliminarToolBarAseguradora"));
						
			this.jInternalFrameDetalleFormAseguradora.jMenuItemEliminarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemEliminarAseguradora"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonCancelarAseguradora.addActionListener (new ButtonActionListener(this,"CancelarAseguradora"));
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonCancelarToolBarAseguradora.addActionListener (new ButtonActionListener(this,"CancelarToolBarAseguradora"));
			
			this.jInternalFrameDetalleFormAseguradora.jMenuItemCancelarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemCancelarAseguradora"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarAseguradora.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarAseguradora"));		
		
		
		this.jButtonCerrarAseguradora.addActionListener (new ButtonActionListener(this,"CerrarAseguradora"));
		
		
		this.jButtonCerrarToolBarAseguradora.addActionListener (new ButtonActionListener(this,"CerrarToolBarAseguradora"));
			
		this.jMenuItemCerrarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemCerrarAseguradora"));
			
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jMenuItemDetalleCerrarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarAseguradora"));		
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosAseguradora"));
		}
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosToolBarAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarAseguradora"));
		}
		
		this.jButtonCopiarToolBarAseguradora.addActionListener (new ButtonActionListener(this,"CopiarToolBarAseguradora"));
			
		this.jButtonVerFormToolBarAseguradora.addActionListener (new ButtonActionListener(this,"VerFormToolBarAseguradora"));
		
		this.jMenuItemGuardarCambiosAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosAseguradora"));
			
		this.jMenuItemCopiarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemCopiarAseguradora"));		
		
		this.jMenuItemVerFormAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemVerFormAseguradora"));		
		
		
		this.jButtonGuardarCambiosTablaAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAseguradora"));
		
		
		this.jButtonGuardarCambiosTablaToolBarAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarAseguradora"));
			
		this.jMenuItemGuardarCambiosTablaAseguradora.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaAseguradora"));		
		
		
		
		this.jButtonRecargarInformacionAseguradora.addActionListener (new ButtonActionListener(this,"RecargarInformacionAseguradora"));
					
		this.jButtonRecargarInformacionToolBarAseguradora.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarAseguradora"));
		
		this.jMenuItemRecargarInformacionAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionAseguradora"));		
		
		
		
		this.jButtonAnterioresAseguradora.addActionListener (new ButtonActionListener(this,"AnterioresAseguradora"));
		
		
		this.jButtonAnterioresToolBarAseguradora.addActionListener (new ButtonActionListener(this,"AnterioresToolBarAseguradora"));
		
		this.jMenuItemAnterioresAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresAseguradora"));		
		
		
		this.jButtonSiguientesAseguradora.addActionListener (new ButtonActionListener(this,"SiguientesAseguradora"));
		
		
		this.jButtonSiguientesToolBarAseguradora.addActionListener (new ButtonActionListener(this,"SiguientesToolBarAseguradora"));
			
		this.jMenuItemSiguientesAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesAseguradora"));
			
		this.jMenuItemAbrirOrderByAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByAseguradora"));
			
		this.jMenuItemMostrarOcultarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarAseguradora"));
			
		this.jMenuItemDetalleAbrirOrderByAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByAseguradora"));
			
		this.jMenuItemDetalleMostarOcultarAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarAseguradora"));		
		
		
		this.jButtonNuevoGuardarCambiosAseguradora.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosAseguradora"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarAseguradora.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarAseguradora"));
			
		this.jMenuItemNuevoGuardarCambiosAseguradora.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosAseguradora"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosAseguradora.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosAseguradora"));

		this.jCheckBoxSeleccionadosAseguradora.addItemListener(new CheckBoxItemListener(this,"SeleccionadosAseguradora"));
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioAseguradora"));
		}
		
		
		this.jComboBoxTiposRelacionesAseguradora.addActionListener (new ButtonActionListener(this,"TiposRelacionesAseguradora"));
			
		this.jComboBoxTiposAccionesAseguradora.addActionListener (new ButtonActionListener(this,"TiposAccionesAseguradora"));
					
		this.jComboBoxTiposSeleccionarAseguradora.addActionListener (new ButtonActionListener(this,"TiposSeleccionarAseguradora"));
			
		this.jTextFieldValorCampoGeneralAseguradora.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralAseguradora"));		
		
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonidAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"idAseguradoraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAseguradora.jButtonid_empresaAseguradoraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAseguradoraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonid_empresaAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtoncodigoAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"codigoAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonnombreAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"nombreAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtondireccionAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"direccionAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtontelefonoAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"telefonoAseguradoraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
				
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoAseguradora!=null) {
				this.jInternalFrameReporteDinamicoAseguradora.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAseguradora"));
				this.jInternalFrameReporteDinamicoAseguradora.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAseguradora"));
				this.jInternalFrameReporteDinamicoAseguradora.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAseguradora"));
			}
			
			//this.jButtonCerrarReporteDinamicoAseguradora.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoAseguradora"));				
			//this.jButtonGenerarReporteDinamicoAseguradora.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoAseguradora"));
			//this.jButtonGenerarExcelReporteDinamicoAseguradora.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoAseguradora"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionAseguradora!=null) {
				this.jInternalFrameImportacionAseguradora.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionAseguradora"));
				this.jInternalFrameImportacionAseguradora.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionAseguradora"));
				this.jInternalFrameImportacionAseguradora.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionAseguradora"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByAseguradora.addActionListener (new ButtonActionListener(this,"AbrirOrderByAseguradora"));
			
			this.jButtonAbrirOrderByToolBarAseguradora.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarAseguradora"));			
			
			if(this.jInternalFrameOrderByAseguradora!=null) {
				this.jInternalFrameOrderByAseguradora.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByAseguradora"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormAseguradora!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormAseguradora.jTabbedPaneRelacionesAseguradora.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesAseguradora"));
		
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
            		closingInternalFrameAseguradora();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormAseguradora.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormAseguradora = (JInternalFrameBase)event.getSource();
	            	
	            AseguradoraBeanSwingJInternalFrame jInternalFrameParent=(AseguradoraBeanSwingJInternalFrame)jInternalFrameDetalleFormAseguradora.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarAseguradoraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosAseguradora.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosAseguradoraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosAseguradora.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosAseguradora.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAseguradoraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAseguradoraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAseguradoraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoAseguradora";
		inputMap = this.jButtonNuevoAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAseguradoraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAseguradoraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAseguradoraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoAseguradoraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesAseguradora";
		inputMap = this.jButtonNuevoRelacionesAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoAseguradoraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarAseguradora";
		inputMap = this.jButtonModificarAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarAseguradoraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarAseguradora";
		inputMap = this.jButtonActualizarAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarAseguradoraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarAseguradora";
		inputMap = this.jButtonEliminarAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarAseguradoraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarAseguradora";
		inputMap = this.jButtonCancelarAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarAseguradoraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarAseguradora";
		inputMap = this.jButtonCerrarAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarAseguradoraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosAseguradora";
		inputMap = this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormAseguradora.jButtonGuardarCambiosAseguradora.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosAseguradoraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosAseguradora.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosAseguradoraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesAseguradora.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesAseguradoraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarAseguradora.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarAseguradoraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralAseguradora.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralAseguradoraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonidAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"idAseguradoraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormAseguradora.jButtonid_empresaAseguradoraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaAseguradoraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonid_empresaAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtoncodigoAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"codigoAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtonnombreAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"nombreAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtondireccionAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"direccionAseguradoraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormAseguradora.jButtontelefonoAseguradoraBusqueda.addActionListener(new ButtonActionListener(this,"telefonoAseguradoraBusqueda"));
		
		
		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionAseguradora.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionAseguradoraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarAseguradoraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarAseguradora.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosAseguradora(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
					aseguradoraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Aseguradora aseguradoraAux:aseguradoras) {
					aseguradoraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosAseguradoraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAseguradora(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
						aseguradoraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Aseguradora aseguradoraAux:aseguradoras) {
						aseguradoraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Aseguradora aseguradoraAux:aseguradoras) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaAseguradora(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAseguradora.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAseguradora.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosAseguradoraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingAseguradora(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosAseguradora.getSelectedRows();
			
			Aseguradora aseguradoraLocal=new Aseguradora();
			
			//this.seleccionarTodosAseguradora(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					aseguradoraLocal =(Aseguradora) this.aseguradoraLogic.getAseguradoras().toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					aseguradoraLocal =(Aseguradora) this.aseguradoras.toArray()[this.jTableDatosAseguradora.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				aseguradoraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
						aseguradoraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(Aseguradora aseguradoraAux:aseguradoras) {
						aseguradoraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaAseguradora(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosAseguradora.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosAseguradora.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosAseguradora,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualAseguradoraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarAseguradoraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralAseguradoraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingAseguradora(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralAseguradora.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(Aseguradora aseguradoraAux:this.aseguradoraLogic.getAseguradoras()) {
				
						if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							aseguradoraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							aseguradoraAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							aseguradoraAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							aseguradoraAux.settelefono(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Aseguradora aseguradoraAux:aseguradoras) {
					
						if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_CODIGO)) {
							existe=true;
							aseguradoraAux.setcodigo(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_NOMBRE)) {
							existe=true;
							aseguradoraAux.setnombre(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_DIRECCION)) {
							existe=true;
							aseguradoraAux.setdireccion(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_TELEFONO)) {
							existe=true;
							aseguradoraAux.settelefono(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaAseguradora(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesAseguradoraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingAseguradora(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioAseguradora=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesAseguradora.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteAseguradora) {				
					conSplash=true;//false;										
					
					//this.startProcessAseguradora(conSplash);
				
					this.generarReporteAseguradorasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoAseguradorasSeleccionados();
				//this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAseguradorasSeleccionados(false);
				//this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoAseguradorasSeleccionados(true);
				//this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAseguradora();
				
				this.exportarAseguradorasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionAseguradoras();
				//this.importarAseguradoras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessAseguradora();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelAseguradorasSeleccionados();
				//this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Aseguradora", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessAseguradora();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoAseguradora)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyAseguradora(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
				}	
			} 			
			else if(AseguradoraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteAseguradora) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessAseguradora(conSplash);
					
						//this.actualizarParametrosGeneralAseguradora();
						
						this.generarReporteProcesoAccionAseguradorasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(AseguradoraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO AseguradoraS SELECCIONADOS?", "MANTENIMIENTO DE Aseguradora", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessAseguradora();
				
						this.actualizarParametrosGeneralAseguradora();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.aseguradoraReturnGeneral=aseguradoraLogic.procesarAccionAseguradorasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.aseguradoraLogic.getAseguradoras(),this.aseguradoraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarAseguradoraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralAseguradora();
					
					AseguradoraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarAseguradoraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesAseguradora.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormAseguradora.jComboBoxTiposAccionesFormularioAseguradora.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessAseguradora(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesAseguradoraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessAseguradora();
			
			if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
			Aseguradora aseguradora=new Aseguradora();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingAseguradora(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesAseguradora.getSelectedItem();
			
			
			
			
			aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
			//this.sTipoAccion;
			
			if(aseguradorasSeleccionados.size()==1) {
				for(Aseguradora aseguradoraAux:aseguradorasSeleccionados) {
					aseguradora=aseguradoraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Vehiculo")) {
					jButtonVehiculoActionPerformed(null,rowIndex,true,false,aseguradora);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessAseguradora();
			
      		//this.finishProcessAseguradora(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarAseguradoraReturnGeneral() throws Exception {
		if(this.aseguradoraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.aseguradoraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.aseguradoraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.aseguradoraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.aseguradoraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.aseguradoraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingAseguradora(false);
		}
		
		if(this.aseguradoraReturnGeneral.getConRetornoLista() || this.aseguradoraReturnGeneral.getConRetornoObjeto()) {
			if(this.aseguradoraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.aseguradoraLogic.setAseguradoras(this.aseguradoraReturnGeneral.getAseguradoras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.aseguradoraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.aseguradoraLogic.setAseguradora(this.aseguradoraReturnGeneral.getAseguradora());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingAseguradora(false);
		}
	}
	
	public void actualizarParametrosGeneralAseguradora() throws Exception {
		
		
	}
	
	public ArrayList<Aseguradora> getAseguradorasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioAseguradora) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(Aseguradora aseguradoraAux:aseguradoraLogic.getAseguradoras()) {
					if(aseguradoraAux.getIsSelected()) {
						aseguradorasSeleccionados.add(aseguradoraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(Aseguradora aseguradoraAux:this.aseguradoras) {
					if(aseguradoraAux.getIsSelected()) {
						aseguradorasSeleccionados.add(aseguradoraAux);				
					}
				}
			}
			
			if(aseguradorasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						aseguradorasSeleccionados.addAll(this.aseguradoraLogic.getAseguradoras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						aseguradorasSeleccionados.addAll(this.aseguradoras);				
					}
				}
			}
		} else {
			aseguradorasSeleccionados.add(this.aseguradora);
		}
		
		return aseguradorasSeleccionados;
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
	
	public void generarReporteAseguradorasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalAseguradorasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoAseguradorasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAseguradorasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoAseguradorasSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesAseguradorasSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Aseguradora",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesAseguradorasSeleccionados() throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados);
		
	}	
	
	public void generarReporteNormalAseguradorasSeleccionados() throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionAseguradorasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoAseguradorasSeleccionados() throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		
		this.abrirInicializarFrameReporteDinamicoAseguradora();
		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoAseguradora();
		
		
		//this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados ,aseguradoraImplementable,aseguradoraImplementableHome);
	}
	
	public void mostrarImportacionAseguradoras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionAseguradora();
		
		this.abrirFrameImportacionAseguradora();		
		
			
		//this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados ,aseguradoraImplementable,aseguradoraImplementableHome);
	}
	
	public void importarAseguradoras() throws Exception {		
	
	}
	
	public void exportarAseguradorasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelAseguradorasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoAseguradorasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlAseguradorasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Aseguradora",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoAseguradorasSeleccionados() throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarAseguradora(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(Aseguradora aseguradoraAux:aseguradorasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarAseguradora(aseguradoraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//aseguradoraAux.setsDetalleGeneralEntityReporte(aseguradoraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarAseguradora(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_CODIGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_NOMBRE;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_DIRECCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=AseguradoraConstantesFunciones.LABEL_TELEFONO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarAseguradora(Aseguradora aseguradora,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=aseguradora.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=aseguradora.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=aseguradora.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=aseguradora.getcodigo();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=aseguradora.getnombre();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=aseguradora.getdireccion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=aseguradora.gettelefono();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelAseguradorasSeleccionados() throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("Aseguradoras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelAseguradora(row);				
				iRow++;
			}				
			
			for(Aseguradora aseguradoraAux:aseguradorasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelAseguradora(aseguradoraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlAseguradorasSeleccionados() throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();		
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"aseguradora.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("aseguradoras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("aseguradora");
			//elementRoot.appendChild(element);
		
			for(Aseguradora aseguradoraAux:aseguradorasSeleccionados) {
				element = document.createElement("aseguradora");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlAseguradora(aseguradoraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Aseguradora",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelAseguradora(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_CODIGO);
		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_NOMBRE);
		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_DIRECCION);
		cell = row.createCell(iColumn++);cell.setCellValue(AseguradoraConstantesFunciones.LABEL_TELEFONO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelAseguradora(Aseguradora aseguradora,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(aseguradora.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(aseguradora.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(aseguradora.getcodigo());
		cell = row.createCell(iColumn++);cell.setCellValue(aseguradora.getnombre());
		cell = row.createCell(iColumn++);cell.setCellValue(aseguradora.getdireccion());
		cell = row.createCell(iColumn++);cell.setCellValue(aseguradora.gettelefono());				
	}
	
	public void setFilaDatosExportarXmlAseguradora(Aseguradora aseguradora,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(AseguradoraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(aseguradora.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(AseguradoraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(aseguradora.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(AseguradoraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(aseguradora.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementcodigo = document.createElement(AseguradoraConstantesFunciones.CODIGO);
		elementcodigo.appendChild(document.createTextNode(aseguradora.getcodigo().trim()));
		element.appendChild(elementcodigo);

		Element elementnombre = document.createElement(AseguradoraConstantesFunciones.NOMBRE);
		elementnombre.appendChild(document.createTextNode(aseguradora.getnombre().trim()));
		element.appendChild(elementnombre);

		Element elementdireccion = document.createElement(AseguradoraConstantesFunciones.DIRECCION);
		elementdireccion.appendChild(document.createTextNode(aseguradora.getdireccion().trim()));
		element.appendChild(elementdireccion);

		Element elementtelefono = document.createElement(AseguradoraConstantesFunciones.TELEFONO);
		elementtelefono.appendChild(document.createTextNode(aseguradora.gettelefono().trim()));
		element.appendChild(elementtelefono);
	}
	
	public void generarReporteGroupGenericoAseguradorasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<Aseguradora> aseguradorasSeleccionados=new ArrayList<Aseguradora>();
		
		aseguradorasSeleccionados=this.getAseguradorasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoAseguradora(aseguradorasSeleccionados);
		
		this.generarReporteAseguradoras("Todos",aseguradorasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoAseguradora(ArrayList<Aseguradora> aseguradorasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(Aseguradora aseguradoraAux:aseguradorasSeleccionados) {
				aseguradoraAux.setsDetalleGeneralEntityReporte(aseguradoraAux.toString());
			
				if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					aseguradoraAux.setsDescripcionGeneralEntityReporte1(aseguradoraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_CODIGO)) {
					existe=true;
					aseguradoraAux.setsDescripcionGeneralEntityReporte1(aseguradoraAux.getcodigo());
				}
				 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_NOMBRE)) {
					existe=true;
					aseguradoraAux.setsDescripcionGeneralEntityReporte1(aseguradoraAux.getnombre());
				}
				 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_DIRECCION)) {
					existe=true;
					aseguradoraAux.setsDescripcionGeneralEntityReporte1(aseguradoraAux.getdireccion());
				}
				 else if(sTipoSeleccionar.equals(AseguradoraConstantesFunciones.LABEL_TELEFONO)) {
					existe=true;
					aseguradoraAux.setsDescripcionGeneralEntityReporte1(aseguradoraAux.gettelefono());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,AseguradoraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesAseguradora(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoAseguradora=true;
				this.isVisibilidadCeldaNuevoRelacionesAseguradora=true;
				this.isVisibilidadCeldaGuardarCambiosAseguradora=true;
			}
			
			this.isVisibilidadCeldaModificarAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=false;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=true;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
			this.isVisibilidadCeldaModificarAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=true;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=true;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
			this.isVisibilidadCeldaModificarAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=true;
			this.isVisibilidadCeldaEliminarAseguradora=true;
			this.isVisibilidadCeldaCancelarAseguradora=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=true;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
			this.isVisibilidadCeldaModificarAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=true;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoAseguradora=true;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=true;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=true;
			this.isVisibilidadCeldaModificarAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=false;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=true;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
			this.isVisibilidadCeldaActualizarAseguradora=false;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
			this.isVisibilidadCeldaModificarAseguradora=true;
			this.isVisibilidadCeldaActualizarAseguradora=false;
			this.isVisibilidadCeldaEliminarAseguradora=false;
			this.isVisibilidadCeldaCancelarAseguradora=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				} else {
					this.isVisibilidadCeldaGuardarAseguradora=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(AseguradoraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoAseguradora=true;
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=true;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=true;
		} else {
			this.actualizarEstadoPanelsAseguradora(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarAseguradora=false;
			//this.isVisibilidadCeldaVerFormAseguradora=false;
			this.isVisibilidadCeldaDuplicarAseguradora=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!aseguradoraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
		} else {
			this.isVisibilidadCeldaNuevoAseguradora=false;
			this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(aseguradoraSessionBean.getEsGuardarRelacionado()) {
			if(!aseguradoraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;												
			}
			
			this.jButtonCerrarAseguradora.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesAseguradora=false;
		}
		
		if(!this.permiteMantenimiento(this.aseguradora)) {
			this.isVisibilidadCeldaActualizarAseguradora=false;
			this.isVisibilidadCeldaEliminarAseguradora=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesAseguradora() {
		this.isVisibilidadCeldaNuevoAseguradora=false;
		this.isVisibilidadCeldaGuardarCambiosAseguradora=false;
	}
	
	public void actualizarEstadoPanelsAseguradora(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(true);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(false);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(false);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(false);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(true);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(true);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionAseguradora!=null) {
				this.jScrollPanelDatosEdicionAseguradora.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosAseguradora!=null) {
				this.jScrollPanelDatosAseguradora.setVisible(true);
			}
			
			if(this.jPanelPaginacionAseguradora!=null) {
				this.jPanelPaginacionAseguradora.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasAseguradora!=null) {
					this.jTabbedPaneBusquedasAseguradora.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.aseguradoraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasAseguradora!=null) {
				this.jTabbedPaneBusquedasAseguradora.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesAseguradora!=null) {
				this.jPanelParametrosReportesAseguradora.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;
		}
		
	}
	
	

	public String registrarSesionAseguradoraParaVehiculos() throws Exception {
		Boolean isPaginaPopupVehiculo=false;

		try {

			if(this.aseguradoraSessionBean==null) {
				this.aseguradoraSessionBean=new AseguradoraSessionBean();
			}

			if(this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean==null) {
				this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean=new VehiculoSessionBean();
			}

			this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.setsPathNavegacionActual(aseguradoraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+VehiculoConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupVehiculo=this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeVehiculo(true);
			this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeVehiculo(AseguradoraConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.setisBusquedaDesdeForeignKeySesionAseguradora(true);
			this.jInternalFrameDetalleFormAseguradora.vehiculoSessionBean.setlidAseguradoraActual(this.idAseguradoraActual);

			aseguradoraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyAseguradora(true);
			aseguradoraSessionBean.setlIdAseguradoraActualForeignKey(this.idAseguradoraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//AseguradoraSessionBean aseguradoraSessionBean=new AseguradoraSessionBean();
		
		if(this.aseguradoraSessionBean==null) {
			this.aseguradoraSessionBean=new AseguradoraSessionBean();
		}
		
		this.aseguradoraSessionBean.setsUltimaBusquedaAseguradora(this.getsAccionBusqueda());
		this.aseguradoraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.aseguradoraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			aseguradoraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//AseguradoraSessionBean aseguradoraSessionBean=new AseguradoraSessionBean();
		
		if(this.aseguradoraSessionBean==null) {
			this.aseguradoraSessionBean=new AseguradoraSessionBean();
		}
		
		if(this.aseguradoraSessionBean.getsUltimaBusquedaAseguradora()!=null&&!this.aseguradoraSessionBean.getsUltimaBusquedaAseguradora().equals("")) {
			this.setsAccionBusqueda(aseguradoraSessionBean.getsUltimaBusquedaAseguradora());
			this.setiNumeroPaginacion(aseguradoraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(aseguradoraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(aseguradoraSessionBean.getid_empresa());
				aseguradoraSessionBean.setid_empresa(-1L);
			}
		}
		
		this.aseguradoraSessionBean.setsUltimaBusquedaAseguradora("");
		this.aseguradoraSessionBean.setiNumeroPaginacion(AseguradoraConstantesFunciones.INUMEROPAGINACION);
		this.aseguradoraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaAseguradora(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioAseguradora() {
		this.updateBorderResaltarBusquedasFormularioAseguradora();
		this.updateVisibilidadBusquedasFormularioAseguradora();
		this.updateHabilitarBusquedasFormularioAseguradora();
	}
	
	public void updateBorderResaltarBusquedasFormularioAseguradora() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasAseguradora.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioAseguradora() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasAseguradora.getComponents().length>0) {
	
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioAseguradora() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasAseguradora.getComponents().length>0) {
	
		}	
	
	}
	
	
	public void resaltarPanelBusquedaAseguradora(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		

		if(existe) {
			
			this.jTtoolBarAseguradora.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioAseguradora() throws Exception {

		if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioAseguradora();
		this.updateVisibilidadResaltarControlesFormularioAseguradora();
		this.updateHabilitarResaltarControlesFormularioAseguradora();
		
	}
	
	public void updateBorderResaltarControlesFormularioAseguradora() throws Exception {
		if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.aseguradoraConstantesFunciones.resaltaridAseguradora!=null && this.jInternalFrameDetalleFormAseguradora!=null) {this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setBorder(this.aseguradoraConstantesFunciones.resaltaridAseguradora);}
		if(this.aseguradoraConstantesFunciones.resaltarid_empresaAseguradora!=null && this.jInternalFrameDetalleFormAseguradora!=null) {this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setBorder(this.aseguradoraConstantesFunciones.resaltarid_empresaAseguradora);}
		if(this.aseguradoraConstantesFunciones.resaltarcodigoAseguradora!=null && this.jInternalFrameDetalleFormAseguradora!=null) {this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setBorder(this.aseguradoraConstantesFunciones.resaltarcodigoAseguradora);}
		if(this.aseguradoraConstantesFunciones.resaltarnombreAseguradora!=null && this.jInternalFrameDetalleFormAseguradora!=null) {this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setBorder(this.aseguradoraConstantesFunciones.resaltarnombreAseguradora);}
		if(this.aseguradoraConstantesFunciones.resaltardireccionAseguradora!=null && this.jInternalFrameDetalleFormAseguradora!=null) {this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setBorder(this.aseguradoraConstantesFunciones.resaltardireccionAseguradora);}
		if(this.aseguradoraConstantesFunciones.resaltartelefonoAseguradora!=null && this.jInternalFrameDetalleFormAseguradora!=null) {this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setBorder(this.aseguradoraConstantesFunciones.resaltartelefonoAseguradora);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioAseguradora() throws Exception {		
		if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
	
		//this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostraridAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jPanelidAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostraridAseguradora);
		//this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrarid_empresaAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jPanelid_empresaAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrarid_empresaAseguradora);
		//this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrarcodigoAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jPanelcodigoAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrarcodigoAseguradora);
		//this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrarnombreAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jPanelnombreAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrarnombreAseguradora);
		//this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrardireccionAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jPaneldireccionAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrardireccionAseguradora);
		//this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrartelefonoAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jPaneltelefonoAseguradora.setVisible(this.aseguradoraConstantesFunciones.mostrartelefonoAseguradora);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioAseguradora() throws Exception {
		if(this.jInternalFrameDetalleFormAseguradora==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormAseguradora!=null) {
	
		this.jInternalFrameDetalleFormAseguradora.jLabelidAseguradora.setEnabled(this.aseguradoraConstantesFunciones.activaridAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jComboBoxid_empresaAseguradora.setEnabled(this.aseguradoraConstantesFunciones.activarid_empresaAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextFieldcodigoAseguradora.setEnabled(this.aseguradoraConstantesFunciones.activarcodigoAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextAreanombreAseguradora.setEnabled(this.aseguradoraConstantesFunciones.activarnombreAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextAreadireccionAseguradora.setEnabled(this.aseguradoraConstantesFunciones.activardireccionAseguradora);
		this.jInternalFrameDetalleFormAseguradora.jTextAreatelefonoAseguradora.setEnabled(this.aseguradoraConstantesFunciones.activartelefonoAseguradora);
		}
	}
	
		
}